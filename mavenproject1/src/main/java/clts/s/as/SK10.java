/*
 * Shoes0.java
 *
 * Created on March 6, 2007, 8:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.s.as;

import clts.SuperS;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class SK10 extends SuperS {

    int prevY = -9999;
    int prevYback = -9999;

    /** Creates a new instance of Shoes0 */
    public SK10() {
        super();
        drs = true;
        strap = true;
    }

    public SK10(ColorArray colorSwitch) {
        super(colorSwitch);
        drs = true;
        strap = true;
    }

    public void paintRight(int x, GraphicsMap g2d) {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        paintR(x + tempXpos - 113, tempYpos - 162, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d) {

        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        paintL(x + tempXpos - 109, tempYpos - 162, g2d);
    }

    public void paintR(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 130 + y, 1, 6);
        g2d.fillRect(109 + x, 131 + y, 1, 2);
        g2d.fillRect(110 + x, 131 + y, 1, 2);
        g2d.fillRect(115 + x, 131 + y, 2, 1);
        g2d.fillRect(108 + x, 132 + y, 1, 4);
        g2d.fillRect(111 + x, 132 + y, 4, 1);
        g2d.fillRect(115 + x, 134 + y, 1, 3);
        g2d.fillRect(116 + x, 134 + y, 1, 2);
        g2d.fillRect(111 + x, 135 + y, 4, 1);
        g2d.fillRect(109 + x, 136 + y, 1, 3);
        g2d.fillRect(113 + x, 136 + y, 2, 1);
        g2d.fillRect(108 + x, 139 + y, 1, 8);
        g2d.fillRect(114 + x, 139 + y, 1, 1);
        g2d.fillRect(116 + x, 139 + y, 1, 2);
        g2d.fillRect(109 + x, 140 + y, 1, 2);
        g2d.fillRect(110 + x, 141 + y, 1, 2);
        g2d.fillRect(115 + x, 141 + y, 1, 2);
        g2d.fillRect(111 + x, 142 + y, 4, 1);
        g2d.fillRect(111 + x, 146 + y, 4, 1);
        g2d.fillRect(108 + x, 148 + y, 1, 3);
        g2d.fillRect(115 + x, 149 + y, 1, 1);
        g2d.fillRect(109 + x, 150 + y, 1, 2);
        g2d.fillRect(107 + x, 151 + y, 1, 2);
        g2d.fillRect(110 + x, 151 + y, 3, 1);
        g2d.fillRect(108 + x, 152 + y, 1, 2);
        g2d.fillRect(111 + x, 152 + y, 3, 1);
        g2d.fillRect(116 + x, 152 + y, 1, 2);
        g2d.fillRect(109 + x, 153 + y, 1, 2);
        g2d.fillRect(115 + x, 153 + y, 1, 2);
        g2d.fillRect(107 + x, 154 + y, 1, 1);
        g2d.fillRect(110 + x, 154 + y, 5, 1);
        g2d.fillRect(116 + x, 155 + y, 1, 1);
        g2d.fillRect(107 + x, 156 + y, 2, 1);
        g2d.fillRect(115 + x, 157 + y, 1, 1);
        g2d.fillRect(112 + x, 158 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 132 + y, 1, 2);
        g2d.fillRect(109 + x, 133 + y, 4, 1);
        g2d.fillRect(114 + x, 134 + y, 1, 1);
        g2d.fillRect(110 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 136 + y, 1, 1);
        g2d.fillRect(116 + x, 136 + y, 1, 1);
        g2d.fillRect(110 + x, 137 + y, 1, 3);
        g2d.fillRect(111 + x, 137 + y, 1, 1);
        g2d.fillRect(116 + x, 138 + y, 1, 1);
        g2d.fillRect(109 + x, 139 + y, 1, 1);
        g2d.fillRect(113 + x, 139 + y, 1, 1);
        g2d.fillRect(115 + x, 139 + y, 1, 1);
        g2d.fillRect(114 + x, 141 + y, 1, 1);
        g2d.fillRect(109 + x, 142 + y, 1, 3);
        g2d.fillRect(110 + x, 143 + y, 1, 2);
        g2d.fillRect(109 + x, 146 + y, 2, 1);
        g2d.fillRect(115 + x, 146 + y, 1, 2);
        g2d.fillRect(108 + x, 147 + y, 1, 1);
        g2d.fillRect(110 + x, 147 + y, 1, 1);
        g2d.fillRect(109 + x, 148 + y, 1, 2);
        g2d.fillRect(108 + x, 151 + y, 1, 1);
        g2d.fillRect(113 + x, 151 + y, 2, 1);
        g2d.fillRect(109 + x, 152 + y, 2, 1);
        g2d.fillRect(107 + x, 153 + y, 1, 1);
        g2d.fillRect(108 + x, 154 + y, 1, 2);
        g2d.fillRect(116 + x, 154 + y, 1, 1);
        g2d.fillRect(107 + x, 155 + y, 1, 1);
        g2d.fillRect(109 + x, 155 + y, 1, 1);
        g2d.fillRect(114 + x, 155 + y, 1, 1);
        g2d.fillRect(115 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 132 + y, 1, 1);
        g2d.fillRect(116 + x, 137 + y, 1, 1);
        g2d.fillRect(115 + x, 138 + y, 1, 1);
        g2d.fillRect(112 + x, 139 + y, 1, 1);
        g2d.fillRect(115 + x, 140 + y, 1, 1);
        g2d.fillRect(113 + x, 141 + y, 1, 1);
        g2d.fillRect(111 + x, 143 + y, 1, 2);
        g2d.fillRect(112 + x, 143 + y, 1, 2);
        g2d.fillRect(113 + x, 144 + y, 2, 1);
        g2d.fillRect(111 + x, 147 + y, 4, 1);
        g2d.fillRect(114 + x, 148 + y, 1, 1);
        g2d.fillRect(110 + x, 149 + y, 2, 1);
        g2d.fillRect(114 + x, 150 + y, 2, 1);
        g2d.fillRect(109 + x, 157 + y, 2, 1);
        g2d.fillRect(113 + x, 157 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 133 + y, 3, 1);
        g2d.fillRect(109 + x, 134 + y, 1, 2);
        g2d.fillRect(110 + x, 134 + y, 1, 1);
        g2d.fillRect(110 + x, 136 + y, 2, 1);
        g2d.fillRect(112 + x, 137 + y, 3, 1);
        g2d.fillRect(111 + x, 138 + y, 1, 3);
        g2d.fillRect(110 + x, 140 + y, 1, 1);
        g2d.fillRect(112 + x, 140 + y, 1, 1);
        g2d.fillRect(115 + x, 143 + y, 1, 2);
        g2d.fillRect(109 + x, 145 + y, 3, 1);
        g2d.fillRect(109 + x, 147 + y, 1, 1);
        g2d.fillRect(110 + x, 148 + y, 2, 1);
        g2d.fillRect(112 + x, 149 + y, 1, 1);
        g2d.fillRect(110 + x, 150 + y, 1, 1);
        g2d.fillRect(113 + x, 150 + y, 1, 1);
        g2d.fillRect(115 + x, 151 + y, 1, 1);
        g2d.fillRect(110 + x, 153 + y, 2, 1);
        g2d.fillRect(110 + x, 155 + y, 4, 1);
        g2d.fillRect(109 + x, 156 + y, 1, 1);
        g2d.fillRect(111 + x, 157 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 134 + y, 3, 1);
        g2d.fillRect(115 + x, 137 + y, 1, 1);
        g2d.fillRect(112 + x, 138 + y, 3, 1);
        g2d.fillRect(113 + x, 140 + y, 2, 1);
        g2d.fillRect(111 + x, 141 + y, 2, 1);
        g2d.fillRect(113 + x, 143 + y, 2, 1);
        g2d.fillRect(112 + x, 145 + y, 3, 1);
        g2d.fillRect(112 + x, 148 + y, 2, 1);
        g2d.fillRect(113 + x, 149 + y, 2, 1);
        g2d.fillRect(111 + x, 150 + y, 2, 1);
        g2d.fillRect(114 + x, 152 + y, 1, 2);
        g2d.fillRect(115 + x, 152 + y, 1, 1);
        g2d.fillRect(112 + x, 153 + y, 2, 1);
        g2d.fillRect(115 + x, 155 + y, 1, 1);
        g2d.fillRect(110 + x, 156 + y, 5, 1);
    }

    public void paintL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 132 + y, 2, 1);
        g2d.fillRect(106 + x, 133 + y, 1, 2);
        g2d.fillRect(107 + x, 133 + y, 3, 1);
        g2d.fillRect(113 + x, 133 + y, 1, 1);
        g2d.fillRect(105 + x, 134 + y, 1, 4);
        g2d.fillRect(112 + x, 135 + y, 2, 1);
        g2d.fillRect(106 + x, 136 + y, 1, 2);
        g2d.fillRect(111 + x, 136 + y, 1, 1);
        g2d.fillRect(113 + x, 136 + y, 1, 3);
        g2d.fillRect(106 + x, 139 + y, 1, 1);
        g2d.fillRect(112 + x, 139 + y, 1, 1);
        g2d.fillRect(114 + x, 139 + y, 1, 2);
        g2d.fillRect(109 + x, 140 + y, 1, 1);
        g2d.fillRect(106 + x, 141 + y, 1, 2);
        g2d.fillRect(113 + x, 141 + y, 1, 3);
        g2d.fillRect(107 + x, 142 + y, 1, 1);
        g2d.fillRect(114 + x, 142 + y, 1, 4);
        g2d.fillRect(110 + x, 143 + y, 1, 1);
        g2d.fillRect(113 + x, 146 + y, 1, 1);
        g2d.fillRect(107 + x, 147 + y, 1, 4);
        g2d.fillRect(108 + x, 147 + y, 1, 1);
        g2d.fillRect(114 + x, 147 + y, 1, 2);
        g2d.fillRect(109 + x, 148 + y, 3, 1);
        g2d.fillRect(115 + x, 149 + y, 1, 1);
        g2d.fillRect(108 + x, 150 + y, 1, 1);
        g2d.fillRect(114 + x, 150 + y, 1, 1);
        g2d.fillRect(113 + x, 151 + y, 1, 1);
        g2d.fillRect(115 + x, 151 + y, 1, 2);
        g2d.fillRect(114 + x, 152 + y, 1, 1);
        g2d.fillRect(116 + x, 152 + y, 1, 1);
        g2d.fillRect(109 + x, 153 + y, 1, 2);
        g2d.fillRect(110 + x, 153 + y, 1, 3);
        g2d.fillRect(111 + x, 153 + y, 3, 1);
        g2d.fillRect(116 + x, 154 + y, 1, 3);
        g2d.fillRect(108 + x, 156 + y, 1, 2);
        g2d.fillRect(109 + x, 158 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 133 + y, 1, 1);
        g2d.fillRect(107 + x, 134 + y, 3, 1);
        g2d.fillRect(112 + x, 134 + y, 2, 1);
        g2d.fillRect(106 + x, 135 + y, 1, 1);
        g2d.fillRect(107 + x, 137 + y, 5, 1);
        g2d.fillRect(106 + x, 138 + y, 1, 1);
        g2d.fillRect(108 + x, 138 + y, 2, 1);
        g2d.fillRect(113 + x, 139 + y, 1, 1);
        g2d.fillRect(107 + x, 140 + y, 1, 2);
        g2d.fillRect(108 + x, 140 + y, 1, 1);
        g2d.fillRect(110 + x, 140 + y, 2, 1);
        g2d.fillRect(111 + x, 144 + y, 3, 1);
        g2d.fillRect(107 + x, 146 + y, 1, 1);
        g2d.fillRect(114 + x, 146 + y, 1, 1);
        g2d.fillRect(113 + x, 147 + y, 1, 1);
        g2d.fillRect(108 + x, 148 + y, 1, 2);
        g2d.fillRect(112 + x, 148 + y, 1, 1);
        g2d.fillRect(109 + x, 149 + y, 1, 1);
        g2d.fillRect(108 + x, 151 + y, 1, 2);
        g2d.fillRect(109 + x, 152 + y, 1, 1);
        g2d.fillRect(114 + x, 153 + y, 1, 1);
        g2d.fillRect(108 + x, 155 + y, 2, 1);
        g2d.fillRect(113 + x, 155 + y, 1, 1);
        g2d.fillRect(109 + x, 157 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 133 + y, 1, 1);
        g2d.fillRect(107 + x, 135 + y, 2, 1);
        g2d.fillRect(112 + x, 136 + y, 1, 1);
        g2d.fillRect(107 + x, 138 + y, 1, 2);
        g2d.fillRect(112 + x, 138 + y, 1, 1);
        g2d.fillRect(108 + x, 139 + y, 1, 1);
        g2d.fillRect(110 + x, 139 + y, 2, 1);
        g2d.fillRect(108 + x, 141 + y, 1, 1);
        g2d.fillRect(112 + x, 141 + y, 1, 1);
        g2d.fillRect(112 + x, 143 + y, 1, 1);
        g2d.fillRect(109 + x, 144 + y, 2, 1);
        g2d.fillRect(111 + x, 145 + y, 2, 1);
        g2d.fillRect(110 + x, 149 + y, 2, 1);
        g2d.fillRect(113 + x, 150 + y, 1, 1);
        g2d.fillRect(109 + x, 151 + y, 4, 1);
        g2d.fillRect(115 + x, 153 + y, 1, 1);
        g2d.fillRect(115 + x, 156 + y, 1, 1);
        g2d.fillRect(114 + x, 157 + y, 1, 1);
        g2d.fillRect(111 + x, 158 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 133 + y, 1, 1);
        g2d.fillRect(111 + x, 134 + y, 1, 2);
        g2d.fillRect(109 + x, 135 + y, 1, 1);
        g2d.fillRect(107 + x, 136 + y, 2, 1);
        g2d.fillRect(110 + x, 136 + y, 1, 1);
        g2d.fillRect(111 + x, 138 + y, 1, 1);
        g2d.fillRect(109 + x, 139 + y, 1, 1);
        g2d.fillRect(112 + x, 140 + y, 2, 1);
        g2d.fillRect(109 + x, 141 + y, 1, 2);
        g2d.fillRect(110 + x, 141 + y, 2, 1);
        g2d.fillRect(108 + x, 142 + y, 1, 1);
        g2d.fillRect(112 + x, 142 + y, 1, 1);
        g2d.fillRect(106 + x, 143 + y, 1, 3);
        g2d.fillRect(107 + x, 143 + y, 1, 1);
        g2d.fillRect(111 + x, 143 + y, 1, 1);
        g2d.fillRect(108 + x, 144 + y, 1, 2);
        g2d.fillRect(107 + x, 145 + y, 1, 1);
        g2d.fillRect(109 + x, 145 + y, 1, 2);
        g2d.fillRect(110 + x, 145 + y, 1, 2);
        g2d.fillRect(113 + x, 145 + y, 1, 1);
        g2d.fillRect(111 + x, 146 + y, 2, 1);
        g2d.fillRect(112 + x, 149 + y, 1, 1);
        g2d.fillRect(114 + x, 149 + y, 1, 1);
        g2d.fillRect(109 + x, 150 + y, 2, 1);
        g2d.fillRect(115 + x, 150 + y, 1, 1);
        g2d.fillRect(114 + x, 151 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 2, 1);
        g2d.fillRect(111 + x, 154 + y, 1, 2);
        g2d.fillRect(112 + x, 154 + y, 1, 4);
        g2d.fillRect(113 + x, 154 + y, 2, 1);
        g2d.fillRect(115 + x, 155 + y, 1, 1);
        g2d.fillRect(109 + x, 156 + y, 2, 1);
        g2d.fillRect(111 + x, 157 + y, 1, 1);
        g2d.fillRect(113 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 134 + y, 1, 2);
        g2d.fillRect(109 + x, 136 + y, 1, 1);
        g2d.fillRect(112 + x, 137 + y, 1, 1);
        g2d.fillRect(110 + x, 138 + y, 1, 1);
        g2d.fillRect(110 + x, 142 + y, 2, 1);
        g2d.fillRect(108 + x, 143 + y, 2, 1);
        g2d.fillRect(107 + x, 144 + y, 1, 1);
        g2d.fillRect(108 + x, 146 + y, 1, 1);
        g2d.fillRect(109 + x, 147 + y, 4, 1);
        g2d.fillRect(113 + x, 148 + y, 1, 2);
        g2d.fillRect(111 + x, 150 + y, 2, 1);
        g2d.fillRect(112 + x, 152 + y, 2, 1);
        g2d.fillRect(115 + x, 154 + y, 1, 1);
        g2d.fillRect(114 + x, 155 + y, 1, 2);
        g2d.fillRect(111 + x, 156 + y, 1, 1);
        g2d.fillRect(113 + x, 156 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(102, 63, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(153, 63, 170));
        COLORS.set(ImageUtilities.GREY, new Color(153, 95, 170));
        COLORS.set(ImageUtilities.GREY_1, new Color(204, 127, 170));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 159, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
