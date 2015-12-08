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
public class Pose2 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Pose2() {
        super();
    }

    public Pose2(int layer) {
        super(layer);
    }

    public Pose2(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Pose2(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }
    
    {
        noWalk = true;
    }

    public void paintFront(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 114 + y, 1, 2);
        g2d.fillRect(95 + x, 114 + y, 1, 1);
        g2d.fillRect(96 + x, 115 + y, 1, 1);
        g2d.fillRect(97 + x, 116 + y, 1, 1);
        g2d.fillRect(93 + x, 117 + y, 1, 3);
        g2d.fillRect(98 + x, 117 + y, 3, 1);
        g2d.fillRect(117 + x, 118 + y, 7, 1);
        g2d.fillRect(92 + x, 120 + y, 1, 3);
        g2d.fillRect(99 + x, 121 + y, 1, 1);
        g2d.fillRect(123 + x, 121 + y, 1, 3);
        g2d.fillRect(97 + x, 124 + y, 1, 1);
        g2d.fillRect(123 + x, 125 + y, 1, 3);
        g2d.fillRect(96 + x, 126 + y, 1, 2);
        g2d.fillRect(118 + x, 126 + y, 1, 3);
        g2d.fillRect(90 + x, 129 + y, 1, 1);
        g2d.fillRect(95 + x, 129 + y, 1, 2);
        g2d.fillRect(118 + x, 130 + y, 1, 2);
        g2d.fillRect(123 + x, 131 + y, 1, 7);
        g2d.fillRect(94 + x, 132 + y, 1, 1);
        g2d.fillRect(119 + x, 132 + y, 1, 6);
        g2d.fillRect(89 + x, 133 + y, 1, 2);
        g2d.fillRect(88 + x, 137 + y, 1, 1);
        g2d.fillRect(92 + x, 137 + y, 1, 1);
        g2d.fillRect(91 + x, 139 + y, 1, 1);
        g2d.fillRect(87 + x, 146 + y, 3, 1);
        g2d.fillRect(119 + x, 146 + y, 1, 1);
        g2d.fillRect(121 + x, 146 + y, 2, 1);
        g2d.fillRect(91 + x, 148 + y, 1, 1);
        g2d.fillRect(93 + x, 148 + y, 1, 2);
        g2d.fillRect(92 + x, 150 + y, 1, 1);
        g2d.fillRect(92 + x, 152 + y, 1, 3);
        g2d.fillRect(117 + x, 153 + y, 1, 1);
        g2d.fillRect(116 + x, 154 + y, 1, 3);
        g2d.fillRect(93 + x, 155 + y, 1, 1);
        g2d.fillRect(86 + x, 156 + y, 5, 1);
        g2d.fillRect(119 + x, 156 + y, 5, 1);
        g2d.fillRect(85 + x, 161 + y, 4, 1);
        g2d.fillRect(90 + x, 161 + y, 2, 1);
        g2d.fillRect(118 + x, 161 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(95 + x, 115 + y, 1, 1);
        g2d.fillRect(97 + x, 115 + y, 1, 1);
        g2d.fillRect(94 + x, 116 + y, 1, 1);
        g2d.fillRect(96 + x, 116 + y, 1, 1);
        g2d.fillRect(97 + x, 117 + y, 1, 1);
        g2d.fillRect(94 + x, 119 + y, 1, 1);
        g2d.fillRect(93 + x, 120 + y, 1, 1);
        g2d.fillRect(99 + x, 120 + y, 2, 1);
        g2d.fillRect(117 + x, 120 + y, 1, 3);
        g2d.fillRect(100 + x, 121 + y, 1, 2);
        g2d.fillRect(116 + x, 121 + y, 1, 1);
        g2d.fillRect(117 + x, 124 + y, 1, 2);
        g2d.fillRect(123 + x, 124 + y, 1, 1);
        g2d.fillRect(96 + x, 125 + y, 2, 1);
        g2d.fillRect(115 + x, 125 + y, 1, 1);
        g2d.fillRect(118 + x, 125 + y, 1, 1);
        g2d.fillRect(97 + x, 126 + y, 1, 2);
        g2d.fillRect(95 + x, 128 + y, 1, 1);
        g2d.fillRect(116 + x, 128 + y, 1, 2);
        g2d.fillRect(118 + x, 129 + y, 1, 1);
        g2d.fillRect(90 + x, 130 + y, 1, 1);
        g2d.fillRect(117 + x, 132 + y, 1, 3);
        g2d.fillRect(89 + x, 135 + y, 1, 1);
        g2d.fillRect(90 + x, 139 + y, 1, 1);
        g2d.fillRect(91 + x, 140 + y, 1, 1);
        g2d.fillRect(120 + x, 145 + y, 1, 2);
        g2d.fillRect(90 + x, 146 + y, 1, 1);
        g2d.fillRect(92 + x, 146 + y, 1, 1);
        g2d.fillRect(118 + x, 146 + y, 1, 1);
        g2d.fillRect(93 + x, 147 + y, 1, 1);
        g2d.fillRect(118 + x, 149 + y, 1, 1);
        g2d.fillRect(91 + x, 151 + y, 1, 1);
        g2d.fillRect(118 + x, 153 + y, 1, 1);
        g2d.fillRect(117 + x, 154 + y, 1, 1);
        g2d.fillRect(89 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 114 + y, 1, 1);
        g2d.fillRect(95 + x, 116 + y, 1, 3);
        g2d.fillRect(94 + x, 117 + y, 1, 2);
        g2d.fillRect(96 + x, 117 + y, 1, 1);
        g2d.fillRect(101 + x, 117 + y, 1, 1);
        g2d.fillRect(98 + x, 118 + y, 3, 1);
        g2d.fillRect(96 + x, 119 + y, 1, 1);
        g2d.fillRect(99 + x, 119 + y, 2, 1);
        g2d.fillRect(117 + x, 119 + y, 4, 1);
        g2d.fillRect(123 + x, 119 + y, 1, 2);
        g2d.fillRect(94 + x, 120 + y, 1, 2);
        g2d.fillRect(116 + x, 120 + y, 1, 1);
        g2d.fillRect(118 + x, 120 + y, 1, 5);
        g2d.fillRect(119 + x, 120 + y, 1, 12);
        g2d.fillRect(120 + x, 120 + y, 1, 14);
        g2d.fillRect(93 + x, 121 + y, 1, 3);
        g2d.fillRect(95 + x, 121 + y, 1, 1);
        g2d.fillRect(101 + x, 121 + y, 1, 3);
        g2d.fillRect(115 + x, 121 + y, 1, 4);
        g2d.fillRect(97 + x, 122 + y, 1, 2);
        g2d.fillRect(98 + x, 122 + y, 1, 2);
        g2d.fillRect(114 + x, 122 + y, 1, 4);
        g2d.fillRect(92 + x, 123 + y, 1, 6);
        g2d.fillRect(100 + x, 123 + y, 1, 11);
        g2d.fillRect(117 + x, 123 + y, 1, 1);
        g2d.fillRect(122 + x, 123 + y, 1, 1);
        g2d.fillRect(99 + x, 124 + y, 1, 6);
        g2d.fillRect(91 + x, 125 + y, 1, 7);
        g2d.fillRect(94 + x, 126 + y, 2, 1);
        g2d.fillRect(115 + x, 126 + y, 1, 1);
        g2d.fillRect(117 + x, 126 + y, 1, 1);
        g2d.fillRect(95 + x, 127 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 1);
        g2d.fillRect(122 + x, 127 + y, 1, 1);
        g2d.fillRect(98 + x, 128 + y, 1, 3);
        g2d.fillRect(115 + x, 128 + y, 1, 2);
        g2d.fillRect(94 + x, 129 + y, 1, 3);
        g2d.fillRect(114 + x, 129 + y, 1, 6);
        g2d.fillRect(92 + x, 130 + y, 1, 2);
        g2d.fillRect(101 + x, 130 + y, 1, 3);
        g2d.fillRect(113 + x, 130 + y, 1, 4);
        g2d.fillRect(116 + x, 130 + y, 1, 2);
        g2d.fillRect(123 + x, 130 + y, 1, 1);
        g2d.fillRect(93 + x, 131 + y, 1, 4);
        g2d.fillRect(97 + x, 131 + y, 1, 6);
        g2d.fillRect(122 + x, 132 + y, 1, 1);
        g2d.fillRect(90 + x, 133 + y, 1, 4);
        g2d.fillRect(92 + x, 133 + y, 1, 4);
        g2d.fillRect(96 + x, 133 + y, 1, 1);
        g2d.fillRect(99 + x, 133 + y, 1, 2);
        g2d.fillRect(95 + x, 134 + y, 1, 2);
        g2d.fillRect(98 + x, 134 + y, 1, 2);
        g2d.fillRect(115 + x, 135 + y, 1, 1);
        g2d.fillRect(120 + x, 135 + y, 1, 6);
        g2d.fillRect(89 + x, 136 + y, 1, 3);
        g2d.fillRect(116 + x, 136 + y, 1, 2);
        g2d.fillRect(122 + x, 136 + y, 1, 1);
        g2d.fillRect(91 + x, 137 + y, 1, 2);
        g2d.fillRect(96 + x, 137 + y, 1, 1);
        g2d.fillRect(88 + x, 138 + y, 1, 2);
        g2d.fillRect(97 + x, 138 + y, 1, 1);
        g2d.fillRect(115 + x, 138 + y, 1, 1);
        g2d.fillRect(119 + x, 138 + y, 1, 2);
        g2d.fillRect(123 + x, 138 + y, 1, 1);
        g2d.fillRect(90 + x, 143 + y, 1, 1);
        g2d.fillRect(121 + x, 143 + y, 1, 1);
        g2d.fillRect(91 + x, 144 + y, 1, 2);
        g2d.fillRect(122 + x, 145 + y, 1, 1);
        g2d.fillRect(91 + x, 147 + y, 1, 1);
        g2d.fillRect(119 + x, 147 + y, 1, 1);
        g2d.fillRect(88 + x, 148 + y, 1, 1);
        g2d.fillRect(116 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 148 + y, 1, 1);
        g2d.fillRect(89 + x, 150 + y, 1, 1);
        g2d.fillRect(118 + x, 150 + y, 1, 1);
        g2d.fillRect(122 + x, 150 + y, 1, 1);
        g2d.fillRect(90 + x, 152 + y, 1, 2);
        g2d.fillRect(121 + x, 153 + y, 1, 1);
        g2d.fillRect(89 + x, 155 + y, 1, 1);
        g2d.fillRect(120 + x, 155 + y, 1, 1);
        g2d.fillRect(122 + x, 155 + y, 1, 1);
        g2d.fillRect(87 + x, 157 + y, 1, 1);
        g2d.fillRect(89 + x, 157 + y, 1, 1);
        g2d.fillRect(122 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 116 + y, 1, 1);
        g2d.fillRect(96 + x, 118 + y, 2, 1);
        g2d.fillRect(101 + x, 118 + y, 1, 1);
        g2d.fillRect(95 + x, 119 + y, 1, 2);
        g2d.fillRect(97 + x, 119 + y, 2, 1);
        g2d.fillRect(121 + x, 119 + y, 1, 21);
        g2d.fillRect(122 + x, 119 + y, 1, 1);
        g2d.fillRect(96 + x, 120 + y, 1, 1);
        g2d.fillRect(98 + x, 120 + y, 1, 2);
        g2d.fillRect(97 + x, 121 + y, 1, 1);
        g2d.fillRect(94 + x, 122 + y, 1, 4);
        g2d.fillRect(95 + x, 122 + y, 1, 2);
        g2d.fillRect(96 + x, 122 + y, 1, 3);
        g2d.fillRect(122 + x, 122 + y, 1, 1);
        g2d.fillRect(91 + x, 124 + y, 1, 1);
        g2d.fillRect(93 + x, 124 + y, 1, 4);
        g2d.fillRect(122 + x, 124 + y, 1, 1);
        g2d.fillRect(95 + x, 125 + y, 1, 1);
        g2d.fillRect(122 + x, 126 + y, 1, 1);
        g2d.fillRect(94 + x, 128 + y, 1, 1);
        g2d.fillRect(123 + x, 128 + y, 1, 2);
        g2d.fillRect(92 + x, 129 + y, 1, 1);
        g2d.fillRect(93 + x, 130 + y, 1, 1);
        g2d.fillRect(122 + x, 130 + y, 1, 2);
        g2d.fillRect(90 + x, 131 + y, 1, 2);
        g2d.fillRect(91 + x, 132 + y, 1, 1);
        g2d.fillRect(122 + x, 133 + y, 1, 3);
        g2d.fillRect(120 + x, 134 + y, 1, 1);
        g2d.fillRect(93 + x, 135 + y, 1, 1);
        g2d.fillRect(91 + x, 136 + y, 1, 1);
        g2d.fillRect(122 + x, 137 + y, 1, 5);
        g2d.fillRect(90 + x, 138 + y, 1, 1);
        g2d.fillRect(89 + x, 139 + y, 1, 2);
        g2d.fillRect(123 + x, 139 + y, 1, 2);
        g2d.fillRect(90 + x, 140 + y, 1, 1);
        g2d.fillRect(119 + x, 140 + y, 1, 1);
        g2d.fillRect(91 + x, 141 + y, 1, 1);
        g2d.fillRect(120 + x, 141 + y, 1, 1);
        g2d.fillRect(90 + x, 142 + y, 1, 1);
        g2d.fillRect(121 + x, 142 + y, 1, 1);
        g2d.fillRect(88 + x, 143 + y, 1, 1);
        g2d.fillRect(87 + x, 145 + y, 1, 1);
        g2d.fillRect(88 + x, 147 + y, 1, 1);
        g2d.fillRect(117 + x, 147 + y, 1, 1);
        g2d.fillRect(119 + x, 148 + y, 1, 1);
        g2d.fillRect(91 + x, 149 + y, 2, 1);
        g2d.fillRect(116 + x, 149 + y, 1, 2);
        g2d.fillRect(87 + x, 150 + y, 1, 1);
        g2d.fillRect(120 + x, 150 + y, 1, 2);
        g2d.fillRect(89 + x, 151 + y, 1, 1);
        g2d.fillRect(117 + x, 151 + y, 1, 1);
        g2d.fillRect(122 + x, 151 + y, 1, 1);
        g2d.fillRect(118 + x, 152 + y, 1, 1);
        g2d.fillRect(87 + x, 155 + y, 1, 1);
        g2d.fillRect(86 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 159 + y, 1, 1);
        g2d.fillRect(119 + x, 159 + y, 1, 2);
        g2d.fillRect(121 + x, 159 + y, 1, 1);
        g2d.fillRect(86 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(95 + x, 113 + y, 1, 1);
        g2d.fillRect(99 + x, 116 + y, 3, 1);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(123 + x, 117 + y, 1, 1);
        g2d.fillRect(97 + x, 120 + y, 1, 1);
        g2d.fillRect(122 + x, 120 + y, 1, 2);
        g2d.fillRect(96 + x, 121 + y, 1, 1);
        g2d.fillRect(95 + x, 124 + y, 1, 1);
        g2d.fillRect(122 + x, 125 + y, 1, 1);
        g2d.fillRect(94 + x, 127 + y, 1, 1);
        g2d.fillRect(93 + x, 128 + y, 1, 2);
        g2d.fillRect(122 + x, 128 + y, 1, 2);
        g2d.fillRect(92 + x, 132 + y, 1, 1);
        g2d.fillRect(91 + x, 133 + y, 1, 3);
        g2d.fillRect(88 + x, 136 + y, 1, 1);
        g2d.fillRect(90 + x, 137 + y, 1, 1);
        g2d.fillRect(88 + x, 140 + y, 1, 1);
        g2d.fillRect(89 + x, 141 + y, 1, 1);
        g2d.fillRect(87 + x, 142 + y, 1, 3);
        g2d.fillRect(88 + x, 142 + y, 1, 1);
        g2d.fillRect(90 + x, 144 + y, 1, 2);
        g2d.fillRect(122 + x, 144 + y, 1, 1);
        g2d.fillRect(89 + x, 145 + y, 1, 1);
        g2d.fillRect(119 + x, 145 + y, 1, 1);
        g2d.fillRect(87 + x, 147 + y, 1, 1);
        g2d.fillRect(90 + x, 147 + y, 1, 1);
        g2d.fillRect(117 + x, 148 + y, 1, 1);
        g2d.fillRect(119 + x, 149 + y, 1, 1);
        g2d.fillRect(122 + x, 149 + y, 1, 1);
        g2d.fillRect(86 + x, 150 + y, 1, 6);
        g2d.fillRect(117 + x, 150 + y, 1, 1);
        g2d.fillRect(87 + x, 151 + y, 1, 1);
        g2d.fillRect(121 + x, 152 + y, 2, 1);
        g2d.fillRect(90 + x, 154 + y, 1, 1);
        g2d.fillRect(119 + x, 155 + y, 1, 1);
        g2d.fillRect(123 + x, 155 + y, 1, 1);
        g2d.fillRect(88 + x, 157 + y, 1, 3);
        g2d.fillRect(90 + x, 157 + y, 1, 2);
        g2d.fillRect(119 + x, 157 + y, 3, 1);
        g2d.fillRect(123 + x, 157 + y, 1, 1);
        g2d.fillRect(121 + x, 158 + y, 2, 1);
        g2d.fillRect(85 + x, 159 + y, 1, 2);
        g2d.fillRect(86 + x, 159 + y, 1, 1);
        g2d.fillRect(118 + x, 159 + y, 1, 2);
        g2d.fillRect(89 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(92 + x, 148 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(156, 90, 82));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(204, 123, 82));
        COLORS.set(ImageUtilities.GREY, new Color(206, 123, 82));
        COLORS.set(ImageUtilities.GREY_1, new Color(248, 162, 84));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(18, 18, 17));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(33, 33, 33));
        COLORS.set(ImageUtilities.GREY, new Color(64, 61, 60));
        COLORS.set(ImageUtilities.GREY_1, new Color(104, 74, 66));
        COLORS.set(ImageUtilities.GREY_2, new Color(226, 226, 226));
    }

    public boolean getOriginalColorArray() {
        return false;
    }

    public void drawBody(b.Bd bd, int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(99 + x, 87 + y, 1, 11);
        g2d.fillRect(108 + x, 91 + y, 1, 4);
        g2d.fillRect(112 + x, 91 + y, 2, 1);
        g2d.fillRect(122 + x, 91 + y, 1, 18);
        g2d.fillRect(113 + x, 92 + y, 1, 5);
        g2d.fillRect(107 + x, 95 + y, 1, 4);
        g2d.fillRect(114 + x, 96 + y, 1, 2);
        g2d.fillRect(98 + x, 98 + y, 1, 5);
        g2d.fillRect(115 + x, 98 + y, 1, 4);
        g2d.fillRect(106 + x, 99 + y, 1, 2);
        g2d.fillRect(105 + x, 101 + y, 1, 3);
        g2d.fillRect(116 + x, 102 + y, 1, 15);
        g2d.fillRect(97 + x, 103 + y, 1, 4);
        g2d.fillRect(104 + x, 103 + y, 1, 3);
        g2d.fillRect(103 + x, 106 + y, 1, 4);
        g2d.fillRect(96 + x, 107 + y, 1, 4);
        g2d.fillRect(102 + x, 109 + y, 1, 3);
        g2d.fillRect(123 + x, 109 + y, 1, 8);
        g2d.fillRect(95 + x, 110 + y, 1, 3);
        g2d.fillRect(101 + x, 111 + y, 1, 5);
        g2d.fillRect(96 + x, 113 + y, 1, 1);
        g2d.fillRect(118 + x, 117 + y, 1, 1);
        g2d.fillRect(122 + x, 117 + y, 1, 1);
        g2d.fillRect(88 + x, 135 + y, 1, 1);
        g2d.fillRect(121 + x, 140 + y, 1, 1);
        g2d.fillRect(88 + x, 141 + y, 1, 1);
        g2d.fillRect(119 + x, 141 + y, 1, 4);
        g2d.fillRect(123 + x, 141 + y, 1, 5);
        g2d.fillRect(91 + x, 142 + y, 1, 2);
        g2d.fillRect(120 + x, 144 + y, 1, 1);
        g2d.fillRect(91 + x, 146 + y, 1, 1);
        g2d.fillRect(92 + x, 147 + y, 1, 1);
        g2d.fillRect(118 + x, 147 + y, 1, 1);
        g2d.fillRect(122 + x, 147 + y, 1, 2);
        g2d.fillRect(87 + x, 148 + y, 1, 2);
        g2d.fillRect(90 + x, 148 + y, 1, 4);
        g2d.fillRect(86 + x, 149 + y, 1, 1);
        g2d.fillRect(88 + x, 149 + y, 2, 1);
        g2d.fillRect(117 + x, 149 + y, 1, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 1);
        g2d.fillRect(91 + x, 150 + y, 1, 1);
        g2d.fillRect(119 + x, 150 + y, 1, 3);
        g2d.fillRect(89 + x, 152 + y, 1, 1);
        g2d.fillRect(120 + x, 152 + y, 1, 1);
        g2d.fillRect(123 + x, 153 + y, 1, 2);
        g2d.fillRect(89 + x, 154 + y, 1, 1);
        g2d.fillRect(119 + x, 154 + y, 4, 1);
        g2d.fillRect(90 + x, 155 + y, 1, 1);
        g2d.fillRect(122 + x, 157 + y, 1, 1);
        g2d.fillRect(85 + x, 158 + y, 3, 1);
        g2d.fillRect(91 + x, 158 + y, 1, 3);
        g2d.fillRect(118 + x, 158 + y, 2, 1);
        g2d.fillRect(124 + x, 158 + y, 1, 3);
        g2d.fillRect(87 + x, 160 + y, 2, 1);
        g2d.fillRect(90 + x, 160 + y, 1, 1);
        g2d.fillRect(120 + x, 160 + y, 2, 1);
        g2d.fillRect(123 + x, 160 + y, 1, 1);


        g2d.setColor(bd.getHighlightColor());
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(120 + x, 91 + y, 1, 3);
        g2d.fillRect(121 + x, 91 + y, 1, 24);
        g2d.fillRect(106 + x, 92 + y, 1, 7);
        g2d.fillRect(107 + x, 93 + y, 1, 2);
        g2d.fillRect(105 + x, 94 + y, 1, 7);
        g2d.fillRect(115 + x, 94 + y, 1, 4);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 7);
        g2d.fillRect(100 + x, 97 + y, 1, 2);
        g2d.fillRect(116 + x, 97 + y, 1, 5);
        g2d.fillRect(99 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 6);
        g2d.fillRect(117 + x, 101 + y, 1, 7);
        g2d.fillRect(102 + x, 102 + y, 1, 7);
        g2d.fillRect(98 + x, 103 + y, 2, 1);
        g2d.fillRect(98 + x, 105 + y, 1, 2);
        g2d.fillRect(101 + x, 105 + y, 1, 6);
        g2d.fillRect(120 + x, 105 + y, 1, 3);
        g2d.fillRect(97 + x, 107 + y, 1, 1);
        g2d.fillRect(100 + x, 107 + y, 1, 9);
        g2d.fillRect(97 + x, 109 + y, 1, 2);
        g2d.fillRect(99 + x, 109 + y, 1, 7);
        g2d.fillRect(122 + x, 109 + y, 1, 8);
        g2d.fillRect(96 + x, 111 + y, 1, 2);
        g2d.fillRect(98 + x, 115 + y, 1, 1);
        g2d.fillRect(117 + x, 115 + y, 1, 2);
        g2d.fillRect(118 + x, 116 + y, 1, 1);
        g2d.fillRect(119 + x, 117 + y, 3, 1);
        g2d.fillRect(90 + x, 141 + y, 1, 1);
        g2d.fillRect(89 + x, 142 + y, 1, 1);
        g2d.fillRect(120 + x, 142 + y, 1, 2);
        g2d.fillRect(122 + x, 142 + y, 1, 2);
        g2d.fillRect(88 + x, 144 + y, 1, 2);
        g2d.fillRect(121 + x, 144 + y, 1, 2);
        g2d.fillRect(89 + x, 147 + y, 1, 1);
        g2d.fillRect(120 + x, 147 + y, 2, 1);
        g2d.fillRect(86 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 151 + y, 1, 1);
        g2d.fillRect(87 + x, 152 + y, 1, 1);
        g2d.fillRect(89 + x, 153 + y, 1, 1);
        g2d.fillRect(119 + x, 153 + y, 2, 1);
        g2d.fillRect(122 + x, 153 + y, 1, 1);
        g2d.fillRect(87 + x, 154 + y, 1, 1);
        g2d.fillRect(88 + x, 155 + y, 1, 1);
        g2d.fillRect(89 + x, 158 + y, 1, 1);
        g2d.fillRect(123 + x, 158 + y, 1, 2);


        g2d.setColor(bd.getHighlightColor());
        g2d.fillRect(101 + x, 87 + y, 1, 4);
        g2d.fillRect(100 + x, 88 + y, 1, 9);
        g2d.fillRect(107 + x, 90 + y, 1, 3);
        g2d.fillRect(114 + x, 93 + y, 1, 2);
        g2d.fillRect(120 + x, 94 + y, 1, 11);
        g2d.fillRect(99 + x, 99 + y, 1, 4);
        g2d.fillRect(98 + x, 104 + y, 1, 1);
        g2d.fillRect(97 + x, 108 + y, 1, 1);
        g2d.fillRect(117 + x, 108 + y, 1, 7);
        g2d.fillRect(121 + x, 115 + y, 1, 2);


        g2d.setColor(bd.getFillColor());
        g2d.fillRect(103 + x, 86 + y, 1, 14);
        g2d.fillRect(102 + x, 87 + y, 1, 15);
        g2d.fillRect(104 + x, 91 + y, 1, 5);
        g2d.fillRect(105 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 3);
        g2d.fillRect(116 + x, 91 + y, 1, 6);
        g2d.fillRect(117 + x, 91 + y, 1, 10);
        g2d.fillRect(118 + x, 91 + y, 1, 25);
        g2d.fillRect(119 + x, 91 + y, 1, 26);
        g2d.fillRect(101 + x, 92 + y, 1, 13);
        g2d.fillRect(100 + x, 99 + y, 1, 8);
        g2d.fillRect(99 + x, 104 + y, 1, 5);
        g2d.fillRect(98 + x, 107 + y, 1, 8);
        g2d.fillRect(120 + x, 108 + y, 1, 9);
        g2d.fillRect(97 + x, 111 + y, 1, 4);
        g2d.fillRect(121 + x, 141 + y, 1, 1);
        g2d.fillRect(89 + x, 143 + y, 1, 2);
        g2d.fillRect(89 + x, 148 + y, 1, 1);
        g2d.fillRect(120 + x, 148 + y, 2, 1);
        g2d.fillRect(121 + x, 149 + y, 1, 3);
        g2d.fillRect(88 + x, 150 + y, 1, 5);
        g2d.fillRect(87 + x, 153 + y, 1, 1);
        g2d.fillRect(121 + x, 155 + y, 1, 1);
        g2d.fillRect(120 + x, 158 + y, 1, 2);
        g2d.fillRect(87 + x, 159 + y, 1, 1);
        g2d.fillRect(89 + x, 159 + y, 1, 1);
    }


    public void drawBody(b.Bd bd) {
        bd.paintLegs = false;
    }
    
    
}
