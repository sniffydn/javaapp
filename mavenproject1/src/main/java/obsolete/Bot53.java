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
public class Bot53 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot53()
    {
        super();
        includeY = true;
        skt = true;
    }

    public Bot53(int layer)
    {
        super(layer);
        includeY = true;
        skt = true;
    }

    public Bot53(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeY = true;
        skt = true;
    }

    public Bot53(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeY = true;
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintBOT2(x,0,g2d);
        paintBOT1(x,y,g2d);
    }

    public void paintBOT2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(100 + x, 81 + y, 1, 4);
        g2d.fillRect(101 + x, 81 + y, 3, 1);
        g2d.fillRect(104 + x, 82 + y, 4, 1);
        g2d.fillRect(108 + x, 83 + y, 6, 1);
        g2d.fillRect(101 + x, 84 + y, 3, 1);
        g2d.fillRect(118 + x, 84 + y, 5, 1);
        g2d.fillRect(104 + x, 85 + y, 4, 1);
        g2d.fillRect(123 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 6, 1);
        g2d.fillRect(117 + x, 87 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 2, 1);
        g2d.fillRect(117 + x, 79 + y, 3, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 3, 1);
        g2d.fillRect(114 + x, 80 + y, 3, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 3);
        g2d.fillRect(120 + x, 80 + y, 1, 3);
        g2d.fillRect(107 + x, 81 + y, 7, 1);
        g2d.fillRect(117 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(98 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 86 + y, 1, 5);
        g2d.fillRect(101 + x, 87 + y, 1, 4);
        g2d.fillRect(115 + x, 88 + y, 1, 3);
        g2d.fillRect(119 + x, 88 + y, 1, 3);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 3);
        g2d.fillRect(123 + x, 89 + y, 1, 3);
        g2d.fillRect(100 + x, 91 + y, 1, 4);
        g2d.fillRect(104 + x, 91 + y, 1, 5);
        g2d.fillRect(116 + x, 91 + y, 1, 5);
        g2d.fillRect(120 + x, 91 + y, 1, 4);
        g2d.fillRect(96 + x, 92 + y, 1, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 85 + y, 1, 2);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 2);
        g2d.fillRect(100 + x, 88 + y, 1, 2);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 2, 1);
        g2d.fillRect(115 + x, 81 + y, 2, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 1, 2);
        g2d.fillRect(103 + x, 82 + y, 1, 2);
        g2d.fillRect(108 + x, 82 + y, 2, 1);
        g2d.fillRect(112 + x, 82 + y, 2, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 1, 2);
        g2d.fillRect(116 + x, 83 + y, 1, 4);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(122 + x, 85 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 2);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(97 + x, 92 + y, 2, 1);
        g2d.fillRect(122 + x, 92 + y, 2, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(119 + x, 93 + y, 1, 2);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(111 + x, 94 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 87 + y, 1, 2);
        g2d.fillRect(108 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(109 + x, 94 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 92 + y, 1, 2);
        g2d.fillRect(115 + x, 92 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 94 + y, 1, 2);
        g2d.fillRect(114 + x, 94 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 1, 2);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 82 + y, 2, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(99 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 2, 1);
        g2d.fillRect(98 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 1, 2);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 2);
        g2d.fillRect(122 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 2);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 92 + y, 1, 2);
        g2d.fillRect(103 + x, 93 + y, 1, 2);
        g2d.fillRect(106 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 2);
        g2d.fillRect(110 + x, 94 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 89 + y, 2, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(109 + x, 92 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 83 + y, 1, 3);
        g2d.fillRect(108 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 1, 2);
        g2d.fillRect(121 + x, 85 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(106 + x, 89 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(110 + x, 92 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(99 + x, 90 + y, 1, 2);
        g2d.fillRect(121 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(117 + x, 84 + y, 1, 3);
        g2d.fillRect(115 + x, 87 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 2);
    }





    public void paintBOT1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(96 + x, 92 + y, 1, 2);
        g2d.fillRect(124 + x, 92 + y, 1, 2);
        g2d.fillRect(95 + x, 94 + y, 1, 3);
        g2d.fillRect(99 + x, 94 + y, 1, 4);
        g2d.fillRect(121 + x, 94 + y, 1, 4);
        g2d.fillRect(125 + x, 94 + y, 1, 3);
        g2d.fillRect(103 + x, 95 + y, 1, 8);
        g2d.fillRect(117 + x, 95 + y, 1, 8);
        g2d.fillRect(94 + x, 97 + y, 1, 3);
        g2d.fillRect(126 + x, 97 + y, 1, 3);
        g2d.fillRect(98 + x, 98 + y, 1, 3);
        g2d.fillRect(122 + x, 98 + y, 1, 3);
        g2d.fillRect(95 + x, 99 + y, 1, 1);
        g2d.fillRect(125 + x, 99 + y, 1, 1);
        g2d.fillRect(96 + x, 100 + y, 2, 1);
        g2d.fillRect(123 + x, 100 + y, 2, 1);
        g2d.fillRect(99 + x, 101 + y, 4, 1);
        g2d.fillRect(118 + x, 101 + y, 4, 1);
        g2d.fillRect(104 + x, 102 + y, 13, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(98 + x, 94 + y, 1, 2);
        g2d.fillRect(122 + x, 94 + y, 1, 2);
        g2d.fillRect(102 + x, 95 + y, 1, 2);
        g2d.fillRect(118 + x, 95 + y, 1, 2);
        g2d.fillRect(112 + x, 96 + y, 1, 2);
        g2d.fillRect(115 + x, 96 + y, 1, 2);
        g2d.fillRect(116 + x, 96 + y, 1, 2);
        g2d.fillRect(111 + x, 97 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 2);
        g2d.fillRect(123 + x, 98 + y, 1, 2);
        g2d.fillRect(102 + x, 99 + y, 1, 2);
        g2d.fillRect(118 + x, 99 + y, 1, 2);
        g2d.fillRect(112 + x, 100 + y, 1, 2);
        g2d.fillRect(115 + x, 100 + y, 1, 2);
        g2d.fillRect(116 + x, 100 + y, 1, 2);
        g2d.fillRect(111 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(97 + x, 92 + y, 2, 1);
        g2d.fillRect(122 + x, 92 + y, 2, 1);
        g2d.fillRect(97 + x, 94 + y, 1, 2);
        g2d.fillRect(123 + x, 94 + y, 1, 2);
        g2d.fillRect(101 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(104 + x, 96 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 99 + y, 1, 2);
        g2d.fillRect(104 + x, 100 + y, 1, 2);
        g2d.fillRect(105 + x, 100 + y, 1, 2);
        g2d.fillRect(111 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 96 + y, 1, 2);
        g2d.fillRect(109 + x, 96 + y, 1, 2);
        g2d.fillRect(108 + x, 100 + y, 1, 2);
        g2d.fillRect(109 + x, 100 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 92 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 2, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 2);
        g2d.fillRect(113 + x, 96 + y, 1, 2);
        g2d.fillRect(114 + x, 96 + y, 1, 2);
        g2d.fillRect(122 + x, 96 + y, 1, 2);
        g2d.fillRect(118 + x, 97 + y, 1, 2);
        g2d.fillRect(112 + x, 98 + y, 1, 2);
        g2d.fillRect(115 + x, 98 + y, 1, 2);
        g2d.fillRect(116 + x, 98 + y, 1, 2);
        g2d.fillRect(113 + x, 100 + y, 1, 2);
        g2d.fillRect(114 + x, 100 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 93 + y, 2, 1);
        g2d.fillRect(122 + x, 93 + y, 2, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 2);
        g2d.fillRect(101 + x, 94 + y, 2, 1);
        g2d.fillRect(118 + x, 94 + y, 2, 1);
        g2d.fillRect(124 + x, 94 + y, 1, 2);
        g2d.fillRect(100 + x, 95 + y, 1, 2);
        g2d.fillRect(104 + x, 95 + y, 2, 1);
        g2d.fillRect(111 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 2);
        g2d.fillRect(97 + x, 96 + y, 1, 2);
        g2d.fillRect(106 + x, 96 + y, 1, 2);
        g2d.fillRect(107 + x, 96 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 1, 2);
        g2d.fillRect(123 + x, 96 + y, 1, 2);
        g2d.fillRect(101 + x, 97 + y, 1, 2);
        g2d.fillRect(102 + x, 97 + y, 1, 2);
        g2d.fillRect(119 + x, 97 + y, 1, 2);
        g2d.fillRect(95 + x, 98 + y, 2, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 2);
        g2d.fillRect(105 + x, 98 + y, 1, 2);
        g2d.fillRect(111 + x, 98 + y, 1, 2);
        g2d.fillRect(124 + x, 98 + y, 1, 2);
        g2d.fillRect(125 + x, 98 + y, 1, 1);
        g2d.fillRect(96 + x, 99 + y, 1, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 2);
        g2d.fillRect(100 + x, 99 + y, 1, 2);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(121 + x, 99 + y, 1, 2);
        g2d.fillRect(106 + x, 100 + y, 1, 2);
        g2d.fillRect(107 + x, 100 + y, 1, 2);
        g2d.fillRect(110 + x, 100 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 95 + y, 2, 1);
        g2d.fillRect(108 + x, 98 + y, 1, 2);
        g2d.fillRect(109 + x, 98 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 95 + y, 2, 1);
        g2d.fillRect(110 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 1, 2);
        g2d.fillRect(107 + x, 98 + y, 1, 2);
        g2d.fillRect(110 + x, 98 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(100 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 95 + y, 2, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 2);
        g2d.fillRect(124 + x, 96 + y, 1, 2);
        g2d.fillRect(95 + x, 97 + y, 1, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 2);
        g2d.fillRect(120 + x, 97 + y, 1, 2);
        g2d.fillRect(125 + x, 97 + y, 1, 1);
        g2d.fillRect(99 + x, 98 + y, 1, 1);
        g2d.fillRect(113 + x, 98 + y, 1, 2);
        g2d.fillRect(114 + x, 98 + y, 1, 2);
        g2d.fillRect(121 + x, 98 + y, 1, 1);
    }
}
