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
public class BB0 extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public BB0()
    {
        super();
        strapAllowed = false;
        police = true;
    }

    public BB0(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
        police = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;
        if(step == 0 || step == 8)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(0 + x + tempXpos, -71 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -71 + tempYpos, 7, 1);
            g2d.fillRect(8 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -68 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -65 + tempYpos, 1, 5);
            g2d.fillRect(7 + x + tempXpos, -65 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -61 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -60 + tempYpos, 1, 11);
            g2d.fillRect(5 + x + tempXpos, -57 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -54 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -51 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(-4 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(1 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(-6 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(1 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(6 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(7 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -68 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -65 + tempYpos, 1, 6);
            g2d.fillRect(1 + x + tempXpos, -65 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(6 + x + tempXpos, -65 + tempYpos, 1, 4);
            g2d.fillRect(4 + x + tempXpos, -61 + tempYpos, 1, 7);
            g2d.fillRect(-1 + x + tempXpos, -60 + tempYpos, 1, 11);
            g2d.fillRect(3 + x + tempXpos, -57 + tempYpos, 1, 6);
            g2d.fillRect(2 + x + tempXpos, -51 + tempYpos, 1, 5);
            g2d.fillRect(-2 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(-3 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(-3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(2 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -68 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(2 + x + tempXpos, -65 + tempYpos, 1, 14);
            g2d.fillRect(3 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(4 + x + tempXpos, -65 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -64 + tempYpos, 1, 31);
            g2d.fillRect(0 + x + tempXpos, -59 + tempYpos, 1, 33);
            g2d.fillRect(-1 + x + tempXpos, -49 + tempYpos, 1, 34);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 9 || step == 10 || step == 14 || step == 15)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -71 +tempYpos, 1, 6);
            g2d.fillRect(0 + x + tempXpos, -71 +tempYpos, 7, 1);
            g2d.fillRect(7 + x + tempXpos, -70 +tempYpos, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -65 +tempYpos, 1, 5);
            g2d.fillRect(7 + x + tempXpos, -65 +tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -61 +tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -60 +tempYpos, 1, 11);
            g2d.fillRect(5 + x + tempXpos, -57 +tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -54 +tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -51 +tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -49 +tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -47 +tempYpos, 1, 10);
            g2d.fillRect(-4 + x + tempXpos, -46 +tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -37 +tempYpos, 1, 20);
            g2d.fillRect(3 + x + tempXpos, -37 +tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -33 +tempYpos, 1, 7);
            g2d.fillRect(1 + x + tempXpos, -26 +tempYpos, 1, 11);
            g2d.fillRect(-4 + x + tempXpos, -17 +tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 +tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 +tempYpos, 1, 15);
            g2d.fillRect(-6 + x + tempXpos, -8 +tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -5 +tempYpos, 1, 5);
            g2d.fillRect(-6 + x + tempXpos, -1 +tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -1 +tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -1 +tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, 0 +tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -70 +tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -70 +tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -70 +tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -70 +tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -70 +tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -70 +tempYpos, 1, 5);
            g2d.fillRect(6 + x + tempXpos, -70 +tempYpos, 1, 5);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -65 +tempYpos, 1, 6);
            g2d.fillRect(1 + x + tempXpos, -65 +tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -65 +tempYpos, 1, 8);
            g2d.fillRect(6 + x + tempXpos, -65 +tempYpos, 1, 4);
            g2d.fillRect(4 + x + tempXpos, -61 +tempYpos, 1, 7);
            g2d.fillRect(-1 + x + tempXpos, -60 +tempYpos, 1, 11);
            g2d.fillRect(3 + x + tempXpos, -57 +tempYpos, 1, 6);
            g2d.fillRect(2 + x + tempXpos, -51 +tempYpos, 1, 5);
            g2d.fillRect(-2 + x + tempXpos, -49 +tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -47 +tempYpos, 1, 10);
            g2d.fillRect(-3 + x + tempXpos, -46 +tempYpos, 1, 9);
            g2d.fillRect(-2 + x + tempXpos, -37 +tempYpos, 1, 20);
            g2d.fillRect(2 + x + tempXpos, -37 +tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -33 +tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -26 +tempYpos, 1, 11);
            g2d.fillRect(-3 + x + tempXpos, -17 +tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -16 +tempYpos, 1, 9);
            g2d.fillRect(-1 + x + tempXpos, -15 +tempYpos, 1, 14);
            g2d.fillRect(-5 + x + tempXpos, -8 +tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -5 +tempYpos, 1, 4);
            g2d.fillRect(-5 + x + tempXpos, -2 +tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -1 +tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(2 + x + tempXpos, -68 +tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -68 +tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -68 +tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(2 + x + tempXpos, -65 +tempYpos, 1, 14);
            g2d.fillRect(3 + x + tempXpos, -65 +tempYpos, 1, 8);
            g2d.fillRect(4 + x + tempXpos, -65 +tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -64 +tempYpos, 1, 31);
            g2d.fillRect(0 + x + tempXpos, -59 +tempYpos, 1, 33);
            g2d.fillRect(-1 + x + tempXpos, -49 +tempYpos, 1, 34);
            g2d.fillRect(-2 + x + tempXpos, -46 +tempYpos, 1, 9);
            g2d.fillRect(2 + x + tempXpos, -46 +tempYpos, 1, 9);
            g2d.fillRect(-2 + x + tempXpos, -17 +tempYpos, 1, 15);
            g2d.fillRect(-3 + x + tempXpos, -14 +tempYpos, 1, 12);
            g2d.fillRect(-4 + x + tempXpos, -7 +tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -4 +tempYpos, 1, 2);
        }
        else if(step == 11 || step == 12 || step == 13)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -71 + tempYpos, 1, 6);
            g2d.fillRect(-1 + x + tempXpos, -71 + tempYpos, 7, 1);
            g2d.fillRect(6 + x + tempXpos, -70 + tempYpos, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -65 + tempYpos, 1, 16);
            g2d.fillRect(6 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(5 + x + tempXpos, -57 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -54 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -51 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(-4 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(1 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(-6 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-1 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(0 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -70 + tempYpos, 1, 5);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-1 + x + tempXpos, -65 + tempYpos, 1, 16);
            g2d.fillRect(0 + x + tempXpos, -65 + tempYpos, 1, 1);
            g2d.fillRect(4 + x + tempXpos, -65 + tempYpos, 1, 11);
            g2d.fillRect(5 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(3 + x + tempXpos, -57 + tempYpos, 1, 6);
            g2d.fillRect(2 + x + tempXpos, -51 + tempYpos, 1, 5);
            g2d.fillRect(-2 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(-3 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(-3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(1 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -68 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(1 + x + tempXpos, -65 + tempYpos, 1, 32);
            g2d.fillRect(2 + x + tempXpos, -65 + tempYpos, 1, 14);
            g2d.fillRect(3 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -64 + tempYpos, 1, 38);
            g2d.fillRect(-1 + x + tempXpos, -49 + tempYpos, 1, 34);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 1 || step == 7)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -67 + tempYpos, 1, 6);
            g2d.fillRect(0 + x + tempXpos, -67 + tempYpos, 7, 1);
            g2d.fillRect(7 + x + tempXpos, -66 + tempYpos, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -61 + tempYpos, 1, 4);
            g2d.fillRect(7 + x + tempXpos, -61 + tempYpos, 1, 3);
            g2d.fillRect(6 + x + tempXpos, -58 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -57 + tempYpos, 1, 10);
            g2d.fillRect(5 + x + tempXpos, -54 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -52 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -49 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -45 + tempYpos, 1, 9);
            g2d.fillRect(-4 + x + tempXpos, -44 + tempYpos, 1, 8);
            g2d.fillRect(-3 + x + tempXpos, -36 + tempYpos, 1, 19);
            g2d.fillRect(3 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -32 + tempYpos, 1, 7);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 10);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(-6 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -66 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -66 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -66 + tempYpos, 1, 5);
            g2d.fillRect(6 + x + tempXpos, -66 + tempYpos, 1, 5);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -61 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -61 + tempYpos, 1, 7);
            g2d.fillRect(6 + x + tempXpos, -61 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -58 + tempYpos, 1, 6);
            g2d.fillRect(-1 + x + tempXpos, -57 + tempYpos, 1, 10);
            g2d.fillRect(3 + x + tempXpos, -54 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -49 + tempYpos, 1, 5);
            g2d.fillRect(-2 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -45 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -44 + tempYpos, 1, 8);
            g2d.fillRect(-2 + x + tempXpos, -36 + tempYpos, 1, 19);
            g2d.fillRect(2 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -32 + tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 10);
            g2d.fillRect(-3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(2 + x + tempXpos, -64 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -64 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -64 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(1 + x + tempXpos, -61 + tempYpos, 1, 29);
            g2d.fillRect(2 + x + tempXpos, -61 + tempYpos, 1, 12);
            g2d.fillRect(3 + x + tempXpos, -61 + tempYpos, 1, 7);
            g2d.fillRect(4 + x + tempXpos, -61 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -56 + tempYpos, 1, 31);
            g2d.fillRect(-1 + x + tempXpos, -47 + tempYpos, 1, 32);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 1, 8);
            g2d.fillRect(2 + x + tempXpos, -44 + tempYpos, 1, 8);
            g2d.fillRect(-2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 2 || step == 6)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -63 + tempYpos, 1, 4);
            g2d.fillRect(0 + x + tempXpos, -63 + tempYpos, 7, 1);
            g2d.fillRect(7 + x + tempXpos, -62 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -59 + tempYpos, 1, 4);
            g2d.fillRect(7 + x + tempXpos, -59 + tempYpos, 1, 3);
            g2d.fillRect(6 + x + tempXpos, -56 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -55 + tempYpos, 1, 9);
            g2d.fillRect(5 + x + tempXpos, -52 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -50 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -46 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -44 + tempYpos, 1, 9);
            g2d.fillRect(-4 + x + tempXpos, -43 + tempYpos, 1, 8);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 18);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -31 + tempYpos, 1, 6);
            g2d.fillRect(1 + x + tempXpos, -25 + tempYpos, 1, 10);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(-6 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -62 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -62 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -62 + tempYpos, 1, 3);
            g2d.fillRect(6 + x + tempXpos, -62 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x + tempXpos, -59 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -59 + tempYpos, 1, 7);
            g2d.fillRect(6 + x + tempXpos, -59 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -56 + tempYpos, 1, 6);
            g2d.fillRect(-1 + x + tempXpos, -55 + tempYpos, 1, 9);
            g2d.fillRect(3 + x + tempXpos, -52 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -47 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -44 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -43 + tempYpos, 1, 8);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 18);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -31 + tempYpos, 1, 6);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 10);
            g2d.fillRect(-3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(2 + x + tempXpos, -60 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(1 + x + tempXpos, -59 + tempYpos, 1, 28);
            g2d.fillRect(2 + x + tempXpos, -59 + tempYpos, 1, 12);
            g2d.fillRect(3 + x + tempXpos, -59 + tempYpos, 1, 7);
            g2d.fillRect(4 + x + tempXpos, -59 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -54 + tempYpos, 1, 29);
            g2d.fillRect(-1 + x + tempXpos, -46 + tempYpos, 1, 31);
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 8);
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 8);
            g2d.fillRect(-2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 3 || step == 5)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -57 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -57 + tempYpos, 7, 1);
            g2d.fillRect(6 + x + tempXpos, -56 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -54 + tempYpos, 1, 11);
            g2d.fillRect(6 + x + tempXpos, -54 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -49 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -41 + tempYpos, 1, 8);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 1, 16);
            g2d.fillRect(3 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 1, 9);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(-6 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-1 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(5 + x + tempXpos, -56 + tempYpos, 1, 2);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-1 + x + tempXpos, -54 + tempYpos, 1, 11);
            g2d.fillRect(4 + x + tempXpos, -54 + tempYpos, 1, 7);
            g2d.fillRect(5 + x + tempXpos, -54 + tempYpos, 1, 5);
            g2d.fillRect(3 + x + tempXpos, -49 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -44 + tempYpos, 1, 4);
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 8);
            g2d.fillRect(-3 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 16);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(0 + x + tempXpos, -24 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(0 + x + tempXpos, -54 + tempYpos, 1, 30);
            g2d.fillRect(1 + x + tempXpos, -54 + tempYpos, 1, 25);
            g2d.fillRect(2 + x + tempXpos, -54 + tempYpos, 1, 10);
            g2d.fillRect(3 + x + tempXpos, -54 + tempYpos, 1, 5);
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 28);
            g2d.fillRect(-2 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(2 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 4)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + x + tempXpos, -53 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -53 + tempYpos, 7, 1);
            g2d.fillRect(5 + x + tempXpos, -52 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + x + tempXpos, -51 + tempYpos, 1, 11);
            g2d.fillRect(5 + x + tempXpos, -51 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -49 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(2 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(4 + x + tempXpos, -41 + tempYpos, 1, 8);
            g2d.fillRect(-4 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 1, 16);
            g2d.fillRect(3 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -24 + tempYpos, 1, 9);
            g2d.fillRect(-4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(-6 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(-2 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-2 + x + tempXpos, -52 + tempYpos, 7, 1);
            g2d.fillRect(-1 + x + tempXpos, -51 + tempYpos, 4, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-2 + x + tempXpos, -51 + tempYpos, 1, 11);
            g2d.fillRect(3 + x + tempXpos, -51 + tempYpos, 1, 4);
            g2d.fillRect(4 + x + tempXpos, -51 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -49 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -41 + tempYpos, 1, 8);
            g2d.fillRect(-3 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 16);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(0 + x + tempXpos, -24 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(-1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(-5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(-5 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(-4 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-1 + x + tempXpos, -50 + tempYpos, 1, 35);
            g2d.fillRect(0 + x + tempXpos, -50 + tempYpos, 1, 26);
            g2d.fillRect(1 + x + tempXpos, -50 + tempYpos, 1, 6);
            g2d.fillRect(2 + x + tempXpos, -50 + tempYpos, 1, 1);
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 14);
            g2d.fillRect(-2 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(2 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        if(step == 0 || step == 8)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-7 + x + tempXpos, -71 + tempYpos, 8, 1);
            g2d.fillRect(-8 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-7 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -68 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-7 + x + tempXpos, -65 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -65 + tempYpos, 1, 5);
            g2d.fillRect(-6 + x + tempXpos, -61 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -60 + tempYpos, 1, 11);
            g2d.fillRect(-5 + x + tempXpos, -57 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -54 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -51 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(4 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(-1 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-7 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-6 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(0 + x + tempXpos, -68 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -65 + tempYpos, 1, 4);
            g2d.fillRect(-5 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(-1 + x + tempXpos, -65 + tempYpos, 2, 1);
            g2d.fillRect(0 + x + tempXpos, -64 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -61 + tempYpos, 1, 7);
            g2d.fillRect(1 + x + tempXpos, -60 + tempYpos, 1, 11);
            g2d.fillRect(-3 + x + tempXpos, -57 + tempYpos, 1, 6);
            g2d.fillRect(-2 + x + tempXpos, -51 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(3 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(3 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-4 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -68 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-4 + x + tempXpos, -65 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(-2 + x + tempXpos, -65 + tempYpos, 1, 14);
            g2d.fillRect(-1 + x + tempXpos, -64 + tempYpos, 1, 31);
            g2d.fillRect(0 + x + tempXpos, -59 + tempYpos, 1, 33);
            g2d.fillRect(1 + x + tempXpos, -49 + tempYpos, 1, 34);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 1 || step == 7 || step == 2 || step == 6)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-6 + x + tempXpos, -71 + tempYpos, 8, 1);
            g2d.fillRect(-7 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -70 + tempYpos, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-7 + x + tempXpos, -65 + tempYpos, 1, 4);
            g2d.fillRect(1 + x + tempXpos, -65 + tempYpos, 1, 5);
            g2d.fillRect(-6 + x + tempXpos, -61 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -60 + tempYpos, 1, 11);
            g2d.fillRect(-5 + x + tempXpos, -57 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -54 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -51 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(4 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(-1 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(0 + x + tempXpos, -70 + tempYpos, 1, 5);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -65 + tempYpos, 1, 4);
            g2d.fillRect(-5 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(-1 + x + tempXpos, -65 + tempYpos, 2, 1);
            g2d.fillRect(0 + x + tempXpos, -64 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -61 + tempYpos, 1, 7);
            g2d.fillRect(1 + x + tempXpos, -60 + tempYpos, 1, 11);
            g2d.fillRect(-3 + x + tempXpos, -57 + tempYpos, 1, 6);
            g2d.fillRect(-2 + x + tempXpos, -51 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(3 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(3 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-4 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -68 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-4 + x + tempXpos, -65 + tempYpos, 1, 4);
            g2d.fillRect(-3 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(-2 + x + tempXpos, -65 + tempYpos, 1, 14);
            g2d.fillRect(-1 + x + tempXpos, -64 + tempYpos, 1, 31);
            g2d.fillRect(0 + x + tempXpos, -59 + tempYpos, 1, 33);
            g2d.fillRect(1 + x + tempXpos, -49 + tempYpos, 1, 34);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 3 || step == 4 || step == 5)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-5 + x + tempXpos, -71 + tempYpos, 8, 1);
            g2d.fillRect(-6 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -70 + tempYpos, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-6 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(2 + x + tempXpos, -65 + tempYpos, 1, 16);
            g2d.fillRect(-5 + x + tempXpos, -57 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -54 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -51 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(4 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(-1 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-5 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(-3 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -70 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -70 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -70 + tempYpos, 1, 5);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-5 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(-4 + x + tempXpos, -65 + tempYpos, 1, 11);
            g2d.fillRect(0 + x + tempXpos, -65 + tempYpos, 2, 1);
            g2d.fillRect(1 + x + tempXpos, -64 + tempYpos, 1, 15);
            g2d.fillRect(-3 + x + tempXpos, -57 + tempYpos, 1, 6);
            g2d.fillRect(-2 + x + tempXpos, -51 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -49 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -47 + tempYpos, 1, 10);
            g2d.fillRect(3 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(-2 + x + tempXpos, -37 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -37 + tempYpos, 1, 20);
            g2d.fillRect(-1 + x + tempXpos, -33 + tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -26 + tempYpos, 1, 11);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(3 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -68 + tempYpos, 1, 3);
            g2d.fillRect(-1 + x + tempXpos, -68 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-3 + x + tempXpos, -65 + tempYpos, 1, 8);
            g2d.fillRect(-2 + x + tempXpos, -65 + tempYpos, 1, 14);
            g2d.fillRect(-1 + x + tempXpos, -65 + tempYpos, 1, 32);
            g2d.fillRect(0 + x + tempXpos, -64 + tempYpos, 1, 38);
            g2d.fillRect(1 + x + tempXpos, -49 + tempYpos, 1, 34);
            g2d.fillRect(-2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(2 + x + tempXpos, -46 + tempYpos, 1, 9);
            g2d.fillRect(2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 9 || step == 15)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-6 + x + tempXpos, -67 + tempYpos, 8, 1);
            g2d.fillRect(-7 + x + tempXpos, -66 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -66 + tempYpos, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-7 + x + tempXpos, -61 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -61 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -58 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -57 + tempYpos, 1, 10);
            g2d.fillRect(-5 + x + tempXpos, -54 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -52 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -49 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -45 + tempYpos, 1, 9);
            g2d.fillRect(4 + x + tempXpos, -44 + tempYpos, 1, 8);
            g2d.fillRect(-3 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -36 + tempYpos, 1, 19);
            g2d.fillRect(-2 + x + tempXpos, -32 + tempYpos, 1, 7);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 10);
            g2d.fillRect(4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -66 + tempYpos, 1, 5);
            g2d.fillRect(-5 + x + tempXpos, -66 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -66 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -66 + tempYpos, 1, 5);
            g2d.fillRect(0 + x + tempXpos, -66 + tempYpos, 1, 5);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -61 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -61 + tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -61 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -58 + tempYpos, 1, 6);
            g2d.fillRect(1 + x + tempXpos, -57 + tempYpos, 1, 10);
            g2d.fillRect(-3 + x + tempXpos, -54 + tempYpos, 1, 5);
            g2d.fillRect(-2 + x + tempXpos, -49 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -45 + tempYpos, 1, 9);
            g2d.fillRect(3 + x + tempXpos, -44 + tempYpos, 1, 8);
            g2d.fillRect(-2 + x + tempXpos, -36 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -36 + tempYpos, 1, 19);
            g2d.fillRect(-1 + x + tempXpos, -32 + tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 10);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(3 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-4 + x + tempXpos, -64 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -64 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -64 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-4 + x + tempXpos, -61 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -61 + tempYpos, 1, 7);
            g2d.fillRect(-2 + x + tempXpos, -61 + tempYpos, 1, 12);
            g2d.fillRect(-1 + x + tempXpos, -61 + tempYpos, 1, 29);
            g2d.fillRect(0 + x + tempXpos, -56 + tempYpos, 1, 31);
            g2d.fillRect(1 + x + tempXpos, -47 + tempYpos, 1, 32);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 1, 8);
            g2d.fillRect(2 + x + tempXpos, -44 + tempYpos, 1, 8);
            g2d.fillRect(2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 10 || step == 14)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-6 + x + tempXpos, -63 + tempYpos, 8, 1);
            g2d.fillRect(-7 + x + tempXpos, -62 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -62 + tempYpos, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-7 + x + tempXpos, -59 + tempYpos, 1, 3);
            g2d.fillRect(1 + x + tempXpos, -59 + tempYpos, 1, 4);
            g2d.fillRect(-6 + x + tempXpos, -56 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -55 + tempYpos, 1, 9);
            g2d.fillRect(-5 + x + tempXpos, -52 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -50 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -46 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -44 + tempYpos, 1, 9);
            g2d.fillRect(4 + x + tempXpos, -43 + tempYpos, 1, 8);
            g2d.fillRect(-3 + x + tempXpos, -35 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -35 + tempYpos, 1, 18);
            g2d.fillRect(-2 + x + tempXpos, -31 + tempYpos, 1, 6);
            g2d.fillRect(-1 + x + tempXpos, -25 + tempYpos, 1, 10);
            g2d.fillRect(4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -62 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -62 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -62 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -62 + tempYpos, 1, 3);
            g2d.fillRect(0 + x + tempXpos, -62 + tempYpos, 1, 3);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-6 + x + tempXpos, -59 + tempYpos, 1, 3);
            g2d.fillRect(-5 + x + tempXpos, -59 + tempYpos, 1, 7);
            g2d.fillRect(0 + x + tempXpos, -59 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -56 + tempYpos, 1, 6);
            g2d.fillRect(1 + x + tempXpos, -55 + tempYpos, 1, 9);
            g2d.fillRect(-3 + x + tempXpos, -52 + tempYpos, 1, 5);
            g2d.fillRect(-2 + x + tempXpos, -47 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -46 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -44 + tempYpos, 1, 9);
            g2d.fillRect(3 + x + tempXpos, -43 + tempYpos, 1, 8);
            g2d.fillRect(-2 + x + tempXpos, -35 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -35 + tempYpos, 1, 18);
            g2d.fillRect(-1 + x + tempXpos, -31 + tempYpos, 1, 6);
            g2d.fillRect(0 + x + tempXpos, -25 + tempYpos, 1, 10);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(3 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-4 + x + tempXpos, -60 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-4 + x + tempXpos, -59 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -59 + tempYpos, 1, 7);
            g2d.fillRect(-2 + x + tempXpos, -59 + tempYpos, 1, 12);
            g2d.fillRect(-1 + x + tempXpos, -59 + tempYpos, 1, 28);
            g2d.fillRect(0 + x + tempXpos, -54 + tempYpos, 1, 29);
            g2d.fillRect(1 + x + tempXpos, -46 + tempYpos, 1, 31);
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 8);
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 8);
            g2d.fillRect(2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 11 || step == 13)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-5 + x + tempXpos, -57 + tempYpos, 8, 1);
            g2d.fillRect(-6 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(2 + x + tempXpos, -56 + tempYpos, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-6 + x + tempXpos, -54 + tempYpos, 1, 5);
            g2d.fillRect(2 + x + tempXpos, -54 + tempYpos, 1, 11);
            g2d.fillRect(-5 + x + tempXpos, -49 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -44 + tempYpos, 1, 3);
            g2d.fillRect(3 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(-4 + x + tempXpos, -41 + tempYpos, 1, 8);
            g2d.fillRect(4 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -33 + tempYpos, 1, 16);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(-1 + x + tempXpos, -24 + tempYpos, 1, 9);
            g2d.fillRect(4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-5 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(-2 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(-1 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(0 + x + tempXpos, -56 + tempYpos, 1, 2);
            g2d.fillRect(1 + x + tempXpos, -56 + tempYpos, 1, 2);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-5 + x + tempXpos, -54 + tempYpos, 1, 5);
            g2d.fillRect(-4 + x + tempXpos, -54 + tempYpos, 1, 7);
            g2d.fillRect(1 + x + tempXpos, -54 + tempYpos, 1, 11);
            g2d.fillRect(-3 + x + tempXpos, -49 + tempYpos, 1, 5);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 8);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 16);
            g2d.fillRect(-1 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(0 + x + tempXpos, -24 + tempYpos, 1, 9);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(3 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-3 + x + tempXpos, -54 + tempYpos, 1, 5);
            g2d.fillRect(-2 + x + tempXpos, -54 + tempYpos, 1, 10);
            g2d.fillRect(-1 + x + tempXpos, -54 + tempYpos, 1, 25);
            g2d.fillRect(0 + x + tempXpos, -54 + tempYpos, 1, 30);
            g2d.fillRect(1 + x + tempXpos, -43 + tempYpos, 1, 28);
            g2d.fillRect(-2 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(2 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }
        else if(step == 12)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-4 + x + tempXpos, -53 + tempYpos, 8, 1);
            g2d.fillRect(-5 + x + tempXpos, -52 + tempYpos, 1, 1);
            g2d.fillRect(3 + x + tempXpos, -52 + tempYpos, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-5 + x + tempXpos, -51 + tempYpos, 1, 2);
            g2d.fillRect(3 + x + tempXpos, -51 + tempYpos, 1, 11);
            g2d.fillRect(-4 + x + tempXpos, -49 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -47 + tempYpos, 1, 3);
            g2d.fillRect(-2 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(-3 + x + tempXpos, -43 + tempYpos, 1, 2);
            g2d.fillRect(-4 + x + tempXpos, -41 + tempYpos, 1, 8);
            g2d.fillRect(4 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-3 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(3 + x + tempXpos, -33 + tempYpos, 1, 16);
            g2d.fillRect(-2 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(-1 + x + tempXpos, -24 + tempYpos, 1, 9);
            g2d.fillRect(4 + x + tempXpos, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + x + tempXpos, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + x + tempXpos, -15 + tempYpos, 1, 15);
            g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + x + tempXpos, -5 + tempYpos, 1, 5);
            g2d.fillRect(1 + x + tempXpos, -1 + tempYpos, 2, 1);
            g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 1, 2);
            g2d.fillRect(6 + x + tempXpos, -1 + tempYpos, 1, 1);
            g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 3, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-4 + x + tempXpos, -52 + tempYpos, 7, 1);
            g2d.fillRect(-2 + x + tempXpos, -51 + tempYpos, 4, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-4 + x + tempXpos, -51 + tempYpos, 1, 2);
            g2d.fillRect(-3 + x + tempXpos, -51 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -51 + tempYpos, 1, 11);
            g2d.fillRect(-2 + x + tempXpos, -49 + tempYpos, 1, 5);
            g2d.fillRect(-1 + x + tempXpos, -44 + tempYpos, 1, 1);
            g2d.fillRect(-2 + x + tempXpos, -43 + tempYpos, 1, 3);
            g2d.fillRect(-3 + x + tempXpos, -41 + tempYpos, 1, 8);
            g2d.fillRect(3 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(-2 + x + tempXpos, -33 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -33 + tempYpos, 1, 16);
            g2d.fillRect(-1 + x + tempXpos, -29 + tempYpos, 1, 5);
            g2d.fillRect(0 + x + tempXpos, -24 + tempYpos, 1, 9);
            g2d.fillRect(3 + x + tempXpos, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + x + tempXpos, -16 + tempYpos, 1, 9);
            g2d.fillRect(1 + x + tempXpos, -15 + tempYpos, 1, 14);
            g2d.fillRect(5 + x + tempXpos, -8 + tempYpos, 1, 4);
            g2d.fillRect(6 + x + tempXpos, -5 + tempYpos, 1, 4);
            g2d.fillRect(2 + x + tempXpos, -2 + tempYpos, 4, 1);
            g2d.fillRect(3 + x + tempXpos, -1 + tempYpos, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + x + tempXpos, -50 + tempYpos, 4, 1);
            g2d.fillRect(-1 + x + tempXpos, -49 + tempYpos, 1, 5);
            g2d.fillRect(0 + x + tempXpos, -49 + tempYpos, 1, 25);
            g2d.fillRect(1 + x + tempXpos, -49 + tempYpos, 1, 34);
            g2d.fillRect(-1 + x + tempXpos, -43 + tempYpos, 1, 14);
            g2d.fillRect(-2 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(2 + x + tempXpos, -40 + tempYpos, 1, 7);
            g2d.fillRect(2 + x + tempXpos, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 5);
            g2d.fillRect(5 + x + tempXpos, -4 + tempYpos, 1, 2);
        }

    }
}
