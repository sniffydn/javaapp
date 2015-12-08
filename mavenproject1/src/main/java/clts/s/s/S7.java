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
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class S7 extends SuperS
{
    int location = 0;
    /** Creates a new instance of Shoes1 */
    public S7()
    {
        super();
        strapAllowed = false;
        drs = true;
        sch = true;
        nurse = true;
        police = true;
    }

    public S7(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
        drs = true;
        sch = true;
        nurse = true;
        police = true;
    }

    public S7(int distanceFromTop)
    {
        super();
        location = distanceFromTop;
        strapAllowed = false;
        drs = true;
        sch = true;
        nurse = true;
        police = true;
    }

    public S7(int distanceFromTop,ColorArray colorSwitch)
    {
        super(colorSwitch);
        location = distanceFromTop;
        strapAllowed = false;
        drs = true;
        sch = true;
        nurse = true;
        police = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((tempXpos - 6) + x, tempYpos, 6, 1);
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 1, 8, 1);
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 2, 8, 1);
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 3, 2, 1);
        g2d.fillRect((tempXpos - 1) + x, tempYpos - 3, 2, 1);


        g2d.fillRect((tempXpos - 4) + x, tempYpos - (8 - location), 3, 1);



        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 4, 1, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 4, 1, 1);
        g2d.fillRect((tempXpos - 5) + x, tempYpos - (8 - location), 1, 1);
        g2d.fillRect((tempXpos - 1) + x, tempYpos - (8 - location), 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 5, 1, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 5, 1, 1);
        g2d.fillRect((tempXpos - 6) + x, tempYpos - (8 - location), 1, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - (8 - location), 1, 1);

    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((tempXpos + 1) + x, tempYpos, 6, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 1, 8, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 2, 8, 1);
        g2d.fillRect((tempXpos + 6) + x, tempYpos - 3, 2, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 3, 2, 1);


        g2d.fillRect((tempXpos + 2) + x, tempYpos - (8 - location), 3, 1);



        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((tempXpos + 7) + x, tempYpos - 4, 1, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 4, 1, 1);
        g2d.fillRect((tempXpos + 5) + x, tempYpos - (8 - location), 1, 1);
        g2d.fillRect((tempXpos + 1) + x, tempYpos - (8 - location), 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect((tempXpos + 7) + x, tempYpos - 5, 1, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 5, 1, 1);
        g2d.fillRect((tempXpos + 6) + x, tempYpos - (8 - location), 1, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - (8 - location), 1, 1);
    }
}
