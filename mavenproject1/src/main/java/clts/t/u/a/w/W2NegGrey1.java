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
public class W2NegGrey1
{
    public W2NegGrey1()
    {
    }

    public static void paintW(Color color, int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(color);
        g2d.fillRect(135 + x, 38 + y, 1, 1);
        g2d.fillRect(88 + x, 47 + y, 1, 1);
        g2d.fillRect(129 + x, 47 + y, 1, 1);
        g2d.fillRect(91 + x, 54 + y, 1, 1);
        g2d.fillRect(126 + x, 54 + y, 1, 1);
        g2d.fillRect(90 + x, 72 + y, 1, 1);
        g2d.fillRect(127 + x, 72 + y, 1, 1);
    }
}
