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
import pieces.clts.*;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot27 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot27()
    {
        super();
        shrt = true;
        under = true;
        swim = true;
    }

    public Bot27(int layer)
    {
        super(layer);
        shrt = true;
        under = true;
        swim = true;
    }

    public Bot27(ColorArray colorSwitch)
    {
        super(colorSwitch);
        shrt = true;
        under = true;
        swim = true;
    }

    public Bot27(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        shrt = true;
        under = true;
        swim = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 83 + y, 22, 1);
        g2d.fillRect(101 + x, 84 + y, 2, 1);
        g2d.fillRect(119 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 2, 1);
        g2d.fillRect(117 + x, 85 + y, 2, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 84 + y, 16, 1);
        g2d.fillRect(105 + x, 85 + y, 2, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 85 + y, 8, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 2);
        g2d.fillRect(109 + x, 87 + y, 2, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 86 + y, 3, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);



        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(122 + x, 81 + y, 1, 1);
        g2d.fillRect(98 + x, 82 + y, 3, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(123 + x, 82 + y, 1, 2);
        g2d.fillRect(97 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 83 + y, 1, 2);
        g2d.fillRect(122 + x, 83 + y, 1, 2);
        g2d.fillRect(98 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(123 + x, 85 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 83 + y, 1, 1);

    }
}
