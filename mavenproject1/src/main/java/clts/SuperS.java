/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 3:58 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts;

import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class SuperS extends SuperC
{
    public int upperPlatzHeight = 13;
    public int lowerPlatzHeight = 2;
    public boolean strap = false;
    public boolean strapAllowed = true;
    public boolean sockAllowed = true;
    public boolean notSlenderS = false;
    public boolean sock = false;
    public boolean nurse = false;
    public boolean police = false;
    
    public int leftXStrapLoc = -1;
    public int leftYStrapLoc = -1;
    public int rightXStrapLoc = -1;
    public int rightYStrapLoc = -1;
    

    public int leftXpos = 0;
    public int rightXpos = 0;
    public int leftYpos = 0;
    public int rightYpos = 0;
    /** Creates a new instance of Shoes1 */
    public SuperS()
    {
        setStep(0,0,0,0,0);
    }

    public SuperS(ColorArray colorSwitch)
    {
        COLORS = colorSwitch;
        setStep(0,0,0,0,0);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d){}

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(step <= 12 && step > 3)
        {
            paintLeft(offsetX, g2d);
        }
        else
        {
            paintRight(offsetX, g2d);
        }
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(step <= 12 && step > 3)
        {
            paintRight(offsetX, g2d);
        }
        else
        {
            paintLeft(offsetX, g2d);
        }
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d){}

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d){}

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d){}

    b.Bd b = new b.Bd();
    public void drawBody(b.Bd bd) {
        b = bd;
    }
    
    public void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm,int eye)
    {
        step = iStep;
        if(step == 0){
            leftXpos = 25;
            leftYpos = 162;
            rightXpos = 29;
            rightYpos = 162;
        } else if(step == 1){
            leftXpos = 25;
            leftYpos = 162;
            rightXpos = 30;
            rightYpos = 158;
        } else if(step == 2){
            leftXpos = 24;
            leftYpos = 162;
            rightXpos = 30;
            rightYpos = 154;
        } else if(step == 3){
            leftXpos = 23;
            leftYpos = 162;
            rightXpos = 31;
            rightYpos = 148;
        } else if(step == 4){
            leftXpos = 23;
            leftYpos = 162;
            rightXpos = 32;
            rightYpos = 144;
        } else if(step == 5){
            leftXpos = 23;
            leftYpos = 162;
            rightXpos = 31;
            rightYpos = 148;
        } else if(step == 6){
            leftXpos = 24;
            leftYpos = 162;
            rightXpos = 30;
            rightYpos = 154;
        } else if(step == 7){
            leftXpos = 25;
            leftYpos = 162;
            rightXpos = 30;
            rightYpos = 158;
        } else if(step == 8){
            leftXpos = 25;
            leftYpos = 162;
            rightXpos = 29;
            rightYpos = 162;
        } else if(step == 9){
            leftXpos = 24;
            leftYpos = 158;
            rightXpos = 29;
            rightYpos = 162;
        } else if(step == 10){
            leftXpos = 24;
            leftYpos = 154;
            rightXpos = 30;
            rightYpos = 162;
        } else if(step == 11){
            leftXpos = 23;
            leftYpos = 148;
            rightXpos = 31;
            rightYpos = 162;
        } else if(step == 12){
            leftXpos = 22;
            leftYpos = 144;
            rightXpos = 31;
            rightYpos = 162;
        } else if(step == 13){
            leftXpos = 23;
            leftYpos = 148;
            rightXpos = 31;
            rightYpos = 162;
        } else if(step == 14){
            leftXpos = 24;
            leftYpos = 154;
            rightXpos = 30;
            rightYpos = 162;
        } else if(step == 15){
            leftXpos = 24;
            leftYpos = 158;
            rightXpos = 29;
            rightYpos = 162;
        }
        leftXpos = leftXpos + 84;
        rightXpos = rightXpos + 84;
        leftYpos += b.getLegLength() + b.getLegPosition();
        rightYpos += b.getLegLength() + b.getLegPosition();
    }
    public void paintRight(int x, GraphicsMap g2d)
    {
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
    }

    public SuperC cloneC()
    {
        Class [] classParm = null;
        Object [] objectParm = null;
        Class c = this.getClass();
        try
        {
            java.lang.reflect.Constructor co = c.getConstructor(classParm);
            return (SuperC) co.newInstance(objectParm);
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
