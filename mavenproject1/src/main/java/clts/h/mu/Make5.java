/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.h.mu;

import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Make5 extends Make1 {

    public Make5() {
        super();
    }

    public Make5(ColorArray colorSwitch) {
        super(colorSwitch);
    }
    
    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        if(Math.random() < .3)
            return new clts.Blank();
        else
            return new MakeUnder();
    }

    public void paintW(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(105 + x, 28 + y, 1, 2);
        g2d.fillRect(106 + x, 28 + y, 1, 2);
        g2d.fillRect(107 + x, 28 + y, 1, 2);
        g2d.fillRect(108 + x, 28 + y, 1, 2);
        g2d.fillRect(109 + x, 28 + y, 1, 2);
        g2d.fillRect(110 + x, 28 + y, 1, 1);
        g2d.fillRect(104 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(111 + x, 28 + y, 1, 1);
        g2d.fillRect(110 + x, 29 + y, 1, 1);
        g2d.fillRect(104 + x, 30 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 24 + y, 1, 4);
        g2d.fillRect(107 + x, 24 + y, 1, 4);
        g2d.fillRect(108 + x, 24 + y, 1, 4);
        g2d.fillRect(109 + x, 24 + y, 1, 4);
        g2d.fillRect(105 + x, 25 + y, 1, 3);
        g2d.fillRect(110 + x, 25 + y, 1, 3);
        g2d.fillRect(111 + x, 26 + y, 1, 2);
        
        paintR(x,y,g2d);
    }


    public void paintO(int x, int y, GraphicsMap g2d) {
        paintL(x,y,g2d);
        paintR(x,y,g2d);
    }

    public void paintBackW(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(110 + x, 28 + y, 1, 2);
        g2d.fillRect(109 + x, 28 + y, 1, 2);
        g2d.fillRect(108 + x, 28 + y, 1, 2);
        g2d.fillRect(107 + x, 28 + y, 1, 2);
        g2d.fillRect(106 + x, 28 + y, 1, 2);
        g2d.fillRect(105 + x, 28 + y, 1, 1);
        g2d.fillRect(111 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(104 + x, 28 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 1);
        g2d.fillRect(105 + x, 29 + y, 1, 1);
        g2d.fillRect(106 + x, 30 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 24 + y, 1, 4);
        g2d.fillRect(108 + x, 24 + y, 1, 4);
        g2d.fillRect(107 + x, 24 + y, 1, 4);
        g2d.fillRect(106 + x, 24 + y, 1, 4);
        g2d.fillRect(110 + x, 25 + y, 1, 3);
        g2d.fillRect(105 + x, 25 + y, 1, 3);
        g2d.fillRect(104 + x, 26 + y, 1, 2);
        
        paintBackR(x,y,g2d);
    }


    public void paintBackO(int x, int y, GraphicsMap g2d) {
        paintBackL(x,y,g2d);
        paintBackR(x,y,g2d);
    }

    public void paintR(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(119 + x, 26 + y, 1, 2);
        g2d.fillRect(118 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 25 + y, 2, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 1);
        g2d.fillRect(115 + x, 27 + y, 1, 1);
    }

    public void paintL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(105 + x, 26 + y, 1, 2);
        g2d.fillRect(109 + x, 26 + y, 1, 1);
        g2d.fillRect(106 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(104 + x, 24 + y, 1, 3);
        g2d.fillRect(105 + x, 24 + y, 1, 2);
        g2d.fillRect(106 + x, 25 + y, 4, 1);
        g2d.fillRect(110 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 24 + y, 4, 1);
        g2d.fillRect(110 + x, 25 + y, 1, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
    }

    public void paintBackR(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(96 + x, 26 + y, 1, 2);
        g2d.fillRect(97 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 25 + y, 2, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 1);
        g2d.fillRect(100 + x, 27 + y, 1, 1);
    }

    public void paintBackL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(110 + x, 26 + y, 1, 2);
        g2d.fillRect(106 + x, 26 + y, 1, 1);
        g2d.fillRect(109 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(111 + x, 24 + y, 1, 3);
        g2d.fillRect(110 + x, 24 + y, 1, 2);
        g2d.fillRect(106 + x, 25 + y, 4, 1);
        g2d.fillRect(105 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 24 + y, 4, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_7, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_6, new Color(33, 33, 33));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
