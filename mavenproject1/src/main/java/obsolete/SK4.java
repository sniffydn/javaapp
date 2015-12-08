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
public class SK4 extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public SK4()
    {
        super();
    }

    public SK4(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setColors(ColorArray COLORS)
    {
        super.setColors(COLORS.getNewColorArray());
        this.COLORS.brighter();
        this.COLORS.brighter();
        this.COLORS.brighter();
        this.COLORS.desaturate();
        this.COLORS.desaturate();
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;
        if(step == 0 || step == 8 || step == 9 || step == 10 || step == 11 || step == 12 || step == 13 || step == 14 || step == 15 || step == 16)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(2 + x + tempXpos, -49 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -48 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -46 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -45 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 4, 1);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -36 + tempYpos, 2, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(-2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(-4 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(-3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + x + tempXpos, -49 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -49 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -47 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -47 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -46 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -39 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -26 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(1 + x + tempXpos, -48 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -47 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -47 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -39 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -26 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(-6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -47 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -46 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(-2 + x + tempXpos, -38 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(0 + x + tempXpos, -49 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -49 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -48 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(-7 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
        else if(step == 1 || step == 7)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(3 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -46 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -45 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 4, 1);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -36 + tempYpos, 2, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(-2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(-4 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(-3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + x + tempXpos, -47 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -47 + tempYpos, 2, 1);
            g2d.fillRect(-4 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -46 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -46 + tempYpos, 2, 1);
            g2d.fillRect(3 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(-6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -45 + tempYpos, 2, 1);
            g2d.fillRect(2 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(-2 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(0 + x + tempXpos, -47 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 2, 1);
            g2d.fillRect(-3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(-7 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
        else if(step == 2 || step == 6)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(-3 + x + tempXpos, -46 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -46 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 4, 1);
            g2d.fillRect(4 + x + tempXpos, -44 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(-2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(-4 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(-3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 2, 1);
            g2d.fillRect(1 + x + tempXpos, -46 + tempYpos, 2, 1);
            g2d.fillRect(-4 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -36 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -31 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-2 + x + tempXpos, -45 + tempYpos, 3, 1);
            g2d.fillRect(2 + x + tempXpos, -44 + tempYpos, 2, 1);
            g2d.fillRect(3 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(-6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(-2 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(0 + x + tempXpos, -46 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 2, 1);
            g2d.fillRect(-3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(-7 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
        else if(step == 3 || step == 5)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(-3 + x + tempXpos, -43 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(-3 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(-2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(-4 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(-3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 3, 1);
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 2, 1);
            g2d.fillRect(3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -36 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-2 + x + tempXpos, -42 + tempYpos, 3, 1);
            g2d.fillRect(2 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(-6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -41 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(-2 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 2, 1);
            g2d.fillRect(2 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 2, 1);
            g2d.fillRect(-3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(-7 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
        else if(step == 4)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(-3 + x + tempXpos, -44 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 4, 1);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(-3 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(-2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(-4 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(-3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(2 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -36 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 2, 1);
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(-6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -42 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -42 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(-2 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 2, 1);
            g2d.fillRect(2 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 2, 1);
            g2d.fillRect(-3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(-7 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;
        if(step == 0 || step == 1 || step == 2 || step == 3 || step == 4 || step == 5 || step == 6 || step == 7 || step == 8)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(-2 + x + tempXpos, -49 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -48 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -46 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -45 + tempYpos, 1, 5);
            g2d.fillRect(4 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -44 + tempYpos, 4, 1);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -36 + tempYpos, 2, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(1 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(1 + x + tempXpos, -49 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -49 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -47 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -47 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -46 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -39 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -26 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-2 + x + tempXpos, -48 + tempYpos, 2, 1);
            g2d.fillRect(2 + x + tempXpos, -47 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -47 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -39 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -28 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -26 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(1 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -47 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -46 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(2 + x + tempXpos, -38 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(0 + x + tempXpos, -49 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -49 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -48 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
        else if(step == 9 || step == 15)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(-3 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -46 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -45 + tempYpos, 1, 5);
            g2d.fillRect(4 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -44 + tempYpos, 4, 1);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -36 + tempYpos, 2, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(1 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(1 + x + tempXpos, -47 + tempYpos, 3, 1);
            g2d.fillRect(-2 + x + tempXpos, -47 + tempYpos, 2, 1);
            g2d.fillRect(4 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(2 + x + tempXpos, -46 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -46 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 2, 1);
            g2d.fillRect(-3 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(0 + x + tempXpos, -45 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(2 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(0 + x + tempXpos, -47 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 2, 1);
            g2d.fillRect(3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
        else if(step == 10 || step == 14)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(3 + x + tempXpos, -46 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -46 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -44 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -44 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(1 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(1 + x + tempXpos, -46 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 2, 1);
            g2d.fillRect(4 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -36 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -31 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -45 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -44 + tempYpos, 2, 1);
            g2d.fillRect(-3 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(2 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(0 + x + tempXpos, -46 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -45 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 2, 1);
            g2d.fillRect(3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
        else if(step == 11 || step == 13)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(3 + x + tempXpos, -43 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(1 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(0 + x + tempXpos, -43 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -43 + tempYpos, 2, 1);
            g2d.fillRect(-3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -36 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -42 + tempYpos, 3, 1);
            g2d.fillRect(-2 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -41 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(2 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 2, 1);
            g2d.fillRect(3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
        else if(step == 12)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(3 + x + tempXpos, -44 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -44 + tempYpos, 4, 1);
            g2d.fillRect(2 + x + tempXpos, -41 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -38 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(0 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -36 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -28 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -22 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -20 + tempYpos, 4, 1);
            g2d.fillRect(2 + x + tempXpos, -18 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -13 + tempYpos, 4, 1);
            g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -7 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 2, 1);
            g2d.fillRect(1 + x + tempXpos, -5 + tempYpos, 4, 1);
            g2d.fillRect(4 + x + tempXpos, -2 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(3 + x + tempXpos, -42 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -3 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -36 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -31 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -24 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -23 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -18 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(6 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, 0 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -43 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -40 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -39 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -27 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(0 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -16 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -12 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -9 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -8 + tempYpos, 2, 1);
            g2d.fillRect(6 + x + tempXpos, -4 + tempYpos, 1, 3);
            g2d.fillRect(5 + x + tempXpos, -2 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -2 + tempYpos, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(1 + x + tempXpos, -42 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -42 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -39 + tempYpos, 3, 1);
            g2d.fillRect(2 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -38 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -32 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -28 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -23 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -19 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -16 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -15 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -4 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -41 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -40 + tempYpos, 3, 1);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(-4 + x + tempXpos, -34 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 2, 1);
            g2d.fillRect(3 + x + tempXpos, -32 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -29 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -27 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 4);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 3, 1);
            g2d.fillRect(-1 + x + tempXpos, -21 + tempYpos, 1, 1);
            g2d.fillRect(-1 + x + tempXpos, -19 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 2, 1);
            g2d.fillRect(-1 + x + tempXpos, -17 + tempYpos, 3, 1);
            g2d.fillRect(3 + x + tempXpos, -12 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -10 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -10 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -9 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -6 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -4 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 3, 1);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 3, 1);
        }
    }
}
