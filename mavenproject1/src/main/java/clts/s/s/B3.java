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
import obsolete.B;
import util.GraphicsMap;
import pieces.p.Frilly2;
import pieces.p.Frilly3;
import pieces.p.Frilly4;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class B3 extends B
{
    /** Creates a new instance of Shoes1 */
    Frilly2 [] frillyTwos = new Frilly2 [7];
    Frilly3 [] frillyThrees = new Frilly3 [9];
    Frilly4 [] frillyFours = new Frilly4 [5];


    public B3()
    {
        super();
        strapAllowed = false;
        notSlenderS = true;
        sch = true;
        sock = true;
        initFrillys();
    }

    public B3(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
        notSlenderS = true;
        sch = true;
        sock = true;
        initFrillys();
    }

    private void initFrillys()
    {
        for(int i = 0; i < frillyTwos.length; i++)
        {
            frillyTwos[i] = new Frilly2();
        }
        for(int i = 0; i < frillyThrees.length; i++)
        {
            frillyThrees[i] = new Frilly3();
        }
        for(int i = 0; i < frillyFours.length; i++)
        {
            frillyFours[i] = new Frilly4();
        }
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        frillyTwos[(step + 9) % frillyTwos.length].paint(-7 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 8) % frillyTwos.length].paint(-6 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 7) % frillyTwos.length].paint(-5 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 6) % frillyTwos.length].paint(-2 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 5) % frillyTwos.length].paint(-1 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 4) % frillyTwos.length].paint(tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 3) % frillyTwos.length].paint(-5 + tempXpos + x, tempYpos,g2d);
        frillyTwos[(step + 2) % frillyTwos.length].paint(-4 + tempXpos + x, tempYpos,g2d);
        frillyTwos[(step + 1) % frillyTwos.length].paint(-3 + tempXpos + x, tempYpos,g2d);
        frillyTwos[(step + 10) % frillyTwos.length].paint(-2 + tempXpos + x, tempYpos,g2d);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        frillyThrees[(step + 9) % frillyThrees.length].paint(-7 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 10) % frillyThrees.length].paint(-6 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 1) % frillyThrees.length].paint(-5 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 2) % frillyThrees.length].paint(-2 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 3) % frillyThrees.length].paint(-1 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 4) % frillyThrees.length].paint(tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 5) % frillyThrees.length].paint(-5 + tempXpos + x, tempYpos,g2d);
        frillyThrees[(step + 6) % frillyThrees.length].paint(-4 + tempXpos + x, tempYpos,g2d);
        frillyThrees[(step + 7) % frillyThrees.length].paint(-3 + tempXpos + x, tempYpos,g2d);
        frillyThrees[(step + 8) % frillyThrees.length].paint(-2 + tempXpos + x, tempYpos,g2d);

        for(int j = -37; j < -25; j++)
            for(int i = 0; i <= 1; i++)
            {
                g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
            }

        for(int j = -26; j < -10; j++)
            for(int i = -2; i <= -1; i++)
            {
                g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
            }

        for(int j = -9; j < -4; j++)
            for(int i = -3; i <= -2; i++)
            {
                if(i == -3)
                {
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                    frillyFours[Math.abs(i - tempXpos) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
                g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
            }

        if(step == 0 || step == 8 || step == 9 || step == 10 || step == 11 || step == 12 || step == 13 || step == 14 || step == 15 || step == 16)
        {
            for(int j = -43; j < -37; j++)
                for(int i = -4; i <= 4; i++)
                {
                    if(i != -4 && i != 4)
                    {
                        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                        frillyFours[Math.abs(tempYpos + j) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    }
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                    frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                    frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
        }
        else if(step == 1 || step == 7)
        {
            for(int j = -42; j < -36; j++)
                for(int i = -4; i <= 4; i++)
                {
                    if(i != -4 && i != 4)
                    {
                        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                        frillyFours[Math.abs(tempXpos * j) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    }
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                    frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                    frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
        }
        else if(step == 2 || step == 6)
        {
            for(int j = -41; j < -34; j++)
                for(int i = -4; i <= 4; i++)
                {
                    if(i != -4 && i != 4)
                    {
                        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                        frillyFours[Math.abs(tempYpos % j) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    }
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                    frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                    frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
        }
        else if(step == 3 || step == 4 || step == 5)
        {
            for(int j = -39; j < -33; j++)
                for(int i = -4; i <= 4; i++)
                {
                    if(i != -4 && i != 4)
                    {
                        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                        frillyFours[Math.abs(tempYpos - j) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    }
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                    frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                    frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
        }
        super.paintRight(x, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        frillyTwos[(step + 1) % frillyTwos.length].paint(7 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 2) % frillyTwos.length].paint(6 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 3) % frillyTwos.length].paint(5 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 4) % frillyTwos.length].paint(2 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 5) % frillyTwos.length].paint(1 + tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 6) % frillyTwos.length].paint(tempXpos + x, -1 + tempYpos,g2d);
        frillyTwos[(step + 7) % frillyTwos.length].paint(5 + tempXpos + x, tempYpos,g2d);
        frillyTwos[(step + 8) % frillyTwos.length].paint(4 + tempXpos + x, tempYpos,g2d);
        frillyTwos[(step + 9) % frillyTwos.length].paint(3 + tempXpos + x, tempYpos,g2d);
        frillyTwos[(step + 10) % frillyTwos.length].paint(2 + tempXpos + x, tempYpos,g2d);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        frillyThrees[(step + 10) % frillyThrees.length].paint(7 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 9) % frillyThrees.length].paint(6 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 8) % frillyThrees.length].paint(5 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 7) % frillyThrees.length].paint(2 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 6) % frillyThrees.length].paint(1 + tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 5) % frillyThrees.length].paint(tempXpos + x, -1 + tempYpos,g2d);
        frillyThrees[(step + 4) % frillyThrees.length].paint(5 + tempXpos + x, tempYpos,g2d);
        frillyThrees[(step + 3) % frillyThrees.length].paint(4 + tempXpos + x, tempYpos,g2d);
        frillyThrees[(step + 2) % frillyThrees.length].paint(3 + tempXpos + x, tempYpos,g2d);
        frillyThrees[(step + 1) % frillyThrees.length].paint(2 + tempXpos + x, tempYpos,g2d);

        for(int j = -37; j < -25; j++)
            for(int i = 0; i <= 1; i++)
            {
                g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
            }

        for(int j = -26; j < -10; j++)
            for(int i = 2; i <= 3; i++)
            {
                g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
            }

        for(int j = -9; j < -4; j++)
            for(int i = 3; i <= 4; i++)
            {
                if(i == 3)
                {
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                    frillyFours[Math.abs(tempXpos + j) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
                g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
            }

        if(step == 0 || step == 1 || step == 2 || step == 3 || step == 4 || step == 5 || step == 6 || step == 7 || step == 8)
        {
            for(int j = -43; j < -37; j++)
                for(int i = -4; i <= 4; i++)
                {
                    if(i != -4 && i != 4)
                    {
                        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                        frillyFours[Math.abs(tempXpos % j) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    }
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                    frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                    frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
        }
        else if(step == 9 || step == 15)
        {
            for(int j = -42; j < -36; j++)
                for(int i = -4; i <= 4; i++)
                {
                    if(i != -4 && i != 4)
                    {
                        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                        frillyFours[Math.abs(tempYpos * j) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    }
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                    frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                    frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
        }
        else if(step == 10 || step == 14)
        {
            for(int j = -41; j < -34; j++)
                for(int i = -4; i <= 4; i++)
                {
                    if(i != -4 && i != 4)
                    {
                        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                        frillyFours[Math.abs(tempXpos - j) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    }
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                    frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                    frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
        }
        else if(step == 11 || step == 12 || step == 13)
        {
            for(int j = -39; j < -33; j++)
                for(int i = -4; i <= 4; i++)
                {
                    if(i != -4 && i != 4)
                    {
                        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
                        frillyFours[Math.abs(i + j) % frillyFours.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    }
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
                    frillyTwos[Math.abs(i + j) % frillyTwos.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                    g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
                    frillyThrees[Math.abs(i + j) % frillyThrees.length].paint(i + tempXpos + x, j + tempYpos, g2d);
                }
        }
        super.paintLeft(x, g2d);
    }

    public void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm,int eye)
    {
        if(step != iStep)
        {
            for(int i = 0; i < frillyTwos.length; i++)
            {
                frillyTwos[i].reset();
            }
            for(int i = 0; i < frillyThrees.length; i++)
            {
                frillyThrees[i].reset();
            }
            for(int i = 0; i < frillyFours.length; i++)
            {
                frillyFours[i].reset();
            }
        }
        super.setStep(iStep, iDirection, iLeftArm, iRightArm,eye);
    }

}
