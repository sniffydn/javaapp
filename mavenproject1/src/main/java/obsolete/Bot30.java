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
public class Bot30 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot30()
    {
        super();
        includeY = true;
        jean = true;
        skt = true;
    }

    public Bot30(int layer)
    {
        super(layer);
        includeY = true;
        jean = true;
        skt = true;
    }

    public Bot30(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeY = true;
        jean = true;
        skt = true;
    }

    public Bot30(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeY = true;
        jean = true;
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        drawTop(x,0,g2d);
        drawMiddle(x,0,g2d);
        drawBottom(x,0,g2d);
        drawMiddle1(x,0,g2d);
        prevPrevPrevY = prevPrevY;
        prevPrevY = prevY;
        prevY = y;
    }

    public void drawTop(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(104 + x, 85, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6, ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 82, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 80, 1, 1);
        g2d.fillRect(115 + x, 81, 1, 1);
        g2d.fillRect(120 + x, 81, 1, 1);
        g2d.fillRect(119 + x, 84, 1, 1);
        g2d.fillRect(121 + x, 84, 1, 1);
        g2d.fillRect(116 + x, 85, 1, 2);
        g2d.fillRect(104 + x, 86, 1, 2);
        g2d.fillRect(109 + x, 86, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 82, 1, 1);
        g2d.fillRect(104 + x, 83, 1, 1);
        g2d.fillRect(105 + x, 84, 1, 1);
        g2d.fillRect(101 + x, 86, 1, 1);
        g2d.fillRect(109 + x, 87, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 82, 1, 1);
        g2d.fillRect(102 + x, 83, 1, 1);
        g2d.fillRect(118 + x, 83, 1, 1);
        g2d.fillRect(98 + x, 84, 1, 1);
        g2d.fillRect(109 + x, 85, 1, 1);
        g2d.fillRect(118 + x, 85, 1, 1);
        g2d.fillRect(119 + x, 86, 1, 1);
        g2d.fillRect(113 + x, 87, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 79, 1, 1);
        g2d.fillRect(117 + x, 81, 1, 1);
        g2d.fillRect(116 + x, 87, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 81, 1, 1);
        g2d.fillRect(119 + x, 81, 1, 1);
        g2d.fillRect(99 + x, 83, 1, 1);
        g2d.fillRect(102 + x, 84, 1, 1);
        g2d.fillRect(118 + x, 84, 1, 1);
        g2d.fillRect(105 + x, 86, 1, 1);
        g2d.fillRect(110 + x, 86, 1, 1);
        g2d.fillRect(112 + x, 87, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 76, 1, 1);
        g2d.fillRect(103 + x, 77, 3, 1);
        g2d.fillRect(109 + x, 77, 2, 1);
        g2d.fillRect(116 + x, 77, 1, 2);
        g2d.fillRect(117 + x, 77, 1, 2);
        g2d.fillRect(118 + x, 77, 1, 1);
        g2d.fillRect(100 + x, 78, 1, 1);
        g2d.fillRect(102 + x, 78, 1, 1);
        g2d.fillRect(110 + x, 78, 1, 1);
        g2d.fillRect(112 + x, 78, 4, 1);
        g2d.fillRect(101 + x, 79, 1, 2);
        g2d.fillRect(105 + x, 79, 1, 2);
        g2d.fillRect(108 + x, 79, 1, 3);
        g2d.fillRect(118 + x, 79, 1, 2);
        g2d.fillRect(111 + x, 80, 1, 1);
        g2d.fillRect(115 + x, 80, 2, 1);
        g2d.fillRect(103 + x, 81, 2, 1);
        g2d.fillRect(112 + x, 81, 1, 4);
        g2d.fillRect(99 + x, 82, 1, 1);
        g2d.fillRect(102 + x, 82, 1, 1);
        g2d.fillRect(106 + x, 82, 1, 1);
        g2d.fillRect(114 + x, 82, 1, 1);
        g2d.fillRect(101 + x, 83, 1, 1);
        g2d.fillRect(104 + x, 84, 1, 1);
        g2d.fillRect(110 + x, 84, 1, 2);
        g2d.fillRect(114 + x, 84, 1, 4);
        g2d.fillRect(116 + x, 84, 1, 1);
        g2d.fillRect(98 + x, 85, 1, 1);
        g2d.fillRect(117 + x, 85, 1, 2);
        g2d.fillRect(119 + x, 85, 1, 1);
        g2d.fillRect(107 + x, 86, 1, 2);
        g2d.fillRect(113 + x, 86, 1, 1);
        g2d.fillRect(105 + x, 87, 1, 1);
        g2d.fillRect(110 + x, 87, 1, 1);
        g2d.fillRect(109 + x, 88, 1, 1);
        g2d.fillRect(112 + x, 88, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 78, 1, 1);
        g2d.fillRect(102 + x, 79, 1, 1);
        g2d.fillRect(116 + x, 79, 1, 1);
        g2d.fillRect(119 + x, 79, 1, 2);
        g2d.fillRect(117 + x, 80, 1, 1);
        g2d.fillRect(100 + x, 81, 1, 1);
        g2d.fillRect(113 + x, 81, 1, 1);
        g2d.fillRect(104 + x, 82, 1, 1);
        g2d.fillRect(110 + x, 83, 1, 1);
        g2d.fillRect(120 + x, 83, 1, 1);
        g2d.fillRect(101 + x, 84, 1, 2);
        g2d.fillRect(113 + x, 85, 1, 1);
        g2d.fillRect(117 + x, 87, 1, 1);
        g2d.fillRect(106 + x, 88, 2, 1);
        g2d.fillRect(110 + x, 88, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 76, 1, 1);
        g2d.fillRect(102 + x, 77, 1, 1);
        g2d.fillRect(107 + x, 77, 2, 1);
        g2d.fillRect(103 + x, 78, 1, 1);
        g2d.fillRect(105 + x, 78, 2, 1);
        g2d.fillRect(111 + x, 78, 1, 2);
        g2d.fillRect(119 + x, 78, 1, 1);
        g2d.fillRect(106 + x, 79, 1, 2);
        g2d.fillRect(107 + x, 79, 1, 3);
        g2d.fillRect(109 + x, 79, 2, 1);
        g2d.fillRect(112 + x, 79, 3, 1);
        g2d.fillRect(117 + x, 79, 1, 1);
        g2d.fillRect(104 + x, 80, 1, 1);
        g2d.fillRect(110 + x, 80, 1, 1);
        g2d.fillRect(113 + x, 80, 1, 1);
        g2d.fillRect(109 + x, 81, 1, 1);
        g2d.fillRect(111 + x, 81, 1, 3);
        g2d.fillRect(114 + x, 81, 1, 1);
        g2d.fillRect(116 + x, 81, 1, 1);
        g2d.fillRect(118 + x, 81, 1, 2);
        g2d.fillRect(103 + x, 82, 1, 1);
        g2d.fillRect(113 + x, 82, 1, 3);
        g2d.fillRect(119 + x, 82, 1, 1);
        g2d.fillRect(106 + x, 83, 1, 1);
        g2d.fillRect(109 + x, 83, 1, 1);
        g2d.fillRect(116 + x, 83, 1, 1);
        g2d.fillRect(99 + x, 84, 1, 1);
        g2d.fillRect(103 + x, 84, 1, 4);
        g2d.fillRect(115 + x, 84, 1, 2);
        g2d.fillRect(117 + x, 84, 1, 1);
        g2d.fillRect(102 + x, 85, 1, 1);
        g2d.fillRect(105 + x, 85, 3, 1);
        g2d.fillRect(111 + x, 85, 1, 2);
        g2d.fillRect(106 + x, 86, 1, 2);
        g2d.fillRect(108 + x, 86, 1, 1);
        g2d.fillRect(112 + x, 86, 1, 1);
        g2d.fillRect(121 + x, 86, 1, 1);
        g2d.fillRect(118 + x, 87, 1, 1);
        g2d.fillRect(114 + x, 88, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 79, 1, 1);
        g2d.fillRect(117 + x, 82, 1, 1);
        g2d.fillRect(100 + x, 85, 1, 1);
        g2d.fillRect(111 + x, 88, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(100 + x, 79, 1, 1);
        g2d.fillRect(102 + x, 80, 1, 1);
        g2d.fillRect(105 + x, 81, 1, 1);
        g2d.fillRect(107 + x, 82, 1, 1);
        g2d.fillRect(108 + x, 84, 1, 1);
        g2d.fillRect(99 + x, 86, 1, 1);
        g2d.fillRect(115 + x, 87, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(109 + x, 80, 1, 1);
        g2d.fillRect(114 + x, 80, 1, 1);
        g2d.fillRect(103 + x, 83, 1, 1);
        g2d.fillRect(105 + x, 83, 1, 1);
        g2d.fillRect(117 + x, 83, 1, 1);
        g2d.fillRect(106 + x, 84, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(106 + x, 77, 1, 1);
        g2d.fillRect(107 + x, 78, 3, 1);
        g2d.fillRect(115 + x, 79, 1, 1);
        g2d.fillRect(112 + x, 80, 1, 1);
        g2d.fillRect(101 + x, 82, 1, 1);
        g2d.fillRect(110 + x, 82, 1, 1);
        g2d.fillRect(121 + x, 82, 1, 1);
        g2d.fillRect(100 + x, 83, 1, 2);
        g2d.fillRect(108 + x, 83, 1, 1);
        g2d.fillRect(115 + x, 83, 1, 1);
        g2d.fillRect(119 + x, 83, 1, 1);
        g2d.fillRect(107 + x, 84, 1, 1);
        g2d.fillRect(108 + x, 85, 1, 1);
        g2d.fillRect(112 + x, 85, 1, 1);
        g2d.fillRect(121 + x, 85, 1, 1);
        g2d.fillRect(98 + x, 86, 1, 1);
        g2d.fillRect(100 + x, 86, 1, 1);
        g2d.fillRect(102 + x, 86, 1, 1);
        g2d.fillRect(120 + x, 86, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(101 + x, 77, 1, 2);
        g2d.fillRect(118 + x, 78, 1, 1);
        g2d.fillRect(102 + x, 81, 1, 1);
        g2d.fillRect(110 + x, 81, 1, 1);
        g2d.fillRect(105 + x, 82, 1, 1);
        g2d.fillRect(109 + x, 82, 1, 1);
        g2d.fillRect(116 + x, 82, 1, 1);
        g2d.fillRect(107 + x, 83, 1, 1);
        g2d.fillRect(114 + x, 83, 1, 1);
        g2d.fillRect(121 + x, 83, 1, 1);
        g2d.fillRect(109 + x, 84, 1, 1);
        g2d.fillRect(111 + x, 84, 1, 1);
        g2d.fillRect(120 + x, 84, 1, 2);
        g2d.fillRect(99 + x, 85, 1, 1);
        g2d.fillRect(115 + x, 86, 1, 1);
        g2d.fillRect(118 + x, 86, 1, 1);
        g2d.fillRect(102 + x, 87, 1, 1);
        g2d.fillRect(108 + x, 87, 1, 1);
        g2d.fillRect(111 + x, 87, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(119 + x, 77, 1, 1);
        g2d.fillRect(100 + x, 80, 1, 1);
        g2d.fillRect(101 + x, 81, 1, 1);
        g2d.fillRect(120 + x, 82, 1, 1);
        g2d.fillRect(108 + x, 88, 1, 1);
    }

    public void drawBottom(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(122 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(104 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));
        g2d.fillRect(122 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(123 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(97 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(112 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(117 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(110 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(112 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(110 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6, ImageUtilities.NEG_GREY_5));
        g2d.fillRect(96 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(119 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(121 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(97 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(116 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(95 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(117 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(110 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(112 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(116 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(109 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(93 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(110 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(112 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(115 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(127 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(122 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(100 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(104 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(111 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(115 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(97 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(108 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(112 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 98 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(126 + x, 98 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(96 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(106 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(116 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(97 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(106 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(109 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 98 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(102 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(119 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(121 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(100 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(119 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(125 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(102 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(108 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(123 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(128 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(106 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(114 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(127 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(103 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(108 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(124 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(117 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(124 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(120 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(123 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(111 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(116 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(95 + x, 98 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(123 + x, 98 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(120 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(108 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(126 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(102 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(118 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(97 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(99 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(103 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(106 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(114 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(124 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(96 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(101 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(104 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(98 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(107 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(116 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(105 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(111 + x, 107 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(96 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(98 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(100 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(124 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);
        g2d.fillRect(95 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(102 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(105 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(107 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(109 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 4);
        g2d.fillRect(111 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(118 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(120 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);
        g2d.fillRect(125 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(108 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(113 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);
        g2d.fillRect(126 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(101 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(115 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);
        g2d.fillRect(118 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 3);
        g2d.fillRect(122 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(125 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(92 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(98 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);
        g2d.fillRect(102 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(105 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(108 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(121 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(123 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(104 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(124 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(126 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(128 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(100 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(103 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(111 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(114 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(117 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(120 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);
        g2d.fillRect(107 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(108 + x, 107 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(114 + x, 107 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));
        g2d.fillRect(123 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(103 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(93 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(124 + x, 98 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);
        g2d.fillRect(126 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(103 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(106 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(115 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(127 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(126 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(120 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(122 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(128 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(119 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(98 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(102 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(107 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(118 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(123 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(108 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(119 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(116 + x, 107 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(95 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(97 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(98 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 3);
        g2d.fillRect(101 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(113 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);
        g2d.fillRect(94 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 3);
        g2d.fillRect(99 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(111 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(120 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(124 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(95 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(105 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(107 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(113 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(100 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(103 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(117 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(124 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(99 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(105 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(122 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(125 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(116 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(106 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(112 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(113 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(115 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(120 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(109 + x, 107 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(118 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(93 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(120 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(101 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(105 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(95 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(104 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(115 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(94 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(99 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(121 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(94 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(113 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(103 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(113 + x, 107 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(93 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(119 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(100 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(96 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(127 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(113 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(119 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(125 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(95 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(102 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(106 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(119 + x, 105 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(118 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(99 + x, 99 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(117 + x, 100 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(104 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 2, 1);
        g2d.fillRect(93 + x, 102 + y + prevY + prevPrevY + prevPrevPrevY, 1, 2);
        g2d.fillRect(126 + x, 103 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(96 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(127 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(104 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(114 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(128 + x, 101 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(121 + x, 104 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
        g2d.fillRect(109 + x, 106 + y + prevY + prevPrevY + prevPrevPrevY, 1, 1);
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6, ImageUtilities.NEG_GREY_5));
        g2d.fillRect(117 + x, 91 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(120 + x, 88 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(99 + x, 87 + y + prevY, 1, 3);
        g2d.fillRect(103 + x, 89 + y + prevY, 2, 1);
        g2d.fillRect(104 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(107 + x, 90 + y + prevY, 1, 3);
        g2d.fillRect(116 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(103 + x, 91 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(97 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(103 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(98 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(114 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(108 + x, 93 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 91 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 86 + y + prevY, 1, 1);
        g2d.fillRect(104 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(117 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(121 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(117 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(102 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(112 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(122 + x, 91 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 90 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(117 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(113 + x, 92 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(113 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(107 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(116 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(108 + x, 92 + y + prevY, 1, 1);
        g2d.fillRect(107 + x, 93 + y + prevY, 1, 1);
        g2d.fillRect(113 + x, 93 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 86 + y + prevY, 1, 1);
        g2d.fillRect(121 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(100 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(106 + x, 88 + y + prevY, 2, 1);
        g2d.fillRect(110 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(117 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(98 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(109 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(113 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(120 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(103 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(110 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(114 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(103 + x, 92 + y + prevY, 1, 1);
        g2d.fillRect(109 + x, 92 + y + prevY, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(100 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(121 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(98 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(109 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(110 + x, 93 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(119 + x, 87 + y + prevY, 2, 1);
        g2d.fillRect(105 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(109 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(114 + x, 88 + y + prevY, 1, 2);
        g2d.fillRect(97 + x, 89 + y + prevY, 1, 2);
        g2d.fillRect(106 + x, 89 + y + prevY, 1, 4);
        g2d.fillRect(110 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(112 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(119 + x, 89 + y + prevY, 1, 4);
        g2d.fillRect(100 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(113 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(120 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(104 + x, 91 + y + prevY, 1, 2);
        g2d.fillRect(105 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(108 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(110 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(115 + x, 92 + y + prevY, 2, 1);
        g2d.fillRect(109 + x, 93 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(101 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(115 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(97 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(121 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(112 + x, 92 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(101 + x, 86 + y + prevY, 1, 1);
        g2d.fillRect(112 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(116 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(123 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(111 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(118 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(100 + x, 91 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(115 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(118 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(105 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(99 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(115 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(120 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(112 + x, 93 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(119 + x, 86 + y + prevY, 1, 1);
        g2d.fillRect(121 + x, 86 + y + prevY, 1, 1);
        g2d.fillRect(102 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(105 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(116 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(115 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(119 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(122 + x, 88 + y + prevY, 1, 2);
        g2d.fillRect(101 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(105 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(111 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(118 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(96 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(99 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(121 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(123 + x, 90 + y + prevY, 1, 2);
        g2d.fillRect(101 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(111 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(118 + x, 91 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(98 + x, 86 + y + prevY, 1, 2);
        g2d.fillRect(101 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(118 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(122 + x, 87 + y + prevY, 1, 1);
        g2d.fillRect(102 + x, 88 + y + prevY, 1, 2);
        g2d.fillRect(108 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(111 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(123 + x, 88 + y + prevY, 1, 1);
        g2d.fillRect(115 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(101 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(108 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(122 + x, 90 + y + prevY, 1, 1);
        g2d.fillRect(96 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(102 + x, 91 + y + prevY, 1, 2);
        g2d.fillRect(116 + x, 91 + y + prevY, 1, 1);
        g2d.fillRect(105 + x, 92 + y + prevY, 1, 1);
        g2d.fillRect(111 + x, 92 + y + prevY, 1, 1);
        g2d.fillRect(114 + x, 92 + y + prevY, 1, 1);
        g2d.fillRect(118 + x, 92 + y + prevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(99 + x, 86 + y + prevY, 1, 1);
        g2d.fillRect(108 + x, 89 + y + prevY, 1, 1);
        g2d.fillRect(117 + x, 92 + y + prevY, 1, 1);
        g2d.fillRect(111 + x, 93 + y + prevY, 1, 1);
    }

    public void drawMiddle1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));
        g2d.fillRect(123 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(95 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(107 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(98 + x, 96 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(121 + x, 96 + y + prevY + prevPrevY, 1, 4);
        g2d.fillRect(104 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(116 + x, 97 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(99 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(112 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(98 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(105 + x, 99 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(117 + x, 99 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(104 + x, 100 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(112 + x, 100 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(116 + x, 100 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6, ImageUtilities.NEG_GREY_5));
        g2d.fillRect(98 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(104 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(111 + x, 99 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(114 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(95 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(94 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(122 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(104 + x, 99 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(122 + x, 93 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(108 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(118 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(123 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(95 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(94 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(98 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(113 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(122 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(110 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(117 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(112 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(116 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(122 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(109 + x, 100 + y + prevY + prevPrevY, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(95 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(124 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(125 + x, 97 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(97 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(103 + x, 99 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(110 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(107 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(103 + x, 95 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(123 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(106 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(119 + x, 97 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 99 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));
        g2d.fillRect(115 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(109 + x, 98 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(102 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(99 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(109 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(102 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(105 + x, 98 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 92 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 100 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(122 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(103 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(119 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(124 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(110 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(114 + x, 94 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(98 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(100 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(96 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(102 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(106 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(108 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(110 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(115 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(95 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(114 + x, 98 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(126 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(107 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(110 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(103 + x, 100 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(111 + x, 100 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(113 + x, 100 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 91 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(122 + x, 91 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(97 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(115 + x, 92 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(102 + x, 93 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(109 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(98 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(119 + x, 94 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(97 + x, 95 + y + prevY + prevPrevY, 1, 3);
        g2d.fillRect(108 + x, 95 + y + prevY + prevPrevY, 3, 1);
        g2d.fillRect(119 + x, 96 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(122 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(125 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(103 + x, 97 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(105 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(107 + x, 97 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(114 + x, 97 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(117 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(120 + x, 97 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(115 + x, 98 + y + prevY + prevPrevY, 1, 3);
        g2d.fillRect(118 + x, 98 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(123 + x, 98 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(99 + x, 99 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(108 + x, 99 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(113 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(119 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(106 + x, 100 + y + prevY + prevPrevY, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(113 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(106 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(116 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(118 + x, 96 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(99 + x, 91 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(120 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(107 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(123 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(121 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(124 + x, 94 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(119 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(113 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(110 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(124 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(101 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(108 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(102 + x, 99 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(96 + x, 91 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(120 + x, 91 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(123 + x, 91 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(99 + x, 92 + y + prevY + prevPrevY, 1, 3);
        g2d.fillRect(103 + x, 92 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(97 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(101 + x, 93 + y + prevY + prevPrevY, 1, 4);
        g2d.fillRect(104 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(106 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(113 + x, 93 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(116 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(118 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(120 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(100 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(103 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(109 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(117 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(96 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(105 + x, 95 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(112 + x, 95 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(118 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(120 + x, 95 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(125 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(107 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(109 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(114 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(116 + x, 96 + y + prevY + prevPrevY, 2, 1);
        g2d.fillRect(96 + x, 97 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(100 + x, 97 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(102 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(108 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(112 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(123 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(113 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(101 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(106 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(120 + x, 99 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(114 + x, 100 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(101 + x, 91 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(114 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(117 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(119 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(105 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(99 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(111 + x, 96 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(112 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(111 + x, 94 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(97 + x, 91 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(105 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(96 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(106 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(112 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(117 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(112 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(123 + x, 96 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(121 + x, 91 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(100 + x, 92 + y + prevY + prevPrevY, 1, 2);
        g2d.fillRect(111 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(117 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(121 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(104 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(122 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(100 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(104 + x, 96 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(106 + x, 98 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(111 + x, 98 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(100 + x, 91 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(101 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(105 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(116 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(121 + x, 92 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(98 + x, 93 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(116 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(104 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(101 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(118 + x, 97 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(119 + x, 98 + y + prevY + prevPrevY, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(97 + x, 94 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(111 + x, 95 + y + prevY + prevPrevY, 1, 1);
        g2d.fillRect(111 + x, 97 + y + prevY + prevPrevY, 1, 1);
    }
    int prevPrevPrevY = 0;
    int prevPrevY = 0;
    int prevY = 0;
}
