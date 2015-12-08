/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.s;

import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Srt11 extends clts.SuperTU
{
    public Srt11()
    {
        super();
        prep = true;
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt11(String middle)
    {
        super(middle, 3);
        prep = true;
        containsTL = true;
    }

    public Srt11(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
        containsTL = true;
    }

    public Srt11(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
        containsTL = true;
    }

    public Srt11(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
        containsTL = true;
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(98 + x, 51 + y, 1, 8);
        g2d.fillRect(99 + x, 51 + y, 1, 9);
        g2d.fillRect(100 + x, 51 + y, 2, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(100 + x, 56 + y, 1, 5);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 4);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 57 + y, 1, 4);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 5, 1);
        g2d.fillRect(113 + x, 59 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(107 + x, 50 + y, 5, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 5, 1);
        g2d.fillRect(119 + x, 51 + y, 2, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(101 + x, 52 + y, 1, 5);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 4, 1);
        g2d.fillRect(103 + x, 57 + y, 2, 1);
        g2d.fillRect(115 + x, 57 + y, 2, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(107 + x, 51 + y, 1, 2);
        g2d.fillRect(108 + x, 51 + y, 1, 2);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 2, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 3, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 2, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 52 + y, 1, 4);
        g2d.fillRect(109 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(110 + x, 52 + y, 1, 3);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 3);
        g2d.fillRect(105 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(114 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(113 + x, 51 + y, 1, 3);
        g2d.fillRect(111 + x, 52 + y, 2, 1);
        g2d.fillRect(114 + x, 52 + y, 3, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 2);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 2);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(110 + x, 60 + y, 5, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 4);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 8, 1);
        g2d.fillRect(114 + x, 63 + y, 2, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 2, 1);
        g2d.fillRect(107 + x, 66 + y, 2, 1);
        g2d.fillRect(115 + x, 66 + y, 2, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 2, 1);
        g2d.fillRect(112 + x, 67 + y, 3, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 6);
        g2d.fillRect(103 + x, 69 + y, 1, 3);
        g2d.fillRect(104 + x, 69 + y, 1, 2);
        g2d.fillRect(105 + x, 69 + y, 1, 2);
        g2d.fillRect(116 + x, 69 + y, 1, 3);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 4);
        g2d.fillRect(102 + x, 71 + y, 1, 3);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 3, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 74 + y, 12, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 2, 1);
        g2d.fillRect(111 + x, 61 + y, 4, 1);
        g2d.fillRect(109 + x, 63 + y, 5, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 2);
        g2d.fillRect(112 + x, 64 + y, 3, 1);
        g2d.fillRect(107 + x, 65 + y, 4, 1);
        g2d.fillRect(116 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 67 + y, 1, 3);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 68 + y, 1, 2);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 2);
        g2d.fillRect(113 + x, 70 + y, 1, 2);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 2, 1);
        g2d.fillRect(108 + x, 71 + y, 5, 1);
        g2d.fillRect(103 + x, 72 + y, 2, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 2, 1);
        g2d.fillRect(112 + x, 73 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(109 + x, 64 + y, 2, 1);
        g2d.fillRect(114 + x, 65 + y, 2, 1);
        g2d.fillRect(112 + x, 66 + y, 2, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 2);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 2, 1);
        g2d.fillRect(108 + x, 70 + y, 2, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 2);
        g2d.fillRect(112 + x, 72 + y, 3, 1);
        g2d.fillRect(108 + x, 73 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 64 + y, 2, 1);
        g2d.fillRect(110 + x, 66 + y, 2, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 3, 1);
        g2d.fillRect(106 + x, 72 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 2);
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 2);
        g2d.fillRect(107 + x, 62 + y, 1, 2);
        g2d.fillRect(104 + x, 64 + y, 1, 3);
        g2d.fillRect(106 + x, 64 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(103 + x, 67 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 3, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 3);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 3);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        drawLower(x,0,g2d);

    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        draw(offsetX, 0, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        if(middle.equals("b"))
        {
            drawB(offsetX,offsetY,g2d);
        }
    }
}
