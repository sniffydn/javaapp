package obsolete;

import clts.*;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import pieces.p.Star0;
import util.ImageUtilities;
import util.ColorArray;

public class Jac0 extends SuperTU
{
    public Jac0()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Jac0(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Jac0(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {

    }
    public void drawLowerToo(int x, int y, GraphicsMap g2d)
    {

    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {

    }

    public void drawBToo(int x, int y, GraphicsMap g2d)
    {

    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equalsIgnoreCase("b"))
        {
            if(step % 2 == 0)
                drawB(x,y,g2d);
            else
                drawBToo(x,y,g2d);
        }
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(step % 2 == 0)
            drawLower(offsetX, 0, g2d);
        else
            drawLowerToo(offsetX, 0, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }
}
