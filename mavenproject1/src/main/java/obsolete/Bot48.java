/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.SuperB;
import clts.SuperC;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot48 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot48()
    {
        super();
        jean = true;
        pant = true;
        slenderS = true;
        platzHeight = 5;
    }

    public Bot48(int layer)
    {
        super(layer);
        jean = true;
        pant = true;
        slenderS = true;
        platzHeight = 5;
    }

    public Bot48(ColorArray colorSwitch)
    {
        super(colorSwitch);
        jean = true;
        pant = true;
        slenderS = true;
        platzHeight = 5;
    }

    public Bot48(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        jean = true;
        pant = true;
        slenderS = true;
        platzHeight = 5;
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
        paintTop(offsetX,0,g2d);
    }

    private void paintRight(int x, int y, GraphicsMap g2d)
    {
        if(step == 0 || step == 8 || step == 9 || step == 15)
        {
            paint1(x,y,g2d);
        }else if(step == 11 || step == 12 || step == 13)
        {
            paint3(x,y,g2d);
        }else if(step == 1)
        {
            paint4a(x,y,g2d);
        }else if(step == 2)
        {
            paint5a(x,y,g2d);
        }else if(step == 3)
        {
            paint6a(x,y,g2d);
        }else if(step == 10 || step == 14)
        {
            paint2(x,y,g2d);
        }else if(step == 4)
        {
            if(Math.random() < .5)
                paint7(x,y,g2d);
            else
                paint7a(x,y,g2d);
        }else if(step == 7)
        {
            paint4(x,y,g2d);
        }else if(step == 6)
        {
            paint5(x,y,g2d);
        }else if(step == 5)
        {
            paint6(x,y,g2d);
        }
    }
    private void paintLeft(int x, int y, GraphicsMap g2d)
    {
        x = x + 7;
        if(step == 0 || step == 1 || step == 7 || step == 8)
        {
            paintBack1(x,y,g2d);
        }else if(step == 3 || step == 4 || step == 5)
        {
            paintBack3(x,y,g2d);
        }else if(step == 2 || step == 6)
        {
            paintBack2(x,y,g2d);
        }else if(step == 9)
        {
            paintBack4a(x,y,g2d);
        }else if(step == 10)
        {
            paintBack5a(x,y,g2d);
        }else if(step == 11)
        {
            paintBack6a(x,y,g2d);
        }else if(step == 12)
        {
            if(Math.random() < .5)
                paintBack7(x,y,g2d);
            else
                paintBack7a(x,y,g2d);
        }else if(step == 15)
        {
            paintBack4(x,y,g2d);
        }else if(step == 14)
        {
            paintBack5(x,y,g2d);
        }else if(step == 13)
        {
            paintBack6(x,y,g2d);
        }
    }

        public void paint1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 2);
        g2d.fillRect(118 + x, 107 + y, 1, 1);
        g2d.fillRect(109 + x, 116 + y, 1, 4);
        g2d.fillRect(110 + x, 117 + y, 1, 2);
        g2d.fillRect(110 + x, 120 + y, 1, 2);
        g2d.fillRect(105 + x, 160 + y, 1, 2);
        g2d.fillRect(106 + x, 161 + y, 2, 1);
        g2d.fillRect(109 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 94 + y, 1, 8);
        g2d.fillRect(120 + x, 94 + y, 1, 8);
        g2d.fillRect(111 + x, 102 + y, 1, 10);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 4);
        g2d.fillRect(112 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 4);
        g2d.fillRect(116 + x, 111 + y, 1, 4);
        g2d.fillRect(110 + x, 112 + y, 1, 5);
        g2d.fillRect(117 + x, 115 + y, 1, 13);
        g2d.fillRect(110 + x, 119 + y, 1, 1);
        g2d.fillRect(109 + x, 120 + y, 1, 12);
        g2d.fillRect(117 + x, 130 + y, 1, 2);
        g2d.fillRect(108 + x, 131 + y, 1, 12);
        g2d.fillRect(118 + x, 132 + y, 1, 11);
        g2d.fillRect(107 + x, 143 + y, 1, 7);
        g2d.fillRect(119 + x, 143 + y, 1, 9);
        g2d.fillRect(106 + x, 150 + y, 1, 7);
        g2d.fillRect(120 + x, 152 + y, 1, 10);
        g2d.fillRect(105 + x, 157 + y, 1, 3);
        g2d.fillRect(110 + x, 160 + y, 1, 1);
        g2d.fillRect(117 + x, 160 + y, 1, 3);
        g2d.fillRect(108 + x, 161 + y, 1, 2);
        g2d.fillRect(109 + x, 161 + y, 1, 1);
        g2d.fillRect(118 + x, 161 + y, 1, 2);
        g2d.fillRect(119 + x, 161 + y, 1, 1);
        g2d.fillRect(110 + x, 162 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 5);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 5);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 8);
        g2d.fillRect(119 + x, 94 + y, 1, 8);
        g2d.fillRect(112 + x, 102 + y, 1, 4);
        g2d.fillRect(118 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 5);
        g2d.fillRect(116 + x, 107 + y, 1, 4);
        g2d.fillRect(115 + x, 111 + y, 1, 4);
        g2d.fillRect(111 + x, 112 + y, 1, 17);
        g2d.fillRect(116 + x, 115 + y, 1, 2);
        g2d.fillRect(112 + x, 118 + y, 1, 5);
        g2d.fillRect(114 + x, 119 + y, 3, 1);
        g2d.fillRect(116 + x, 120 + y, 1, 10);
        g2d.fillRect(110 + x, 122 + y, 1, 13);
        g2d.fillRect(115 + x, 125 + y, 1, 3);
        g2d.fillRect(117 + x, 128 + y, 1, 2);
        g2d.fillRect(109 + x, 132 + y, 1, 9);
        g2d.fillRect(116 + x, 132 + y, 1, 5);
        g2d.fillRect(117 + x, 132 + y, 1, 9);
        g2d.fillRect(115 + x, 137 + y, 1, 3);
        g2d.fillRect(114 + x, 141 + y, 1, 1);
        g2d.fillRect(108 + x, 143 + y, 1, 6);
        g2d.fillRect(118 + x, 143 + y, 1, 7);
        g2d.fillRect(113 + x, 147 + y, 1, 1);
        g2d.fillRect(112 + x, 149 + y, 1, 3);
        g2d.fillRect(107 + x, 150 + y, 1, 7);
        g2d.fillRect(111 + x, 152 + y, 1, 10);
        g2d.fillRect(119 + x, 152 + y, 1, 9);
        g2d.fillRect(117 + x, 153 + y, 1, 7);
        g2d.fillRect(106 + x, 157 + y, 1, 4);
        g2d.fillRect(110 + x, 157 + y, 1, 3);
        g2d.fillRect(107 + x, 160 + y, 3, 1);
        g2d.fillRect(118 + x, 160 + y, 1, 1);
        g2d.fillRect(110 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 161 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 13);
        g2d.fillRect(115 + x, 94 + y, 1, 8);
        g2d.fillRect(118 + x, 94 + y, 1, 8);
        g2d.fillRect(117 + x, 101 + y, 1, 5);
        g2d.fillRect(113 + x, 102 + y, 1, 45);
        g2d.fillRect(116 + x, 102 + y, 1, 5);
        g2d.fillRect(115 + x, 107 + y, 1, 4);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 8);
        g2d.fillRect(112 + x, 112 + y, 1, 6);
        g2d.fillRect(115 + x, 115 + y, 1, 4);
        g2d.fillRect(116 + x, 117 + y, 1, 2);
        g2d.fillRect(114 + x, 120 + y, 1, 15);
        g2d.fillRect(115 + x, 120 + y, 1, 5);
        g2d.fillRect(112 + x, 123 + y, 1, 20);
        g2d.fillRect(115 + x, 128 + y, 1, 4);
        g2d.fillRect(111 + x, 129 + y, 1, 15);
        g2d.fillRect(116 + x, 130 + y, 1, 2);
        g2d.fillRect(110 + x, 135 + y, 1, 12);
        g2d.fillRect(115 + x, 135 + y, 1, 2);
        g2d.fillRect(116 + x, 137 + y, 1, 6);
        g2d.fillRect(114 + x, 138 + y, 1, 3);
        g2d.fillRect(115 + x, 140 + y, 1, 22);
        g2d.fillRect(109 + x, 141 + y, 1, 9);
        g2d.fillRect(117 + x, 141 + y, 1, 9);
        g2d.fillRect(114 + x, 142 + y, 1, 7);
        g2d.fillRect(112 + x, 144 + y, 1, 5);
        g2d.fillRect(111 + x, 147 + y, 1, 5);
        g2d.fillRect(113 + x, 148 + y, 1, 9);
        g2d.fillRect(108 + x, 149 + y, 1, 4);
        g2d.fillRect(118 + x, 150 + y, 1, 10);
        g2d.fillRect(110 + x, 151 + y, 1, 6);
        g2d.fillRect(112 + x, 152 + y, 1, 6);
        g2d.fillRect(117 + x, 152 + y, 1, 1);
        g2d.fillRect(107 + x, 157 + y, 1, 3);
        g2d.fillRect(109 + x, 157 + y, 1, 3);
        g2d.fillRect(116 + x, 157 + y, 1, 5);
        g2d.fillRect(108 + x, 159 + y, 1, 1);
        g2d.fillRect(112 + x, 159 + y, 1, 2);
        g2d.fillRect(113 + x, 159 + y, 1, 2);
        g2d.fillRect(114 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 7);
        g2d.fillRect(116 + x, 95 + y, 1, 2);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(115 + x, 102 + y, 1, 5);
        g2d.fillRect(114 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 1);
        g2d.fillRect(115 + x, 132 + y, 1, 3);
        g2d.fillRect(114 + x, 135 + y, 1, 3);
        g2d.fillRect(112 + x, 143 + y, 1, 1);
        g2d.fillRect(116 + x, 143 + y, 1, 4);
        g2d.fillRect(111 + x, 144 + y, 1, 3);
        g2d.fillRect(110 + x, 147 + y, 1, 4);
        g2d.fillRect(114 + x, 149 + y, 1, 3);
        g2d.fillRect(109 + x, 150 + y, 1, 7);
        g2d.fillRect(117 + x, 150 + y, 1, 2);
        g2d.fillRect(116 + x, 151 + y, 1, 6);
        g2d.fillRect(108 + x, 153 + y, 1, 6);
        g2d.fillRect(113 + x, 157 + y, 1, 2);
        g2d.fillRect(114 + x, 157 + y, 1, 3);
        g2d.fillRect(112 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(116 + x, 97 + y, 1, 4);
        g2d.fillRect(116 + x, 147 + y, 1, 4);
        g2d.fillRect(114 + x, 152 + y, 1, 5);
    }





    public void paint2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 103 + y, 1, 2);
        g2d.fillRect(119 + x, 107 + y, 1, 1);
        g2d.fillRect(110 + x, 116 + y, 1, 4);
        g2d.fillRect(111 + x, 117 + y, 1, 2);
        g2d.fillRect(111 + x, 120 + y, 1, 2);
        g2d.fillRect(106 + x, 160 + y, 1, 2);
        g2d.fillRect(107 + x, 161 + y, 2, 1);
        g2d.fillRect(110 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 11);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 8);
        g2d.fillRect(112 + x, 102 + y, 1, 10);
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 4);
        g2d.fillRect(113 + x, 106 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 4);
        g2d.fillRect(117 + x, 111 + y, 1, 4);
        g2d.fillRect(111 + x, 112 + y, 1, 5);
        g2d.fillRect(118 + x, 115 + y, 1, 13);
        g2d.fillRect(111 + x, 119 + y, 1, 1);
        g2d.fillRect(110 + x, 120 + y, 1, 12);
        g2d.fillRect(118 + x, 130 + y, 1, 2);
        g2d.fillRect(109 + x, 131 + y, 1, 12);
        g2d.fillRect(119 + x, 132 + y, 1, 11);
        g2d.fillRect(108 + x, 143 + y, 1, 7);
        g2d.fillRect(120 + x, 143 + y, 1, 9);
        g2d.fillRect(107 + x, 150 + y, 1, 7);
        g2d.fillRect(121 + x, 152 + y, 1, 10);
        g2d.fillRect(106 + x, 157 + y, 1, 3);
        g2d.fillRect(111 + x, 160 + y, 1, 1);
        g2d.fillRect(118 + x, 160 + y, 1, 3);
        g2d.fillRect(109 + x, 161 + y, 1, 2);
        g2d.fillRect(110 + x, 161 + y, 1, 1);
        g2d.fillRect(119 + x, 161 + y, 1, 2);
        g2d.fillRect(120 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 162 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 13);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 13);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 102 + y, 1, 4);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(113 + x, 107 + y, 1, 5);
        g2d.fillRect(117 + x, 107 + y, 1, 4);
        g2d.fillRect(116 + x, 111 + y, 1, 4);
        g2d.fillRect(112 + x, 112 + y, 1, 17);
        g2d.fillRect(117 + x, 115 + y, 1, 2);
        g2d.fillRect(113 + x, 118 + y, 1, 5);
        g2d.fillRect(115 + x, 119 + y, 3, 1);
        g2d.fillRect(117 + x, 120 + y, 1, 10);
        g2d.fillRect(111 + x, 122 + y, 1, 13);
        g2d.fillRect(116 + x, 125 + y, 1, 3);
        g2d.fillRect(118 + x, 128 + y, 1, 2);
        g2d.fillRect(110 + x, 132 + y, 1, 9);
        g2d.fillRect(117 + x, 132 + y, 1, 5);
        g2d.fillRect(118 + x, 132 + y, 1, 9);
        g2d.fillRect(116 + x, 137 + y, 1, 3);
        g2d.fillRect(115 + x, 141 + y, 1, 1);
        g2d.fillRect(109 + x, 143 + y, 1, 6);
        g2d.fillRect(119 + x, 143 + y, 1, 7);
        g2d.fillRect(114 + x, 147 + y, 1, 1);
        g2d.fillRect(113 + x, 149 + y, 1, 3);
        g2d.fillRect(108 + x, 150 + y, 1, 7);
        g2d.fillRect(112 + x, 152 + y, 1, 10);
        g2d.fillRect(120 + x, 152 + y, 1, 9);
        g2d.fillRect(118 + x, 153 + y, 1, 7);
        g2d.fillRect(107 + x, 157 + y, 1, 4);
        g2d.fillRect(111 + x, 157 + y, 1, 3);
        g2d.fillRect(108 + x, 160 + y, 3, 1);
        g2d.fillRect(119 + x, 160 + y, 1, 1);
        g2d.fillRect(111 + x, 161 + y, 1, 1);
        g2d.fillRect(113 + x, 161 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 12);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 9);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 13);
        g2d.fillRect(118 + x, 101 + y, 1, 5);
        g2d.fillRect(114 + x, 102 + y, 1, 45);
        g2d.fillRect(117 + x, 102 + y, 1, 5);
        g2d.fillRect(116 + x, 107 + y, 1, 4);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 8);
        g2d.fillRect(113 + x, 112 + y, 1, 6);
        g2d.fillRect(116 + x, 115 + y, 1, 4);
        g2d.fillRect(117 + x, 117 + y, 1, 2);
        g2d.fillRect(115 + x, 120 + y, 1, 15);
        g2d.fillRect(116 + x, 120 + y, 1, 5);
        g2d.fillRect(113 + x, 123 + y, 1, 20);
        g2d.fillRect(116 + x, 128 + y, 1, 4);
        g2d.fillRect(112 + x, 129 + y, 1, 15);
        g2d.fillRect(117 + x, 130 + y, 1, 2);
        g2d.fillRect(111 + x, 135 + y, 1, 12);
        g2d.fillRect(116 + x, 135 + y, 1, 2);
        g2d.fillRect(117 + x, 137 + y, 1, 6);
        g2d.fillRect(115 + x, 138 + y, 1, 3);
        g2d.fillRect(116 + x, 140 + y, 1, 22);
        g2d.fillRect(110 + x, 141 + y, 1, 9);
        g2d.fillRect(118 + x, 141 + y, 1, 9);
        g2d.fillRect(115 + x, 142 + y, 1, 7);
        g2d.fillRect(113 + x, 144 + y, 1, 5);
        g2d.fillRect(112 + x, 147 + y, 1, 5);
        g2d.fillRect(114 + x, 148 + y, 1, 9);
        g2d.fillRect(109 + x, 149 + y, 1, 4);
        g2d.fillRect(119 + x, 150 + y, 1, 10);
        g2d.fillRect(111 + x, 151 + y, 1, 6);
        g2d.fillRect(113 + x, 152 + y, 1, 6);
        g2d.fillRect(118 + x, 152 + y, 1, 1);
        g2d.fillRect(108 + x, 157 + y, 1, 3);
        g2d.fillRect(110 + x, 157 + y, 1, 3);
        g2d.fillRect(117 + x, 157 + y, 1, 5);
        g2d.fillRect(109 + x, 159 + y, 1, 1);
        g2d.fillRect(113 + x, 159 + y, 1, 2);
        g2d.fillRect(114 + x, 159 + y, 1, 2);
        g2d.fillRect(115 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 8);
        g2d.fillRect(117 + x, 95 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 1, 5);
        g2d.fillRect(115 + x, 107 + y, 1, 2);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(116 + x, 132 + y, 1, 3);
        g2d.fillRect(115 + x, 135 + y, 1, 3);
        g2d.fillRect(113 + x, 143 + y, 1, 1);
        g2d.fillRect(117 + x, 143 + y, 1, 4);
        g2d.fillRect(112 + x, 144 + y, 1, 3);
        g2d.fillRect(111 + x, 147 + y, 1, 4);
        g2d.fillRect(115 + x, 149 + y, 1, 3);
        g2d.fillRect(110 + x, 150 + y, 1, 7);
        g2d.fillRect(118 + x, 150 + y, 1, 2);
        g2d.fillRect(117 + x, 151 + y, 1, 6);
        g2d.fillRect(109 + x, 153 + y, 1, 6);
        g2d.fillRect(114 + x, 157 + y, 1, 2);
        g2d.fillRect(115 + x, 157 + y, 1, 3);
        g2d.fillRect(113 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 4);
        g2d.fillRect(117 + x, 147 + y, 1, 4);
        g2d.fillRect(115 + x, 152 + y, 1, 5);
    }





    public void paint3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(121 + x, 103 + y, 1, 2);
        g2d.fillRect(120 + x, 107 + y, 1, 1);
        g2d.fillRect(111 + x, 116 + y, 1, 4);
        g2d.fillRect(112 + x, 117 + y, 1, 2);
        g2d.fillRect(112 + x, 120 + y, 1, 2);
        g2d.fillRect(107 + x, 160 + y, 1, 2);
        g2d.fillRect(108 + x, 161 + y, 2, 1);
        g2d.fillRect(111 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 12);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 18);
        g2d.fillRect(120 + x, 103 + y, 1, 4);
        g2d.fillRect(114 + x, 106 + y, 1, 1);
        g2d.fillRect(119 + x, 107 + y, 1, 4);
        g2d.fillRect(118 + x, 111 + y, 1, 4);
        g2d.fillRect(112 + x, 112 + y, 1, 5);
        g2d.fillRect(119 + x, 115 + y, 1, 13);
        g2d.fillRect(112 + x, 119 + y, 1, 1);
        g2d.fillRect(111 + x, 120 + y, 1, 12);
        g2d.fillRect(119 + x, 130 + y, 1, 2);
        g2d.fillRect(110 + x, 131 + y, 1, 12);
        g2d.fillRect(120 + x, 132 + y, 1, 11);
        g2d.fillRect(109 + x, 143 + y, 1, 7);
        g2d.fillRect(121 + x, 143 + y, 1, 9);
        g2d.fillRect(108 + x, 150 + y, 1, 7);
        g2d.fillRect(122 + x, 152 + y, 1, 10);
        g2d.fillRect(107 + x, 157 + y, 1, 3);
        g2d.fillRect(112 + x, 160 + y, 1, 1);
        g2d.fillRect(119 + x, 160 + y, 1, 3);
        g2d.fillRect(110 + x, 161 + y, 1, 2);
        g2d.fillRect(111 + x, 161 + y, 1, 1);
        g2d.fillRect(120 + x, 161 + y, 1, 2);
        g2d.fillRect(121 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 17);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 14);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 106 + y, 1, 1);
        g2d.fillRect(114 + x, 107 + y, 1, 5);
        g2d.fillRect(118 + x, 107 + y, 1, 4);
        g2d.fillRect(117 + x, 111 + y, 1, 4);
        g2d.fillRect(113 + x, 112 + y, 1, 17);
        g2d.fillRect(118 + x, 115 + y, 1, 2);
        g2d.fillRect(114 + x, 118 + y, 1, 5);
        g2d.fillRect(116 + x, 119 + y, 3, 1);
        g2d.fillRect(118 + x, 120 + y, 1, 10);
        g2d.fillRect(112 + x, 122 + y, 1, 13);
        g2d.fillRect(117 + x, 125 + y, 1, 3);
        g2d.fillRect(119 + x, 128 + y, 1, 2);
        g2d.fillRect(111 + x, 132 + y, 1, 9);
        g2d.fillRect(118 + x, 132 + y, 1, 5);
        g2d.fillRect(119 + x, 132 + y, 1, 9);
        g2d.fillRect(117 + x, 137 + y, 1, 3);
        g2d.fillRect(116 + x, 141 + y, 1, 1);
        g2d.fillRect(110 + x, 143 + y, 1, 6);
        g2d.fillRect(120 + x, 143 + y, 1, 7);
        g2d.fillRect(115 + x, 147 + y, 1, 1);
        g2d.fillRect(114 + x, 149 + y, 1, 3);
        g2d.fillRect(109 + x, 150 + y, 1, 7);
        g2d.fillRect(113 + x, 152 + y, 1, 10);
        g2d.fillRect(121 + x, 152 + y, 1, 9);
        g2d.fillRect(119 + x, 153 + y, 1, 7);
        g2d.fillRect(108 + x, 157 + y, 1, 4);
        g2d.fillRect(112 + x, 157 + y, 1, 3);
        g2d.fillRect(109 + x, 160 + y, 3, 1);
        g2d.fillRect(120 + x, 160 + y, 1, 1);
        g2d.fillRect(112 + x, 161 + y, 1, 1);
        g2d.fillRect(114 + x, 161 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 16);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 14);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 53);
        g2d.fillRect(118 + x, 101 + y, 1, 6);
        g2d.fillRect(117 + x, 107 + y, 1, 4);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 8);
        g2d.fillRect(114 + x, 112 + y, 1, 6);
        g2d.fillRect(117 + x, 115 + y, 1, 4);
        g2d.fillRect(118 + x, 117 + y, 1, 2);
        g2d.fillRect(116 + x, 120 + y, 1, 15);
        g2d.fillRect(117 + x, 120 + y, 1, 5);
        g2d.fillRect(114 + x, 123 + y, 1, 20);
        g2d.fillRect(117 + x, 128 + y, 1, 4);
        g2d.fillRect(113 + x, 129 + y, 1, 15);
        g2d.fillRect(118 + x, 130 + y, 1, 2);
        g2d.fillRect(112 + x, 135 + y, 1, 12);
        g2d.fillRect(117 + x, 135 + y, 1, 2);
        g2d.fillRect(118 + x, 137 + y, 1, 6);
        g2d.fillRect(116 + x, 138 + y, 1, 3);
        g2d.fillRect(117 + x, 140 + y, 1, 22);
        g2d.fillRect(111 + x, 141 + y, 1, 9);
        g2d.fillRect(119 + x, 141 + y, 1, 9);
        g2d.fillRect(116 + x, 142 + y, 1, 7);
        g2d.fillRect(114 + x, 144 + y, 1, 5);
        g2d.fillRect(113 + x, 147 + y, 1, 5);
        g2d.fillRect(115 + x, 148 + y, 1, 9);
        g2d.fillRect(110 + x, 149 + y, 1, 4);
        g2d.fillRect(120 + x, 150 + y, 1, 10);
        g2d.fillRect(112 + x, 151 + y, 1, 6);
        g2d.fillRect(114 + x, 152 + y, 1, 6);
        g2d.fillRect(119 + x, 152 + y, 1, 1);
        g2d.fillRect(109 + x, 157 + y, 1, 3);
        g2d.fillRect(111 + x, 157 + y, 1, 3);
        g2d.fillRect(118 + x, 157 + y, 1, 5);
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(114 + x, 159 + y, 1, 2);
        g2d.fillRect(115 + x, 159 + y, 1, 2);
        g2d.fillRect(116 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 8);
        g2d.fillRect(117 + x, 95 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 6);
        g2d.fillRect(116 + x, 107 + y, 1, 2);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 132 + y, 1, 3);
        g2d.fillRect(116 + x, 135 + y, 1, 3);
        g2d.fillRect(114 + x, 143 + y, 1, 1);
        g2d.fillRect(118 + x, 143 + y, 1, 4);
        g2d.fillRect(113 + x, 144 + y, 1, 3);
        g2d.fillRect(112 + x, 147 + y, 1, 4);
        g2d.fillRect(116 + x, 149 + y, 1, 3);
        g2d.fillRect(111 + x, 150 + y, 1, 7);
        g2d.fillRect(119 + x, 150 + y, 1, 2);
        g2d.fillRect(118 + x, 151 + y, 1, 6);
        g2d.fillRect(110 + x, 153 + y, 1, 6);
        g2d.fillRect(115 + x, 157 + y, 1, 2);
        g2d.fillRect(116 + x, 157 + y, 1, 3);
        g2d.fillRect(114 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 4);
        g2d.fillRect(118 + x, 147 + y, 1, 4);
        g2d.fillRect(116 + x, 152 + y, 1, 5);
    }





    public void paint4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 102 + y, 1, 2);
        g2d.fillRect(119 + x, 106 + y, 1, 1);
        g2d.fillRect(110 + x, 114 + y, 1, 4);
        g2d.fillRect(111 + x, 115 + y, 1, 2);
        g2d.fillRect(111 + x, 118 + y, 1, 2);
        g2d.fillRect(106 + x, 157 + y, 1, 2);
        g2d.fillRect(107 + x, 158 + y, 2, 1);
        g2d.fillRect(110 + x, 159 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 10);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 7);
        g2d.fillRect(112 + x, 101 + y, 1, 10);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 4);
        g2d.fillRect(113 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 4);
        g2d.fillRect(117 + x, 110 + y, 1, 3);
        g2d.fillRect(111 + x, 111 + y, 1, 4);
        g2d.fillRect(118 + x, 113 + y, 1, 13);
        g2d.fillRect(111 + x, 117 + y, 1, 1);
        g2d.fillRect(110 + x, 118 + y, 1, 12);
        g2d.fillRect(118 + x, 128 + y, 1, 2);
        g2d.fillRect(109 + x, 129 + y, 1, 12);
        g2d.fillRect(119 + x, 130 + y, 1, 11);
        g2d.fillRect(108 + x, 141 + y, 1, 6);
        g2d.fillRect(120 + x, 141 + y, 1, 8);
        g2d.fillRect(107 + x, 147 + y, 1, 7);
        g2d.fillRect(121 + x, 149 + y, 1, 10);
        g2d.fillRect(106 + x, 154 + y, 1, 3);
        g2d.fillRect(111 + x, 157 + y, 1, 1);
        g2d.fillRect(118 + x, 157 + y, 1, 3);
        g2d.fillRect(109 + x, 158 + y, 1, 2);
        g2d.fillRect(110 + x, 158 + y, 1, 1);
        g2d.fillRect(119 + x, 158 + y, 1, 2);
        g2d.fillRect(120 + x, 158 + y, 1, 1);
        g2d.fillRect(111 + x, 159 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 12);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 12);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 101 + y, 1, 4);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(113 + x, 106 + y, 1, 5);
        g2d.fillRect(117 + x, 106 + y, 1, 4);
        g2d.fillRect(116 + x, 110 + y, 1, 3);
        g2d.fillRect(112 + x, 111 + y, 1, 16);
        g2d.fillRect(117 + x, 113 + y, 1, 2);
        g2d.fillRect(113 + x, 116 + y, 1, 5);
        g2d.fillRect(115 + x, 117 + y, 3, 1);
        g2d.fillRect(117 + x, 118 + y, 1, 10);
        g2d.fillRect(111 + x, 120 + y, 1, 13);
        g2d.fillRect(116 + x, 123 + y, 1, 3);
        g2d.fillRect(118 + x, 126 + y, 1, 2);
        g2d.fillRect(110 + x, 130 + y, 1, 9);
        g2d.fillRect(117 + x, 130 + y, 1, 5);
        g2d.fillRect(118 + x, 130 + y, 1, 9);
        g2d.fillRect(116 + x, 135 + y, 1, 3);
        g2d.fillRect(115 + x, 139 + y, 1, 1);
        g2d.fillRect(109 + x, 141 + y, 1, 5);
        g2d.fillRect(119 + x, 141 + y, 1, 6);
        g2d.fillRect(114 + x, 144 + y, 1, 1);
        g2d.fillRect(113 + x, 146 + y, 1, 3);
        g2d.fillRect(108 + x, 147 + y, 1, 7);
        g2d.fillRect(112 + x, 149 + y, 1, 10);
        g2d.fillRect(120 + x, 149 + y, 1, 9);
        g2d.fillRect(118 + x, 150 + y, 1, 7);
        g2d.fillRect(107 + x, 154 + y, 1, 4);
        g2d.fillRect(111 + x, 154 + y, 1, 3);
        g2d.fillRect(108 + x, 157 + y, 3, 1);
        g2d.fillRect(119 + x, 157 + y, 1, 1);
        g2d.fillRect(111 + x, 158 + y, 1, 1);
        g2d.fillRect(113 + x, 158 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 11);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 8);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 12);
        g2d.fillRect(118 + x, 100 + y, 1, 5);
        g2d.fillRect(114 + x, 101 + y, 1, 43);
        g2d.fillRect(117 + x, 101 + y, 1, 5);
        g2d.fillRect(116 + x, 106 + y, 1, 4);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(115 + x, 110 + y, 1, 7);
        g2d.fillRect(113 + x, 111 + y, 1, 5);
        g2d.fillRect(116 + x, 113 + y, 1, 4);
        g2d.fillRect(117 + x, 115 + y, 1, 2);
        g2d.fillRect(115 + x, 118 + y, 1, 15);
        g2d.fillRect(116 + x, 118 + y, 1, 5);
        g2d.fillRect(113 + x, 121 + y, 1, 20);
        g2d.fillRect(116 + x, 126 + y, 1, 4);
        g2d.fillRect(112 + x, 127 + y, 1, 15);
        g2d.fillRect(117 + x, 128 + y, 1, 2);
        g2d.fillRect(111 + x, 133 + y, 1, 11);
        g2d.fillRect(116 + x, 133 + y, 1, 2);
        g2d.fillRect(117 + x, 135 + y, 1, 6);
        g2d.fillRect(115 + x, 136 + y, 1, 3);
        g2d.fillRect(116 + x, 138 + y, 1, 21);
        g2d.fillRect(110 + x, 139 + y, 1, 8);
        g2d.fillRect(118 + x, 139 + y, 1, 8);
        g2d.fillRect(115 + x, 140 + y, 1, 6);
        g2d.fillRect(113 + x, 142 + y, 1, 4);
        g2d.fillRect(112 + x, 144 + y, 1, 5);
        g2d.fillRect(114 + x, 145 + y, 1, 9);
        g2d.fillRect(109 + x, 146 + y, 1, 4);
        g2d.fillRect(119 + x, 147 + y, 1, 10);
        g2d.fillRect(111 + x, 148 + y, 1, 6);
        g2d.fillRect(113 + x, 149 + y, 1, 6);
        g2d.fillRect(118 + x, 149 + y, 1, 1);
        g2d.fillRect(108 + x, 154 + y, 1, 3);
        g2d.fillRect(110 + x, 154 + y, 1, 3);
        g2d.fillRect(117 + x, 154 + y, 1, 5);
        g2d.fillRect(109 + x, 156 + y, 1, 1);
        g2d.fillRect(113 + x, 156 + y, 1, 2);
        g2d.fillRect(114 + x, 156 + y, 1, 2);
        g2d.fillRect(115 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 7);
        g2d.fillRect(117 + x, 95 + y, 1, 2);
        g2d.fillRect(117 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 5);
        g2d.fillRect(115 + x, 106 + y, 1, 2);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 130 + y, 1, 3);
        g2d.fillRect(115 + x, 133 + y, 1, 3);
        g2d.fillRect(113 + x, 141 + y, 1, 1);
        g2d.fillRect(117 + x, 141 + y, 1, 3);
        g2d.fillRect(112 + x, 142 + y, 1, 2);
        g2d.fillRect(111 + x, 144 + y, 1, 4);
        g2d.fillRect(115 + x, 146 + y, 1, 3);
        g2d.fillRect(110 + x, 147 + y, 1, 7);
        g2d.fillRect(118 + x, 147 + y, 1, 2);
        g2d.fillRect(117 + x, 148 + y, 1, 6);
        g2d.fillRect(109 + x, 150 + y, 1, 6);
        g2d.fillRect(114 + x, 154 + y, 1, 2);
        g2d.fillRect(115 + x, 154 + y, 1, 3);
        g2d.fillRect(113 + x, 155 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 3);
        g2d.fillRect(117 + x, 144 + y, 1, 4);
        g2d.fillRect(115 + x, 149 + y, 1, 5);
    }





    public void paint4a(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 95 + y, 1, 2);
        g2d.fillRect(110 + x, 114 + y, 1, 4);
        g2d.fillRect(122 + x, 155 + y, 1, 1);
        g2d.fillRect(122 + x, 157 + y, 1, 2);
        g2d.fillRect(121 + x, 158 + y, 1, 1);
        g2d.fillRect(119 + x, 159 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 87 + y, 1, 14);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 97 + y, 1, 4);
        g2d.fillRect(112 + x, 101 + y, 1, 11);
        g2d.fillRect(120 + x, 101 + y, 1, 3);
        g2d.fillRect(119 + x, 104 + y, 1, 7);
        g2d.fillRect(111 + x, 111 + y, 1, 3);
        g2d.fillRect(118 + x, 111 + y, 1, 14);
        g2d.fillRect(111 + x, 116 + y, 1, 1);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(110 + x, 118 + y, 1, 5);
        g2d.fillRect(111 + x, 121 + y, 1, 17);
        g2d.fillRect(119 + x, 125 + y, 1, 8);
        g2d.fillRect(112 + x, 126 + y, 1, 1);
        g2d.fillRect(118 + x, 127 + y, 1, 1);
        g2d.fillRect(120 + x, 133 + y, 1, 6);
        g2d.fillRect(110 + x, 138 + y, 1, 4);
        g2d.fillRect(121 + x, 138 + y, 1, 13);
        g2d.fillRect(109 + x, 142 + y, 1, 5);
        g2d.fillRect(108 + x, 147 + y, 1, 7);
        g2d.fillRect(122 + x, 151 + y, 1, 4);
        g2d.fillRect(107 + x, 153 + y, 1, 6);
        g2d.fillRect(122 + x, 156 + y, 1, 1);
        g2d.fillRect(111 + x, 157 + y, 1, 3);
        g2d.fillRect(121 + x, 157 + y, 1, 1);
        g2d.fillRect(108 + x, 158 + y, 3, 1);
        g2d.fillRect(120 + x, 158 + y, 1, 1);
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(112 + x, 159 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 12);
        g2d.fillRect(113 + x, 90 + y, 2, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 3);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 4);
        g2d.fillRect(113 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 3);
        g2d.fillRect(113 + x, 104 + y, 1, 8);
        g2d.fillRect(118 + x, 104 + y, 1, 7);
        g2d.fillRect(117 + x, 111 + y, 1, 6);
        g2d.fillRect(112 + x, 112 + y, 1, 2);
        g2d.fillRect(116 + x, 112 + y, 1, 11);
        g2d.fillRect(111 + x, 114 + y, 1, 2);
        g2d.fillRect(112 + x, 115 + y, 1, 11);
        g2d.fillRect(113 + x, 116 + y, 2, 1);
        g2d.fillRect(111 + x, 117 + y, 1, 4);
        g2d.fillRect(115 + x, 117 + y, 1, 4);
        g2d.fillRect(117 + x, 118 + y, 1, 19);
        g2d.fillRect(118 + x, 125 + y, 1, 2);
        g2d.fillRect(113 + x, 126 + y, 1, 1);
        g2d.fillRect(112 + x, 127 + y, 1, 13);
        g2d.fillRect(118 + x, 128 + y, 1, 5);
        g2d.fillRect(119 + x, 133 + y, 1, 11);
        g2d.fillRect(111 + x, 138 + y, 1, 6);
        g2d.fillRect(116 + x, 138 + y, 1, 1);
        g2d.fillRect(120 + x, 139 + y, 1, 19);
        g2d.fillRect(110 + x, 142 + y, 1, 5);
        g2d.fillRect(118 + x, 144 + y, 1, 4);
        g2d.fillRect(109 + x, 147 + y, 1, 11);
        g2d.fillRect(112 + x, 147 + y, 1, 1);
        g2d.fillRect(117 + x, 148 + y, 1, 5);
        g2d.fillRect(112 + x, 149 + y, 1, 10);
        g2d.fillRect(121 + x, 151 + y, 1, 6);
        g2d.fillRect(108 + x, 154 + y, 1, 4);
        g2d.fillRect(116 + x, 154 + y, 1, 1);
        g2d.fillRect(111 + x, 155 + y, 1, 2);
        g2d.fillRect(115 + x, 155 + y, 1, 1);
        g2d.fillRect(119 + x, 156 + y, 1, 2);
        g2d.fillRect(110 + x, 157 + y, 1, 1);
        g2d.fillRect(117 + x, 157 + y, 2, 1);
        g2d.fillRect(113 + x, 158 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 11);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 9);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 2);
        g2d.fillRect(114 + x, 99 + y, 1, 17);
        g2d.fillRect(118 + x, 100 + y, 1, 4);
        g2d.fillRect(117 + x, 101 + y, 1, 10);
        g2d.fillRect(113 + x, 102 + y, 1, 2);
        g2d.fillRect(115 + x, 105 + y, 1, 12);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(116 + x, 110 + y, 1, 2);
        g2d.fillRect(113 + x, 112 + y, 1, 4);
        g2d.fillRect(112 + x, 114 + y, 1, 1);
        g2d.fillRect(113 + x, 117 + y, 1, 9);
        g2d.fillRect(114 + x, 117 + y, 1, 25);
        g2d.fillRect(115 + x, 121 + y, 1, 15);
        g2d.fillRect(116 + x, 123 + y, 1, 7);
        g2d.fillRect(113 + x, 127 + y, 1, 11);
        g2d.fillRect(118 + x, 133 + y, 1, 11);
        g2d.fillRect(116 + x, 137 + y, 2, 1);
        g2d.fillRect(117 + x, 138 + y, 1, 1);
        g2d.fillRect(116 + x, 139 + y, 1, 4);
        g2d.fillRect(112 + x, 140 + y, 1, 4);
        g2d.fillRect(115 + x, 140 + y, 1, 4);
        g2d.fillRect(114 + x, 143 + y, 1, 2);
        g2d.fillRect(111 + x, 144 + y, 1, 3);
        g2d.fillRect(113 + x, 144 + y, 1, 10);
        g2d.fillRect(117 + x, 144 + y, 1, 4);
        g2d.fillRect(119 + x, 144 + y, 1, 12);
        g2d.fillRect(114 + x, 146 + y, 1, 3);
        g2d.fillRect(115 + x, 146 + y, 1, 2);
        g2d.fillRect(110 + x, 147 + y, 1, 10);
        g2d.fillRect(112 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 148 + y, 1, 9);
        g2d.fillRect(111 + x, 149 + y, 1, 6);
        g2d.fillRect(116 + x, 149 + y, 1, 5);
        g2d.fillRect(115 + x, 151 + y, 1, 4);
        g2d.fillRect(114 + x, 153 + y, 1, 5);
        g2d.fillRect(117 + x, 153 + y, 1, 4);
        g2d.fillRect(113 + x, 155 + y, 1, 3);
        g2d.fillRect(116 + x, 155 + y, 1, 3);
        g2d.fillRect(115 + x, 156 + y, 1, 2);
        g2d.fillRect(117 + x, 158 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 3);
        g2d.fillRect(118 + x, 92 + y, 1, 8);
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 4);
        g2d.fillRect(116 + x, 99 + y, 1, 9);
        g2d.fillRect(115 + x, 101 + y, 1, 4);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 130 + y, 1, 3);
        g2d.fillRect(116 + x, 134 + y, 1, 3);
        g2d.fillRect(115 + x, 137 + y, 1, 3);
        g2d.fillRect(113 + x, 138 + y, 1, 6);
        g2d.fillRect(117 + x, 139 + y, 1, 5);
        g2d.fillRect(114 + x, 142 + y, 1, 1);
        g2d.fillRect(116 + x, 143 + y, 1, 1);
        g2d.fillRect(112 + x, 144 + y, 1, 3);
        g2d.fillRect(115 + x, 144 + y, 1, 2);
        g2d.fillRect(114 + x, 145 + y, 1, 1);
        g2d.fillRect(111 + x, 147 + y, 1, 2);
        g2d.fillRect(116 + x, 147 + y, 1, 2);
        g2d.fillRect(115 + x, 148 + y, 1, 3);
        g2d.fillRect(114 + x, 149 + y, 1, 4);
        g2d.fillRect(113 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 133 + y, 1, 1);
        g2d.fillRect(115 + x, 136 + y, 1, 1);
        g2d.fillRect(116 + x, 144 + y, 1, 3);
    }





    public void paint5(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 100 + y, 1, 2);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 111 + y, 1, 3);
        g2d.fillRect(111 + x, 112 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 2);
        g2d.fillRect(106 + x, 153 + y, 1, 2);
        g2d.fillRect(107 + x, 154 + y, 2, 1);
        g2d.fillRect(110 + x, 155 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 8);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 5);
        g2d.fillRect(112 + x, 99 + y, 1, 9);
        g2d.fillRect(120 + x, 99 + y, 1, 1);
        g2d.fillRect(119 + x, 100 + y, 1, 4);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 3);
        g2d.fillRect(117 + x, 107 + y, 1, 3);
        g2d.fillRect(111 + x, 108 + y, 1, 4);
        g2d.fillRect(118 + x, 110 + y, 1, 12);
        g2d.fillRect(111 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 114 + y, 1, 12);
        g2d.fillRect(118 + x, 124 + y, 1, 2);
        g2d.fillRect(109 + x, 125 + y, 1, 12);
        g2d.fillRect(119 + x, 126 + y, 1, 11);
        g2d.fillRect(108 + x, 137 + y, 1, 6);
        g2d.fillRect(120 + x, 137 + y, 1, 8);
        g2d.fillRect(107 + x, 143 + y, 1, 7);
        g2d.fillRect(121 + x, 145 + y, 1, 10);
        g2d.fillRect(106 + x, 150 + y, 1, 3);
        g2d.fillRect(111 + x, 153 + y, 1, 1);
        g2d.fillRect(118 + x, 153 + y, 1, 3);
        g2d.fillRect(109 + x, 154 + y, 1, 2);
        g2d.fillRect(110 + x, 154 + y, 1, 1);
        g2d.fillRect(119 + x, 154 + y, 1, 2);
        g2d.fillRect(120 + x, 154 + y, 1, 1);
        g2d.fillRect(111 + x, 155 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 10);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 10);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 4);
        g2d.fillRect(119 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 4);
        g2d.fillRect(117 + x, 104 + y, 1, 3);
        g2d.fillRect(116 + x, 107 + y, 1, 3);
        g2d.fillRect(112 + x, 108 + y, 1, 15);
        g2d.fillRect(117 + x, 110 + y, 1, 2);
        g2d.fillRect(113 + x, 112 + y, 1, 5);
        g2d.fillRect(115 + x, 113 + y, 3, 1);
        g2d.fillRect(117 + x, 114 + y, 1, 10);
        g2d.fillRect(111 + x, 116 + y, 1, 13);
        g2d.fillRect(116 + x, 119 + y, 1, 3);
        g2d.fillRect(118 + x, 122 + y, 1, 2);
        g2d.fillRect(110 + x, 126 + y, 1, 9);
        g2d.fillRect(117 + x, 126 + y, 1, 5);
        g2d.fillRect(118 + x, 126 + y, 1, 9);
        g2d.fillRect(116 + x, 131 + y, 1, 3);
        g2d.fillRect(115 + x, 135 + y, 1, 1);
        g2d.fillRect(109 + x, 137 + y, 1, 5);
        g2d.fillRect(119 + x, 137 + y, 1, 6);
        g2d.fillRect(114 + x, 140 + y, 1, 1);
        g2d.fillRect(113 + x, 142 + y, 1, 3);
        g2d.fillRect(108 + x, 143 + y, 1, 7);
        g2d.fillRect(112 + x, 145 + y, 1, 10);
        g2d.fillRect(120 + x, 145 + y, 1, 9);
        g2d.fillRect(118 + x, 146 + y, 1, 7);
        g2d.fillRect(107 + x, 150 + y, 1, 4);
        g2d.fillRect(111 + x, 150 + y, 1, 3);
        g2d.fillRect(108 + x, 153 + y, 3, 1);
        g2d.fillRect(119 + x, 153 + y, 1, 1);
        g2d.fillRect(111 + x, 154 + y, 1, 1);
        g2d.fillRect(113 + x, 154 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 9);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 6);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 10);
        g2d.fillRect(118 + x, 98 + y, 1, 5);
        g2d.fillRect(114 + x, 99 + y, 1, 41);
        g2d.fillRect(117 + x, 99 + y, 1, 5);
        g2d.fillRect(116 + x, 104 + y, 1, 3);
        g2d.fillRect(115 + x, 107 + y, 1, 6);
        g2d.fillRect(113 + x, 108 + y, 1, 4);
        g2d.fillRect(116 + x, 110 + y, 1, 3);
        g2d.fillRect(117 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 1, 15);
        g2d.fillRect(116 + x, 114 + y, 1, 5);
        g2d.fillRect(113 + x, 117 + y, 1, 20);
        g2d.fillRect(116 + x, 122 + y, 1, 4);
        g2d.fillRect(112 + x, 123 + y, 1, 15);
        g2d.fillRect(117 + x, 124 + y, 1, 2);
        g2d.fillRect(111 + x, 129 + y, 1, 11);
        g2d.fillRect(116 + x, 129 + y, 1, 2);
        g2d.fillRect(117 + x, 131 + y, 1, 6);
        g2d.fillRect(115 + x, 132 + y, 1, 3);
        g2d.fillRect(116 + x, 134 + y, 1, 21);
        g2d.fillRect(110 + x, 135 + y, 1, 8);
        g2d.fillRect(118 + x, 135 + y, 1, 8);
        g2d.fillRect(115 + x, 136 + y, 1, 6);
        g2d.fillRect(113 + x, 138 + y, 1, 4);
        g2d.fillRect(112 + x, 140 + y, 1, 5);
        g2d.fillRect(114 + x, 141 + y, 1, 9);
        g2d.fillRect(109 + x, 142 + y, 1, 4);
        g2d.fillRect(119 + x, 143 + y, 1, 10);
        g2d.fillRect(111 + x, 144 + y, 1, 6);
        g2d.fillRect(113 + x, 145 + y, 1, 6);
        g2d.fillRect(118 + x, 145 + y, 1, 1);
        g2d.fillRect(108 + x, 150 + y, 1, 3);
        g2d.fillRect(110 + x, 150 + y, 1, 3);
        g2d.fillRect(117 + x, 150 + y, 1, 5);
        g2d.fillRect(109 + x, 152 + y, 1, 1);
        g2d.fillRect(113 + x, 152 + y, 1, 2);
        g2d.fillRect(114 + x, 152 + y, 1, 2);
        g2d.fillRect(115 + x, 153 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 5);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 5);
        g2d.fillRect(115 + x, 104 + y, 1, 3);
        g2d.fillRect(116 + x, 126 + y, 1, 3);
        g2d.fillRect(115 + x, 129 + y, 1, 3);
        g2d.fillRect(113 + x, 137 + y, 1, 1);
        g2d.fillRect(117 + x, 137 + y, 1, 3);
        g2d.fillRect(112 + x, 138 + y, 1, 2);
        g2d.fillRect(111 + x, 140 + y, 1, 4);
        g2d.fillRect(115 + x, 142 + y, 1, 3);
        g2d.fillRect(110 + x, 143 + y, 1, 7);
        g2d.fillRect(118 + x, 143 + y, 1, 2);
        g2d.fillRect(117 + x, 144 + y, 1, 6);
        g2d.fillRect(109 + x, 146 + y, 1, 6);
        g2d.fillRect(114 + x, 150 + y, 1, 2);
        g2d.fillRect(115 + x, 150 + y, 1, 3);
        g2d.fillRect(113 + x, 151 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 96 + y, 1, 2);
        g2d.fillRect(117 + x, 140 + y, 1, 4);
        g2d.fillRect(115 + x, 145 + y, 1, 5);
    }





    public void paint5a(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 95 + y, 1, 2);
        g2d.fillRect(110 + x, 111 + y, 1, 4);
        g2d.fillRect(122 + x, 151 + y, 1, 1);
        g2d.fillRect(122 + x, 153 + y, 1, 2);
        g2d.fillRect(121 + x, 154 + y, 1, 1);
        g2d.fillRect(119 + x, 155 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 87 + y, 1, 12);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 97 + y, 1, 2);
        g2d.fillRect(112 + x, 99 + y, 1, 10);
        g2d.fillRect(120 + x, 99 + y, 1, 3);
        g2d.fillRect(119 + x, 102 + y, 1, 6);
        g2d.fillRect(111 + x, 108 + y, 1, 3);
        g2d.fillRect(118 + x, 108 + y, 1, 13);
        g2d.fillRect(111 + x, 113 + y, 1, 1);
        g2d.fillRect(117 + x, 114 + y, 1, 1);
        g2d.fillRect(110 + x, 115 + y, 1, 4);
        g2d.fillRect(111 + x, 117 + y, 1, 17);
        g2d.fillRect(119 + x, 121 + y, 1, 8);
        g2d.fillRect(112 + x, 122 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 1);
        g2d.fillRect(120 + x, 129 + y, 1, 6);
        g2d.fillRect(110 + x, 134 + y, 1, 4);
        g2d.fillRect(121 + x, 134 + y, 1, 13);
        g2d.fillRect(109 + x, 138 + y, 1, 5);
        g2d.fillRect(108 + x, 143 + y, 1, 7);
        g2d.fillRect(122 + x, 147 + y, 1, 4);
        g2d.fillRect(107 + x, 149 + y, 1, 6);
        g2d.fillRect(122 + x, 152 + y, 1, 1);
        g2d.fillRect(111 + x, 153 + y, 1, 3);
        g2d.fillRect(121 + x, 153 + y, 1, 1);
        g2d.fillRect(108 + x, 154 + y, 3, 1);
        g2d.fillRect(120 + x, 154 + y, 1, 1);
        g2d.fillRect(110 + x, 155 + y, 1, 1);
        g2d.fillRect(112 + x, 155 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 10);
        g2d.fillRect(113 + x, 90 + y, 2, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 3);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 2);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(119 + x, 99 + y, 1, 3);
        g2d.fillRect(113 + x, 102 + y, 1, 7);
        g2d.fillRect(118 + x, 102 + y, 1, 6);
        g2d.fillRect(117 + x, 108 + y, 1, 6);
        g2d.fillRect(112 + x, 109 + y, 1, 2);
        g2d.fillRect(116 + x, 109 + y, 1, 10);
        g2d.fillRect(111 + x, 111 + y, 1, 2);
        g2d.fillRect(112 + x, 112 + y, 1, 10);
        g2d.fillRect(113 + x, 113 + y, 2, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 3);
        g2d.fillRect(115 + x, 114 + y, 1, 3);
        g2d.fillRect(117 + x, 115 + y, 1, 18);
        g2d.fillRect(118 + x, 121 + y, 1, 2);
        g2d.fillRect(113 + x, 122 + y, 1, 1);
        g2d.fillRect(112 + x, 123 + y, 1, 13);
        g2d.fillRect(118 + x, 124 + y, 1, 5);
        g2d.fillRect(119 + x, 129 + y, 1, 11);
        g2d.fillRect(111 + x, 134 + y, 1, 6);
        g2d.fillRect(116 + x, 134 + y, 1, 1);
        g2d.fillRect(120 + x, 135 + y, 1, 19);
        g2d.fillRect(110 + x, 138 + y, 1, 5);
        g2d.fillRect(118 + x, 140 + y, 1, 4);
        g2d.fillRect(109 + x, 143 + y, 1, 11);
        g2d.fillRect(112 + x, 143 + y, 1, 1);
        g2d.fillRect(117 + x, 144 + y, 1, 5);
        g2d.fillRect(112 + x, 145 + y, 1, 10);
        g2d.fillRect(121 + x, 147 + y, 1, 6);
        g2d.fillRect(108 + x, 150 + y, 1, 4);
        g2d.fillRect(116 + x, 150 + y, 1, 1);
        g2d.fillRect(111 + x, 151 + y, 1, 2);
        g2d.fillRect(115 + x, 151 + y, 1, 1);
        g2d.fillRect(119 + x, 152 + y, 1, 2);
        g2d.fillRect(110 + x, 153 + y, 1, 1);
        g2d.fillRect(117 + x, 153 + y, 2, 1);
        g2d.fillRect(113 + x, 154 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 9);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 7);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 16);
        g2d.fillRect(118 + x, 98 + y, 1, 4);
        g2d.fillRect(117 + x, 99 + y, 1, 9);
        g2d.fillRect(113 + x, 100 + y, 1, 2);
        g2d.fillRect(115 + x, 103 + y, 1, 11);
        g2d.fillRect(116 + x, 107 + y, 1, 2);
        g2d.fillRect(113 + x, 109 + y, 1, 4);
        g2d.fillRect(112 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 114 + y, 1, 8);
        g2d.fillRect(114 + x, 114 + y, 1, 24);
        g2d.fillRect(115 + x, 117 + y, 1, 15);
        g2d.fillRect(116 + x, 119 + y, 1, 7);
        g2d.fillRect(113 + x, 123 + y, 1, 11);
        g2d.fillRect(118 + x, 129 + y, 1, 11);
        g2d.fillRect(116 + x, 133 + y, 2, 1);
        g2d.fillRect(117 + x, 134 + y, 1, 1);
        g2d.fillRect(116 + x, 135 + y, 1, 4);
        g2d.fillRect(112 + x, 136 + y, 1, 4);
        g2d.fillRect(115 + x, 136 + y, 1, 4);
        g2d.fillRect(114 + x, 139 + y, 1, 2);
        g2d.fillRect(111 + x, 140 + y, 1, 3);
        g2d.fillRect(113 + x, 140 + y, 1, 10);
        g2d.fillRect(117 + x, 140 + y, 1, 4);
        g2d.fillRect(119 + x, 140 + y, 1, 12);
        g2d.fillRect(114 + x, 142 + y, 1, 3);
        g2d.fillRect(115 + x, 142 + y, 1, 2);
        g2d.fillRect(110 + x, 143 + y, 1, 10);
        g2d.fillRect(112 + x, 144 + y, 1, 1);
        g2d.fillRect(118 + x, 144 + y, 1, 9);
        g2d.fillRect(111 + x, 145 + y, 1, 6);
        g2d.fillRect(116 + x, 145 + y, 1, 5);
        g2d.fillRect(115 + x, 147 + y, 1, 4);
        g2d.fillRect(114 + x, 149 + y, 1, 5);
        g2d.fillRect(117 + x, 149 + y, 1, 4);
        g2d.fillRect(113 + x, 151 + y, 1, 3);
        g2d.fillRect(116 + x, 151 + y, 1, 3);
        g2d.fillRect(115 + x, 152 + y, 1, 2);
        g2d.fillRect(117 + x, 154 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 3);
        g2d.fillRect(118 + x, 92 + y, 1, 6);
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 12);
        g2d.fillRect(117 + x, 97 + y, 1, 2);
        g2d.fillRect(115 + x, 99 + y, 1, 4);
        g2d.fillRect(116 + x, 126 + y, 1, 3);
        g2d.fillRect(116 + x, 130 + y, 1, 3);
        g2d.fillRect(115 + x, 133 + y, 1, 3);
        g2d.fillRect(113 + x, 134 + y, 1, 6);
        g2d.fillRect(117 + x, 135 + y, 1, 5);
        g2d.fillRect(114 + x, 138 + y, 1, 1);
        g2d.fillRect(116 + x, 139 + y, 1, 1);
        g2d.fillRect(112 + x, 140 + y, 1, 3);
        g2d.fillRect(115 + x, 140 + y, 1, 2);
        g2d.fillRect(114 + x, 141 + y, 1, 1);
        g2d.fillRect(111 + x, 143 + y, 1, 2);
        g2d.fillRect(116 + x, 143 + y, 1, 2);
        g2d.fillRect(115 + x, 144 + y, 1, 3);
        g2d.fillRect(114 + x, 145 + y, 1, 4);
        g2d.fillRect(113 + x, 150 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 129 + y, 1, 1);
        g2d.fillRect(115 + x, 132 + y, 1, 1);
        g2d.fillRect(116 + x, 140 + y, 1, 3);
    }





    public void paint6(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 3);
        g2d.fillRect(112 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 111 + y, 1, 1);
        g2d.fillRect(107 + x, 148 + y, 1, 2);
        g2d.fillRect(108 + x, 149 + y, 2, 1);
        g2d.fillRect(111 + x, 150 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 8);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 5);
        g2d.fillRect(112 + x, 99 + y, 1, 10);
        g2d.fillRect(119 + x, 99 + y, 1, 4);
        g2d.fillRect(113 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 4);
        g2d.fillRect(113 + x, 104 + y, 1, 1);
        g2d.fillRect(119 + x, 107 + y, 1, 11);
        g2d.fillRect(112 + x, 110 + y, 1, 1);
        g2d.fillRect(111 + x, 111 + y, 1, 11);
        g2d.fillRect(119 + x, 120 + y, 1, 2);
        g2d.fillRect(110 + x, 121 + y, 1, 11);
        g2d.fillRect(120 + x, 122 + y, 1, 10);
        g2d.fillRect(109 + x, 132 + y, 1, 6);
        g2d.fillRect(121 + x, 132 + y, 1, 8);
        g2d.fillRect(108 + x, 138 + y, 1, 7);
        g2d.fillRect(122 + x, 140 + y, 1, 10);
        g2d.fillRect(107 + x, 145 + y, 1, 3);
        g2d.fillRect(112 + x, 148 + y, 1, 1);
        g2d.fillRect(119 + x, 148 + y, 1, 3);
        g2d.fillRect(110 + x, 149 + y, 1, 2);
        g2d.fillRect(111 + x, 149 + y, 1, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 2);
        g2d.fillRect(121 + x, 149 + y, 1, 1);
        g2d.fillRect(112 + x, 150 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 10);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 10);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 3);
        g2d.fillRect(118 + x, 102 + y, 1, 1);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 4);
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(113 + x, 105 + y, 1, 14);
        g2d.fillRect(118 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 109 + y, 1, 4);
        g2d.fillRect(116 + x, 110 + y, 3, 1);
        g2d.fillRect(118 + x, 111 + y, 1, 9);
        g2d.fillRect(112 + x, 112 + y, 1, 13);
        g2d.fillRect(117 + x, 115 + y, 1, 3);
        g2d.fillRect(119 + x, 118 + y, 1, 2);
        g2d.fillRect(111 + x, 122 + y, 1, 8);
        g2d.fillRect(118 + x, 122 + y, 1, 5);
        g2d.fillRect(119 + x, 122 + y, 1, 8);
        g2d.fillRect(117 + x, 127 + y, 1, 2);
        g2d.fillRect(116 + x, 130 + y, 1, 1);
        g2d.fillRect(110 + x, 132 + y, 1, 5);
        g2d.fillRect(120 + x, 132 + y, 1, 6);
        g2d.fillRect(115 + x, 135 + y, 1, 1);
        g2d.fillRect(114 + x, 137 + y, 1, 3);
        g2d.fillRect(109 + x, 138 + y, 1, 7);
        g2d.fillRect(113 + x, 140 + y, 1, 10);
        g2d.fillRect(121 + x, 140 + y, 1, 9);
        g2d.fillRect(119 + x, 141 + y, 1, 7);
        g2d.fillRect(108 + x, 145 + y, 1, 4);
        g2d.fillRect(112 + x, 145 + y, 1, 3);
        g2d.fillRect(109 + x, 148 + y, 3, 1);
        g2d.fillRect(120 + x, 148 + y, 1, 1);
        g2d.fillRect(112 + x, 149 + y, 1, 1);
        g2d.fillRect(114 + x, 149 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 9);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 6);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 9);
        g2d.fillRect(118 + x, 98 + y, 1, 4);
        g2d.fillRect(114 + x, 99 + y, 1, 5);
        g2d.fillRect(117 + x, 99 + y, 1, 4);
        g2d.fillRect(116 + x, 103 + y, 1, 7);
        g2d.fillRect(115 + x, 104 + y, 1, 31);
        g2d.fillRect(114 + x, 105 + y, 1, 4);
        g2d.fillRect(117 + x, 107 + y, 1, 3);
        g2d.fillRect(118 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 14);
        g2d.fillRect(117 + x, 111 + y, 1, 4);
        g2d.fillRect(114 + x, 113 + y, 1, 19);
        g2d.fillRect(117 + x, 118 + y, 1, 4);
        g2d.fillRect(113 + x, 119 + y, 1, 14);
        g2d.fillRect(118 + x, 120 + y, 1, 2);
        g2d.fillRect(112 + x, 125 + y, 1, 10);
        g2d.fillRect(117 + x, 125 + y, 1, 2);
        g2d.fillRect(118 + x, 127 + y, 1, 5);
        g2d.fillRect(116 + x, 128 + y, 1, 2);
        g2d.fillRect(117 + x, 129 + y, 1, 21);
        g2d.fillRect(111 + x, 130 + y, 1, 8);
        g2d.fillRect(119 + x, 130 + y, 1, 8);
        g2d.fillRect(116 + x, 131 + y, 1, 6);
        g2d.fillRect(114 + x, 133 + y, 1, 4);
        g2d.fillRect(113 + x, 135 + y, 1, 5);
        g2d.fillRect(115 + x, 136 + y, 1, 9);
        g2d.fillRect(110 + x, 137 + y, 1, 4);
        g2d.fillRect(120 + x, 138 + y, 1, 10);
        g2d.fillRect(112 + x, 139 + y, 1, 6);
        g2d.fillRect(114 + x, 140 + y, 1, 6);
        g2d.fillRect(119 + x, 140 + y, 1, 1);
        g2d.fillRect(109 + x, 145 + y, 1, 3);
        g2d.fillRect(111 + x, 145 + y, 1, 3);
        g2d.fillRect(118 + x, 145 + y, 1, 5);
        g2d.fillRect(110 + x, 147 + y, 1, 1);
        g2d.fillRect(114 + x, 147 + y, 1, 2);
        g2d.fillRect(115 + x, 147 + y, 1, 2);
        g2d.fillRect(116 + x, 148 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 5);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 4);
        g2d.fillRect(115 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 122 + y, 1, 3);
        g2d.fillRect(116 + x, 125 + y, 1, 3);
        g2d.fillRect(114 + x, 132 + y, 1, 1);
        g2d.fillRect(118 + x, 132 + y, 1, 3);
        g2d.fillRect(113 + x, 133 + y, 1, 2);
        g2d.fillRect(112 + x, 135 + y, 1, 4);
        g2d.fillRect(116 + x, 137 + y, 1, 3);
        g2d.fillRect(111 + x, 138 + y, 1, 7);
        g2d.fillRect(119 + x, 138 + y, 1, 2);
        g2d.fillRect(118 + x, 139 + y, 1, 6);
        g2d.fillRect(110 + x, 141 + y, 1, 6);
        g2d.fillRect(115 + x, 145 + y, 1, 2);
        g2d.fillRect(116 + x, 145 + y, 1, 3);
        g2d.fillRect(114 + x, 146 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 96 + y, 1, 2);
        g2d.fillRect(118 + x, 135 + y, 1, 4);
        g2d.fillRect(116 + x, 140 + y, 1, 5);
    }





    public void paint6a(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 95 + y, 1, 2);
        g2d.fillRect(111 + x, 108 + y, 1, 4);
        g2d.fillRect(123 + x, 146 + y, 1, 1);
        g2d.fillRect(123 + x, 148 + y, 1, 2);
        g2d.fillRect(122 + x, 149 + y, 1, 1);
        g2d.fillRect(120 + x, 150 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 87 + y, 1, 12);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 97 + y, 1, 2);
        g2d.fillRect(112 + x, 99 + y, 1, 9);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 101 + y, 1, 16);
        g2d.fillRect(112 + x, 110 + y, 1, 1);
        g2d.fillRect(118 + x, 111 + y, 1, 1);
        g2d.fillRect(111 + x, 112 + y, 1, 3);
        g2d.fillRect(112 + x, 114 + y, 1, 15);
        g2d.fillRect(120 + x, 117 + y, 1, 8);
        g2d.fillRect(113 + x, 118 + y, 1, 1);
        g2d.fillRect(119 + x, 119 + y, 1, 1);
        g2d.fillRect(121 + x, 125 + y, 1, 5);
        g2d.fillRect(111 + x, 129 + y, 1, 3);
        g2d.fillRect(122 + x, 129 + y, 1, 13);
        g2d.fillRect(110 + x, 132 + y, 1, 6);
        g2d.fillRect(109 + x, 138 + y, 1, 6);
        g2d.fillRect(123 + x, 142 + y, 1, 4);
        g2d.fillRect(108 + x, 143 + y, 1, 7);
        g2d.fillRect(123 + x, 147 + y, 1, 1);
        g2d.fillRect(112 + x, 148 + y, 1, 3);
        g2d.fillRect(122 + x, 148 + y, 1, 1);
        g2d.fillRect(109 + x, 149 + y, 3, 1);
        g2d.fillRect(121 + x, 149 + y, 1, 1);
        g2d.fillRect(111 + x, 150 + y, 1, 1);
        g2d.fillRect(113 + x, 150 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 10);
        g2d.fillRect(113 + x, 90 + y, 2, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 3);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 99 + y, 1, 2);
        g2d.fillRect(113 + x, 101 + y, 1, 7);
        g2d.fillRect(118 + x, 101 + y, 1, 10);
        g2d.fillRect(117 + x, 106 + y, 1, 9);
        g2d.fillRect(112 + x, 108 + y, 1, 2);
        g2d.fillRect(113 + x, 109 + y, 1, 9);
        g2d.fillRect(114 + x, 110 + y, 2, 1);
        g2d.fillRect(112 + x, 111 + y, 1, 3);
        g2d.fillRect(116 + x, 111 + y, 1, 2);
        g2d.fillRect(118 + x, 112 + y, 1, 16);
        g2d.fillRect(119 + x, 117 + y, 1, 2);
        g2d.fillRect(114 + x, 118 + y, 1, 1);
        g2d.fillRect(113 + x, 119 + y, 1, 12);
        g2d.fillRect(119 + x, 120 + y, 1, 5);
        g2d.fillRect(120 + x, 125 + y, 1, 10);
        g2d.fillRect(112 + x, 129 + y, 1, 6);
        g2d.fillRect(117 + x, 129 + y, 1, 1);
        g2d.fillRect(121 + x, 130 + y, 1, 19);
        g2d.fillRect(111 + x, 132 + y, 1, 6);
        g2d.fillRect(119 + x, 135 + y, 1, 4);
        g2d.fillRect(110 + x, 138 + y, 1, 11);
        g2d.fillRect(113 + x, 138 + y, 1, 1);
        g2d.fillRect(118 + x, 139 + y, 1, 5);
        g2d.fillRect(113 + x, 140 + y, 1, 10);
        g2d.fillRect(122 + x, 142 + y, 1, 6);
        g2d.fillRect(109 + x, 144 + y, 1, 5);
        g2d.fillRect(117 + x, 145 + y, 1, 1);
        g2d.fillRect(112 + x, 146 + y, 1, 2);
        g2d.fillRect(116 + x, 146 + y, 1, 1);
        g2d.fillRect(120 + x, 147 + y, 1, 2);
        g2d.fillRect(111 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 148 + y, 2, 1);
        g2d.fillRect(114 + x, 149 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 9);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 7);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 13);
        g2d.fillRect(118 + x, 98 + y, 1, 3);
        g2d.fillRect(113 + x, 99 + y, 1, 2);
        g2d.fillRect(117 + x, 99 + y, 1, 7);
        g2d.fillRect(115 + x, 102 + y, 1, 8);
        g2d.fillRect(116 + x, 105 + y, 1, 6);
        g2d.fillRect(113 + x, 108 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 7);
        g2d.fillRect(115 + x, 111 + y, 1, 22);
        g2d.fillRect(116 + x, 113 + y, 1, 14);
        g2d.fillRect(117 + x, 115 + y, 1, 7);
        g2d.fillRect(114 + x, 119 + y, 1, 10);
        g2d.fillRect(119 + x, 125 + y, 1, 10);
        g2d.fillRect(117 + x, 128 + y, 2, 1);
        g2d.fillRect(118 + x, 129 + y, 1, 1);
        g2d.fillRect(117 + x, 130 + y, 1, 4);
        g2d.fillRect(113 + x, 131 + y, 1, 4);
        g2d.fillRect(116 + x, 131 + y, 1, 4);
        g2d.fillRect(115 + x, 134 + y, 1, 2);
        g2d.fillRect(112 + x, 135 + y, 1, 3);
        g2d.fillRect(114 + x, 135 + y, 1, 10);
        g2d.fillRect(118 + x, 135 + y, 1, 4);
        g2d.fillRect(120 + x, 135 + y, 1, 12);
        g2d.fillRect(115 + x, 137 + y, 1, 3);
        g2d.fillRect(116 + x, 137 + y, 1, 2);
        g2d.fillRect(111 + x, 138 + y, 1, 10);
        g2d.fillRect(113 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 139 + y, 1, 9);
        g2d.fillRect(112 + x, 140 + y, 1, 6);
        g2d.fillRect(117 + x, 140 + y, 1, 5);
        g2d.fillRect(116 + x, 142 + y, 1, 4);
        g2d.fillRect(115 + x, 144 + y, 1, 5);
        g2d.fillRect(118 + x, 144 + y, 1, 4);
        g2d.fillRect(114 + x, 146 + y, 1, 3);
        g2d.fillRect(117 + x, 146 + y, 1, 3);
        g2d.fillRect(116 + x, 147 + y, 1, 2);
        g2d.fillRect(118 + x, 149 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 3);
        g2d.fillRect(118 + x, 92 + y, 1, 6);
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 10);
        g2d.fillRect(117 + x, 97 + y, 1, 2);
        g2d.fillRect(115 + x, 99 + y, 1, 3);
        g2d.fillRect(117 + x, 122 + y, 1, 3);
        g2d.fillRect(117 + x, 126 + y, 1, 2);
        g2d.fillRect(116 + x, 128 + y, 1, 3);
        g2d.fillRect(114 + x, 129 + y, 1, 6);
        g2d.fillRect(118 + x, 130 + y, 1, 5);
        g2d.fillRect(115 + x, 133 + y, 1, 1);
        g2d.fillRect(117 + x, 134 + y, 1, 1);
        g2d.fillRect(113 + x, 135 + y, 1, 3);
        g2d.fillRect(116 + x, 135 + y, 1, 2);
        g2d.fillRect(115 + x, 136 + y, 1, 1);
        g2d.fillRect(112 + x, 138 + y, 1, 2);
        g2d.fillRect(117 + x, 138 + y, 1, 2);
        g2d.fillRect(116 + x, 139 + y, 1, 3);
        g2d.fillRect(115 + x, 140 + y, 1, 4);
        g2d.fillRect(114 + x, 145 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 4);
        g2d.fillRect(117 + x, 125 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 1);
        g2d.fillRect(117 + x, 135 + y, 1, 3);
    }





    public void paint7(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 104 + y, 1, 3);
        g2d.fillRect(113 + x, 105 + y, 1, 1);
        g2d.fillRect(113 + x, 107 + y, 1, 1);
        g2d.fillRect(108 + x, 144 + y, 1, 2);
        g2d.fillRect(109 + x, 145 + y, 2, 1);
        g2d.fillRect(112 + x, 146 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 6);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 11);
        g2d.fillRect(119 + x, 97 + y, 1, 2);
        g2d.fillRect(114 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 101 + y, 1, 2);
        g2d.fillRect(120 + x, 103 + y, 1, 11);
        g2d.fillRect(113 + x, 106 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 11);
        g2d.fillRect(120 + x, 116 + y, 1, 2);
        g2d.fillRect(111 + x, 117 + y, 1, 11);
        g2d.fillRect(121 + x, 118 + y, 1, 10);
        g2d.fillRect(110 + x, 128 + y, 1, 6);
        g2d.fillRect(122 + x, 128 + y, 1, 8);
        g2d.fillRect(109 + x, 134 + y, 1, 7);
        g2d.fillRect(123 + x, 136 + y, 1, 10);
        g2d.fillRect(108 + x, 141 + y, 1, 3);
        g2d.fillRect(113 + x, 144 + y, 1, 1);
        g2d.fillRect(120 + x, 144 + y, 1, 3);
        g2d.fillRect(111 + x, 145 + y, 1, 2);
        g2d.fillRect(112 + x, 145 + y, 1, 1);
        g2d.fillRect(121 + x, 145 + y, 1, 2);
        g2d.fillRect(122 + x, 145 + y, 1, 1);
        g2d.fillRect(113 + x, 146 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 9);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 8);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 1);
        g2d.fillRect(114 + x, 99 + y, 1, 16);
        g2d.fillRect(117 + x, 99 + y, 1, 2);
        g2d.fillRect(118 + x, 101 + y, 1, 2);
        g2d.fillRect(119 + x, 103 + y, 1, 2);
        g2d.fillRect(115 + x, 105 + y, 1, 4);
        g2d.fillRect(117 + x, 106 + y, 3, 1);
        g2d.fillRect(119 + x, 107 + y, 1, 9);
        g2d.fillRect(113 + x, 108 + y, 1, 13);
        g2d.fillRect(118 + x, 111 + y, 1, 3);
        g2d.fillRect(120 + x, 114 + y, 1, 2);
        g2d.fillRect(112 + x, 118 + y, 1, 8);
        g2d.fillRect(119 + x, 118 + y, 1, 5);
        g2d.fillRect(120 + x, 118 + y, 1, 8);
        g2d.fillRect(118 + x, 123 + y, 1, 2);
        g2d.fillRect(117 + x, 126 + y, 1, 1);
        g2d.fillRect(111 + x, 128 + y, 1, 5);
        g2d.fillRect(121 + x, 128 + y, 1, 6);
        g2d.fillRect(116 + x, 131 + y, 1, 1);
        g2d.fillRect(115 + x, 133 + y, 1, 3);
        g2d.fillRect(110 + x, 134 + y, 1, 7);
        g2d.fillRect(114 + x, 136 + y, 1, 10);
        g2d.fillRect(122 + x, 136 + y, 1, 9);
        g2d.fillRect(120 + x, 137 + y, 1, 7);
        g2d.fillRect(109 + x, 141 + y, 1, 4);
        g2d.fillRect(113 + x, 141 + y, 1, 3);
        g2d.fillRect(110 + x, 144 + y, 3, 1);
        g2d.fillRect(121 + x, 144 + y, 1, 1);
        g2d.fillRect(113 + x, 145 + y, 1, 1);
        g2d.fillRect(115 + x, 145 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 7);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 4);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 5);
        g2d.fillRect(118 + x, 96 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 2);
        g2d.fillRect(116 + x, 99 + y, 1, 32);
        g2d.fillRect(115 + x, 100 + y, 1, 5);
        g2d.fillRect(117 + x, 101 + y, 1, 5);
        g2d.fillRect(118 + x, 103 + y, 1, 3);
        g2d.fillRect(119 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 14);
        g2d.fillRect(118 + x, 107 + y, 1, 4);
        g2d.fillRect(115 + x, 109 + y, 1, 19);
        g2d.fillRect(118 + x, 114 + y, 1, 4);
        g2d.fillRect(114 + x, 115 + y, 1, 14);
        g2d.fillRect(119 + x, 116 + y, 1, 2);
        g2d.fillRect(113 + x, 121 + y, 1, 10);
        g2d.fillRect(118 + x, 121 + y, 1, 2);
        g2d.fillRect(119 + x, 123 + y, 1, 5);
        g2d.fillRect(117 + x, 124 + y, 1, 2);
        g2d.fillRect(118 + x, 125 + y, 1, 21);
        g2d.fillRect(112 + x, 126 + y, 1, 8);
        g2d.fillRect(120 + x, 126 + y, 1, 8);
        g2d.fillRect(117 + x, 127 + y, 1, 6);
        g2d.fillRect(115 + x, 129 + y, 1, 4);
        g2d.fillRect(114 + x, 131 + y, 1, 5);
        g2d.fillRect(116 + x, 132 + y, 1, 9);
        g2d.fillRect(111 + x, 133 + y, 1, 4);
        g2d.fillRect(121 + x, 134 + y, 1, 10);
        g2d.fillRect(113 + x, 135 + y, 1, 6);
        g2d.fillRect(115 + x, 136 + y, 1, 6);
        g2d.fillRect(120 + x, 136 + y, 1, 1);
        g2d.fillRect(110 + x, 141 + y, 1, 3);
        g2d.fillRect(112 + x, 141 + y, 1, 3);
        g2d.fillRect(119 + x, 141 + y, 1, 5);
        g2d.fillRect(111 + x, 143 + y, 1, 1);
        g2d.fillRect(115 + x, 143 + y, 1, 2);
        g2d.fillRect(116 + x, 143 + y, 1, 2);
        g2d.fillRect(117 + x, 144 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 3);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 2);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 118 + y, 1, 3);
        g2d.fillRect(117 + x, 121 + y, 1, 3);
        g2d.fillRect(115 + x, 128 + y, 1, 1);
        g2d.fillRect(119 + x, 128 + y, 1, 3);
        g2d.fillRect(114 + x, 129 + y, 1, 2);
        g2d.fillRect(113 + x, 131 + y, 1, 4);
        g2d.fillRect(117 + x, 133 + y, 1, 3);
        g2d.fillRect(112 + x, 134 + y, 1, 7);
        g2d.fillRect(120 + x, 134 + y, 1, 2);
        g2d.fillRect(119 + x, 135 + y, 1, 6);
        g2d.fillRect(111 + x, 137 + y, 1, 6);
        g2d.fillRect(116 + x, 141 + y, 1, 2);
        g2d.fillRect(117 + x, 141 + y, 1, 3);
        g2d.fillRect(115 + x, 142 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(119 + x, 131 + y, 1, 4);
        g2d.fillRect(117 + x, 136 + y, 1, 5);
    }





    public void paint7a(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(112 + x, 104 + y, 1, 4);
        g2d.fillRect(124 + x, 142 + y, 1, 1);
        g2d.fillRect(124 + x, 144 + y, 1, 2);
        g2d.fillRect(123 + x, 145 + y, 1, 1);
        g2d.fillRect(121 + x, 146 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 87 + y, 1, 10);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 95 + y, 1, 2);
        g2d.fillRect(112 + x, 97 + y, 1, 7);
        g2d.fillRect(120 + x, 97 + y, 1, 2);
        g2d.fillRect(119 + x, 99 + y, 1, 4);
        g2d.fillRect(120 + x, 103 + y, 1, 10);
        g2d.fillRect(113 + x, 106 + y, 1, 1);
        g2d.fillRect(119 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 108 + y, 1, 3);
        g2d.fillRect(113 + x, 110 + y, 1, 15);
        g2d.fillRect(121 + x, 113 + y, 1, 8);
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(120 + x, 115 + y, 1, 1);
        g2d.fillRect(122 + x, 121 + y, 1, 5);
        g2d.fillRect(112 + x, 125 + y, 1, 3);
        g2d.fillRect(123 + x, 125 + y, 1, 13);
        g2d.fillRect(111 + x, 128 + y, 1, 6);
        g2d.fillRect(110 + x, 134 + y, 1, 6);
        g2d.fillRect(124 + x, 138 + y, 1, 4);
        g2d.fillRect(109 + x, 139 + y, 1, 7);
        g2d.fillRect(124 + x, 143 + y, 1, 1);
        g2d.fillRect(113 + x, 144 + y, 1, 3);
        g2d.fillRect(123 + x, 144 + y, 1, 1);
        g2d.fillRect(110 + x, 145 + y, 3, 1);
        g2d.fillRect(122 + x, 145 + y, 1, 1);
        g2d.fillRect(112 + x, 146 + y, 1, 1);
        g2d.fillRect(114 + x, 146 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 8);
        g2d.fillRect(113 + x, 90 + y, 2, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 4);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 2);
        g2d.fillRect(113 + x, 99 + y, 1, 7);
        g2d.fillRect(118 + x, 99 + y, 1, 12);
        g2d.fillRect(117 + x, 102 + y, 1, 2);
        g2d.fillRect(119 + x, 103 + y, 1, 4);
        g2d.fillRect(114 + x, 105 + y, 1, 9);
        g2d.fillRect(115 + x, 106 + y, 2, 1);
        g2d.fillRect(113 + x, 107 + y, 1, 3);
        g2d.fillRect(117 + x, 107 + y, 1, 2);
        g2d.fillRect(119 + x, 108 + y, 1, 16);
        g2d.fillRect(120 + x, 113 + y, 1, 2);
        g2d.fillRect(115 + x, 114 + y, 1, 1);
        g2d.fillRect(114 + x, 115 + y, 1, 12);
        g2d.fillRect(120 + x, 116 + y, 1, 5);
        g2d.fillRect(121 + x, 121 + y, 1, 10);
        g2d.fillRect(113 + x, 125 + y, 1, 6);
        g2d.fillRect(118 + x, 125 + y, 1, 1);
        g2d.fillRect(122 + x, 126 + y, 1, 19);
        g2d.fillRect(112 + x, 128 + y, 1, 6);
        g2d.fillRect(120 + x, 131 + y, 1, 4);
        g2d.fillRect(111 + x, 134 + y, 1, 11);
        g2d.fillRect(114 + x, 134 + y, 1, 1);
        g2d.fillRect(119 + x, 135 + y, 1, 5);
        g2d.fillRect(114 + x, 136 + y, 1, 10);
        g2d.fillRect(123 + x, 138 + y, 1, 6);
        g2d.fillRect(110 + x, 140 + y, 1, 5);
        g2d.fillRect(118 + x, 141 + y, 1, 1);
        g2d.fillRect(113 + x, 142 + y, 1, 2);
        g2d.fillRect(117 + x, 142 + y, 1, 1);
        g2d.fillRect(121 + x, 143 + y, 1, 2);
        g2d.fillRect(112 + x, 144 + y, 1, 1);
        g2d.fillRect(119 + x, 144 + y, 2, 1);
        g2d.fillRect(115 + x, 145 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 7);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 5);
        g2d.fillRect(114 + x, 95 + y, 1, 10);
        g2d.fillRect(118 + x, 96 + y, 1, 3);
        g2d.fillRect(113 + x, 97 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 5);
        g2d.fillRect(115 + x, 100 + y, 1, 6);
        g2d.fillRect(116 + x, 101 + y, 1, 5);
        g2d.fillRect(117 + x, 104 + y, 1, 3);
        g2d.fillRect(115 + x, 107 + y, 1, 7);
        g2d.fillRect(116 + x, 107 + y, 1, 22);
        g2d.fillRect(117 + x, 109 + y, 1, 14);
        g2d.fillRect(118 + x, 111 + y, 1, 7);
        g2d.fillRect(115 + x, 115 + y, 1, 10);
        g2d.fillRect(120 + x, 121 + y, 1, 10);
        g2d.fillRect(118 + x, 124 + y, 2, 1);
        g2d.fillRect(119 + x, 125 + y, 1, 1);
        g2d.fillRect(118 + x, 126 + y, 1, 4);
        g2d.fillRect(114 + x, 127 + y, 1, 4);
        g2d.fillRect(117 + x, 127 + y, 1, 4);
        g2d.fillRect(116 + x, 130 + y, 1, 2);
        g2d.fillRect(113 + x, 131 + y, 1, 3);
        g2d.fillRect(115 + x, 131 + y, 1, 10);
        g2d.fillRect(119 + x, 131 + y, 1, 4);
        g2d.fillRect(121 + x, 131 + y, 1, 12);
        g2d.fillRect(116 + x, 133 + y, 1, 3);
        g2d.fillRect(117 + x, 133 + y, 1, 2);
        g2d.fillRect(112 + x, 134 + y, 1, 10);
        g2d.fillRect(114 + x, 135 + y, 1, 1);
        g2d.fillRect(120 + x, 135 + y, 1, 9);
        g2d.fillRect(113 + x, 136 + y, 1, 6);
        g2d.fillRect(118 + x, 136 + y, 1, 5);
        g2d.fillRect(117 + x, 138 + y, 1, 4);
        g2d.fillRect(116 + x, 140 + y, 1, 5);
        g2d.fillRect(119 + x, 140 + y, 1, 4);
        g2d.fillRect(115 + x, 142 + y, 1, 3);
        g2d.fillRect(118 + x, 142 + y, 1, 3);
        g2d.fillRect(117 + x, 143 + y, 1, 2);
        g2d.fillRect(119 + x, 145 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 3);
        g2d.fillRect(118 + x, 92 + y, 1, 4);
        g2d.fillRect(116 + x, 93 + y, 1, 8);
        g2d.fillRect(117 + x, 95 + y, 1, 2);
        g2d.fillRect(115 + x, 97 + y, 1, 3);
        g2d.fillRect(118 + x, 118 + y, 1, 3);
        g2d.fillRect(118 + x, 122 + y, 1, 2);
        g2d.fillRect(117 + x, 124 + y, 1, 3);
        g2d.fillRect(115 + x, 125 + y, 1, 6);
        g2d.fillRect(119 + x, 126 + y, 1, 5);
        g2d.fillRect(116 + x, 129 + y, 1, 1);
        g2d.fillRect(118 + x, 130 + y, 1, 1);
        g2d.fillRect(114 + x, 131 + y, 1, 3);
        g2d.fillRect(117 + x, 131 + y, 1, 2);
        g2d.fillRect(116 + x, 132 + y, 1, 1);
        g2d.fillRect(113 + x, 134 + y, 1, 2);
        g2d.fillRect(118 + x, 134 + y, 1, 2);
        g2d.fillRect(117 + x, 135 + y, 1, 3);
        g2d.fillRect(116 + x, 136 + y, 1, 4);
        g2d.fillRect(115 + x, 141 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(118 + x, 121 + y, 1, 1);
        g2d.fillRect(117 + x, 123 + y, 1, 1);
        g2d.fillRect(118 + x, 131 + y, 1, 3);
    }





    public void paintTop(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 87 + y, 2, 1);
        g2d.fillRect(120 + x, 87 + y, 2, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 2, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 82 + y, 2, 1);
        g2d.fillRect(118 + x, 82 + y, 3, 1);
        g2d.fillRect(103 + x, 83 + y, 4, 1);
        g2d.fillRect(114 + x, 83 + y, 4, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 7, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 3);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 2, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 5);
        g2d.fillRect(103 + x, 88 + y, 4, 1);
        g2d.fillRect(114 + x, 88 + y, 4, 1);
        g2d.fillRect(107 + x, 89 + y, 7, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 2);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 83 + y, 1, 4);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 2, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(114 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 3, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 5);
        g2d.fillRect(107 + x, 88 + y, 2, 1);
        g2d.fillRect(112 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 4);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 4);
        g2d.fillRect(108 + x, 90 + y, 1, 3);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 84 + y, 1, 3);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 2, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 3);
        g2d.fillRect(110 + x, 85 + y, 1, 3);
        g2d.fillRect(111 + x, 85 + y, 1, 3);
        g2d.fillRect(114 + x, 85 + y, 1, 3);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 2);
        g2d.fillRect(113 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 4);
        g2d.fillRect(104 + x, 89 + y, 1, 3);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(116 + x, 89 + y, 4, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 3);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 85 + y, 2, 1);
        g2d.fillRect(103 + x, 86 + y, 3, 1);
        g2d.fillRect(115 + x, 86 + y, 2, 1);
        g2d.fillRect(109 + x, 88 + y, 2, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 3);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
    }





    public void paintBack1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 103 + y, 1, 2);
        g2d.fillRect(97 + x, 107 + y, 1, 1);
        g2d.fillRect(106 + x, 116 + y, 1, 4);
        g2d.fillRect(105 + x, 117 + y, 1, 2);
        g2d.fillRect(105 + x, 120 + y, 1, 2);
        g2d.fillRect(110 + x, 160 + y, 1, 2);
        g2d.fillRect(108 + x, 161 + y, 2, 1);
        g2d.fillRect(106 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 89 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 1, 3);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 8);
        g2d.fillRect(95 + x, 94 + y, 1, 8);
        g2d.fillRect(104 + x, 102 + y, 1, 10);
        g2d.fillRect(96 + x, 102 + y, 1, 1);
        g2d.fillRect(97 + x, 103 + y, 1, 4);
        g2d.fillRect(103 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 4);
        g2d.fillRect(99 + x, 111 + y, 1, 4);
        g2d.fillRect(105 + x, 112 + y, 1, 5);
        g2d.fillRect(98 + x, 115 + y, 1, 13);
        g2d.fillRect(105 + x, 119 + y, 1, 1);
        g2d.fillRect(106 + x, 120 + y, 1, 12);
        g2d.fillRect(98 + x, 130 + y, 1, 2);
        g2d.fillRect(107 + x, 131 + y, 1, 12);
        g2d.fillRect(97 + x, 132 + y, 1, 11);
        g2d.fillRect(108 + x, 143 + y, 1, 7);
        g2d.fillRect(96 + x, 143 + y, 1, 9);
        g2d.fillRect(109 + x, 150 + y, 1, 7);
        g2d.fillRect(95 + x, 152 + y, 1, 10);
        g2d.fillRect(110 + x, 157 + y, 1, 3);
        g2d.fillRect(105 + x, 160 + y, 1, 1);
        g2d.fillRect(98 + x, 160 + y, 1, 3);
        g2d.fillRect(107 + x, 161 + y, 1, 2);
        g2d.fillRect(106 + x, 161 + y, 1, 1);
        g2d.fillRect(97 + x, 161 + y, 1, 2);
        g2d.fillRect(96 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 162 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 5);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 5);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 2, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 8);
        g2d.fillRect(96 + x, 94 + y, 1, 8);
        g2d.fillRect(103 + x, 102 + y, 1, 4);
        g2d.fillRect(97 + x, 102 + y, 1, 1);
        g2d.fillRect(98 + x, 106 + y, 1, 1);
        g2d.fillRect(103 + x, 107 + y, 1, 5);
        g2d.fillRect(99 + x, 107 + y, 1, 4);
        g2d.fillRect(100 + x, 111 + y, 1, 4);
        g2d.fillRect(104 + x, 112 + y, 1, 17);
        g2d.fillRect(99 + x, 115 + y, 1, 2);
        g2d.fillRect(103 + x, 118 + y, 1, 5);
        g2d.fillRect(99 + x, 119 + y, 3, 1);
        g2d.fillRect(99 + x, 120 + y, 1, 10);
        g2d.fillRect(105 + x, 122 + y, 1, 13);
        g2d.fillRect(100 + x, 125 + y, 1, 3);
        g2d.fillRect(98 + x, 128 + y, 1, 2);
        g2d.fillRect(106 + x, 132 + y, 1, 9);
        g2d.fillRect(99 + x, 132 + y, 1, 5);
        g2d.fillRect(98 + x, 132 + y, 1, 9);
        g2d.fillRect(100 + x, 137 + y, 1, 3);
        g2d.fillRect(101 + x, 141 + y, 1, 1);
        g2d.fillRect(107 + x, 143 + y, 1, 6);
        g2d.fillRect(97 + x, 143 + y, 1, 7);
        g2d.fillRect(102 + x, 147 + y, 1, 1);
        g2d.fillRect(103 + x, 149 + y, 1, 3);
        g2d.fillRect(108 + x, 150 + y, 1, 7);
        g2d.fillRect(104 + x, 152 + y, 1, 10);
        g2d.fillRect(96 + x, 152 + y, 1, 9);
        g2d.fillRect(98 + x, 153 + y, 1, 7);
        g2d.fillRect(109 + x, 157 + y, 1, 4);
        g2d.fillRect(105 + x, 157 + y, 1, 3);
        g2d.fillRect(106 + x, 160 + y, 3, 1);
        g2d.fillRect(97 + x, 160 + y, 1, 1);
        g2d.fillRect(105 + x, 161 + y, 1, 1);
        g2d.fillRect(101 + x, 161 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 90 + y, 1, 4);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 2, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 13);
        g2d.fillRect(100 + x, 94 + y, 1, 8);
        g2d.fillRect(97 + x, 94 + y, 1, 8);
        g2d.fillRect(98 + x, 101 + y, 1, 5);
        g2d.fillRect(102 + x, 102 + y, 1, 45);
        g2d.fillRect(99 + x, 102 + y, 1, 5);
        g2d.fillRect(100 + x, 107 + y, 1, 4);
        g2d.fillRect(101 + x, 109 + y, 1, 1);
        g2d.fillRect(101 + x, 111 + y, 1, 8);
        g2d.fillRect(103 + x, 112 + y, 1, 6);
        g2d.fillRect(100 + x, 115 + y, 1, 4);
        g2d.fillRect(99 + x, 117 + y, 1, 2);
        g2d.fillRect(101 + x, 120 + y, 1, 15);
        g2d.fillRect(100 + x, 120 + y, 1, 5);
        g2d.fillRect(103 + x, 123 + y, 1, 20);
        g2d.fillRect(100 + x, 128 + y, 1, 4);
        g2d.fillRect(104 + x, 129 + y, 1, 15);
        g2d.fillRect(99 + x, 130 + y, 1, 2);
        g2d.fillRect(105 + x, 135 + y, 1, 12);
        g2d.fillRect(100 + x, 135 + y, 1, 2);
        g2d.fillRect(99 + x, 137 + y, 1, 6);
        g2d.fillRect(101 + x, 138 + y, 1, 3);
        g2d.fillRect(100 + x, 140 + y, 1, 22);
        g2d.fillRect(106 + x, 141 + y, 1, 9);
        g2d.fillRect(98 + x, 141 + y, 1, 9);
        g2d.fillRect(101 + x, 142 + y, 1, 7);
        g2d.fillRect(103 + x, 144 + y, 1, 5);
        g2d.fillRect(104 + x, 147 + y, 1, 5);
        g2d.fillRect(102 + x, 148 + y, 1, 9);
        g2d.fillRect(107 + x, 149 + y, 1, 4);
        g2d.fillRect(97 + x, 150 + y, 1, 10);
        g2d.fillRect(105 + x, 151 + y, 1, 6);
        g2d.fillRect(103 + x, 152 + y, 1, 6);
        g2d.fillRect(98 + x, 152 + y, 1, 1);
        g2d.fillRect(108 + x, 157 + y, 1, 3);
        g2d.fillRect(106 + x, 157 + y, 1, 3);
        g2d.fillRect(99 + x, 157 + y, 1, 5);
        g2d.fillRect(107 + x, 159 + y, 1, 1);
        g2d.fillRect(103 + x, 159 + y, 1, 2);
        g2d.fillRect(102 + x, 159 + y, 1, 2);
        g2d.fillRect(101 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 7);
        g2d.fillRect(99 + x, 95 + y, 1, 2);
        g2d.fillRect(99 + x, 101 + y, 1, 1);
        g2d.fillRect(100 + x, 102 + y, 1, 5);
        g2d.fillRect(101 + x, 107 + y, 1, 2);
        g2d.fillRect(101 + x, 110 + y, 1, 1);
        g2d.fillRect(100 + x, 132 + y, 1, 3);
        g2d.fillRect(101 + x, 135 + y, 1, 3);
        g2d.fillRect(103 + x, 143 + y, 1, 1);
        g2d.fillRect(99 + x, 143 + y, 1, 4);
        g2d.fillRect(104 + x, 144 + y, 1, 3);
        g2d.fillRect(105 + x, 147 + y, 1, 4);
        g2d.fillRect(101 + x, 149 + y, 1, 3);
        g2d.fillRect(106 + x, 150 + y, 1, 7);
        g2d.fillRect(98 + x, 150 + y, 1, 2);
        g2d.fillRect(99 + x, 151 + y, 1, 6);
        g2d.fillRect(107 + x, 153 + y, 1, 6);
        g2d.fillRect(102 + x, 157 + y, 1, 2);
        g2d.fillRect(101 + x, 157 + y, 1, 3);
        g2d.fillRect(103 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 97 + y, 1, 4);
        g2d.fillRect(99 + x, 147 + y, 1, 4);
        g2d.fillRect(101 + x, 152 + y, 1, 5);
    }





    public void paintBack2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(95 + x, 103 + y, 1, 2);
        g2d.fillRect(96 + x, 107 + y, 1, 1);
        g2d.fillRect(105 + x, 116 + y, 1, 4);
        g2d.fillRect(104 + x, 117 + y, 1, 2);
        g2d.fillRect(104 + x, 120 + y, 1, 2);
        g2d.fillRect(109 + x, 160 + y, 1, 2);
        g2d.fillRect(107 + x, 161 + y, 2, 1);
        g2d.fillRect(105 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 89 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 1, 11);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 8);
        g2d.fillRect(103 + x, 102 + y, 1, 10);
        g2d.fillRect(95 + x, 102 + y, 1, 1);
        g2d.fillRect(96 + x, 103 + y, 1, 4);
        g2d.fillRect(102 + x, 106 + y, 1, 1);
        g2d.fillRect(97 + x, 107 + y, 1, 4);
        g2d.fillRect(98 + x, 111 + y, 1, 4);
        g2d.fillRect(104 + x, 112 + y, 1, 5);
        g2d.fillRect(97 + x, 115 + y, 1, 13);
        g2d.fillRect(104 + x, 119 + y, 1, 1);
        g2d.fillRect(105 + x, 120 + y, 1, 12);
        g2d.fillRect(97 + x, 130 + y, 1, 2);
        g2d.fillRect(106 + x, 131 + y, 1, 12);
        g2d.fillRect(96 + x, 132 + y, 1, 11);
        g2d.fillRect(107 + x, 143 + y, 1, 7);
        g2d.fillRect(95 + x, 143 + y, 1, 9);
        g2d.fillRect(108 + x, 150 + y, 1, 7);
        g2d.fillRect(94 + x, 152 + y, 1, 10);
        g2d.fillRect(109 + x, 157 + y, 1, 3);
        g2d.fillRect(104 + x, 160 + y, 1, 1);
        g2d.fillRect(97 + x, 160 + y, 1, 3);
        g2d.fillRect(106 + x, 161 + y, 1, 2);
        g2d.fillRect(105 + x, 161 + y, 1, 1);
        g2d.fillRect(96 + x, 161 + y, 1, 2);
        g2d.fillRect(95 + x, 161 + y, 1, 1);
        g2d.fillRect(98 + x, 162 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 13);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 13);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 2, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 4);
        g2d.fillRect(96 + x, 102 + y, 1, 1);
        g2d.fillRect(97 + x, 106 + y, 1, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 5);
        g2d.fillRect(98 + x, 107 + y, 1, 4);
        g2d.fillRect(99 + x, 111 + y, 1, 4);
        g2d.fillRect(103 + x, 112 + y, 1, 17);
        g2d.fillRect(98 + x, 115 + y, 1, 2);
        g2d.fillRect(102 + x, 118 + y, 1, 5);
        g2d.fillRect(98 + x, 119 + y, 3, 1);
        g2d.fillRect(98 + x, 120 + y, 1, 10);
        g2d.fillRect(104 + x, 122 + y, 1, 13);
        g2d.fillRect(99 + x, 125 + y, 1, 3);
        g2d.fillRect(97 + x, 128 + y, 1, 2);
        g2d.fillRect(105 + x, 132 + y, 1, 9);
        g2d.fillRect(98 + x, 132 + y, 1, 5);
        g2d.fillRect(97 + x, 132 + y, 1, 9);
        g2d.fillRect(99 + x, 137 + y, 1, 3);
        g2d.fillRect(100 + x, 141 + y, 1, 1);
        g2d.fillRect(106 + x, 143 + y, 1, 6);
        g2d.fillRect(96 + x, 143 + y, 1, 7);
        g2d.fillRect(101 + x, 147 + y, 1, 1);
        g2d.fillRect(102 + x, 149 + y, 1, 3);
        g2d.fillRect(107 + x, 150 + y, 1, 7);
        g2d.fillRect(103 + x, 152 + y, 1, 10);
        g2d.fillRect(95 + x, 152 + y, 1, 9);
        g2d.fillRect(97 + x, 153 + y, 1, 7);
        g2d.fillRect(108 + x, 157 + y, 1, 4);
        g2d.fillRect(104 + x, 157 + y, 1, 3);
        g2d.fillRect(105 + x, 160 + y, 3, 1);
        g2d.fillRect(96 + x, 160 + y, 1, 1);
        g2d.fillRect(104 + x, 161 + y, 1, 1);
        g2d.fillRect(100 + x, 161 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 90 + y, 1, 12);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 2, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 9);
        g2d.fillRect(98 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 94 + y, 1, 13);
        g2d.fillRect(97 + x, 101 + y, 1, 5);
        g2d.fillRect(101 + x, 102 + y, 1, 45);
        g2d.fillRect(98 + x, 102 + y, 1, 5);
        g2d.fillRect(99 + x, 107 + y, 1, 4);
        g2d.fillRect(100 + x, 109 + y, 1, 1);
        g2d.fillRect(100 + x, 111 + y, 1, 8);
        g2d.fillRect(102 + x, 112 + y, 1, 6);
        g2d.fillRect(99 + x, 115 + y, 1, 4);
        g2d.fillRect(98 + x, 117 + y, 1, 2);
        g2d.fillRect(100 + x, 120 + y, 1, 15);
        g2d.fillRect(99 + x, 120 + y, 1, 5);
        g2d.fillRect(102 + x, 123 + y, 1, 20);
        g2d.fillRect(99 + x, 128 + y, 1, 4);
        g2d.fillRect(103 + x, 129 + y, 1, 15);
        g2d.fillRect(98 + x, 130 + y, 1, 2);
        g2d.fillRect(104 + x, 135 + y, 1, 12);
        g2d.fillRect(99 + x, 135 + y, 1, 2);
        g2d.fillRect(98 + x, 137 + y, 1, 6);
        g2d.fillRect(100 + x, 138 + y, 1, 3);
        g2d.fillRect(99 + x, 140 + y, 1, 22);
        g2d.fillRect(105 + x, 141 + y, 1, 9);
        g2d.fillRect(97 + x, 141 + y, 1, 9);
        g2d.fillRect(100 + x, 142 + y, 1, 7);
        g2d.fillRect(102 + x, 144 + y, 1, 5);
        g2d.fillRect(103 + x, 147 + y, 1, 5);
        g2d.fillRect(101 + x, 148 + y, 1, 9);
        g2d.fillRect(106 + x, 149 + y, 1, 4);
        g2d.fillRect(96 + x, 150 + y, 1, 10);
        g2d.fillRect(104 + x, 151 + y, 1, 6);
        g2d.fillRect(102 + x, 152 + y, 1, 6);
        g2d.fillRect(97 + x, 152 + y, 1, 1);
        g2d.fillRect(107 + x, 157 + y, 1, 3);
        g2d.fillRect(105 + x, 157 + y, 1, 3);
        g2d.fillRect(98 + x, 157 + y, 1, 5);
        g2d.fillRect(106 + x, 159 + y, 1, 1);
        g2d.fillRect(102 + x, 159 + y, 1, 2);
        g2d.fillRect(101 + x, 159 + y, 1, 2);
        g2d.fillRect(100 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 8);
        g2d.fillRect(98 + x, 95 + y, 1, 2);
        g2d.fillRect(98 + x, 101 + y, 1, 1);
        g2d.fillRect(99 + x, 102 + y, 1, 5);
        g2d.fillRect(100 + x, 107 + y, 1, 2);
        g2d.fillRect(100 + x, 110 + y, 1, 1);
        g2d.fillRect(99 + x, 132 + y, 1, 3);
        g2d.fillRect(100 + x, 135 + y, 1, 3);
        g2d.fillRect(102 + x, 143 + y, 1, 1);
        g2d.fillRect(98 + x, 143 + y, 1, 4);
        g2d.fillRect(103 + x, 144 + y, 1, 3);
        g2d.fillRect(104 + x, 147 + y, 1, 4);
        g2d.fillRect(100 + x, 149 + y, 1, 3);
        g2d.fillRect(105 + x, 150 + y, 1, 7);
        g2d.fillRect(97 + x, 150 + y, 1, 2);
        g2d.fillRect(98 + x, 151 + y, 1, 6);
        g2d.fillRect(106 + x, 153 + y, 1, 6);
        g2d.fillRect(101 + x, 157 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 1, 3);
        g2d.fillRect(102 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 97 + y, 1, 4);
        g2d.fillRect(98 + x, 147 + y, 1, 4);
        g2d.fillRect(100 + x, 152 + y, 1, 5);
    }





    public void paintBack3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(94 + x, 103 + y, 1, 2);
        g2d.fillRect(95 + x, 107 + y, 1, 1);
        g2d.fillRect(104 + x, 116 + y, 1, 4);
        g2d.fillRect(103 + x, 117 + y, 1, 2);
        g2d.fillRect(103 + x, 120 + y, 1, 2);
        g2d.fillRect(108 + x, 160 + y, 1, 2);
        g2d.fillRect(106 + x, 161 + y, 2, 1);
        g2d.fillRect(104 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 89 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 1, 12);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 18);
        g2d.fillRect(95 + x, 103 + y, 1, 4);
        g2d.fillRect(101 + x, 106 + y, 1, 1);
        g2d.fillRect(96 + x, 107 + y, 1, 4);
        g2d.fillRect(97 + x, 111 + y, 1, 4);
        g2d.fillRect(103 + x, 112 + y, 1, 5);
        g2d.fillRect(96 + x, 115 + y, 1, 13);
        g2d.fillRect(103 + x, 119 + y, 1, 1);
        g2d.fillRect(104 + x, 120 + y, 1, 12);
        g2d.fillRect(96 + x, 130 + y, 1, 2);
        g2d.fillRect(105 + x, 131 + y, 1, 12);
        g2d.fillRect(95 + x, 132 + y, 1, 11);
        g2d.fillRect(106 + x, 143 + y, 1, 7);
        g2d.fillRect(94 + x, 143 + y, 1, 9);
        g2d.fillRect(107 + x, 150 + y, 1, 7);
        g2d.fillRect(93 + x, 152 + y, 1, 10);
        g2d.fillRect(108 + x, 157 + y, 1, 3);
        g2d.fillRect(103 + x, 160 + y, 1, 1);
        g2d.fillRect(96 + x, 160 + y, 1, 3);
        g2d.fillRect(105 + x, 161 + y, 1, 2);
        g2d.fillRect(104 + x, 161 + y, 1, 1);
        g2d.fillRect(95 + x, 161 + y, 1, 2);
        g2d.fillRect(94 + x, 161 + y, 1, 1);
        g2d.fillRect(97 + x, 162 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 17);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 14);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 2, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 106 + y, 1, 1);
        g2d.fillRect(101 + x, 107 + y, 1, 5);
        g2d.fillRect(97 + x, 107 + y, 1, 4);
        g2d.fillRect(98 + x, 111 + y, 1, 4);
        g2d.fillRect(102 + x, 112 + y, 1, 17);
        g2d.fillRect(97 + x, 115 + y, 1, 2);
        g2d.fillRect(101 + x, 118 + y, 1, 5);
        g2d.fillRect(97 + x, 119 + y, 3, 1);
        g2d.fillRect(97 + x, 120 + y, 1, 10);
        g2d.fillRect(103 + x, 122 + y, 1, 13);
        g2d.fillRect(98 + x, 125 + y, 1, 3);
        g2d.fillRect(96 + x, 128 + y, 1, 2);
        g2d.fillRect(104 + x, 132 + y, 1, 9);
        g2d.fillRect(97 + x, 132 + y, 1, 5);
        g2d.fillRect(96 + x, 132 + y, 1, 9);
        g2d.fillRect(98 + x, 137 + y, 1, 3);
        g2d.fillRect(99 + x, 141 + y, 1, 1);
        g2d.fillRect(105 + x, 143 + y, 1, 6);
        g2d.fillRect(95 + x, 143 + y, 1, 7);
        g2d.fillRect(100 + x, 147 + y, 1, 1);
        g2d.fillRect(101 + x, 149 + y, 1, 3);
        g2d.fillRect(106 + x, 150 + y, 1, 7);
        g2d.fillRect(102 + x, 152 + y, 1, 10);
        g2d.fillRect(94 + x, 152 + y, 1, 9);
        g2d.fillRect(96 + x, 153 + y, 1, 7);
        g2d.fillRect(107 + x, 157 + y, 1, 4);
        g2d.fillRect(103 + x, 157 + y, 1, 3);
        g2d.fillRect(104 + x, 160 + y, 3, 1);
        g2d.fillRect(95 + x, 160 + y, 1, 1);
        g2d.fillRect(103 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 161 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 90 + y, 1, 16);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 2, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 14);
        g2d.fillRect(98 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 94 + y, 1, 53);
        g2d.fillRect(97 + x, 101 + y, 1, 6);
        g2d.fillRect(98 + x, 107 + y, 1, 4);
        g2d.fillRect(99 + x, 109 + y, 1, 1);
        g2d.fillRect(99 + x, 111 + y, 1, 8);
        g2d.fillRect(101 + x, 112 + y, 1, 6);
        g2d.fillRect(98 + x, 115 + y, 1, 4);
        g2d.fillRect(97 + x, 117 + y, 1, 2);
        g2d.fillRect(99 + x, 120 + y, 1, 15);
        g2d.fillRect(98 + x, 120 + y, 1, 5);
        g2d.fillRect(101 + x, 123 + y, 1, 20);
        g2d.fillRect(98 + x, 128 + y, 1, 4);
        g2d.fillRect(102 + x, 129 + y, 1, 15);
        g2d.fillRect(97 + x, 130 + y, 1, 2);
        g2d.fillRect(103 + x, 135 + y, 1, 12);
        g2d.fillRect(98 + x, 135 + y, 1, 2);
        g2d.fillRect(97 + x, 137 + y, 1, 6);
        g2d.fillRect(99 + x, 138 + y, 1, 3);
        g2d.fillRect(98 + x, 140 + y, 1, 22);
        g2d.fillRect(104 + x, 141 + y, 1, 9);
        g2d.fillRect(96 + x, 141 + y, 1, 9);
        g2d.fillRect(99 + x, 142 + y, 1, 7);
        g2d.fillRect(101 + x, 144 + y, 1, 5);
        g2d.fillRect(102 + x, 147 + y, 1, 5);
        g2d.fillRect(100 + x, 148 + y, 1, 9);
        g2d.fillRect(105 + x, 149 + y, 1, 4);
        g2d.fillRect(95 + x, 150 + y, 1, 10);
        g2d.fillRect(103 + x, 151 + y, 1, 6);
        g2d.fillRect(101 + x, 152 + y, 1, 6);
        g2d.fillRect(96 + x, 152 + y, 1, 1);
        g2d.fillRect(106 + x, 157 + y, 1, 3);
        g2d.fillRect(104 + x, 157 + y, 1, 3);
        g2d.fillRect(97 + x, 157 + y, 1, 5);
        g2d.fillRect(105 + x, 159 + y, 1, 1);
        g2d.fillRect(101 + x, 159 + y, 1, 2);
        g2d.fillRect(100 + x, 159 + y, 1, 2);
        g2d.fillRect(99 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 8);
        g2d.fillRect(98 + x, 95 + y, 1, 2);
        g2d.fillRect(98 + x, 101 + y, 1, 6);
        g2d.fillRect(99 + x, 107 + y, 1, 2);
        g2d.fillRect(99 + x, 110 + y, 1, 1);
        g2d.fillRect(98 + x, 132 + y, 1, 3);
        g2d.fillRect(99 + x, 135 + y, 1, 3);
        g2d.fillRect(101 + x, 143 + y, 1, 1);
        g2d.fillRect(97 + x, 143 + y, 1, 4);
        g2d.fillRect(102 + x, 144 + y, 1, 3);
        g2d.fillRect(103 + x, 147 + y, 1, 4);
        g2d.fillRect(99 + x, 149 + y, 1, 3);
        g2d.fillRect(104 + x, 150 + y, 1, 7);
        g2d.fillRect(96 + x, 150 + y, 1, 2);
        g2d.fillRect(97 + x, 151 + y, 1, 6);
        g2d.fillRect(105 + x, 153 + y, 1, 6);
        g2d.fillRect(100 + x, 157 + y, 1, 2);
        g2d.fillRect(99 + x, 157 + y, 1, 3);
        g2d.fillRect(101 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 97 + y, 1, 4);
        g2d.fillRect(97 + x, 147 + y, 1, 4);
        g2d.fillRect(99 + x, 152 + y, 1, 5);
    }





    public void paintBack4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(95 + x, 102 + y, 1, 2);
        g2d.fillRect(96 + x, 106 + y, 1, 1);
        g2d.fillRect(105 + x, 114 + y, 1, 4);
        g2d.fillRect(104 + x, 115 + y, 1, 2);
        g2d.fillRect(104 + x, 118 + y, 1, 2);
        g2d.fillRect(109 + x, 157 + y, 1, 2);
        g2d.fillRect(107 + x, 158 + y, 2, 1);
        g2d.fillRect(105 + x, 159 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 89 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 1, 10);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 7);
        g2d.fillRect(103 + x, 101 + y, 1, 10);
        g2d.fillRect(95 + x, 101 + y, 1, 1);
        g2d.fillRect(96 + x, 102 + y, 1, 4);
        g2d.fillRect(102 + x, 105 + y, 1, 1);
        g2d.fillRect(97 + x, 106 + y, 1, 4);
        g2d.fillRect(98 + x, 110 + y, 1, 3);
        g2d.fillRect(104 + x, 111 + y, 1, 4);
        g2d.fillRect(97 + x, 113 + y, 1, 13);
        g2d.fillRect(104 + x, 117 + y, 1, 1);
        g2d.fillRect(105 + x, 118 + y, 1, 12);
        g2d.fillRect(97 + x, 128 + y, 1, 2);
        g2d.fillRect(106 + x, 129 + y, 1, 12);
        g2d.fillRect(96 + x, 130 + y, 1, 11);
        g2d.fillRect(107 + x, 141 + y, 1, 6);
        g2d.fillRect(95 + x, 141 + y, 1, 8);
        g2d.fillRect(108 + x, 147 + y, 1, 7);
        g2d.fillRect(94 + x, 149 + y, 1, 10);
        g2d.fillRect(109 + x, 154 + y, 1, 3);
        g2d.fillRect(104 + x, 157 + y, 1, 1);
        g2d.fillRect(97 + x, 157 + y, 1, 3);
        g2d.fillRect(106 + x, 158 + y, 1, 2);
        g2d.fillRect(105 + x, 158 + y, 1, 1);
        g2d.fillRect(96 + x, 158 + y, 1, 2);
        g2d.fillRect(95 + x, 158 + y, 1, 1);
        g2d.fillRect(98 + x, 159 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 12);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 12);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 2, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 4);
        g2d.fillRect(96 + x, 101 + y, 1, 1);
        g2d.fillRect(97 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 106 + y, 1, 5);
        g2d.fillRect(98 + x, 106 + y, 1, 4);
        g2d.fillRect(99 + x, 110 + y, 1, 3);
        g2d.fillRect(103 + x, 111 + y, 1, 16);
        g2d.fillRect(98 + x, 113 + y, 1, 2);
        g2d.fillRect(102 + x, 116 + y, 1, 5);
        g2d.fillRect(98 + x, 117 + y, 3, 1);
        g2d.fillRect(98 + x, 118 + y, 1, 10);
        g2d.fillRect(104 + x, 120 + y, 1, 13);
        g2d.fillRect(99 + x, 123 + y, 1, 3);
        g2d.fillRect(97 + x, 126 + y, 1, 2);
        g2d.fillRect(105 + x, 130 + y, 1, 9);
        g2d.fillRect(98 + x, 130 + y, 1, 5);
        g2d.fillRect(97 + x, 130 + y, 1, 9);
        g2d.fillRect(99 + x, 135 + y, 1, 3);
        g2d.fillRect(100 + x, 139 + y, 1, 1);
        g2d.fillRect(106 + x, 141 + y, 1, 5);
        g2d.fillRect(96 + x, 141 + y, 1, 6);
        g2d.fillRect(101 + x, 144 + y, 1, 1);
        g2d.fillRect(102 + x, 146 + y, 1, 3);
        g2d.fillRect(107 + x, 147 + y, 1, 7);
        g2d.fillRect(103 + x, 149 + y, 1, 10);
        g2d.fillRect(95 + x, 149 + y, 1, 9);
        g2d.fillRect(97 + x, 150 + y, 1, 7);
        g2d.fillRect(108 + x, 154 + y, 1, 4);
        g2d.fillRect(104 + x, 154 + y, 1, 3);
        g2d.fillRect(105 + x, 157 + y, 3, 1);
        g2d.fillRect(96 + x, 157 + y, 1, 1);
        g2d.fillRect(104 + x, 158 + y, 1, 1);
        g2d.fillRect(100 + x, 158 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 90 + y, 1, 11);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 2, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 8);
        g2d.fillRect(98 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 94 + y, 1, 12);
        g2d.fillRect(97 + x, 100 + y, 1, 5);
        g2d.fillRect(101 + x, 101 + y, 1, 43);
        g2d.fillRect(98 + x, 101 + y, 1, 5);
        g2d.fillRect(99 + x, 106 + y, 1, 4);
        g2d.fillRect(100 + x, 108 + y, 1, 1);
        g2d.fillRect(100 + x, 110 + y, 1, 7);
        g2d.fillRect(102 + x, 111 + y, 1, 5);
        g2d.fillRect(99 + x, 113 + y, 1, 4);
        g2d.fillRect(98 + x, 115 + y, 1, 2);
        g2d.fillRect(100 + x, 118 + y, 1, 15);
        g2d.fillRect(99 + x, 118 + y, 1, 5);
        g2d.fillRect(102 + x, 121 + y, 1, 20);
        g2d.fillRect(99 + x, 126 + y, 1, 4);
        g2d.fillRect(103 + x, 127 + y, 1, 15);
        g2d.fillRect(98 + x, 128 + y, 1, 2);
        g2d.fillRect(104 + x, 133 + y, 1, 11);
        g2d.fillRect(99 + x, 133 + y, 1, 2);
        g2d.fillRect(98 + x, 135 + y, 1, 6);
        g2d.fillRect(100 + x, 136 + y, 1, 3);
        g2d.fillRect(99 + x, 138 + y, 1, 21);
        g2d.fillRect(105 + x, 139 + y, 1, 8);
        g2d.fillRect(97 + x, 139 + y, 1, 8);
        g2d.fillRect(100 + x, 140 + y, 1, 6);
        g2d.fillRect(102 + x, 142 + y, 1, 4);
        g2d.fillRect(103 + x, 144 + y, 1, 5);
        g2d.fillRect(101 + x, 145 + y, 1, 9);
        g2d.fillRect(106 + x, 146 + y, 1, 4);
        g2d.fillRect(96 + x, 147 + y, 1, 10);
        g2d.fillRect(104 + x, 148 + y, 1, 6);
        g2d.fillRect(102 + x, 149 + y, 1, 6);
        g2d.fillRect(97 + x, 149 + y, 1, 1);
        g2d.fillRect(107 + x, 154 + y, 1, 3);
        g2d.fillRect(105 + x, 154 + y, 1, 3);
        g2d.fillRect(98 + x, 154 + y, 1, 5);
        g2d.fillRect(106 + x, 156 + y, 1, 1);
        g2d.fillRect(102 + x, 156 + y, 1, 2);
        g2d.fillRect(101 + x, 156 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 7);
        g2d.fillRect(98 + x, 95 + y, 1, 2);
        g2d.fillRect(98 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 1, 5);
        g2d.fillRect(100 + x, 106 + y, 1, 2);
        g2d.fillRect(100 + x, 109 + y, 1, 1);
        g2d.fillRect(99 + x, 130 + y, 1, 3);
        g2d.fillRect(100 + x, 133 + y, 1, 3);
        g2d.fillRect(102 + x, 141 + y, 1, 1);
        g2d.fillRect(98 + x, 141 + y, 1, 3);
        g2d.fillRect(103 + x, 142 + y, 1, 2);
        g2d.fillRect(104 + x, 144 + y, 1, 4);
        g2d.fillRect(100 + x, 146 + y, 1, 3);
        g2d.fillRect(105 + x, 147 + y, 1, 7);
        g2d.fillRect(97 + x, 147 + y, 1, 2);
        g2d.fillRect(98 + x, 148 + y, 1, 6);
        g2d.fillRect(106 + x, 150 + y, 1, 6);
        g2d.fillRect(101 + x, 154 + y, 1, 2);
        g2d.fillRect(100 + x, 154 + y, 1, 3);
        g2d.fillRect(102 + x, 155 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 97 + y, 1, 3);
        g2d.fillRect(98 + x, 144 + y, 1, 4);
        g2d.fillRect(100 + x, 149 + y, 1, 5);
    }





    public void paintBack4a(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 2);
        g2d.fillRect(105 + x, 114 + y, 1, 4);
        g2d.fillRect(93 + x, 155 + y, 1, 1);
        g2d.fillRect(93 + x, 157 + y, 1, 2);
        g2d.fillRect(94 + x, 158 + y, 1, 1);
        g2d.fillRect(96 + x, 159 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 87 + y, 1, 14);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 4);
        g2d.fillRect(103 + x, 101 + y, 1, 11);
        g2d.fillRect(95 + x, 101 + y, 1, 3);
        g2d.fillRect(96 + x, 104 + y, 1, 7);
        g2d.fillRect(104 + x, 111 + y, 1, 3);
        g2d.fillRect(97 + x, 111 + y, 1, 14);
        g2d.fillRect(104 + x, 116 + y, 1, 1);
        g2d.fillRect(98 + x, 117 + y, 1, 1);
        g2d.fillRect(105 + x, 118 + y, 1, 5);
        g2d.fillRect(104 + x, 121 + y, 1, 17);
        g2d.fillRect(96 + x, 125 + y, 1, 8);
        g2d.fillRect(103 + x, 126 + y, 1, 1);
        g2d.fillRect(97 + x, 127 + y, 1, 1);
        g2d.fillRect(95 + x, 133 + y, 1, 6);
        g2d.fillRect(105 + x, 138 + y, 1, 4);
        g2d.fillRect(94 + x, 138 + y, 1, 13);
        g2d.fillRect(106 + x, 142 + y, 1, 5);
        g2d.fillRect(107 + x, 147 + y, 1, 7);
        g2d.fillRect(93 + x, 151 + y, 1, 4);
        g2d.fillRect(108 + x, 153 + y, 1, 6);
        g2d.fillRect(93 + x, 156 + y, 1, 1);
        g2d.fillRect(104 + x, 157 + y, 1, 3);
        g2d.fillRect(94 + x, 157 + y, 1, 1);
        g2d.fillRect(105 + x, 158 + y, 3, 1);
        g2d.fillRect(95 + x, 158 + y, 1, 1);
        g2d.fillRect(105 + x, 159 + y, 1, 1);
        g2d.fillRect(97 + x, 159 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 12);
        g2d.fillRect(101 + x, 90 + y, 2, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 3);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 1, 4);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
        g2d.fillRect(96 + x, 101 + y, 1, 3);
        g2d.fillRect(102 + x, 104 + y, 1, 8);
        g2d.fillRect(97 + x, 104 + y, 1, 7);
        g2d.fillRect(98 + x, 111 + y, 1, 6);
        g2d.fillRect(103 + x, 112 + y, 1, 2);
        g2d.fillRect(99 + x, 112 + y, 1, 11);
        g2d.fillRect(104 + x, 114 + y, 1, 2);
        g2d.fillRect(103 + x, 115 + y, 1, 11);
        g2d.fillRect(101 + x, 116 + y, 2, 1);
        g2d.fillRect(104 + x, 117 + y, 1, 4);
        g2d.fillRect(100 + x, 117 + y, 1, 4);
        g2d.fillRect(98 + x, 118 + y, 1, 19);
        g2d.fillRect(97 + x, 125 + y, 1, 2);
        g2d.fillRect(102 + x, 126 + y, 1, 1);
        g2d.fillRect(103 + x, 127 + y, 1, 13);
        g2d.fillRect(97 + x, 128 + y, 1, 5);
        g2d.fillRect(96 + x, 133 + y, 1, 11);
        g2d.fillRect(104 + x, 138 + y, 1, 6);
        g2d.fillRect(99 + x, 138 + y, 1, 1);
        g2d.fillRect(95 + x, 139 + y, 1, 19);
        g2d.fillRect(105 + x, 142 + y, 1, 5);
        g2d.fillRect(97 + x, 144 + y, 1, 4);
        g2d.fillRect(106 + x, 147 + y, 1, 11);
        g2d.fillRect(103 + x, 147 + y, 1, 1);
        g2d.fillRect(98 + x, 148 + y, 1, 5);
        g2d.fillRect(103 + x, 149 + y, 1, 10);
        g2d.fillRect(94 + x, 151 + y, 1, 6);
        g2d.fillRect(107 + x, 154 + y, 1, 4);
        g2d.fillRect(99 + x, 154 + y, 1, 1);
        g2d.fillRect(104 + x, 155 + y, 1, 2);
        g2d.fillRect(100 + x, 155 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 2);
        g2d.fillRect(105 + x, 157 + y, 1, 1);
        g2d.fillRect(97 + x, 157 + y, 2, 1);
        g2d.fillRect(99 + x, 158 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 2);
        g2d.fillRect(96 + x, 90 + y, 1, 11);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 9);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(99 + x, 94 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 2);
        g2d.fillRect(101 + x, 99 + y, 1, 17);
        g2d.fillRect(97 + x, 100 + y, 1, 4);
        g2d.fillRect(98 + x, 101 + y, 1, 10);
        g2d.fillRect(102 + x, 102 + y, 1, 2);
        g2d.fillRect(100 + x, 105 + y, 1, 12);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 110 + y, 1, 2);
        g2d.fillRect(102 + x, 112 + y, 1, 4);
        g2d.fillRect(103 + x, 114 + y, 1, 1);
        g2d.fillRect(102 + x, 117 + y, 1, 9);
        g2d.fillRect(101 + x, 117 + y, 1, 25);
        g2d.fillRect(100 + x, 121 + y, 1, 15);
        g2d.fillRect(99 + x, 123 + y, 1, 7);
        g2d.fillRect(102 + x, 127 + y, 1, 11);
        g2d.fillRect(97 + x, 133 + y, 1, 11);
        g2d.fillRect(98 + x, 137 + y, 2, 1);
        g2d.fillRect(98 + x, 138 + y, 1, 1);
        g2d.fillRect(99 + x, 139 + y, 1, 4);
        g2d.fillRect(103 + x, 140 + y, 1, 4);
        g2d.fillRect(100 + x, 140 + y, 1, 4);
        g2d.fillRect(101 + x, 143 + y, 1, 2);
        g2d.fillRect(104 + x, 144 + y, 1, 3);
        g2d.fillRect(102 + x, 144 + y, 1, 10);
        g2d.fillRect(98 + x, 144 + y, 1, 4);
        g2d.fillRect(96 + x, 144 + y, 1, 12);
        g2d.fillRect(101 + x, 146 + y, 1, 3);
        g2d.fillRect(100 + x, 146 + y, 1, 2);
        g2d.fillRect(105 + x, 147 + y, 1, 10);
        g2d.fillRect(103 + x, 148 + y, 1, 1);
        g2d.fillRect(97 + x, 148 + y, 1, 9);
        g2d.fillRect(104 + x, 149 + y, 1, 6);
        g2d.fillRect(99 + x, 149 + y, 1, 5);
        g2d.fillRect(100 + x, 151 + y, 1, 4);
        g2d.fillRect(101 + x, 153 + y, 1, 5);
        g2d.fillRect(98 + x, 153 + y, 1, 4);
        g2d.fillRect(102 + x, 155 + y, 1, 3);
        g2d.fillRect(99 + x, 155 + y, 1, 3);
        g2d.fillRect(100 + x, 156 + y, 1, 2);
        g2d.fillRect(96 + x, 158 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 90 + y, 1, 3);
        g2d.fillRect(97 + x, 92 + y, 1, 8);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 2);
        g2d.fillRect(98 + x, 97 + y, 1, 4);
        g2d.fillRect(99 + x, 99 + y, 1, 9);
        g2d.fillRect(100 + x, 101 + y, 1, 4);
        g2d.fillRect(99 + x, 109 + y, 1, 1);
        g2d.fillRect(99 + x, 130 + y, 1, 3);
        g2d.fillRect(99 + x, 134 + y, 1, 3);
        g2d.fillRect(100 + x, 137 + y, 1, 3);
        g2d.fillRect(102 + x, 138 + y, 1, 6);
        g2d.fillRect(98 + x, 139 + y, 1, 5);
        g2d.fillRect(101 + x, 142 + y, 1, 1);
        g2d.fillRect(99 + x, 143 + y, 1, 1);
        g2d.fillRect(103 + x, 144 + y, 1, 3);
        g2d.fillRect(100 + x, 144 + y, 1, 2);
        g2d.fillRect(101 + x, 145 + y, 1, 1);
        g2d.fillRect(104 + x, 147 + y, 1, 2);
        g2d.fillRect(99 + x, 147 + y, 1, 2);
        g2d.fillRect(100 + x, 148 + y, 1, 3);
        g2d.fillRect(101 + x, 149 + y, 1, 4);
        g2d.fillRect(102 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 93 + y, 1, 4);
        g2d.fillRect(99 + x, 133 + y, 1, 1);
        g2d.fillRect(100 + x, 136 + y, 1, 1);
        g2d.fillRect(99 + x, 144 + y, 1, 3);
    }





    public void paintBack5(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(95 + x, 100 + y, 1, 2);
        g2d.fillRect(96 + x, 104 + y, 1, 1);
        g2d.fillRect(105 + x, 111 + y, 1, 3);
        g2d.fillRect(104 + x, 112 + y, 1, 1);
        g2d.fillRect(104 + x, 114 + y, 1, 2);
        g2d.fillRect(109 + x, 153 + y, 1, 2);
        g2d.fillRect(107 + x, 154 + y, 2, 1);
        g2d.fillRect(105 + x, 155 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 89 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 1, 8);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 5);
        g2d.fillRect(103 + x, 99 + y, 1, 9);
        g2d.fillRect(95 + x, 99 + y, 1, 1);
        g2d.fillRect(96 + x, 100 + y, 1, 4);
        g2d.fillRect(102 + x, 103 + y, 1, 1);
        g2d.fillRect(97 + x, 104 + y, 1, 3);
        g2d.fillRect(98 + x, 107 + y, 1, 3);
        g2d.fillRect(104 + x, 108 + y, 1, 4);
        g2d.fillRect(97 + x, 110 + y, 1, 12);
        g2d.fillRect(104 + x, 113 + y, 1, 1);
        g2d.fillRect(105 + x, 114 + y, 1, 12);
        g2d.fillRect(97 + x, 124 + y, 1, 2);
        g2d.fillRect(106 + x, 125 + y, 1, 12);
        g2d.fillRect(96 + x, 126 + y, 1, 11);
        g2d.fillRect(107 + x, 137 + y, 1, 6);
        g2d.fillRect(95 + x, 137 + y, 1, 8);
        g2d.fillRect(108 + x, 143 + y, 1, 7);
        g2d.fillRect(94 + x, 145 + y, 1, 10);
        g2d.fillRect(109 + x, 150 + y, 1, 3);
        g2d.fillRect(104 + x, 153 + y, 1, 1);
        g2d.fillRect(97 + x, 153 + y, 1, 3);
        g2d.fillRect(106 + x, 154 + y, 1, 2);
        g2d.fillRect(105 + x, 154 + y, 1, 1);
        g2d.fillRect(96 + x, 154 + y, 1, 2);
        g2d.fillRect(95 + x, 154 + y, 1, 1);
        g2d.fillRect(98 + x, 155 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 10);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 10);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 2, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 4);
        g2d.fillRect(96 + x, 99 + y, 1, 1);
        g2d.fillRect(97 + x, 103 + y, 1, 1);
        g2d.fillRect(102 + x, 104 + y, 1, 4);
        g2d.fillRect(98 + x, 104 + y, 1, 3);
        g2d.fillRect(99 + x, 107 + y, 1, 3);
        g2d.fillRect(103 + x, 108 + y, 1, 15);
        g2d.fillRect(98 + x, 110 + y, 1, 2);
        g2d.fillRect(102 + x, 112 + y, 1, 5);
        g2d.fillRect(98 + x, 113 + y, 3, 1);
        g2d.fillRect(98 + x, 114 + y, 1, 10);
        g2d.fillRect(104 + x, 116 + y, 1, 13);
        g2d.fillRect(99 + x, 119 + y, 1, 3);
        g2d.fillRect(97 + x, 122 + y, 1, 2);
        g2d.fillRect(105 + x, 126 + y, 1, 9);
        g2d.fillRect(98 + x, 126 + y, 1, 5);
        g2d.fillRect(97 + x, 126 + y, 1, 9);
        g2d.fillRect(99 + x, 131 + y, 1, 3);
        g2d.fillRect(100 + x, 135 + y, 1, 1);
        g2d.fillRect(106 + x, 137 + y, 1, 5);
        g2d.fillRect(96 + x, 137 + y, 1, 6);
        g2d.fillRect(101 + x, 140 + y, 1, 1);
        g2d.fillRect(102 + x, 142 + y, 1, 3);
        g2d.fillRect(107 + x, 143 + y, 1, 7);
        g2d.fillRect(103 + x, 145 + y, 1, 10);
        g2d.fillRect(95 + x, 145 + y, 1, 9);
        g2d.fillRect(97 + x, 146 + y, 1, 7);
        g2d.fillRect(108 + x, 150 + y, 1, 4);
        g2d.fillRect(104 + x, 150 + y, 1, 3);
        g2d.fillRect(105 + x, 153 + y, 3, 1);
        g2d.fillRect(96 + x, 153 + y, 1, 1);
        g2d.fillRect(104 + x, 154 + y, 1, 1);
        g2d.fillRect(100 + x, 154 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 90 + y, 1, 9);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 2, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 6);
        g2d.fillRect(98 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 94 + y, 1, 10);
        g2d.fillRect(97 + x, 98 + y, 1, 5);
        g2d.fillRect(101 + x, 99 + y, 1, 41);
        g2d.fillRect(98 + x, 99 + y, 1, 5);
        g2d.fillRect(99 + x, 104 + y, 1, 3);
        g2d.fillRect(100 + x, 107 + y, 1, 6);
        g2d.fillRect(102 + x, 108 + y, 1, 4);
        g2d.fillRect(99 + x, 110 + y, 1, 3);
        g2d.fillRect(98 + x, 112 + y, 1, 1);
        g2d.fillRect(100 + x, 114 + y, 1, 15);
        g2d.fillRect(99 + x, 114 + y, 1, 5);
        g2d.fillRect(102 + x, 117 + y, 1, 20);
        g2d.fillRect(99 + x, 122 + y, 1, 4);
        g2d.fillRect(103 + x, 123 + y, 1, 15);
        g2d.fillRect(98 + x, 124 + y, 1, 2);
        g2d.fillRect(104 + x, 129 + y, 1, 11);
        g2d.fillRect(99 + x, 129 + y, 1, 2);
        g2d.fillRect(98 + x, 131 + y, 1, 6);
        g2d.fillRect(100 + x, 132 + y, 1, 3);
        g2d.fillRect(99 + x, 134 + y, 1, 21);
        g2d.fillRect(105 + x, 135 + y, 1, 8);
        g2d.fillRect(97 + x, 135 + y, 1, 8);
        g2d.fillRect(100 + x, 136 + y, 1, 6);
        g2d.fillRect(102 + x, 138 + y, 1, 4);
        g2d.fillRect(103 + x, 140 + y, 1, 5);
        g2d.fillRect(101 + x, 141 + y, 1, 9);
        g2d.fillRect(106 + x, 142 + y, 1, 4);
        g2d.fillRect(96 + x, 143 + y, 1, 10);
        g2d.fillRect(104 + x, 144 + y, 1, 6);
        g2d.fillRect(102 + x, 145 + y, 1, 6);
        g2d.fillRect(97 + x, 145 + y, 1, 1);
        g2d.fillRect(107 + x, 150 + y, 1, 3);
        g2d.fillRect(105 + x, 150 + y, 1, 3);
        g2d.fillRect(98 + x, 150 + y, 1, 5);
        g2d.fillRect(106 + x, 152 + y, 1, 1);
        g2d.fillRect(102 + x, 152 + y, 1, 2);
        g2d.fillRect(101 + x, 152 + y, 1, 2);
        g2d.fillRect(100 + x, 153 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 5);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 5);
        g2d.fillRect(100 + x, 104 + y, 1, 3);
        g2d.fillRect(99 + x, 126 + y, 1, 3);
        g2d.fillRect(100 + x, 129 + y, 1, 3);
        g2d.fillRect(102 + x, 137 + y, 1, 1);
        g2d.fillRect(98 + x, 137 + y, 1, 3);
        g2d.fillRect(103 + x, 138 + y, 1, 2);
        g2d.fillRect(104 + x, 140 + y, 1, 4);
        g2d.fillRect(100 + x, 142 + y, 1, 3);
        g2d.fillRect(105 + x, 143 + y, 1, 7);
        g2d.fillRect(97 + x, 143 + y, 1, 2);
        g2d.fillRect(98 + x, 144 + y, 1, 6);
        g2d.fillRect(106 + x, 146 + y, 1, 6);
        g2d.fillRect(101 + x, 150 + y, 1, 2);
        g2d.fillRect(100 + x, 150 + y, 1, 3);
        g2d.fillRect(102 + x, 151 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 96 + y, 1, 2);
        g2d.fillRect(98 + x, 140 + y, 1, 4);
        g2d.fillRect(100 + x, 145 + y, 1, 5);
    }





    public void paintBack5a(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 2);
        g2d.fillRect(105 + x, 111 + y, 1, 4);
        g2d.fillRect(93 + x, 151 + y, 1, 1);
        g2d.fillRect(93 + x, 153 + y, 1, 2);
        g2d.fillRect(94 + x, 154 + y, 1, 1);
        g2d.fillRect(96 + x, 155 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 87 + y, 1, 12);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 2);
        g2d.fillRect(103 + x, 99 + y, 1, 10);
        g2d.fillRect(95 + x, 99 + y, 1, 3);
        g2d.fillRect(96 + x, 102 + y, 1, 6);
        g2d.fillRect(104 + x, 108 + y, 1, 3);
        g2d.fillRect(97 + x, 108 + y, 1, 13);
        g2d.fillRect(104 + x, 113 + y, 1, 1);
        g2d.fillRect(98 + x, 114 + y, 1, 1);
        g2d.fillRect(105 + x, 115 + y, 1, 4);
        g2d.fillRect(104 + x, 117 + y, 1, 17);
        g2d.fillRect(96 + x, 121 + y, 1, 8);
        g2d.fillRect(103 + x, 122 + y, 1, 1);
        g2d.fillRect(97 + x, 123 + y, 1, 1);
        g2d.fillRect(95 + x, 129 + y, 1, 6);
        g2d.fillRect(105 + x, 134 + y, 1, 4);
        g2d.fillRect(94 + x, 134 + y, 1, 13);
        g2d.fillRect(106 + x, 138 + y, 1, 5);
        g2d.fillRect(107 + x, 143 + y, 1, 7);
        g2d.fillRect(93 + x, 147 + y, 1, 4);
        g2d.fillRect(108 + x, 149 + y, 1, 6);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(104 + x, 153 + y, 1, 3);
        g2d.fillRect(94 + x, 153 + y, 1, 1);
        g2d.fillRect(105 + x, 154 + y, 3, 1);
        g2d.fillRect(95 + x, 154 + y, 1, 1);
        g2d.fillRect(105 + x, 155 + y, 1, 1);
        g2d.fillRect(97 + x, 155 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 10);
        g2d.fillRect(101 + x, 90 + y, 2, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 3);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 1, 2);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(96 + x, 99 + y, 1, 3);
        g2d.fillRect(102 + x, 102 + y, 1, 7);
        g2d.fillRect(97 + x, 102 + y, 1, 6);
        g2d.fillRect(98 + x, 108 + y, 1, 6);
        g2d.fillRect(103 + x, 109 + y, 1, 2);
        g2d.fillRect(99 + x, 109 + y, 1, 10);
        g2d.fillRect(104 + x, 111 + y, 1, 2);
        g2d.fillRect(103 + x, 112 + y, 1, 10);
        g2d.fillRect(101 + x, 113 + y, 2, 1);
        g2d.fillRect(104 + x, 114 + y, 1, 3);
        g2d.fillRect(100 + x, 114 + y, 1, 3);
        g2d.fillRect(98 + x, 115 + y, 1, 18);
        g2d.fillRect(97 + x, 121 + y, 1, 2);
        g2d.fillRect(102 + x, 122 + y, 1, 1);
        g2d.fillRect(103 + x, 123 + y, 1, 13);
        g2d.fillRect(97 + x, 124 + y, 1, 5);
        g2d.fillRect(96 + x, 129 + y, 1, 11);
        g2d.fillRect(104 + x, 134 + y, 1, 6);
        g2d.fillRect(99 + x, 134 + y, 1, 1);
        g2d.fillRect(95 + x, 135 + y, 1, 19);
        g2d.fillRect(105 + x, 138 + y, 1, 5);
        g2d.fillRect(97 + x, 140 + y, 1, 4);
        g2d.fillRect(106 + x, 143 + y, 1, 11);
        g2d.fillRect(103 + x, 143 + y, 1, 1);
        g2d.fillRect(98 + x, 144 + y, 1, 5);
        g2d.fillRect(103 + x, 145 + y, 1, 10);
        g2d.fillRect(94 + x, 147 + y, 1, 6);
        g2d.fillRect(107 + x, 150 + y, 1, 4);
        g2d.fillRect(99 + x, 150 + y, 1, 1);
        g2d.fillRect(104 + x, 151 + y, 1, 2);
        g2d.fillRect(100 + x, 151 + y, 1, 1);
        g2d.fillRect(96 + x, 152 + y, 1, 2);
        g2d.fillRect(105 + x, 153 + y, 1, 1);
        g2d.fillRect(97 + x, 153 + y, 2, 1);
        g2d.fillRect(99 + x, 154 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 2);
        g2d.fillRect(96 + x, 90 + y, 1, 9);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 7);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(99 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 16);
        g2d.fillRect(97 + x, 98 + y, 1, 4);
        g2d.fillRect(98 + x, 99 + y, 1, 9);
        g2d.fillRect(102 + x, 100 + y, 1, 2);
        g2d.fillRect(100 + x, 103 + y, 1, 11);
        g2d.fillRect(99 + x, 107 + y, 1, 2);
        g2d.fillRect(102 + x, 109 + y, 1, 4);
        g2d.fillRect(103 + x, 111 + y, 1, 1);
        g2d.fillRect(102 + x, 114 + y, 1, 8);
        g2d.fillRect(101 + x, 114 + y, 1, 24);
        g2d.fillRect(100 + x, 117 + y, 1, 15);
        g2d.fillRect(99 + x, 119 + y, 1, 7);
        g2d.fillRect(102 + x, 123 + y, 1, 11);
        g2d.fillRect(97 + x, 129 + y, 1, 11);
        g2d.fillRect(98 + x, 133 + y, 2, 1);
        g2d.fillRect(98 + x, 134 + y, 1, 1);
        g2d.fillRect(99 + x, 135 + y, 1, 4);
        g2d.fillRect(103 + x, 136 + y, 1, 4);
        g2d.fillRect(100 + x, 136 + y, 1, 4);
        g2d.fillRect(101 + x, 139 + y, 1, 2);
        g2d.fillRect(104 + x, 140 + y, 1, 3);
        g2d.fillRect(102 + x, 140 + y, 1, 10);
        g2d.fillRect(98 + x, 140 + y, 1, 4);
        g2d.fillRect(96 + x, 140 + y, 1, 12);
        g2d.fillRect(101 + x, 142 + y, 1, 3);
        g2d.fillRect(100 + x, 142 + y, 1, 2);
        g2d.fillRect(105 + x, 143 + y, 1, 10);
        g2d.fillRect(103 + x, 144 + y, 1, 1);
        g2d.fillRect(97 + x, 144 + y, 1, 9);
        g2d.fillRect(104 + x, 145 + y, 1, 6);
        g2d.fillRect(99 + x, 145 + y, 1, 5);
        g2d.fillRect(100 + x, 147 + y, 1, 4);
        g2d.fillRect(101 + x, 149 + y, 1, 5);
        g2d.fillRect(98 + x, 149 + y, 1, 4);
        g2d.fillRect(102 + x, 151 + y, 1, 3);
        g2d.fillRect(99 + x, 151 + y, 1, 3);
        g2d.fillRect(100 + x, 152 + y, 1, 2);
        g2d.fillRect(96 + x, 154 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 90 + y, 1, 3);
        g2d.fillRect(97 + x, 92 + y, 1, 6);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 12);
        g2d.fillRect(98 + x, 97 + y, 1, 2);
        g2d.fillRect(100 + x, 99 + y, 1, 4);
        g2d.fillRect(99 + x, 126 + y, 1, 3);
        g2d.fillRect(99 + x, 130 + y, 1, 3);
        g2d.fillRect(100 + x, 133 + y, 1, 3);
        g2d.fillRect(102 + x, 134 + y, 1, 6);
        g2d.fillRect(98 + x, 135 + y, 1, 5);
        g2d.fillRect(101 + x, 138 + y, 1, 1);
        g2d.fillRect(99 + x, 139 + y, 1, 1);
        g2d.fillRect(103 + x, 140 + y, 1, 3);
        g2d.fillRect(100 + x, 140 + y, 1, 2);
        g2d.fillRect(101 + x, 141 + y, 1, 1);
        g2d.fillRect(104 + x, 143 + y, 1, 2);
        g2d.fillRect(99 + x, 143 + y, 1, 2);
        g2d.fillRect(100 + x, 144 + y, 1, 3);
        g2d.fillRect(101 + x, 145 + y, 1, 4);
        g2d.fillRect(102 + x, 150 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 93 + y, 1, 4);
        g2d.fillRect(99 + x, 129 + y, 1, 1);
        g2d.fillRect(100 + x, 132 + y, 1, 1);
        g2d.fillRect(99 + x, 140 + y, 1, 3);
    }





    public void paintBack6(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(95 + x, 99 + y, 1, 2);
        g2d.fillRect(96 + x, 103 + y, 1, 1);
        g2d.fillRect(104 + x, 108 + y, 1, 3);
        g2d.fillRect(103 + x, 109 + y, 1, 1);
        g2d.fillRect(103 + x, 111 + y, 1, 1);
        g2d.fillRect(108 + x, 148 + y, 1, 2);
        g2d.fillRect(106 + x, 149 + y, 2, 1);
        g2d.fillRect(104 + x, 150 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 89 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 1, 8);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 5);
        g2d.fillRect(103 + x, 99 + y, 1, 10);
        g2d.fillRect(96 + x, 99 + y, 1, 4);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(97 + x, 103 + y, 1, 4);
        g2d.fillRect(102 + x, 104 + y, 1, 1);
        g2d.fillRect(96 + x, 107 + y, 1, 11);
        g2d.fillRect(103 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 111 + y, 1, 11);
        g2d.fillRect(96 + x, 120 + y, 1, 2);
        g2d.fillRect(105 + x, 121 + y, 1, 11);
        g2d.fillRect(95 + x, 122 + y, 1, 10);
        g2d.fillRect(106 + x, 132 + y, 1, 6);
        g2d.fillRect(94 + x, 132 + y, 1, 8);
        g2d.fillRect(107 + x, 138 + y, 1, 7);
        g2d.fillRect(93 + x, 140 + y, 1, 10);
        g2d.fillRect(108 + x, 145 + y, 1, 3);
        g2d.fillRect(103 + x, 148 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 1, 3);
        g2d.fillRect(105 + x, 149 + y, 1, 2);
        g2d.fillRect(104 + x, 149 + y, 1, 1);
        g2d.fillRect(95 + x, 149 + y, 1, 2);
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(97 + x, 150 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 10);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 10);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 2, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 3);
        g2d.fillRect(97 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 103 + y, 1, 1);
        g2d.fillRect(98 + x, 103 + y, 1, 4);
        g2d.fillRect(101 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 1, 14);
        g2d.fillRect(97 + x, 107 + y, 1, 2);
        g2d.fillRect(101 + x, 109 + y, 1, 4);
        g2d.fillRect(97 + x, 110 + y, 3, 1);
        g2d.fillRect(97 + x, 111 + y, 1, 9);
        g2d.fillRect(103 + x, 112 + y, 1, 13);
        g2d.fillRect(98 + x, 115 + y, 1, 3);
        g2d.fillRect(96 + x, 118 + y, 1, 2);
        g2d.fillRect(104 + x, 122 + y, 1, 8);
        g2d.fillRect(97 + x, 122 + y, 1, 5);
        g2d.fillRect(96 + x, 122 + y, 1, 8);
        g2d.fillRect(98 + x, 127 + y, 1, 2);
        g2d.fillRect(99 + x, 130 + y, 1, 1);
        g2d.fillRect(105 + x, 132 + y, 1, 5);
        g2d.fillRect(95 + x, 132 + y, 1, 6);
        g2d.fillRect(100 + x, 135 + y, 1, 1);
        g2d.fillRect(101 + x, 137 + y, 1, 3);
        g2d.fillRect(106 + x, 138 + y, 1, 7);
        g2d.fillRect(102 + x, 140 + y, 1, 10);
        g2d.fillRect(94 + x, 140 + y, 1, 9);
        g2d.fillRect(96 + x, 141 + y, 1, 7);
        g2d.fillRect(107 + x, 145 + y, 1, 4);
        g2d.fillRect(103 + x, 145 + y, 1, 3);
        g2d.fillRect(104 + x, 148 + y, 3, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(103 + x, 149 + y, 1, 1);
        g2d.fillRect(99 + x, 149 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 90 + y, 1, 9);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 2, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 6);
        g2d.fillRect(98 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 94 + y, 1, 9);
        g2d.fillRect(97 + x, 98 + y, 1, 4);
        g2d.fillRect(101 + x, 99 + y, 1, 5);
        g2d.fillRect(98 + x, 99 + y, 1, 4);
        g2d.fillRect(99 + x, 103 + y, 1, 7);
        g2d.fillRect(100 + x, 104 + y, 1, 31);
        g2d.fillRect(101 + x, 105 + y, 1, 4);
        g2d.fillRect(98 + x, 107 + y, 1, 3);
        g2d.fillRect(97 + x, 109 + y, 1, 1);
        g2d.fillRect(99 + x, 111 + y, 1, 14);
        g2d.fillRect(98 + x, 111 + y, 1, 4);
        g2d.fillRect(101 + x, 113 + y, 1, 19);
        g2d.fillRect(98 + x, 118 + y, 1, 4);
        g2d.fillRect(102 + x, 119 + y, 1, 14);
        g2d.fillRect(97 + x, 120 + y, 1, 2);
        g2d.fillRect(103 + x, 125 + y, 1, 10);
        g2d.fillRect(98 + x, 125 + y, 1, 2);
        g2d.fillRect(97 + x, 127 + y, 1, 5);
        g2d.fillRect(99 + x, 128 + y, 1, 2);
        g2d.fillRect(98 + x, 129 + y, 1, 21);
        g2d.fillRect(104 + x, 130 + y, 1, 8);
        g2d.fillRect(96 + x, 130 + y, 1, 8);
        g2d.fillRect(99 + x, 131 + y, 1, 6);
        g2d.fillRect(101 + x, 133 + y, 1, 4);
        g2d.fillRect(102 + x, 135 + y, 1, 5);
        g2d.fillRect(100 + x, 136 + y, 1, 9);
        g2d.fillRect(105 + x, 137 + y, 1, 4);
        g2d.fillRect(95 + x, 138 + y, 1, 10);
        g2d.fillRect(103 + x, 139 + y, 1, 6);
        g2d.fillRect(101 + x, 140 + y, 1, 6);
        g2d.fillRect(96 + x, 140 + y, 1, 1);
        g2d.fillRect(106 + x, 145 + y, 1, 3);
        g2d.fillRect(104 + x, 145 + y, 1, 3);
        g2d.fillRect(97 + x, 145 + y, 1, 5);
        g2d.fillRect(105 + x, 147 + y, 1, 1);
        g2d.fillRect(101 + x, 147 + y, 1, 2);
        g2d.fillRect(100 + x, 147 + y, 1, 2);
        g2d.fillRect(99 + x, 148 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 5);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 4);
        g2d.fillRect(100 + x, 103 + y, 1, 1);
        g2d.fillRect(98 + x, 122 + y, 1, 3);
        g2d.fillRect(99 + x, 125 + y, 1, 3);
        g2d.fillRect(101 + x, 132 + y, 1, 1);
        g2d.fillRect(97 + x, 132 + y, 1, 3);
        g2d.fillRect(102 + x, 133 + y, 1, 2);
        g2d.fillRect(103 + x, 135 + y, 1, 4);
        g2d.fillRect(99 + x, 137 + y, 1, 3);
        g2d.fillRect(104 + x, 138 + y, 1, 7);
        g2d.fillRect(96 + x, 138 + y, 1, 2);
        g2d.fillRect(97 + x, 139 + y, 1, 6);
        g2d.fillRect(105 + x, 141 + y, 1, 6);
        g2d.fillRect(100 + x, 145 + y, 1, 2);
        g2d.fillRect(99 + x, 145 + y, 1, 3);
        g2d.fillRect(101 + x, 146 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 96 + y, 1, 2);
        g2d.fillRect(97 + x, 135 + y, 1, 4);
        g2d.fillRect(99 + x, 140 + y, 1, 5);
    }





    public void paintBack6a(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 2);
        g2d.fillRect(104 + x, 108 + y, 1, 4);
        g2d.fillRect(92 + x, 146 + y, 1, 1);
        g2d.fillRect(92 + x, 148 + y, 1, 2);
        g2d.fillRect(93 + x, 149 + y, 1, 1);
        g2d.fillRect(95 + x, 150 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 87 + y, 1, 12);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 2);
        g2d.fillRect(103 + x, 99 + y, 1, 9);
        g2d.fillRect(95 + x, 99 + y, 1, 2);
        g2d.fillRect(96 + x, 101 + y, 1, 16);
        g2d.fillRect(103 + x, 110 + y, 1, 1);
        g2d.fillRect(97 + x, 111 + y, 1, 1);
        g2d.fillRect(104 + x, 112 + y, 1, 3);
        g2d.fillRect(103 + x, 114 + y, 1, 15);
        g2d.fillRect(95 + x, 117 + y, 1, 8);
        g2d.fillRect(102 + x, 118 + y, 1, 1);
        g2d.fillRect(96 + x, 119 + y, 1, 1);
        g2d.fillRect(94 + x, 125 + y, 1, 5);
        g2d.fillRect(104 + x, 129 + y, 1, 3);
        g2d.fillRect(93 + x, 129 + y, 1, 13);
        g2d.fillRect(105 + x, 132 + y, 1, 6);
        g2d.fillRect(106 + x, 138 + y, 1, 6);
        g2d.fillRect(92 + x, 142 + y, 1, 4);
        g2d.fillRect(107 + x, 143 + y, 1, 7);
        g2d.fillRect(92 + x, 147 + y, 1, 1);
        g2d.fillRect(103 + x, 148 + y, 1, 3);
        g2d.fillRect(93 + x, 148 + y, 1, 1);
        g2d.fillRect(104 + x, 149 + y, 3, 1);
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(104 + x, 150 + y, 1, 1);
        g2d.fillRect(96 + x, 150 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 10);
        g2d.fillRect(101 + x, 90 + y, 2, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 3);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 1, 2);
        g2d.fillRect(96 + x, 99 + y, 1, 2);
        g2d.fillRect(102 + x, 101 + y, 1, 7);
        g2d.fillRect(97 + x, 101 + y, 1, 10);
        g2d.fillRect(98 + x, 106 + y, 1, 9);
        g2d.fillRect(103 + x, 108 + y, 1, 2);
        g2d.fillRect(102 + x, 109 + y, 1, 9);
        g2d.fillRect(100 + x, 110 + y, 2, 1);
        g2d.fillRect(103 + x, 111 + y, 1, 3);
        g2d.fillRect(99 + x, 111 + y, 1, 2);
        g2d.fillRect(97 + x, 112 + y, 1, 16);
        g2d.fillRect(96 + x, 117 + y, 1, 2);
        g2d.fillRect(101 + x, 118 + y, 1, 1);
        g2d.fillRect(102 + x, 119 + y, 1, 12);
        g2d.fillRect(96 + x, 120 + y, 1, 5);
        g2d.fillRect(95 + x, 125 + y, 1, 10);
        g2d.fillRect(103 + x, 129 + y, 1, 6);
        g2d.fillRect(98 + x, 129 + y, 1, 1);
        g2d.fillRect(94 + x, 130 + y, 1, 19);
        g2d.fillRect(104 + x, 132 + y, 1, 6);
        g2d.fillRect(96 + x, 135 + y, 1, 4);
        g2d.fillRect(105 + x, 138 + y, 1, 11);
        g2d.fillRect(102 + x, 138 + y, 1, 1);
        g2d.fillRect(97 + x, 139 + y, 1, 5);
        g2d.fillRect(102 + x, 140 + y, 1, 10);
        g2d.fillRect(93 + x, 142 + y, 1, 6);
        g2d.fillRect(106 + x, 144 + y, 1, 5);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(103 + x, 146 + y, 1, 2);
        g2d.fillRect(99 + x, 146 + y, 1, 1);
        g2d.fillRect(95 + x, 147 + y, 1, 2);
        g2d.fillRect(104 + x, 148 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 2, 1);
        g2d.fillRect(98 + x, 149 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 2);
        g2d.fillRect(96 + x, 90 + y, 1, 9);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 7);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(99 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 13);
        g2d.fillRect(97 + x, 98 + y, 1, 3);
        g2d.fillRect(102 + x, 99 + y, 1, 2);
        g2d.fillRect(98 + x, 99 + y, 1, 7);
        g2d.fillRect(100 + x, 102 + y, 1, 8);
        g2d.fillRect(99 + x, 105 + y, 1, 6);
        g2d.fillRect(102 + x, 108 + y, 1, 1);
        g2d.fillRect(101 + x, 111 + y, 1, 7);
        g2d.fillRect(100 + x, 111 + y, 1, 22);
        g2d.fillRect(99 + x, 113 + y, 1, 14);
        g2d.fillRect(98 + x, 115 + y, 1, 7);
        g2d.fillRect(101 + x, 119 + y, 1, 10);
        g2d.fillRect(96 + x, 125 + y, 1, 10);
        g2d.fillRect(97 + x, 128 + y, 2, 1);
        g2d.fillRect(97 + x, 129 + y, 1, 1);
        g2d.fillRect(98 + x, 130 + y, 1, 4);
        g2d.fillRect(102 + x, 131 + y, 1, 4);
        g2d.fillRect(99 + x, 131 + y, 1, 4);
        g2d.fillRect(100 + x, 134 + y, 1, 2);
        g2d.fillRect(103 + x, 135 + y, 1, 3);
        g2d.fillRect(101 + x, 135 + y, 1, 10);
        g2d.fillRect(97 + x, 135 + y, 1, 4);
        g2d.fillRect(95 + x, 135 + y, 1, 12);
        g2d.fillRect(100 + x, 137 + y, 1, 3);
        g2d.fillRect(99 + x, 137 + y, 1, 2);
        g2d.fillRect(104 + x, 138 + y, 1, 10);
        g2d.fillRect(102 + x, 139 + y, 1, 1);
        g2d.fillRect(96 + x, 139 + y, 1, 9);
        g2d.fillRect(103 + x, 140 + y, 1, 6);
        g2d.fillRect(98 + x, 140 + y, 1, 5);
        g2d.fillRect(99 + x, 142 + y, 1, 4);
        g2d.fillRect(100 + x, 144 + y, 1, 5);
        g2d.fillRect(97 + x, 144 + y, 1, 4);
        g2d.fillRect(101 + x, 146 + y, 1, 3);
        g2d.fillRect(98 + x, 146 + y, 1, 3);
        g2d.fillRect(99 + x, 147 + y, 1, 2);
        g2d.fillRect(95 + x, 149 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 90 + y, 1, 3);
        g2d.fillRect(97 + x, 92 + y, 1, 6);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 10);
        g2d.fillRect(98 + x, 97 + y, 1, 2);
        g2d.fillRect(100 + x, 99 + y, 1, 3);
        g2d.fillRect(98 + x, 122 + y, 1, 3);
        g2d.fillRect(98 + x, 126 + y, 1, 2);
        g2d.fillRect(99 + x, 128 + y, 1, 3);
        g2d.fillRect(101 + x, 129 + y, 1, 6);
        g2d.fillRect(97 + x, 130 + y, 1, 5);
        g2d.fillRect(100 + x, 133 + y, 1, 1);
        g2d.fillRect(98 + x, 134 + y, 1, 1);
        g2d.fillRect(102 + x, 135 + y, 1, 3);
        g2d.fillRect(99 + x, 135 + y, 1, 2);
        g2d.fillRect(100 + x, 136 + y, 1, 1);
        g2d.fillRect(103 + x, 138 + y, 1, 2);
        g2d.fillRect(98 + x, 138 + y, 1, 2);
        g2d.fillRect(99 + x, 139 + y, 1, 3);
        g2d.fillRect(100 + x, 140 + y, 1, 4);
        g2d.fillRect(101 + x, 145 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 93 + y, 1, 4);
        g2d.fillRect(98 + x, 125 + y, 1, 1);
        g2d.fillRect(99 + x, 127 + y, 1, 1);
        g2d.fillRect(98 + x, 135 + y, 1, 3);
    }





    public void paintBack7(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(95 + x, 97 + y, 1, 1);
        g2d.fillRect(96 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 104 + y, 1, 3);
        g2d.fillRect(102 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 1);
        g2d.fillRect(107 + x, 144 + y, 1, 2);
        g2d.fillRect(105 + x, 145 + y, 2, 1);
        g2d.fillRect(103 + x, 146 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 89 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 1, 6);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 11);
        g2d.fillRect(96 + x, 97 + y, 1, 2);
        g2d.fillRect(101 + x, 98 + y, 1, 1);
        g2d.fillRect(97 + x, 99 + y, 1, 2);
        g2d.fillRect(96 + x, 101 + y, 1, 2);
        g2d.fillRect(95 + x, 103 + y, 1, 11);
        g2d.fillRect(102 + x, 106 + y, 1, 1);
        g2d.fillRect(103 + x, 107 + y, 1, 11);
        g2d.fillRect(95 + x, 116 + y, 1, 2);
        g2d.fillRect(104 + x, 117 + y, 1, 11);
        g2d.fillRect(94 + x, 118 + y, 1, 10);
        g2d.fillRect(105 + x, 128 + y, 1, 6);
        g2d.fillRect(93 + x, 128 + y, 1, 8);
        g2d.fillRect(106 + x, 134 + y, 1, 7);
        g2d.fillRect(92 + x, 136 + y, 1, 10);
        g2d.fillRect(107 + x, 141 + y, 1, 3);
        g2d.fillRect(102 + x, 144 + y, 1, 1);
        g2d.fillRect(95 + x, 144 + y, 1, 3);
        g2d.fillRect(104 + x, 145 + y, 1, 2);
        g2d.fillRect(103 + x, 145 + y, 1, 1);
        g2d.fillRect(94 + x, 145 + y, 1, 2);
        g2d.fillRect(93 + x, 145 + y, 1, 1);
        g2d.fillRect(96 + x, 146 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 9);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 8);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 2, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 1, 16);
        g2d.fillRect(98 + x, 99 + y, 1, 2);
        g2d.fillRect(97 + x, 101 + y, 1, 2);
        g2d.fillRect(96 + x, 103 + y, 1, 2);
        g2d.fillRect(100 + x, 105 + y, 1, 4);
        g2d.fillRect(96 + x, 106 + y, 3, 1);
        g2d.fillRect(96 + x, 107 + y, 1, 9);
        g2d.fillRect(102 + x, 108 + y, 1, 13);
        g2d.fillRect(97 + x, 111 + y, 1, 3);
        g2d.fillRect(95 + x, 114 + y, 1, 2);
        g2d.fillRect(103 + x, 118 + y, 1, 8);
        g2d.fillRect(96 + x, 118 + y, 1, 5);
        g2d.fillRect(95 + x, 118 + y, 1, 8);
        g2d.fillRect(97 + x, 123 + y, 1, 2);
        g2d.fillRect(98 + x, 126 + y, 1, 1);
        g2d.fillRect(104 + x, 128 + y, 1, 5);
        g2d.fillRect(94 + x, 128 + y, 1, 6);
        g2d.fillRect(99 + x, 131 + y, 1, 1);
        g2d.fillRect(100 + x, 133 + y, 1, 3);
        g2d.fillRect(105 + x, 134 + y, 1, 7);
        g2d.fillRect(101 + x, 136 + y, 1, 10);
        g2d.fillRect(93 + x, 136 + y, 1, 9);
        g2d.fillRect(95 + x, 137 + y, 1, 7);
        g2d.fillRect(106 + x, 141 + y, 1, 4);
        g2d.fillRect(102 + x, 141 + y, 1, 3);
        g2d.fillRect(103 + x, 144 + y, 3, 1);
        g2d.fillRect(94 + x, 144 + y, 1, 1);
        g2d.fillRect(102 + x, 145 + y, 1, 1);
        g2d.fillRect(98 + x, 145 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 90 + y, 1, 7);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 2, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 4);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(100 + x, 94 + y, 1, 5);
        g2d.fillRect(97 + x, 96 + y, 1, 2);
        g2d.fillRect(98 + x, 97 + y, 1, 2);
        g2d.fillRect(99 + x, 99 + y, 1, 32);
        g2d.fillRect(100 + x, 100 + y, 1, 5);
        g2d.fillRect(98 + x, 101 + y, 1, 5);
        g2d.fillRect(97 + x, 103 + y, 1, 3);
        g2d.fillRect(96 + x, 105 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 14);
        g2d.fillRect(97 + x, 107 + y, 1, 4);
        g2d.fillRect(100 + x, 109 + y, 1, 19);
        g2d.fillRect(97 + x, 114 + y, 1, 4);
        g2d.fillRect(101 + x, 115 + y, 1, 14);
        g2d.fillRect(96 + x, 116 + y, 1, 2);
        g2d.fillRect(102 + x, 121 + y, 1, 10);
        g2d.fillRect(97 + x, 121 + y, 1, 2);
        g2d.fillRect(96 + x, 123 + y, 1, 5);
        g2d.fillRect(98 + x, 124 + y, 1, 2);
        g2d.fillRect(97 + x, 125 + y, 1, 21);
        g2d.fillRect(103 + x, 126 + y, 1, 8);
        g2d.fillRect(95 + x, 126 + y, 1, 8);
        g2d.fillRect(98 + x, 127 + y, 1, 6);
        g2d.fillRect(100 + x, 129 + y, 1, 4);
        g2d.fillRect(101 + x, 131 + y, 1, 5);
        g2d.fillRect(99 + x, 132 + y, 1, 9);
        g2d.fillRect(104 + x, 133 + y, 1, 4);
        g2d.fillRect(94 + x, 134 + y, 1, 10);
        g2d.fillRect(102 + x, 135 + y, 1, 6);
        g2d.fillRect(100 + x, 136 + y, 1, 6);
        g2d.fillRect(95 + x, 136 + y, 1, 1);
        g2d.fillRect(105 + x, 141 + y, 1, 3);
        g2d.fillRect(103 + x, 141 + y, 1, 3);
        g2d.fillRect(96 + x, 141 + y, 1, 5);
        g2d.fillRect(104 + x, 143 + y, 1, 1);
        g2d.fillRect(100 + x, 143 + y, 1, 2);
        g2d.fillRect(99 + x, 143 + y, 1, 2);
        g2d.fillRect(98 + x, 144 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 3);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 2);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(97 + x, 118 + y, 1, 3);
        g2d.fillRect(98 + x, 121 + y, 1, 3);
        g2d.fillRect(100 + x, 128 + y, 1, 1);
        g2d.fillRect(96 + x, 128 + y, 1, 3);
        g2d.fillRect(101 + x, 129 + y, 1, 2);
        g2d.fillRect(102 + x, 131 + y, 1, 4);
        g2d.fillRect(98 + x, 133 + y, 1, 3);
        g2d.fillRect(103 + x, 134 + y, 1, 7);
        g2d.fillRect(95 + x, 134 + y, 1, 2);
        g2d.fillRect(96 + x, 135 + y, 1, 6);
        g2d.fillRect(104 + x, 137 + y, 1, 6);
        g2d.fillRect(99 + x, 141 + y, 1, 2);
        g2d.fillRect(98 + x, 141 + y, 1, 3);
        g2d.fillRect(100 + x, 142 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(96 + x, 131 + y, 1, 4);
        g2d.fillRect(98 + x, 136 + y, 1, 5);
    }





    public void paintBack7a(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 104 + y, 1, 4);
        g2d.fillRect(91 + x, 142 + y, 1, 1);
        g2d.fillRect(91 + x, 144 + y, 1, 2);
        g2d.fillRect(92 + x, 145 + y, 1, 1);
        g2d.fillRect(94 + x, 146 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 87 + y, 1, 10);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 2);
        g2d.fillRect(103 + x, 97 + y, 1, 7);
        g2d.fillRect(95 + x, 97 + y, 1, 2);
        g2d.fillRect(96 + x, 99 + y, 1, 4);
        g2d.fillRect(95 + x, 103 + y, 1, 10);
        g2d.fillRect(102 + x, 106 + y, 1, 1);
        g2d.fillRect(96 + x, 107 + y, 1, 1);
        g2d.fillRect(103 + x, 108 + y, 1, 3);
        g2d.fillRect(102 + x, 110 + y, 1, 15);
        g2d.fillRect(94 + x, 113 + y, 1, 8);
        g2d.fillRect(101 + x, 114 + y, 1, 1);
        g2d.fillRect(95 + x, 115 + y, 1, 1);
        g2d.fillRect(93 + x, 121 + y, 1, 5);
        g2d.fillRect(103 + x, 125 + y, 1, 3);
        g2d.fillRect(92 + x, 125 + y, 1, 13);
        g2d.fillRect(104 + x, 128 + y, 1, 6);
        g2d.fillRect(105 + x, 134 + y, 1, 6);
        g2d.fillRect(91 + x, 138 + y, 1, 4);
        g2d.fillRect(106 + x, 139 + y, 1, 7);
        g2d.fillRect(91 + x, 143 + y, 1, 1);
        g2d.fillRect(102 + x, 144 + y, 1, 3);
        g2d.fillRect(92 + x, 144 + y, 1, 1);
        g2d.fillRect(103 + x, 145 + y, 3, 1);
        g2d.fillRect(93 + x, 145 + y, 1, 1);
        g2d.fillRect(103 + x, 146 + y, 1, 1);
        g2d.fillRect(95 + x, 146 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 88 + y, 3, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 8);
        g2d.fillRect(101 + x, 90 + y, 2, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 4);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 97 + y, 1, 2);
        g2d.fillRect(102 + x, 99 + y, 1, 7);
        g2d.fillRect(97 + x, 99 + y, 1, 12);
        g2d.fillRect(98 + x, 102 + y, 1, 2);
        g2d.fillRect(96 + x, 103 + y, 1, 4);
        g2d.fillRect(101 + x, 105 + y, 1, 9);
        g2d.fillRect(99 + x, 106 + y, 2, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 3);
        g2d.fillRect(98 + x, 107 + y, 1, 2);
        g2d.fillRect(96 + x, 108 + y, 1, 16);
        g2d.fillRect(95 + x, 113 + y, 1, 2);
        g2d.fillRect(100 + x, 114 + y, 1, 1);
        g2d.fillRect(101 + x, 115 + y, 1, 12);
        g2d.fillRect(95 + x, 116 + y, 1, 5);
        g2d.fillRect(94 + x, 121 + y, 1, 10);
        g2d.fillRect(102 + x, 125 + y, 1, 6);
        g2d.fillRect(97 + x, 125 + y, 1, 1);
        g2d.fillRect(93 + x, 126 + y, 1, 19);
        g2d.fillRect(103 + x, 128 + y, 1, 6);
        g2d.fillRect(95 + x, 131 + y, 1, 4);
        g2d.fillRect(104 + x, 134 + y, 1, 11);
        g2d.fillRect(101 + x, 134 + y, 1, 1);
        g2d.fillRect(96 + x, 135 + y, 1, 5);
        g2d.fillRect(101 + x, 136 + y, 1, 10);
        g2d.fillRect(92 + x, 138 + y, 1, 6);
        g2d.fillRect(105 + x, 140 + y, 1, 5);
        g2d.fillRect(97 + x, 141 + y, 1, 1);
        g2d.fillRect(102 + x, 142 + y, 1, 2);
        g2d.fillRect(98 + x, 142 + y, 1, 1);
        g2d.fillRect(94 + x, 143 + y, 1, 2);
        g2d.fillRect(103 + x, 144 + y, 1, 1);
        g2d.fillRect(95 + x, 144 + y, 2, 1);
        g2d.fillRect(97 + x, 145 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 89 + y, 4, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 2);
        g2d.fillRect(96 + x, 90 + y, 1, 7);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 5);
        g2d.fillRect(101 + x, 95 + y, 1, 10);
        g2d.fillRect(97 + x, 96 + y, 1, 3);
        g2d.fillRect(102 + x, 97 + y, 1, 2);
        g2d.fillRect(98 + x, 97 + y, 1, 5);
        g2d.fillRect(100 + x, 100 + y, 1, 6);
        g2d.fillRect(99 + x, 101 + y, 1, 5);
        g2d.fillRect(98 + x, 104 + y, 1, 3);
        g2d.fillRect(100 + x, 107 + y, 1, 7);
        g2d.fillRect(99 + x, 107 + y, 1, 22);
        g2d.fillRect(98 + x, 109 + y, 1, 14);
        g2d.fillRect(97 + x, 111 + y, 1, 7);
        g2d.fillRect(100 + x, 115 + y, 1, 10);
        g2d.fillRect(95 + x, 121 + y, 1, 10);
        g2d.fillRect(96 + x, 124 + y, 2, 1);
        g2d.fillRect(96 + x, 125 + y, 1, 1);
        g2d.fillRect(97 + x, 126 + y, 1, 4);
        g2d.fillRect(101 + x, 127 + y, 1, 4);
        g2d.fillRect(98 + x, 127 + y, 1, 4);
        g2d.fillRect(99 + x, 130 + y, 1, 2);
        g2d.fillRect(102 + x, 131 + y, 1, 3);
        g2d.fillRect(100 + x, 131 + y, 1, 10);
        g2d.fillRect(96 + x, 131 + y, 1, 4);
        g2d.fillRect(94 + x, 131 + y, 1, 12);
        g2d.fillRect(99 + x, 133 + y, 1, 3);
        g2d.fillRect(98 + x, 133 + y, 1, 2);
        g2d.fillRect(103 + x, 134 + y, 1, 10);
        g2d.fillRect(101 + x, 135 + y, 1, 1);
        g2d.fillRect(95 + x, 135 + y, 1, 9);
        g2d.fillRect(102 + x, 136 + y, 1, 6);
        g2d.fillRect(97 + x, 136 + y, 1, 5);
        g2d.fillRect(98 + x, 138 + y, 1, 4);
        g2d.fillRect(99 + x, 140 + y, 1, 5);
        g2d.fillRect(96 + x, 140 + y, 1, 4);
        g2d.fillRect(100 + x, 142 + y, 1, 3);
        g2d.fillRect(97 + x, 142 + y, 1, 3);
        g2d.fillRect(98 + x, 143 + y, 1, 2);
        g2d.fillRect(94 + x, 145 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 90 + y, 1, 3);
        g2d.fillRect(97 + x, 92 + y, 1, 4);
        g2d.fillRect(99 + x, 93 + y, 1, 8);
        g2d.fillRect(98 + x, 95 + y, 1, 2);
        g2d.fillRect(100 + x, 97 + y, 1, 3);
        g2d.fillRect(97 + x, 118 + y, 1, 3);
        g2d.fillRect(97 + x, 122 + y, 1, 2);
        g2d.fillRect(98 + x, 124 + y, 1, 3);
        g2d.fillRect(100 + x, 125 + y, 1, 6);
        g2d.fillRect(96 + x, 126 + y, 1, 5);
        g2d.fillRect(99 + x, 129 + y, 1, 1);
        g2d.fillRect(97 + x, 130 + y, 1, 1);
        g2d.fillRect(101 + x, 131 + y, 1, 3);
        g2d.fillRect(98 + x, 131 + y, 1, 2);
        g2d.fillRect(99 + x, 132 + y, 1, 1);
        g2d.fillRect(102 + x, 134 + y, 1, 2);
        g2d.fillRect(97 + x, 134 + y, 1, 2);
        g2d.fillRect(98 + x, 135 + y, 1, 3);
        g2d.fillRect(99 + x, 136 + y, 1, 4);
        g2d.fillRect(100 + x, 141 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 93 + y, 1, 2);
        g2d.fillRect(97 + x, 121 + y, 1, 1);
        g2d.fillRect(98 + x, 123 + y, 1, 1);
        g2d.fillRect(97 + x, 131 + y, 1, 3);
    }
}
