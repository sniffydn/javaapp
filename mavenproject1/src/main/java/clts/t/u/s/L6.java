/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.s;

import clts.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class L6 extends SuperTU
{
    public L6()
    {
        super();
        containsTL = true;
        ling = true;
    }

    /** Creates a new instance of GenericClothes */
    public L6(String middle)
    {
        super(middle);
        containsTL = true;
        ling = true;
    }

    public L6(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        ling = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        paintTL2(x,y,g2d);
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU(x,y,g2d);
        
        if(y == 1)
            y = 0;
        paintTL1(x,y,g2d);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equalsIgnoreCase("b"))
        {
            drawB(x,y,g2d);
        }
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawLower(offsetX, 0, g2d);
        
        g2d.setLeftStrap(103 + offsetX, 80 + offsetY);
        g2d.setRightStrap(118 + offsetX, 79 + offsetY);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }
    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 2, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 2, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 3, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 3, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 77 + y, 1, 2);
        g2d.fillRect(122 + x, 77 + y, 1, 2);
        g2d.fillRect(99 + x, 78 + y, 3, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 4);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(121 + x, 78 + y, 1, 2);
        g2d.fillRect(123 + x, 78 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(102 + x, 80 + y, 2, 1);
        g2d.fillRect(117 + x, 80 + y, 1, 3);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 3, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 3);
        g2d.fillRect(105 + x, 82 + y, 1, 2);
        g2d.fillRect(106 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 3);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 2, 1);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 40 + y, 1, 2);
        g2d.fillRect(111 + x, 40 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 2);
        g2d.fillRect(102 + x, 46 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 15);
        g2d.fillRect(104 + x, 60 + y, 1, 7);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 60 + y, 1, 3);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 4);
        g2d.fillRect(116 + x, 60 + y, 1, 10);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 2, 1);
        g2d.fillRect(107 + x, 63 + y, 2, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(106 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 5);
        g2d.fillRect(111 + x, 66 + y, 2, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 2, 1);
        g2d.fillRect(108 + x, 68 + y, 3, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 4);
        g2d.fillRect(104 + x, 69 + y, 1, 6);
        g2d.fillRect(111 + x, 69 + y, 1, 2);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 4);
        g2d.fillRect(109 + x, 70 + y, 2, 1);
        g2d.fillRect(113 + x, 70 + y, 2, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 9);
        g2d.fillRect(106 + x, 71 + y, 3, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 2);
        g2d.fillRect(113 + x, 72 + y, 3, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 2);
        g2d.fillRect(101 + x, 74 + y, 1, 2);
        g2d.fillRect(109 + x, 74 + y, 3, 1);
        g2d.fillRect(100 + x, 75 + y, 1, 3);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(112 + x, 75 + y, 3, 1);
        g2d.fillRect(119 + x, 75 + y, 1, 3);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(120 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 2, 1);
        g2d.fillRect(117 + x, 77 + y, 1, 2);
        g2d.fillRect(102 + x, 78 + y, 3, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 2);
        g2d.fillRect(103 + x, 79 + y, 4, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 2);
        g2d.fillRect(115 + x, 79 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 4, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 3);
        g2d.fillRect(112 + x, 80 + y, 1, 3);
        g2d.fillRect(113 + x, 80 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 4, 1);
        g2d.fillRect(110 + x, 82 + y, 1, 1);




        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 2);
        g2d.fillRect(112 + x, 42 + y, 1, 1);
        g2d.fillRect(113 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 2);
        g2d.fillRect(114 + x, 44 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 8);
        g2d.fillRect(113 + x, 62 + y, 2, 1);
        g2d.fillRect(113 + x, 64 + y, 3, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 2);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(106 + x, 69 + y, 1, 2);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 4);
        g2d.fillRect(116 + x, 72 + y, 1, 6);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 3);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(119 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 3);
        g2d.fillRect(104 + x, 75 + y, 1, 3);
        g2d.fillRect(117 + x, 75 + y, 1, 2);
        g2d.fillRect(101 + x, 76 + y, 2, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 2, 1);
        g2d.fillRect(114 + x, 78 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 3, 1);
        g2d.fillRect(112 + x, 79 + y, 2, 1);
        g2d.fillRect(109 + x, 80 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 60 + y, 2, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 2, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 63 + y, 4, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(108 + x, 65 + y, 1, 3);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 2);
        g2d.fillRect(106 + x, 66 + y, 2, 1);
        g2d.fillRect(111 + x, 67 + y, 2, 1);
        g2d.fillRect(106 + x, 68 + y, 2, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 2, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 2);
        g2d.fillRect(109 + x, 71 + y, 1, 3);
        g2d.fillRect(113 + x, 71 + y, 2, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 2);
        g2d.fillRect(114 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 74 + y, 2, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 3);
        g2d.fillRect(108 + x, 76 + y, 1, 3);
        g2d.fillRect(113 + x, 76 + y, 1, 3);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(115 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 2, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 2);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 2);
        g2d.fillRect(111 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 2, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 2);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 2, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 2);
        g2d.fillRect(111 + x, 71 + y, 1, 3);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 3);
        g2d.fillRect(111 + x, 75 + y, 1, 4);
        g2d.fillRect(109 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(101 + x, 48 + y, 1, 3);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 3, 1);
        g2d.fillRect(113 + x, 51 + y, 3, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 6);
        g2d.fillRect(107 + x, 52 + y, 3, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 2);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 6);
        g2d.fillRect(108 + x, 53 + y, 3, 1);
        g2d.fillRect(109 + x, 54 + y, 2, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 3, 1);
        g2d.fillRect(113 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(102 + x, 50 + y, 2, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 2);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 3);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 3);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 6);
        g2d.fillRect(111 + x, 54 + y, 1, 6);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(109 + x, 55 + y, 1, 4);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 4);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 2, 1);
        g2d.fillRect(114 + x, 59 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 51 + y, 1, 2);
        g2d.fillRect(102 + x, 51 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 52 + y, 3, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 3, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 5);
        g2d.fillRect(106 + x, 54 + y, 1, 4);
        g2d.fillRect(107 + x, 54 + y, 1, 4);
        g2d.fillRect(112 + x, 54 + y, 1, 4);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 4, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(104 + x, 58 + y, 2, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 53 + y, 1, 3);
        g2d.fillRect(102 + x, 53 + y, 1, 4);
        g2d.fillRect(103 + x, 53 + y, 1, 4);
        g2d.fillRect(116 + x, 53 + y, 1, 4);
        g2d.fillRect(117 + x, 53 + y, 1, 4);
        g2d.fillRect(118 + x, 53 + y, 1, 3);
        g2d.fillRect(104 + x, 54 + y, 1, 3);
        g2d.fillRect(105 + x, 54 + y, 1, 3);
        g2d.fillRect(114 + x, 54 + y, 1, 3);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
    }

}
