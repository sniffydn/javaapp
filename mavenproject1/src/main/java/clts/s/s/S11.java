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
public class S11 extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public S11()
    {
        super();
        strapAllowed = false;
    }

    public S11(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;
        if(step == 0 || step == 8 || step == 9 || step == 10 || step == 11 || step == 12 || step == 13 || step == 14 || step == 15 || step == 16)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(3 + tempXpos + x, tempYpos -45, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -44, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -44, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -43, 1, 2);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -43, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -42, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -41, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -41, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -38, 1, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -38, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -37, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -37, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -36, 3, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -35, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -35, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -31, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -27, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -27, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -25, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -25, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -22, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -22, 1, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -21, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -20, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -20, 1, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -18, 1, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -17, 1, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -17, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -16, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -11, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(-6 + tempXpos + x, tempYpos -7, 1, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -5, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(-7 + tempXpos + x, tempYpos -3, 2, 1);
            g2d.fillRect(-7 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(0 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(-6 + tempXpos + x, tempYpos + 0, 6, 1);
        }
        else if(step == 1 || step == 7)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(3 + tempXpos + x, tempYpos -44, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -43, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -43, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -42, 1, 2);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -42, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -41, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -37, 1, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -37, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -36, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -36, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -35, 3, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -34, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -34, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -31, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -27, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -27, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -25, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -25, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -22, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -22, 1, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -21, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -20, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -20, 1, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -18, 1, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -17, 1, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -17, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -16, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -11, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(-6 + tempXpos + x, tempYpos -7, 1, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -5, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(-7 + tempXpos + x, tempYpos -3, 2, 1);
            g2d.fillRect(-7 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(0 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(-6 + tempXpos + x, tempYpos + 0, 6, 1);
        }
        else if(step == 2 || step == 6)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(3 + tempXpos + x, tempYpos -43, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -42, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -42, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -41, 1, 2);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -41, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -39, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -39, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -36, 1, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -36, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -35, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -35, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -34, 3, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -33, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -33, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -31, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -31, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -29, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -29, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -25, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -24, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -24, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -22, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -22, 1, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -21, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -20, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -20, 1, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -18, 1, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -17, 1, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -17, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -16, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -11, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(-6 + tempXpos + x, tempYpos -7, 1, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -5, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(-7 + tempXpos + x, tempYpos -3, 2, 1);
            g2d.fillRect(-7 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(0 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(-6 + tempXpos + x, tempYpos + 0, 6, 1);
        }
        else if(step == 3 || step == 4 || step == 5)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(3 + tempXpos + x, tempYpos -41, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -39, 1, 2);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -39, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -38, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -37, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -37, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -35, 1, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -35, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -34, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -34, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -33, 3, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -29, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -28, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -28, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -25, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -24, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -24, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -22, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -22, 1, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -21, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -20, 2, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -20, 1, 1);
            g2d.fillRect(1 + tempXpos + x, tempYpos -18, 1, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -17, 1, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -17, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -16, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -11, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(-6 + tempXpos + x, tempYpos -7, 1, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -5, 2, 1);
            g2d.fillRect(-5 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(-7 + tempXpos + x, tempYpos -3, 2, 1);
            g2d.fillRect(-7 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(0 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(-6 + tempXpos + x, tempYpos + 0, 6, 1);
        }
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;


        if(step == 0 || step == 1 || step == 2 || step == 3 || step == 4 || step == 5 || step == 6 || step == 7 || step == 8)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-4 + tempXpos + x, tempYpos -45, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -44, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -44, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -43, 3, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -42, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -42, 1, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -41, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -41, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -38, 1, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -38, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -37, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -37, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -36, 3, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -35, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -35, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -31, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -27, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -27, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -25, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -25, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -22, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -22, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -21, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -20, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -20, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -18, 1, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -17, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -17, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -16, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -11, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(6 + tempXpos + x, tempYpos -7, 1, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -5, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(6 + tempXpos + x, tempYpos -3, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(7 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(1 + tempXpos + x, tempYpos + 0, 6, 1);
        }
        else if(step == 9 || step == 15)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-4 + tempXpos + x, tempYpos -44, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -43, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -43, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -42, 3, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -41, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -41, 1, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -37, 1, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -37, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -36, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -36, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -35, 3, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -34, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -34, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -31, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -27, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -27, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -25, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -25, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -22, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -22, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -21, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -20, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -20, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -18, 1, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -17, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -17, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -16, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -11, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(6 + tempXpos + x, tempYpos -7, 1, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -5, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(6 + tempXpos + x, tempYpos -3, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(7 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(1 + tempXpos + x, tempYpos + 0, 6, 1);
        }
        else if(step == 10 || step == 14)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-4 + tempXpos + x, tempYpos -43, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -42, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -42, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -41, 3, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -40, 1, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -39, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -39, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -36, 1, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -36, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -35, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -35, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -34, 3, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -33, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -33, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -31, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -31, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -29, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -29, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -25, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -24, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -24, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -22, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -22, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -21, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -20, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -20, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -18, 1, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -17, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -17, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -16, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -11, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(6 + tempXpos + x, tempYpos -7, 1, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -5, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(6 + tempXpos + x, tempYpos -3, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(7 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(1 + tempXpos + x, tempYpos + 0, 6, 1);
        }
        else if(step == 11 || step == 12 || step == 13)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-4 + tempXpos + x, tempYpos -41, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -40, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -39, 3, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -38, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -38, 1, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -37, 2, 1);
            g2d.fillRect(3 + tempXpos + x, tempYpos -37, 2, 1);
            g2d.fillRect(-4 + tempXpos + x, tempYpos -35, 1, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -35, 1, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -34, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -34, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -33, 3, 1);
            g2d.fillRect(-3 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -32, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -30, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -29, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -28, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -28, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -26, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -25, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -24, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -24, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -22, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -22, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -21, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -20, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -20, 2, 1);
            g2d.fillRect(-1 + tempXpos + x, tempYpos -18, 1, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -17, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -17, 1, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -16, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -15, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -12, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -11, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -10, 2, 1);
            g2d.fillRect(6 + tempXpos + x, tempYpos -7, 1, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -6, 2, 1);
            g2d.fillRect(2 + tempXpos + x, tempYpos -5, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(4 + tempXpos + x, tempYpos -4, 2, 1);
            g2d.fillRect(6 + tempXpos + x, tempYpos -3, 2, 1);
            g2d.fillRect(0 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(7 + tempXpos + x, tempYpos -1, 1, 2);
            g2d.fillRect(1 + tempXpos + x, tempYpos + 0, 6, 1);
        }
    }
}
