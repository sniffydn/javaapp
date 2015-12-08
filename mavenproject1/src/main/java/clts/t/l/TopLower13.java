/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.l;

import clts.SuperTL;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower13 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower13()
    {
        super(2);
        slenderB = true;
        shuni = true;
    }

    public TopLower13(int layer)
    {
        super(layer);
        slenderB = true;
        shuni = true;
    }

    public TopLower13(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        slenderB = true;
        shuni = true;
    }

    public TopLower13(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        shuni = true;
    }
    
    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        
        if (!containsB || Math.random() < .3) {
            return new clts.Blank();
        } else if (Math.random() < .5) {
            return new clts.b.a.Pose2(c);
        } else {
            return new clts.b.a.Pose3(c);
        }
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(117 + x, 56 + y, 1, 7);
        g2d.fillRect(102 + x, 59 + y, 1, 7);
        g2d.fillRect(103 + x, 60 + y, 1, 13);
        g2d.fillRect(116 + x, 62 + y, 1, 7);
        g2d.fillRect(104 + x, 65 + y, 1, 3);
        g2d.fillRect(105 + x, 65 + y, 1, 4);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 2, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(104 + x, 70 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 2, 1);
        g2d.fillRect(118 + x, 71 + y, 1, 2);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 74 + y, 1, 2);
        g2d.fillRect(101 + x, 76 + y, 1, 7);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(100 + x, 79 + y, 1, 11);
        g2d.fillRect(99 + x, 82 + y, 1, 8);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 4);
        g2d.fillRect(120 + x, 87 + y, 1, 3);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 2, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 5, 1);
        g2d.fillRect(117 + x, 90 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 4);
        g2d.fillRect(104 + x, 56 + y, 1, 9);
        g2d.fillRect(105 + x, 56 + y, 1, 7);
        g2d.fillRect(112 + x, 56 + y, 1, 7);
        g2d.fillRect(113 + x, 56 + y, 1, 7);
        g2d.fillRect(114 + x, 56 + y, 1, 7);
        g2d.fillRect(115 + x, 56 + y, 1, 11);
        g2d.fillRect(116 + x, 56 + y, 1, 6);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 2, 1);
        g2d.fillRect(114 + x, 71 + y, 2, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 4);
        g2d.fillRect(109 + x, 72 + y, 2, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 5);
        g2d.fillRect(119 + x, 75 + y, 1, 3);
        g2d.fillRect(102 + x, 76 + y, 1, 12);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 3);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(121 + x, 81 + y, 1, 8);
        g2d.fillRect(101 + x, 83 + y, 1, 6);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 2);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 2, 1);
        g2d.fillRect(117 + x, 89 + y, 2, 1);
        g2d.fillRect(108 + x, 90 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 2, 1);
        g2d.fillRect(108 + x, 74 + y, 2, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 3);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 4);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 2, 1);
        g2d.fillRect(111 + x, 85 + y, 2, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 4);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(111 + x, 89 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 56 + y, 1, 5);
        g2d.fillRect(107 + x, 56 + y, 1, 5);
        g2d.fillRect(108 + x, 56 + y, 1, 5);
        g2d.fillRect(109 + x, 56 + y, 1, 5);
        g2d.fillRect(110 + x, 56 + y, 1, 5);
        g2d.fillRect(111 + x, 56 + y, 1, 5);
        g2d.fillRect(108 + x, 62 + y, 1, 2);
        g2d.fillRect(109 + x, 62 + y, 3, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(114 + x, 63 + y, 1, 6);
        g2d.fillRect(106 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 3, 1);
        g2d.fillRect(110 + x, 66 + y, 4, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 2, 1);
        g2d.fillRect(112 + x, 68 + y, 2, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 2, 1);
        g2d.fillRect(116 + x, 69 + y, 1, 4);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 2);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 2);
        g2d.fillRect(114 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 4);
        g2d.fillRect(115 + x, 74 + y, 2, 1);
        g2d.fillRect(107 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 75 + y, 2, 1);
        g2d.fillRect(116 + x, 75 + y, 2, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 76 + y, 2, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 2, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 2, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 3);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 5);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 82 + y, 2, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 2, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 4);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 2, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 61 + y, 2, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 2, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 2);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 2, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 2, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 3, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 2, 1);
        g2d.fillRect(115 + x, 73 + y, 3, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 2);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 3);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 77 + y, 3, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 3, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 2);
        g2d.fillRect(118 + x, 79 + y, 2, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 7);
        g2d.fillRect(108 + x, 80 + y, 1, 2);
        g2d.fillRect(112 + x, 80 + y, 1, 2);
        g2d.fillRect(117 + x, 80 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 2);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 6);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 2, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 1, 4);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 61 + y, 3, 1);
        g2d.fillRect(109 + x, 63 + y, 3, 1);
        g2d.fillRect(107 + x, 64 + y, 2, 1);
        g2d.fillRect(110 + x, 65 + y, 4, 1);
        g2d.fillRect(108 + x, 67 + y, 5, 1);
        g2d.fillRect(109 + x, 68 + y, 3, 1);
        g2d.fillRect(113 + x, 69 + y, 3, 1);
        g2d.fillRect(107 + x, 70 + y, 2, 1);
        g2d.fillRect(109 + x, 71 + y, 2, 1);
        g2d.fillRect(112 + x, 72 + y, 3, 1);
        g2d.fillRect(110 + x, 74 + y, 2, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 2, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 2, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 2, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 2);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 78 + y, 2, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 2);
        g2d.fillRect(116 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
    }
}
