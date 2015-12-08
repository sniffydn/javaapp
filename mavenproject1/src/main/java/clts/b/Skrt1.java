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
public class Skrt1 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Skrt1()
    {
        super();
        shrt = true;
        skt = true;
        jean = true;
        slenderB = true;
    }

    public Skrt1(int layer)
    {
        super(layer);
        shrt = true;
        skt = true;
        jean = true;
        slenderB = true;
    }

    public Skrt1(ColorArray colorSwitch)
    {
        super(colorSwitch);
        shrt = true;
        skt = true;
        jean = true;
        slenderB = true;
    }

    public Skrt1(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        shrt = true;
        skt = true;
        jean = true;
        slenderB = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        if(step == 3 || step == 4 || step == 5)
        {
            paintS1(x,y,g2d);
        }
        else if(step == 11 || step == 12 || step == 13)
        {
            paintS3(x,y,g2d);
        }
        else
        {
            paintS2(x,y,g2d);
        }
    }

    public void paintS3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 80 + y, 1, 11);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(105 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(116 + x, 81 + y, 1, 3);
        g2d.fillRect(117 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 3, 1);
        g2d.fillRect(106 + x, 82 + y, 8, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 7);
        g2d.fillRect(121 + x, 82 + y, 1, 6);
        g2d.fillRect(101 + x, 83 + y, 1, 4);
        g2d.fillRect(102 + x, 84 + y, 5, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 3);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 5, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 2, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 2);
        g2d.fillRect(103 + x, 91 + y, 3, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 4, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 1, 4);
        g2d.fillRect(107 + x, 84 + y, 7, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 9, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 7, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(116 + x, 91 + y, 2, 1);
        g2d.fillRect(112 + x, 92 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(116 + x, 85 + y, 1, 4);
        g2d.fillRect(114 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 2);
        g2d.fillRect(121 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 5, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 4);
        g2d.fillRect(103 + x, 85 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 3, 1);
        g2d.fillRect(102 + x, 90 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 83 + y, 3, 1);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 3);
        g2d.fillRect(105 + x, 90 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 83 + y, 2, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 3, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 2, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 2, 1);
        g2d.fillRect(111 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 83 + y, 2, 1);
        g2d.fillRect(111 + x, 85 + y, 2, 1);
        g2d.fillRect(108 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(114 + x, 90 + y, 4, 1);
        g2d.fillRect(112 + x, 91 + y, 2, 1);
    }





    public void paintS1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 80 + y, 1, 12);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(105 + x, 81 + y, 1, 2);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 3, 1);
        g2d.fillRect(107 + x, 82 + y, 9, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 6);
        g2d.fillRect(121 + x, 82 + y, 1, 9);
        g2d.fillRect(101 + x, 83 + y, 1, 4);
        g2d.fillRect(102 + x, 84 + y, 7, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(106 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 88 + y, 6, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 2, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 6, 1);
        g2d.fillRect(103 + x, 92 + y, 11, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 5, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 1, 4);
        g2d.fillRect(109 + x, 84 + y, 7, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 2, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 3);
        g2d.fillRect(108 + x, 86 + y, 9, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 9, 1);
        g2d.fillRect(115 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 6, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(107 + x, 83 + y, 2, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 4);
        g2d.fillRect(103 + x, 85 + y, 3, 1);
        g2d.fillRect(107 + x, 85 + y, 2, 1);
        g2d.fillRect(104 + x, 87 + y, 2, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 83 + y, 3, 1);
        g2d.fillRect(109 + x, 85 + y, 3, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 3);
        g2d.fillRect(106 + x, 90 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 83 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 2, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 83 + y, 2, 1);
        g2d.fillRect(113 + x, 85 + y, 2, 1);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(111 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(114 + x, 91 + y, 1, 1);
    }





    public void paintS2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 80 + y, 1, 12);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(105 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(116 + x, 81 + y, 1, 3);
        g2d.fillRect(117 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 3, 1);
        g2d.fillRect(106 + x, 82 + y, 9, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 7);
        g2d.fillRect(121 + x, 82 + y, 1, 6);
        g2d.fillRect(101 + x, 83 + y, 1, 4);
        g2d.fillRect(102 + x, 84 + y, 6, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 6, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 2, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 5, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 10, 1);
        g2d.fillRect(107 + x, 93 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 4, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 1, 4);
        g2d.fillRect(108 + x, 84 + y, 7, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 9, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 7, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(116 + x, 91 + y, 2, 1);
        g2d.fillRect(113 + x, 92 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(116 + x, 85 + y, 1, 4);
        g2d.fillRect(115 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 2);
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(121 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 6, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(106 + x, 83 + y, 2, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 4);
        g2d.fillRect(103 + x, 85 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 2, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 2, 1);
        g2d.fillRect(101 + x, 90 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 83 + y, 3, 1);
        g2d.fillRect(108 + x, 85 + y, 3, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 3);
        g2d.fillRect(105 + x, 90 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 83 + y, 2, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 2, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 2, 1);
        g2d.fillRect(106 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 2, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(111 + x, 83 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 2, 1);
        g2d.fillRect(109 + x, 87 + y, 3, 1);
        g2d.fillRect(110 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(115 + x, 90 + y, 3, 1);
        g2d.fillRect(113 + x, 91 + y, 2, 1);
    }
}
