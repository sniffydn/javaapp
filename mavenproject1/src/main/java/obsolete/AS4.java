/*
 * AnkleStrap1.java
 *
 * Created on March 6, 2007, 9:10 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.s.as.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class AS4 extends AS1
{
    int location = 0;
    /** Creates a new instance of AnkleStrap0 */
    public AS4()
    {
        super();
    }

    public AS4(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public AS4(int distanceFromTop)
    {
        super();
        location = distanceFromTop;
    }

    public AS4(int distanceFromTop, ColorArray colorSwitch)
    {
        super(colorSwitch);
        location = distanceFromTop;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        super.paintRight(x, g2d);

        if(step == 2 || step == 3 || step == 4)
            ;
        else
            x++;
        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(rightXpos - 3 + x, -(15 - location) + rightYpos, 1, 3);
        g2d.fillRect(rightXpos - 5 + x, -(14 - location) + rightYpos, 2, 1);
        g2d.fillRect(rightXpos - 2 + x, -(14 - location) + rightYpos, 1, 3);
        g2d.fillRect(rightXpos - 1 + x, -(14 - location) + rightYpos, 1, 1);
        g2d.fillRect(rightXpos - 4 + x, -(13 - location) + rightYpos, 1, 2);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {

        super.paintLeft(x, g2d);

        if(step == 9 || step == 10 || step == 11)
            ;
        else
            x--;
        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(leftXpos + 3 + x, -(15 - location) + leftYpos, 1, 3);
        g2d.fillRect(leftXpos + 4 + x, -(14 - location) + leftYpos, 2, 1);
        g2d.fillRect(leftXpos + 2 + x, -(14 - location) + leftYpos, 1, 3);
        g2d.fillRect(leftXpos + 1 + x, -(14 - location) + leftYpos, 1, 1);
        g2d.fillRect(leftXpos + 4 + x, -(13 - location) + leftYpos, 1, 2);
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
