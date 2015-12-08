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
public class Bot22 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot22()
    {
        super();
        jean = true;
        skt = true;
    }

    public Bot22(int layer)
    {
        super(layer);
        jean = true;
        skt = true;
    }

    public Bot22(ColorArray colorSwitch)
    {
        super(colorSwitch);
        jean = true;
        skt = true;
    }

    public Bot22(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        jean = true;
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        if(step == 2 || step == 3 || step == 4 || step == 5 || step == 6 || step == 7 || step == 1)// || step == 13 || step == 14 || step == 15 || step == 8 ||
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(101 + x, 79 + y, 1, 7);
            g2d.fillRect(102 + x, 79 + y, 1, 2);
            g2d.fillRect(120 + x, 79 + y, 1, 3);
            g2d.fillRect(100 + x, 80 + y, 1, 3);
            g2d.fillRect(109 + x, 80 + y, 2, 1);
            g2d.fillRect(112 + x, 80 + y, 5, 1);
            g2d.fillRect(121 + x, 80 + y, 1, 20);
            g2d.fillRect(106 + x, 81 + y, 1, 3);
            g2d.fillRect(111 + x, 81 + y, 1, 1);
            g2d.fillRect(115 + x, 81 + y, 2, 1);
            g2d.fillRect(110 + x, 82 + y, 1, 1);
            g2d.fillRect(112 + x, 82 + y, 1, 1);
            g2d.fillRect(116 + x, 82 + y, 1, 2);
            g2d.fillRect(99 + x, 83 + y, 1, 12);
            g2d.fillRect(111 + x, 83 + y, 1, 1);
            g2d.fillRect(102 + x, 84 + y, 1, 1);
            g2d.fillRect(105 + x, 84 + y, 1, 1);
            g2d.fillRect(110 + x, 84 + y, 1, 1);
            g2d.fillRect(112 + x, 84 + y, 1, 1);
            g2d.fillRect(120 + x, 84 + y, 1, 1);
            g2d.fillRect(103 + x, 85 + y, 2, 1);
            g2d.fillRect(119 + x, 85 + y, 1, 1);
            g2d.fillRect(98 + x, 96 + y, 1, 4);
            g2d.fillRect(120 + x, 96 + y, 1, 6);
            g2d.fillRect(97 + x, 100 + y, 1, 2);
            g2d.fillRect(119 + x, 100 + y, 1, 5);
            g2d.fillRect(98 + x, 101 + y, 1, 2);
            g2d.fillRect(118 + x, 101 + y, 1, 4);
            g2d.fillRect(99 + x, 102 + y, 1, 2);
            g2d.fillRect(100 + x, 103 + y, 1, 2);
            g2d.fillRect(101 + x, 104 + y, 2, 1);
            g2d.fillRect(117 + x, 104 + y, 1, 2);
            g2d.fillRect(102 + x, 105 + y, 2, 1);
            g2d.fillRect(116 + x, 105 + y, 1, 2);
            g2d.fillRect(103 + x, 106 + y, 3, 1);
            g2d.fillRect(115 + x, 106 + y, 1, 1);
            g2d.fillRect(105 + x, 107 + y, 2, 1);
            g2d.fillRect(113 + x, 107 + y, 1, 2);
            g2d.fillRect(114 + x, 107 + y, 1, 1);
            g2d.fillRect(106 + x, 108 + y, 4, 1);
            g2d.fillRect(112 + x, 108 + y, 1, 2);
            g2d.fillRect(109 + x, 109 + y, 3, 1);
            g2d.fillRect(110 + x, 110 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(103 + x, 79 + y, 1, 3);
            g2d.fillRect(118 + x, 79 + y, 1, 3);
            g2d.fillRect(119 + x, 79 + y, 1, 5);
            g2d.fillRect(104 + x, 80 + y, 1, 4);
            g2d.fillRect(106 + x, 80 + y, 3, 1);
            g2d.fillRect(102 + x, 81 + y, 1, 2);
            g2d.fillRect(107 + x, 81 + y, 1, 1);
            g2d.fillRect(110 + x, 81 + y, 1, 1);
            g2d.fillRect(112 + x, 81 + y, 1, 1);
            g2d.fillRect(120 + x, 82 + y, 1, 1);
            g2d.fillRect(100 + x, 83 + y, 1, 17);
            g2d.fillRect(117 + x, 84 + y, 1, 2);
            g2d.fillRect(102 + x, 85 + y, 1, 2);
            g2d.fillRect(105 + x, 85 + y, 1, 1);
            g2d.fillRect(118 + x, 85 + y, 1, 2);
            g2d.fillRect(120 + x, 85 + y, 1, 11);
            g2d.fillRect(101 + x, 86 + y, 1, 9);
            g2d.fillRect(119 + x, 86 + y, 1, 14);
            g2d.fillRect(99 + x, 95 + y, 1, 7);
            g2d.fillRect(118 + x, 96 + y, 1, 5);
            g2d.fillRect(98 + x, 100 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(108 + x, 81 + y, 1, 6);
            g2d.fillRect(109 + x, 81 + y, 1, 6);
            g2d.fillRect(113 + x, 81 + y, 1, 6);
            g2d.fillRect(114 + x, 81 + y, 1, 6);
            g2d.fillRect(103 + x, 82 + y, 1, 2);
            g2d.fillRect(107 + x, 82 + y, 1, 4);
            g2d.fillRect(115 + x, 82 + y, 1, 5);
            g2d.fillRect(118 + x, 82 + y, 1, 2);
            g2d.fillRect(110 + x, 83 + y, 1, 1);
            g2d.fillRect(112 + x, 83 + y, 1, 1);
            g2d.fillRect(106 + x, 84 + y, 1, 8);
            g2d.fillRect(116 + x, 84 + y, 1, 6);
            g2d.fillRect(110 + x, 85 + y, 1, 2);
            g2d.fillRect(111 + x, 85 + y, 1, 2);
            g2d.fillRect(112 + x, 85 + y, 1, 2);
            g2d.fillRect(103 + x, 86 + y, 1, 14);
            g2d.fillRect(104 + x, 86 + y, 1, 9);
            g2d.fillRect(105 + x, 86 + y, 1, 6);
            g2d.fillRect(117 + x, 86 + y, 1, 6);
            g2d.fillRect(102 + x, 87 + y, 1, 15);
            g2d.fillRect(118 + x, 87 + y, 1, 9);
            g2d.fillRect(107 + x, 88 + y, 1, 1);
            g2d.fillRect(112 + x, 89 + y, 4, 1);
            g2d.fillRect(107 + x, 90 + y, 1, 2);
            g2d.fillRect(108 + x, 90 + y, 4, 1);
            g2d.fillRect(113 + x, 91 + y, 4, 1);
            g2d.fillRect(105 + x, 93 + y, 7, 1);
            g2d.fillRect(117 + x, 93 + y, 1, 11);
            g2d.fillRect(112 + x, 94 + y, 1, 2);
            g2d.fillRect(113 + x, 94 + y, 1, 2);
            g2d.fillRect(114 + x, 94 + y, 1, 2);
            g2d.fillRect(115 + x, 94 + y, 1, 2);
            g2d.fillRect(116 + x, 94 + y, 1, 2);
            g2d.fillRect(101 + x, 95 + y, 1, 9);
            g2d.fillRect(105 + x, 95 + y, 7, 1);
            g2d.fillRect(104 + x, 96 + y, 1, 4);
            g2d.fillRect(105 + x, 97 + y, 3, 1);
            g2d.fillRect(112 + x, 97 + y, 5, 1);
            g2d.fillRect(114 + x, 98 + y, 1, 3);
            g2d.fillRect(115 + x, 98 + y, 1, 4);
            g2d.fillRect(116 + x, 98 + y, 1, 4);
            g2d.fillRect(105 + x, 99 + y, 1, 2);
            g2d.fillRect(106 + x, 99 + y, 1, 2);
            g2d.fillRect(107 + x, 99 + y, 7, 1);
            g2d.fillRect(100 + x, 100 + y, 1, 3);
            g2d.fillRect(111 + x, 100 + y, 3, 1);
            g2d.fillRect(103 + x, 101 + y, 1, 1);
            g2d.fillRect(105 + x, 102 + y, 1, 3);
            g2d.fillRect(106 + x, 102 + y, 1, 2);
            g2d.fillRect(107 + x, 102 + y, 8, 1);
            g2d.fillRect(102 + x, 103 + y, 3, 1);
            g2d.fillRect(113 + x, 103 + y, 1, 3);
            g2d.fillRect(114 + x, 103 + y, 1, 3);
            g2d.fillRect(115 + x, 103 + y, 1, 2);
            g2d.fillRect(116 + x, 103 + y, 1, 2);
            g2d.fillRect(103 + x, 104 + y, 2, 1);
            g2d.fillRect(108 + x, 104 + y, 1, 2);
            g2d.fillRect(109 + x, 104 + y, 3, 1);
            g2d.fillRect(104 + x, 105 + y, 1, 1);
            g2d.fillRect(107 + x, 105 + y, 1, 1);
            g2d.fillRect(111 + x, 105 + y, 2, 1);
            g2d.fillRect(107 + x, 107 + y, 2, 1);
            g2d.fillRect(110 + x, 107 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(105 + x, 80 + y, 1, 4);
            g2d.fillRect(111 + x, 80 + y, 1, 1);
            g2d.fillRect(117 + x, 80 + y, 1, 4);
            g2d.fillRect(111 + x, 82 + y, 1, 1);
            g2d.fillRect(102 + x, 83 + y, 1, 1);
            g2d.fillRect(120 + x, 83 + y, 1, 1);
            g2d.fillRect(103 + x, 84 + y, 2, 1);
            g2d.fillRect(111 + x, 84 + y, 1, 1);
            g2d.fillRect(118 + x, 84 + y, 2, 1);
            g2d.fillRect(107 + x, 86 + y, 1, 2);
            g2d.fillRect(108 + x, 87 + y, 1, 3);
            g2d.fillRect(109 + x, 87 + y, 1, 3);
            g2d.fillRect(110 + x, 87 + y, 1, 3);
            g2d.fillRect(111 + x, 87 + y, 1, 3);
            g2d.fillRect(112 + x, 87 + y, 1, 2);
            g2d.fillRect(113 + x, 87 + y, 1, 2);
            g2d.fillRect(114 + x, 87 + y, 1, 2);
            g2d.fillRect(115 + x, 87 + y, 1, 2);
            g2d.fillRect(107 + x, 89 + y, 1, 1);
            g2d.fillRect(112 + x, 90 + y, 1, 4);
            g2d.fillRect(113 + x, 90 + y, 4, 1);
            g2d.fillRect(108 + x, 91 + y, 1, 2);
            g2d.fillRect(109 + x, 91 + y, 1, 2);
            g2d.fillRect(110 + x, 91 + y, 1, 2);
            g2d.fillRect(111 + x, 91 + y, 1, 2);
            g2d.fillRect(105 + x, 92 + y, 3, 1);
            g2d.fillRect(113 + x, 92 + y, 1, 2);
            g2d.fillRect(114 + x, 92 + y, 1, 2);
            g2d.fillRect(115 + x, 92 + y, 1, 2);
            g2d.fillRect(116 + x, 92 + y, 1, 2);
            g2d.fillRect(117 + x, 92 + y, 1, 1);
            g2d.fillRect(105 + x, 94 + y, 7, 1);
            g2d.fillRect(104 + x, 95 + y, 1, 1);
            g2d.fillRect(105 + x, 96 + y, 12, 1);
            g2d.fillRect(108 + x, 97 + y, 1, 2);
            g2d.fillRect(109 + x, 97 + y, 1, 2);
            g2d.fillRect(110 + x, 97 + y, 1, 2);
            g2d.fillRect(111 + x, 97 + y, 1, 2);
            g2d.fillRect(105 + x, 98 + y, 3, 1);
            g2d.fillRect(112 + x, 98 + y, 2, 1);
            g2d.fillRect(103 + x, 100 + y, 2, 1);
            g2d.fillRect(107 + x, 100 + y, 1, 2);
            g2d.fillRect(108 + x, 100 + y, 1, 2);
            g2d.fillRect(109 + x, 100 + y, 1, 2);
            g2d.fillRect(110 + x, 100 + y, 1, 2);
            g2d.fillRect(104 + x, 101 + y, 1, 2);
            g2d.fillRect(105 + x, 101 + y, 2, 1);
            g2d.fillRect(111 + x, 101 + y, 4, 1);
            g2d.fillRect(102 + x, 102 + y, 2, 1);
            g2d.fillRect(115 + x, 102 + y, 2, 1);
            g2d.fillRect(107 + x, 103 + y, 1, 2);
            g2d.fillRect(108 + x, 103 + y, 5, 1);
            g2d.fillRect(106 + x, 104 + y, 1, 3);
            g2d.fillRect(112 + x, 104 + y, 1, 1);
            g2d.fillRect(105 + x, 105 + y, 1, 1);
            g2d.fillRect(109 + x, 105 + y, 1, 3);
            g2d.fillRect(110 + x, 105 + y, 1, 2);
            g2d.fillRect(115 + x, 105 + y, 1, 1);
            g2d.fillRect(107 + x, 106 + y, 2, 1);
            g2d.fillRect(111 + x, 106 + y, 1, 3);
            g2d.fillRect(112 + x, 106 + y, 1, 2);
            g2d.fillRect(110 + x, 108 + y, 1, 1);
            g2d.fillRect(113 + x, 106 + y, 2, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(101 + x, 79 + y, 1, 3);
            g2d.fillRect(119 + x, 79 + y, 1, 2);
            g2d.fillRect(120 + x, 79 + y, 1, 7);
            g2d.fillRect(100 + x, 80 + y, 1, 20);
            g2d.fillRect(105 + x, 80 + y, 1, 4);
            g2d.fillRect(106 + x, 80 + y, 1, 2);
            g2d.fillRect(107 + x, 80 + y, 3, 1);
            g2d.fillRect(111 + x, 80 + y, 2, 1);
            g2d.fillRect(121 + x, 80 + y, 1, 3);
            g2d.fillRect(110 + x, 81 + y, 1, 1);
            g2d.fillRect(115 + x, 81 + y, 1, 3);
            g2d.fillRect(109 + x, 82 + y, 1, 1);
            g2d.fillRect(111 + x, 82 + y, 1, 1);
            g2d.fillRect(110 + x, 83 + y, 1, 1);
            g2d.fillRect(122 + x, 83 + y, 1, 12);
            g2d.fillRect(101 + x, 84 + y, 1, 1);
            g2d.fillRect(109 + x, 84 + y, 1, 1);
            g2d.fillRect(111 + x, 84 + y, 1, 1);
            g2d.fillRect(116 + x, 84 + y, 1, 1);
            g2d.fillRect(119 + x, 84 + y, 1, 1);
            g2d.fillRect(102 + x, 85 + y, 1, 1);
            g2d.fillRect(117 + x, 85 + y, 2, 1);
            g2d.fillRect(101 + x, 96 + y, 1, 6);
            g2d.fillRect(123 + x, 96 + y, 1, 4);
            g2d.fillRect(102 + x, 100 + y, 1, 5);
            g2d.fillRect(124 + x, 100 + y, 1, 2);
            g2d.fillRect(103 + x, 101 + y, 1, 4);
            g2d.fillRect(123 + x, 101 + y, 1, 2);
            g2d.fillRect(122 + x, 102 + y, 1, 2);
            g2d.fillRect(121 + x, 103 + y, 1, 2);
            g2d.fillRect(104 + x, 104 + y, 1, 2);
            g2d.fillRect(119 + x, 104 + y, 1, 2);
            g2d.fillRect(120 + x, 104 + y, 1, 1);
            g2d.fillRect(105 + x, 105 + y, 1, 2);
            g2d.fillRect(118 + x, 105 + y, 1, 2);
            g2d.fillRect(106 + x, 106 + y, 1, 1);
            g2d.fillRect(116 + x, 106 + y, 1, 2);
            g2d.fillRect(117 + x, 106 + y, 1, 1);
            g2d.fillRect(107 + x, 107 + y, 2, 1);
            g2d.fillRect(115 + x, 107 + y, 1, 2);
            g2d.fillRect(108 + x, 108 + y, 2, 1);
            g2d.fillRect(112 + x, 108 + y, 1, 2);
            g2d.fillRect(113 + x, 108 + y, 2, 1);
            g2d.fillRect(109 + x, 109 + y, 3, 1);
            g2d.fillRect(110 + x, 110 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(102 + x, 79 + y, 1, 5);
            g2d.fillRect(103 + x, 79 + y, 1, 3);
            g2d.fillRect(118 + x, 79 + y, 1, 3);
            g2d.fillRect(113 + x, 80 + y, 3, 1);
            g2d.fillRect(117 + x, 80 + y, 1, 4);
            g2d.fillRect(109 + x, 81 + y, 1, 1);
            g2d.fillRect(111 + x, 81 + y, 1, 1);
            g2d.fillRect(114 + x, 81 + y, 1, 1);
            g2d.fillRect(119 + x, 81 + y, 1, 2);
            g2d.fillRect(101 + x, 82 + y, 1, 1);
            g2d.fillRect(121 + x, 83 + y, 1, 17);
            g2d.fillRect(104 + x, 84 + y, 1, 2);
            g2d.fillRect(101 + x, 85 + y, 1, 11);
            g2d.fillRect(103 + x, 85 + y, 1, 2);
            g2d.fillRect(116 + x, 85 + y, 1, 1);
            g2d.fillRect(119 + x, 85 + y, 1, 2);
            g2d.fillRect(102 + x, 86 + y, 1, 14);
            g2d.fillRect(120 + x, 86 + y, 1, 9);
            g2d.fillRect(122 + x, 95 + y, 1, 7);
            g2d.fillRect(103 + x, 96 + y, 1, 5);
            g2d.fillRect(123 + x, 100 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(107 + x, 81 + y, 1, 6);
            g2d.fillRect(108 + x, 81 + y, 1, 6);
            g2d.fillRect(112 + x, 81 + y, 1, 6);
            g2d.fillRect(113 + x, 81 + y, 1, 6);
            g2d.fillRect(103 + x, 82 + y, 1, 2);
            g2d.fillRect(106 + x, 82 + y, 1, 5);
            g2d.fillRect(114 + x, 82 + y, 1, 4);
            g2d.fillRect(118 + x, 82 + y, 1, 2);
            g2d.fillRect(109 + x, 83 + y, 1, 1);
            g2d.fillRect(111 + x, 83 + y, 1, 1);
            g2d.fillRect(105 + x, 84 + y, 1, 6);
            g2d.fillRect(115 + x, 84 + y, 1, 8);
            g2d.fillRect(109 + x, 85 + y, 1, 2);
            g2d.fillRect(110 + x, 85 + y, 1, 2);
            g2d.fillRect(111 + x, 85 + y, 1, 2);
            g2d.fillRect(104 + x, 86 + y, 1, 6);
            g2d.fillRect(116 + x, 86 + y, 1, 6);
            g2d.fillRect(117 + x, 86 + y, 1, 9);
            g2d.fillRect(118 + x, 86 + y, 1, 14);
            g2d.fillRect(103 + x, 87 + y, 1, 9);
            g2d.fillRect(119 + x, 87 + y, 1, 15);
            g2d.fillRect(114 + x, 88 + y, 1, 1);
            g2d.fillRect(106 + x, 89 + y, 4, 1);
            g2d.fillRect(110 + x, 90 + y, 5, 1);
            g2d.fillRect(105 + x, 91 + y, 4, 1);
            g2d.fillRect(114 + x, 91 + y, 1, 1);
            g2d.fillRect(104 + x, 93 + y, 1, 11);
            g2d.fillRect(110 + x, 93 + y, 7, 1);
            g2d.fillRect(105 + x, 94 + y, 1, 2);
            g2d.fillRect(106 + x, 94 + y, 1, 2);
            g2d.fillRect(107 + x, 94 + y, 1, 2);
            g2d.fillRect(108 + x, 94 + y, 1, 2);
            g2d.fillRect(109 + x, 94 + y, 1, 2);
            g2d.fillRect(110 + x, 95 + y, 7, 1);
            g2d.fillRect(120 + x, 95 + y, 1, 9);
            g2d.fillRect(117 + x, 96 + y, 1, 4);
            g2d.fillRect(105 + x, 97 + y, 1, 5);
            g2d.fillRect(106 + x, 97 + y, 1, 5);
            g2d.fillRect(107 + x, 97 + y, 1, 4);
            g2d.fillRect(108 + x, 97 + y, 2, 1);
            g2d.fillRect(114 + x, 97 + y, 3, 1);
            g2d.fillRect(108 + x, 99 + y, 1, 2);
            g2d.fillRect(109 + x, 99 + y, 1, 2);
            g2d.fillRect(110 + x, 99 + y, 1, 2);
            g2d.fillRect(111 + x, 99 + y, 6, 1);
            g2d.fillRect(115 + x, 100 + y, 2, 1);
            g2d.fillRect(121 + x, 100 + y, 1, 3);
            g2d.fillRect(118 + x, 101 + y, 1, 1);
            g2d.fillRect(107 + x, 102 + y, 1, 4);
            g2d.fillRect(108 + x, 102 + y, 1, 4);
            g2d.fillRect(109 + x, 102 + y, 8, 1);
            g2d.fillRect(105 + x, 103 + y, 1, 2);
            g2d.fillRect(106 + x, 103 + y, 1, 2);
            g2d.fillRect(115 + x, 103 + y, 5, 1);
            g2d.fillRect(110 + x, 104 + y, 1, 2);
            g2d.fillRect(111 + x, 104 + y, 3, 1);
            g2d.fillRect(116 + x, 104 + y, 3, 1);
            g2d.fillRect(109 + x, 105 + y, 1, 1);
            g2d.fillRect(113 + x, 105 + y, 2, 1);
            g2d.fillRect(117 + x, 105 + y, 1, 1);
            g2d.fillRect(111 + x, 107 + y, 1, 1);
            g2d.fillRect(113 + x, 107 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(104 + x, 80 + y, 1, 4);
            g2d.fillRect(110 + x, 80 + y, 1, 1);
            g2d.fillRect(116 + x, 80 + y, 1, 4);
            g2d.fillRect(110 + x, 82 + y, 1, 1);
            g2d.fillRect(101 + x, 83 + y, 1, 1);
            g2d.fillRect(119 + x, 83 + y, 1, 1);
            g2d.fillRect(102 + x, 84 + y, 2, 1);
            g2d.fillRect(110 + x, 84 + y, 1, 1);
            g2d.fillRect(117 + x, 84 + y, 2, 1);
            g2d.fillRect(114 + x, 86 + y, 1, 2);
            g2d.fillRect(106 + x, 87 + y, 1, 2);
            g2d.fillRect(107 + x, 87 + y, 1, 2);
            g2d.fillRect(108 + x, 87 + y, 1, 2);
            g2d.fillRect(109 + x, 87 + y, 1, 2);
            g2d.fillRect(110 + x, 87 + y, 1, 3);
            g2d.fillRect(111 + x, 87 + y, 1, 3);
            g2d.fillRect(112 + x, 87 + y, 1, 3);
            g2d.fillRect(113 + x, 87 + y, 1, 3);
            g2d.fillRect(114 + x, 89 + y, 1, 1);
            g2d.fillRect(105 + x, 90 + y, 5, 1);
            g2d.fillRect(109 + x, 91 + y, 1, 3);
            g2d.fillRect(110 + x, 91 + y, 1, 2);
            g2d.fillRect(111 + x, 91 + y, 1, 2);
            g2d.fillRect(112 + x, 91 + y, 1, 2);
            g2d.fillRect(113 + x, 91 + y, 1, 2);
            g2d.fillRect(104 + x, 92 + y, 5, 1);
            g2d.fillRect(114 + x, 92 + y, 3, 1);
            g2d.fillRect(105 + x, 93 + y, 4, 1);
            g2d.fillRect(110 + x, 94 + y, 7, 1);
            g2d.fillRect(117 + x, 95 + y, 1, 1);
            g2d.fillRect(105 + x, 96 + y, 12, 1);
            g2d.fillRect(110 + x, 97 + y, 1, 2);
            g2d.fillRect(111 + x, 97 + y, 1, 2);
            g2d.fillRect(112 + x, 97 + y, 1, 2);
            g2d.fillRect(113 + x, 97 + y, 1, 2);
            g2d.fillRect(108 + x, 98 + y, 2, 1);
            g2d.fillRect(114 + x, 98 + y, 3, 1);
            g2d.fillRect(111 + x, 100 + y, 1, 2);
            g2d.fillRect(112 + x, 100 + y, 1, 2);
            g2d.fillRect(113 + x, 100 + y, 1, 2);
            g2d.fillRect(114 + x, 100 + y, 1, 2);
            g2d.fillRect(117 + x, 100 + y, 1, 3);
            g2d.fillRect(118 + x, 100 + y, 1, 1);
            g2d.fillRect(107 + x, 101 + y, 4, 1);
            g2d.fillRect(115 + x, 101 + y, 2, 1);
            g2d.fillRect(105 + x, 102 + y, 2, 1);
            g2d.fillRect(118 + x, 102 + y, 2, 1);
            g2d.fillRect(109 + x, 103 + y, 1, 2);
            g2d.fillRect(110 + x, 103 + y, 5, 1);
            g2d.fillRect(114 + x, 104 + y, 2, 1);
            g2d.fillRect(106 + x, 105 + y, 1, 1);
            g2d.fillRect(111 + x, 105 + y, 1, 2);
            g2d.fillRect(112 + x, 105 + y, 1, 3);
            g2d.fillRect(115 + x, 105 + y, 1, 2);
            g2d.fillRect(116 + x, 105 + y, 1, 1);
            g2d.fillRect(107 + x, 106 + y, 4, 1);
            g2d.fillRect(113 + x, 106 + y, 2, 1);
            g2d.fillRect(109 + x, 107 + y, 2, 1);
            g2d.fillRect(110 + x, 108 + y, 2, 1);
        }
    }
}
