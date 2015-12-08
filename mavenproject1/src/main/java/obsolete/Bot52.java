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
public class Bot52 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot52()
    {
        super();
        includeY = true;
        skt = true;
    }

    public Bot52(int layer)
    {
        super(layer);
        includeY = true;
        skt = true;
    }

    public Bot52(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeY = true;
        skt = true;
    }

    public Bot52(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeY = true;
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paint1S1(x,0,g2d);
        paint1S2(x,y,g2d);
        paint1S3(x,y + prevY,g2d);

        prevY = y;
    }

    int prevY = 0;

    public void paint1S3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 100 + y, 2, 1);
        g2d.fillRect(119 + x, 100 + y, 1, 2);
        g2d.fillRect(92 + x, 101 + y, 1, 2);
        g2d.fillRect(100 + x, 101 + y, 1, 1);
        g2d.fillRect(107 + x, 101 + y, 1, 2);
        g2d.fillRect(99 + x, 102 + y, 1, 2);
        g2d.fillRect(120 + x, 102 + y, 1, 4);
        g2d.fillRect(121 + x, 102 + y, 1, 4);
        g2d.fillRect(90 + x, 103 + y, 1, 3);
        g2d.fillRect(91 + x, 103 + y, 1, 3);
        g2d.fillRect(106 + x, 103 + y, 1, 1);
        g2d.fillRect(105 + x, 104 + y, 1, 4);
        g2d.fillRect(118 + x, 104 + y, 2, 1);
        g2d.fillRect(126 + x, 104 + y, 5, 1);
        g2d.fillRect(89 + x, 105 + y, 1, 1);
        g2d.fillRect(93 + x, 105 + y, 5, 1);
        g2d.fillRect(107 + x, 105 + y, 5, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(125 + x, 105 + y, 1, 1);
        g2d.fillRect(96 + x, 106 + y, 4, 1);
        g2d.fillRect(106 + x, 106 + y, 1, 1);
        g2d.fillRect(112 + x, 106 + y, 4, 1);
        g2d.fillRect(122 + x, 106 + y, 3, 1);
        g2d.fillRect(101 + x, 107 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 99 + y, 2, 1);
        g2d.fillRect(107 + x, 100 + y, 1, 1);
        g2d.fillRect(117 + x, 100 + y, 1, 5);
        g2d.fillRect(118 + x, 100 + y, 1, 4);
        g2d.fillRect(120 + x, 100 + y, 1, 2);
        g2d.fillRect(121 + x, 100 + y, 1, 2);
        g2d.fillRect(122 + x, 100 + y, 1, 6);
        g2d.fillRect(93 + x, 101 + y, 1, 4);
        g2d.fillRect(94 + x, 101 + y, 1, 3);
        g2d.fillRect(99 + x, 101 + y, 1, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 1);
        g2d.fillRect(108 + x, 101 + y, 1, 4);
        g2d.fillRect(109 + x, 101 + y, 1, 4);
        g2d.fillRect(110 + x, 101 + y, 1, 4);
        g2d.fillRect(111 + x, 101 + y, 1, 1);
        g2d.fillRect(126 + x, 101 + y, 1, 3);
        g2d.fillRect(127 + x, 101 + y, 1, 3);
        g2d.fillRect(100 + x, 102 + y, 1, 4);
        g2d.fillRect(119 + x, 102 + y, 1, 2);
        g2d.fillRect(92 + x, 103 + y, 1, 3);
        g2d.fillRect(107 + x, 103 + y, 1, 2);
        g2d.fillRect(128 + x, 103 + y, 1, 1);
        g2d.fillRect(99 + x, 104 + y, 1, 2);
        g2d.fillRect(106 + x, 104 + y, 1, 2);
        g2d.fillRect(123 + x, 104 + y, 1, 2);
        g2d.fillRect(125 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 1);
        g2d.fillRect(124 + x, 105 + y, 1, 1);
        g2d.fillRect(101 + x, 106 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 100 + y, 1, 3);
        g2d.fillRect(103 + x, 100 + y, 1, 3);
        g2d.fillRect(105 + x, 100 + y, 1, 4);
        g2d.fillRect(106 + x, 100 + y, 1, 3);
        g2d.fillRect(98 + x, 101 + y, 1, 5);
        g2d.fillRect(112 + x, 101 + y, 1, 4);
        g2d.fillRect(116 + x, 101 + y, 1, 5);
        g2d.fillRect(123 + x, 101 + y, 1, 3);
        g2d.fillRect(125 + x, 101 + y, 1, 2);
        g2d.fillRect(95 + x, 102 + y, 1, 1);
        g2d.fillRect(101 + x, 102 + y, 1, 4);
        g2d.fillRect(111 + x, 102 + y, 1, 3);
        g2d.fillRect(113 + x, 102 + y, 1, 4);
        g2d.fillRect(96 + x, 103 + y, 1, 2);
        g2d.fillRect(97 + x, 103 + y, 1, 2);
        g2d.fillRect(104 + x, 103 + y, 1, 4);
        g2d.fillRect(94 + x, 104 + y, 1, 1);
        g2d.fillRect(124 + x, 104 + y, 1, 1);
        g2d.fillRect(100 + x, 106 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 100 + y, 1, 3);
        g2d.fillRect(124 + x, 101 + y, 1, 3);
        g2d.fillRect(96 + x, 102 + y, 2, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 4);
        g2d.fillRect(115 + x, 102 + y, 1, 4);
        g2d.fillRect(95 + x, 103 + y, 1, 2);
        g2d.fillRect(102 + x, 103 + y, 1, 4);
        g2d.fillRect(103 + x, 103 + y, 1, 4);
        g2d.fillRect(125 + x, 103 + y, 1, 1);
    }





    public void paint1S1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 80 + y, 2, 1);
        g2d.fillRect(118 + x, 80 + y, 2, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(104 + x, 81 + y, 3, 1);
        g2d.fillRect(114 + x, 81 + y, 4, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 7, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(99 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 84 + y, 1, 2);
        g2d.fillRect(98 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 4);
        g2d.fillRect(96 + x, 87 + y, 1, 2);
        g2d.fillRect(97 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(124 + x, 87 + y, 1, 1);
        g2d.fillRect(125 + x, 88 + y, 1, 2);
        g2d.fillRect(95 + x, 89 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 1, 4);
        g2d.fillRect(126 + x, 90 + y, 1, 3);
        g2d.fillRect(94 + x, 91 + y, 1, 2);
        g2d.fillRect(107 + x, 91 + y, 4, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 3);
        g2d.fillRect(121 + x, 91 + y, 1, 3);
        g2d.fillRect(111 + x, 92 + y, 1, 1);
        g2d.fillRect(127 + x, 92 + y, 1, 1);
        g2d.fillRect(93 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 93 + y, 2, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 2, 1);
        g2d.fillRect(94 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 3, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 3, 1);
        g2d.fillRect(117 + x, 94 + y, 2, 1);
        g2d.fillRect(122 + x, 94 + y, 2, 1);
        g2d.fillRect(95 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 5, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 3);
        g2d.fillRect(102 + x, 81 + y, 2, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 13);
        g2d.fillRect(106 + x, 82 + y, 1, 8);
        g2d.fillRect(114 + x, 82 + y, 1, 7);
        g2d.fillRect(115 + x, 82 + y, 1, 7);
        g2d.fillRect(116 + x, 82 + y, 1, 10);
        g2d.fillRect(117 + x, 82 + y, 1, 12);
        g2d.fillRect(120 + x, 82 + y, 1, 3);
        g2d.fillRect(100 + x, 83 + y, 1, 4);
        g2d.fillRect(107 + x, 83 + y, 1, 3);
        g2d.fillRect(108 + x, 83 + y, 2, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 3);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(99 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 10);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(122 + x, 85 + y, 1, 2);
        g2d.fillRect(98 + x, 87 + y, 1, 3);
        g2d.fillRect(118 + x, 87 + y, 1, 7);
        g2d.fillRect(120 + x, 87 + y, 1, 4);
        g2d.fillRect(121 + x, 87 + y, 1, 4);
        g2d.fillRect(123 + x, 87 + y, 1, 1);
        g2d.fillRect(124 + x, 88 + y, 1, 2);
        g2d.fillRect(96 + x, 89 + y, 1, 3);
        g2d.fillRect(97 + x, 89 + y, 1, 3);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 4);
        g2d.fillRect(125 + x, 90 + y, 1, 3);
        g2d.fillRect(95 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(103 + x, 91 + y, 1, 4);
        g2d.fillRect(119 + x, 91 + y, 1, 2);
        g2d.fillRect(94 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 1);
        g2d.fillRect(123 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 3);
        g2d.fillRect(112 + x, 83 + y, 1, 10);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 6);
        g2d.fillRect(103 + x, 85 + y, 1, 6);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 86 + y, 1, 8);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 3);
        g2d.fillRect(101 + x, 88 + y, 1, 5);
        g2d.fillRect(123 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 5);
        g2d.fillRect(115 + x, 89 + y, 1, 5);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(98 + x, 90 + y, 1, 4);
        g2d.fillRect(124 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 2);
        g2d.fillRect(123 + x, 91 + y, 1, 2);
        g2d.fillRect(96 + x, 92 + y, 1, 2);
        g2d.fillRect(97 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 9);
        g2d.fillRect(101 + x, 85 + y, 1, 3);
        g2d.fillRect(120 + x, 85 + y, 1, 2);
        g2d.fillRect(121 + x, 85 + y, 1, 2);
        g2d.fillRect(110 + x, 86 + y, 1, 5);
        g2d.fillRect(122 + x, 87 + y, 1, 2);
        g2d.fillRect(100 + x, 88 + y, 1, 3);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(123 + x, 89 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 1, 2);
        g2d.fillRect(124 + x, 91 + y, 1, 2);
    }





    public void paint1S2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(125 + x, 93 + y, 1, 3);
        g2d.fillRect(95 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 5, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 3);
        g2d.fillRect(94 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(126 + x, 96 + y, 1, 2);
        g2d.fillRect(93 + x, 97 + y, 1, 2);
        g2d.fillRect(104 + x, 98 + y, 1, 3);
        g2d.fillRect(117 + x, 98 + y, 1, 3);
        g2d.fillRect(92 + x, 99 + y, 1, 2);
        g2d.fillRect(106 + x, 99 + y, 2, 1);
        g2d.fillRect(90 + x, 100 + y, 2, 1);
        g2d.fillRect(102 + x, 100 + y, 2, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 2, 1);
        g2d.fillRect(118 + x, 100 + y, 5, 1);
        g2d.fillRect(126 + x, 100 + y, 1, 2);
        g2d.fillRect(127 + x, 100 + y, 2, 1);
        g2d.fillRect(93 + x, 101 + y, 2, 1);
        g2d.fillRect(98 + x, 101 + y, 4, 1);
        g2d.fillRect(110 + x, 101 + y, 3, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(123 + x, 101 + y, 3, 1);
        g2d.fillRect(95 + x, 102 + y, 3, 1);
        g2d.fillRect(113 + x, 102 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 93 + y, 1, 3);
        g2d.fillRect(124 + x, 93 + y, 1, 3);
        g2d.fillRect(96 + x, 94 + y, 1, 3);
        g2d.fillRect(97 + x, 94 + y, 1, 3);
        g2d.fillRect(113 + x, 94 + y, 1, 5);
        g2d.fillRect(114 + x, 94 + y, 1, 8);
        g2d.fillRect(115 + x, 94 + y, 1, 8);
        g2d.fillRect(117 + x, 94 + y, 1, 4);
        g2d.fillRect(95 + x, 96 + y, 1, 3);
        g2d.fillRect(102 + x, 96 + y, 1, 4);
        g2d.fillRect(103 + x, 96 + y, 1, 4);
        g2d.fillRect(104 + x, 96 + y, 1, 2);
        g2d.fillRect(106 + x, 96 + y, 1, 1);
        g2d.fillRect(125 + x, 96 + y, 1, 2);
        g2d.fillRect(94 + x, 97 + y, 1, 4);
        g2d.fillRect(101 + x, 97 + y, 1, 4);
        g2d.fillRect(118 + x, 97 + y, 1, 3);
        g2d.fillRect(105 + x, 98 + y, 1, 2);
        g2d.fillRect(116 + x, 98 + y, 1, 3);
        g2d.fillRect(119 + x, 98 + y, 1, 2);
        g2d.fillRect(126 + x, 98 + y, 1, 2);
        g2d.fillRect(127 + x, 98 + y, 1, 2);
        g2d.fillRect(93 + x, 99 + y, 1, 2);
        g2d.fillRect(95 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 91 + y, 1, 5);
        g2d.fillRect(109 + x, 91 + y, 1, 5);
        g2d.fillRect(111 + x, 92 + y, 1, 9);
        g2d.fillRect(100 + x, 93 + y, 1, 8);
        g2d.fillRect(119 + x, 93 + y, 1, 5);
        g2d.fillRect(98 + x, 94 + y, 1, 2);
        g2d.fillRect(101 + x, 94 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 5);
        g2d.fillRect(118 + x, 94 + y, 1, 3);
        g2d.fillRect(123 + x, 94 + y, 1, 3);
        g2d.fillRect(99 + x, 96 + y, 1, 5);
        g2d.fillRect(110 + x, 96 + y, 1, 5);
        g2d.fillRect(112 + x, 96 + y, 1, 5);
        g2d.fillRect(120 + x, 96 + y, 1, 4);
        g2d.fillRect(121 + x, 96 + y, 1, 4);
        g2d.fillRect(124 + x, 96 + y, 1, 3);
        g2d.fillRect(96 + x, 97 + y, 1, 2);
        g2d.fillRect(97 + x, 97 + y, 1, 2);
        g2d.fillRect(106 + x, 97 + y, 1, 2);
        g2d.fillRect(122 + x, 97 + y, 1, 3);
        g2d.fillRect(125 + x, 98 + y, 1, 3);
        g2d.fillRect(95 + x, 99 + y, 1, 2);
        g2d.fillRect(98 + x, 99 + y, 1, 2);
        g2d.fillRect(113 + x, 99 + y, 1, 3);
        g2d.fillRect(123 + x, 99 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 91 + y, 1, 5);
        g2d.fillRect(99 + x, 93 + y, 1, 3);
        g2d.fillRect(120 + x, 93 + y, 1, 3);
        g2d.fillRect(121 + x, 93 + y, 1, 3);
        g2d.fillRect(122 + x, 94 + y, 1, 3);
        g2d.fillRect(98 + x, 96 + y, 1, 3);
        g2d.fillRect(108 + x, 96 + y, 1, 4);
        g2d.fillRect(109 + x, 96 + y, 1, 4);
        g2d.fillRect(123 + x, 97 + y, 1, 2);
        g2d.fillRect(96 + x, 99 + y, 1, 3);
        g2d.fillRect(97 + x, 99 + y, 1, 3);
        g2d.fillRect(124 + x, 99 + y, 1, 2);
    }
}
