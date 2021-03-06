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
public class Bot19 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot19()
    {
        super();
        includeY = true;
        skt = true;
        shrt = true;
    }

    public Bot19(int layer)
    {
        super(layer);
        includeY = true;
        skt = true;
        shrt = true;
    }

    public Bot19(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeY = true;
        skt = true;
        shrt = true;
    }

    public Bot19(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeY = true;
        skt = true;
        shrt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        drawTop(x,y,g2d);
        drawMiddle(x,y,g2d);
        drawBottom(x,y,g2d);
        prevPrevY = prevY;
        prevY = y;
    }

    public void drawTop(int x, int y, GraphicsMap g2d)
    {

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 79, 2, 1);
        g2d.fillRect(119 + x, 79, 2, 1);
        g2d.fillRect(100 + x, 80, 1, 4);
        g2d.fillRect(103 + x, 80, 3, 1);
        g2d.fillRect(116 + x, 80, 1, 2);
        g2d.fillRect(117 + x, 80, 2, 1);
        g2d.fillRect(120 + x, 80, 1, 1);
        g2d.fillRect(106 + x, 81, 10, 1);
        g2d.fillRect(121 + x, 82, 1, 2);
        g2d.fillRect(101 + x, 84, 2, 1);
        g2d.fillRect(119 + x, 84, 2, 1);
        g2d.fillRect(103 + x, 85, 3, 1);
        g2d.fillRect(116 + x, 85, 3, 1);
        g2d.fillRect(106 + x, 86, 10, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 81, 1, 2);
        g2d.fillRect(103 + x, 81, 1, 3);
        g2d.fillRect(118 + x, 81, 2, 1);
        g2d.fillRect(105 + x, 82, 13, 1);
        g2d.fillRect(119 + x, 82, 1, 1);
        g2d.fillRect(104 + x, 83, 1, 1);
        g2d.fillRect(108 + x, 83, 8, 1);
        g2d.fillRect(118 + x, 83, 1, 1);
        g2d.fillRect(115 + x, 84, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 80, 1, 4);
        g2d.fillRect(102 + x, 80, 1, 1);
        g2d.fillRect(119 + x, 80, 1, 1);
        g2d.fillRect(104 + x, 81, 1, 2);
        g2d.fillRect(105 + x, 81, 1, 1);
        g2d.fillRect(117 + x, 81, 1, 1);
        g2d.fillRect(120 + x, 81, 1, 3);
        g2d.fillRect(118 + x, 82, 1, 1);
        g2d.fillRect(102 + x, 83, 1, 1);
        g2d.fillRect(105 + x, 83, 1, 2);
        g2d.fillRect(106 + x, 83, 1, 3);
        g2d.fillRect(107 + x, 83, 1, 3);
        g2d.fillRect(116 + x, 83, 2, 1);
        g2d.fillRect(119 + x, 83, 1, 1);
        g2d.fillRect(103 + x, 84, 2, 1);
        g2d.fillRect(108 + x, 84, 1, 2);
        g2d.fillRect(109 + x, 84, 1, 2);
        g2d.fillRect(110 + x, 84, 1, 2);
        g2d.fillRect(111 + x, 84, 1, 2);
        g2d.fillRect(112 + x, 84, 1, 2);
        g2d.fillRect(113 + x, 84, 1, 2);
        g2d.fillRect(114 + x, 84, 1, 2);
        g2d.fillRect(117 + x, 84, 2, 1);
        g2d.fillRect(115 + x, 85, 1, 1);
    }

    public void drawBottom(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 88+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(122 + x, 89+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(99 + x, 91+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(123 + x, 91+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(98 + x, 92+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(102 + x, 92+ prevY + prevPrevY, 2, 1);
        g2d.fillRect(106 + x, 92+ prevY + prevPrevY, 2, 1);
        g2d.fillRect(114 + x, 92+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(120 + x, 92+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(100 + x, 93+ prevY + prevPrevY, 2, 1);
        g2d.fillRect(104 + x, 93+ prevY + prevPrevY, 2, 1);
        g2d.fillRect(108 + x, 93+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(112 + x, 93+ prevY + prevPrevY, 2, 1);
        g2d.fillRect(115 + x, 93+ prevY + prevPrevY, 2, 1);
        g2d.fillRect(119 + x, 93+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(121 + x, 93+ prevY + prevPrevY, 2, 1);
        g2d.fillRect(109 + x, 94+ prevY + prevPrevY, 3, 1);
        g2d.fillRect(117 + x, 94+ prevY + prevPrevY, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 88+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(103 + x, 88+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(104 + x, 89+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(108 + x, 89+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(116 + x, 89+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(120 + x, 89+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(109 + x, 90+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(117 + x, 90+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(101 + x, 91+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(111 + x, 91+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(112 + x, 91+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(121 + x, 91+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(100 + x, 92+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(116 + x, 92+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(118 + x, 92+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(122 + x, 92+ prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 89+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(115 + x, 89+ prevY + prevPrevY, 1, 4);
        g2d.fillRect(121 + x, 89+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(103 + x, 90+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(105 + x, 90+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(106 + x, 90+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(107 + x, 90+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(114 + x, 90+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(118 + x, 90+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(119 + x, 90+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(100 + x, 91+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(102 + x, 91+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(110 + x, 91+ prevY + prevPrevY, 1, 3);
        g2d.fillRect(113 + x, 91+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(116 + x, 91+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(122 + x, 91+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(104 + x, 92+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(108 + x, 92+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(117 + x, 92+ prevY + prevPrevY, 1, 2);
        g2d.fillRect(109 + x, 93+ prevY + prevPrevY, 1, 1);
        g2d.fillRect(118 + x, 93+ prevY + prevPrevY, 1, 1);
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 83 + prevY, 1, 3);
        g2d.fillRect(121 + x, 83 + prevY, 1, 3);
        g2d.fillRect(98 + x, 88 + prevY, 3, 1);
        g2d.fillRect(102 + x, 88 + prevY, 2, 1);
        g2d.fillRect(121 + x, 88 + prevY, 1, 2);
        g2d.fillRect(122 + x, 88 + prevY, 2, 1);
        g2d.fillRect(101 + x, 89 + prevY, 1, 1);
        g2d.fillRect(104 + x, 89 + prevY, 1, 1);
        g2d.fillRect(108 + x, 89 + prevY, 1, 1);
        g2d.fillRect(115 + x, 89 + prevY, 2, 1);
        g2d.fillRect(119 + x, 89 + prevY, 1, 2);
        g2d.fillRect(120 + x, 89 + prevY, 1, 1);
        g2d.fillRect(105 + x, 90 + prevY, 3, 1);
        g2d.fillRect(109 + x, 90 + prevY, 1, 1);
        g2d.fillRect(114 + x, 90 + prevY, 1, 1);
        g2d.fillRect(117 + x, 90 + prevY, 2, 1);
        g2d.fillRect(110 + x, 91 + prevY, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 84 + prevY, 1, 2);
        g2d.fillRect(102 + x, 84 + prevY, 1, 3);
        g2d.fillRect(119 + x, 84 + prevY, 1, 2);
        g2d.fillRect(120 + x, 84 + prevY, 1, 4);
        g2d.fillRect(104 + x, 85 + prevY, 1, 4);
        g2d.fillRect(105 + x, 85 + prevY, 1, 3);
        g2d.fillRect(116 + x, 85 + prevY, 1, 2);
        g2d.fillRect(117 + x, 85 + prevY, 1, 4);
        g2d.fillRect(118 + x, 85 + prevY, 1, 3);
        g2d.fillRect(107 + x, 86 + prevY, 1, 4);
        g2d.fillRect(109 + x, 86 + prevY, 1, 2);
        g2d.fillRect(110 + x, 86 + prevY, 1, 4);
        g2d.fillRect(111 + x, 86 + prevY, 1, 4);
        g2d.fillRect(112 + x, 86 + prevY, 1, 4);
        g2d.fillRect(113 + x, 86 + prevY, 1, 2);
        g2d.fillRect(114 + x, 86 + prevY, 1, 4);
        g2d.fillRect(115 + x, 86 + prevY, 1, 3);
        g2d.fillRect(101 + x, 87 + prevY, 1, 2);
        g2d.fillRect(121 + x, 87 + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 85 + prevY, 1, 3);
        g2d.fillRect(100 + x, 86 + prevY, 1, 2);
        g2d.fillRect(101 + x, 86 + prevY, 1, 1);
        g2d.fillRect(106 + x, 86 + prevY, 1, 4);
        g2d.fillRect(108 + x, 86 + prevY, 1, 3);
        g2d.fillRect(119 + x, 86 + prevY, 1, 3);
        g2d.fillRect(121 + x, 86 + prevY, 1, 1);
        g2d.fillRect(99 + x, 87 + prevY, 1, 1);
        g2d.fillRect(102 + x, 87 + prevY, 1, 1);
        g2d.fillRect(116 + x, 87 + prevY, 1, 2);
        g2d.fillRect(122 + x, 87 + prevY, 1, 1);
        g2d.fillRect(105 + x, 88 + prevY, 1, 2);
        g2d.fillRect(109 + x, 88 + prevY, 1, 2);
        g2d.fillRect(113 + x, 88 + prevY, 1, 3);
        g2d.fillRect(118 + x, 88 + prevY, 1, 2);
        g2d.fillRect(120 + x, 88 + prevY, 1, 1);
        g2d.fillRect(117 + x, 89 + prevY, 1, 1);
        g2d.fillRect(110 + x, 90 + prevY, 3, 1);
    }
    int prevPrevY = 0;
    int prevY = 0;
}
