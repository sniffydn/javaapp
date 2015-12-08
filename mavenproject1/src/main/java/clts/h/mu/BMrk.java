/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.h.mu;

import clts.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class BMrk extends SuperTL {

    int direction = 0;
    {
        includeInAutoPick = false;
    }

    public BMrk() {
        super();
    }

    public BMrk(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm, int eye) {
        step = s;
        this.direction = direction;
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintBack(offsetX, offsetY, g2d);
        if (direction == 1) {
            paintH(offsetX, 0, g2d);
        } else {
            paintBackH(offsetX, 0, g2d);
        }
    }

    public void paintH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 32 + y, 1, 1);
    }

    public void paintBackH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 32 + y, 1, 1);
    }
}
