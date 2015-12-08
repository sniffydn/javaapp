/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.l;

import clts.SuperTL;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower15 extends SuperTL
{
    int prevY = 0;
    /** Creates a new instance of GenericClothes */
    public TopLower15()
    {
        super(2);
        slenderB = true;
        prep = true;
    }

    public TopLower15(int layer)
    {
        super(layer);
        slenderB = true;
        prep = true;
    }

    public TopLower15(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        slenderB = true;
        prep = true;
    }

    public TopLower15(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        prep = true;
    }

    public void draw1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 56 + y, 1, 6);
        g2d.fillRect(102 + x, 61 + y, 1, 4);
        g2d.fillRect(116 + x, 62 + y, 1, 7);
        g2d.fillRect(103 + x, 64 + y, 1, 9);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 6);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(100 + x, 79 + y, 1, 2);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(99 + x, 80 + y, 1, 5);
        g2d.fillRect(121 + x, 80 + y, 1, 5);
        g2d.fillRect(100 + x, 84 + y, 1, 2);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 2, 1);
        g2d.fillRect(102 + x, 86 + y, 3, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 3, 1);
        g2d.fillRect(116 + x, 87 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 3, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(116 + x, 56 + y, 1, 6);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 62 + y, 1, 10);
        g2d.fillRect(114 + x, 63 + y, 1, 7);
        g2d.fillRect(104 + x, 64 + y, 1, 10);
        g2d.fillRect(116 + x, 69 + y, 1, 5);
        g2d.fillRect(117 + x, 71 + y, 1, 5);
        g2d.fillRect(103 + x, 73 + y, 1, 6);
        g2d.fillRect(118 + x, 73 + y, 1, 8);
        g2d.fillRect(102 + x, 77 + y, 1, 4);
        g2d.fillRect(119 + x, 79 + y, 1, 6);
        g2d.fillRect(101 + x, 80 + y, 1, 5);
        g2d.fillRect(120 + x, 80 + y, 1, 5);
        g2d.fillRect(100 + x, 81 + y, 1, 3);
        g2d.fillRect(102 + x, 83 + y, 1, 3);
        g2d.fillRect(118 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 4, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 4);
        g2d.fillRect(114 + x, 85 + y, 1, 4);
        g2d.fillRect(115 + x, 85 + y, 1, 3);
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 86 + y, 8, 1);
        g2d.fillRect(108 + x, 87 + y, 5, 1);
        g2d.fillRect(111 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 5);
        g2d.fillRect(104 + x, 56 + y, 1, 8);
        g2d.fillRect(105 + x, 56 + y, 1, 29);
        g2d.fillRect(106 + x, 56 + y, 1, 29);
        g2d.fillRect(107 + x, 56 + y, 1, 29);
        g2d.fillRect(108 + x, 56 + y, 1, 30);
        g2d.fillRect(109 + x, 56 + y, 1, 30);
        g2d.fillRect(110 + x, 56 + y, 1, 30);
        g2d.fillRect(111 + x, 56 + y, 1, 30);
        g2d.fillRect(112 + x, 56 + y, 1, 30);
        g2d.fillRect(113 + x, 56 + y, 1, 29);
        g2d.fillRect(114 + x, 56 + y, 1, 7);
        g2d.fillRect(115 + x, 56 + y, 1, 6);
        g2d.fillRect(114 + x, 70 + y, 1, 15);
        g2d.fillRect(115 + x, 72 + y, 1, 13);
        g2d.fillRect(104 + x, 74 + y, 1, 11);
        g2d.fillRect(116 + x, 74 + y, 1, 11);
        g2d.fillRect(117 + x, 76 + y, 1, 8);
        g2d.fillRect(103 + x, 79 + y, 1, 5);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 2);
    }
    public void draw2(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 56 + y, 1, 6);
        g2d.fillRect(102 + x, 61 + y, 1, 4);
        g2d.fillRect(116 + x, 62 + y, 1, 7);
        g2d.fillRect(103 + x, 64 + y, 1, 9);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 6);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(100 + x, 79 + y, 1, 2);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(99 + x, 80 + y, 1, 6);
        g2d.fillRect(121 + x, 80 + y, 1, 6);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 3, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 3, 1);
        g2d.fillRect(116 + x, 88 + y, 2, 1);
        g2d.fillRect(108 + x, 89 + y, 3, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(116 + x, 56 + y, 1, 6);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 62 + y, 1, 10);
        g2d.fillRect(114 + x, 63 + y, 1, 7);
        g2d.fillRect(104 + x, 64 + y, 1, 10);
        g2d.fillRect(116 + x, 69 + y, 1, 5);
        g2d.fillRect(117 + x, 71 + y, 1, 5);
        g2d.fillRect(103 + x, 73 + y, 1, 6);
        g2d.fillRect(118 + x, 73 + y, 1, 8);
        g2d.fillRect(102 + x, 77 + y, 1, 4);
        g2d.fillRect(119 + x, 79 + y, 1, 7);
        g2d.fillRect(101 + x, 80 + y, 1, 6);
        g2d.fillRect(120 + x, 80 + y, 1, 6);
        g2d.fillRect(100 + x, 81 + y, 1, 4);
        g2d.fillRect(102 + x, 84 + y, 1, 3);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(103 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 4, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 4);
        g2d.fillRect(114 + x, 86 + y, 1, 4);
        g2d.fillRect(115 + x, 86 + y, 1, 3);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 8, 1);
        g2d.fillRect(108 + x, 88 + y, 5, 1);
        g2d.fillRect(111 + x, 89 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 5);
        g2d.fillRect(104 + x, 56 + y, 1, 8);
        g2d.fillRect(105 + x, 56 + y, 1, 30);
        g2d.fillRect(106 + x, 56 + y, 1, 30);
        g2d.fillRect(107 + x, 56 + y, 1, 30);
        g2d.fillRect(108 + x, 56 + y, 1, 31);
        g2d.fillRect(109 + x, 56 + y, 1, 31);
        g2d.fillRect(110 + x, 56 + y, 1, 31);
        g2d.fillRect(111 + x, 56 + y, 1, 31);
        g2d.fillRect(112 + x, 56 + y, 1, 31);
        g2d.fillRect(113 + x, 56 + y, 1, 30);
        g2d.fillRect(114 + x, 56 + y, 1, 7);
        g2d.fillRect(115 + x, 56 + y, 1, 6);
        g2d.fillRect(114 + x, 70 + y, 1, 16);
        g2d.fillRect(115 + x, 72 + y, 1, 14);
        g2d.fillRect(104 + x, 74 + y, 1, 12);
        g2d.fillRect(116 + x, 74 + y, 1, 12);
        g2d.fillRect(117 + x, 76 + y, 1, 9);
        g2d.fillRect(103 + x, 79 + y, 1, 6);
        g2d.fillRect(102 + x, 81 + y, 1, 3);
        g2d.fillRect(118 + x, 81 + y, 1, 3);
    }
    public void draw3(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 56 + y, 1, 6);
        g2d.fillRect(102 + x, 61 + y, 1, 4);
        g2d.fillRect(116 + x, 62 + y, 1, 7);
        g2d.fillRect(103 + x, 64 + y, 1, 9);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 6);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 7);
        g2d.fillRect(121 + x, 80 + y, 1, 6);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 3, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 3, 1);
        g2d.fillRect(116 + x, 89 + y, 2, 1);
        g2d.fillRect(108 + x, 90 + y, 3, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(116 + x, 56 + y, 1, 6);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 62 + y, 1, 10);
        g2d.fillRect(114 + x, 63 + y, 1, 7);
        g2d.fillRect(104 + x, 64 + y, 1, 10);
        g2d.fillRect(116 + x, 69 + y, 1, 5);
        g2d.fillRect(117 + x, 71 + y, 1, 5);
        g2d.fillRect(103 + x, 73 + y, 1, 6);
        g2d.fillRect(118 + x, 73 + y, 1, 8);
        g2d.fillRect(102 + x, 77 + y, 1, 4);
        g2d.fillRect(119 + x, 79 + y, 1, 8);
        g2d.fillRect(101 + x, 80 + y, 1, 7);
        g2d.fillRect(120 + x, 80 + y, 1, 6);
        g2d.fillRect(102 + x, 84 + y, 1, 4);
        g2d.fillRect(118 + x, 84 + y, 1, 4);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(104 + x, 87 + y, 4, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 3);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(105 + x, 88 + y, 6, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 3);
        g2d.fillRect(108 + x, 89 + y, 6, 1);
        g2d.fillRect(111 + x, 90 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 5);
        g2d.fillRect(104 + x, 56 + y, 1, 8);
        g2d.fillRect(105 + x, 56 + y, 1, 31);
        g2d.fillRect(106 + x, 56 + y, 1, 31);
        g2d.fillRect(107 + x, 56 + y, 1, 31);
        g2d.fillRect(108 + x, 56 + y, 1, 32);
        g2d.fillRect(109 + x, 56 + y, 1, 32);
        g2d.fillRect(110 + x, 56 + y, 1, 32);
        g2d.fillRect(111 + x, 56 + y, 1, 33);
        g2d.fillRect(112 + x, 56 + y, 1, 33);
        g2d.fillRect(113 + x, 56 + y, 1, 33);
        g2d.fillRect(114 + x, 56 + y, 1, 7);
        g2d.fillRect(115 + x, 56 + y, 1, 6);
        g2d.fillRect(114 + x, 70 + y, 1, 18);
        g2d.fillRect(115 + x, 72 + y, 1, 15);
        g2d.fillRect(104 + x, 74 + y, 1, 13);
        g2d.fillRect(116 + x, 74 + y, 1, 13);
        g2d.fillRect(117 + x, 76 + y, 1, 10);
        g2d.fillRect(103 + x, 79 + y, 1, 7);
        g2d.fillRect(102 + x, 81 + y, 1, 3);
        g2d.fillRect(118 + x, 81 + y, 1, 3);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        if(offsetY == -1 || prevY == -1)
        {
            draw1(offsetX, 0, g2d);
        }
        else if(offsetY == 1 || prevY == 1)
        {
            draw3(offsetX, 0, g2d);
        }
        else
        {
            draw2(offsetX, 0, g2d);
        }
        prevY = offsetY;
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }
}
