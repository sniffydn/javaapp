/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b;

import clts.SuperB;
import clts.SuperC;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import pieces.clts.*;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot12 extends SuperB
{
    SquareCloth8Left cll = new SquareCloth8Left();
    SquareCloth8Right clr = new SquareCloth8Right();
    SquareCloth7Left cll7 = new SquareCloth7Left();
    SquareCloth7Right clr7 = new SquareCloth7Right();
    /** Creates a new instance of GenericClothes */
    public Bot12()
    {
        super();
        includeY = true;
        initPieces();
    }

    public Bot12(int layer)
    {
        super(layer);
        includeY = true;
        initPieces();
    }

    public Bot12(ColorArray colorSwitch)
    {
        super(colorSwitch);
        initPieces();
    }

    public Bot12(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        initPieces();
    }

    private void initPieces()
    {
        sch = true;
        jean = true;
        skt = true;
        cll.height = 9;
        clr.height = 9;
        cll7.height = 10;
        clr7.height = 10;
        setColors(COLORS);
    }

    public void setColors(ColorArray COLORS)
    {
        super.setColors(COLORS);
        cll.setColors(COLORS);
        clr.setColors(COLORS);
        cll7.setColors(COLORS);
        clr7.setColors(COLORS);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 78, 2, 1);
        g2d.fillRect(101 + x, 79, 1, 1);
        g2d.fillRect(100 + x, 80, 1, 6);
        g2d.fillRect(101 + x, 85, 2, 1);
        g2d.fillRect(103 + x, 86, 3, 1);
        g2d.fillRect(106 + x, 87, 12, 1);
        g2d.fillRect(118 + x, 86, 4, 1);
        g2d.fillRect(113 + x, 85, 2, 1);
        g2d.fillRect(113 + x, 83, 2, 1);
        g2d.fillRect(103 + x, 80, 3, 1);
        g2d.fillRect(106 + x, 81, 10, 1);
        g2d.fillRect(116 + x, 80, 1, 7);
        g2d.fillRect(117 + x, 80, 1, 1);
        g2d.fillRect(118 + x, 79, 1, 1);
        g2d.fillRect(119 + x, 78, 1, 1);
        g2d.fillRect(120 + x, 79, 1, 3);
        g2d.fillRect(121 + x, 82, 1, 4);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 80, 1, 1);
        g2d.fillRect(101 + x, 80, 1, 5);
        g2d.fillRect(102 + x, 84, 1, 1);
        g2d.fillRect(103 + x, 85, 3, 1);
        g2d.fillRect(106 + x, 86, 1, 1);
        g2d.fillRect(103 + x, 81, 3, 1);
        g2d.fillRect(117 + x, 81, 1, 1);
        g2d.fillRect(118 + x, 80, 1, 1);
        g2d.fillRect(119 + x, 79, 1, 2);
        g2d.fillRect(120 + x, 82, 1, 4);
        g2d.fillRect(117 + x, 86, 1, 1);
        g2d.fillRect(102 + x, 79, 1, 1);
        g2d.fillRect(101 + x, 86, 2, 1);
        g2d.fillRect(118 + x, 87, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 81, 1, 3);
        g2d.fillRect(103 + x, 82, 13, 1);
        g2d.fillRect(103 + x, 83, 10, 1);
        g2d.fillRect(103 + x, 84, 12, 1);
        g2d.fillRect(106 + x, 85, 7, 1);
        g2d.fillRect(107 + x, 86, 9, 1);
        g2d.fillRect(115 + x, 83, 1, 3);
        g2d.fillRect(117 + x, 82, 1, 4);
        g2d.fillRect(118 + x, 81, 2, 5);


        clr7.paint(117 + x, 82 + y, g2d);
        cll7.paint(98 + x, 82 + y, g2d);
        clr.paint(111 + x, 85 + y, g2d);
        cll.paint(103 + x, 85 + y, g2d);
    }
}
