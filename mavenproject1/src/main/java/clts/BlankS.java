/*
 * clothes.java
 */

package clts;

import util.Color;
import util.GraphicsMap;
import java.util.Hashtable;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class BlankS extends SuperS
{
    public int step = 0;
    public int extras = -1;//frillies = 0
    public Hashtable hash = null;
    public ColorArray COLORS = new ColorArray();
    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d){}
    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d){}
    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d){}
    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d){}
    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d){}
    public void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm,int eye){}
    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d){}


    public void setLayer(int layer)
    {
        ;
    }

    public void setMiddle(String middle)
    {
        ;
    }

    public SuperC cloneC()
    {
        return this;
    }
}
