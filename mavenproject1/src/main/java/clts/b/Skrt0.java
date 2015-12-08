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
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Skrt0 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Skrt0()
    {
        super();
        shrt = true;
        skt = true;
        jean = true;
        includeY = true;
    }

    public Skrt0(int layer)
    {
        super(layer);
        shrt = true;
        skt = true;
        jean = true;
        includeY = true;
    }

    public Skrt0(ColorArray colorSwitch)
    {
        super(colorSwitch);
        shrt = true;
        skt = true;
        jean = true;
        includeY = true;
    }

    public Skrt0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        shrt = true;
        skt = true;
        jean = true;
        includeY = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintM(x,0,g2d);
        paintF(x,y,g2d);
        paintVF(x,prevY,g2d);
        
        prevY = y;
        if(prevY == -1)
            prevY = 0;
    }

    int prevY = 0;

    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(103 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 5);
        g2d.fillRect(122 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 2, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 2, 1);
        g2d.fillRect(122 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 82 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 3, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 4);
        g2d.fillRect(121 + x, 86 + y, 2, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 2, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 3);
        g2d.fillRect(115 + x, 84 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 5);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 87 + y, 3, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 2, 1);
        g2d.fillRect(102 + x, 82 + y, 5, 1);
        g2d.fillRect(116 + x, 82 + y, 2, 1);
        g2d.fillRect(106 + x, 83 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 2, 1);
        g2d.fillRect(108 + x, 81 + y, 8, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 80 + y, 3, 1);
        g2d.fillRect(104 + x, 81 + y, 4, 1);
        g2d.fillRect(108 + x, 82 + y, 8, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 6);
        g2d.fillRect(117 + x, 84 + y, 1, 4);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 2);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 2, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 4);
        g2d.fillRect(105 + x, 86 + y, 1, 4);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 3);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(112 + x, 90 + y, 1, 3);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 87 + y, 1, 4);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 4);
        g2d.fillRect(121 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 3, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(110 + x, 93 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 3, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 87 + y, 1, 4);
        g2d.fillRect(101 + x, 88 + y, 1, 3);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 3, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 2, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(107 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 92 + y, 3, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(122 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 1, 3);
        g2d.fillRect(106 + x, 89 + y, 1, 3);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 3);
        g2d.fillRect(117 + x, 89 + y, 1, 3);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(110 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(102 + x, 91 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(99 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 2, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
    }





    public void paintVF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(124 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(123 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 5);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(123 + x, 85 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(123 + x, 77 + y, 1, 2);
        g2d.fillRect(122 + x, 79 + y, 1, 1);
        g2d.fillRect(124 + x, 79 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 4, 1);
        g2d.fillRect(119 + x, 81 + y, 2, 1);
        g2d.fillRect(122 + x, 81 + y, 1, 2);
        g2d.fillRect(124 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(123 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 7);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(125 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(123 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(123 + x, 79 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 2);
        g2d.fillRect(122 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 81 + y, 2, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(122 + x, 83 + y, 1, 2);
        g2d.fillRect(124 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 2);
    }

}
