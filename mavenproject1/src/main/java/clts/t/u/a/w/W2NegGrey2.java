/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a.w;

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
public class W2NegGrey2
{
    public W2NegGrey2()
    {
    }

    public static void paintW(Color color, int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(color);
        g2d.fillRect(76 + x, 8 + y, 1, 1);
        g2d.fillRect(74 + x, 16 + y, 1, 1);
        g2d.fillRect(90 + x, 18 + y, 1, 1);
        g2d.fillRect(153 + x, 42 + y, 1, 1);
        g2d.fillRect(65 + x, 72 + y, 1, 1);
        g2d.fillRect(81 + x, 119 + y, 1, 1);
    }
}
