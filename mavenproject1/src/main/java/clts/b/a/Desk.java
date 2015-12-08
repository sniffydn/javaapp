/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b.a;

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
public class Desk extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Desk()
    {
        super();
    }

    public Desk(int layer)
    {
        super(layer);
    }

    public Desk(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public Desk(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintDesk(offsetX,0,g2d);
    }

    public void paintDesk(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(new Color(116,2,2,255));
        g2d.fillRect(81 + x, 86 + y, 1, 31);
        g2d.fillRect(80 + x, 117 + y, 1, 5);
        g2d.fillRect(79 + x, 122 + y, 1, 5);
        g2d.fillRect(83 + x, 135 + y, 1, 1);
        g2d.fillRect(82 + x, 136 + y, 1, 1);
        g2d.fillRect(77 + x, 137 + y, 5, 1);


        g2d.setColor(new Color(0,59,64,255));
        g2d.fillRect(68 + x, 77 + y, 1, 5);
        g2d.fillRect(151 + x, 77 + y, 1, 5);


        g2d.setColor(new Color(44,44,44,255));
        g2d.fillRect(102 + x, 70 + y, 2, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 12);
        g2d.fillRect(104 + x, 84 + y, 1, 5);
        g2d.fillRect(103 + x, 89 + y, 1, 32);
        g2d.fillRect(104 + x, 121 + y, 1, 4);
        g2d.fillRect(105 + x, 125 + y, 1, 5);
        g2d.fillRect(104 + x, 130 + y, 1, 3);
        g2d.fillRect(103 + x, 133 + y, 1, 5);


        g2d.setColor(new Color(29,65,69,255));
        g2d.fillRect(62 + x, 136 + y, 1, 2);
        g2d.fillRect(65 + x, 136 + y, 1, 2);
        g2d.fillRect(154 + x, 136 + y, 1, 2);
        g2d.fillRect(157 + x, 136 + y, 1, 2);
        g2d.fillRect(63 + x, 137 + y, 2, 1);
        g2d.fillRect(155 + x, 137 + y, 2, 1);


        g2d.setColor(new Color(180,6,6,255));
        g2d.fillRect(81 + x, 70 + y, 1, 1);
        g2d.fillRect(80 + x, 71 + y, 1, 7);
        g2d.fillRect(81 + x, 78 + y, 1, 8);
        g2d.fillRect(79 + x, 127 + y, 1, 4);
        g2d.fillRect(80 + x, 131 + y, 1, 1);
        g2d.fillRect(81 + x, 132 + y, 1, 1);
        g2d.fillRect(82 + x, 133 + y, 1, 1);
        g2d.fillRect(83 + x, 134 + y, 1, 1);
        g2d.fillRect(73 + x, 137 + y, 4, 1);


        g2d.setColor(new Color(77,77,77,255));
        g2d.fillRect(150 + x, 62 + y, 1, 7);
        g2d.fillRect(154 + x, 63 + y, 1, 3);
        g2d.fillRect(151 + x, 65 + y, 2, 1);
        g2d.fillRect(153 + x, 66 + y, 1, 1);
        g2d.fillRect(152 + x, 67 + y, 1, 3);
        g2d.fillRect(140 + x, 68 + y, 1, 3);
        g2d.fillRect(141 + x, 68 + y, 9, 1);
        g2d.fillRect(151 + x, 68 + y, 1, 1);
        g2d.fillRect(141 + x, 70 + y, 1, 1);
        g2d.fillRect(151 + x, 70 + y, 1, 1);
        g2d.fillRect(142 + x, 71 + y, 1, 1);
        g2d.fillRect(150 + x, 71 + y, 1, 1);


//        g2d.setColor(new Color(1,71,167,255));
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(61 + x, 39 + y, 31, 1);
        g2d.fillRect(60 + x, 40 + y, 1, 1);
        g2d.fillRect(92 + x, 40 + y, 1, 4);
        g2d.fillRect(93 + x, 44 + y, 1, 5);
        g2d.fillRect(94 + x, 49 + y, 1, 5);
        g2d.fillRect(95 + x, 54 + y, 1, 5);
        g2d.fillRect(96 + x, 59 + y, 1, 5);
        g2d.fillRect(95 + x, 63 + y, 1, 1);
        g2d.fillRect(82 + x, 70 + y, 2, 1);


        g2d.setColor(new Color(87,86,75,255));
        g2d.fillRect(63 + x, 44 + y, 1, 1);
        g2d.fillRect(65 + x, 44 + y, 1, 1);
        g2d.fillRect(67 + x, 44 + y, 1, 1);
        g2d.fillRect(69 + x, 44 + y, 1, 1);
        g2d.fillRect(71 + x, 44 + y, 1, 1);
        g2d.fillRect(73 + x, 44 + y, 1, 1);
        g2d.fillRect(75 + x, 44 + y, 1, 1);
        g2d.fillRect(77 + x, 44 + y, 1, 1);
        g2d.fillRect(79 + x, 44 + y, 1, 1);
        g2d.fillRect(81 + x, 44 + y, 1, 1);
        g2d.fillRect(83 + x, 44 + y, 1, 1);
        g2d.fillRect(85 + x, 44 + y, 1, 1);
        g2d.fillRect(87 + x, 44 + y, 1, 1);
        g2d.fillRect(64 + x, 46 + y, 1, 1);
        g2d.fillRect(66 + x, 46 + y, 1, 1);
        g2d.fillRect(68 + x, 46 + y, 1, 1);
        g2d.fillRect(70 + x, 46 + y, 1, 1);
        g2d.fillRect(72 + x, 46 + y, 1, 1);
        g2d.fillRect(74 + x, 46 + y, 1, 1);
        g2d.fillRect(76 + x, 46 + y, 1, 1);
        g2d.fillRect(78 + x, 46 + y, 1, 1);
        g2d.fillRect(80 + x, 46 + y, 1, 1);
        g2d.fillRect(82 + x, 46 + y, 1, 1);
        g2d.fillRect(84 + x, 46 + y, 1, 1);
        g2d.fillRect(86 + x, 46 + y, 1, 1);
        g2d.fillRect(88 + x, 46 + y, 1, 1);
        g2d.fillRect(91 + x, 60 + y, 1, 1);
        g2d.fillRect(67 + x, 61 + y, 7, 1);
        g2d.fillRect(82 + x, 61 + y, 9, 1);
        g2d.fillRect(65 + x, 63 + y, 9, 1);
        g2d.fillRect(82 + x, 63 + y, 13, 1);
        g2d.fillRect(86 + x, 68 + y, 1, 4);
        g2d.fillRect(87 + x, 68 + y, 2, 1);
        g2d.fillRect(74 + x, 69 + y, 2, 1);
        g2d.fillRect(79 + x, 69 + y, 2, 1);
        g2d.fillRect(89 + x, 69 + y, 1, 2);
        g2d.fillRect(69 + x, 71 + y, 11, 1);
        g2d.fillRect(81 + x, 71 + y, 5, 1);
        g2d.fillRect(87 + x, 71 + y, 2, 1);
        g2d.fillRect(93 + x, 71 + y, 11, 1);
        g2d.fillRect(105 + x, 71 + y, 20, 1);


        g2d.setColor(new Color(58,108,114,255));
        g2d.fillRect(63 + x, 136 + y, 2, 1);
        g2d.fillRect(155 + x, 136 + y, 2, 1);


        g2d.setColor(new Color(51,113,117,255));
        g2d.fillRect(69 + x, 77 + y, 1, 5);
        g2d.fillRect(70 + x, 77 + y, 1, 5);
        g2d.fillRect(71 + x, 77 + y, 1, 3);
        g2d.fillRect(72 + x, 77 + y, 1, 3);
        g2d.fillRect(73 + x, 77 + y, 7, 1);
        g2d.fillRect(81 + x, 77 + y, 24, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 3);
        g2d.fillRect(107 + x, 77 + y, 44, 1);
        g2d.fillRect(74 + x, 78 + y, 1, 2);
        g2d.fillRect(76 + x, 78 + y, 1, 2);
        g2d.fillRect(78 + x, 78 + y, 1, 2);
        g2d.fillRect(80 + x, 78 + y, 1, 2);
        g2d.fillRect(82 + x, 78 + y, 1, 2);
        g2d.fillRect(84 + x, 78 + y, 1, 2);
        g2d.fillRect(86 + x, 78 + y, 1, 2);
        g2d.fillRect(88 + x, 78 + y, 1, 2);
        g2d.fillRect(90 + x, 78 + y, 1, 2);
        g2d.fillRect(92 + x, 78 + y, 1, 2);
        g2d.fillRect(94 + x, 78 + y, 1, 2);
        g2d.fillRect(96 + x, 78 + y, 1, 2);
        g2d.fillRect(98 + x, 78 + y, 1, 2);
        g2d.fillRect(100 + x, 78 + y, 1, 2);
        g2d.fillRect(102 + x, 78 + y, 1, 2);
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 2);
        g2d.fillRect(110 + x, 78 + y, 1, 2);
        g2d.fillRect(112 + x, 78 + y, 1, 2);
        g2d.fillRect(114 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 2);
        g2d.fillRect(118 + x, 78 + y, 1, 2);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(122 + x, 78 + y, 1, 2);
        g2d.fillRect(124 + x, 78 + y, 1, 2);
        g2d.fillRect(126 + x, 78 + y, 1, 2);
        g2d.fillRect(128 + x, 78 + y, 1, 2);
        g2d.fillRect(130 + x, 78 + y, 1, 2);
        g2d.fillRect(132 + x, 78 + y, 1, 2);
        g2d.fillRect(134 + x, 78 + y, 1, 2);
        g2d.fillRect(136 + x, 78 + y, 1, 2);
        g2d.fillRect(138 + x, 78 + y, 1, 2);
        g2d.fillRect(140 + x, 78 + y, 1, 2);
        g2d.fillRect(142 + x, 78 + y, 1, 2);
        g2d.fillRect(144 + x, 78 + y, 1, 2);
        g2d.fillRect(146 + x, 78 + y, 1, 2);
        g2d.fillRect(148 + x, 78 + y, 1, 2);
        g2d.fillRect(149 + x, 78 + y, 1, 2);
        g2d.fillRect(150 + x, 78 + y, 1, 2);
        g2d.fillRect(73 + x, 79 + y, 1, 1);
        g2d.fillRect(75 + x, 79 + y, 1, 1);
        g2d.fillRect(77 + x, 79 + y, 1, 1);
        g2d.fillRect(79 + x, 79 + y, 1, 1);
        g2d.fillRect(83 + x, 79 + y, 1, 1);
        g2d.fillRect(85 + x, 79 + y, 1, 1);
        g2d.fillRect(87 + x, 79 + y, 1, 1);
        g2d.fillRect(89 + x, 79 + y, 1, 1);
        g2d.fillRect(91 + x, 79 + y, 1, 1);
        g2d.fillRect(93 + x, 79 + y, 1, 1);
        g2d.fillRect(95 + x, 79 + y, 1, 1);
        g2d.fillRect(97 + x, 79 + y, 1, 1);
        g2d.fillRect(99 + x, 79 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 79 + y, 1, 1);
        g2d.fillRect(121 + x, 79 + y, 1, 1);
        g2d.fillRect(123 + x, 79 + y, 1, 1);
        g2d.fillRect(125 + x, 79 + y, 1, 1);
        g2d.fillRect(127 + x, 79 + y, 1, 1);
        g2d.fillRect(129 + x, 79 + y, 1, 1);
        g2d.fillRect(131 + x, 79 + y, 1, 1);
        g2d.fillRect(133 + x, 79 + y, 1, 1);
        g2d.fillRect(135 + x, 79 + y, 1, 1);
        g2d.fillRect(137 + x, 79 + y, 1, 1);
        g2d.fillRect(139 + x, 79 + y, 1, 1);
        g2d.fillRect(141 + x, 79 + y, 1, 1);
        g2d.fillRect(143 + x, 79 + y, 1, 1);
        g2d.fillRect(145 + x, 79 + y, 1, 1);
        g2d.fillRect(147 + x, 79 + y, 1, 1);


        g2d.setColor(new Color(105,105,105,255));
        g2d.fillRect(60 + x, 72 + y, 1, 5);
        g2d.fillRect(61 + x, 72 + y, 19, 1);
        g2d.fillRect(81 + x, 72 + y, 24, 1);
        g2d.fillRect(106 + x, 72 + y, 54, 1);
        g2d.fillRect(159 + x, 73 + y, 1, 4);
        g2d.fillRect(61 + x, 76 + y, 19, 1);
        g2d.fillRect(81 + x, 76 + y, 24, 1);
        g2d.fillRect(106 + x, 76 + y, 46, 1);
        g2d.fillRect(154 + x, 76 + y, 1, 59);
        g2d.fillRect(155 + x, 76 + y, 4, 1);
        g2d.fillRect(62 + x, 77 + y, 1, 58);
        g2d.fillRect(65 + x, 77 + y, 1, 58);
        g2d.fillRect(157 + x, 77 + y, 1, 58);
        g2d.fillRect(66 + x, 82 + y, 15, 1);
        g2d.fillRect(82 + x, 82 + y, 23, 1);
        g2d.fillRect(106 + x, 82 + y, 48, 1);
        g2d.fillRect(66 + x, 126 + y, 13, 1);
        g2d.fillRect(80 + x, 126 + y, 25, 1);
        g2d.fillRect(106 + x, 126 + y, 48, 1);
        g2d.fillRect(66 + x, 132 + y, 15, 1);
        g2d.fillRect(82 + x, 132 + y, 22, 1);
        g2d.fillRect(105 + x, 132 + y, 49, 1);
        g2d.fillRect(63 + x, 135 + y, 2, 1);
        g2d.fillRect(155 + x, 135 + y, 2, 1);


        g2d.setColor(new Color(126,125,113,255));
        g2d.fillRect(60 + x, 41 + y, 1, 3);
        g2d.fillRect(61 + x, 44 + y, 1, 5);
        g2d.fillRect(62 + x, 49 + y, 1, 5);
        g2d.fillRect(63 + x, 54 + y, 1, 5);
        g2d.fillRect(66 + x, 55 + y, 24, 1);
        g2d.fillRect(65 + x, 56 + y, 1, 3);
        g2d.fillRect(90 + x, 56 + y, 1, 3);
        g2d.fillRect(75 + x, 58 + y, 6, 1);
        g2d.fillRect(64 + x, 59 + y, 1, 4);
        g2d.fillRect(66 + x, 59 + y, 1, 2);
        g2d.fillRect(74 + x, 59 + y, 1, 2);
        g2d.fillRect(81 + x, 59 + y, 1, 10);
        g2d.fillRect(91 + x, 59 + y, 1, 1);
        g2d.fillRect(69 + x, 68 + y, 5, 1);
        g2d.fillRect(76 + x, 68 + y, 3, 1);
        g2d.fillRect(82 + x, 68 + y, 4, 1);
        g2d.fillRect(96 + x, 68 + y, 29, 1);
        g2d.fillRect(68 + x, 69 + y, 1, 2);
        g2d.fillRect(94 + x, 69 + y, 2, 1);
        g2d.fillRect(98 + x, 69 + y, 1, 2);
        g2d.fillRect(125 + x, 69 + y, 1, 2);
        g2d.fillRect(93 + x, 70 + y, 1, 1);


        g2d.setColor(new Color(124,124,124,255));
        g2d.fillRect(142 + x, 62 + y, 1, 6);
        g2d.fillRect(143 + x, 62 + y, 7, 1);
        g2d.fillRect(151 + x, 63 + y, 3, 1);


//        g2d.setColor(new Color(42,129,248,255));
        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(61 + x, 40 + y, 31, 1);
        g2d.fillRect(91 + x, 41 + y, 1, 3);
        g2d.fillRect(92 + x, 44 + y, 1, 5);
        g2d.fillRect(93 + x, 49 + y, 1, 5);
        g2d.fillRect(94 + x, 54 + y, 1, 5);
        g2d.fillRect(95 + x, 59 + y, 1, 4);
        g2d.fillRect(82 + x, 69 + y, 3, 1);
        g2d.fillRect(84 + x, 70 + y, 1, 1);


        g2d.setColor(new Color(149,149,149,255));
        g2d.fillRect(66 + x, 128 + y, 1, 4);
        g2d.fillRect(67 + x, 128 + y, 1, 4);
        g2d.fillRect(68 + x, 131 + y, 12, 1);
        g2d.fillRect(81 + x, 131 + y, 23, 1);
        g2d.fillRect(105 + x, 131 + y, 49, 1);


        g2d.setColor(new Color(111,170,174,255));
        g2d.fillRect(71 + x, 80 + y, 1, 2);
        g2d.fillRect(72 + x, 80 + y, 1, 2);
        g2d.fillRect(74 + x, 80 + y, 1, 2);
        g2d.fillRect(76 + x, 80 + y, 1, 2);
        g2d.fillRect(78 + x, 80 + y, 1, 2);
        g2d.fillRect(80 + x, 80 + y, 1, 2);
        g2d.fillRect(82 + x, 80 + y, 1, 2);
        g2d.fillRect(84 + x, 80 + y, 1, 2);
        g2d.fillRect(86 + x, 80 + y, 1, 2);
        g2d.fillRect(88 + x, 80 + y, 1, 2);
        g2d.fillRect(90 + x, 80 + y, 1, 2);
        g2d.fillRect(92 + x, 80 + y, 1, 2);
        g2d.fillRect(94 + x, 80 + y, 1, 2);
        g2d.fillRect(96 + x, 80 + y, 1, 2);
        g2d.fillRect(98 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(106 + x, 80 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 2);
        g2d.fillRect(110 + x, 80 + y, 1, 2);
        g2d.fillRect(112 + x, 80 + y, 1, 2);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(116 + x, 80 + y, 1, 2);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 80 + y, 1, 2);
        g2d.fillRect(122 + x, 80 + y, 1, 2);
        g2d.fillRect(124 + x, 80 + y, 1, 2);
        g2d.fillRect(126 + x, 80 + y, 1, 2);
        g2d.fillRect(128 + x, 80 + y, 1, 2);
        g2d.fillRect(130 + x, 80 + y, 1, 2);
        g2d.fillRect(132 + x, 80 + y, 1, 2);
        g2d.fillRect(134 + x, 80 + y, 1, 2);
        g2d.fillRect(136 + x, 80 + y, 1, 2);
        g2d.fillRect(138 + x, 80 + y, 1, 2);
        g2d.fillRect(140 + x, 80 + y, 1, 2);
        g2d.fillRect(142 + x, 80 + y, 1, 2);
        g2d.fillRect(144 + x, 80 + y, 1, 2);
        g2d.fillRect(146 + x, 80 + y, 1, 2);
        g2d.fillRect(148 + x, 80 + y, 1, 2);
        g2d.fillRect(149 + x, 80 + y, 1, 2);
        g2d.fillRect(150 + x, 80 + y, 1, 2);
        g2d.fillRect(73 + x, 81 + y, 1, 1);
        g2d.fillRect(75 + x, 81 + y, 1, 1);
        g2d.fillRect(77 + x, 81 + y, 1, 1);
        g2d.fillRect(79 + x, 81 + y, 1, 1);
        g2d.fillRect(83 + x, 81 + y, 1, 1);
        g2d.fillRect(85 + x, 81 + y, 1, 1);
        g2d.fillRect(87 + x, 81 + y, 1, 1);
        g2d.fillRect(89 + x, 81 + y, 1, 1);
        g2d.fillRect(91 + x, 81 + y, 1, 1);
        g2d.fillRect(93 + x, 81 + y, 1, 1);
        g2d.fillRect(95 + x, 81 + y, 1, 1);
        g2d.fillRect(97 + x, 81 + y, 1, 1);
        g2d.fillRect(99 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 81 + y, 1, 1);
        g2d.fillRect(123 + x, 81 + y, 1, 1);
        g2d.fillRect(125 + x, 81 + y, 1, 1);
        g2d.fillRect(127 + x, 81 + y, 1, 1);
        g2d.fillRect(129 + x, 81 + y, 1, 1);
        g2d.fillRect(131 + x, 81 + y, 1, 1);
        g2d.fillRect(133 + x, 81 + y, 1, 1);
        g2d.fillRect(135 + x, 81 + y, 1, 1);
        g2d.fillRect(137 + x, 81 + y, 1, 1);
        g2d.fillRect(139 + x, 81 + y, 1, 1);
        g2d.fillRect(141 + x, 81 + y, 1, 1);
        g2d.fillRect(143 + x, 81 + y, 1, 1);
        g2d.fillRect(145 + x, 81 + y, 1, 1);
        g2d.fillRect(147 + x, 81 + y, 1, 1);


        g2d.setColor(new Color(170,169,147,255));
        g2d.fillRect(89 + x, 56 + y, 1, 5);
        g2d.fillRect(91 + x, 57 + y, 1, 2);
        g2d.fillRect(80 + x, 59 + y, 1, 10);
        g2d.fillRect(90 + x, 59 + y, 1, 2);
        g2d.fillRect(92 + x, 59 + y, 1, 4);
        g2d.fillRect(67 + x, 60 + y, 7, 1);
        g2d.fillRect(82 + x, 60 + y, 7, 1);
        g2d.fillRect(74 + x, 61 + y, 1, 8);
        g2d.fillRect(91 + x, 61 + y, 1, 2);
        g2d.fillRect(93 + x, 61 + y, 1, 2);
        g2d.fillRect(65 + x, 62 + y, 9, 1);
        g2d.fillRect(82 + x, 62 + y, 9, 1);
        g2d.fillRect(124 + x, 69 + y, 1, 2);
        g2d.fillRect(99 + x, 70 + y, 3, 1);
        g2d.fillRect(104 + x, 70 + y, 20, 1);


        g2d.setColor(new Color(179,179,179,255));
        g2d.fillRect(158 + x, 74 + y, 1, 2);
        g2d.fillRect(61 + x, 75 + y, 19, 1);
        g2d.fillRect(81 + x, 75 + y, 24, 1);
        g2d.fillRect(106 + x, 75 + y, 52, 1);
        g2d.fillRect(63 + x, 77 + y, 1, 3);
        g2d.fillRect(64 + x, 77 + y, 1, 58);
        g2d.fillRect(155 + x, 77 + y, 1, 3);
        g2d.fillRect(156 + x, 77 + y, 1, 58);
        g2d.fillRect(63 + x, 134 + y, 1, 1);
        g2d.fillRect(155 + x, 134 + y, 1, 1);


        g2d.setColor(new Color(184,184,184,255));
        g2d.fillRect(66 + x, 84 + y, 1, 42);
        g2d.fillRect(67 + x, 84 + y, 1, 42);
        g2d.fillRect(68 + x, 125 + y, 11, 1);
        g2d.fillRect(80 + x, 125 + y, 25, 1);
        g2d.fillRect(106 + x, 125 + y, 48, 1);


        g2d.setColor(new Color(185,184,184,255));
        g2d.fillRect(142 + x, 70 + y, 2, 1);
        g2d.fillRect(147 + x, 70 + y, 4, 1);


        g2d.setColor(new Color(194,193,193,255));
        g2d.fillRect(66 + x, 127 + y, 2, 1);
        g2d.fillRect(68 + x, 128 + y, 1, 3);
        g2d.fillRect(69 + x, 128 + y, 1, 3);
        g2d.fillRect(70 + x, 128 + y, 1, 3);
        g2d.fillRect(71 + x, 128 + y, 1, 3);
        g2d.fillRect(72 + x, 128 + y, 1, 3);
        g2d.fillRect(73 + x, 128 + y, 1, 3);
        g2d.fillRect(74 + x, 128 + y, 1, 3);
        g2d.fillRect(75 + x, 128 + y, 1, 3);
        g2d.fillRect(76 + x, 128 + y, 1, 3);
        g2d.fillRect(77 + x, 128 + y, 1, 3);
        g2d.fillRect(78 + x, 128 + y, 1, 3);
        g2d.fillRect(80 + x, 128 + y, 1, 3);
        g2d.fillRect(81 + x, 128 + y, 1, 3);
        g2d.fillRect(82 + x, 128 + y, 1, 3);
        g2d.fillRect(83 + x, 128 + y, 1, 3);
        g2d.fillRect(84 + x, 128 + y, 1, 3);
        g2d.fillRect(85 + x, 128 + y, 1, 3);
        g2d.fillRect(86 + x, 128 + y, 1, 3);
        g2d.fillRect(87 + x, 128 + y, 1, 3);
        g2d.fillRect(88 + x, 128 + y, 1, 3);
        g2d.fillRect(89 + x, 128 + y, 1, 3);
        g2d.fillRect(90 + x, 128 + y, 1, 3);
        g2d.fillRect(91 + x, 128 + y, 1, 3);
        g2d.fillRect(92 + x, 128 + y, 1, 3);
        g2d.fillRect(93 + x, 128 + y, 1, 3);
        g2d.fillRect(94 + x, 128 + y, 1, 3);
        g2d.fillRect(95 + x, 128 + y, 1, 3);
        g2d.fillRect(96 + x, 128 + y, 1, 3);
        g2d.fillRect(97 + x, 128 + y, 1, 3);
        g2d.fillRect(98 + x, 128 + y, 1, 3);
        g2d.fillRect(99 + x, 128 + y, 1, 3);
        g2d.fillRect(100 + x, 128 + y, 1, 3);
        g2d.fillRect(101 + x, 128 + y, 1, 3);
        g2d.fillRect(102 + x, 128 + y, 1, 3);
        g2d.fillRect(103 + x, 128 + y, 1, 3);
        g2d.fillRect(104 + x, 128 + y, 1, 2);
        g2d.fillRect(106 + x, 128 + y, 1, 3);
        g2d.fillRect(107 + x, 128 + y, 1, 3);
        g2d.fillRect(108 + x, 128 + y, 1, 3);
        g2d.fillRect(109 + x, 128 + y, 1, 3);
        g2d.fillRect(110 + x, 128 + y, 1, 3);
        g2d.fillRect(111 + x, 128 + y, 1, 3);
        g2d.fillRect(112 + x, 128 + y, 1, 3);
        g2d.fillRect(113 + x, 128 + y, 1, 3);
        g2d.fillRect(114 + x, 128 + y, 1, 3);
        g2d.fillRect(115 + x, 128 + y, 1, 3);
        g2d.fillRect(116 + x, 128 + y, 1, 3);
        g2d.fillRect(117 + x, 128 + y, 1, 3);
        g2d.fillRect(118 + x, 128 + y, 1, 3);
        g2d.fillRect(119 + x, 128 + y, 1, 3);
        g2d.fillRect(120 + x, 128 + y, 1, 3);
        g2d.fillRect(121 + x, 128 + y, 1, 3);
        g2d.fillRect(122 + x, 128 + y, 1, 3);
        g2d.fillRect(123 + x, 128 + y, 1, 3);
        g2d.fillRect(124 + x, 128 + y, 1, 3);
        g2d.fillRect(125 + x, 128 + y, 1, 3);
        g2d.fillRect(126 + x, 128 + y, 1, 3);
        g2d.fillRect(127 + x, 128 + y, 1, 3);
        g2d.fillRect(128 + x, 128 + y, 1, 3);
        g2d.fillRect(129 + x, 128 + y, 1, 3);
        g2d.fillRect(130 + x, 128 + y, 1, 3);
        g2d.fillRect(131 + x, 128 + y, 1, 3);
        g2d.fillRect(132 + x, 128 + y, 1, 3);
        g2d.fillRect(133 + x, 128 + y, 1, 3);
        g2d.fillRect(134 + x, 128 + y, 1, 3);
        g2d.fillRect(135 + x, 128 + y, 1, 3);
        g2d.fillRect(136 + x, 128 + y, 1, 3);
        g2d.fillRect(137 + x, 128 + y, 1, 3);
        g2d.fillRect(138 + x, 128 + y, 1, 3);
        g2d.fillRect(139 + x, 128 + y, 1, 3);
        g2d.fillRect(140 + x, 128 + y, 1, 3);
        g2d.fillRect(141 + x, 128 + y, 1, 3);
        g2d.fillRect(142 + x, 128 + y, 1, 3);
        g2d.fillRect(143 + x, 128 + y, 1, 3);
        g2d.fillRect(144 + x, 128 + y, 1, 3);
        g2d.fillRect(145 + x, 128 + y, 1, 3);
        g2d.fillRect(146 + x, 128 + y, 1, 3);
        g2d.fillRect(147 + x, 128 + y, 1, 3);
        g2d.fillRect(148 + x, 128 + y, 1, 3);
        g2d.fillRect(149 + x, 128 + y, 1, 3);
        g2d.fillRect(150 + x, 128 + y, 1, 3);
        g2d.fillRect(151 + x, 128 + y, 1, 3);
        g2d.fillRect(152 + x, 128 + y, 1, 3);
        g2d.fillRect(153 + x, 128 + y, 1, 3);
        g2d.fillRect(105 + x, 130 + y, 1, 1);
        g2d.fillRect(63 + x, 131 + y, 1, 3);
        g2d.fillRect(155 + x, 131 + y, 1, 3);


        g2d.setColor(new Color(222,221,198,255));
        g2d.fillRect(90 + x, 41 + y, 1, 9);
        g2d.fillRect(61 + x, 42 + y, 1, 2);
        g2d.fillRect(62 + x, 42 + y, 1, 2);
        g2d.fillRect(63 + x, 42 + y, 1, 2);
        g2d.fillRect(64 + x, 42 + y, 1, 2);
        g2d.fillRect(65 + x, 42 + y, 1, 2);
        g2d.fillRect(66 + x, 42 + y, 1, 2);
        g2d.fillRect(67 + x, 42 + y, 1, 2);
        g2d.fillRect(68 + x, 42 + y, 1, 2);
        g2d.fillRect(69 + x, 42 + y, 1, 2);
        g2d.fillRect(70 + x, 42 + y, 1, 2);
        g2d.fillRect(71 + x, 42 + y, 1, 2);
        g2d.fillRect(72 + x, 42 + y, 1, 2);
        g2d.fillRect(73 + x, 42 + y, 1, 2);
        g2d.fillRect(74 + x, 42 + y, 1, 2);
        g2d.fillRect(75 + x, 42 + y, 1, 2);
        g2d.fillRect(76 + x, 42 + y, 1, 2);
        g2d.fillRect(77 + x, 42 + y, 1, 2);
        g2d.fillRect(78 + x, 42 + y, 1, 2);
        g2d.fillRect(79 + x, 42 + y, 1, 2);
        g2d.fillRect(80 + x, 42 + y, 1, 2);
        g2d.fillRect(81 + x, 42 + y, 1, 2);
        g2d.fillRect(82 + x, 42 + y, 1, 2);
        g2d.fillRect(83 + x, 42 + y, 1, 2);
        g2d.fillRect(84 + x, 42 + y, 1, 2);
        g2d.fillRect(85 + x, 42 + y, 1, 2);
        g2d.fillRect(86 + x, 42 + y, 1, 2);
        g2d.fillRect(87 + x, 42 + y, 1, 2);
        g2d.fillRect(88 + x, 42 + y, 1, 2);
        g2d.fillRect(89 + x, 42 + y, 1, 4);
        g2d.fillRect(91 + x, 44 + y, 1, 10);
        g2d.fillRect(92 + x, 49 + y, 1, 10);
        g2d.fillRect(93 + x, 54 + y, 1, 7);
        g2d.fillRect(88 + x, 56 + y, 1, 4);
        g2d.fillRect(64 + x, 58 + y, 1, 1);
        g2d.fillRect(65 + x, 59 + y, 1, 3);
        g2d.fillRect(67 + x, 59 + y, 7, 1);
        g2d.fillRect(75 + x, 59 + y, 5, 1);
        g2d.fillRect(82 + x, 59 + y, 6, 1);
        g2d.fillRect(94 + x, 59 + y, 1, 4);
        g2d.fillRect(79 + x, 60 + y, 1, 9);
        g2d.fillRect(66 + x, 61 + y, 1, 1);
        g2d.fillRect(75 + x, 67 + y, 1, 2);
        g2d.fillRect(76 + x, 67 + y, 3, 1);
        g2d.fillRect(85 + x, 69 + y, 1, 2);
        g2d.fillRect(87 + x, 69 + y, 1, 2);
        g2d.fillRect(88 + x, 69 + y, 1, 2);
        g2d.fillRect(97 + x, 69 + y, 1, 2);
        g2d.fillRect(99 + x, 69 + y, 25, 1);
        g2d.fillRect(69 + x, 70 + y, 12, 1);
        g2d.fillRect(96 + x, 70 + y, 1, 1);


        g2d.setColor(new Color(215,214,214,255));
        g2d.fillRect(158 + x, 73 + y, 1, 1);
        g2d.fillRect(61 + x, 74 + y, 19, 1);
        g2d.fillRect(81 + x, 74 + y, 24, 1);
        g2d.fillRect(106 + x, 74 + y, 52, 1);


        g2d.setColor(new Color(216,216,216,255));
        g2d.fillRect(148 + x, 63 + y, 1, 5);
        g2d.fillRect(149 + x, 63 + y, 1, 5);
        g2d.fillRect(151 + x, 66 + y, 2, 1);
        g2d.fillRect(149 + x, 69 + y, 3, 1);
        g2d.fillRect(144 + x, 70 + y, 1, 2);
        g2d.fillRect(145 + x, 70 + y, 1, 2);
        g2d.fillRect(146 + x, 70 + y, 1, 2);
        g2d.fillRect(143 + x, 71 + y, 1, 1);
        g2d.fillRect(147 + x, 71 + y, 3, 1);


        g2d.setColor(new Color(226,225,225,255));
        g2d.fillRect(66 + x, 83 + y, 2, 1);
        g2d.fillRect(153 + x, 83 + y, 1, 42);
        g2d.fillRect(68 + x, 84 + y, 1, 41);
        g2d.fillRect(69 + x, 84 + y, 1, 41);
        g2d.fillRect(70 + x, 84 + y, 1, 41);
        g2d.fillRect(71 + x, 84 + y, 1, 41);
        g2d.fillRect(72 + x, 84 + y, 1, 41);
        g2d.fillRect(73 + x, 84 + y, 1, 41);
        g2d.fillRect(74 + x, 84 + y, 1, 41);
        g2d.fillRect(75 + x, 84 + y, 1, 41);
        g2d.fillRect(76 + x, 84 + y, 1, 41);
        g2d.fillRect(77 + x, 84 + y, 1, 41);
        g2d.fillRect(78 + x, 84 + y, 1, 41);
        g2d.fillRect(79 + x, 84 + y, 1, 38);
        g2d.fillRect(80 + x, 84 + y, 1, 33);
        g2d.fillRect(82 + x, 84 + y, 1, 41);
        g2d.fillRect(83 + x, 84 + y, 1, 41);
        g2d.fillRect(84 + x, 84 + y, 1, 41);
        g2d.fillRect(85 + x, 84 + y, 1, 41);
        g2d.fillRect(86 + x, 84 + y, 1, 41);
        g2d.fillRect(87 + x, 84 + y, 1, 41);
        g2d.fillRect(88 + x, 84 + y, 1, 41);
        g2d.fillRect(89 + x, 84 + y, 1, 41);
        g2d.fillRect(90 + x, 84 + y, 1, 41);
        g2d.fillRect(91 + x, 84 + y, 1, 41);
        g2d.fillRect(92 + x, 84 + y, 1, 41);
        g2d.fillRect(93 + x, 84 + y, 1, 41);
        g2d.fillRect(94 + x, 84 + y, 1, 41);
        g2d.fillRect(95 + x, 84 + y, 1, 41);
        g2d.fillRect(96 + x, 84 + y, 1, 41);
        g2d.fillRect(97 + x, 84 + y, 1, 41);
        g2d.fillRect(98 + x, 84 + y, 1, 41);
        g2d.fillRect(99 + x, 84 + y, 1, 41);
        g2d.fillRect(100 + x, 84 + y, 1, 41);
        g2d.fillRect(101 + x, 84 + y, 1, 41);
        g2d.fillRect(102 + x, 84 + y, 1, 41);
        g2d.fillRect(103 + x, 84 + y, 1, 5);
        g2d.fillRect(105 + x, 84 + y, 1, 41);
        g2d.fillRect(106 + x, 84 + y, 1, 41);
        g2d.fillRect(107 + x, 84 + y, 1, 41);
        g2d.fillRect(108 + x, 84 + y, 1, 41);
        g2d.fillRect(109 + x, 84 + y, 1, 41);
        g2d.fillRect(110 + x, 84 + y, 1, 41);
        g2d.fillRect(111 + x, 84 + y, 1, 41);
        g2d.fillRect(112 + x, 84 + y, 1, 41);
        g2d.fillRect(113 + x, 84 + y, 1, 41);
        g2d.fillRect(114 + x, 84 + y, 1, 41);
        g2d.fillRect(115 + x, 84 + y, 1, 41);
        g2d.fillRect(116 + x, 84 + y, 1, 41);
        g2d.fillRect(117 + x, 84 + y, 1, 41);
        g2d.fillRect(118 + x, 84 + y, 1, 41);
        g2d.fillRect(119 + x, 84 + y, 1, 41);
        g2d.fillRect(120 + x, 84 + y, 1, 41);
        g2d.fillRect(121 + x, 84 + y, 1, 41);
        g2d.fillRect(122 + x, 84 + y, 1, 41);
        g2d.fillRect(123 + x, 84 + y, 1, 41);
        g2d.fillRect(124 + x, 84 + y, 1, 41);
        g2d.fillRect(125 + x, 84 + y, 1, 41);
        g2d.fillRect(126 + x, 84 + y, 1, 41);
        g2d.fillRect(127 + x, 84 + y, 1, 41);
        g2d.fillRect(128 + x, 84 + y, 1, 41);
        g2d.fillRect(129 + x, 84 + y, 1, 41);
        g2d.fillRect(130 + x, 84 + y, 1, 41);
        g2d.fillRect(131 + x, 84 + y, 1, 41);
        g2d.fillRect(132 + x, 84 + y, 1, 41);
        g2d.fillRect(133 + x, 84 + y, 1, 41);
        g2d.fillRect(134 + x, 84 + y, 1, 41);
        g2d.fillRect(135 + x, 84 + y, 1, 41);
        g2d.fillRect(136 + x, 84 + y, 1, 41);
        g2d.fillRect(137 + x, 84 + y, 1, 41);
        g2d.fillRect(138 + x, 84 + y, 1, 41);
        g2d.fillRect(139 + x, 84 + y, 1, 41);
        g2d.fillRect(140 + x, 84 + y, 1, 41);
        g2d.fillRect(141 + x, 84 + y, 1, 41);
        g2d.fillRect(142 + x, 84 + y, 1, 41);
        g2d.fillRect(143 + x, 84 + y, 1, 41);
        g2d.fillRect(144 + x, 84 + y, 1, 41);
        g2d.fillRect(145 + x, 84 + y, 1, 41);
        g2d.fillRect(146 + x, 84 + y, 1, 41);
        g2d.fillRect(147 + x, 84 + y, 1, 41);
        g2d.fillRect(148 + x, 84 + y, 1, 41);
        g2d.fillRect(149 + x, 84 + y, 1, 41);
        g2d.fillRect(150 + x, 84 + y, 1, 41);
        g2d.fillRect(151 + x, 84 + y, 1, 41);
        g2d.fillRect(152 + x, 84 + y, 1, 41);
        g2d.fillRect(104 + x, 89 + y, 1, 32);
        g2d.fillRect(81 + x, 117 + y, 1, 8);
        g2d.fillRect(103 + x, 121 + y, 1, 4);
        g2d.fillRect(80 + x, 122 + y, 1, 3);


        g2d.setColor(new Color(227,226,226,255));
        g2d.fillRect(68 + x, 127 + y, 11, 1);
        g2d.fillRect(80 + x, 127 + y, 25, 1);
        g2d.fillRect(106 + x, 127 + y, 48, 1);


        g2d.setColor(new Color(241,240,240,255));
        g2d.fillRect(61 + x, 73 + y, 19, 1);
        g2d.fillRect(81 + x, 73 + y, 24, 1);
        g2d.fillRect(106 + x, 73 + y, 52, 1);
        g2d.fillRect(63 + x, 80 + y, 1, 51);
        g2d.fillRect(155 + x, 80 + y, 1, 51);


        g2d.setColor(new Color(255,254,236,255));
        g2d.fillRect(62 + x, 44 + y, 1, 5);
        g2d.fillRect(64 + x, 44 + y, 1, 2);
        g2d.fillRect(66 + x, 44 + y, 1, 2);
        g2d.fillRect(68 + x, 44 + y, 1, 2);
        g2d.fillRect(70 + x, 44 + y, 1, 2);
        g2d.fillRect(72 + x, 44 + y, 1, 2);
        g2d.fillRect(74 + x, 44 + y, 1, 2);
        g2d.fillRect(76 + x, 44 + y, 1, 2);
        g2d.fillRect(78 + x, 44 + y, 1, 2);
        g2d.fillRect(80 + x, 44 + y, 1, 2);
        g2d.fillRect(82 + x, 44 + y, 1, 2);
        g2d.fillRect(84 + x, 44 + y, 1, 2);
        g2d.fillRect(86 + x, 44 + y, 1, 2);
        g2d.fillRect(88 + x, 44 + y, 1, 2);
        g2d.fillRect(63 + x, 45 + y, 1, 9);
        g2d.fillRect(65 + x, 45 + y, 1, 11);
        g2d.fillRect(67 + x, 45 + y, 1, 10);
        g2d.fillRect(69 + x, 45 + y, 1, 10);
        g2d.fillRect(71 + x, 45 + y, 1, 10);
        g2d.fillRect(73 + x, 45 + y, 1, 10);
        g2d.fillRect(75 + x, 45 + y, 1, 10);
        g2d.fillRect(77 + x, 45 + y, 1, 10);
        g2d.fillRect(79 + x, 45 + y, 1, 10);
        g2d.fillRect(81 + x, 45 + y, 1, 10);
        g2d.fillRect(83 + x, 45 + y, 1, 10);
        g2d.fillRect(85 + x, 45 + y, 1, 10);
        g2d.fillRect(87 + x, 45 + y, 1, 10);
        g2d.fillRect(89 + x, 46 + y, 1, 9);
        g2d.fillRect(64 + x, 47 + y, 1, 11);
        g2d.fillRect(66 + x, 47 + y, 1, 8);
        g2d.fillRect(68 + x, 47 + y, 1, 8);
        g2d.fillRect(70 + x, 47 + y, 1, 8);
        g2d.fillRect(72 + x, 47 + y, 1, 8);
        g2d.fillRect(74 + x, 47 + y, 1, 8);
        g2d.fillRect(76 + x, 47 + y, 1, 8);
        g2d.fillRect(78 + x, 47 + y, 1, 8);
        g2d.fillRect(80 + x, 47 + y, 1, 8);
        g2d.fillRect(82 + x, 47 + y, 1, 8);
        g2d.fillRect(84 + x, 47 + y, 1, 8);
        g2d.fillRect(86 + x, 47 + y, 1, 8);
        g2d.fillRect(88 + x, 47 + y, 1, 8);
        g2d.fillRect(90 + x, 50 + y, 1, 6);
        g2d.fillRect(91 + x, 54 + y, 1, 3);
        g2d.fillRect(66 + x, 56 + y, 22, 1);
        g2d.fillRect(66 + x, 58 + y, 9, 1);
        g2d.fillRect(81 + x, 58 + y, 7, 1);
        g2d.fillRect(76 + x, 60 + y, 1, 7);
        g2d.fillRect(77 + x, 60 + y, 1, 7);
        g2d.fillRect(69 + x, 69 + y, 5, 1);
        g2d.fillRect(76 + x, 69 + y, 3, 1);
        g2d.fillRect(81 + x, 69 + y, 1, 1);
        g2d.fillRect(96 + x, 69 + y, 1, 1);
        g2d.fillRect(94 + x, 70 + y, 2, 1);


        g2d.setColor(new Color(253,253,253,255));
        g2d.fillRect(61 + x, 41 + y, 29, 1);
        g2d.fillRect(66 + x, 57 + y, 22, 1);
        g2d.fillRect(75 + x, 60 + y, 1, 7);
        g2d.fillRect(78 + x, 60 + y, 1, 7);


        g2d.setColor(new Color(255,255,255,255));
        g2d.fillRect(143 + x, 63 + y, 1, 5);
        g2d.fillRect(144 + x, 63 + y, 1, 5);
        g2d.fillRect(145 + x, 63 + y, 1, 5);
        g2d.fillRect(146 + x, 63 + y, 1, 5);
        g2d.fillRect(147 + x, 63 + y, 1, 5);
        g2d.fillRect(151 + x, 64 + y, 3, 1);
        g2d.fillRect(153 + x, 65 + y, 1, 1);
        g2d.fillRect(151 + x, 67 + y, 1, 1);
        g2d.fillRect(141 + x, 69 + y, 8, 1);
        g2d.fillRect(68 + x, 83 + y, 13, 1);
        g2d.fillRect(82 + x, 83 + y, 23, 1);
        g2d.fillRect(106 + x, 83 + y, 47, 1);
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
