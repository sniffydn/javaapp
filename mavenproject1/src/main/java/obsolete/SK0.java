/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 4:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.SuperS;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class SK0 extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public SK0()
    {
        super();
    }

    public SK0(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;
        if(step == 0 || step == 9 || step == 8 || step == 15)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(0 + x + tempXpos, -71 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -71 + tempYpos, 7, 1);
            g2d.fillRect(8 + x + tempXpos, -70 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(1 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(7 + x + tempXpos, -70 + tempYpos, 1, 2);
        }
        else if(step == 10 || step == 14)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -71 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -71 + tempYpos, 7, 1);
            g2d.fillRect(7 + x + tempXpos, -70 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -70 + tempYpos, 1, 2);
        }
        else if(step == 11 || step == 12 || step == 13)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -71 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -71 + tempYpos, 7, 1);
            g2d.fillRect(6 + x + tempXpos, -70 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-1 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -70 + tempYpos, 1, 2);
        }
        else if(step == 1 || step == 7)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -67 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -67 + tempYpos, 7, 1);
            g2d.fillRect(7 + x + tempXpos, -66 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -66 + tempYpos, 1, 2);
        }
        else if(step == 2 || step == 6)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -63 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -63 + tempYpos, 7, 1);
            g2d.fillRect(7 + x + tempXpos, -62 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -62 + tempYpos, 1, 2);
        }
        else if(step == 3 || step == 5)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -57 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -57 + tempYpos, 7, 1);
            g2d.fillRect(6 + x + tempXpos, -56 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-1 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -56 + tempYpos, 1, 2);
        }
        else if(step == 4)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + x + tempXpos, -53 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -53 + tempYpos, 7, 1);
            g2d.fillRect(5 + x + tempXpos, -52 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -51 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -51 + tempYpos, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-2 + x + tempXpos, -52 + tempYpos, 7, 1);
            g2d.fillRect(-1 + x + tempXpos, -51 + tempYpos, 4, 1);
            g2d.fillRect(-2 + x + tempXpos, -51 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -51 + tempYpos, 2, 1);
        }
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        if(step == 0 || step == 1 || step == 7 || step == 8)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-7 + x + tempXpos, -71 + tempYpos, 8, 1);
            g2d.fillRect(-8 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -70 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-7 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-6 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-5 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -70 + tempYpos, 1, 2);
        }
        else if(step == 2 || step == 6)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-6 + x + tempXpos, -71 + tempYpos, 8, 1);
            g2d.fillRect(-7 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -70 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-5 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -70 + tempYpos, 1, 2);
        }
        else if(step == 3 || step == 4 || step == 5)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-5 + x + tempXpos, -71 + tempYpos, 8, 1);
            g2d.fillRect(-6 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -70 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-5 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -70 + tempYpos, 1, 2);
        }
        else if(step == 9 || step == 15)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-6 + x + tempXpos, -67 + tempYpos, 8, 1);
            g2d.fillRect(-7 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -66 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(-5 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -66 + tempYpos, 1, 2);
        }
        else if(step == 10 || step == 14)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-6 + x + tempXpos, -63 + tempYpos, 8, 1);
            g2d.fillRect(-7 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -62 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(-5 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -62 + tempYpos, 1, 2);
        }
        else if(step == 11 || step == 13)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-5 + x + tempXpos, -57 + tempYpos, 8, 1);
            g2d.fillRect(-6 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -56 + tempYpos, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-5 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -56 + tempYpos, 1, 2);
        }
        else if(step == 12)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-4 + x + tempXpos, -53 + tempYpos, 8, 1);
            g2d.fillRect(-5 + x + tempXpos, -52 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -52 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -51 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -51 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-4 + x + tempXpos, -52 + tempYpos, 7, 1);
            g2d.fillRect(-2 + x + tempXpos, -51 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -51 + tempYpos, 2, 1);
            g2d.fillRect(2 + x + tempXpos, -51 + tempYpos, 1, 1);
        }
    }
}
