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
public class Skrt8 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Skrt8()
    {
        super();
        skt = true;
        jean = true;
    }

    public Skrt8(int layer)
    {
        super(layer);
        skt = true;
        jean = true;
    }

    public Skrt8(ColorArray colorSwitch)
    {
        super(colorSwitch);
        skt = true;
        jean = true;
    }

    public Skrt8(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        skt = true;
        jean = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintH(x,y,g2d);
    }

    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 3, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 3, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 79 + y, 1, 4);
        g2d.fillRect(102 + x, 80 + y, 4, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 1, 3);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 2, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 4);
        g2d.fillRect(113 + x, 81 + y, 2, 1);
        g2d.fillRect(117 + x, 81 + y, 1, 3);
        g2d.fillRect(120 + x, 81 + y, 1, 4);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 1, 3);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(105 + x, 83 + y, 5, 1);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 4, 1);
        g2d.fillRect(101 + x, 84 + y, 2, 1);
        g2d.fillRect(118 + x, 84 + y, 2, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 4);
        g2d.fillRect(100 + x, 85 + y, 1, 3);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 2, 1);
        g2d.fillRect(114 + x, 89 + y, 2, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 5, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 6);
        g2d.fillRect(114 + x, 84 + y, 3, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 2);
        g2d.fillRect(109 + x, 85 + y, 1, 5);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 4);
        g2d.fillRect(114 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 87 + y, 1, 3);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(108 + x, 88 + y, 1, 2);
        g2d.fillRect(115 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 82 + y, 2, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 3);
        g2d.fillRect(101 + x, 85 + y, 1, 4);
        g2d.fillRect(102 + x, 85 + y, 1, 7);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 2, 1);
        g2d.fillRect(114 + x, 85 + y, 3, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 3);
        g2d.fillRect(119 + x, 85 + y, 1, 3);
        g2d.fillRect(120 + x, 85 + y, 1, 3);
        g2d.fillRect(103 + x, 86 + y, 1, 7);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 87 + y, 1, 7);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 4);
        g2d.fillRect(105 + x, 88 + y, 1, 3);
        g2d.fillRect(106 + x, 88 + y, 1, 3);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 89 + y, 3, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 3);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 4);
        g2d.fillRect(113 + x, 90 + y, 3, 1);
        g2d.fillRect(120 + x, 90 + y, 2, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 82 + y, 2, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 2, 1);
    }
}
