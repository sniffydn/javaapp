/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b.a;

import clts.SuperB;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class G1 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public G1()
    {
        super();
    }

    public G1(int layer)
    {
        super(layer);
    }

    public G1(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public G1(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintBack(int offsetX, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(step <= 12 && step > 3)
        {
            paintLeft(offsetX, shiftY,g2d);
        }
        else
        {
            paintRight(offsetX, shiftY,g2d);
        }
    }

    public void paintMiddle(int offsetX, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        

        if(step <= 12 && step > 3)
        {
            paintRight(offsetX,shiftY,g2d);
        }
        else
        {
            paintLeft(offsetX,shiftY,g2d);
        }
    }

    protected void paintRight(int x, int y, GraphicsMap g2d)
    {
        if(step == 0 || step == 8 || step == 9 || step == 15)
        {
            paintG1(x,y,g2d);
        }else if(step == 11 || step == 12 || step == 13)
        {
            paintG3(x,y,g2d);
        }else if(step == 1 || step == 7)
        {
            paintG4(x,y,g2d);
        }else if(step == 2 || step == 6)
        {
            paintG5(x,y,g2d);
        }else if(step == 10 || step == 14)
        {
            paintG2(x,y,g2d);
        }else if(step == 4 || step == 3 || step == 5)
        {
            paintG7(x,y,g2d);
        }
    }
    protected void paintLeft(int x, int y, GraphicsMap g2d)
    {
    }
    
    public void paintG7(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 1);
    }





    public void paintG1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 96 + y, 1, 1);
        g2d.fillRect(113 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 94 + y, 4, 1);
        g2d.fillRect(112 + x, 95 + y, 3, 1);
        g2d.fillRect(119 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(113 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 1);
    }





    public void paintG2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(113 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 1);
        g2d.fillRect(121 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 94 + y, 4, 1);
        g2d.fillRect(113 + x, 95 + y, 3, 1);
        g2d.fillRect(120 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 96 + y, 1, 1);
    }





    public void paintG3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(113 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 1);
        g2d.fillRect(121 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 94 + y, 4, 1);
        g2d.fillRect(113 + x, 95 + y, 3, 1);
        g2d.fillRect(120 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 96 + y, 1, 1);
    }





    public void paintG4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(121 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 93 + y, 4, 1);
        g2d.fillRect(113 + x, 94 + y, 3, 1);
        g2d.fillRect(120 + x, 94 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 1);
    }





    public void paintG5(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(121 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 92 + y, 4, 1);
        g2d.fillRect(113 + x, 93 + y, 3, 1);
        g2d.fillRect(120 + x, 93 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 1);
    }





    public void paintBackG7(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(95 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(95 + x, 91 + y, 1, 1);
    }





    public void paintBackG1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(97 + x, 96 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(96 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 94 + y, 4, 1);
        g2d.fillRect(101 + x, 95 + y, 3, 1);
        g2d.fillRect(95 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(97 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 1);
    }





    public void paintBackG2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(97 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 1);
        g2d.fillRect(94 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 1);
        g2d.fillRect(95 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 94 + y, 4, 1);
        g2d.fillRect(100 + x, 95 + y, 3, 1);
        g2d.fillRect(94 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 1);
    }





    public void paintBackG3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(97 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 1);
        g2d.fillRect(94 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 1);
        g2d.fillRect(95 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 94 + y, 4, 1);
        g2d.fillRect(100 + x, 95 + y, 3, 1);
        g2d.fillRect(94 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 1);
    }





    public void paintBackG4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 94 + y, 1, 1);
        g2d.fillRect(97 + x, 94 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(94 + x, 95 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 93 + y, 4, 1);
        g2d.fillRect(100 + x, 94 + y, 3, 1);
        g2d.fillRect(94 + x, 94 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(95 + x, 95 + y, 1, 1);
    }





    public void paintBackG5(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 1);
        g2d.fillRect(100 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(94 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(95 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 92 + y, 4, 1);
        g2d.fillRect(100 + x, 93 + y, 3, 1);
        g2d.fillRect(94 + x, 93 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(95 + x, 94 + y, 1, 1);
    }

}
