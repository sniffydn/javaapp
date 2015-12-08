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
public class BSw3 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public BSw3()
    {
        super();
        includeY = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public BSw3(int layer)
    {
        super(layer);
        includeY = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public BSw3(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeY = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public BSw3(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeY = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        if(y > 0)
            paintB3(x,0,g2d);
        else if(y < 0)           
            paintB1(x,0,g2d);
        else
            paintB2(x,0,g2d);
        
        paintB(x,0,g2d);
          
    }

    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 81 + y, 1, 2);
        g2d.fillRect(122 + x, 81 + y, 2, 1);
        g2d.fillRect(98 + x, 82 + y, 2, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 2);
        g2d.fillRect(124 + x, 82 + y, 1, 1);
        g2d.fillRect(97 + x, 83 + y, 1, 1);
        g2d.fillRect(122 + x, 83 + y, 1, 2);
        g2d.fillRect(125 + x, 83 + y, 1, 1);
        g2d.fillRect(96 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(123 + x, 85 + y, 1, 2);
        g2d.fillRect(98 + x, 86 + y, 1, 1);
    }





    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 81 + y, 1, 3);
        g2d.fillRect(122 + x, 81 + y, 1, 1);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 3);
        g2d.fillRect(123 + x, 82 + y, 2, 1);
        g2d.fillRect(97 + x, 83 + y, 2, 1);
        g2d.fillRect(125 + x, 83 + y, 1, 2);
        g2d.fillRect(96 + x, 84 + y, 1, 1);
        g2d.fillRect(122 + x, 84 + y, 1, 3);
        g2d.fillRect(126 + x, 84 + y, 1, 1);
        g2d.fillRect(95 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(123 + x, 87 + y, 1, 2);
        g2d.fillRect(98 + x, 88 + y, 1, 1);
    }





    public void paintB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 81 + y, 1, 3);
        g2d.fillRect(122 + x, 81 + y, 1, 1);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(123 + x, 82 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(124 + x, 83 + y, 1, 1);
        g2d.fillRect(97 + x, 84 + y, 1, 1);
        g2d.fillRect(122 + x, 84 + y, 1, 5);
        g2d.fillRect(125 + x, 84 + y, 1, 2);
        g2d.fillRect(96 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 2);
        g2d.fillRect(95 + x, 86 + y, 1, 1);
        g2d.fillRect(126 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 2);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 80 + y, 2, 1);
        g2d.fillRect(101 + x, 81 + y, 2, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 2, 1);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 2, 1);
        g2d.fillRect(107 + x, 86 + y, 2, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
        g2d.fillRect(111 + x, 89 + y, 2, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 3, 1);
        g2d.fillRect(117 + x, 83 + y, 3, 1);
        g2d.fillRect(107 + x, 84 + y, 2, 1);
        g2d.fillRect(108 + x, 85 + y, 3, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 3, 1);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(112 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(116 + x, 83 + y, 1, 2);
        g2d.fillRect(109 + x, 84 + y, 6, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 4, 1);
        g2d.fillRect(112 + x, 86 + y, 3, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
    }
}
