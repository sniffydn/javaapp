/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.l;

import clts.SuperTL;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower22 extends SuperTL
{
    {
        prep = true;
    }
    public TopLower22()
    {
        super();
    }

    public TopLower22(int layer)
    {
        super(layer);
    }

    public TopLower22(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public TopLower22(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        if((step == 0 && prevStep != 0) || step == 1 || step == 2 || (step == 8 && prevStep != 8) || step == 9 || step == 10)
        {
            paint2TL1(x,0,g2d);
        }
        else if(step == 5 || step == 6 || step == 13 || step == 14)
        {
            paint2TL3(x,0,g2d);
        }
        else
        {
            paint2TL2(x,0,g2d);
        }


        prevStep = step;
    }

    int prevStep = 0;

    public void paint2TL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 4);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 4, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 3);
        g2d.fillRect(113 + x, 60 + y, 5, 1);
        g2d.fillRect(115 + x, 61 + y, 3, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(107 + x, 63 + y, 1, 4);
        g2d.fillRect(113 + x, 63 + y, 1, 4);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(106 + x, 67 + y, 1, 5);
        g2d.fillRect(114 + x, 67 + y, 1, 5);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 72 + y, 1, 2);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(119 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 3, 1);
        g2d.fillRect(103 + x, 74 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 1, 3);
        g2d.fillRect(104 + x, 62 + y, 1, 12);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 63 + y, 1, 4);
        g2d.fillRect(114 + x, 64 + y, 1, 3);
        g2d.fillRect(105 + x, 67 + y, 1, 5);
        g2d.fillRect(115 + x, 67 + y, 1, 5);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(103 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 3);
        g2d.fillRect(105 + x, 62 + y, 1, 5);
        g2d.fillRect(115 + x, 64 + y, 1, 3);
        g2d.fillRect(116 + x, 70 + y, 1, 2);
    }





    public void paint2TL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 4);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 4, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 11);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 3);
        g2d.fillRect(113 + x, 60 + y, 5, 1);
        g2d.fillRect(115 + x, 61 + y, 3, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 5);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 3);
        g2d.fillRect(106 + x, 64 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 5);
        g2d.fillRect(114 + x, 66 + y, 1, 5);
        g2d.fillRect(117 + x, 67 + y, 1, 2);
        g2d.fillRect(118 + x, 69 + y, 1, 1);
        g2d.fillRect(119 + x, 70 + y, 1, 1);
        g2d.fillRect(101 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 4, 1);
        g2d.fillRect(102 + x, 72 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 1, 10);
        g2d.fillRect(104 + x, 62 + y, 1, 2);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(104 + x, 66 + y, 1, 5);
        g2d.fillRect(115 + x, 66 + y, 1, 5);
        g2d.fillRect(116 + x, 67 + y, 1, 2);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 3);
        g2d.fillRect(105 + x, 62 + y, 1, 2);
        g2d.fillRect(104 + x, 64 + y, 1, 2);
        g2d.fillRect(115 + x, 64 + y, 1, 2);
        g2d.fillRect(116 + x, 69 + y, 1, 1);
    }





    public void paint2TL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 4);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 4, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 9);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 3);
        g2d.fillRect(113 + x, 59 + y, 5, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 3);
        g2d.fillRect(107 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 2);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(117 + x, 64 + y, 1, 2);
        g2d.fillRect(115 + x, 65 + y, 1, 3);
        g2d.fillRect(105 + x, 66 + y, 1, 2);
        g2d.fillRect(118 + x, 66 + y, 1, 1);
        g2d.fillRect(119 + x, 67 + y, 1, 1);
        g2d.fillRect(101 + x, 68 + y, 1, 2);
        g2d.fillRect(104 + x, 68 + y, 1, 2);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(120 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(121 + x, 69 + y, 1, 1);
        g2d.fillRect(100 + x, 70 + y, 1, 2);
        g2d.fillRect(103 + x, 70 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 3, 1);
        g2d.fillRect(101 + x, 72 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 9);
        g2d.fillRect(104 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 65 + y, 1, 3);
        g2d.fillRect(104 + x, 66 + y, 1, 2);
        g2d.fillRect(117 + x, 66 + y, 1, 1);
        g2d.fillRect(118 + x, 67 + y, 1, 1);
        g2d.fillRect(102 + x, 68 + y, 1, 4);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(119 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 69 + y, 1, 1);
        g2d.fillRect(120 + x, 69 + y, 1, 1);
        g2d.fillRect(101 + x, 70 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 3);
        g2d.fillRect(105 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 2);
        g2d.fillRect(116 + x, 64 + y, 1, 1);
        g2d.fillRect(117 + x, 67 + y, 1, 1);
        g2d.fillRect(118 + x, 68 + y, 1, 1);
    }
}
