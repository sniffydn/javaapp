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
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Pose3 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Pose3() {
        super();
    }

    public Pose3(int layer) {
        super(layer);
    }

    public Pose3(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Pose3(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    {
        noWalk = true;
    }
    
    public void paintFront(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(85 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(94 + x, 115 + y, 2, 1);
        g2d.fillRect(93 + x, 116 + y, 1, 3);
        g2d.fillRect(96 + x, 116 + y, 1, 2);
        g2d.fillRect(97 + x, 116 + y, 1, 3);
        g2d.fillRect(120 + x, 116 + y, 1, 3);
        g2d.fillRect(121 + x, 116 + y, 1, 2);
        g2d.fillRect(122 + x, 116 + y, 1, 3);
        g2d.fillRect(123 + x, 116 + y, 1, 4);
        g2d.fillRect(98 + x, 118 + y, 1, 2);
        g2d.fillRect(99 + x, 118 + y, 1, 1);
        g2d.fillRect(117 + x, 118 + y, 1, 2);
        g2d.fillRect(118 + x, 118 + y, 2, 1);
        g2d.fillRect(94 + x, 119 + y, 1, 1);
        g2d.fillRect(95 + x, 120 + y, 1, 1);
        g2d.fillRect(97 + x, 120 + y, 1, 1);
        g2d.fillRect(118 + x, 120 + y, 1, 1);
        g2d.fillRect(122 + x, 120 + y, 1, 1);
        g2d.fillRect(96 + x, 121 + y, 1, 2);
        g2d.fillRect(119 + x, 121 + y, 1, 2);
        g2d.fillRect(121 + x, 121 + y, 1, 2);
        g2d.fillRect(91 + x, 123 + y, 1, 2);
        g2d.fillRect(95 + x, 123 + y, 1, 1);
        g2d.fillRect(97 + x, 123 + y, 1, 1);
        g2d.fillRect(120 + x, 123 + y, 1, 1);
        g2d.fillRect(92 + x, 124 + y, 1, 1);
        g2d.fillRect(94 + x, 124 + y, 1, 1);
        g2d.fillRect(119 + x, 124 + y, 1, 1);
        g2d.fillRect(121 + x, 124 + y, 1, 1);
        g2d.fillRect(93 + x, 125 + y, 1, 1);
        g2d.fillRect(118 + x, 125 + y, 1, 1);
        g2d.fillRect(122 + x, 125 + y, 2, 1);
        g2d.fillRect(89 + x, 126 + y, 1, 6);
        g2d.fillRect(92 + x, 126 + y, 1, 2);
        g2d.fillRect(94 + x, 126 + y, 1, 2);
        g2d.fillRect(123 + x, 126 + y, 1, 3);
        g2d.fillRect(91 + x, 128 + y, 1, 1);
        g2d.fillRect(95 + x, 128 + y, 1, 1);
        g2d.fillRect(90 + x, 129 + y, 1, 1);
        g2d.fillRect(118 + x, 129 + y, 1, 1);
        g2d.fillRect(122 + x, 129 + y, 1, 1);
        g2d.fillRect(91 + x, 130 + y, 1, 2);
        g2d.fillRect(119 + x, 130 + y, 1, 2);
        g2d.fillRect(121 + x, 130 + y, 1, 2);
        g2d.fillRect(92 + x, 132 + y, 1, 1);
        g2d.fillRect(120 + x, 132 + y, 1, 1);
        g2d.fillRect(93 + x, 133 + y, 1, 1);
        g2d.fillRect(119 + x, 133 + y, 1, 1);
        g2d.fillRect(121 + x, 133 + y, 1, 2);
        g2d.fillRect(89 + x, 134 + y, 1, 1);
        g2d.fillRect(92 + x, 134 + y, 1, 2);
        g2d.fillRect(87 + x, 135 + y, 1, 3);
        g2d.fillRect(88 + x, 135 + y, 1, 3);
        g2d.fillRect(90 + x, 135 + y, 1, 3);
        g2d.fillRect(120 + x, 135 + y, 1, 3);
        g2d.fillRect(122 + x, 135 + y, 1, 3);
        g2d.fillRect(86 + x, 138 + y, 1, 3);
        g2d.fillRect(91 + x, 138 + y, 1, 1);
        g2d.fillRect(119 + x, 138 + y, 1, 3);
        g2d.fillRect(123 + x, 138 + y, 1, 3);
        g2d.fillRect(87 + x, 141 + y, 1, 2);
        g2d.fillRect(88 + x, 141 + y, 1, 2);
        g2d.fillRect(90 + x, 141 + y, 1, 2);
        g2d.fillRect(120 + x, 141 + y, 1, 2);
        g2d.fillRect(122 + x, 141 + y, 1, 2);
        g2d.fillRect(86 + x, 143 + y, 1, 3);
        g2d.fillRect(89 + x, 143 + y, 1, 3);
        g2d.fillRect(121 + x, 143 + y, 1, 3);
        g2d.fillRect(85 + x, 146 + y, 1, 2);
        g2d.fillRect(90 + x, 146 + y, 1, 1);
        g2d.fillRect(120 + x, 146 + y, 1, 2);
        g2d.fillRect(122 + x, 146 + y, 1, 2);
        g2d.fillRect(86 + x, 147 + y, 1, 4);
        g2d.fillRect(87 + x, 147 + y, 3, 1);
        g2d.fillRect(91 + x, 147 + y, 1, 1);
        g2d.fillRect(118 + x, 147 + y, 2, 1);
        g2d.fillRect(121 + x, 147 + y, 1, 1);
        g2d.fillRect(92 + x, 148 + y, 1, 3);
        g2d.fillRect(117 + x, 148 + y, 1, 1);
        g2d.fillRect(119 + x, 148 + y, 1, 3);
        g2d.fillRect(90 + x, 149 + y, 1, 1);
        g2d.fillRect(116 + x, 149 + y, 1, 3);
        g2d.fillRect(118 + x, 150 + y, 1, 2);
        g2d.fillRect(85 + x, 151 + y, 1, 2);
        g2d.fillRect(87 + x, 151 + y, 1, 2);
        g2d.fillRect(88 + x, 151 + y, 1, 2);
        g2d.fillRect(91 + x, 151 + y, 1, 1);
        g2d.fillRect(120 + x, 151 + y, 1, 2);
        g2d.fillRect(122 + x, 151 + y, 1, 2);
        g2d.fillRect(90 + x, 152 + y, 1, 1);
        g2d.fillRect(117 + x, 152 + y, 1, 1);
        g2d.fillRect(84 + x, 153 + y, 1, 3);
        g2d.fillRect(89 + x, 153 + y, 1, 1);
        g2d.fillRect(91 + x, 153 + y, 1, 3);
        g2d.fillRect(118 + x, 153 + y, 1, 2);
        g2d.fillRect(121 + x, 153 + y, 1, 3);
        g2d.fillRect(89 + x, 155 + y, 1, 1);
        g2d.fillRect(117 + x, 155 + y, 1, 1);
        g2d.fillRect(87 + x, 156 + y, 1, 4);
        g2d.fillRect(88 + x, 156 + y, 1, 4);
        g2d.fillRect(92 + x, 156 + y, 1, 1);
        g2d.fillRect(116 + x, 156 + y, 1, 2);
        g2d.fillRect(120 + x, 156 + y, 1, 2);
        g2d.fillRect(122 + x, 156 + y, 1, 2);
        g2d.fillRect(84 + x, 157 + y, 3, 1);
        g2d.fillRect(89 + x, 157 + y, 1, 1);
        g2d.fillRect(119 + x, 157 + y, 1, 1);
        g2d.fillRect(121 + x, 157 + y, 1, 1);
        g2d.fillRect(123 + x, 157 + y, 1, 1);
        g2d.fillRect(85 + x, 158 + y, 1, 2);
        g2d.fillRect(84 + x, 160 + y, 1, 3);
        g2d.fillRect(86 + x, 160 + y, 1, 1);
        g2d.fillRect(89 + x, 160 + y, 1, 1);
        g2d.fillRect(119 + x, 160 + y, 1, 3);
        g2d.fillRect(121 + x, 160 + y, 2, 1);
        g2d.fillRect(122 + x, 161 + y, 1, 2);
        g2d.fillRect(83 + x, 162 + y, 1, 1);
        g2d.fillRect(85 + x, 162 + y, 6, 1);
        g2d.fillRect(118 + x, 162 + y, 1, 1);
        g2d.fillRect(120 + x, 162 + y, 2, 1);
        g2d.fillRect(123 + x, 162 + y, 2, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(156, 90, 82));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(153, 95, 85));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(206, 123, 82));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(204, 127, 85));
        COLORS.set(ImageUtilities.GREY, new Color(255, 127, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 156, 82));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 191, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(196, 196, 196));
        COLORS.set(ImageUtilities.GREY, new Color(238, 238, 238));
    }

    public boolean getOriginalColorArray() {
        return false;
    }

    public void drawBody(b.Bd bd, int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(99 + x, 87 + y, 1, 5);
        g2d.fillRect(121 + x, 87 + y, 1, 3);


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(122 + x, 90 + y, 1, 20);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 1, 6);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 93 + y, 1, 5);
        g2d.fillRect(106 + x, 94 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 4);
        g2d.fillRect(97 + x, 98 + y, 1, 6);
        g2d.fillRect(115 + x, 98 + y, 1, 4);
        g2d.fillRect(104 + x, 100 + y, 1, 2);
        g2d.fillRect(103 + x, 102 + y, 1, 3);
        g2d.fillRect(116 + x, 102 + y, 1, 16);
        g2d.fillRect(96 + x, 104 + y, 1, 3);
        g2d.fillRect(102 + x, 105 + y, 1, 2);
        g2d.fillRect(95 + x, 107 + y, 1, 4);
        g2d.fillRect(101 + x, 107 + y, 1, 4);
        g2d.fillRect(123 + x, 110 + y, 1, 6);
        g2d.fillRect(94 + x, 111 + y, 1, 4);
        g2d.fillRect(100 + x, 111 + y, 1, 7);
        g2d.fillRect(92 + x, 119 + y, 1, 2);
        g2d.fillRect(99 + x, 119 + y, 1, 1);
        g2d.fillRect(98 + x, 120 + y, 1, 3);
        g2d.fillRect(117 + x, 120 + y, 1, 6);
        g2d.fillRect(123 + x, 120 + y, 1, 5);
        g2d.fillRect(91 + x, 121 + y, 1, 2);
        g2d.fillRect(96 + x, 124 + y, 1, 2);
        g2d.fillRect(90 + x, 125 + y, 1, 4);
        g2d.fillRect(95 + x, 126 + y, 1, 2);
        g2d.fillRect(118 + x, 126 + y, 1, 3);
        g2d.fillRect(94 + x, 129 + y, 1, 4);
        g2d.fillRect(123 + x, 129 + y, 1, 9);
        g2d.fillRect(118 + x, 130 + y, 1, 3);
        g2d.fillRect(89 + x, 132 + y, 1, 2);
        g2d.fillRect(88 + x, 134 + y, 1, 1);
        g2d.fillRect(119 + x, 134 + y, 1, 4);
        g2d.fillRect(91 + x, 135 + y, 1, 3);
        g2d.fillRect(86 + x, 137 + y, 1, 1);
        g2d.fillRect(90 + x, 138 + y, 1, 3);
        g2d.fillRect(91 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 141 + y, 1, 6);
        g2d.fillRect(123 + x, 141 + y, 1, 6);
        g2d.fillRect(85 + x, 143 + y, 1, 3);
        g2d.fillRect(90 + x, 143 + y, 1, 3);
        g2d.fillRect(89 + x, 146 + y, 1, 1);
        g2d.fillRect(85 + x, 148 + y, 1, 1);
        g2d.fillRect(89 + x, 148 + y, 1, 5);
        g2d.fillRect(122 + x, 148 + y, 1, 3);
        g2d.fillRect(84 + x, 150 + y, 1, 3);
        g2d.fillRect(119 + x, 151 + y, 1, 6);
        g2d.fillRect(122 + x, 153 + y, 1, 2);
        g2d.fillRect(123 + x, 155 + y, 1, 2);
        g2d.fillRect(84 + x, 156 + y, 1, 1);
        g2d.fillRect(89 + x, 156 + y, 1, 1);
        g2d.fillRect(84 + x, 158 + y, 1, 2);
        g2d.fillRect(86 + x, 158 + y, 1, 2);
        g2d.fillRect(89 + x, 158 + y, 1, 2);
        g2d.fillRect(119 + x, 158 + y, 1, 2);
        g2d.fillRect(120 + x, 158 + y, 1, 2);
        g2d.fillRect(121 + x, 158 + y, 1, 2);
        g2d.fillRect(122 + x, 158 + y, 1, 2);
        g2d.fillRect(123 + x, 158 + y, 1, 2);
        g2d.fillRect(83 + x, 160 + y, 1, 2);
        g2d.fillRect(90 + x, 160 + y, 1, 2);
        g2d.fillRect(118 + x, 160 + y, 1, 2);
        g2d.fillRect(124 + x, 160 + y, 1, 2);
        g2d.fillRect(85 + x, 161 + y, 5, 1);
        g2d.fillRect(120 + x, 161 + y, 2, 1);
        g2d.fillRect(123 + x, 161 + y, 1, 1);


        g2d.setColor(bd.getHighlightColor());
        g2d.fillRect(101 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 1, 3);
        g2d.fillRect(100 + x, 90 + y, 1, 3);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);


        g2d.setColor(bd.getHighlightColor());
        g2d.fillRect(100 + x, 87 + y, 1, 3);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(120 + x, 91 + y, 1, 4);
        g2d.fillRect(121 + x, 91 + y, 1, 25);
        g2d.fillRect(99 + x, 92 + y, 1, 8);
        g2d.fillRect(105 + x, 92 + y, 1, 4);
        g2d.fillRect(115 + x, 92 + y, 1, 6);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 1, 6);
        g2d.fillRect(103 + x, 96 + y, 1, 6);
        g2d.fillRect(116 + x, 97 + y, 1, 5);
        g2d.fillRect(98 + x, 98 + y, 1, 7);
        g2d.fillRect(102 + x, 99 + y, 1, 6);
        g2d.fillRect(117 + x, 101 + y, 1, 17);
        g2d.fillRect(101 + x, 103 + y, 1, 4);
        g2d.fillRect(97 + x, 104 + y, 1, 3);
        g2d.fillRect(100 + x, 106 + y, 1, 5);
        g2d.fillRect(120 + x, 106 + y, 1, 4);
        g2d.fillRect(96 + x, 107 + y, 1, 5);
        g2d.fillRect(118 + x, 107 + y, 1, 4);
        g2d.fillRect(119 + x, 107 + y, 1, 3);
        g2d.fillRect(97 + x, 108 + y, 1, 3);
        g2d.fillRect(98 + x, 109 + y, 1, 2);
        g2d.fillRect(122 + x, 110 + y, 1, 6);
        g2d.fillRect(95 + x, 111 + y, 1, 4);
        g2d.fillRect(99 + x, 111 + y, 1, 7);
        g2d.fillRect(96 + x, 115 + y, 1, 1);
        g2d.fillRect(98 + x, 115 + y, 1, 3);
        g2d.fillRect(94 + x, 116 + y, 1, 3);
        g2d.fillRect(118 + x, 116 + y, 1, 2);
        g2d.fillRect(93 + x, 119 + y, 1, 4);
        g2d.fillRect(95 + x, 119 + y, 1, 1);
        g2d.fillRect(97 + x, 119 + y, 1, 1);
        g2d.fillRect(118 + x, 119 + y, 1, 1);
        g2d.fillRect(122 + x, 119 + y, 1, 1);
        g2d.fillRect(92 + x, 121 + y, 1, 3);
        g2d.fillRect(97 + x, 121 + y, 1, 2);
        g2d.fillRect(118 + x, 121 + y, 1, 4);
        g2d.fillRect(122 + x, 121 + y, 1, 4);
        g2d.fillRect(96 + x, 123 + y, 1, 1);
        g2d.fillRect(95 + x, 124 + y, 1, 2);
        g2d.fillRect(91 + x, 125 + y, 1, 3);
        g2d.fillRect(92 + x, 125 + y, 1, 1);
        g2d.fillRect(94 + x, 125 + y, 1, 1);
        g2d.fillRect(119 + x, 126 + y, 1, 4);
        g2d.fillRect(122 + x, 126 + y, 1, 3);
        g2d.fillRect(94 + x, 128 + y, 1, 1);
        g2d.fillRect(91 + x, 129 + y, 1, 1);
        g2d.fillRect(93 + x, 129 + y, 1, 4);
        g2d.fillRect(90 + x, 130 + y, 1, 3);
        g2d.fillRect(122 + x, 130 + y, 1, 5);
        g2d.fillRect(119 + x, 132 + y, 1, 1);
        g2d.fillRect(92 + x, 133 + y, 1, 1);
        g2d.fillRect(120 + x, 133 + y, 1, 2);
        g2d.fillRect(91 + x, 134 + y, 1, 1);
        g2d.fillRect(89 + x, 135 + y, 1, 8);
        g2d.fillRect(87 + x, 138 + y, 1, 3);
        g2d.fillRect(88 + x, 138 + y, 1, 3);
        g2d.fillRect(120 + x, 138 + y, 1, 3);
        g2d.fillRect(122 + x, 138 + y, 1, 3);
        g2d.fillRect(86 + x, 141 + y, 1, 2);
        g2d.fillRect(120 + x, 143 + y, 1, 3);
        g2d.fillRect(122 + x, 143 + y, 1, 3);
        g2d.fillRect(87 + x, 146 + y, 2, 1);
        g2d.fillRect(87 + x, 148 + y, 1, 3);
        g2d.fillRect(88 + x, 148 + y, 1, 3);
        g2d.fillRect(120 + x, 148 + y, 1, 3);
        g2d.fillRect(85 + x, 149 + y, 1, 2);
        g2d.fillRect(85 + x, 153 + y, 1, 3);
        g2d.fillRect(87 + x, 153 + y, 1, 3);
        g2d.fillRect(88 + x, 153 + y, 1, 3);
        g2d.fillRect(120 + x, 153 + y, 1, 3);
        g2d.fillRect(122 + x, 155 + y, 1, 1);
        g2d.fillRect(123 + x, 160 + y, 1, 1);


        g2d.setColor(bd.getFillColor());
        g2d.fillRect(95 + x, 116 + y, 1, 2);


        g2d.setColor(bd.getFillColor());
        g2d.fillRect(102 + x, 86 + y, 1, 5);
        g2d.fillRect(103 + x, 86 + y, 1, 5);
        g2d.fillRect(101 + x, 89 + y, 1, 3);
        g2d.fillRect(105 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 5, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 2);
        g2d.fillRect(116 + x, 95 + y, 1, 2);
        g2d.fillRect(102 + x, 96 + y, 1, 3);
        g2d.fillRect(117 + x, 98 + y, 1, 3);
        g2d.fillRect(101 + x, 101 + y, 1, 2);
        g2d.fillRect(118 + x, 101 + y, 1, 6);
        g2d.fillRect(100 + x, 104 + y, 1, 2);
        g2d.fillRect(97 + x, 107 + y, 2, 1);
        g2d.fillRect(98 + x, 108 + y, 1, 1);


        g2d.setColor(bd.getFillColor());
        g2d.fillRect(102 + x, 91 + y, 1, 5);
        g2d.fillRect(103 + x, 91 + y, 1, 3);
        g2d.fillRect(104 + x, 91 + y, 1, 2);
        g2d.fillRect(101 + x, 92 + y, 1, 9);
        g2d.fillRect(116 + x, 92 + y, 1, 3);
        g2d.fillRect(117 + x, 92 + y, 1, 6);
        g2d.fillRect(118 + x, 92 + y, 1, 9);
        g2d.fillRect(119 + x, 92 + y, 1, 15);
        g2d.fillRect(100 + x, 93 + y, 1, 11);
        g2d.fillRect(120 + x, 95 + y, 1, 11);
        g2d.fillRect(99 + x, 100 + y, 1, 11);
        g2d.fillRect(98 + x, 105 + y, 1, 2);
        g2d.fillRect(119 + x, 110 + y, 1, 8);
        g2d.fillRect(120 + x, 110 + y, 1, 6);
        g2d.fillRect(97 + x, 111 + y, 1, 5);
        g2d.fillRect(98 + x, 111 + y, 1, 4);
        g2d.fillRect(118 + x, 111 + y, 1, 5);
        g2d.fillRect(96 + x, 112 + y, 1, 3);
        g2d.fillRect(95 + x, 118 + y, 2, 1);
        g2d.fillRect(121 + x, 118 + y, 1, 3);
        g2d.fillRect(96 + x, 119 + y, 1, 2);
        g2d.fillRect(119 + x, 119 + y, 1, 2);
        g2d.fillRect(120 + x, 119 + y, 1, 1);
        g2d.fillRect(94 + x, 120 + y, 1, 4);
        g2d.fillRect(95 + x, 121 + y, 1, 2);
        g2d.fillRect(120 + x, 121 + y, 1, 2);
        g2d.fillRect(93 + x, 123 + y, 1, 2);
        g2d.fillRect(119 + x, 123 + y, 1, 1);
        g2d.fillRect(121 + x, 123 + y, 1, 1);
        g2d.fillRect(119 + x, 125 + y, 3, 1);
        g2d.fillRect(93 + x, 126 + y, 1, 3);
        g2d.fillRect(120 + x, 126 + y, 1, 6);
        g2d.fillRect(121 + x, 126 + y, 1, 4);
        g2d.fillRect(92 + x, 128 + y, 1, 4);
        g2d.fillRect(91 + x, 132 + y, 1, 2);
        g2d.fillRect(121 + x, 132 + y, 1, 1);
        g2d.fillRect(90 + x, 133 + y, 1, 2);
        g2d.fillRect(121 + x, 138 + y, 1, 5);
        g2d.fillRect(87 + x, 143 + y, 2, 1);
        g2d.fillRect(86 + x, 146 + y, 1, 1);
        g2d.fillRect(121 + x, 148 + y, 1, 3);
        g2d.fillRect(86 + x, 152 + y, 1, 4);
        g2d.fillRect(121 + x, 156 + y, 1, 1);


        g2d.setColor(bd.getFillColor());
        g2d.fillRect(120 + x, 120 + y, 1, 1);
        g2d.fillRect(120 + x, 124 + y, 1, 1);
        g2d.fillRect(121 + x, 135 + y, 1, 3);
        g2d.fillRect(87 + x, 144 + y, 1, 2);
        g2d.fillRect(88 + x, 144 + y, 1, 2);
        g2d.fillRect(121 + x, 146 + y, 1, 1);
        g2d.fillRect(86 + x, 151 + y, 1, 1);
        g2d.fillRect(121 + x, 151 + y, 1, 2);
        g2d.fillRect(86 + x, 156 + y, 1, 1);
        g2d.fillRect(85 + x, 160 + y, 1, 1);
        g2d.fillRect(87 + x, 160 + y, 2, 1);
        g2d.fillRect(120 + x, 160 + y, 1, 1);
    }


    public void drawBody(b.Bd bd) {
        bd.paintLegs = false;
    }
}
