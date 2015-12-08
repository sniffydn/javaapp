package b;

import util.GraphicsMap;
import util.ImageUtilities;
import util.Color;

public class Hd
{
    public Color EYELASH_COLOR = new Color(0,0,0,255);
    public int INSIDE_BROW = 0; // 0 || -1

    public static final int flipOverX = 47;

    boolean teeth = false;
    boolean lookingRight = true;
    int eyes = 0;
    int smile = 0;
    Bd b = null;

    public Hd(Bd b)
    {
        this.b = b;
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        x = x + 84;
        drawMouth(x, 0, g2d);
        drawEyes(x, 0, g2d);
        drawBackground(x, 0, g2d);
        drawNeck(x - 84, 0, g2d);
    }

    private void drawBackground(int x, int y, GraphicsMap g2d)
    {
        if(lookingRight)
        {
            if(INSIDE_BROW < -1 || INSIDE_BROW > 0)
                INSIDE_BROW = 0;

            g2d.setColor(b.highlightColor);
            g2d.fillRect(23 + x,24 + INSIDE_BROW, 4, 1);
            g2d.fillRect(27 + x,25 + INSIDE_BROW, 1, 1);
            g2d.fillRect(33 + x,25 + INSIDE_BROW, 2, 1);
            g2d.fillRect(31 + x,26 + INSIDE_BROW, 2, 1);
            g2d.fillRect(28 + x,32, 2, 1);

            g2d.setColor(b.outlineColor);
            g2d.fillRect(20 + x,29, 1, 5);
            g2d.fillRect(34 + x,29, 1, 4);
            g2d.fillRect(33 + x,33, 1, 1);
            g2d.fillRect(21 + x,34, 1, 1);
            g2d.fillRect(32 + x,34, 1, 1);
            g2d.fillRect(22 + x,35, 1, 1);
            g2d.fillRect(31 + x,35, 1, 1);
            g2d.fillRect(23 + x,36, 1, 1);
            g2d.fillRect(30 + x,36, 1, 1);
            g2d.fillRect(24 + x,37, 1, 1);
            g2d.fillRect(29 + x,37, 1, 1);
            g2d.fillRect(25 + x,38, 4, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(26 + x,20, 9, 1);
            g2d.fillRect(26 + x,21, 9, 1);
            g2d.fillRect(24 + x,22, 11, 1);
            g2d.fillRect(22 + x,23, 13, 1);
            g2d.fillRect(21 + x,24, 14, 1);
            g2d.fillRect(20 + x,25, 15, 4);
            g2d.fillRect(20 + x,29, 14, 4);
            g2d.fillRect(21 + x,33, 12, 1);
            g2d.fillRect(22 + x,34, 10, 1);
            g2d.fillRect(23 + x,35, 8, 1);
            g2d.fillRect(24 + x,36, 6, 1);
            g2d.fillRect(25 + x,37, 4, 1);
            g2d.fillRect(25 + x, 19, 1, 3);
            g2d.fillRect(24 + x, 21, 1, 1);
            g2d.fillRect(23 + x, 21, 1, 2);
        }
        else
        {
            if(INSIDE_BROW < -1 || INSIDE_BROW > 0)
                INSIDE_BROW = 0;

            g2d.setColor(b.highlightColor);
            ImageUtilities.fillRect(g2d, flipOverX, 23, x,24, y + INSIDE_BROW, 4, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 27, x,25, y + INSIDE_BROW, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 33, x,25, y + INSIDE_BROW, 2, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 31, x,26, y + INSIDE_BROW, 2, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 28, x,32, y, 2, 1);

            g2d.setColor(b.outlineColor);
            ImageUtilities.fillRect(g2d, flipOverX, 20, x,29, y, 1, 5);
            ImageUtilities.fillRect(g2d, flipOverX, 34, x,29, y, 1, 4);
            ImageUtilities.fillRect(g2d, flipOverX, 33, x,33, y, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 21, x,34, y, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 32, x,34, y, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 22, x,35, y, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 31, x,35, y, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 23, x,36, y, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 30, x,36, y, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 24, x,37, y, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 29, x,37, y, 1, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 25, x,38, y, 4, 1);

            g2d.setColor(b.fillColor);
            ImageUtilities.fillRect(g2d, flipOverX, 26, x,20, y, 9, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 26, x,21, y, 9, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 24, x,22, y, 11, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 22, x,23, y, 13, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 21, x,24, y, 14, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 20, x,25, y, 15, 4);
            ImageUtilities.fillRect(g2d, flipOverX, 20, x,29, y, 14, 4);
            ImageUtilities.fillRect(g2d, flipOverX, 21, x,33, y, 12, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 22, x,34, y, 10, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 23, x,35, y, 8, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 24, x,36, y, 6, 1);
            ImageUtilities.fillRect(g2d, flipOverX, 25, x,37, y, 4, 1);

            g2d.fillRect(24 + x, 21, 1, 2);
            g2d.fillRect(23 + x, 21, 1, 1);
            g2d.fillRect(22 + x, 19 + y, 1, 3);

        }

        if(lookingRight)
        {
            g2d.fillRect(107 - 84 + x, 22, 6, 1);
            g2d.fillRect(107 - 84 + x, 21, 6, 1);
        }
        else
        {
            g2d.fillRect(105 - 84 + x, 22, 6, 1);
            g2d.fillRect(105 - 84 + x, 21, 6, 1);
        }
    }

    private void drawEyes(int x, int y, GraphicsMap g2d)
    {
        if(lookingRight)
        {
            if(eyes == 0)
            {
                g2d.setColor(b.eyeColor);
                g2d.fillRect(32 + x,29, 1, 1);
                g2d.fillRect(24 + x,28, 1, 1);
                g2d.setColor(new Color(255,255,255,255));
                g2d.fillRect(33 + x,29, 1, 1);
                g2d.fillRect(26 + x,28, 1, 1);


                g2d.setColor(EYELASH_COLOR);
                g2d.fillRect(22 + x,26, 3, 1);
                g2d.fillRect(34 + x,26, 1, 1);
                g2d.fillRect(22 + x,27, 5, 1);
                g2d.fillRect(33 + x,27, 3, 1);
                g2d.fillRect(23 + x,28, 1, 1);
                g2d.fillRect(25 + x,28, 1, 1);
                g2d.fillRect(27 + x,28, 1, 1);
                g2d.fillRect(32 + x,28, 3, 1);
                g2d.fillRect(31 + x,29, 1, 1);

                g2d.setColor(b.fillColor);
                g2d.fillRect(23 + x,25, 2, 1);
                g2d.fillRect(34 + x,25, 1, 1);
                g2d.fillRect(25 + x,26, 2, 1);
                g2d.fillRect(33 + x,26, 1, 1);
                g2d.fillRect(27 + x,27, 1, 1);
                g2d.fillRect(32 + x,27, 1, 1);
                g2d.fillRect(31 + x,28, 1, 1);
            }
            else if(eyes == 1)
            {
                g2d.setColor(b.eyeColor);
                g2d.fillRect(32 + x,29, 1, 1);
                g2d.setColor(new Color(255,255,255,255));
                g2d.fillRect(33 + x,29, 1, 1);


                g2d.setColor(EYELASH_COLOR);
                g2d.fillRect(22 + x,28, 6, 1);
                g2d.fillRect(22 + x,29, 5, 1);
                g2d.fillRect(34 + x,26, 1, 1);
                g2d.fillRect(33 + x,27, 3, 1);
                g2d.fillRect(32 + x,28, 3, 1);
                g2d.fillRect(31 + x,29, 1, 1);

                g2d.setColor(b.fillColor);
                g2d.fillRect(23 + x,25, 2, 1);
                g2d.fillRect(34 + x,25, 1, 1);
                g2d.fillRect(22 + x,26, 5, 1);
                g2d.fillRect(33 + x,26, 1, 1);
                g2d.fillRect(22 + x,27, 6, 1);
                g2d.fillRect(32 + x,27, 1, 1);
                g2d.fillRect(31 + x,28, 1, 1);
            }
            else if(eyes == 2)
            {

                g2d.setColor(EYELASH_COLOR);
                g2d.fillRect(22 + x,28, 6, 1);
                g2d.fillRect(22 + x,29, 5, 1);
                g2d.fillRect(31 + x,29, 4, 1);
                g2d.fillRect(32 + x,30, 4, 1);


                g2d.setColor(b.fillColor);
                g2d.fillRect(23 + x,25, 2, 1);
                g2d.fillRect(34 + x,25, 1, 1);
                g2d.fillRect(22 + x,26, 5, 1);
                g2d.fillRect(33 + x,26, 2, 1);
                g2d.fillRect(22 + x,27, 6, 1);
                g2d.fillRect(32 + x,27, 3, 1);
                g2d.fillRect(31 + x,28, 4, 1);
            }
        }
        else
        {
            if(eyes == 0)
            {
                g2d.setColor(b.eyeColor);
                ImageUtilities.fillRect(g2d, flipOverX, 32, x, 29, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 24, x, 28, y, 1, 1);
                g2d.setColor(new Color(255,255,255,255));
                ImageUtilities.fillRect(g2d, flipOverX, 33, x, 29, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 26, x, 28, y, 1, 1);


                g2d.setColor(EYELASH_COLOR);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x, 26, y, 3, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 34, x, 26, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x, 27, y, 5, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 33, x, 27, y, 3, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 23, x, 28, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 25, x, 28, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 27, x, 28, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 32, x, 28, y, 3, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 31, x, 29, y, 1, 1);

                g2d.setColor(b.fillColor);
                ImageUtilities.fillRect(g2d, flipOverX, 23, x, 25, y, 2, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 34, x, 25, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 25, x, 26, y, 2, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 33, x, 26, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 27, x, 27, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 32, x, 27, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 31, x, 28, y, 1, 1);
            }
            else if(eyes == 1)
            {
                g2d.setColor(b.eyeColor);
                ImageUtilities.fillRect(g2d, flipOverX, 32, x,29, y, 1, 1);
                g2d.setColor(new Color(255,255,255,255));
                ImageUtilities.fillRect(g2d, flipOverX, 33, x,29, y, 1, 1);


                g2d.setColor(EYELASH_COLOR);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x,28, y, 6, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x,29, y, 5, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 34, x,26, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 33, x,27, y, 3, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 32, x,28, y, 3, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 31, x,29, y, 1, 1);

                g2d.setColor(b.fillColor);
                ImageUtilities.fillRect(g2d, flipOverX, 23, x,25, y, 2, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 34, x,25, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x,26, y, 5, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 33, x,26, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x,27, y, 6, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 32, x,27, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 31, x,28, y, 1, 1);
            }
            else if(eyes == 2)
            {

                g2d.setColor(EYELASH_COLOR);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x,28, y, 6, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x,29, y, 5, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 31, x,29, y, 4, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 32, x,30, y, 4, 1);


                g2d.setColor(b.fillColor);
                ImageUtilities.fillRect(g2d, flipOverX, 23, x,25, y, 2, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 34, x,25, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x,26, y, 5, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 33, x,26, y, 2, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 22, x,27, y, 6, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 32, x,27, y, 3, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 31, x,28, y, 4, 1);
            }
        }
    }

    private void drawMouth(int x, int y, GraphicsMap g2d)
    {
        Color MAKEUP_COLOR = makeSuitable(b.lipColor.get(ImageUtilities.GREY));
        if(lookingRight)
        {
            g2d.setColor(MAKEUP_COLOR);
            if(smile == 1)
                g2d.fillRect(25 + x,33, 1, 1);
            if(smile != 2)
            {
                g2d.fillRect(26 + x,34, 1, 1);
                g2d.fillRect(29 + x,34, 1, 1);
            }
            g2d.fillRect(27 + x,35, 2, 1);

            if(teeth)
            {
                g2d.setColor(getTeeth(MAKEUP_COLOR.getRed(),MAKEUP_COLOR.getGreen(),MAKEUP_COLOR.getBlue()));
            }
            g2d.fillRect(27 + x,34, 2, 1);
        }
        else
        {
            g2d.setColor(MAKEUP_COLOR);
            if(smile == 1)
                ImageUtilities.fillRect(g2d, flipOverX, 25, x, 33, y, 1, 1);
            if(smile != 2)
            {
                ImageUtilities.fillRect(g2d, flipOverX, 26, x, 34, y, 1, 1);
                ImageUtilities.fillRect(g2d, flipOverX, 29, x, 34, y, 1, 1);
            }
            ImageUtilities.fillRect(g2d, flipOverX, 27, x, 35, y, 2, 1);

            if(teeth)
            {
                g2d.setColor(getTeeth(MAKEUP_COLOR.getRed(),MAKEUP_COLOR.getGreen(),MAKEUP_COLOR.getBlue()));
            }
            ImageUtilities.fillRect(g2d, flipOverX, 27, x, 34, y, 2, 1);
        }
    }

    void setStep(int step, int direction, int eyebrows, int eyes, int smile, int teeth)
    {
        this.lookingRight = direction == 1;

        this.teeth = teeth == 1;
        this.smile = smile;
        if(smile == 2)
            this.teeth = false;

        this.eyes = eyes;
        INSIDE_BROW = eyebrows;
    }

    private void drawNeck(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(104 + x, 34 + y, 1, 6);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(105 + x, 34 + y, 1, 6);
        g2d.fillRect(110 + x, 34 + y, 1, 6);


        g2d.setColor(b.fillColor);
        g2d.fillRect(106 + x, 34 + y, 1, 6);
        g2d.fillRect(107 + x, 34 + y, 1, 6);
        g2d.fillRect(108 + x, 34 + y, 1, 6);
        g2d.fillRect(109 + x, 34 + y, 1, 6);
    }


    private Color makeSuitable(Color color)
    {
        float [] temp = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        int h = (int)(temp[0] * 360);
        int s = (int)(temp[1] * 100);
        int b = (int)(temp[2] * 100);
        if(h < 20)
        {
            if(s < 80)
                if(b > ((s + 20) / 35) + 65)
                {
                    b = ((s + 20) / 35) + 65;
                }
        }
        else if(h < 40)
        {
            if(b > (s * .4) + 50)
            {
                b = (int)(s * .4) + 50;
            }
        }
        else if(h < 55)
        {
            if(b > (s * .2) + 45)
            {
                b = (int)(s * .2) + 45;
            }
        }
        else if(h < 70)
        {
            if(b > (s * .2) + 40)
            {
                b = (int)(s * .2) + 40;
            }
        }
        else if(h < 185)
        {
            if(b > (s * .1) + 65)
            {
                b = (int)(s * .1) + 65;
            }
        }
        else if(h < 200)
        {
            if(b > (s / 65) + 65)
            {
                b = (s / 65) + 65;
            }
        }
        else if(h < 280)
        {
            if(b > (s * .2) + 60)
            {
                b = (int)(s * .2) + 60;
            }
        }
        else
        {
            if(s < 50)
                if(b > (((s * 2) / 100) * 35) + 65)
                {
                    b = (((s * 2) / 100) * 35) + 65;
                }
        }
        return Color.getHSBColor(h / 360f, s / 100f, b / 100f);
    }

    private Color getTeeth(int red, int green, int blue)
    {
        float [] temp = Color.RGBtoHSB(red, green, blue, null);
        int h = (int)(temp[0] * 360);
        int s = (int)(temp[1] * 100);
        int b = (int)(temp[2] * 100);

        b += 40;
        if(b > 100)
            b = 100;
        s -= 40;
        if(s < 0)
            s = 0;

        return Color.getHSBColor(h / 360f, s / 100f, b / 100f);
    }
}


