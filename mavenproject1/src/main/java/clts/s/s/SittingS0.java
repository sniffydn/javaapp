/*
 * Shoes0.java
 *
 * Created on March 6, 2007, 8:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.s;

import clts.SuperS;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class SittingS0 extends SuperS
{

    /** Creates a new instance of Shoes0 */
    public SittingS0()
    {
        super();
        includeInAutoPick = false;
    }

    public SittingS0(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeInAutoPick = false;
    }
    
    

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        paintH(offsetX + 5, offsetY + 19, g2d);
        
        
        if(step != prevStep)
        {
            paintBackH(offsetX + 64, offsetY - 16, g2d);
        }else if(step == 0)
        {
            paintH(offsetX, offsetY, g2d);
        }
    }
    
    int prevStep = 0;
    
    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        if(step == prevStep && step == 8)
        {
            paintH(offsetX, offsetY, g2d);
        }
        prevStep = step;
    }

    public void paintH(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(136 + x, 107 + y, 1, 4);
        g2d.fillRect(137 + x, 107 + y, 1, 4);
        g2d.fillRect(138 + x, 107 + y, 1, 6);
        g2d.fillRect(139 + x, 113 + y, 1, 2);
        g2d.fillRect(140 + x, 115 + y, 1, 2);
        g2d.fillRect(141 + x, 115 + y, 1, 2);
        g2d.fillRect(142 + x, 115 + y, 1, 2);
        g2d.fillRect(143 + x, 115 + y, 1, 2);
        g2d.fillRect(144 + x, 115 + y, 1, 2);
        g2d.fillRect(145 + x, 116 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(136 + x, 106 + y, 3, 1);
        g2d.fillRect(135 + x, 107 + y, 1, 4);
        g2d.fillRect(139 + x, 107 + y, 1, 6);
        g2d.fillRect(136 + x, 111 + y, 1, 7);
        g2d.fillRect(137 + x, 111 + y, 1, 1);
        g2d.fillRect(138 + x, 113 + y, 1, 2);
        g2d.fillRect(140 + x, 113 + y, 1, 2);
        g2d.fillRect(141 + x, 114 + y, 5, 1);
        g2d.fillRect(139 + x, 115 + y, 1, 2);
        g2d.fillRect(145 + x, 115 + y, 1, 1);
        g2d.fillRect(146 + x, 116 + y, 1, 2);
        g2d.fillRect(140 + x, 117 + y, 6, 1);
    }
    
    public void paintBackH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 79 + y, 4, 1);
        g2d.fillRect(107 + x, 78 + y, 4, 1);
        g2d.fillRect(107 + x, 77 + y, 6, 1);
        g2d.fillRect(113 + x, 76 + y, 2, 1);
        g2d.fillRect(115 + x, 75 + y, 2, 1);
        g2d.fillRect(115 + x, 74 + y, 2, 1);
        g2d.fillRect(115 + x, 73 + y, 2, 1);
        g2d.fillRect(115 + x, 72 + y, 2, 1);
        g2d.fillRect(115 + x, 71 + y, 2, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 77 + y, 1, 3);
        g2d.fillRect(107 + x, 80 + y, 4, 1);
        g2d.fillRect(107 + x, 76 + y, 6, 1);
        g2d.fillRect(111 + x, 79 + y, 7, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 2, 1);
        g2d.fillRect(113 + x, 75 + y, 2, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 5);
        g2d.fillRect(115 + x, 76 + y, 2, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 69 + y, 2, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 6);
    }
}
