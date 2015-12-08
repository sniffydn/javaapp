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
public class Aprn0 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Aprn0()
    {
        super();
        includeInAutoPick = false;
    }

    public Aprn0(int layer)
    {
        super(layer);
        includeInAutoPick = false;
    }

    public Aprn0(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeInAutoPick = false;
    }

    public Aprn0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeInAutoPick = false;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintAT(x,y,g2d);
        if(step < 9)
            paintAL(x,y,g2d);
        else
            paintAR(x,y,g2d);

    }


    public void paintAL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(93 + x, 101 + y, 1, 2);
        g2d.fillRect(94 + x, 103 + y, 2, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 1);
        g2d.fillRect(96 + x, 104 + y, 4, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 1);
        g2d.fillRect(100 + x, 105 + y, 5, 1);
        g2d.fillRect(114 + x, 105 + y, 2, 1);
        g2d.fillRect(105 + x, 106 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 100 + y, 1, 1);
        g2d.fillRect(95 + x, 101 + y, 1, 1);
        g2d.fillRect(96 + x, 102 + y, 4, 1);
        g2d.fillRect(100 + x, 103 + y, 5, 1);
        g2d.fillRect(114 + x, 103 + y, 3, 1);
        g2d.fillRect(105 + x, 104 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 82 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 7);
        g2d.fillRect(105 + x, 83 + y, 13, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 3);
        g2d.fillRect(99 + x, 87 + y, 1, 4);
        g2d.fillRect(120 + x, 89 + y, 1, 4);
        g2d.fillRect(98 + x, 91 + y, 1, 3);
        g2d.fillRect(119 + x, 93 + y, 1, 4);
        g2d.fillRect(97 + x, 94 + y, 1, 2);
        g2d.fillRect(96 + x, 96 + y, 1, 2);
        g2d.fillRect(118 + x, 97 + y, 1, 4);
        g2d.fillRect(95 + x, 98 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 101 + y, 1, 2);
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 105 + y, 1, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 82 + y, 1, 3);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 4, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 84 + y, 7, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 3, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 6);
        g2d.fillRect(113 + x, 86 + y, 1, 3);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 3);
        g2d.fillRect(116 + x, 89 + y, 1, 4);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 3);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 11);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 96 + y, 1, 7);
        g2d.fillRect(115 + x, 98 + y, 1, 5);
        g2d.fillRect(114 + x, 99 + y, 1, 4);
        g2d.fillRect(113 + x, 100 + y, 1, 4);
        g2d.fillRect(111 + x, 101 + y, 2, 1);
        g2d.fillRect(112 + x, 102 + y, 1, 2);
        g2d.fillRect(105 + x, 103 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(95 + x, 102 + y, 1, 1);
        g2d.fillRect(97 + x, 103 + y, 1, 1);
        g2d.fillRect(99 + x, 103 + y, 1, 1);
        g2d.fillRect(100 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 104 + y, 1, 1);
        g2d.fillRect(104 + x, 104 + y, 1, 1);
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(107 + x, 105 + y, 1, 1);
        g2d.fillRect(109 + x, 105 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 1, 1);
        g2d.fillRect(113 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 83 + y, 3, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 2, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 6, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 6, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 4, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 4);
        g2d.fillRect(110 + x, 88 + y, 1, 3);
        g2d.fillRect(111 + x, 88 + y, 1, 2);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 3);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 5);
        g2d.fillRect(99 + x, 92 + y, 1, 2);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 4);
        g2d.fillRect(112 + x, 92 + y, 1, 3);
        g2d.fillRect(113 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 2);
        g2d.fillRect(115 + x, 92 + y, 1, 6);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 3);
        g2d.fillRect(110 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 2);
        g2d.fillRect(116 + x, 93 + y, 1, 3);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 1, 2);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(109 + x, 94 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 2, 1);
        g2d.fillRect(97 + x, 96 + y, 1, 2);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 3);
        g2d.fillRect(113 + x, 97 + y, 1, 3);
        g2d.fillRect(96 + x, 98 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 1);
        g2d.fillRect(112 + x, 98 + y, 1, 3);
        g2d.fillRect(97 + x, 99 + y, 1, 1);
        g2d.fillRect(111 + x, 99 + y, 1, 2);
        g2d.fillRect(95 + x, 100 + y, 2, 1);
        g2d.fillRect(109 + x, 100 + y, 1, 3);
        g2d.fillRect(110 + x, 100 + y, 1, 3);
        g2d.fillRect(96 + x, 101 + y, 4, 1);
        g2d.fillRect(107 + x, 101 + y, 1, 2);
        g2d.fillRect(108 + x, 101 + y, 1, 2);
        g2d.fillRect(100 + x, 102 + y, 7, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 8);
        g2d.fillRect(105 + x, 86 + y, 1, 7);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 7);
        g2d.fillRect(106 + x, 87 + y, 1, 5);
        g2d.fillRect(107 + x, 87 + y, 1, 4);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 7);
        g2d.fillRect(108 + x, 88 + y, 1, 2);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 2);
        g2d.fillRect(99 + x, 94 + y, 2, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 3);
        g2d.fillRect(114 + x, 94 + y, 1, 2);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 95 + y, 1, 7);
        g2d.fillRect(109 + x, 95 + y, 1, 5);
        g2d.fillRect(110 + x, 95 + y, 1, 5);
        g2d.fillRect(111 + x, 95 + y, 1, 4);
        g2d.fillRect(112 + x, 95 + y, 1, 3);
        g2d.fillRect(99 + x, 96 + y, 1, 5);
        g2d.fillRect(101 + x, 96 + y, 1, 6);
        g2d.fillRect(102 + x, 96 + y, 1, 6);
        g2d.fillRect(103 + x, 96 + y, 1, 6);
        g2d.fillRect(104 + x, 96 + y, 1, 6);
        g2d.fillRect(105 + x, 96 + y, 1, 6);
        g2d.fillRect(106 + x, 96 + y, 1, 6);
        g2d.fillRect(107 + x, 96 + y, 1, 5);
        g2d.fillRect(108 + x, 96 + y, 1, 5);
        g2d.fillRect(98 + x, 97 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(96 + x, 99 + y, 1, 1);
        g2d.fillRect(98 + x, 99 + y, 1, 2);
        g2d.fillRect(97 + x, 100 + y, 1, 1);
        g2d.fillRect(96 + x, 103 + y, 1, 1);
        g2d.fillRect(98 + x, 103 + y, 1, 1);
        g2d.fillRect(101 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 104 + y, 1, 1);
        g2d.fillRect(106 + x, 105 + y, 1, 1);
        g2d.fillRect(108 + x, 105 + y, 1, 1);
    }





    public void paintAR(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(129 + x, 101 + y, 1, 2);
        g2d.fillRect(105 + x, 103 + y, 1, 1);
        g2d.fillRect(127 + x, 103 + y, 2, 1);
        g2d.fillRect(106 + x, 104 + y, 1, 1);
        g2d.fillRect(123 + x, 104 + y, 4, 1);
        g2d.fillRect(107 + x, 105 + y, 2, 1);
        g2d.fillRect(118 + x, 105 + y, 5, 1);
        g2d.fillRect(109 + x, 106 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(128 + x, 100 + y, 1, 1);
        g2d.fillRect(127 + x, 101 + y, 1, 1);
        g2d.fillRect(123 + x, 102 + y, 4, 1);
        g2d.fillRect(106 + x, 103 + y, 3, 1);
        g2d.fillRect(118 + x, 103 + y, 5, 1);
        g2d.fillRect(109 + x, 104 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 82 + y, 1, 7);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(105 + x, 83 + y, 13, 1);
        g2d.fillRect(122 + x, 84 + y, 1, 3);
        g2d.fillRect(123 + x, 87 + y, 1, 4);
        g2d.fillRect(102 + x, 89 + y, 1, 4);
        g2d.fillRect(124 + x, 91 + y, 1, 3);
        g2d.fillRect(103 + x, 93 + y, 1, 4);
        g2d.fillRect(125 + x, 94 + y, 1, 2);
        g2d.fillRect(126 + x, 96 + y, 1, 2);
        g2d.fillRect(104 + x, 97 + y, 1, 4);
        g2d.fillRect(127 + x, 98 + y, 1, 2);
        g2d.fillRect(105 + x, 101 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(128 + x, 101 + y, 1, 2);
        g2d.fillRect(107 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 105 + y, 1, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 2, 1);
        g2d.fillRect(104 + x, 84 + y, 5, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 84 + y, 5, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 7);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 4);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 11);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 3);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 93 + y, 1, 4);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 96 + y, 1, 7);
        g2d.fillRect(107 + x, 98 + y, 1, 5);
        g2d.fillRect(108 + x, 99 + y, 1, 4);
        g2d.fillRect(109 + x, 100 + y, 1, 4);
        g2d.fillRect(110 + x, 101 + y, 1, 3);
        g2d.fillRect(111 + x, 101 + y, 1, 1);
        g2d.fillRect(111 + x, 103 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(127 + x, 102 + y, 1, 1);
        g2d.fillRect(123 + x, 103 + y, 1, 1);
        g2d.fillRect(125 + x, 103 + y, 1, 1);
        g2d.fillRect(108 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(120 + x, 104 + y, 1, 1);
        g2d.fillRect(122 + x, 104 + y, 1, 1);
        g2d.fillRect(109 + x, 105 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 1, 1);
        g2d.fillRect(113 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(120 + x, 82 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 1, 3);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 7);
        g2d.fillRect(114 + x, 85 + y, 1, 3);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 4);
        g2d.fillRect(112 + x, 86 + y, 1, 5);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 3);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 5);
        g2d.fillRect(122 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 6);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(110 + x, 92 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 4);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(123 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 3);
        g2d.fillRect(111 + x, 93 + y, 1, 2);
        g2d.fillRect(112 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 3);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 2, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 2);
        g2d.fillRect(119 + x, 94 + y, 1, 2);
        g2d.fillRect(124 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 2, 1);
        g2d.fillRect(123 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 96 + y, 1, 3);
        g2d.fillRect(124 + x, 96 + y, 2, 1);
        g2d.fillRect(109 + x, 97 + y, 1, 3);
        g2d.fillRect(125 + x, 97 + y, 1, 1);
        g2d.fillRect(110 + x, 98 + y, 1, 3);
        g2d.fillRect(124 + x, 98 + y, 1, 1);
        g2d.fillRect(126 + x, 98 + y, 1, 1);
        g2d.fillRect(111 + x, 99 + y, 1, 2);
        g2d.fillRect(125 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 100 + y, 1, 3);
        g2d.fillRect(113 + x, 100 + y, 1, 3);
        g2d.fillRect(126 + x, 100 + y, 1, 2);
        g2d.fillRect(127 + x, 100 + y, 1, 1);
        g2d.fillRect(114 + x, 101 + y, 1, 2);
        g2d.fillRect(115 + x, 101 + y, 1, 2);
        g2d.fillRect(123 + x, 101 + y, 3, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 7);
        g2d.fillRect(118 + x, 86 + y, 1, 8);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 4);
        g2d.fillRect(116 + x, 87 + y, 1, 5);
        g2d.fillRect(119 + x, 87 + y, 1, 7);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(120 + x, 88 + y, 1, 7);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(123 + x, 91 + y, 1, 1);
        g2d.fillRect(122 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(109 + x, 94 + y, 1, 3);
        g2d.fillRect(122 + x, 94 + y, 1, 8);
        g2d.fillRect(123 + x, 94 + y, 1, 1);
        g2d.fillRect(110 + x, 95 + y, 1, 3);
        g2d.fillRect(111 + x, 95 + y, 1, 4);
        g2d.fillRect(112 + x, 95 + y, 1, 5);
        g2d.fillRect(113 + x, 95 + y, 1, 5);
        g2d.fillRect(124 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 5);
        g2d.fillRect(115 + x, 96 + y, 1, 5);
        g2d.fillRect(116 + x, 96 + y, 1, 6);
        g2d.fillRect(117 + x, 96 + y, 1, 6);
        g2d.fillRect(118 + x, 96 + y, 1, 6);
        g2d.fillRect(119 + x, 96 + y, 1, 6);
        g2d.fillRect(120 + x, 96 + y, 1, 6);
        g2d.fillRect(121 + x, 96 + y, 1, 6);
        g2d.fillRect(123 + x, 96 + y, 1, 5);
        g2d.fillRect(124 + x, 97 + y, 1, 1);
        g2d.fillRect(125 + x, 98 + y, 1, 1);
        g2d.fillRect(124 + x, 99 + y, 1, 2);
        g2d.fillRect(126 + x, 99 + y, 1, 1);
        g2d.fillRect(125 + x, 100 + y, 1, 1);
        g2d.fillRect(124 + x, 103 + y, 1, 1);
        g2d.fillRect(126 + x, 103 + y, 1, 1);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(121 + x, 104 + y, 1, 1);
        g2d.fillRect(114 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
    }





    public void paintAT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 81 + y, 2, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 1);
        g2d.fillRect(97 + x, 84 + y, 1, 1);
        g2d.fillRect(95 + x, 85 + y, 2, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(93 + x, 86 + y, 2, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(90 + x, 87 + y, 3, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 1);
        g2d.fillRect(89 + x, 88 + y, 1, 3);
        g2d.fillRect(96 + x, 88 + y, 2, 1);
        g2d.fillRect(94 + x, 89 + y, 2, 1);
        g2d.fillRect(90 + x, 90 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 82 + y, 1, 3);
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 1);
        g2d.fillRect(97 + x, 87 + y, 1, 1);
        g2d.fillRect(95 + x, 88 + y, 1, 1);
        g2d.fillRect(93 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(99 + x, 83 + y, 1, 2);
        g2d.fillRect(98 + x, 85 + y, 1, 1);
        g2d.fillRect(97 + x, 86 + y, 1, 1);
        g2d.fillRect(95 + x, 87 + y, 2, 1);
        g2d.fillRect(93 + x, 88 + y, 2, 1);
        g2d.fillRect(90 + x, 89 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(98 + x, 84 + y, 1, 1);
        g2d.fillRect(97 + x, 85 + y, 1, 1);
        g2d.fillRect(95 + x, 86 + y, 2, 1);
        g2d.fillRect(93 + x, 87 + y, 2, 1);
        g2d.fillRect(90 + x, 88 + y, 3, 1);
    }





    public void paintBackAL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(122 + x, 101 + y, 1, 2);
        g2d.fillRect(120 + x, 103 + y, 2, 1);
        g2d.fillRect(98 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 4, 1);
        g2d.fillRect(99 + x, 104 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 5, 1);
        g2d.fillRect(100 + x, 105 + y, 2, 1);
        g2d.fillRect(102 + x, 106 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 100 + y, 1, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 4, 1);
        g2d.fillRect(111 + x, 103 + y, 5, 1);
        g2d.fillRect(99 + x, 103 + y, 3, 1);
        g2d.fillRect(102 + x, 104 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(111 + x, 82 + y, 3, 1);
        g2d.fillRect(96 + x, 82 + y, 2, 1);
        g2d.fillRect(94 + x, 82 + y, 1, 7);
        g2d.fillRect(98 + x, 83 + y, 13, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 3);
        g2d.fillRect(116 + x, 87 + y, 1, 4);
        g2d.fillRect(95 + x, 89 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 3);
        g2d.fillRect(96 + x, 93 + y, 1, 4);
        g2d.fillRect(118 + x, 94 + y, 1, 2);
        g2d.fillRect(119 + x, 96 + y, 1, 2);
        g2d.fillRect(97 + x, 97 + y, 1, 4);
        g2d.fillRect(120 + x, 98 + y, 1, 2);
        g2d.fillRect(98 + x, 101 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 101 + y, 1, 2);
        g2d.fillRect(100 + x, 104 + y, 1, 1);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(103 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(95 + x, 82 + y, 1, 3);
        g2d.fillRect(97 + x, 83 + y, 1, 2);
        g2d.fillRect(96 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(98 + x, 84 + y, 4, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 85 + y, 1, 1);
        g2d.fillRect(96 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(97 + x, 86 + y, 1, 1);
        g2d.fillRect(95 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 1);
        g2d.fillRect(97 + x, 88 + y, 1, 1);
        g2d.fillRect(95 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(96 + x, 89 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 1);
        g2d.fillRect(97 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 84 + y, 7, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(96 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(97 + x, 85 + y, 1, 1);
        g2d.fillRect(95 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 6);
        g2d.fillRect(102 + x, 86 + y, 1, 3);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 1);
        g2d.fillRect(96 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(97 + x, 87 + y, 1, 1);
        g2d.fillRect(95 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(98 + x, 88 + y, 1, 1);
        g2d.fillRect(96 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 3);
        g2d.fillRect(99 + x, 89 + y, 1, 4);
        g2d.fillRect(97 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 3);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(98 + x, 90 + y, 1, 11);
        g2d.fillRect(96 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 2);
        g2d.fillRect(97 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(96 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 4);
        g2d.fillRect(99 + x, 96 + y, 1, 7);
        g2d.fillRect(100 + x, 98 + y, 1, 5);
        g2d.fillRect(101 + x, 99 + y, 1, 4);
        g2d.fillRect(102 + x, 100 + y, 1, 4);
        g2d.fillRect(103 + x, 101 + y, 2, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 2);
        g2d.fillRect(104 + x, 103 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 1);
        g2d.fillRect(111 + x, 104 + y, 1, 1);
        g2d.fillRect(101 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 105 + y, 1, 1);
        g2d.fillRect(108 + x, 105 + y, 1, 1);
        g2d.fillRect(106 + x, 105 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(111 + x, 83 + y, 3, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 6, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 6, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 4, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 4);
        g2d.fillRect(105 + x, 88 + y, 1, 3);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 3);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 5);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 4);
        g2d.fillRect(103 + x, 92 + y, 1, 3);
        g2d.fillRect(102 + x, 92 + y, 1, 2);
        g2d.fillRect(101 + x, 92 + y, 1, 2);
        g2d.fillRect(100 + x, 92 + y, 1, 6);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(110 + x, 93 + y, 1, 3);
        g2d.fillRect(105 + x, 93 + y, 1, 2);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(99 + x, 93 + y, 1, 3);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(111 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(113 + x, 95 + y, 2, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 2);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 3);
        g2d.fillRect(102 + x, 97 + y, 1, 3);
        g2d.fillRect(119 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 3);
        g2d.fillRect(118 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 100 + y, 2, 1);
        g2d.fillRect(106 + x, 100 + y, 1, 3);
        g2d.fillRect(105 + x, 100 + y, 1, 3);
        g2d.fillRect(116 + x, 101 + y, 4, 1);
        g2d.fillRect(108 + x, 101 + y, 1, 2);
        g2d.fillRect(107 + x, 101 + y, 1, 2);
        g2d.fillRect(109 + x, 102 + y, 7, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 8);
        g2d.fillRect(110 + x, 86 + y, 1, 7);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 7);
        g2d.fillRect(109 + x, 87 + y, 1, 5);
        g2d.fillRect(108 + x, 87 + y, 1, 4);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 7);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 2, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 3);
        g2d.fillRect(101 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 7);
        g2d.fillRect(106 + x, 95 + y, 1, 5);
        g2d.fillRect(105 + x, 95 + y, 1, 5);
        g2d.fillRect(104 + x, 95 + y, 1, 4);
        g2d.fillRect(103 + x, 95 + y, 1, 3);
        g2d.fillRect(116 + x, 96 + y, 1, 5);
        g2d.fillRect(114 + x, 96 + y, 1, 6);
        g2d.fillRect(113 + x, 96 + y, 1, 6);
        g2d.fillRect(112 + x, 96 + y, 1, 6);
        g2d.fillRect(111 + x, 96 + y, 1, 6);
        g2d.fillRect(110 + x, 96 + y, 1, 6);
        g2d.fillRect(109 + x, 96 + y, 1, 6);
        g2d.fillRect(108 + x, 96 + y, 1, 5);
        g2d.fillRect(107 + x, 96 + y, 1, 5);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 1);
        g2d.fillRect(119 + x, 99 + y, 1, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 2);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 1);
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 104 + y, 1, 1);
        g2d.fillRect(109 + x, 105 + y, 1, 1);
        g2d.fillRect(107 + x, 105 + y, 1, 1);
    }





    public void paintBackAR(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(86 + x, 101 + y, 1, 2);
        g2d.fillRect(110 + x, 103 + y, 1, 1);
        g2d.fillRect(87 + x, 103 + y, 2, 1);
        g2d.fillRect(109 + x, 104 + y, 1, 1);
        g2d.fillRect(89 + x, 104 + y, 4, 1);
        g2d.fillRect(107 + x, 105 + y, 2, 1);
        g2d.fillRect(93 + x, 105 + y, 5, 1);
        g2d.fillRect(98 + x, 106 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(87 + x, 100 + y, 1, 1);
        g2d.fillRect(88 + x, 101 + y, 1, 1);
        g2d.fillRect(89 + x, 102 + y, 4, 1);
        g2d.fillRect(107 + x, 103 + y, 3, 1);
        g2d.fillRect(93 + x, 103 + y, 5, 1);
        g2d.fillRect(98 + x, 104 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 82 + y, 1, 7);
        g2d.fillRect(111 + x, 82 + y, 3, 1);
        g2d.fillRect(96 + x, 82 + y, 2, 1);
        g2d.fillRect(94 + x, 82 + y, 1, 2);
        g2d.fillRect(98 + x, 83 + y, 13, 1);
        g2d.fillRect(93 + x, 84 + y, 1, 3);
        g2d.fillRect(92 + x, 87 + y, 1, 4);
        g2d.fillRect(113 + x, 89 + y, 1, 4);
        g2d.fillRect(91 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 93 + y, 1, 4);
        g2d.fillRect(90 + x, 94 + y, 1, 2);
        g2d.fillRect(89 + x, 96 + y, 1, 2);
        g2d.fillRect(111 + x, 97 + y, 1, 4);
        g2d.fillRect(88 + x, 98 + y, 1, 2);
        g2d.fillRect(110 + x, 101 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(87 + x, 101 + y, 1, 2);
        g2d.fillRect(108 + x, 104 + y, 1, 1);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(103 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 5, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(111 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(98 + x, 84 + y, 5, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 7);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 4);
        g2d.fillRect(107 + x, 89 + y, 1, 3);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 11);
        g2d.fillRect(108 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 1, 3);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 4);
        g2d.fillRect(101 + x, 93 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 7);
        g2d.fillRect(108 + x, 98 + y, 1, 5);
        g2d.fillRect(107 + x, 99 + y, 1, 4);
        g2d.fillRect(106 + x, 100 + y, 1, 4);
        g2d.fillRect(105 + x, 101 + y, 1, 3);
        g2d.fillRect(104 + x, 101 + y, 1, 1);
        g2d.fillRect(98 + x, 103 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(88 + x, 102 + y, 1, 1);
        g2d.fillRect(92 + x, 103 + y, 1, 1);
        g2d.fillRect(90 + x, 103 + y, 1, 1);
        g2d.fillRect(107 + x, 104 + y, 1, 1);
        g2d.fillRect(97 + x, 104 + y, 1, 1);
        g2d.fillRect(95 + x, 104 + y, 1, 1);
        g2d.fillRect(93 + x, 104 + y, 1, 1);
        g2d.fillRect(106 + x, 105 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 1, 1);
        g2d.fillRect(100 + x, 105 + y, 1, 1);
        g2d.fillRect(98 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(95 + x, 82 + y, 1, 2);
        g2d.fillRect(97 + x, 83 + y, 1, 3);
        g2d.fillRect(96 + x, 83 + y, 1, 2);
        g2d.fillRect(94 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 7);
        g2d.fillRect(101 + x, 85 + y, 1, 3);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(99 + x, 85 + y, 1, 2);
        g2d.fillRect(98 + x, 85 + y, 1, 1);
        g2d.fillRect(95 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 4);
        g2d.fillRect(103 + x, 86 + y, 1, 5);
        g2d.fillRect(96 + x, 86 + y, 1, 1);
        g2d.fillRect(94 + x, 86 + y, 1, 1);
        g2d.fillRect(95 + x, 87 + y, 1, 1);
        g2d.fillRect(93 + x, 87 + y, 1, 1);
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(93 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 3);
        g2d.fillRect(94 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 5);
        g2d.fillRect(93 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 6);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(105 + x, 92 + y, 1, 3);
        g2d.fillRect(99 + x, 92 + y, 1, 4);
        g2d.fillRect(94 + x, 92 + y, 1, 1);
        g2d.fillRect(92 + x, 92 + y, 1, 2);
        g2d.fillRect(109 + x, 93 + y, 1, 3);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(103 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 3);
        g2d.fillRect(93 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 2, 1);
        g2d.fillRect(97 + x, 94 + y, 1, 2);
        g2d.fillRect(96 + x, 94 + y, 1, 2);
        g2d.fillRect(91 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(94 + x, 95 + y, 2, 1);
        g2d.fillRect(92 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 3);
        g2d.fillRect(90 + x, 96 + y, 2, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 3);
        g2d.fillRect(90 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 98 + y, 1, 3);
        g2d.fillRect(91 + x, 98 + y, 1, 1);
        g2d.fillRect(89 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 2);
        g2d.fillRect(90 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 3);
        g2d.fillRect(102 + x, 100 + y, 1, 3);
        g2d.fillRect(89 + x, 100 + y, 1, 2);
        g2d.fillRect(88 + x, 100 + y, 1, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 2);
        g2d.fillRect(100 + x, 101 + y, 1, 2);
        g2d.fillRect(90 + x, 101 + y, 3, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 1);
        g2d.fillRect(93 + x, 102 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(95 + x, 84 + y, 1, 1);
        g2d.fillRect(96 + x, 85 + y, 1, 1);
        g2d.fillRect(94 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 7);
        g2d.fillRect(97 + x, 86 + y, 1, 8);
        g2d.fillRect(95 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 4);
        g2d.fillRect(99 + x, 87 + y, 1, 5);
        g2d.fillRect(96 + x, 87 + y, 1, 7);
        g2d.fillRect(94 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 2);
        g2d.fillRect(95 + x, 88 + y, 1, 7);
        g2d.fillRect(93 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 89 + y, 1, 1);
        g2d.fillRect(93 + x, 90 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 1, 1);
        g2d.fillRect(92 + x, 91 + y, 1, 1);
        g2d.fillRect(93 + x, 92 + y, 1, 1);
        g2d.fillRect(94 + x, 93 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(93 + x, 94 + y, 1, 8);
        g2d.fillRect(92 + x, 94 + y, 1, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 3);
        g2d.fillRect(104 + x, 95 + y, 1, 4);
        g2d.fillRect(103 + x, 95 + y, 1, 5);
        g2d.fillRect(102 + x, 95 + y, 1, 5);
        g2d.fillRect(91 + x, 95 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 5);
        g2d.fillRect(100 + x, 96 + y, 1, 5);
        g2d.fillRect(99 + x, 96 + y, 1, 6);
        g2d.fillRect(98 + x, 96 + y, 1, 6);
        g2d.fillRect(97 + x, 96 + y, 1, 6);
        g2d.fillRect(96 + x, 96 + y, 1, 6);
        g2d.fillRect(95 + x, 96 + y, 1, 6);
        g2d.fillRect(94 + x, 96 + y, 1, 6);
        g2d.fillRect(92 + x, 96 + y, 1, 5);
        g2d.fillRect(91 + x, 97 + y, 1, 1);
        g2d.fillRect(90 + x, 98 + y, 1, 1);
        g2d.fillRect(91 + x, 99 + y, 1, 2);
        g2d.fillRect(89 + x, 99 + y, 1, 1);
        g2d.fillRect(90 + x, 100 + y, 1, 1);
        g2d.fillRect(91 + x, 103 + y, 1, 1);
        g2d.fillRect(89 + x, 103 + y, 1, 1);
        g2d.fillRect(96 + x, 104 + y, 1, 1);
        g2d.fillRect(94 + x, 104 + y, 1, 1);
        g2d.fillRect(101 + x, 105 + y, 1, 1);
        g2d.fillRect(99 + x, 105 + y, 1, 1);
    }





    public void paintBackAT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 81 + y, 2, 1);
        g2d.fillRect(95 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 2, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 2, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(123 + x, 87 + y, 3, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(126 + x, 88 + y, 1, 3);
        g2d.fillRect(118 + x, 88 + y, 2, 1);
        g2d.fillRect(120 + x, 89 + y, 2, 1);
        g2d.fillRect(122 + x, 90 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 82 + y, 1, 3);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(116 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 2, 1);
        g2d.fillRect(121 + x, 88 + y, 2, 1);
        g2d.fillRect(123 + x, 89 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 2, 1);
        g2d.fillRect(121 + x, 87 + y, 2, 1);
        g2d.fillRect(123 + x, 88 + y, 3, 1);
    }
}
