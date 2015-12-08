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
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Blt13 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Blt13()
    {
        super();
        includeY = true;
    }

    public Blt13(int layer)
    {
        super(layer);
        includeY = true;
    }

    public Blt13(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeY = true;
    }

    public Blt13(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeY = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        if(y > 0)
            paintB2(x,shiftY,g2d);
        else if(y < 0)
            paintB1(x,shiftY,g2d);
        else
            paintB3(x,shiftY,g2d);
    }
    
    public void paintB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 4, 1);
        g2d.fillRect(118 + x, 83 + y, 3, 1);
        g2d.fillRect(107 + x, 84 + y, 11, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(104 + x, 91 + y, 2, 1);
        g2d.fillRect(108 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 2, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 3);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 2, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(124 + x, 89 + y, 2, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 2);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 2);
        g2d.fillRect(99 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(121 + x, 85 + y, 2, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 2, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(122 + x, 86 + y, 1, 2);
        g2d.fillRect(123 + x, 86 + y, 2, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 4);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 2, 1);
        g2d.fillRect(125 + x, 87 + y, 1, 1);
        g2d.fillRect(128 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
        g2d.fillRect(123 + x, 88 + y, 1, 2);
        g2d.fillRect(127 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 5, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(124 + x, 90 + y, 1, 3);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(123 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 3, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 4, 1);
        g2d.fillRect(113 + x, 85 + y, 4, 1);
        g2d.fillRect(105 + x, 86 + y, 2, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(116 + x, 87 + y, 2, 1);
        g2d.fillRect(104 + x, 88 + y, 5, 1);
        g2d.fillRect(117 + x, 88 + y, 2, 1);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(126 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 3, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 91 + y, 1, 2);
        g2d.fillRect(123 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 3, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(125 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 2, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(109 + x, 86 + y, 5, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(123 + x, 87 + y, 2, 1);
        g2d.fillRect(124 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 2, 1);
        g2d.fillRect(123 + x, 90 + y, 1, 3);
    }





    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 4, 1);
        g2d.fillRect(118 + x, 83 + y, 3, 1);
        g2d.fillRect(107 + x, 84 + y, 11, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(104 + x, 91 + y, 2, 1);
        g2d.fillRect(108 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 2, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 3);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 2, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(124 + x, 88 + y, 2, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 2);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 2);
        g2d.fillRect(99 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(122 + x, 84 + y, 1, 3);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(121 + x, 85 + y, 1, 1);
        g2d.fillRect(123 + x, 85 + y, 2, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 2, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(125 + x, 86 + y, 1, 1);
        g2d.fillRect(128 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 4);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 2, 1);
        g2d.fillRect(123 + x, 87 + y, 1, 2);
        g2d.fillRect(127 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(124 + x, 89 + y, 1, 3);
        g2d.fillRect(101 + x, 90 + y, 5, 1);
        g2d.fillRect(122 + x, 92 + y, 1, 1);
        g2d.fillRect(123 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 3, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 4, 1);
        g2d.fillRect(113 + x, 85 + y, 4, 1);
        g2d.fillRect(105 + x, 86 + y, 2, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(116 + x, 87 + y, 2, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(126 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 5, 1);
        g2d.fillRect(117 + x, 88 + y, 2, 1);
        g2d.fillRect(101 + x, 89 + y, 3, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 2);
        g2d.fillRect(123 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 3, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(125 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 2, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(109 + x, 86 + y, 5, 1);
        g2d.fillRect(123 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(124 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 2, 1);
        g2d.fillRect(123 + x, 89 + y, 1, 3);
    }





    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 4, 1);
        g2d.fillRect(118 + x, 83 + y, 3, 1);
        g2d.fillRect(107 + x, 84 + y, 11, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(104 + x, 91 + y, 2, 1);
        g2d.fillRect(108 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 2, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 3);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 2, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(124 + x, 88 + y, 2, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 2);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 2);
        g2d.fillRect(99 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(121 + x, 85 + y, 2, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 2, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(122 + x, 86 + y, 1, 2);
        g2d.fillRect(123 + x, 86 + y, 2, 1);
        g2d.fillRect(128 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 4);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 2, 1);
        g2d.fillRect(125 + x, 87 + y, 1, 1);
        g2d.fillRect(127 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
        g2d.fillRect(123 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(124 + x, 89 + y, 1, 3);
        g2d.fillRect(101 + x, 90 + y, 5, 1);
        g2d.fillRect(122 + x, 92 + y, 1, 1);
        g2d.fillRect(123 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 3, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 4, 1);
        g2d.fillRect(113 + x, 85 + y, 4, 1);
        g2d.fillRect(105 + x, 86 + y, 2, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(116 + x, 87 + y, 2, 1);
        g2d.fillRect(126 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 5, 1);
        g2d.fillRect(117 + x, 88 + y, 2, 1);
        g2d.fillRect(101 + x, 89 + y, 3, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 2);
        g2d.fillRect(123 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 3, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 2, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(109 + x, 86 + y, 5, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(123 + x, 87 + y, 2, 1);
        g2d.fillRect(121 + x, 88 + y, 2, 1);
        g2d.fillRect(123 + x, 89 + y, 1, 3);
    }
}
