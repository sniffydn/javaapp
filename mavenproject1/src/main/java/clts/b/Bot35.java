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
public class Bot35 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot35()
    {
        super();
        slenderB = true;
        skt = true;
        shrt = true;
    }

    public Bot35(int layer)
    {
        super(layer);
        slenderB = true;
        skt = true;
        shrt = true;
    }

    public Bot35(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        skt = true;
        shrt = true;
    }

    public Bot35(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        skt = true;
        shrt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(101 + x, 78, 1, 5);
        g2d.fillRect(102 + x, 78, 1, 5);
        g2d.fillRect(103 + x, 78, 1, 6);
        g2d.fillRect(104 + x, 79, 1, 5);
        g2d.fillRect(105 + x, 79, 1, 2);
        g2d.fillRect(106 + x, 79, 1, 5);
        g2d.fillRect(107 + x, 79, 1, 6);
        g2d.fillRect(119 + x, 79, 1, 5);
        g2d.fillRect(100 + x, 80, 1, 3);
        g2d.fillRect(108 + x, 80, 1, 2);
        g2d.fillRect(109 + x, 80, 1, 5);
        g2d.fillRect(110 + x, 80, 1, 5);
        g2d.fillRect(111 + x, 80, 1, 2);
        g2d.fillRect(112 + x, 80, 1, 5);
        g2d.fillRect(113 + x, 80, 1, 5);
        g2d.fillRect(114 + x, 80, 1, 2);
        g2d.fillRect(115 + x, 80, 1, 5);
        g2d.fillRect(118 + x, 80, 1, 4);
        g2d.fillRect(120 + x, 80, 1, 3);
        g2d.fillRect(116 + x, 81, 1, 3);
        g2d.fillRect(121 + x, 81, 1, 2);
        g2d.fillRect(105 + x, 82, 1, 2);
        g2d.fillRect(108 + x, 83, 1, 2);
        g2d.fillRect(111 + x, 83, 1, 2);
        g2d.fillRect(114 + x, 83, 1, 2);
        g2d.fillRect(118 + x, 86, 1, 2);
        g2d.fillRect(120 + x, 86, 1, 2);
        g2d.fillRect(119 + x, 87, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 83, 1, 4);
        g2d.fillRect(120 + x, 83, 1, 3);
        g2d.fillRect(121 + x, 83, 1, 8);
        g2d.fillRect(101 + x, 86, 1, 3);
        g2d.fillRect(102 + x, 88, 4, 1);
        g2d.fillRect(106 + x, 89, 4, 1);
        g2d.fillRect(110 + x, 90, 5, 1);
        g2d.fillRect(115 + x, 91, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 83, 1, 3);
        g2d.fillRect(102 + x, 83, 1, 1);
        g2d.fillRect(119 + x, 84, 1, 3);
        g2d.fillRect(102 + x, 86, 1, 2);
        g2d.fillRect(103 + x, 87, 3, 1);
        g2d.fillRect(106 + x, 88, 4, 1);
        g2d.fillRect(110 + x, 89, 5, 1);
        g2d.fillRect(115 + x, 90, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 79, 2, 1);
        g2d.fillRect(116 + x, 80, 2, 1);
        g2d.fillRect(105 + x, 81, 1, 1);
        g2d.fillRect(117 + x, 81, 1, 9);
        g2d.fillRect(108 + x, 82, 1, 1);
        g2d.fillRect(111 + x, 82, 1, 1);
        g2d.fillRect(114 + x, 82, 1, 1);
        g2d.fillRect(102 + x, 84, 1, 2);
        g2d.fillRect(103 + x, 84, 1, 3);
        g2d.fillRect(104 + x, 84, 1, 3);
        g2d.fillRect(105 + x, 84, 1, 3);
        g2d.fillRect(106 + x, 84, 1, 4);
        g2d.fillRect(116 + x, 84, 1, 6);
        g2d.fillRect(118 + x, 84, 1, 2);
        g2d.fillRect(107 + x, 85, 1, 3);
        g2d.fillRect(108 + x, 85, 1, 3);
        g2d.fillRect(109 + x, 85, 1, 3);
        g2d.fillRect(110 + x, 85, 1, 4);
        g2d.fillRect(111 + x, 85, 1, 4);
        g2d.fillRect(112 + x, 85, 1, 4);
        g2d.fillRect(113 + x, 85, 1, 4);
        g2d.fillRect(114 + x, 85, 1, 4);
        g2d.fillRect(115 + x, 85, 1, 5);
        g2d.fillRect(118 + x, 88, 1, 2);
        g2d.fillRect(120 + x, 88, 1, 2);
        g2d.fillRect(119 + x, 89, 1, 1);
    }
}
