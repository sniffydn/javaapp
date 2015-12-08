/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.h;

import clts.*;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import clts.t.u.a.T0;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class H12 extends SuperTL
{
    int direction = 0;
    public H12()
    {
        super();
    }

    public H12(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
    }


    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintBack(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if(direction == 1)
            paintT(offsetX, 0,g2d);
        else
            paintBackT(offsetX, 0,g2d);
    }

    public void paintT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(new Color(112,148,138,255));
        g2d.fillRect(112 + x, 0 + y, 1, 14);
        g2d.fillRect(113 + x, 2 + y, 1, 4);
        g2d.fillRect(98 + x, 3 + y, 2, 1);
        g2d.fillRect(104 + x, 3 + y, 2, 1);
        g2d.fillRect(119 + x, 3 + y, 1, 2);
        g2d.fillRect(120 + x, 3 + y, 1, 4);
        g2d.fillRect(99 + x, 4 + y, 2, 1);
        g2d.fillRect(105 + x, 4 + y, 1, 2);
        g2d.fillRect(106 + x, 4 + y, 1, 1);
        g2d.fillRect(100 + x, 5 + y, 1, 2);
        g2d.fillRect(101 + x, 5 + y, 1, 1);
        g2d.fillRect(107 + x, 5 + y, 1, 2);
        g2d.fillRect(118 + x, 5 + y, 1, 3);
        g2d.fillRect(94 + x, 6 + y, 2, 1);
        g2d.fillRect(102 + x, 6 + y, 1, 1);
        g2d.fillRect(106 + x, 6 + y, 1, 2);
        g2d.fillRect(114 + x, 6 + y, 1, 4);
        g2d.fillRect(95 + x, 7 + y, 4, 1);
        g2d.fillRect(101 + x, 7 + y, 1, 1);
        g2d.fillRect(103 + x, 7 + y, 1, 1);
        g2d.fillRect(108 + x, 7 + y, 1, 1);
        g2d.fillRect(119 + x, 7 + y, 1, 5);
        g2d.fillRect(96 + x, 8 + y, 1, 1);
        g2d.fillRect(99 + x, 8 + y, 1, 1);
        g2d.fillRect(102 + x, 8 + y, 1, 1);
        g2d.fillRect(107 + x, 8 + y, 1, 2);
        g2d.fillRect(109 + x, 8 + y, 1, 1);
        g2d.fillRect(117 + x, 8 + y, 1, 3);
        g2d.fillRect(124 + x, 8 + y, 2, 1);
        g2d.fillRect(97 + x, 9 + y, 1, 1);
        g2d.fillRect(100 + x, 9 + y, 2, 1);
        g2d.fillRect(103 + x, 9 + y, 1, 3);
        g2d.fillRect(105 + x, 9 + y, 1, 1);
        g2d.fillRect(110 + x, 9 + y, 1, 2);
        g2d.fillRect(122 + x, 9 + y, 2, 1);
        g2d.fillRect(125 + x, 9 + y, 1, 1);
        g2d.fillRect(98 + x, 10 + y, 1, 1);
        g2d.fillRect(101 + x, 10 + y, 2, 1);
        g2d.fillRect(106 + x, 10 + y, 1, 2);
        g2d.fillRect(108 + x, 10 + y, 1, 3);
        g2d.fillRect(115 + x, 10 + y, 1, 3);
        g2d.fillRect(121 + x, 10 + y, 1, 1);
        g2d.fillRect(124 + x, 10 + y, 1, 1);
        g2d.fillRect(99 + x, 11 + y, 2, 1);
        g2d.fillRect(104 + x, 11 + y, 2, 1);
        g2d.fillRect(111 + x, 11 + y, 1, 2);
        g2d.fillRect(116 + x, 11 + y, 1, 2);
        g2d.fillRect(118 + x, 11 + y, 1, 1);
        g2d.fillRect(120 + x, 11 + y, 1, 3);
        g2d.fillRect(123 + x, 11 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 2);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);
        g2d.fillRect(122 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 2, 1);
        g2d.fillRect(121 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 4, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 5, 1);
        g2d.fillRect(116 + x, 15 + y, 3, 1);
        g2d.fillRect(111 + x, 16 + y, 5, 1);


        g2d.setColor(new Color(148,188,167,255));
        g2d.fillRect(101 + x, 11 + y, 1, 2);
        g2d.fillRect(102 + x, 11 + y, 1, 3);
        g2d.fillRect(118 + x, 12 + y, 1, 3);
        g2d.fillRect(119 + x, 12 + y, 1, 2);


        g2d.setColor(new Color(156,204,180,255));
        g2d.fillRect(103 + x, 12 + y, 1, 2);
        g2d.fillRect(104 + x, 12 + y, 1, 2);
        g2d.fillRect(105 + x, 12 + y, 1, 2);
        g2d.fillRect(115 + x, 13 + y, 3, 1);
        g2d.fillRect(116 + x, 14 + y, 2, 1);


        g2d.setColor(new Color(172,212,191,255));
        g2d.fillRect(106 + x, 12 + y, 1, 3);
        g2d.fillRect(107 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 2);


        g2d.setColor(new Color(184,220,200,255));
        g2d.fillRect(106 + x, 5 + y, 1, 1);
        g2d.fillRect(119 + x, 5 + y, 1, 2);
        g2d.fillRect(101 + x, 6 + y, 1, 1);
        g2d.fillRect(113 + x, 6 + y, 1, 7);
        g2d.fillRect(102 + x, 7 + y, 1, 1);
        g2d.fillRect(107 + x, 7 + y, 1, 1);
        g2d.fillRect(97 + x, 8 + y, 2, 1);
        g2d.fillRect(103 + x, 8 + y, 1, 1);
        g2d.fillRect(108 + x, 8 + y, 1, 2);
        g2d.fillRect(118 + x, 8 + y, 1, 3);
        g2d.fillRect(98 + x, 9 + y, 2, 1);
        g2d.fillRect(104 + x, 9 + y, 1, 2);
        g2d.fillRect(109 + x, 9 + y, 1, 3);
        g2d.fillRect(124 + x, 9 + y, 1, 1);
        g2d.fillRect(99 + x, 10 + y, 2, 1);
        g2d.fillRect(105 + x, 10 + y, 1, 1);
        g2d.fillRect(114 + x, 10 + y, 1, 3);
        g2d.fillRect(122 + x, 10 + y, 1, 2);
        g2d.fillRect(123 + x, 10 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(117 + x, 11 + y, 1, 1);
        g2d.fillRect(121 + x, 11 + y, 1, 2);
        g2d.fillRect(110 + x, 13 + y, 1, 2);
        g2d.fillRect(111 + x, 13 + y, 1, 3);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
    }





    public void paintBackT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(new Color(112,148,138,255));
        g2d.fillRect(103 + x, 0 + y, 1, 14);
        g2d.fillRect(102 + x, 2 + y, 1, 4);
        g2d.fillRect(116 + x, 3 + y, 2, 1);
        g2d.fillRect(110 + x, 3 + y, 2, 1);
        g2d.fillRect(96 + x, 3 + y, 1, 2);
        g2d.fillRect(95 + x, 3 + y, 1, 4);
        g2d.fillRect(115 + x, 4 + y, 2, 1);
        g2d.fillRect(110 + x, 4 + y, 1, 2);
        g2d.fillRect(109 + x, 4 + y, 1, 1);
        g2d.fillRect(115 + x, 5 + y, 1, 2);
        g2d.fillRect(114 + x, 5 + y, 1, 1);
        g2d.fillRect(108 + x, 5 + y, 1, 2);
        g2d.fillRect(97 + x, 5 + y, 1, 3);
        g2d.fillRect(120 + x, 6 + y, 2, 1);
        g2d.fillRect(113 + x, 6 + y, 1, 1);
        g2d.fillRect(109 + x, 6 + y, 1, 2);
        g2d.fillRect(101 + x, 6 + y, 1, 4);
        g2d.fillRect(117 + x, 7 + y, 4, 1);
        g2d.fillRect(114 + x, 7 + y, 1, 1);
        g2d.fillRect(112 + x, 7 + y, 1, 1);
        g2d.fillRect(107 + x, 7 + y, 1, 1);
        g2d.fillRect(96 + x, 7 + y, 1, 5);
        g2d.fillRect(119 + x, 8 + y, 1, 1);
        g2d.fillRect(116 + x, 8 + y, 1, 1);
        g2d.fillRect(113 + x, 8 + y, 1, 1);
        g2d.fillRect(108 + x, 8 + y, 1, 2);
        g2d.fillRect(106 + x, 8 + y, 1, 1);
        g2d.fillRect(98 + x, 8 + y, 1, 3);
        g2d.fillRect(90 + x, 8 + y, 2, 1);
        g2d.fillRect(118 + x, 9 + y, 1, 1);
        g2d.fillRect(114 + x, 9 + y, 2, 1);
        g2d.fillRect(112 + x, 9 + y, 1, 3);
        g2d.fillRect(110 + x, 9 + y, 1, 1);
        g2d.fillRect(105 + x, 9 + y, 1, 2);
        g2d.fillRect(92 + x, 9 + y, 2, 1);
        g2d.fillRect(90 + x, 9 + y, 1, 1);
        g2d.fillRect(117 + x, 10 + y, 1, 1);
        g2d.fillRect(113 + x, 10 + y, 2, 1);
        g2d.fillRect(109 + x, 10 + y, 1, 2);
        g2d.fillRect(107 + x, 10 + y, 1, 3);
        g2d.fillRect(100 + x, 10 + y, 1, 3);
        g2d.fillRect(94 + x, 10 + y, 1, 1);
        g2d.fillRect(91 + x, 10 + y, 1, 1);
        g2d.fillRect(115 + x, 11 + y, 2, 1);
        g2d.fillRect(110 + x, 11 + y, 2, 1);
        g2d.fillRect(104 + x, 11 + y, 1, 2);
        g2d.fillRect(99 + x, 11 + y, 1, 2);
        g2d.fillRect(97 + x, 11 + y, 1, 1);
        g2d.fillRect(95 + x, 11 + y, 1, 3);
        g2d.fillRect(92 + x, 11 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 2);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(93 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 2, 1);
        g2d.fillRect(94 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 4, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 5, 1);
        g2d.fillRect(97 + x, 15 + y, 3, 1);
        g2d.fillRect(100 + x, 16 + y, 5, 1);


        g2d.setColor(new Color(148,188,167,255));
        g2d.fillRect(114 + x, 11 + y, 1, 2);
        g2d.fillRect(113 + x, 11 + y, 1, 3);
        g2d.fillRect(97 + x, 12 + y, 1, 3);
        g2d.fillRect(96 + x, 12 + y, 1, 2);


        g2d.setColor(new Color(156,204,180,255));
        g2d.fillRect(112 + x, 12 + y, 1, 2);
        g2d.fillRect(111 + x, 12 + y, 1, 2);
        g2d.fillRect(110 + x, 12 + y, 1, 2);
        g2d.fillRect(98 + x, 13 + y, 3, 1);
        g2d.fillRect(98 + x, 14 + y, 2, 1);


        g2d.setColor(new Color(172,212,191,255));
        g2d.fillRect(109 + x, 12 + y, 1, 3);
        g2d.fillRect(108 + x, 13 + y, 1, 2);
        g2d.fillRect(106 + x, 13 + y, 2, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 2);


        g2d.setColor(new Color(184,220,200,255));
        g2d.fillRect(109 + x, 5 + y, 1, 1);
        g2d.fillRect(96 + x, 5 + y, 1, 2);
        g2d.fillRect(114 + x, 6 + y, 1, 1);
        g2d.fillRect(102 + x, 6 + y, 1, 7);
        g2d.fillRect(113 + x, 7 + y, 1, 1);
        g2d.fillRect(108 + x, 7 + y, 1, 1);
        g2d.fillRect(117 + x, 8 + y, 2, 1);
        g2d.fillRect(112 + x, 8 + y, 1, 1);
        g2d.fillRect(107 + x, 8 + y, 1, 2);
        g2d.fillRect(97 + x, 8 + y, 1, 3);
        g2d.fillRect(116 + x, 9 + y, 2, 1);
        g2d.fillRect(111 + x, 9 + y, 1, 2);
        g2d.fillRect(106 + x, 9 + y, 1, 3);
        g2d.fillRect(91 + x, 9 + y, 1, 1);
        g2d.fillRect(115 + x, 10 + y, 2, 1);
        g2d.fillRect(110 + x, 10 + y, 1, 1);
        g2d.fillRect(101 + x, 10 + y, 1, 3);
        g2d.fillRect(93 + x, 10 + y, 1, 2);
        g2d.fillRect(92 + x, 10 + y, 1, 1);
        g2d.fillRect(105 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 11 + y, 1, 1);
        g2d.fillRect(94 + x, 11 + y, 1, 2);
        g2d.fillRect(105 + x, 13 + y, 1, 2);
        g2d.fillRect(104 + x, 13 + y, 1, 3);
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
    }
}
