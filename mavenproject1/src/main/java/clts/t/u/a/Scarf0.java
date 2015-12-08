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
public class Scarf0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Scarf0()
    {
        super(2);
    }

    public Scarf0(int layer)
    {
        super(layer);
    }

    public Scarf0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Scarf0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        paintScarf(offsetX,0,g2d);
    }

    public void paintScarf(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(122 + x, 40 + y, 1, 2);
        g2d.fillRect(123 + x, 42 + y, 1, 3);
        g2d.fillRect(124 + x, 45 + y, 1, 2);
        g2d.fillRect(123 + x, 47 + y, 1, 2);
        g2d.fillRect(92 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(122 + x, 49 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 1, 2);
        g2d.fillRect(113 + x, 50 + y, 1, 2);
        g2d.fillRect(121 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(94 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 3, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 18);
        g2d.fillRect(97 + x, 55 + y, 2, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 2, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 7, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 3);
        g2d.fillRect(115 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 38 + y, 2, 1);
        g2d.fillRect(120 + x, 39 + y, 2, 1);
        g2d.fillRect(121 + x, 40 + y, 1, 1);
        g2d.fillRect(122 + x, 42 + y, 1, 7);
        g2d.fillRect(101 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 2, 1);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(123 + x, 45 + y, 1, 2);
        g2d.fillRect(91 + x, 46 + y, 1, 3);
        g2d.fillRect(105 + x, 46 + y, 2, 1);
        g2d.fillRect(107 + x, 47 + y, 3, 1);
        g2d.fillRect(121 + x, 47 + y, 1, 3);
        g2d.fillRect(110 + x, 48 + y, 2, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 2);
        g2d.fillRect(112 + x, 50 + y, 1, 2);
        g2d.fillRect(114 + x, 50 + y, 2, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(115 + x, 51 + y, 4, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 2, 1);
        g2d.fillRect(116 + x, 52 + y, 3, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(97 + x, 54 + y, 2, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 18);
        g2d.fillRect(99 + x, 55 + y, 9, 1);
        g2d.fillRect(101 + x, 56 + y, 7, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 7);
        g2d.fillRect(114 + x, 72 + y, 1, 5);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 3);
        g2d.fillRect(111 + x, 76 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 38 + y, 5, 1);
        g2d.fillRect(116 + x, 38 + y, 3, 1);
        g2d.fillRect(93 + x, 39 + y, 1, 2);
        g2d.fillRect(99 + x, 39 + y, 1, 1);
        g2d.fillRect(115 + x, 39 + y, 1, 1);
        g2d.fillRect(118 + x, 39 + y, 1, 1);
        g2d.fillRect(97 + x, 40 + y, 1, 1);
        g2d.fillRect(100 + x, 40 + y, 1, 2);
        g2d.fillRect(114 + x, 40 + y, 1, 2);
        g2d.fillRect(117 + x, 40 + y, 1, 1);
        g2d.fillRect(92 + x, 41 + y, 1, 2);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 2, 1);
        g2d.fillRect(121 + x, 41 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 1);
        g2d.fillRect(110 + x, 42 + y, 4, 1);
        g2d.fillRect(91 + x, 43 + y, 1, 3);
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(107 + x, 43 + y, 3, 1);
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(121 + x, 45 + y, 1, 2);
        g2d.fillRect(120 + x, 46 + y, 1, 3);
        g2d.fillRect(119 + x, 47 + y, 1, 3);
        g2d.fillRect(92 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 2, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 3);
        g2d.fillRect(93 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 3);
        g2d.fillRect(114 + x, 49 + y, 3, 1);
        g2d.fillRect(94 + x, 50 + y, 1, 2);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(95 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 2);
        g2d.fillRect(96 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(97 + x, 53 + y, 3, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(112 + x, 53 + y, 3, 1);
        g2d.fillRect(99 + x, 54 + y, 8, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 13);
        g2d.fillRect(114 + x, 58 + y, 1, 5);
        g2d.fillRect(107 + x, 59 + y, 1, 10);
        g2d.fillRect(114 + x, 66 + y, 1, 6);
        g2d.fillRect(108 + x, 69 + y, 1, 4);
        g2d.fillRect(113 + x, 71 + y, 1, 4);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 2);
        g2d.fillRect(111 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(121 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 1);
        g2d.fillRect(92 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 46 + y, 1, 1);
        g2d.fillRect(93 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 47 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(94 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 49 + y, 1, 1);
        g2d.fillRect(96 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 40 + y, 2, 1);
        g2d.fillRect(115 + x, 40 + y, 2, 1);
        g2d.fillRect(120 + x, 40 + y, 1, 1);
        g2d.fillRect(95 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 41 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 1, 1);
        g2d.fillRect(94 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(120 + x, 42 + y, 1, 1);
        g2d.fillRect(93 + x, 43 + y, 1, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(97 + x, 43 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 3);
        g2d.fillRect(119 + x, 43 + y, 1, 1);
        g2d.fillRect(121 + x, 43 + y, 1, 1);
        g2d.fillRect(94 + x, 44 + y, 1, 4);
        g2d.fillRect(96 + x, 44 + y, 1, 4);
        g2d.fillRect(98 + x, 44 + y, 1, 1);
        g2d.fillRect(112 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 44 + y, 1, 3);
        g2d.fillRect(116 + x, 44 + y, 1, 3);
        g2d.fillRect(118 + x, 44 + y, 1, 1);
        g2d.fillRect(120 + x, 44 + y, 1, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 2);
        g2d.fillRect(95 + x, 45 + y, 1, 4);
        g2d.fillRect(97 + x, 45 + y, 1, 4);
        g2d.fillRect(99 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 1);
        g2d.fillRect(103 + x, 45 + y, 1, 1);
        g2d.fillRect(109 + x, 45 + y, 1, 2);
        g2d.fillRect(111 + x, 45 + y, 1, 3);
        g2d.fillRect(113 + x, 45 + y, 1, 3);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 1, 4);
        g2d.fillRect(100 + x, 46 + y, 1, 4);
        g2d.fillRect(102 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 46 + y, 1, 1);
        g2d.fillRect(107 + x, 46 + y, 2, 1);
        g2d.fillRect(110 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 1);
        g2d.fillRect(92 + x, 47 + y, 1, 1);
        g2d.fillRect(99 + x, 47 + y, 1, 4);
        g2d.fillRect(101 + x, 47 + y, 1, 4);
        g2d.fillRect(103 + x, 47 + y, 1, 4);
        g2d.fillRect(106 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(93 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 48 + y, 1, 2);
        g2d.fillRect(104 + x, 48 + y, 1, 4);
        g2d.fillRect(105 + x, 48 + y, 1, 3);
        g2d.fillRect(108 + x, 48 + y, 1, 2);
        g2d.fillRect(109 + x, 48 + y, 1, 3);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(94 + x, 49 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 49 + y, 1, 3);
        g2d.fillRect(107 + x, 49 + y, 1, 2);
        g2d.fillRect(110 + x, 49 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 19);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 2, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(94 + x, 39 + y, 1, 3);
        g2d.fillRect(95 + x, 39 + y, 1, 2);
        g2d.fillRect(96 + x, 39 + y, 1, 3);
        g2d.fillRect(97 + x, 39 + y, 2, 1);
        g2d.fillRect(116 + x, 39 + y, 2, 1);
        g2d.fillRect(118 + x, 40 + y, 1, 2);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(93 + x, 41 + y, 1, 2);
        g2d.fillRect(97 + x, 41 + y, 1, 2);
        g2d.fillRect(117 + x, 41 + y, 1, 2);
        g2d.fillRect(120 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 1);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(114 + x, 42 + y, 1, 2);
        g2d.fillRect(115 + x, 42 + y, 2, 1);
        g2d.fillRect(119 + x, 42 + y, 1, 1);
        g2d.fillRect(92 + x, 43 + y, 1, 3);
        g2d.fillRect(94 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(99 + x, 43 + y, 1, 2);
        g2d.fillRect(110 + x, 43 + y, 1, 3);
        g2d.fillRect(111 + x, 43 + y, 1, 2);
        g2d.fillRect(112 + x, 43 + y, 2, 1);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 1);
        g2d.fillRect(93 + x, 44 + y, 1, 1);
        g2d.fillRect(95 + x, 44 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 44 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(107 + x, 44 + y, 1, 2);
        g2d.fillRect(108 + x, 44 + y, 1, 2);
        g2d.fillRect(109 + x, 44 + y, 1, 1);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 45 + y, 1, 1);
        g2d.fillRect(112 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 46 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 47 + y, 2, 1);
        g2d.fillRect(106 + x, 48 + y, 2, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 1, 4);
        g2d.fillRect(108 + x, 59 + y, 1, 10);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 4);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
    }

}
