/*
 * Platforms.java
 *
 * Created on March 1, 2007, 12:59 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.*;
import util.Color;
import util.GraphicsMap;
import java.util.Hashtable;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author 6uest
 */
public class Spike extends SuperP
{
    int rightHeightDiff = 0;
    int leftHeightDiff = 0;
    int prevStep = 0;
    /** Creates a new instance of Platforms */
    public Spike(int height)
    {
        super(height);
    }

    public Spike(int height, int width)
    {
        super(height, width);
    }

    public Spike(String height, String width)
    {
        super(height, width);
    }

    public Spike(int height, ColorArray colorsToSwitch)
    {
        super(height, colorsToSwitch);
    }

    public Spike(int height, int width, ColorArray colorsToSwitch)
    {
        super(height, width, colorsToSwitch);
    }

    public SuperC cloneC()
    {
        return new Spike(height, width);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-3 + rightXpos + x, rightYpos, 1, (height + rightHeightDiff) + 1);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {

        g2d.setColor(COLORS.get(ImageUtilities.GREY));

        g2d.fillRect(4 + leftXpos + x, leftYpos, 1, (height + leftHeightDiff) + 1);


    }

    public void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm,int eye)
    {
        super.setStep(iStep, iDirection, iLeftArm, iRightArm,eye);

         if(step == 0){
            leftHeightDiff = 0;
            rightHeightDiff = -1;
        } else if(step == 1){
            leftHeightDiff = 0;
            rightHeightDiff = -1;
        } else if(step == 2){
            leftHeightDiff = 0;
            rightHeightDiff = -1;
        } else if(step == 3){
            leftHeightDiff = 0;
            rightHeightDiff = -1;
        } else if(step == 4){
            leftHeightDiff = 0;
            rightHeightDiff = 0;
        } else if(step == 5){
            leftHeightDiff = 0;
            rightHeightDiff = 1;
        } else if(step == 6){
            leftHeightDiff = 0;
            rightHeightDiff = 1;
        } else if(step == 7){
            leftHeightDiff = 0;
            rightHeightDiff = 1;
        } else if(step == 8){
            leftHeightDiff = -1;
            rightHeightDiff = 0;
        } else if(step == 9){
            leftHeightDiff = -1;
            rightHeightDiff = 0;
        } else if(step == 10){
            leftHeightDiff = -1;
            rightHeightDiff = 0;
        } else if(step == 11){
            leftHeightDiff = -1;
            rightHeightDiff = 0;
        } else if(step == 12){
            leftHeightDiff = 0;
            rightHeightDiff = 0;
        } else if(step == 13){
            leftHeightDiff = 1;
            rightHeightDiff = 0;
        } else if(step == 14){
            leftHeightDiff = 1;
            rightHeightDiff = 0;
        } else if(step == 15){
            leftHeightDiff = 1;
            rightHeightDiff = 0;
        }
    }
}
