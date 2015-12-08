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
public class Bot31 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot31()
    {
        super();
        includeY = true;
        jean = true;
        skt = true;
    }

    public Bot31(int layer)
    {
        super(layer);
        includeY = true;
        jean = true;
        skt = true;
    }

    public Bot31(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeY = true;
        jean = true;
        skt = true;
    }

    public Bot31(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeY = true;
        jean = true;
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        drawTop(x,y,g2d);
        drawMiddle(x,y,g2d);
        prevY = y;
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 93 + prevY, 1, 2);
        g2d.fillRect(102 + x, 93 + prevY, 1, 1);
        g2d.fillRect(121 + x, 93 + prevY, 1, 1);
        g2d.fillRect(124 + x, 93 + prevY, 1, 1);
        g2d.fillRect(117 + x, 94 + prevY, 1, 2);
        g2d.fillRect(120 + x, 94 + prevY, 1, 1);
        g2d.fillRect(122 + x, 94 + prevY, 2, 1);
        g2d.fillRect(105 + x, 95 + prevY, 1, 1);
        g2d.fillRect(107 + x, 95 + prevY, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(96 + x, 91 + prevY, 1, 1);
        g2d.fillRect(97 + x, 92 + prevY, 1, 1);
        g2d.fillRect(100 + x, 92 + prevY, 2, 1);
        g2d.fillRect(98 + x, 93 + prevY, 2, 1);
        g2d.fillRect(120 + x, 93 + prevY, 1, 1);
        g2d.fillRect(103 + x, 94 + prevY, 1, 1);
        g2d.fillRect(106 + x, 94 + prevY, 2, 1);
        g2d.fillRect(110 + x, 94 + prevY, 2, 1);
        g2d.fillRect(115 + x, 94 + prevY, 2, 1);
        g2d.fillRect(119 + x, 94 + prevY, 1, 1);
        g2d.fillRect(104 + x, 95 + prevY, 1, 1);
        g2d.fillRect(112 + x, 95 + prevY, 3, 1);
        g2d.fillRect(118 + x, 95 + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 88 + prevY, 1, 1);
        g2d.fillRect(123 + x, 89 + prevY, 1, 2);
        g2d.fillRect(124 + x, 91 + prevY, 1, 2);
        g2d.fillRect(99 + x, 94 + prevY, 1, 1);
        g2d.fillRect(121 + x, 94 + prevY, 1, 1);
        g2d.fillRect(100 + x, 95 + prevY, 1, 1);
        g2d.fillRect(120 + x, 95 + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 88 + prevY, 1, 1);
        g2d.fillRect(120 + x, 88 + prevY, 1, 1);
        g2d.fillRect(97 + x, 89 + prevY, 1, 1);
        g2d.fillRect(121 + x, 89 + prevY, 1, 2);
        g2d.fillRect(122 + x, 89 + prevY, 1, 5);
        g2d.fillRect(96 + x, 90 + prevY, 1, 1);
        g2d.fillRect(107 + x, 90 + prevY, 3, 1);
        g2d.fillRect(113 + x, 90 + prevY, 2, 1);
        g2d.fillRect(119 + x, 90 + prevY, 1, 3);
        g2d.fillRect(105 + x, 91 + prevY, 1, 2);
        g2d.fillRect(108 + x, 91 + prevY, 1, 1);
        g2d.fillRect(112 + x, 91 + prevY, 1, 2);
        g2d.fillRect(114 + x, 91 + prevY, 1, 1);
        g2d.fillRect(118 + x, 91 + prevY, 1, 3);
        g2d.fillRect(108 + x, 93 + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 88 + prevY, 2, 1);
        g2d.fillRect(99 + x, 89 + prevY, 1, 2);
        g2d.fillRect(100 + x, 89 + prevY, 1, 1);
        g2d.fillRect(102 + x, 89 + prevY, 1, 3);
        g2d.fillRect(103 + x, 89 + prevY, 1, 1);
        g2d.fillRect(120 + x, 89 + prevY, 1, 2);
        g2d.fillRect(104 + x, 90 + prevY, 1, 2);
        g2d.fillRect(115 + x, 90 + prevY, 1, 1);
        g2d.fillRect(98 + x, 91 + prevY, 1, 1);
        g2d.fillRect(107 + x, 91 + prevY, 1, 2);
        g2d.fillRect(111 + x, 91 + prevY, 1, 2);
        g2d.fillRect(113 + x, 91 + prevY, 1, 1);
        g2d.fillRect(116 + x, 91 + prevY, 1, 2);
        g2d.fillRect(117 + x, 91 + prevY, 1, 2);
        g2d.fillRect(121 + x, 91 + prevY, 1, 2);
        g2d.fillRect(123 + x, 91 + prevY, 1, 3);
        g2d.fillRect(108 + x, 92 + prevY, 1, 1);
        g2d.fillRect(114 + x, 92 + prevY, 1, 2);
        g2d.fillRect(105 + x, 93 + prevY, 1, 1);
        g2d.fillRect(112 + x, 93 + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 89 + prevY, 1, 2);
        g2d.fillRect(101 + x, 89 + prevY, 1, 3);
        g2d.fillRect(97 + x, 90 + prevY, 1, 2);
        g2d.fillRect(100 + x, 90 + prevY, 1, 2);
        g2d.fillRect(103 + x, 90 + prevY, 1, 4);
        g2d.fillRect(99 + x, 91 + prevY, 1, 2);
        g2d.fillRect(106 + x, 91 + prevY, 1, 3);
        g2d.fillRect(109 + x, 91 + prevY, 1, 4);
        g2d.fillRect(110 + x, 91 + prevY, 1, 3);
        g2d.fillRect(115 + x, 91 + prevY, 1, 3);
        g2d.fillRect(120 + x, 91 + prevY, 1, 2);
        g2d.fillRect(98 + x, 92 + prevY, 1, 1);
        g2d.fillRect(102 + x, 92 + prevY, 1, 1);
        g2d.fillRect(104 + x, 92 + prevY, 1, 3);
        g2d.fillRect(113 + x, 92 + prevY, 1, 3);
        g2d.fillRect(107 + x, 93 + prevY, 1, 1);
        g2d.fillRect(111 + x, 93 + prevY, 1, 1);
        g2d.fillRect(116 + x, 93 + prevY, 2, 1);
        g2d.fillRect(119 + x, 93 + prevY, 1, 1);
        g2d.fillRect(105 + x, 94 + prevY, 1, 1);
        g2d.fillRect(108 + x, 94 + prevY, 1, 1);
        g2d.fillRect(112 + x, 94 + prevY, 1, 1);
        g2d.fillRect(114 + x, 94 + prevY, 1, 1);
        g2d.fillRect(118 + x, 94 + prevY, 1, 1);
    }

    public void drawTop(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(98 + x, 88, 1, 1);
        g2d.fillRect(124 + x, 88, 1, 1);
        g2d.fillRect(99 + x, 89, 2, 1);
        g2d.fillRect(122 + x, 89, 2, 1);
        g2d.fillRect(104 + x, 90, 1, 1);
        g2d.fillRect(105 + x, 91, 2, 1);
        g2d.fillRect(110 + x, 91, 3, 1);
        g2d.fillRect(116 + x, 91, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(96 + x, 86, 1, 1);
        g2d.fillRect(97 + x, 87, 1, 1);
        g2d.fillRect(101 + x, 88, 2, 1);
        g2d.fillRect(120 + x, 88, 2, 1);
        g2d.fillRect(103 + x, 89, 1, 1);
        g2d.fillRect(119 + x, 89, 1, 2);
        g2d.fillRect(107 + x, 90, 3, 1);
        g2d.fillRect(113 + x, 90, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 79, 2, 1);
        g2d.fillRect(119 + x, 79, 1, 3);
        g2d.fillRect(120 + x, 81, 2, 1);
        g2d.fillRect(116 + x, 82, 3, 1);
        g2d.fillRect(121 + x, 82, 1, 1);
        g2d.fillRect(122 + x, 83, 1, 1);
        g2d.fillRect(123 + x, 84, 1, 1);
        g2d.fillRect(122 + x, 85, 1, 1);
        g2d.fillRect(124 + x, 85, 1, 3);
        g2d.fillRect(123 + x, 86, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 78, 3, 1);
        g2d.fillRect(101 + x, 79, 1, 1);
        g2d.fillRect(113 + x, 79, 1, 3);
        g2d.fillRect(114 + x, 79, 1, 3);
        g2d.fillRect(115 + x, 79, 1, 3);
        g2d.fillRect(118 + x, 79, 1, 2);
        g2d.fillRect(100 + x, 80, 1, 2);
        g2d.fillRect(110 + x, 80, 1, 2);
        g2d.fillRect(111 + x, 80, 1, 2);
        g2d.fillRect(112 + x, 80, 1, 2);
        g2d.fillRect(116 + x, 80, 2, 1);
        g2d.fillRect(101 + x, 81, 1, 2);
        g2d.fillRect(108 + x, 81, 2, 1);
        g2d.fillRect(99 + x, 82, 1, 1);
        g2d.fillRect(102 + x, 82, 3, 1);
        g2d.fillRect(98 + x, 83, 1, 1);
        g2d.fillRect(100 + x, 83, 1, 1);
        g2d.fillRect(103 + x, 83, 1, 1);
        g2d.fillRect(105 + x, 83, 1, 3);
        g2d.fillRect(106 + x, 83, 13, 1);
        g2d.fillRect(120 + x, 83, 1, 1);
        g2d.fillRect(97 + x, 84, 1, 1);
        g2d.fillRect(102 + x, 84, 1, 1);
        g2d.fillRect(111 + x, 84, 1, 2);
        g2d.fillRect(112 + x, 84, 1, 4);
        g2d.fillRect(115 + x, 84, 2, 1);
        g2d.fillRect(118 + x, 84, 2, 1);
        g2d.fillRect(121 + x, 84, 2, 1);
        g2d.fillRect(96 + x, 85, 1, 1);
        g2d.fillRect(101 + x, 85, 1, 1);
        g2d.fillRect(116 + x, 85, 1, 1);
        g2d.fillRect(120 + x, 85, 1, 1);
        g2d.fillRect(123 + x, 85, 1, 1);
        g2d.fillRect(104 + x, 86, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 77, 3, 1);
        g2d.fillRect(101 + x, 78, 3, 1);
        g2d.fillRect(113 + x, 78, 4, 1);
        g2d.fillRect(102 + x, 79, 2, 1);
        g2d.fillRect(110 + x, 79, 3, 1);
        g2d.fillRect(101 + x, 80, 1, 1);
        g2d.fillRect(107 + x, 80, 1, 2);
        g2d.fillRect(108 + x, 80, 2, 1);
        g2d.fillRect(105 + x, 81, 2, 1);
        g2d.fillRect(116 + x, 81, 3, 1);
        g2d.fillRect(100 + x, 82, 1, 1);
        g2d.fillRect(119 + x, 82, 2, 1);
        g2d.fillRect(101 + x, 83, 2, 1);
        g2d.fillRect(121 + x, 83, 1, 1);
        g2d.fillRect(99 + x, 84, 1, 2);
        g2d.fillRect(100 + x, 84, 1, 1);
        g2d.fillRect(103 + x, 84, 1, 1);
        g2d.fillRect(117 + x, 84, 1, 6);
        g2d.fillRect(102 + x, 85, 1, 1);
        g2d.fillRect(104 + x, 85, 1, 1);
        g2d.fillRect(115 + x, 85, 1, 1);
        g2d.fillRect(119 + x, 85, 1, 1);
        g2d.fillRect(98 + x, 86, 1, 1);
        g2d.fillRect(101 + x, 86, 1, 1);
        g2d.fillRect(105 + x, 86, 1, 4);
        g2d.fillRect(111 + x, 86, 1, 4);
        g2d.fillRect(116 + x, 86, 1, 4);
        g2d.fillRect(120 + x, 86, 2, 1);
        g2d.fillRect(100 + x, 87, 1, 2);
        g2d.fillRect(103 + x, 87, 1, 1);
        g2d.fillRect(107 + x, 87, 1, 3);
        g2d.fillRect(121 + x, 87, 3, 1);
        g2d.fillRect(99 + x, 88, 1, 1);
        g2d.fillRect(104 + x, 88, 1, 1);
        g2d.fillRect(110 + x, 88, 1, 2);
        g2d.fillRect(112 + x, 88, 1, 2);
        g2d.fillRect(122 + x, 88, 2, 1);
        g2d.fillRect(106 + x, 89, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 79, 1, 3);
        g2d.fillRect(105 + x, 79, 1, 2);
        g2d.fillRect(106 + x, 79, 1, 2);
        g2d.fillRect(107 + x, 79, 3, 1);
        g2d.fillRect(102 + x, 80, 1, 2);
        g2d.fillRect(103 + x, 80, 1, 2);
        g2d.fillRect(105 + x, 82, 11, 1);
        g2d.fillRect(99 + x, 83, 1, 1);
        g2d.fillRect(104 + x, 83, 1, 2);
        g2d.fillRect(119 + x, 83, 1, 1);
        g2d.fillRect(98 + x, 84, 1, 2);
        g2d.fillRect(101 + x, 84, 1, 1);
        g2d.fillRect(106 + x, 84, 1, 5);
        g2d.fillRect(107 + x, 84, 1, 3);
        g2d.fillRect(108 + x, 84, 1, 6);
        g2d.fillRect(109 + x, 84, 1, 6);
        g2d.fillRect(110 + x, 84, 1, 4);
        g2d.fillRect(113 + x, 84, 1, 6);
        g2d.fillRect(114 + x, 84, 1, 6);
        g2d.fillRect(120 + x, 84, 1, 1);
        g2d.fillRect(97 + x, 85, 1, 2);
        g2d.fillRect(100 + x, 85, 1, 2);
        g2d.fillRect(103 + x, 85, 1, 2);
        g2d.fillRect(118 + x, 85, 1, 6);
        g2d.fillRect(121 + x, 85, 1, 1);
        g2d.fillRect(99 + x, 86, 1, 2);
        g2d.fillRect(102 + x, 86, 1, 2);
        g2d.fillRect(115 + x, 86, 1, 4);
        g2d.fillRect(119 + x, 86, 1, 3);
        g2d.fillRect(122 + x, 86, 1, 1);
        g2d.fillRect(98 + x, 87, 1, 1);
        g2d.fillRect(101 + x, 87, 1, 1);
        g2d.fillRect(120 + x, 87, 1, 1);
        g2d.fillRect(103 + x, 88, 1, 1);
        g2d.fillRect(104 + x, 89, 1, 1);
        g2d.fillRect(105 + x, 90, 2, 1);
        g2d.fillRect(110 + x, 90, 3, 1);
        g2d.fillRect(116 + x, 90, 2, 1);
    }
    int prevY = 0;
}
