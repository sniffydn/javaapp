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
public class Skrt7 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Skrt7()
    {
        super();
        shrt = true;
        skt = true;
        includeY = true;
        jean = true;
    }

    public Skrt7(int layer)
    {
        super(layer);
        shrt = true;
        skt = true;
        includeY = true;
        jean = true;
    }

    public Skrt7(ColorArray colorSwitch)
    {
        super(colorSwitch);
        shrt = true;
        skt = true;
        includeY = true;
        jean = true;
    }

    public Skrt7(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        shrt = true;
        skt = true;
        includeY = true;
        jean = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintU(x,0,g2d);
        if(y == 1)
            y = 0;
        paintL(x,y,g2d);
    }

    public void paintU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 2, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 5);
        g2d.fillRect(118 + x, 83 + y, 1, 4);
        g2d.fillRect(107 + x, 84 + y, 6, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 4);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 1, 3);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 2);
        g2d.fillRect(109 + x, 87 + y, 4, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(109 + x, 86 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 3, 1);
        g2d.fillRect(110 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 3);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 2, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 2, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(99 + x, 88 + y, 1, 3);
        g2d.fillRect(112 + x, 89 + y, 3, 1);
        g2d.fillRect(107 + x, 90 + y, 2, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 91 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 3, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 2);
        g2d.fillRect(103 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 2);
        g2d.fillRect(100 + x, 88 + y, 1, 3);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 4, 1);
        g2d.fillRect(115 + x, 89 + y, 2, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(101 + x, 88 + y, 1, 4);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 90 + y, 2, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(121 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 2, 1);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(115 + x, 88 + y, 3, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
    }





    public void paintL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(117 + x, 91 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 2, 1);
        g2d.fillRect(101 + x, 92 + y, 3, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(100 + x, 91 + y, 1, 3);
        g2d.fillRect(120 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 2, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
    }


}
