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
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class SittingD extends Sitting
{
    b.Bd bd = new b.Bd();
    /** Creates a new instance of GenericClothes */
    public SittingD()
    {
        super();
    }

    public SittingD(int layer)
    {
        super(layer);
    }

    public SittingD(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public SittingD(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }
    
    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        paintD(offsetX, offsetY, g2d);
    }
    
    public void paintD(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 53 + y, 1, 4);
        g2d.fillRect(118 + x, 53 + y, 1, 4);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 2, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 2, 1);
        g2d.fillRect(101 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 60 + y, 1, 4);
        g2d.fillRect(107 + x, 60 + y, 1, 4);
        g2d.fillRect(113 + x, 60 + y, 2, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 2, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 2);
        g2d.fillRect(113 + x, 65 + y, 1, 2);
        g2d.fillRect(125 + x, 65 + y, 1, 3);
        g2d.fillRect(126 + x, 65 + y, 1, 2);
        g2d.fillRect(124 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 67 + y, 2, 1);
        g2d.fillRect(131 + x, 67 + y, 1, 3);
        g2d.fillRect(132 + x, 67 + y, 1, 3);
        g2d.fillRect(130 + x, 68 + y, 1, 1);
        g2d.fillRect(133 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 4);
        g2d.fillRect(115 + x, 69 + y, 1, 4);
        g2d.fillRect(106 + x, 70 + y, 2, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 2);
        g2d.fillRect(136 + x, 70 + y, 2, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 2);
        g2d.fillRect(135 + x, 71 + y, 1, 2);
        g2d.fillRect(138 + x, 71 + y, 1, 2);
        g2d.fillRect(106 + x, 73 + y, 2, 1);
        g2d.fillRect(136 + x, 73 + y, 2, 1);
        g2d.fillRect(124 + x, 74 + y, 2, 1);
        g2d.fillRect(123 + x, 75 + y, 1, 2);
        g2d.fillRect(126 + x, 75 + y, 1, 2);
        g2d.fillRect(117 + x, 77 + y, 1, 4);
        g2d.fillRect(118 + x, 77 + y, 1, 4);
        g2d.fillRect(124 + x, 77 + y, 2, 1);
        g2d.fillRect(139 + x, 77 + y, 1, 4);
        g2d.fillRect(116 + x, 78 + y, 1, 2);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(138 + x, 78 + y, 1, 2);
        g2d.fillRect(140 + x, 78 + y, 1, 3);
        g2d.fillRect(111 + x, 79 + y, 2, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 80 + y, 1, 2);
        g2d.fillRect(128 + x, 80 + y, 1, 4);
        g2d.fillRect(129 + x, 80 + y, 1, 4);
        g2d.fillRect(103 + x, 81 + y, 1, 3);
        g2d.fillRect(104 + x, 81 + y, 1, 4);
        g2d.fillRect(105 + x, 81 + y, 1, 3);
        g2d.fillRect(127 + x, 81 + y, 1, 2);
        g2d.fillRect(130 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 1, 2);
        g2d.fillRect(111 + x, 82 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 2, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(122 + x, 85 + y, 1, 2);
        g2d.fillRect(132 + x, 86 + y, 2, 1);
        g2d.fillRect(120 + x, 87 + y, 2, 1);
        g2d.fillRect(131 + x, 87 + y, 1, 2);
        g2d.fillRect(134 + x, 87 + y, 1, 2);
        g2d.fillRect(126 + x, 88 + y, 1, 4);
        g2d.fillRect(127 + x, 88 + y, 1, 4);
        g2d.fillRect(128 + x, 89 + y, 1, 2);
        g2d.fillRect(132 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 4);
        g2d.fillRect(113 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 92 + y, 1, 2);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 2);
        g2d.fillRect(103 + x, 94 + y, 2, 1);
        g2d.fillRect(120 + x, 98 + y, 2, 1);
        g2d.fillRect(119 + x, 99 + y, 1, 2);
        g2d.fillRect(122 + x, 99 + y, 1, 2);
        g2d.fillRect(104 + x, 101 + y, 1, 4);
        g2d.fillRect(120 + x, 101 + y, 2, 1);
        g2d.fillRect(105 + x, 102 + y, 1, 2);
        g2d.fillRect(128 + x, 102 + y, 1, 4);
        g2d.fillRect(129 + x, 102 + y, 1, 3);
        g2d.fillRect(109 + x, 103 + y, 2, 1);
        g2d.fillRect(127 + x, 103 + y, 1, 2);
        g2d.fillRect(130 + x, 103 + y, 1, 1);
        g2d.fillRect(108 + x, 104 + y, 1, 2);
        g2d.fillRect(111 + x, 104 + y, 1, 2);
        g2d.fillRect(109 + x, 106 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(127 + x, 64 + y, 1, 1);
        g2d.fillRect(134 + x, 64 + y, 1, 1);
        g2d.fillRect(135 + x, 65 + y, 2, 1);
        g2d.fillRect(136 + x, 66 + y, 1, 1);
        g2d.fillRect(123 + x, 67 + y, 1, 1);
        g2d.fillRect(122 + x, 68 + y, 1, 2);
        g2d.fillRect(137 + x, 68 + y, 1, 1);
        g2d.fillRect(119 + x, 70 + y, 1, 1);
        g2d.fillRect(138 + x, 70 + y, 3, 1);
        g2d.fillRect(139 + x, 71 + y, 1, 2);
        g2d.fillRect(140 + x, 71 + y, 1, 1);
        g2d.fillRect(138 + x, 73 + y, 1, 2);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(114 + x, 75 + y, 1, 1);
        g2d.fillRect(137 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 76 + y, 2, 1);
        g2d.fillRect(138 + x, 76 + y, 1, 2);
        g2d.fillRect(101 + x, 77 + y, 1, 2);
        g2d.fillRect(133 + x, 77 + y, 1, 2);
        g2d.fillRect(132 + x, 78 + y, 1, 2);
        g2d.fillRect(137 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(138 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(139 + x, 81 + y, 1, 5);
        g2d.fillRect(110 + x, 82 + y, 1, 2);
        g2d.fillRect(99 + x, 83 + y, 2, 1);
        g2d.fillRect(122 + x, 83 + y, 1, 2);
        g2d.fillRect(138 + x, 84 + y, 1, 4);
        g2d.fillRect(103 + x, 85 + y, 1, 5);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(134 + x, 86 + y, 1, 1);
        g2d.fillRect(137 + x, 86 + y, 1, 2);
        g2d.fillRect(98 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 5);
        g2d.fillRect(135 + x, 88 + y, 1, 3);
        g2d.fillRect(134 + x, 89 + y, 1, 6);
        g2d.fillRect(133 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(115 + x, 92 + y, 1, 3);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(101 + x, 95 + y, 1, 2);
        g2d.fillRect(102 + x, 95 + y, 1, 3);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(133 + x, 95 + y, 1, 1);
        g2d.fillRect(132 + x, 96 + y, 1, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 2);
        g2d.fillRect(131 + x, 97 + y, 1, 1);
        g2d.fillRect(130 + x, 98 + y, 1, 4);
        g2d.fillRect(122 + x, 101 + y, 1, 1);
        g2d.fillRect(106 + x, 102 + y, 1, 3);
        g2d.fillRect(120 + x, 102 + y, 1, 2);
        g2d.fillRect(121 + x, 103 + y, 2, 1);
        g2d.fillRect(105 + x, 104 + y, 1, 1);
        g2d.fillRect(107 + x, 104 + y, 1, 4);
        g2d.fillRect(122 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 3);
        g2d.fillRect(108 + x, 106 + y, 1, 2);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(113 + x, 107 + y, 2, 1);
        g2d.fillRect(114 + x, 108 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(128 + x, 64 + y, 6, 1);
        g2d.fillRect(137 + x, 67 + y, 1, 1);
        g2d.fillRect(121 + x, 69 + y, 1, 1);
        g2d.fillRect(138 + x, 69 + y, 1, 1);
        g2d.fillRect(141 + x, 70 + y, 1, 3);
        g2d.fillRect(118 + x, 71 + y, 1, 2);
        g2d.fillRect(120 + x, 71 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(140 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(139 + x, 73 + y, 1, 1);
        g2d.fillRect(138 + x, 75 + y, 2, 1);
        g2d.fillRect(104 + x, 76 + y, 2, 1);
        g2d.fillRect(112 + x, 76 + y, 3, 1);
        g2d.fillRect(137 + x, 76 + y, 1, 1);
        g2d.fillRect(139 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 2, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(140 + x, 81 + y, 1, 6);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(98 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 2, 1);
        g2d.fillRect(135 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 88 + y, 1, 3);
        g2d.fillRect(101 + x, 88 + y, 1, 2);
        g2d.fillRect(125 + x, 88 + y, 1, 1);
        g2d.fillRect(136 + x, 88 + y, 1, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(135 + x, 92 + y, 1, 3);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(134 + x, 95 + y, 1, 3);
        g2d.fillRect(133 + x, 96 + y, 1, 2);
        g2d.fillRect(135 + x, 96 + y, 1, 1);
        g2d.fillRect(126 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(131 + x, 98 + y, 1, 4);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 104 + y, 1, 5);
        g2d.fillRect(120 + x, 104 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 1, 3);
        g2d.fillRect(121 + x, 105 + y, 7, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 2);
        g2d.fillRect(105 + x, 108 + y, 2, 1);
        g2d.fillRect(108 + x, 108 + y, 4, 1);
        g2d.fillRect(118 + x, 108 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(139 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(139 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(135 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(135 + x, 91 + y, 1, 1);
        g2d.fillRect(135 + x, 95 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 1);
        g2d.fillRect(132 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(130 + x, 102 + y, 1, 1);
        g2d.fillRect(121 + x, 104 + y, 1, 1);
        g2d.fillRect(107 + x, 108 + y, 1, 1);
        g2d.fillRect(113 + x, 108 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(126 + x, 87 + y, 3, 1);
        g2d.fillRect(129 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(127 + x, 65 + y, 2, 1);
        g2d.fillRect(131 + x, 65 + y, 4, 1);
        g2d.fillRect(135 + x, 66 + y, 1, 1);
        g2d.fillRect(136 + x, 67 + y, 1, 1);
        g2d.fillRect(123 + x, 68 + y, 1, 2);
        g2d.fillRect(124 + x, 68 + y, 1, 1);
        g2d.fillRect(128 + x, 68 + y, 1, 6);
        g2d.fillRect(129 + x, 68 + y, 1, 5);
        g2d.fillRect(120 + x, 69 + y, 1, 2);
        g2d.fillRect(127 + x, 69 + y, 1, 6);
        g2d.fillRect(130 + x, 69 + y, 1, 3);
        g2d.fillRect(133 + x, 69 + y, 1, 3);
        g2d.fillRect(134 + x, 69 + y, 1, 4);
        g2d.fillRect(137 + x, 69 + y, 1, 1);
        g2d.fillRect(121 + x, 70 + y, 1, 3);
        g2d.fillRect(122 + x, 70 + y, 1, 2);
        g2d.fillRect(126 + x, 70 + y, 1, 5);
        g2d.fillRect(131 + x, 70 + y, 2, 1);
        g2d.fillRect(135 + x, 70 + y, 1, 1);
        g2d.fillRect(119 + x, 71 + y, 1, 2);
        g2d.fillRect(136 + x, 71 + y, 1, 2);
        g2d.fillRect(125 + x, 72 + y, 1, 2);
        g2d.fillRect(137 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 73 + y, 2, 1);
        g2d.fillRect(124 + x, 73 + y, 1, 1);
        g2d.fillRect(130 + x, 73 + y, 1, 1);
        g2d.fillRect(133 + x, 73 + y, 1, 1);
        g2d.fillRect(135 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 1);
        g2d.fillRect(132 + x, 74 + y, 1, 4);
        g2d.fillRect(136 + x, 74 + y, 1, 6);
        g2d.fillRect(137 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 1);
        g2d.fillRect(121 + x, 75 + y, 1, 6);
        g2d.fillRect(122 + x, 75 + y, 1, 6);
        g2d.fillRect(124 + x, 75 + y, 1, 2);
        g2d.fillRect(125 + x, 75 + y, 1, 2);
        g2d.fillRect(130 + x, 75 + y, 1, 3);
        g2d.fillRect(131 + x, 75 + y, 1, 3);
        g2d.fillRect(133 + x, 75 + y, 1, 2);
        g2d.fillRect(134 + x, 75 + y, 1, 9);
        g2d.fillRect(119 + x, 76 + y, 1, 2);
        g2d.fillRect(120 + x, 76 + y, 1, 5);
        g2d.fillRect(127 + x, 76 + y, 1, 4);
        g2d.fillRect(128 + x, 76 + y, 1, 4);
        g2d.fillRect(129 + x, 76 + y, 1, 2);
        g2d.fillRect(135 + x, 76 + y, 1, 6);
        g2d.fillRect(103 + x, 77 + y, 3, 1);
        g2d.fillRect(108 + x, 77 + y, 4, 1);
        g2d.fillRect(123 + x, 77 + y, 1, 10);
        g2d.fillRect(126 + x, 77 + y, 1, 3);
        g2d.fillRect(137 + x, 77 + y, 1, 2);
        g2d.fillRect(109 + x, 78 + y, 1, 10);
        g2d.fillRect(110 + x, 78 + y, 1, 2);
        g2d.fillRect(124 + x, 78 + y, 1, 4);
        g2d.fillRect(125 + x, 78 + y, 1, 10);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 3, 1);
        g2d.fillRect(129 + x, 79 + y, 3, 1);
        g2d.fillRect(133 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 4, 1);
        g2d.fillRect(114 + x, 80 + y, 3, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(130 + x, 80 + y, 2, 1);
        g2d.fillRect(137 + x, 80 + y, 1, 6);
        g2d.fillRect(106 + x, 81 + y, 3, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 11);
        g2d.fillRect(117 + x, 81 + y, 1, 4);
        g2d.fillRect(118 + x, 81 + y, 1, 2);
        g2d.fillRect(126 + x, 81 + y, 1, 6);
        g2d.fillRect(131 + x, 81 + y, 1, 4);
        g2d.fillRect(132 + x, 81 + y, 1, 4);
        g2d.fillRect(136 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 16);
        g2d.fillRect(119 + x, 82 + y, 3, 1);
        g2d.fillRect(133 + x, 82 + y, 1, 2);
        g2d.fillRect(138 + x, 82 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(127 + x, 83 + y, 1, 4);
        g2d.fillRect(130 + x, 83 + y, 1, 7);
        g2d.fillRect(135 + x, 83 + y, 1, 3);
        g2d.fillRect(136 + x, 83 + y, 1, 5);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 8);
        g2d.fillRect(124 + x, 84 + y, 1, 4);
        g2d.fillRect(128 + x, 84 + y, 1, 3);
        g2d.fillRect(129 + x, 84 + y, 1, 4);
        g2d.fillRect(121 + x, 85 + y, 1, 2);
        g2d.fillRect(134 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 6);
        g2d.fillRect(122 + x, 88 + y, 1, 11);
        g2d.fillRect(123 + x, 88 + y, 1, 6);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(121 + x, 90 + y, 1, 5);
        g2d.fillRect(105 + x, 91 + y, 2, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 10);
        g2d.fillRect(126 + x, 93 + y, 1, 4);
        g2d.fillRect(107 + x, 95 + y, 1, 9);
        g2d.fillRect(115 + x, 95 + y, 1, 12);
        g2d.fillRect(127 + x, 96 + y, 1, 2);
        g2d.fillRect(128 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 98 + y, 1, 3);
        g2d.fillRect(106 + x, 98 + y, 1, 4);
        g2d.fillRect(129 + x, 98 + y, 1, 4);
        g2d.fillRect(121 + x, 99 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 5);
        g2d.fillRect(119 + x, 102 + y, 1, 2);
        g2d.fillRect(121 + x, 102 + y, 1, 1);
        g2d.fillRect(106 + x, 105 + y, 1, 3);
        g2d.fillRect(113 + x, 106 + y, 1, 1);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(109 + x, 107 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(129 + x, 65 + y, 1, 3);
        g2d.fillRect(130 + x, 65 + y, 1, 3);
        g2d.fillRect(127 + x, 66 + y, 1, 3);
        g2d.fillRect(128 + x, 66 + y, 1, 2);
        g2d.fillRect(131 + x, 66 + y, 4, 1);
        g2d.fillRect(126 + x, 67 + y, 1, 3);
        g2d.fillRect(133 + x, 67 + y, 3, 1);
        g2d.fillRect(125 + x, 68 + y, 1, 4);
        g2d.fillRect(134 + x, 68 + y, 3, 1);
        g2d.fillRect(124 + x, 69 + y, 1, 4);
        g2d.fillRect(135 + x, 69 + y, 2, 1);
        g2d.fillRect(123 + x, 70 + y, 1, 4);
        g2d.fillRect(131 + x, 71 + y, 1, 4);
        g2d.fillRect(132 + x, 71 + y, 1, 3);
        g2d.fillRect(137 + x, 71 + y, 1, 1);
        g2d.fillRect(120 + x, 72 + y, 1, 4);
        g2d.fillRect(122 + x, 72 + y, 1, 3);
        g2d.fillRect(130 + x, 72 + y, 1, 1);
        g2d.fillRect(133 + x, 72 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(121 + x, 73 + y, 1, 2);
        g2d.fillRect(129 + x, 73 + y, 1, 3);
        g2d.fillRect(134 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 1, 3);
        g2d.fillRect(118 + x, 74 + y, 1, 3);
        g2d.fillRect(128 + x, 74 + y, 1, 2);
        g2d.fillRect(130 + x, 74 + y, 1, 1);
        g2d.fillRect(133 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 3);
        g2d.fillRect(127 + x, 75 + y, 1, 1);
        g2d.fillRect(135 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 6, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 3);
        g2d.fillRect(102 + x, 77 + y, 1, 5);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 2);
        g2d.fillRect(114 + x, 77 + y, 1, 2);
        g2d.fillRect(103 + x, 78 + y, 1, 3);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 2);
        g2d.fillRect(107 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 2);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(129 + x, 78 + y, 3, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 2);
        g2d.fillRect(112 + x, 80 + y, 1, 2);
        g2d.fillRect(126 + x, 80 + y, 2, 1);
        g2d.fillRect(132 + x, 80 + y, 2, 1);
        g2d.fillRect(136 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 9);
        g2d.fillRect(115 + x, 81 + y, 1, 3);
        g2d.fillRect(119 + x, 81 + y, 4, 1);
        g2d.fillRect(133 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 4);
        g2d.fillRect(106 + x, 82 + y, 1, 9);
        g2d.fillRect(107 + x, 82 + y, 1, 6);
        g2d.fillRect(113 + x, 82 + y, 1, 9);
        g2d.fillRect(122 + x, 82 + y, 1, 1);
        g2d.fillRect(124 + x, 82 + y, 1, 2);
        g2d.fillRect(135 + x, 82 + y, 2, 1);
        g2d.fillRect(111 + x, 83 + y, 1, 9);
        g2d.fillRect(112 + x, 83 + y, 1, 8);
        g2d.fillRect(118 + x, 83 + y, 1, 22);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 7);
        g2d.fillRect(133 + x, 84 + y, 1, 2);
        g2d.fillRect(134 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 18);
        g2d.fillRect(117 + x, 85 + y, 1, 16);
        g2d.fillRect(120 + x, 85 + y, 1, 2);
        g2d.fillRect(131 + x, 85 + y, 1, 2);
        g2d.fillRect(132 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 5);
        g2d.fillRect(119 + x, 87 + y, 1, 12);
        g2d.fillRect(122 + x, 87 + y, 2, 1);
        g2d.fillRect(132 + x, 87 + y, 1, 2);
        g2d.fillRect(133 + x, 87 + y, 1, 2);
        g2d.fillRect(99 + x, 88 + y, 1, 3);
        g2d.fillRect(100 + x, 88 + y, 1, 4);
        g2d.fillRect(109 + x, 88 + y, 1, 15);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(121 + x, 88 + y, 1, 2);
        g2d.fillRect(124 + x, 88 + y, 1, 17);
        g2d.fillRect(128 + x, 88 + y, 1, 1);
        g2d.fillRect(125 + x, 89 + y, 1, 16);
        g2d.fillRect(129 + x, 89 + y, 1, 9);
        g2d.fillRect(131 + x, 89 + y, 1, 8);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(130 + x, 90 + y, 1, 8);
        g2d.fillRect(132 + x, 90 + y, 1, 6);
        g2d.fillRect(128 + x, 91 + y, 1, 6);
        g2d.fillRect(103 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 6);
        g2d.fillRect(126 + x, 92 + y, 2, 1);
        g2d.fillRect(133 + x, 92 + y, 1, 3);
        g2d.fillRect(127 + x, 93 + y, 1, 3);
        g2d.fillRect(102 + x, 94 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 4);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(111 + x, 94 + y, 1, 10);
        g2d.fillRect(114 + x, 94 + y, 1, 8);
        g2d.fillRect(123 + x, 94 + y, 1, 11);
        g2d.fillRect(103 + x, 95 + y, 1, 2);
        g2d.fillRect(112 + x, 95 + y, 1, 12);
        g2d.fillRect(113 + x, 95 + y, 1, 11);
        g2d.fillRect(121 + x, 95 + y, 1, 3);
        g2d.fillRect(104 + x, 96 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(108 + x, 98 + y, 1, 6);
        g2d.fillRect(126 + x, 98 + y, 1, 7);
        g2d.fillRect(127 + x, 98 + y, 1, 5);
        g2d.fillRect(128 + x, 98 + y, 1, 4);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(105 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 6);
        g2d.fillRect(122 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 5);
        g2d.fillRect(109 + x, 104 + y, 1, 2);
        g2d.fillRect(110 + x, 104 + y, 1, 2);
        g2d.fillRect(105 + x, 105 + y, 1, 2);
        g2d.fillRect(111 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
    }
}
