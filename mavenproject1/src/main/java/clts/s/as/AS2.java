/*
 * AnkleStrap1.java
 *
 * Created on March 6, 2007, 9:10 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.as;

import clts.SuperS;
import util.GraphicsMap;
import pieces.p.LittleBow1;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class AS2 extends SuperS
{
    int location = 0;
    Piece right = null;
    Piece left = null;
    /** Creates a new instance of AnkleStrap0 */
    public AS2()
    {
        super();
        right = new LittleBow1(5, true, COLORS);
        left = new LittleBow1(5, false, COLORS);
        strap = true;
        notSlenderS = true;
    }

    public AS2(ColorArray colorSwitch)
    {
        super(colorSwitch);
        right = new LittleBow1(5, true, COLORS);
        left = new LittleBow1(5, false, COLORS);
        strap = true;
        notSlenderS = true;
    }

    public AS2(int distanceFromTop)
    {
        super();
        location = distanceFromTop;
        right = new LittleBow1(5, true, COLORS);
        left = new LittleBow1(5, false, COLORS);
        strap = true;
        notSlenderS = true;
    }

    public AS2(int distanceFromTop, Piece r, Piece l)
    {
        super();
        location = distanceFromTop;
        right = r;
        left = l;
        strap = true;
        notSlenderS = true;
    }

    public AS2(int distanceFromTop, ColorArray colorSwitch)
    {
        super(colorSwitch);
        location = distanceFromTop;
        right = new LittleBow1(5, true, COLORS);
        left = new LittleBow1(5, false, COLORS);
        strap = true;
        notSlenderS = true;
    }

    public AS2(int distanceFromTop, Piece r, Piece l, ColorArray colorSwitch)
    {
        super(colorSwitch);
        location = distanceFromTop;
        right = r;
        left = l;
        strap = true;
        notSlenderS = true;
    }

    public int getDistance()
    {
        return location;
    }

    public void setDistance(int location)
    {
        this.location = location;
    }

    public void setColors(ColorArray COLORS)
    {
        super.setColors(COLORS);
        left.setColors(COLORS);
        right.setColors(COLORS);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((rightXpos - 5) + x, rightYpos - (15 - location), 2, 1);
        g2d.fillRect((rightXpos - 1) + x, rightYpos - (15 - location), 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((rightXpos - 3) + x, rightYpos - (15 - location), 2, 1);

        right.paint((rightXpos + 1) + x, rightYpos - (15 - location), g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((leftXpos) + x, leftYpos - (15 - location), 2, 1);
        g2d.fillRect((leftXpos + 4) + x, leftYpos - (15 - location), 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((leftXpos + 2) + x, leftYpos - (15 - location), 2, 1);

        left.paint((leftXpos - 1) + x, leftYpos - (15 - location), g2d);
    }
}
