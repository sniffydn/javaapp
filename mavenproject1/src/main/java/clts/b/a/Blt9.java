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
public class Blt9 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Blt9()
    {
        super();
    }

    public Blt9(int layer)
    {
        super(layer);
    }

    public Blt9(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public Blt9(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {    
        paintH(x,y,g2d);
    }
    
    
    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 2, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 2, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 83 + y, 2, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 2, 1);
        g2d.fillRect(111 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 84 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 2, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 2, 1);
        g2d.fillRect(117 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(116 + x, 83 + y, 1, 2);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 2, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 83 + y, 2, 1);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(114 + x, 85 + y, 1, 2);
    }
}
