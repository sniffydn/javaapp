/*
 * GraphicsMap.java
 *
 * Created on July 17, 2007, 12:44 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

import java.awt.Graphics2D;

/**
 *
 * @author doubleD
 */
public class SecondaryGraphicsMap extends GraphicsMap
{
    Graphics2D g2d = null;
    public SecondaryGraphicsMap(Graphics2D g2d)
    {
        super(216,216);
        this.g2d = g2d;

    }

    public void setColor(Color c)
    {
        g2d.setColor(c.getColor());
    }

    public void fillRect(int x, int y, int w, int h)
    {
        for(int i = 0; i < w; i++)
        {
            for(int j = 0; j < h; j++)
            {
                IntPoint temp = new IntPoint(x + i, y + j);
                if(! points.contains(temp))
                {
                    points.add(temp);
                    g2d.fillRect(x + i, y + j, 1, 1);
                }
            }
        }
    }
}
