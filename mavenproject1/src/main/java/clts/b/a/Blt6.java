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
public class Blt6 extends SuperB
{
    private int prevY = 0;
    /** Creates a new instance of GenericClothes */
    public Blt6()
    {
        super();
        includeY = true;
    }

    public Blt6(int layer)
    {
        super(layer);
        includeY = true;
    }

    public Blt6(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeY = true;
    }

    public Blt6(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeY = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {        
        if(prevY - y == 1)
        {
            paintC(x,shiftY,g2d);
        }
        else if(prevY - y == -1)
        {
            paintA(x,shiftY,g2d);
        }else
        {
            paintB(x,shiftY,g2d);
        }
        
        prevY = y;
    }
    
    public void paintC(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(115 + x, 80 + y, 5, 1);
        g2d.fillRect(117 + x, 81 + y, 1, 3);
        g2d.fillRect(118 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 2, 1);
        g2d.fillRect(111 + x, 83 + y, 4, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 79 + y, 1, 3);
        g2d.fillRect(104 + x, 79 + y, 2, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 3, 1);
        g2d.fillRect(108 + x, 83 + y, 3, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 92 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 80 + y, 1, 3);
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 3);
        g2d.fillRect(109 + x, 84 + y, 1, 5);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 2, 1);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(113 + x, 82 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 2, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 82 + y, 3, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 3);
    }





    public void paintA(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(115 + x, 80 + y, 5, 1);
        g2d.fillRect(117 + x, 81 + y, 1, 3);
        g2d.fillRect(118 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 2, 1);
        g2d.fillRect(111 + x, 83 + y, 4, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 79 + y, 1, 3);
        g2d.fillRect(104 + x, 79 + y, 2, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 3, 1);
        g2d.fillRect(108 + x, 83 + y, 3, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 91 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 80 + y, 1, 3);
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 2, 1);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(113 + x, 82 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 2, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 82 + y, 3, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 3);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(115 + x, 80 + y, 5, 1);
        g2d.fillRect(117 + x, 81 + y, 1, 3);
        g2d.fillRect(118 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 2, 1);
        g2d.fillRect(111 + x, 83 + y, 4, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 79 + y, 1, 3);
        g2d.fillRect(104 + x, 79 + y, 2, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 3, 1);
        g2d.fillRect(108 + x, 83 + y, 3, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 2);
        g2d.fillRect(108 + x, 92 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 80 + y, 1, 3);
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(103 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 2, 1);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(113 + x, 82 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 82 + y, 3, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
    }
}
