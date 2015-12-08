/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 4:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.s;

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
public class S3 extends SuperS
{
    int location = 0;
    Piece right = new LittleBow1(3, true);
    Piece left =  new LittleBow1(3, false);

    /** Creates a new instance of Shoes1 */
    public S3()
    {
        super();
        setColors(COLORS);
        drs = true;
        sch = true;
        nurse = true;
    }

    public S3(ColorArray colorSwitch)
    {
        super(colorSwitch);
        setColors(colorSwitch);
        drs = true;
        sch = true;
        nurse = true;
    }

    public S3(int distanceFromTop)
    {
        super();
        location = distanceFromTop;
        setColors(COLORS);
        drs = true;
        sch = true;
        nurse = true;
    }

    public S3(int distanceFromTop, Piece r, Piece l)
    {
        super();
        right = r;
        left = l;
        location = distanceFromTop;
        setColors(COLORS);
        drs = true;
        sch = true;
        nurse = true;
    }

    public S3(int distanceFromTop, ColorArray colorSwitch)
    {
        super(colorSwitch);
        location = distanceFromTop;
        setColors(colorSwitch);
        drs = true;
        sch = true;
        nurse = true;
    }

    public S3(int distanceFromTop, Piece r, Piece l, ColorArray colorSwitch)
    {
        super(colorSwitch);
        right = r;
        left = l;
        location = distanceFromTop;
        drs = true;
        sch = true;
        nurse = true;
    }

    public void setColors(ColorArray COLORS)
    {
        super.setColors(COLORS);
        right.setColors(COLORS);
        left.setColors(COLORS);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((rightXpos - 7) + x, rightYpos - (5 - location), 8, 1);
        g2d.fillRect((rightXpos - 7) + x, rightYpos - 1, 2, 1);
        g2d.fillRect((rightXpos - 1) + x, rightYpos - 1, 2, 1);
        g2d.fillRect((rightXpos - 5) + x, rightYpos, 4, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((rightXpos - 5) + x, rightYpos - 1, 1, 1);
        g2d.fillRect((rightXpos - 2) + x, rightYpos - 1, 1, 1);

        right.paint((rightXpos) + x, rightYpos - (5 - location), g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((leftXpos) + x, leftYpos - (5 - location), 8, 1);
        g2d.fillRect((leftXpos + 6) + x, leftYpos - 1, 2, 1);
        g2d.fillRect((leftXpos) + x, leftYpos - 1, 2, 1);
        g2d.fillRect((leftXpos + 2) + x, leftYpos, 4, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((leftXpos + 5) + x, leftYpos - 1, 1, 1);
        g2d.fillRect((leftXpos + 2) + x, leftYpos - 1, 1, 1);

        left.paint((leftXpos) + x, leftYpos - (5 - location), g2d);
    }
}
