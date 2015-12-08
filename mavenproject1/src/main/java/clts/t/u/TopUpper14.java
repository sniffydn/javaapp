/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u;

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
public class TopUpper14 extends clts.SuperTU
{
    public TopUpper14()
    {
        super();
        prep = true;
        drs = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper14(String middle)
    {
        super(middle, 3);
        prep = true;
        drs = true;
    }

    public TopUpper14(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
        drs = true;
    }

    public TopUpper14(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
        drs = true;
    }

    public TopUpper14(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
        drs = true;
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        y+=2;
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 1);
        g2d.fillRect(122 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(122 + x, 53 + y, 1, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(121 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(123 + x, 52 + y, 1, 1);
        g2d.fillRect(97 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(123 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(120 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 49 + y, 22, 1);
        g2d.fillRect(97 + x, 50 + y, 2, 1);
        g2d.fillRect(121 + x, 50 + y, 2, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(124 + x, 53 + y, 1, 2);
        g2d.fillRect(97 + x, 55 + y, 1, 2);
        g2d.fillRect(123 + x, 55 + y, 1, 2);
        g2d.fillRect(98 + x, 57 + y, 1, 1);
        g2d.fillRect(122 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 59 + y, 1, 1);
        g2d.fillRect(120 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 51 + y, 22, 1);
        g2d.fillRect(97 + x, 52 + y, 2, 1);
        g2d.fillRect(121 + x, 52 + y, 2, 1);
        g2d.fillRect(123 + x, 53 + y, 1, 1);
        g2d.fillRect(97 + x, 54 + y, 2, 1);
        g2d.fillRect(122 + x, 54 + y, 1, 3);
        g2d.fillRect(98 + x, 55 + y, 1, 2);
        g2d.fillRect(99 + x, 55 + y, 1, 3);
        g2d.fillRect(121 + x, 55 + y, 1, 3);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 19, 1);
        g2d.fillRect(101 + x, 59 + y, 6, 1);
        g2d.fillRect(116 + x, 59 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 53 + y, 1, 2);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 3, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 18, 1);
        g2d.fillRect(107 + x, 59 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 53 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 3);
        g2d.fillRect(104 + x, 53 + y, 1, 3);
        g2d.fillRect(105 + x, 53 + y, 1, 3);
        g2d.fillRect(106 + x, 53 + y, 1, 3);
        g2d.fillRect(107 + x, 53 + y, 1, 3);
        g2d.fillRect(108 + x, 53 + y, 1, 3);
        g2d.fillRect(109 + x, 53 + y, 1, 3);
        g2d.fillRect(110 + x, 53 + y, 1, 3);
        g2d.fillRect(111 + x, 53 + y, 1, 3);
        g2d.fillRect(112 + x, 53 + y, 1, 3);
        g2d.fillRect(113 + x, 53 + y, 1, 3);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(115 + x, 53 + y, 1, 3);
        g2d.fillRect(116 + x, 53 + y, 1, 3);
        g2d.fillRect(117 + x, 53 + y, 1, 3);
        g2d.fillRect(118 + x, 53 + y, 1, 3);
        g2d.fillRect(119 + x, 53 + y, 1, 2);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(97 + x, 53 + y, 1, 1);
        g2d.fillRect(123 + x, 53 + y, 1, 1);
        g2d.fillRect(95 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(97 + x, 55 + y, 1, 1);
        g2d.fillRect(123 + x, 55 + y, 1, 1);
        g2d.fillRect(125 + x, 55 + y, 1, 1);
        g2d.fillRect(95 + x, 56 + y, 1, 1);
        g2d.fillRect(98 + x, 60 + y, 1, 1);
        g2d.fillRect(100 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 1);
        g2d.fillRect(120 + x, 60 + y, 1, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 1);
        g2d.fillRect(101 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 1);
        g2d.fillRect(119 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(122 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(124 + x, 54 + y, 1, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 1);
        g2d.fillRect(122 + x, 55 + y, 1, 1);
        g2d.fillRect(124 + x, 56 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(118 + x, 62 + y, 1, 1);
        g2d.fillRect(120 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 51 + y, 24, 1);
        g2d.fillRect(96 + x, 52 + y, 2, 1);
        g2d.fillRect(122 + x, 52 + y, 2, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 1);
        g2d.fillRect(124 + x, 53 + y, 1, 1);
        g2d.fillRect(125 + x, 54 + y, 1, 1);
        g2d.fillRect(95 + x, 55 + y, 1, 1);
        g2d.fillRect(125 + x, 56 + y, 1, 1);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(124 + x, 57 + y, 1, 2);
        g2d.fillRect(97 + x, 59 + y, 1, 1);
        g2d.fillRect(123 + x, 59 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 1, 1);
        g2d.fillRect(121 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 53 + y, 24, 1);
        g2d.fillRect(96 + x, 54 + y, 2, 1);
        g2d.fillRect(122 + x, 54 + y, 2, 1);
        g2d.fillRect(124 + x, 55 + y, 1, 1);
        g2d.fillRect(96 + x, 56 + y, 2, 1);
        g2d.fillRect(123 + x, 56 + y, 1, 3);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(98 + x, 57 + y, 1, 3);
        g2d.fillRect(122 + x, 57 + y, 1, 3);
        g2d.fillRect(99 + x, 58 + y, 1, 2);
        g2d.fillRect(121 + x, 58 + y, 1, 2);
        g2d.fillRect(100 + x, 59 + y, 21, 1);
        g2d.fillRect(100 + x, 61 + y, 6, 1);
        g2d.fillRect(117 + x, 61 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 50 + y, 24, 1);
        g2d.fillRect(96 + x, 51 + y, 2, 1);
        g2d.fillRect(122 + x, 51 + y, 2, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 1);
        g2d.fillRect(124 + x, 52 + y, 1, 1);
        g2d.fillRect(125 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 2);
        g2d.fillRect(99 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(122 + x, 56 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 3, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 2);
        g2d.fillRect(121 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 20, 1);
        g2d.fillRect(106 + x, 61 + y, 11, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 3);
        g2d.fillRect(103 + x, 55 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 3);
        g2d.fillRect(105 + x, 55 + y, 1, 3);
        g2d.fillRect(106 + x, 55 + y, 1, 3);
        g2d.fillRect(107 + x, 55 + y, 1, 3);
        g2d.fillRect(108 + x, 55 + y, 1, 3);
        g2d.fillRect(109 + x, 55 + y, 1, 3);
        g2d.fillRect(110 + x, 55 + y, 1, 3);
        g2d.fillRect(111 + x, 55 + y, 1, 3);
        g2d.fillRect(112 + x, 55 + y, 1, 3);
        g2d.fillRect(113 + x, 55 + y, 1, 3);
        g2d.fillRect(114 + x, 55 + y, 1, 3);
        g2d.fillRect(115 + x, 55 + y, 1, 3);
        g2d.fillRect(116 + x, 55 + y, 1, 3);
        g2d.fillRect(117 + x, 55 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 3);
        g2d.fillRect(119 + x, 55 + y, 1, 3);
        g2d.fillRect(120 + x, 55 + y, 1, 2);
        g2d.fillRect(99 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 1);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equals("c"))
        {
            drawC(x,y,g2d);
        }
        else
        {
            drawD(x,y,g2d);
        }
    }
}
