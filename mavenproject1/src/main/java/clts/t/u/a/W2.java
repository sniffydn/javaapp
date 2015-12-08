/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperB;
import clts.SuperC;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import pieces.clts.*;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class W2 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public W2()
    {
        super();
        includeY = true;
    }

    public W2(int layer)
    {
        super(layer);
        includeY = true;
    }

    public W2(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public W2(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryBack(offsetX, offsetY, g2d);
        if(!isIncludeY())
            offsetY = 0;
        paintW(offsetX, offsetY, g2d);
    }

    public void paintW(int x, int y, GraphicsMap g2d)
    {
        clts.t.u.a.w.W2Grey.paintW(COLORS.get(ImageUtilities.GREY), x, y, g2d);
        clts.t.u.a.w.W2Grey1.paintW(COLORS.get(ImageUtilities.GREY_1), x, y, g2d);
        clts.t.u.a.w.W2Grey2.paintW(COLORS.get(ImageUtilities.GREY_2), x, y, g2d);
        clts.t.u.a.w.W2Grey3.paintW(COLORS.get(ImageUtilities.GREY_3), x, y, g2d);
        clts.t.u.a.w.W2Grey4.paintW(COLORS.get(ImageUtilities.GREY_4), x, y, g2d);
        clts.t.u.a.w.W2Grey5.paintW(COLORS.get(ImageUtilities.GREY_5), x, y, g2d);

        clts.t.u.a.w.W2NegGrey1.paintW(COLORS.get(ImageUtilities.NEG_GREY_1), x, y, g2d);
        clts.t.u.a.w.W2NegGrey2.paintW(COLORS.get(ImageUtilities.NEG_GREY_2), x, y, g2d);
        clts.t.u.a.w.W2NegGrey3.paintW(COLORS.get(ImageUtilities.NEG_GREY_3), x, y, g2d);
        clts.t.u.a.w.W2NegGrey4.paintW(COLORS.get(ImageUtilities.NEG_GREY_4), x, y, g2d);
        clts.t.u.a.w.W2NegGrey5.paintW(COLORS.get(ImageUtilities.NEG_GREY_5), x, y, g2d);
        clts.t.u.a.w.W2NegGrey6.paintW(COLORS.get(ImageUtilities.NEG_GREY_6), x, y, g2d);
    }
}
