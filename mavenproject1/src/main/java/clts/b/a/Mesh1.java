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
public class Mesh1 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Mesh1()
    {
        super();
    }

    public Mesh1(int layer)
    {
        super(layer);
    }

    public Mesh1(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public Mesh1(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
    }
}
