/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

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
public class Cake0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Cake0()
    {
        super(2);
    }

    public Cake0(int layer)
    {
        super(layer);
    }

    public Cake0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Cake0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft3(int x, int y, GraphicsMap g2d)
    {

    }


    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        int x = offsetX + 25;
        int y = -28;

        x+=shiftX;
        y+=shiftY;
        paintCake(x,y,g2d);
    }

    public void paintCake(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(58 + x, 64 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));
        g2d.fillRect(69 + x, 81 + y, 4, 1);
        g2d.fillRect(72 + x, 82 + y, 1, 2);
        g2d.fillRect(44 + x, 83 + y, 28, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(44 + x, 81 + y, 1, 2);
        g2d.fillRect(45 + x, 81 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6, ImageUtilities.NEG_GREY_5));
        g2d.fillRect(48 + x, 81 + y, 21, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(57 + x, 67 + y, 3, 1);
        g2d.fillRect(56 + x, 68 + y, 1, 6);
        g2d.fillRect(60 + x, 68 + y, 1, 6);
        g2d.fillRect(57 + x, 69 + y, 1, 1);
        g2d.fillRect(58 + x, 70 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(57 + x, 70 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(68 + x, 82 + y, 1, 1);
        g2d.fillRect(70 + x, 82 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(58 + x, 61 + y, 1, 1);
        g2d.fillRect(57 + x, 62 + y, 1, 1);
        g2d.fillRect(59 + x, 62 + y, 1, 1);
        g2d.fillRect(56 + x, 63 + y, 1, 2);
        g2d.fillRect(60 + x, 63 + y, 1, 2);
        g2d.fillRect(57 + x, 65 + y, 1, 1);
        g2d.fillRect(59 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(58 + x, 68 + y, 2, 1);
        g2d.fillRect(58 + x, 71 + y, 1, 3);
        g2d.fillRect(59 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(45 + x, 82 + y, 1, 1);
        g2d.fillRect(59 + x, 82 + y, 1, 1);
        g2d.fillRect(61 + x, 82 + y, 1, 1);
        g2d.fillRect(63 + x, 82 + y, 1, 1);
        g2d.fillRect(65 + x, 82 + y, 3, 1);
        g2d.fillRect(69 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(58 + x, 63 + y, 2, 1);
        g2d.fillRect(59 + x, 64 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(46 + x, 82 + y, 2, 1);
        g2d.fillRect(52 + x, 82 + y, 1, 1);
        g2d.fillRect(54 + x, 82 + y, 5, 1);
        g2d.fillRect(60 + x, 82 + y, 1, 1);
        g2d.fillRect(62 + x, 82 + y, 1, 1);
        g2d.fillRect(64 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(52 + x, 76 + y, 1, 1);
        g2d.fillRect(55 + x, 76 + y, 2, 1);
        g2d.fillRect(60 + x, 76 + y, 2, 1);
        g2d.fillRect(64 + x, 76 + y, 1, 1);
        g2d.fillRect(50 + x, 77 + y, 2, 1);
        g2d.fillRect(53 + x, 77 + y, 2, 1);
        g2d.fillRect(57 + x, 77 + y, 3, 1);
        g2d.fillRect(62 + x, 77 + y, 2, 1);
        g2d.fillRect(65 + x, 77 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(51 + x, 73 + y, 5, 1);
        g2d.fillRect(61 + x, 73 + y, 5, 1);
        g2d.fillRect(50 + x, 74 + y, 1, 1);
        g2d.fillRect(66 + x, 74 + y, 1, 1);
        g2d.fillRect(49 + x, 75 + y, 1, 6);
        g2d.fillRect(67 + x, 75 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(52 + x, 77 + y, 1, 1);
        g2d.fillRect(55 + x, 77 + y, 2, 1);
        g2d.fillRect(60 + x, 77 + y, 2, 1);
        g2d.fillRect(64 + x, 77 + y, 1, 1);
        g2d.fillRect(50 + x, 78 + y, 1, 3);
        g2d.fillRect(51 + x, 78 + y, 1, 3);
        g2d.fillRect(53 + x, 78 + y, 2, 1);
        g2d.fillRect(57 + x, 78 + y, 3, 1);
        g2d.fillRect(62 + x, 78 + y, 2, 1);
        g2d.fillRect(65 + x, 78 + y, 1, 3);
        g2d.fillRect(66 + x, 78 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(57 + x, 68 + y, 1, 1);
        g2d.fillRect(58 + x, 69 + y, 2, 1);
        g2d.fillRect(59 + x, 71 + y, 1, 2);
        g2d.fillRect(51 + x, 74 + y, 2, 1);
        g2d.fillRect(54 + x, 74 + y, 1, 3);
        g2d.fillRect(55 + x, 74 + y, 1, 2);
        g2d.fillRect(56 + x, 74 + y, 2, 1);
        g2d.fillRect(59 + x, 74 + y, 1, 3);
        g2d.fillRect(60 + x, 74 + y, 3, 1);
        g2d.fillRect(64 + x, 74 + y, 1, 2);
        g2d.fillRect(65 + x, 74 + y, 1, 1);
        g2d.fillRect(50 + x, 75 + y, 1, 2);
        g2d.fillRect(52 + x, 75 + y, 2, 1);
        g2d.fillRect(57 + x, 75 + y, 1, 2);
        g2d.fillRect(58 + x, 75 + y, 1, 2);
        g2d.fillRect(61 + x, 75 + y, 3, 1);
        g2d.fillRect(66 + x, 75 + y, 1, 2);
        g2d.fillRect(51 + x, 76 + y, 1, 1);
        g2d.fillRect(53 + x, 76 + y, 1, 1);
        g2d.fillRect(62 + x, 76 + y, 2, 1);
        g2d.fillRect(65 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(48 + x, 82 + y, 4, 1);
        g2d.fillRect(53 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(58 + x, 62 + y, 1, 1);
        g2d.fillRect(57 + x, 63 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(52 + x, 78 + y, 1, 3);
        g2d.fillRect(64 + x, 78 + y, 1, 3);
        g2d.fillRect(53 + x, 79 + y, 1, 2);
        g2d.fillRect(63 + x, 79 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(53 + x, 74 + y, 1, 1);
        g2d.fillRect(58 + x, 74 + y, 1, 1);
        g2d.fillRect(63 + x, 74 + y, 1, 1);
        g2d.fillRect(51 + x, 75 + y, 1, 1);
        g2d.fillRect(56 + x, 75 + y, 1, 1);
        g2d.fillRect(60 + x, 75 + y, 1, 1);
        g2d.fillRect(65 + x, 75 + y, 1, 1);
        g2d.fillRect(55 + x, 78 + y, 1, 3);
        g2d.fillRect(56 + x, 78 + y, 1, 3);
        g2d.fillRect(60 + x, 78 + y, 1, 3);
        g2d.fillRect(61 + x, 78 + y, 1, 3);
        g2d.fillRect(54 + x, 79 + y, 1, 2);
        g2d.fillRect(57 + x, 79 + y, 1, 2);
        g2d.fillRect(58 + x, 79 + y, 1, 2);
        g2d.fillRect(59 + x, 79 + y, 1, 2);
        g2d.fillRect(62 + x, 79 + y, 1, 2);
    }
}
