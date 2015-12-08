/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperTL;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Clipboard0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Clipboard0()
    {
        super(2);
    }

    public Clipboard0(int layer)
    {
        super(layer);
    }

    public Clipboard0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Clipboard0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        x += shiftX;
        paintClipBoard(x,shiftY,g2d);
    }

    public void paintClipBoard(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(new Color(0,0,0,255));
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 1);
        g2d.fillRect(99 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(93 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(92 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(91 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(90 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(89 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(90 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(91 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(92 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(93 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(94 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 95 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(96 + x, 97 + y, 1, 1);
        g2d.fillRect(98 + x, 97 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 1);


        g2d.setColor(new Color(49,0,0,255));
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(98 + x, 81 + y, 1, 3);
        g2d.fillRect(99 + x, 81 + y, 1, 2);
        g2d.fillRect(97 + x, 82 + y, 1, 3);
        g2d.fillRect(96 + x, 83 + y, 1, 3);
        g2d.fillRect(95 + x, 84 + y, 1, 3);
        g2d.fillRect(94 + x, 85 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(93 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(92 + x, 88 + y, 1, 5);
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(91 + x, 89 + y, 1, 3);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(90 + x, 90 + y, 1, 1);
        g2d.fillRect(93 + x, 90 + y, 1, 4);
        g2d.fillRect(103 + x, 90 + y, 1, 2);
        g2d.fillRect(94 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(95 + x, 92 + y, 1, 4);
        g2d.fillRect(101 + x, 92 + y, 1, 2);
        g2d.fillRect(96 + x, 93 + y, 1, 4);
        g2d.fillRect(100 + x, 93 + y, 1, 2);
        g2d.fillRect(97 + x, 94 + y, 1, 4);
        g2d.fillRect(99 + x, 94 + y, 1, 2);
        g2d.fillRect(98 + x, 95 + y, 1, 2);


        g2d.setColor(new Color(49,49,49,255));
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 3);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 83 + y, 2, 1);


        g2d.setColor(new Color(115,115,115,255));
        g2d.fillRect(106 + x, 80 + y, 1, 3);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 2, 1);


        g2d.setColor(new Color(255,255,255,255));
        g2d.fillRect(102 + x, 80 + y, 1, 4);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 82 + y, 1, 11);
        g2d.fillRect(103 + x, 82 + y, 1, 3);
        g2d.fillRect(99 + x, 83 + y, 1, 5);
        g2d.fillRect(104 + x, 83 + y, 1, 6);
        g2d.fillRect(98 + x, 84 + y, 1, 3);
        g2d.fillRect(101 + x, 84 + y, 1, 3);
        g2d.fillRect(105 + x, 84 + y, 1, 4);
        g2d.fillRect(97 + x, 85 + y, 1, 5);
        g2d.fillRect(102 + x, 85 + y, 1, 3);
        g2d.fillRect(106 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(96 + x, 86 + y, 1, 7);
        g2d.fillRect(103 + x, 86 + y, 1, 4);
        g2d.fillRect(95 + x, 87 + y, 1, 5);
        g2d.fillRect(94 + x, 88 + y, 1, 3);
        g2d.fillRect(98 + x, 88 + y, 1, 3);
        g2d.fillRect(101 + x, 88 + y, 1, 4);
        g2d.fillRect(93 + x, 89 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 5);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(97 + x, 91 + y, 1, 3);
        g2d.fillRect(98 + x, 92 + y, 1, 3);
    }
}
