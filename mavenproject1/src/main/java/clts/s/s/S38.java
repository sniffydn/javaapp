/*
 * Shoes0.java
 *
 * Created on March 6, 2007, 8:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.s;

import clts.SuperS;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class S38 extends SuperS
{

    /** Creates a new instance of Shoes0 */
    public S38()
    {
        super();
        platzHeight = 0;
    }

    public S38(ColorArray colorSwitch)
    {
        super(colorSwitch);
        platzHeight = 0;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;
        
        paintH(x + tempXpos, tempYpos, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;
        
        paintBackH(x + tempXpos, tempYpos, g2d);
    }
    
    
    
    public void paintH(int x, int y, GraphicsMap g2d)
    {

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(2 + x, -28 + y, 1, 6);
        g2d.fillRect(-4 + x, -26 + y, 1, 4);
        g2d.fillRect(1 + x, -26 + y, 1, 1);
        g2d.fillRect(-3 + x, -25 + y, 4, 1);
        g2d.fillRect(-2 + x, -21 + y, 4, 1);
        g2d.fillRect(-5 + x, -20 + y, 2, 1);
        g2d.fillRect(1 + x, -20 + y, 2, 1);
        g2d.fillRect(-3 + x, -19 + y, 2, 1);
        g2d.fillRect(-1 + x, -18 + y, 3, 1);
        g2d.fillRect(1 + x, -17 + y, 2, 1);
        g2d.fillRect(-4 + x, -16 + y, 2, 1);
        g2d.fillRect(2 + x, -16 + y, 1, 1);
        g2d.fillRect(-3 + x, -15 + y, 1, 3);
        g2d.fillRect(-2 + x, -15 + y, 1, 2);
        g2d.fillRect(-1 + x, -14 + y, 2, 1);
        g2d.fillRect(-5 + x, -13 + y, 2, 1);
        g2d.fillRect(0 + x, -13 + y, 2, 1);
        g2d.fillRect(1 + x, -12 + y, 1, 1);
        g2d.fillRect(-3 + x, -11 + y, 3, 1);
        g2d.fillRect(-6 + x, -10 + y, 2, 1);
        g2d.fillRect(-1 + x, -10 + y, 1, 3);
        g2d.fillRect(-4 + x, -9 + y, 3, 1);
        g2d.fillRect(0 + x, -9 + y, 1, 2);
        g2d.fillRect(-6 + x, -8 + y, 2, 1);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(-4 + x, -7 + y, 1, 1);
        g2d.fillRect(-6 + x, -6 + y, 1, 3);
        g2d.fillRect(-5 + x, -6 + y, 1, 1);
        g2d.fillRect(-3 + x, -6 + y, 1, 1);
        g2d.fillRect(-1 + x, -6 + y, 1, 1);
        g2d.fillRect(1 + x, -5 + y, 1, 2);
        g2d.fillRect(-7 + x, -4 + y, 1, 5);
        g2d.fillRect(-4 + x, -3 + y, 4, 1);
        g2d.fillRect(-6 + x, -2 + y, 2, 1);
        g2d.fillRect(0 + x, -2 + y, 2, 1);
        g2d.fillRect(-6 + x, 0 + y, 8, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(1 + x, -25 + y, 1, 3);
        g2d.fillRect(-3 + x, -24 + y, 4, 1);
        g2d.fillRect(0 + x, -23 + y, 1, 1);
        g2d.fillRect(-4 + x, -6 + y, 1, 2);
        g2d.fillRect(-2 + x, -6 + y, 1, 1);
        g2d.fillRect(0 + x, -6 + y, 1, 4);
        g2d.fillRect(-5 + x, -5 + y, 1, 3);
        g2d.fillRect(-6 + x, -3 + y, 1, 1);
        g2d.fillRect(1 + x, -3 + y, 1, 1);
        g2d.fillRect(-4 + x, -2 + y, 1, 1);
        g2d.fillRect(-1 + x, -2 + y, 1, 1);
        g2d.fillRect(-6 + x, -1 + y, 1, 1);
        g2d.fillRect(1 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(-1 + x, -27 + y, 1, 2);
        g2d.fillRect(0 + x, -27 + y, 1, 2);
        g2d.fillRect(1 + x, -27 + y, 1, 1);
        g2d.fillRect(-2 + x, -26 + y, 1, 1);
        g2d.fillRect(-3 + x, -23 + y, 1, 1);
        g2d.fillRect(-1 + x, -23 + y, 1, 1);
        g2d.fillRect(-3 + x, -5 + y, 1, 1);
        g2d.fillRect(-1 + x, -5 + y, 1, 2);
        g2d.fillRect(-4 + x, -4 + y, 1, 1);
        g2d.fillRect(-2 + x, -4 + y, 1, 1);
        g2d.fillRect(-5 + x, -1 + y, 1, 1);
        g2d.fillRect(0 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-2 + x, -23 + y, 1, 1);
        g2d.fillRect(-2 + x, -5 + y, 1, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 1);
        g2d.fillRect(-4 + x, -1 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-3 + x, -2 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-4 + x, -22 + y, 7, 1);
        g2d.fillRect(-1 + x, -19 + y, 1, 1);
        g2d.fillRect(-5 + x, -18 + y, 1, 1);
        g2d.fillRect(-2 + x, -18 + y, 1, 1);
        g2d.fillRect(-6 + x, -15 + y, 2, 1);
        g2d.fillRect(-1 + x, -15 + y, 1, 1);
        g2d.fillRect(1 + x, -15 + y, 2, 1);
        g2d.fillRect(-6 + x, -13 + y, 1, 1);
        g2d.fillRect(0 + x, -11 + y, 2, 1);
        g2d.fillRect(-6 + x, -7 + y, 2, 1);
        g2d.fillRect(-3 + x, -7 + y, 4, 1);
        g2d.fillRect(-7 + x, -5 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-6 + x, -20 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(-5 + x, -22 + y, 1, 2);
        g2d.fillRect(-4 + x, -21 + y, 2, 1);
        g2d.fillRect(2 + x, -21 + y, 1, 1);
        g2d.fillRect(-4 + x, -18 + y, 2, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 1);
        g2d.fillRect(0 + x, -15 + y, 1, 1);
        g2d.fillRect(-6 + x, -14 + y, 1, 1);
        g2d.fillRect(-2 + x, -13 + y, 1, 1);
        g2d.fillRect(-6 + x, -9 + y, 1, 1);
        g2d.fillRect(-4 + x, -8 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(-3 + x, -20 + y, 4, 1);
        g2d.fillRect(-5 + x, -19 + y, 2, 1);
        g2d.fillRect(0 + x, -19 + y, 3, 1);
        g2d.fillRect(2 + x, -18 + y, 1, 1);
        g2d.fillRect(-5 + x, -17 + y, 1, 2);
        g2d.fillRect(-2 + x, -16 + y, 1, 1);
        g2d.fillRect(0 + x, -16 + y, 2, 1);
        g2d.fillRect(-4 + x, -15 + y, 1, 1);
        g2d.fillRect(-5 + x, -14 + y, 1, 1);
        g2d.fillRect(1 + x, -14 + y, 1, 1);
        g2d.fillRect(-1 + x, -13 + y, 1, 1);
        g2d.fillRect(-5 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -12 + y, 1, 1);
        g2d.fillRect(-4 + x, -11 + y, 1, 1);
        g2d.fillRect(0 + x, -10 + y, 2, 1);
        g2d.fillRect(-5 + x, -9 + y, 1, 1);
        g2d.fillRect(1 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(-4 + x, -17 + y, 5, 1);
        g2d.fillRect(-4 + x, -14 + y, 1, 1);
        g2d.fillRect(-4 + x, -12 + y, 4, 1);
        g2d.fillRect(-4 + x, -10 + y, 3, 1);
    }





    public void paintBackH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(-2 + x, -28 + y, 1, 6);
        g2d.fillRect(4 + x, -26 + y, 1, 4);
        g2d.fillRect(-1 + x, -26 + y, 1, 1);
        g2d.fillRect(0 + x, -25 + y, 4, 1);
        g2d.fillRect(-1 + x, -21 + y, 4, 1);
        g2d.fillRect(4 + x, -20 + y, 2, 1);
        g2d.fillRect(-2 + x, -20 + y, 2, 1);
        g2d.fillRect(2 + x, -19 + y, 2, 1);
        g2d.fillRect(-1 + x, -18 + y, 3, 1);
        g2d.fillRect(-2 + x, -17 + y, 2, 1);
        g2d.fillRect(3 + x, -16 + y, 2, 1);
        g2d.fillRect(-2 + x, -16 + y, 1, 1);
        g2d.fillRect(3 + x, -15 + y, 1, 3);
        g2d.fillRect(2 + x, -15 + y, 1, 2);
        g2d.fillRect(0 + x, -14 + y, 2, 1);
        g2d.fillRect(4 + x, -13 + y, 2, 1);
        g2d.fillRect(-1 + x, -13 + y, 2, 1);
        g2d.fillRect(-1 + x, -12 + y, 1, 1);
        g2d.fillRect(1 + x, -11 + y, 3, 1);
        g2d.fillRect(5 + x, -10 + y, 2, 1);
        g2d.fillRect(1 + x, -10 + y, 1, 3);
        g2d.fillRect(2 + x, -9 + y, 3, 1);
        g2d.fillRect(0 + x, -9 + y, 1, 2);
        g2d.fillRect(5 + x, -8 + y, 2, 1);
        g2d.fillRect(-1 + x, -8 + y, 1, 2);
        g2d.fillRect(4 + x, -7 + y, 1, 1);
        g2d.fillRect(6 + x, -6 + y, 1, 3);
        g2d.fillRect(5 + x, -6 + y, 1, 1);
        g2d.fillRect(3 + x, -6 + y, 1, 1);
        g2d.fillRect(1 + x, -6 + y, 1, 1);
        g2d.fillRect(-1 + x, -5 + y, 1, 2);
        g2d.fillRect(7 + x, -4 + y, 1, 5);
        g2d.fillRect(1 + x, -3 + y, 4, 1);
        g2d.fillRect(5 + x, -2 + y, 2, 1);
        g2d.fillRect(-1 + x, -2 + y, 2, 1);
        g2d.fillRect(-1 + x, 0 + y, 8, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(-1 + x, -25 + y, 1, 3);
        g2d.fillRect(0 + x, -24 + y, 4, 1);
        g2d.fillRect(0 + x, -23 + y, 1, 1);
        g2d.fillRect(4 + x, -6 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 1);
        g2d.fillRect(0 + x, -6 + y, 1, 4);
        g2d.fillRect(5 + x, -5 + y, 1, 3);
        g2d.fillRect(6 + x, -3 + y, 1, 1);
        g2d.fillRect(-1 + x, -3 + y, 1, 1);
        g2d.fillRect(4 + x, -2 + y, 1, 1);
        g2d.fillRect(1 + x, -2 + y, 1, 1);
        g2d.fillRect(6 + x, -1 + y, 1, 1);
        g2d.fillRect(-1 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(1 + x, -27 + y, 1, 2);
        g2d.fillRect(0 + x, -27 + y, 1, 2);
        g2d.fillRect(-1 + x, -27 + y, 1, 1);
        g2d.fillRect(2 + x, -26 + y, 1, 1);
        g2d.fillRect(3 + x, -23 + y, 1, 1);
        g2d.fillRect(1 + x, -23 + y, 1, 1);
        g2d.fillRect(3 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -5 + y, 1, 2);
        g2d.fillRect(4 + x, -4 + y, 1, 1);
        g2d.fillRect(2 + x, -4 + y, 1, 1);
        g2d.fillRect(5 + x, -1 + y, 1, 1);
        g2d.fillRect(0 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(2 + x, -23 + y, 1, 1);
        g2d.fillRect(2 + x, -5 + y, 1, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 1);
        g2d.fillRect(1 + x, -1 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(2 + x, -2 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-2 + x, -22 + y, 7, 1);
        g2d.fillRect(1 + x, -19 + y, 1, 1);
        g2d.fillRect(5 + x, -18 + y, 1, 1);
        g2d.fillRect(2 + x, -18 + y, 1, 1);
        g2d.fillRect(5 + x, -15 + y, 2, 1);
        g2d.fillRect(1 + x, -15 + y, 1, 1);
        g2d.fillRect(-2 + x, -15 + y, 2, 1);
        g2d.fillRect(6 + x, -13 + y, 1, 1);
        g2d.fillRect(-1 + x, -11 + y, 2, 1);
        g2d.fillRect(5 + x, -7 + y, 2, 1);
        g2d.fillRect(0 + x, -7 + y, 4, 1);
        g2d.fillRect(7 + x, -5 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(6 + x, -20 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(5 + x, -22 + y, 1, 2);
        g2d.fillRect(3 + x, -21 + y, 2, 1);
        g2d.fillRect(-2 + x, -21 + y, 1, 1);
        g2d.fillRect(3 + x, -18 + y, 2, 1);
        g2d.fillRect(1 + x, -16 + y, 1, 1);
        g2d.fillRect(0 + x, -15 + y, 1, 1);
        g2d.fillRect(6 + x, -14 + y, 1, 1);
        g2d.fillRect(2 + x, -13 + y, 1, 1);
        g2d.fillRect(6 + x, -9 + y, 1, 1);
        g2d.fillRect(2 + x, -8 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(0 + x, -20 + y, 4, 1);
        g2d.fillRect(4 + x, -19 + y, 2, 1);
        g2d.fillRect(-2 + x, -19 + y, 3, 1);
        g2d.fillRect(-2 + x, -18 + y, 1, 1);
        g2d.fillRect(5 + x, -17 + y, 1, 2);
        g2d.fillRect(2 + x, -16 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 2, 1);
        g2d.fillRect(4 + x, -15 + y, 1, 1);
        g2d.fillRect(5 + x, -14 + y, 1, 1);
        g2d.fillRect(-1 + x, -14 + y, 1, 1);
        g2d.fillRect(1 + x, -13 + y, 1, 1);
        g2d.fillRect(5 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -12 + y, 1, 1);
        g2d.fillRect(4 + x, -11 + y, 1, 1);
        g2d.fillRect(-1 + x, -10 + y, 2, 1);
        g2d.fillRect(5 + x, -9 + y, 1, 1);
        g2d.fillRect(-1 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(0 + x, -17 + y, 5, 1);
        g2d.fillRect(4 + x, -14 + y, 1, 1);
        g2d.fillRect(1 + x, -12 + y, 4, 1);
        g2d.fillRect(2 + x, -10 + y, 3, 1);
    }
}
