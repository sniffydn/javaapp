/*
 * LittleBow1.java
 *
 * Created on March 6, 2007, 9:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.a;

import clts.SuperTL;
import util.ColorArray;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class NL3 extends SuperTL {

    public NL3() {
        super();
    }

    public NL3(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 40 + y, 4, 1);
        g2d.fillRect(109 + x, 40 + y, 2, 1);
        g2d.fillRect(108 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 40 + y, 1, 1);
        g2d.fillRect(107 + x, 41 + y, 1, 1);
        g2d.fillRect(109 + x, 41 + y, 1, 1);
        g2d.fillRect(108 + x, 42 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintFront(offsetX, offsetY, g2d);
        draw(offsetX, 0, g2d);
    }
}
