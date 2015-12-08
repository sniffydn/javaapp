/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.*;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D32 extends SuperTU
{

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }

    boolean originalColorArray = true;
    boolean switcher = false;

    public D32()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 5;
    }

    public D32(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 5;
    }

    public D32(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 5;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL1(x,0,g2d);
        paintTL2(x,y,g2d);
        paintTL3(x,y + prevY - 1, g2d);

        prevY = y;

    }
    int prevY = 0;


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU(x,y,g2d);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equals("b"))
        {
            drawB(x,y,g2d);
        }
    }



    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTB(offsetX, prevY, g2d);
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawLower(offsetX, offsetY, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintTB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,90,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(94 + x, 102 + y, 2, 1);
        g2d.fillRect(94 + x, 105 + y, 2, 1);
        g2d.fillRect(98 + x, 105 + y, 2, 1);
        g2d.fillRect(93 + x, 106 + y, 1, 2);
        g2d.fillRect(97 + x, 106 + y, 1, 1);
        g2d.fillRect(96 + x, 107 + y, 1, 2);
        g2d.fillRect(105 + x, 116 + y, 2, 1);
        g2d.fillRect(107 + x, 117 + y, 2, 1);
        g2d.fillRect(125 + x, 136 + y, 1, 1);
        g2d.fillRect(128 + x, 137 + y, 1, 5);
        g2d.fillRect(122 + x, 140 + y, 1, 2);
        g2d.fillRect(123 + x, 140 + y, 1, 2);
        g2d.fillRect(125 + x, 140 + y, 1, 1);
        g2d.fillRect(124 + x, 141 + y, 1, 3);
        g2d.fillRect(126 + x, 142 + y, 1, 3);
        g2d.fillRect(123 + x, 144 + y, 1, 1);
        g2d.fillRect(128 + x, 144 + y, 1, 9);
        g2d.fillRect(125 + x, 145 + y, 1, 1);
        g2d.fillRect(127 + x, 145 + y, 1, 1);
        g2d.fillRect(126 + x, 148 + y, 1, 1);
        g2d.fillRect(126 + x, 150 + y, 1, 1);
        g2d.fillRect(127 + x, 151 + y, 1, 4);
        g2d.fillRect(126 + x, 156 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,123,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(97 + x, 105 + y, 1, 1);
        g2d.fillRect(97 + x, 107 + y, 1, 3);
        g2d.fillRect(96 + x, 109 + y, 1, 1);
        g2d.fillRect(101 + x, 110 + y, 1, 1);
        g2d.fillRect(94 + x, 112 + y, 1, 2);
        g2d.fillRect(95 + x, 112 + y, 1, 2);
        g2d.fillRect(93 + x, 114 + y, 1, 1);
        g2d.fillRect(104 + x, 115 + y, 1, 2);
        g2d.fillRect(103 + x, 118 + y, 1, 2);
        g2d.fillRect(104 + x, 118 + y, 1, 2);
        g2d.fillRect(108 + x, 118 + y, 1, 1);
        g2d.fillRect(109 + x, 120 + y, 1, 1);
        g2d.fillRect(118 + x, 121 + y, 1, 3);
        g2d.fillRect(110 + x, 122 + y, 1, 1);
        g2d.fillRect(96 + x, 123 + y, 1, 2);
        g2d.fillRect(117 + x, 124 + y, 1, 2);
        g2d.fillRect(97 + x, 125 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 4);
        g2d.fillRect(127 + x, 136 + y, 1, 1);
        g2d.fillRect(127 + x, 138 + y, 1, 2);
        g2d.fillRect(124 + x, 140 + y, 1, 1);
        g2d.fillRect(126 + x, 140 + y, 1, 2);
        g2d.fillRect(127 + x, 141 + y, 1, 1);
        g2d.fillRect(122 + x, 142 + y, 1, 2);
        g2d.fillRect(123 + x, 142 + y, 1, 2);
        g2d.fillRect(128 + x, 142 + y, 1, 2);
        g2d.fillRect(129 + x, 142 + y, 1, 4);
        g2d.fillRect(123 + x, 145 + y, 1, 2);
        g2d.fillRect(124 + x, 145 + y, 1, 3);
        g2d.fillRect(126 + x, 145 + y, 1, 1);
        g2d.fillRect(127 + x, 147 + y, 1, 4);
        g2d.fillRect(123 + x, 148 + y, 1, 1);
        g2d.fillRect(126 + x, 149 + y, 1, 1);
        g2d.fillRect(129 + x, 149 + y, 1, 2);
        g2d.fillRect(124 + x, 150 + y, 1, 2);
        g2d.fillRect(125 + x, 150 + y, 1, 1);
        g2d.fillRect(126 + x, 151 + y, 1, 2);
        g2d.fillRect(128 + x, 153 + y, 1, 2);
        g2d.fillRect(129 + x, 153 + y, 1, 2);
        g2d.fillRect(126 + x, 154 + y, 1, 2);
        g2d.fillRect(127 + x, 155 + y, 1, 3);
        g2d.fillRect(128 + x, 156 + y, 1, 1);
        g2d.fillRect(125 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132,132,132,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 123 + y, 1, 1);
        g2d.fillRect(125 + x, 137 + y, 1, 3);
        g2d.fillRect(127 + x, 137 + y, 1, 1);
        g2d.fillRect(124 + x, 139 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,148,148,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 103 + y, 1, 2);
        g2d.fillRect(95 + x, 103 + y, 1, 2);
        g2d.fillRect(93 + x, 105 + y, 1, 1);
        g2d.fillRect(94 + x, 106 + y, 1, 2);
        g2d.fillRect(95 + x, 106 + y, 2, 1);
        g2d.fillRect(94 + x, 110 + y, 1, 2);
        g2d.fillRect(95 + x, 110 + y, 1, 2);
        g2d.fillRect(108 + x, 125 + y, 1, 1);
        g2d.fillRect(107 + x, 128 + y, 1, 1);
        g2d.fillRect(122 + x, 132 + y, 1, 2);
        g2d.fillRect(118 + x, 133 + y, 1, 1);
        g2d.fillRect(125 + x, 141 + y, 1, 4);
        g2d.fillRect(125 + x, 146 + y, 1, 2);
        g2d.fillRect(127 + x, 146 + y, 1, 1);
        g2d.fillRect(124 + x, 148 + y, 1, 1);
        g2d.fillRect(126 + x, 153 + y, 1, 1);
        g2d.fillRect(125 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,156,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(96 + x, 105 + y, 1, 1);
        g2d.fillRect(95 + x, 107 + y, 1, 2);
        g2d.fillRect(94 + x, 108 + y, 1, 1);
        g2d.fillRect(101 + x, 108 + y, 1, 2);
        g2d.fillRect(93 + x, 109 + y, 1, 5);
        g2d.fillRect(100 + x, 110 + y, 1, 1);
        g2d.fillRect(92 + x, 111 + y, 1, 3);
        g2d.fillRect(101 + x, 111 + y, 1, 2);
        g2d.fillRect(100 + x, 112 + y, 1, 4);
        g2d.fillRect(91 + x, 114 + y, 1, 1);
        g2d.fillRect(104 + x, 114 + y, 1, 1);
        g2d.fillRect(92 + x, 115 + y, 1, 2);
        g2d.fillRect(93 + x, 115 + y, 1, 2);
        g2d.fillRect(96 + x, 115 + y, 1, 1);
        g2d.fillRect(99 + x, 116 + y, 1, 1);
        g2d.fillRect(103 + x, 116 + y, 1, 2);
        g2d.fillRect(98 + x, 117 + y, 1, 6);
        g2d.fillRect(104 + x, 117 + y, 1, 1);
        g2d.fillRect(93 + x, 118 + y, 3, 1);
        g2d.fillRect(102 + x, 118 + y, 1, 3);
        g2d.fillRect(95 + x, 119 + y, 1, 2);
        g2d.fillRect(103 + x, 120 + y, 1, 3);
        g2d.fillRect(118 + x, 120 + y, 1, 1);
        g2d.fillRect(110 + x, 121 + y, 1, 1);
        g2d.fillRect(93 + x, 122 + y, 2, 1);
        g2d.fillRect(97 + x, 122 + y, 1, 3);
        g2d.fillRect(109 + x, 122 + y, 1, 2);
        g2d.fillRect(94 + x, 123 + y, 2, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 2);
        g2d.fillRect(111 + x, 123 + y, 1, 2);
        g2d.fillRect(95 + x, 124 + y, 1, 1);
        g2d.fillRect(102 + x, 124 + y, 1, 6);
        g2d.fillRect(118 + x, 124 + y, 1, 2);
        g2d.fillRect(119 + x, 124 + y, 1, 1);
        g2d.fillRect(117 + x, 126 + y, 1, 2);
        g2d.fillRect(98 + x, 127 + y, 1, 2);
        g2d.fillRect(100 + x, 130 + y, 1, 1);
        g2d.fillRect(102 + x, 131 + y, 1, 1);
        g2d.fillRect(116 + x, 131 + y, 1, 1);
        g2d.fillRect(104 + x, 132 + y, 1, 2);
        g2d.fillRect(107 + x, 132 + y, 1, 1);
        g2d.fillRect(117 + x, 134 + y, 1, 2);
        g2d.fillRect(118 + x, 136 + y, 1, 1);
        g2d.fillRect(126 + x, 136 + y, 1, 4);
        g2d.fillRect(128 + x, 136 + y, 1, 1);
        g2d.fillRect(120 + x, 139 + y, 2, 1);
        g2d.fillRect(123 + x, 139 + y, 1, 1);
        g2d.fillRect(121 + x, 140 + y, 1, 1);
        g2d.fillRect(127 + x, 140 + y, 1, 1);
        g2d.fillRect(125 + x, 151 + y, 1, 3);
        g2d.fillRect(129 + x, 151 + y, 1, 1);
        g2d.fillRect(130 + x, 153 + y, 1, 4);
        g2d.fillRect(129 + x, 156 + y, 1, 1);
        g2d.fillRect(131 + x, 156 + y, 1, 1);
        g2d.fillRect(128 + x, 157 + y, 1, 2);
        g2d.fillRect(132 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,189,82,255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(102 + x, 112 + y, 1, 2);
        g2d.fillRect(103 + x, 112 + y, 1, 1);
        g2d.fillRect(101 + x, 114 + y, 1, 2);
        g2d.fillRect(100 + x, 116 + y, 1, 3);
        g2d.fillRect(99 + x, 117 + y, 1, 5);
        g2d.fillRect(102 + x, 121 + y, 1, 3);
        g2d.fillRect(101 + x, 123 + y, 1, 3);
        g2d.fillRect(103 + x, 123 + y, 1, 1);
        g2d.fillRect(121 + x, 127 + y, 1, 3);
        g2d.fillRect(107 + x, 129 + y, 1, 3);
        g2d.fillRect(101 + x, 130 + y, 1, 1);
        g2d.fillRect(122 + x, 130 + y, 1, 1);
        g2d.fillRect(105 + x, 131 + y, 1, 2);
        g2d.fillRect(106 + x, 131 + y, 1, 2);
        g2d.fillRect(119 + x, 134 + y, 1, 1);
        g2d.fillRect(123 + x, 134 + y, 1, 1);
        g2d.fillRect(122 + x, 135 + y, 1, 1);
        g2d.fillRect(118 + x, 137 + y, 1, 1);
        g2d.fillRect(119 + x, 138 + y, 1, 2);
        g2d.fillRect(130 + x, 139 + y, 1, 3);
        g2d.fillRect(129 + x, 152 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,173,165,255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(99 + x, 107 + y, 1, 2);
        g2d.fillRect(100 + x, 107 + y, 1, 2);
        g2d.fillRect(98 + x, 109 + y, 1, 1);
        g2d.fillRect(109 + x, 121 + y, 1, 1);
        g2d.fillRect(108 + x, 123 + y, 1, 2);
        g2d.fillRect(120 + x, 123 + y, 1, 1);
        g2d.fillRect(119 + x, 125 + y, 1, 1);
        g2d.fillRect(108 + x, 126 + y, 1, 2);
        g2d.fillRect(118 + x, 126 + y, 1, 3);
        g2d.fillRect(105 + x, 128 + y, 2, 1);
        g2d.fillRect(117 + x, 128 + y, 1, 2);
        g2d.fillRect(117 + x, 132 + y, 1, 2);
        g2d.fillRect(105 + x, 133 + y, 1, 1);
        g2d.fillRect(121 + x, 133 + y, 1, 1);
        g2d.fillRect(104 + x, 134 + y, 1, 1);
        g2d.fillRect(122 + x, 134 + y, 1, 1);
        g2d.fillRect(123 + x, 135 + y, 1, 4);
        g2d.fillRect(119 + x, 137 + y, 1, 1);
        g2d.fillRect(124 + x, 137 + y, 1, 2);
        g2d.fillRect(122 + x, 139 + y, 1, 1);
        g2d.fillRect(129 + x, 141 + y, 1, 1);
        g2d.fillRect(125 + x, 149 + y, 1, 1);
        g2d.fillRect(128 + x, 155 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,189,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(94 + x, 109 + y, 2, 1);
        g2d.fillRect(96 + x, 112 + y, 1, 1);
        g2d.fillRect(95 + x, 116 + y, 1, 2);
        g2d.fillRect(94 + x, 117 + y, 1, 1);
        g2d.fillRect(94 + x, 119 + y, 1, 2);
        g2d.fillRect(93 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 122 + y, 1, 1);
        g2d.fillRect(100 + x, 128 + y, 1, 2);
        g2d.fillRect(130 + x, 148 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(181,189,181,255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(100 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 2);
        g2d.fillRect(99 + x, 109 + y, 1, 1);
        g2d.fillRect(97 + x, 110 + y, 1, 2);
        g2d.fillRect(96 + x, 120 + y, 1, 2);
        g2d.fillRect(103 + x, 127 + y, 1, 1);
        g2d.fillRect(102 + x, 130 + y, 1, 1);
        g2d.fillRect(101 + x, 131 + y, 1, 2);
        g2d.fillRect(124 + x, 136 + y, 1, 1);
        g2d.fillRect(129 + x, 139 + y, 1, 2);
        g2d.fillRect(119 + x, 140 + y, 1, 1);
        g2d.fillRect(124 + x, 144 + y, 1, 1);
        g2d.fillRect(130 + x, 147 + y, 1, 1);
        g2d.fillRect(124 + x, 152 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,222,82,255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(101 + x, 120 + y, 1, 3);
        g2d.fillRect(100 + x, 123 + y, 1, 3);
        g2d.fillRect(130 + x, 142 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,189,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(93 + x, 108 + y, 1, 1);
        g2d.fillRect(92 + x, 109 + y, 1, 2);
        g2d.fillRect(100 + x, 111 + y, 1, 1);
        g2d.fillRect(102 + x, 111 + y, 1, 1);
        g2d.fillRect(91 + x, 112 + y, 1, 2);
        g2d.fillRect(99 + x, 112 + y, 1, 3);
        g2d.fillRect(96 + x, 113 + y, 1, 2);
        g2d.fillRect(101 + x, 113 + y, 1, 1);
        g2d.fillRect(94 + x, 114 + y, 1, 3);
        g2d.fillRect(95 + x, 114 + y, 1, 2);
        g2d.fillRect(96 + x, 116 + y, 1, 2);
        g2d.fillRect(98 + x, 116 + y, 1, 1);
        g2d.fillRect(97 + x, 118 + y, 1, 2);
        g2d.fillRect(105 + x, 118 + y, 1, 2);
        g2d.fillRect(106 + x, 118 + y, 2, 1);
        g2d.fillRect(96 + x, 119 + y, 1, 1);
        g2d.fillRect(108 + x, 119 + y, 1, 4);
        g2d.fillRect(104 + x, 120 + y, 1, 1);
        g2d.fillRect(96 + x, 122 + y, 1, 1);
        g2d.fillRect(99 + x, 122 + y, 1, 1);
        g2d.fillRect(104 + x, 122 + y, 1, 2);
        g2d.fillRect(98 + x, 123 + y, 1, 3);
        g2d.fillRect(107 + x, 126 + y, 1, 2);
        g2d.fillRect(102 + x, 132 + y, 1, 2);
        g2d.fillRect(103 + x, 132 + y, 1, 3);
        g2d.fillRect(130 + x, 137 + y, 1, 1);
        g2d.fillRect(122 + x, 138 + y, 1, 1);
        g2d.fillRect(127 + x, 142 + y, 1, 3);
        g2d.fillRect(126 + x, 146 + y, 1, 2);
        g2d.fillRect(125 + x, 148 + y, 1, 1);
        g2d.fillRect(124 + x, 149 + y, 1, 1);
        g2d.fillRect(131 + x, 150 + y, 1, 2);
        g2d.fillRect(130 + x, 152 + y, 1, 1);
        g2d.fillRect(129 + x, 155 + y, 1, 1);
        g2d.fillRect(131 + x, 157 + y, 2, 1);
        g2d.fillRect(129 + x, 159 + y, 1, 1);
        g2d.fillRect(128 + x, 160 + y, 1, 1);
        g2d.fillRect(130 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,222,165,255), COLORS.get(ImageUtilities.GREY_4)));
        g2d.fillRect(98 + x, 106 + y, 1, 1);
        g2d.fillRect(104 + x, 112 + y, 1, 1);
        g2d.fillRect(101 + x, 117 + y, 1, 3);
        g2d.fillRect(102 + x, 117 + y, 1, 1);
        g2d.fillRect(100 + x, 120 + y, 1, 1);
        g2d.fillRect(99 + x, 126 + y, 1, 3);
        g2d.fillRect(129 + x, 137 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,189,165,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 104 + y, 1, 2);
        g2d.fillRect(99 + x, 106 + y, 1, 1);
        g2d.fillRect(105 + x, 117 + y, 2, 1);
        g2d.fillRect(106 + x, 119 + y, 1, 2);
        g2d.fillRect(105 + x, 120 + y, 1, 1);
        g2d.fillRect(104 + x, 121 + y, 1, 1);
        g2d.fillRect(132 + x, 158 + y, 1, 1);
        g2d.fillRect(129 + x, 160 + y, 1, 1);
        g2d.fillRect(128 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,206,206,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 121 + y, 1, 1);
        g2d.fillRect(107 + x, 123 + y, 1, 3);
        g2d.fillRect(120 + x, 124 + y, 1, 2);
        g2d.fillRect(105 + x, 125 + y, 1, 3);
        g2d.fillRect(106 + x, 125 + y, 1, 3);
        g2d.fillRect(98 + x, 126 + y, 1, 1);
        g2d.fillRect(119 + x, 126 + y, 1, 3);
        g2d.fillRect(104 + x, 127 + y, 1, 2);
        g2d.fillRect(120 + x, 127 + y, 1, 2);
        g2d.fillRect(99 + x, 129 + y, 1, 1);
        g2d.fillRect(117 + x, 130 + y, 1, 2);
        g2d.fillRect(118 + x, 130 + y, 1, 2);
        g2d.fillRect(122 + x, 131 + y, 1, 1);
        g2d.fillRect(118 + x, 134 + y, 1, 2);
        g2d.fillRect(120 + x, 138 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,222,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(96 + x, 110 + y, 1, 2);
        g2d.fillRect(98 + x, 112 + y, 1, 3);
        g2d.fillRect(92 + x, 114 + y, 1, 1);
        g2d.fillRect(99 + x, 115 + y, 1, 1);
        g2d.fillRect(101 + x, 116 + y, 1, 1);
        g2d.fillRect(93 + x, 117 + y, 1, 1);
        g2d.fillRect(96 + x, 118 + y, 1, 1);
        g2d.fillRect(100 + x, 119 + y, 1, 1);
        g2d.fillRect(97 + x, 120 + y, 1, 2);
        g2d.fillRect(93 + x, 121 + y, 3, 1);
        g2d.fillRect(100 + x, 121 + y, 1, 2);
        g2d.fillRect(107 + x, 122 + y, 1, 1);
        g2d.fillRect(99 + x, 123 + y, 1, 3);
        g2d.fillRect(105 + x, 124 + y, 2, 1);
        g2d.fillRect(100 + x, 126 + y, 1, 1);
        g2d.fillRect(120 + x, 126 + y, 1, 1);
        g2d.fillRect(105 + x, 129 + y, 1, 2);
        g2d.fillRect(106 + x, 129 + y, 1, 2);
        g2d.fillRect(118 + x, 129 + y, 1, 1);
        g2d.fillRect(120 + x, 130 + y, 1, 1);
        g2d.fillRect(103 + x, 131 + y, 1, 1);
        g2d.fillRect(121 + x, 131 + y, 1, 2);
        g2d.fillRect(119 + x, 133 + y, 1, 1);
        g2d.fillRect(130 + x, 138 + y, 1, 1);
        g2d.fillRect(130 + x, 145 + y, 1, 2);
        g2d.fillRect(130 + x, 157 + y, 1, 1);
        g2d.fillRect(129 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222,222,222,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 110 + y, 1, 2);
        g2d.fillRect(97 + x, 112 + y, 1, 1);
        g2d.fillRect(119 + x, 129 + y, 1, 4);
        g2d.fillRect(120 + x, 129 + y, 1, 1);
        g2d.fillRect(121 + x, 130 + y, 1, 1);
        g2d.fillRect(118 + x, 132 + y, 1, 1);
        g2d.fillRect(121 + x, 134 + y, 1, 4);
        g2d.fillRect(119 + x, 135 + y, 1, 2);
        g2d.fillRect(120 + x, 135 + y, 1, 3);
        g2d.fillRect(122 + x, 136 + y, 1, 2);
        g2d.fillRect(129 + x, 146 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,165,255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(100 + x, 109 + y, 1, 1);
        g2d.fillRect(99 + x, 110 + y, 1, 2);
        g2d.fillRect(97 + x, 113 + y, 1, 3);
        g2d.fillRect(103 + x, 113 + y, 1, 3);
        g2d.fillRect(102 + x, 114 + y, 1, 3);
        g2d.fillRect(104 + x, 125 + y, 1, 2);
        g2d.fillRect(131 + x, 159 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239,239,239,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 115 + y, 1, 1);
        g2d.fillRect(97 + x, 116 + y, 1, 2);
        g2d.fillRect(107 + x, 119 + y, 1, 2);
        g2d.fillRect(105 + x, 121 + y, 1, 3);
        g2d.fillRect(106 + x, 121 + y, 1, 3);
        g2d.fillRect(103 + x, 124 + y, 1, 3);
        g2d.fillRect(104 + x, 124 + y, 1, 1);
        g2d.fillRect(101 + x, 126 + y, 1, 2);
        g2d.fillRect(100 + x, 127 + y, 1, 1);
        g2d.fillRect(103 + x, 128 + y, 1, 3);
        g2d.fillRect(104 + x, 129 + y, 1, 3);
        g2d.fillRect(120 + x, 133 + y, 1, 2);
        g2d.fillRect(129 + x, 147 + y, 1, 2);
        g2d.fillRect(129 + x, 157 + y, 1, 2);
        g2d.fillRect(130 + x, 158 + y, 1, 2);
        g2d.fillRect(131 + x, 158 + y, 1, 1);
        g2d.fillRect(128 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 128 + y, 1, 2);
        g2d.fillRect(120 + x, 131 + y, 1, 2);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,123,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(99 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,123,82,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,156,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(98 + x, 51 + y, 2, 1);
        g2d.fillRect(101 + x, 51 + y, 7, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(113 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 6, 1);
        g2d.fillRect(97 + x, 52 + y, 1, 4);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 5);
        g2d.fillRect(99 + x, 53 + y, 1, 2);
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(98 + x, 57 + y, 4, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,173,165,255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,189,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,222,82,255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 2);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);

        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 5);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);



        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,189,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 2, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 2, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 2, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 2, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,222,165,255), COLORS.get(ImageUtilities.GREY_4)));
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 2, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 2, 1);
        g2d.fillRect(104 + x, 56 + y, 2, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,189,165,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 53 + y, 1, 3);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,206,206,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,222,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222,222,222,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,165,255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239,239,239,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 2, 1);
        g2d.fillRect(112 + x, 55 + y, 2, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,123,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 2);
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 85 + y, 2, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 1, 3);
        g2d.fillRect(99 + x, 89 + y, 1, 2);
        g2d.fillRect(100 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(122 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 5);
        g2d.fillRect(106 + x, 100 + y, 1, 3);
        g2d.fillRect(107 + x, 100 + y, 1, 3);
        g2d.fillRect(103 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 1, 2);
        g2d.fillRect(125 + x, 102 + y, 1, 3);
        g2d.fillRect(105 + x, 103 + y, 1, 4);
        g2d.fillRect(126 + x, 103 + y, 1, 3);
        g2d.fillRect(101 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 2);
        g2d.fillRect(106 + x, 107 + y, 1, 2);
        g2d.fillRect(107 + x, 107 + y, 1, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 2);
        g2d.fillRect(126 + x, 110 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 1);
        g2d.fillRect(127 + x, 112 + y, 1, 2);
        g2d.fillRect(111 + x, 113 + y, 1, 1);
        g2d.fillRect(117 + x, 113 + y, 1, 2);
        g2d.fillRect(128 + x, 114 + y, 1, 4);
        g2d.fillRect(129 + x, 116 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,156,82,255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(92 + x, 91 + y, 1, 3);
        g2d.fillRect(91 + x, 94 + y, 1, 1);
        g2d.fillRect(90 + x, 97 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,148,148,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(128 + x, 106 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,156,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 3, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 2, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 3);
        g2d.fillRect(103 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 3, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 2, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 70 + y, 2, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 2);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(113 + x, 75 + y, 2, 1);
        g2d.fillRect(101 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 2, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 2);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 79 + y, 1, 4);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 1, 2);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 3);
        g2d.fillRect(99 + x, 83 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 3);
        g2d.fillRect(105 + x, 83 + y, 1, 2);
        g2d.fillRect(116 + x, 83 + y, 1, 3);
        g2d.fillRect(122 + x, 83 + y, 1, 3);
        g2d.fillRect(123 + x, 84 + y, 1, 9);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 86 + y, 1, 2);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 3);
        g2d.fillRect(94 + x, 89 + y, 1, 2);
        g2d.fillRect(101 + x, 89 + y, 1, 3);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 2);
        g2d.fillRect(103 + x, 92 + y, 1, 3);
        g2d.fillRect(124 + x, 92 + y, 1, 9);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(107 + x, 93 + y, 1, 3);
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(121 + x, 94 + y, 1, 1);
        g2d.fillRect(97 + x, 95 + y, 1, 4);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(122 + x, 95 + y, 1, 3);
        g2d.fillRect(101 + x, 96 + y, 1, 4);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 97 + y, 1, 2);
        g2d.fillRect(125 + x, 97 + y, 1, 5);
        g2d.fillRect(95 + x, 98 + y, 2, 1);
        g2d.fillRect(126 + x, 98 + y, 1, 5);
        g2d.fillRect(106 + x, 99 + y, 2, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 3);
        g2d.fillRect(117 + x, 100 + y, 1, 2);
        g2d.fillRect(127 + x, 100 + y, 1, 3);
        g2d.fillRect(99 + x, 102 + y, 1, 1);
        g2d.fillRect(122 + x, 102 + y, 1, 1);
        g2d.fillRect(123 + x, 103 + y, 1, 2);
        g2d.fillRect(128 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 2, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(124 + x, 105 + y, 2, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 1);
        g2d.fillRect(125 + x, 106 + y, 2, 1);
        g2d.fillRect(126 + x, 107 + y, 1, 3);
        g2d.fillRect(127 + x, 107 + y, 1, 5);
        g2d.fillRect(107 + x, 108 + y, 1, 2);
        g2d.fillRect(106 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 1, 2);
        g2d.fillRect(108 + x, 110 + y, 1, 1);
        g2d.fillRect(123 + x, 110 + y, 1, 4);
        g2d.fillRect(128 + x, 110 + y, 1, 2);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(112 + x, 112 + y, 1, 2);
        g2d.fillRect(116 + x, 112 + y, 2, 1);
        g2d.fillRect(129 + x, 112 + y, 1, 4);
        g2d.fillRect(115 + x, 113 + y, 1, 2);
        g2d.fillRect(124 + x, 114 + y, 1, 3);
        g2d.fillRect(117 + x, 115 + y, 1, 2);
        g2d.fillRect(130 + x, 116 + y, 1, 1);
        g2d.fillRect(118 + x, 117 + y, 1, 2);
        g2d.fillRect(119 + x, 118 + y, 1, 1);
        g2d.fillRect(125 + x, 118 + y, 1, 4);
        g2d.fillRect(129 + x, 118 + y, 2, 1);
        g2d.fillRect(130 + x, 119 + y, 1, 2);
        g2d.fillRect(126 + x, 122 + y, 1, 2);
        g2d.fillRect(129 + x, 122 + y, 2, 1);
        g2d.fillRect(130 + x, 123 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,189,82,255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(104 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 1, 2);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(93 + x, 89 + y, 1, 3);
        g2d.fillRect(122 + x, 90 + y, 1, 3);
        g2d.fillRect(97 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 3);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 2, 1);
        g2d.fillRect(111 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(92 + x, 94 + y, 1, 1);
        g2d.fillRect(91 + x, 95 + y, 1, 2);
        g2d.fillRect(95 + x, 95 + y, 2, 1);
        g2d.fillRect(98 + x, 95 + y, 2, 1);
        g2d.fillRect(110 + x, 96 + y, 1, 1);
        g2d.fillRect(93 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 2);
        g2d.fillRect(97 + x, 99 + y, 1, 2);
        g2d.fillRect(115 + x, 102 + y, 1, 2);
        g2d.fillRect(118 + x, 102 + y, 1, 3);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 2);
        g2d.fillRect(108 + x, 108 + y, 1, 2);
        g2d.fillRect(123 + x, 109 + y, 1, 1);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(124 + x, 110 + y, 1, 3);
        g2d.fillRect(119 + x, 112 + y, 1, 1);
        g2d.fillRect(118 + x, 113 + y, 1, 1);
        g2d.fillRect(125 + x, 113 + y, 1, 4);
        g2d.fillRect(123 + x, 114 + y, 1, 4);
        g2d.fillRect(126 + x, 115 + y, 1, 3);
        g2d.fillRect(118 + x, 116 + y, 1, 1);
        g2d.fillRect(124 + x, 117 + y, 1, 1);
        g2d.fillRect(127 + x, 118 + y, 2, 1);
        g2d.fillRect(128 + x, 119 + y, 1, 3);
        g2d.fillRect(124 + x, 120 + y, 1, 2);
        g2d.fillRect(129 + x, 120 + y, 1, 2);
        g2d.fillRect(128 + x, 123 + y, 2, 1);
        g2d.fillRect(129 + x, 124 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,173,165,255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(103 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 3);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 66 + y, 1, 1);
        g2d.fillRect(116 + x, 69 + y, 2, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 100 + y, 1, 2);
        g2d.fillRect(105 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 2);
        g2d.fillRect(127 + x, 103 + y, 1, 4);
        g2d.fillRect(104 + x, 104 + y, 1, 2);
        g2d.fillRect(116 + x, 104 + y, 1, 1);
        g2d.fillRect(128 + x, 104 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(116 + x, 107 + y, 1, 1);
        g2d.fillRect(128 + x, 107 + y, 1, 3);
        g2d.fillRect(129 + x, 108 + y, 1, 3);
        g2d.fillRect(117 + x, 110 + y, 1, 2);
        g2d.fillRect(110 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 1);
        g2d.fillRect(130 + x, 113 + y, 1, 2);
        g2d.fillRect(131 + x, 113 + y, 1, 2);
        g2d.fillRect(116 + x, 115 + y, 1, 2);
        g2d.fillRect(132 + x, 115 + y, 1, 1);
        g2d.fillRect(134 + x, 120 + y, 1, 1);
        g2d.fillRect(134 + x, 122 + y, 1, 2);
        g2d.fillRect(135 + x, 122 + y, 1, 2);

g2d.fillRect(101 + x, 77 + y, 1, 2);
g2d.fillRect(100 + x, 80 + y, 1, 1);



        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,189,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(116 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 77 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 1, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 3);
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(107 + x, 80 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 2, 1);
        g2d.fillRect(109 + x, 82 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(95 + x, 88 + y, 2, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 4);
        g2d.fillRect(110 + x, 94 + y, 1, 2);
        g2d.fillRect(119 + x, 94 + y, 1, 3);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 2);
        g2d.fillRect(107 + x, 97 + y, 1, 2);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 99 + y, 1, 1);
        g2d.fillRect(114 + x, 101 + y, 1, 2);
        g2d.fillRect(103 + x, 103 + y, 1, 2);
        g2d.fillRect(106 + x, 106 + y, 2, 1);
        g2d.fillRect(129 + x, 107 + y, 1, 1);
        g2d.fillRect(124 + x, 109 + y, 1, 1);
        g2d.fillRect(106 + x, 110 + y, 2, 1);
        g2d.fillRect(131 + x, 111 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,156,165,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(181,189,181,255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(100 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 2);
        g2d.fillRect(101 + x, 79 + y, 1, 1);
        g2d.fillRect(130 + x, 112 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 2);
        g2d.fillRect(116 + x, 113 + y, 1, 2);
        g2d.fillRect(132 + x, 114 + y, 1, 1);
        g2d.fillRect(131 + x, 115 + y, 1, 1);
        g2d.fillRect(133 + x, 116 + y, 1, 2);
        g2d.fillRect(134 + x, 119 + y, 1, 1);
        g2d.fillRect(134 + x, 121 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,222,82,255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 2);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 2, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 2);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(120 + x, 102 + y, 1, 2);
        g2d.fillRect(123 + x, 102 + y, 1, 1);
        g2d.fillRect(111 + x, 103 + y, 1, 1);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(122 + x, 105 + y, 1, 2);
        g2d.fillRect(118 + x, 106 + y, 1, 2);
        g2d.fillRect(123 + x, 106 + y, 1, 3);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(118 + x, 109 + y, 1, 1);
        g2d.fillRect(120 + x, 112 + y, 1, 1);
        g2d.fillRect(114 + x, 113 + y, 1, 2);
        g2d.fillRect(122 + x, 115 + y, 1, 2);
        g2d.fillRect(124 + x, 118 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,189,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 2, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(102 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(119 + x, 74 + y, 1, 2);
        g2d.fillRect(115 + x, 75 + y, 1, 2);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(120 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(116 + x, 77 + y, 1, 2);
        g2d.fillRect(121 + x, 77 + y, 1, 3);
        g2d.fillRect(103 + x, 79 + y, 2, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 2);
        g2d.fillRect(110 + x, 80 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 2, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 3);
        g2d.fillRect(112 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(99 + x, 85 + y, 1, 3);
        g2d.fillRect(101 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(122 + x, 86 + y, 1, 4);
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 2);
        g2d.fillRect(96 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 3);
        g2d.fillRect(108 + x, 90 + y, 1, 5);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(94 + x, 92 + y, 1, 3);
        g2d.fillRect(99 + x, 92 + y, 1, 3);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 4);
        g2d.fillRect(105 + x, 93 + y, 1, 2);
        g2d.fillRect(123 + x, 93 + y, 1, 1);
        g2d.fillRect(111 + x, 94 + y, 1, 2);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(125 + x, 95 + y, 1, 2);
        g2d.fillRect(106 + x, 96 + y, 2, 1);
        g2d.fillRect(93 + x, 97 + y, 2, 1);
        g2d.fillRect(111 + x, 97 + y, 1, 2);
        g2d.fillRect(119 + x, 97 + y, 1, 1);
        g2d.fillRect(99 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 2);
        g2d.fillRect(95 + x, 99 + y, 1, 3);
        g2d.fillRect(96 + x, 99 + y, 1, 3);
        g2d.fillRect(109 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 2);
        g2d.fillRect(108 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 100 + y, 1, 4);
        g2d.fillRect(123 + x, 100 + y, 1, 2);
        g2d.fillRect(111 + x, 101 + y, 1, 2);
        g2d.fillRect(124 + x, 101 + y, 1, 4);
        g2d.fillRect(99 + x, 103 + y, 1, 1);
        g2d.fillRect(101 + x, 103 + y, 1, 2);
        g2d.fillRect(104 + x, 103 + y, 1, 1);
        g2d.fillRect(108 + x, 103 + y, 1, 1);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(104 + x, 106 + y, 1, 1);
        g2d.fillRect(108 + x, 106 + y, 1, 1);
        g2d.fillRect(124 + x, 106 + y, 1, 3);
        g2d.fillRect(129 + x, 106 + y, 1, 1);
        g2d.fillRect(125 + x, 107 + y, 1, 4);
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(121 + x, 109 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 2);
        g2d.fillRect(112 + x, 111 + y, 2, 1);
        g2d.fillRect(126 + x, 111 + y, 1, 4);
        g2d.fillRect(111 + x, 112 + y, 1, 1);
        g2d.fillRect(113 + x, 112 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 1);
        g2d.fillRect(127 + x, 114 + y, 1, 2);
        g2d.fillRect(133 + x, 115 + y, 1, 1);
        g2d.fillRect(130 + x, 117 + y, 1, 1);
        g2d.fillRect(131 + x, 118 + y, 1, 2);
        g2d.fillRect(134 + x, 118 + y, 1, 1);
        g2d.fillRect(129 + x, 119 + y, 1, 1);
        g2d.fillRect(131 + x, 121 + y, 1, 4);
        g2d.fillRect(132 + x, 124 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,222,165,255), COLORS.get(ImageUtilities.GREY_4)));
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 2);
        g2d.fillRect(104 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 1, 2);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 80 + y, 1, 2);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 92 + y, 1, 1);
        g2d.fillRect(93 + x, 95 + y, 1, 2);
        g2d.fillRect(102 + x, 95 + y, 1, 3);
        g2d.fillRect(95 + x, 96 + y, 1, 2);
        g2d.fillRect(96 + x, 96 + y, 1, 2);
        g2d.fillRect(108 + x, 97 + y, 1, 2);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 2);
        g2d.fillRect(100 + x, 102 + y, 1, 4);
        g2d.fillRect(130 + x, 110 + y, 1, 1);
        g2d.fillRect(109 + x, 112 + y, 1, 2);
        g2d.fillRect(119 + x, 114 + y, 1, 3);
        g2d.fillRect(121 + x, 117 + y, 1, 1);
        g2d.fillRect(125 + x, 117 + y, 1, 1);
        g2d.fillRect(126 + x, 118 + y, 1, 1);
        g2d.fillRect(133 + x, 118 + y, 1, 1);
        g2d.fillRect(121 + x, 119 + y, 1, 1);
        g2d.fillRect(135 + x, 121 + y, 1, 1);
        g2d.fillRect(127 + x, 123 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,189,165,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(103 + x, 67 + y, 1, 3);
        g2d.fillRect(115 + x, 67 + y, 2, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 2);
        g2d.fillRect(117 + x, 75 + y, 1, 2);
        g2d.fillRect(110 + x, 77 + y, 1, 2);
        g2d.fillRect(111 + x, 77 + y, 1, 2);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 4);
        g2d.fillRect(93 + x, 92 + y, 1, 3);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 3);
        g2d.fillRect(92 + x, 95 + y, 1, 2);
        g2d.fillRect(121 + x, 95 + y, 1, 2);
        g2d.fillRect(99 + x, 96 + y, 1, 2);
        g2d.fillRect(91 + x, 97 + y, 1, 1);
        g2d.fillRect(121 + x, 98 + y, 2, 1);
        g2d.fillRect(122 + x, 99 + y, 1, 3);
        g2d.fillRect(123 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(98 + x, 103 + y, 1, 1);
        g2d.fillRect(112 + x, 103 + y, 1, 1);
        g2d.fillRect(119 + x, 106 + y, 1, 2);
        g2d.fillRect(120 + x, 106 + y, 1, 3);
        g2d.fillRect(122 + x, 107 + y, 1, 3);
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(125 + x, 111 + y, 1, 2);
        g2d.fillRect(130 + x, 111 + y, 1, 1);
        g2d.fillRect(131 + x, 112 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,206,206,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 2, 1);
        g2d.fillRect(103 + x, 65 + y, 2, 1);
        g2d.fillRect(116 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 2, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 75 + y, 1, 2);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 79 + y, 1, 2);
        g2d.fillRect(117 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,222,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(112 + x, 64 + y, 3, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 2, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 2, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 2, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 2);
        g2d.fillRect(116 + x, 80 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 6);
        g2d.fillRect(108 + x, 82 + y, 1, 6);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 2);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 3);
        g2d.fillRect(114 + x, 89 + y, 1, 3);
        g2d.fillRect(106 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(101 + x, 93 + y, 1, 3);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(95 + x, 94 + y, 2, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 2);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 2);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(112 + x, 97 + y, 1, 2);
        g2d.fillRect(120 + x, 97 + y, 1, 3);
        g2d.fillRect(123 + x, 97 + y, 1, 2);
        g2d.fillRect(100 + x, 98 + y, 1, 1);
        g2d.fillRect(113 + x, 98 + y, 1, 5);
        g2d.fillRect(121 + x, 99 + y, 1, 3);
        g2d.fillRect(109 + x, 100 + y, 1, 1);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(115 + x, 100 + y, 1, 2);
        g2d.fillRect(98 + x, 101 + y, 1, 2);
        g2d.fillRect(106 + x, 103 + y, 1, 3);
        g2d.fillRect(107 + x, 103 + y, 1, 3);
        g2d.fillRect(109 + x, 103 + y, 1, 1);
        g2d.fillRect(122 + x, 103 + y, 1, 2);
        g2d.fillRect(108 + x, 104 + y, 1, 2);
        g2d.fillRect(113 + x, 104 + y, 1, 3);
        g2d.fillRect(120 + x, 104 + y, 1, 1);
        g2d.fillRect(114 + x, 105 + y, 1, 3);
        g2d.fillRect(123 + x, 105 + y, 1, 1);
        g2d.fillRect(109 + x, 107 + y, 1, 1);
        g2d.fillRect(121 + x, 107 + y, 1, 2);
        g2d.fillRect(112 + x, 108 + y, 1, 3);
        g2d.fillRect(119 + x, 109 + y, 1, 1);
        g2d.fillRect(121 + x, 110 + y, 1, 2);
        g2d.fillRect(122 + x, 110 + y, 1, 4);
        g2d.fillRect(118 + x, 112 + y, 1, 1);
        g2d.fillRect(128 + x, 112 + y, 1, 2);
        g2d.fillRect(119 + x, 113 + y, 1, 1);
        g2d.fillRect(120 + x, 116 + y, 1, 1);
        g2d.fillRect(127 + x, 116 + y, 1, 2);
        g2d.fillRect(121 + x, 118 + y, 1, 1);
        g2d.fillRect(132 + x, 118 + y, 1, 1);
        g2d.fillRect(127 + x, 119 + y, 1, 2);
        g2d.fillRect(133 + x, 119 + y, 1, 1);
        g2d.fillRect(122 + x, 120 + y, 1, 1);
        g2d.fillRect(130 + x, 121 + y, 1, 1);
        g2d.fillRect(128 + x, 122 + y, 1, 1);
        g2d.fillRect(132 + x, 123 + y, 2, 1);
        g2d.fillRect(136 + x, 124 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222,222,222,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 2, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 3);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(96 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(95 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 3);
        g2d.fillRect(99 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(94 + x, 91 + y, 3, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(92 + x, 97 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 97 + y, 1, 1);
        g2d.fillRect(91 + x, 98 + y, 1, 1);
        g2d.fillRect(94 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 98 + y, 1, 2);
        g2d.fillRect(112 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(97 + x, 101 + y, 1, 2);
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(118 + x, 108 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(112 + x, 114 + y, 1, 1);
        g2d.fillRect(132 + x, 116 + y, 1, 2);
        g2d.fillRect(136 + x, 123 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,165,255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 2);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(98 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 2, 1);
        g2d.fillRect(111 + x, 88 + y, 2, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 2);
        g2d.fillRect(116 + x, 94 + y, 1, 2);
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 1);
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 1, 2);
        g2d.fillRect(111 + x, 99 + y, 1, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 6);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(111 + x, 104 + y, 1, 4);
        g2d.fillRect(119 + x, 105 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 2, 1);
        g2d.fillRect(109 + x, 108 + y, 1, 2);
        g2d.fillRect(113 + x, 108 + y, 1, 1);
        g2d.fillRect(119 + x, 108 + y, 1, 1);
        g2d.fillRect(110 + x, 111 + y, 2, 1);
        g2d.fillRect(121 + x, 112 + y, 1, 1);
        g2d.fillRect(120 + x, 114 + y, 1, 2);
        g2d.fillRect(130 + x, 115 + y, 1, 1);
        g2d.fillRect(131 + x, 116 + y, 1, 2);
        g2d.fillRect(120 + x, 117 + y, 1, 1);
        g2d.fillRect(126 + x, 119 + y, 1, 3);
        g2d.fillRect(132 + x, 119 + y, 1, 2);
        g2d.fillRect(133 + x, 120 + y, 1, 3);
        g2d.fillRect(122 + x, 121 + y, 2, 1);
        g2d.fillRect(127 + x, 121 + y, 1, 2);
        g2d.fillRect(134 + x, 124 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239,239,239,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 2, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 74 + y, 1, 3);
        g2d.fillRect(101 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 2);
        g2d.fillRect(108 + x, 77 + y, 1, 2);
        g2d.fillRect(114 + x, 77 + y, 1, 2);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 2, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(97 + x, 86 + y, 1, 2);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(97 + x, 94 + y, 1, 1);
        g2d.fillRect(123 + x, 94 + y, 1, 3);
        g2d.fillRect(100 + x, 95 + y, 1, 3);
        g2d.fillRect(108 + x, 96 + y, 1, 1);
        g2d.fillRect(109 + x, 97 + y, 1, 2);
        g2d.fillRect(103 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 2);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(120 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 2, 1);
        g2d.fillRect(108 + x, 101 + y, 1, 2);
        g2d.fillRect(109 + x, 101 + y, 1, 2);
        g2d.fillRect(101 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 103 + y, 1, 2);
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(109 + x, 106 + y, 1, 1);
        g2d.fillRect(108 + x, 107 + y, 1, 1);
        g2d.fillRect(113 + x, 109 + y, 1, 2);
        g2d.fillRect(120 + x, 109 + y, 1, 1);
        g2d.fillRect(109 + x, 110 + y, 1, 2);
        g2d.fillRect(111 + x, 110 + y, 1, 1);
        g2d.fillRect(129 + x, 111 + y, 1, 1);
        g2d.fillRect(124 + x, 113 + y, 1, 1);
        g2d.fillRect(121 + x, 114 + y, 1, 3);
        g2d.fillRect(119 + x, 117 + y, 1, 1);
        g2d.fillRect(122 + x, 117 + y, 1, 1);
        g2d.fillRect(123 + x, 118 + y, 1, 2);
        g2d.fillRect(121 + x, 120 + y, 1, 1);
        g2d.fillRect(131 + x, 120 + y, 1, 1);
        g2d.fillRect(132 + x, 121 + y, 1, 2);
        g2d.fillRect(133 + x, 124 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 3);
        g2d.fillRect(114 + x, 66 + y, 2, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 3);
        g2d.fillRect(114 + x, 68 + y, 1, 3);
        g2d.fillRect(109 + x, 69 + y, 1, 2);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 79 + y, 1, 4);
        g2d.fillRect(117 + x, 80 + y, 1, 2);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 3);
        g2d.fillRect(113 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 86 + y, 1, 2);
        g2d.fillRect(114 + x, 86 + y, 1, 2);
        g2d.fillRect(120 + x, 86 + y, 1, 3);
        g2d.fillRect(121 + x, 87 + y, 1, 3);
        g2d.fillRect(97 + x, 88 + y, 1, 3);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(98 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 2, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 2);
        g2d.fillRect(95 + x, 92 + y, 1, 2);
        g2d.fillRect(96 + x, 92 + y, 1, 2);
        g2d.fillRect(97 + x, 92 + y, 1, 2);
        g2d.fillRect(110 + x, 92 + y, 1, 2);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 1, 2);
        g2d.fillRect(118 + x, 94 + y, 1, 2);
        g2d.fillRect(94 + x, 95 + y, 1, 2);
        g2d.fillRect(114 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 97 + y, 1, 3);
        g2d.fillRect(113 + x, 97 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 1);
        g2d.fillRect(121 + x, 97 + y, 1, 1);
        g2d.fillRect(92 + x, 98 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 3);
        g2d.fillRect(102 + x, 98 + y, 1, 1);
        g2d.fillRect(114 + x, 98 + y, 1, 3);
        g2d.fillRect(119 + x, 98 + y, 1, 2);
        g2d.fillRect(99 + x, 99 + y, 1, 2);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 101 + y, 1, 2);
        g2d.fillRect(121 + x, 102 + y, 1, 5);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(109 + x, 104 + y, 1, 2);
        g2d.fillRect(112 + x, 104 + y, 1, 3);
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(120 + x, 105 + y, 1, 1);
        g2d.fillRect(110 + x, 107 + y, 1, 3);
        g2d.fillRect(114 + x, 110 + y, 1, 1);
        g2d.fillRect(119 + x, 110 + y, 1, 2);
        g2d.fillRect(120 + x, 110 + y, 1, 2);
        g2d.fillRect(120 + x, 113 + y, 2, 1);
        g2d.fillRect(118 + x, 114 + y, 1, 2);
        g2d.fillRect(122 + x, 114 + y, 1, 1);
        g2d.fillRect(120 + x, 118 + y, 1, 1);
        g2d.fillRect(122 + x, 118 + y, 1, 2);
        g2d.fillRect(123 + x, 120 + y, 1, 1);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,90,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(89 + x, 101 + y, 2, 1);
        g2d.fillRect(90 + x, 102 + y, 1, 1);
        g2d.fillRect(94 + x, 105 + y, 1, 2);
        g2d.fillRect(95 + x, 105 + y, 1, 2);
        g2d.fillRect(92 + x, 106 + y, 2, 1);
        g2d.fillRect(102 + x, 108 + y, 1, 1);
        g2d.fillRect(98 + x, 109 + y, 2, 1);
        g2d.fillRect(101 + x, 109 + y, 1, 4);
        g2d.fillRect(102 + x, 112 + y, 1, 3);
        g2d.fillRect(103 + x, 116 + y, 2, 1);
        g2d.fillRect(104 + x, 118 + y, 1, 1);
        g2d.fillRect(105 + x, 120 + y, 3, 1);
        g2d.fillRect(107 + x, 121 + y, 2, 1);
        g2d.fillRect(109 + x, 123 + y, 1, 1);
        g2d.fillRect(127 + x, 139 + y, 1, 2);
        g2d.fillRect(128 + x, 139 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,123,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(89 + x, 100 + y, 2, 1);
        g2d.fillRect(91 + x, 103 + y, 1, 1);
        g2d.fillRect(92 + x, 104 + y, 1, 2);
        g2d.fillRect(100 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 1, 3);
        g2d.fillRect(103 + x, 106 + y, 1, 7);
        g2d.fillRect(96 + x, 107 + y, 1, 3);
        g2d.fillRect(100 + x, 108 + y, 2, 1);
        g2d.fillRect(105 + x, 108 + y, 1, 1);
        g2d.fillRect(104 + x, 110 + y, 1, 2);
        g2d.fillRect(102 + x, 111 + y, 1, 1);
        g2d.fillRect(108 + x, 112 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 2);
        g2d.fillRect(102 + x, 115 + y, 2, 1);
        g2d.fillRect(107 + x, 115 + y, 1, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 7);
        g2d.fillRect(108 + x, 116 + y, 1, 1);
        g2d.fillRect(105 + x, 117 + y, 1, 3);
        g2d.fillRect(106 + x, 117 + y, 1, 3);
        g2d.fillRect(114 + x, 118 + y, 1, 6);
        g2d.fillRect(107 + x, 119 + y, 1, 1);
        g2d.fillRect(110 + x, 120 + y, 2, 1);
        g2d.fillRect(109 + x, 121 + y, 1, 2);
        g2d.fillRect(111 + x, 121 + y, 1, 2);
        g2d.fillRect(116 + x, 122 + y, 1, 3);
        g2d.fillRect(110 + x, 123 + y, 1, 2);
        g2d.fillRect(117 + x, 123 + y, 1, 3);
        g2d.fillRect(118 + x, 123 + y, 1, 2);
        g2d.fillRect(119 + x, 123 + y, 1, 1);
        g2d.fillRect(109 + x, 124 + y, 1, 1);
        g2d.fillRect(111 + x, 124 + y, 1, 1);
        g2d.fillRect(114 + x, 125 + y, 1, 1);
        g2d.fillRect(112 + x, 127 + y, 1, 1);
        g2d.fillRect(121 + x, 127 + y, 1, 1);
        g2d.fillRect(113 + x, 128 + y, 1, 1);
        g2d.fillRect(136 + x, 129 + y, 1, 1);
        g2d.fillRect(121 + x, 130 + y, 1, 2);
        g2d.fillRect(137 + x, 133 + y, 1, 1);
        g2d.fillRect(125 + x, 138 + y, 1, 2);
        g2d.fillRect(129 + x, 139 + y, 1, 3);
        g2d.fillRect(130 + x, 140 + y, 1, 2);
        g2d.fillRect(131 + x, 141 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,156,82,255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(90 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132,132,132,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 124 + y, 1, 4);
        g2d.fillRect(126 + x, 140 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,148,148,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 101 + y, 1, 2);
        g2d.fillRect(92 + x, 103 + y, 1, 1);
        g2d.fillRect(93 + x, 104 + y, 1, 2);
        g2d.fillRect(101 + x, 106 + y, 1, 2);
        g2d.fillRect(114 + x, 117 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,156,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(97 + x, 104 + y, 1, 1);
        g2d.fillRect(97 + x, 108 + y, 1, 2);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(104 + x, 108 + y, 1, 1);
        g2d.fillRect(102 + x, 109 + y, 1, 2);
        g2d.fillRect(105 + x, 109 + y, 1, 1);
        g2d.fillRect(108 + x, 113 + y, 1, 3);
        g2d.fillRect(110 + x, 113 + y, 1, 2);
        g2d.fillRect(114 + x, 115 + y, 1, 1);
        g2d.fillRect(109 + x, 116 + y, 1, 1);
        g2d.fillRect(116 + x, 116 + y, 2, 1);
        g2d.fillRect(111 + x, 117 + y, 1, 1);
        g2d.fillRect(113 + x, 118 + y, 1, 3);
        g2d.fillRect(118 + x, 119 + y, 1, 4);
        g2d.fillRect(119 + x, 119 + y, 1, 1);
        g2d.fillRect(110 + x, 121 + y, 1, 2);
        g2d.fillRect(125 + x, 121 + y, 1, 2);
        g2d.fillRect(112 + x, 122 + y, 1, 2);
        g2d.fillRect(126 + x, 123 + y, 1, 3);
        g2d.fillRect(113 + x, 124 + y, 1, 1);
        g2d.fillRect(120 + x, 124 + y, 1, 2);
        g2d.fillRect(130 + x, 124 + y, 1, 3);
        g2d.fillRect(110 + x, 125 + y, 1, 1);
        g2d.fillRect(121 + x, 126 + y, 1, 1);
        g2d.fillRect(131 + x, 126 + y, 1, 5);
        g2d.fillRect(112 + x, 128 + y, 1, 1);
        g2d.fillRect(121 + x, 128 + y, 1, 2);
        g2d.fillRect(135 + x, 128 + y, 1, 2);
        g2d.fillRect(132 + x, 130 + y, 1, 5);
        g2d.fillRect(136 + x, 130 + y, 1, 2);
        g2d.fillRect(137 + x, 130 + y, 1, 1);
        g2d.fillRect(122 + x, 131 + y, 1, 4);
        g2d.fillRect(137 + x, 134 + y, 1, 1);
        g2d.fillRect(123 + x, 135 + y, 1, 4);
        g2d.fillRect(127 + x, 137 + y, 1, 1);
        g2d.fillRect(124 + x, 138 + y, 1, 3);
        g2d.fillRect(128 + x, 138 + y, 1, 1);
        g2d.fillRect(131 + x, 140 + y, 1, 1);
        g2d.fillRect(134 + x, 140 + y, 1, 1);
        g2d.fillRect(133 + x, 142 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,189,82,255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(92 + x, 98 + y, 1, 2);
        g2d.fillRect(94 + x, 104 + y, 1, 1);
        g2d.fillRect(97 + x, 105 + y, 1, 3);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(105 + x, 112 + y, 3, 1);
        g2d.fillRect(105 + x, 115 + y, 1, 1);
        g2d.fillRect(117 + x, 117 + y, 1, 5);
        g2d.fillRect(109 + x, 120 + y, 1, 1);
        g2d.fillRect(124 + x, 121 + y, 1, 2);
        g2d.fillRect(115 + x, 122 + y, 1, 4);
        g2d.fillRect(111 + x, 123 + y, 1, 1);
        g2d.fillRect(121 + x, 123 + y, 1, 3);
        g2d.fillRect(125 + x, 123 + y, 1, 5);
        g2d.fillRect(112 + x, 124 + y, 1, 3);
        g2d.fillRect(129 + x, 124 + y, 1, 2);
        g2d.fillRect(113 + x, 126 + y, 1, 2);
        g2d.fillRect(126 + x, 126 + y, 1, 3);
        g2d.fillRect(127 + x, 127 + y, 1, 3);
        g2d.fillRect(124 + x, 128 + y, 1, 1);
        g2d.fillRect(125 + x, 133 + y, 1, 1);
        g2d.fillRect(126 + x, 134 + y, 1, 2);
        g2d.fillRect(127 + x, 134 + y, 1, 1);
        g2d.fillRect(128 + x, 135 + y, 1, 3);
        g2d.fillRect(124 + x, 136 + y, 1, 2);
        g2d.fillRect(129 + x, 136 + y, 1, 3);
        g2d.fillRect(130 + x, 136 + y, 1, 4);
        g2d.fillRect(127 + x, 138 + y, 1, 1);
        g2d.fillRect(131 + x, 139 + y, 2, 1);
        g2d.fillRect(132 + x, 140 + y, 1, 1);
        g2d.fillRect(133 + x, 141 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,173,165,255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(101 + x, 105 + y, 1, 1);
        g2d.fillRect(103 + x, 105 + y, 1, 1);
        g2d.fillRect(100 + x, 106 + y, 1, 2);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(98 + x, 108 + y, 1, 1);
        g2d.fillRect(104 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 114 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 1, 1);
        g2d.fillRect(105 + x, 116 + y, 1, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 1);
        g2d.fillRect(113 + x, 117 + y, 1, 1);
        g2d.fillRect(110 + x, 119 + y, 1, 1);
        g2d.fillRect(112 + x, 120 + y, 1, 2);
        g2d.fillRect(113 + x, 121 + y, 1, 3);
        g2d.fillRect(114 + x, 124 + y, 1, 1);
        g2d.fillRect(133 + x, 124 + y, 1, 2);
        g2d.fillRect(111 + x, 125 + y, 1, 3);
        g2d.fillRect(113 + x, 125 + y, 1, 1);
        g2d.fillRect(136 + x, 125 + y, 1, 1);
        g2d.fillRect(120 + x, 126 + y, 1, 1);
        g2d.fillRect(134 + x, 129 + y, 1, 2);
        g2d.fillRect(133 + x, 131 + y, 1, 2);
        g2d.fillRect(135 + x, 132 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,189,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(97 + x, 103 + y, 1, 1);
        g2d.fillRect(106 + x, 110 + y, 1, 2);
        g2d.fillRect(107 + x, 110 + y, 1, 2);
        g2d.fillRect(135 + x, 127 + y, 1, 1);
        g2d.fillRect(124 + x, 132 + y, 1, 1);
        g2d.fillRect(126 + x, 133 + y, 1, 1);
        g2d.fillRect(128 + x, 133 + y, 1, 1);
        g2d.fillRect(129 + x, 134 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(181,189,181,255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(104 + x, 115 + y, 1, 1);
        g2d.fillRect(109 + x, 117 + y, 1, 2);
        g2d.fillRect(111 + x, 118 + y, 1, 2);
        g2d.fillRect(132 + x, 124 + y, 1, 2);
        g2d.fillRect(136 + x, 124 + y, 1, 1);
        g2d.fillRect(133 + x, 126 + y, 1, 1);
        g2d.fillRect(135 + x, 130 + y, 1, 2);
        g2d.fillRect(136 + x, 132 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,222,82,255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(104 + x, 113 + y, 1, 2);
        g2d.fillRect(106 + x, 116 + y, 2, 1);
        g2d.fillRect(127 + x, 125 + y, 1, 2);
        g2d.fillRect(128 + x, 127 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,189,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(94 + x, 100 + y, 1, 4);
        g2d.fillRect(93 + x, 101 + y, 1, 2);
        g2d.fillRect(99 + x, 103 + y, 1, 4);
        g2d.fillRect(98 + x, 104 + y, 1, 3);
        g2d.fillRect(104 + x, 112 + y, 1, 1);
        g2d.fillRect(103 + x, 113 + y, 1, 2);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 1);
        g2d.fillRect(110 + x, 115 + y, 1, 2);
        g2d.fillRect(112 + x, 117 + y, 1, 1);
        g2d.fillRect(116 + x, 119 + y, 1, 3);
        g2d.fillRect(108 + x, 120 + y, 1, 1);
        g2d.fillRect(119 + x, 120 + y, 1, 3);
        g2d.fillRect(120 + x, 123 + y, 1, 1);
        g2d.fillRect(116 + x, 125 + y, 1, 1);
        g2d.fillRect(129 + x, 126 + y, 1, 1);
        g2d.fillRect(132 + x, 126 + y, 1, 1);
        g2d.fillRect(130 + x, 127 + y, 1, 3);
        g2d.fillRect(133 + x, 127 + y, 1, 2);
        g2d.fillRect(134 + x, 127 + y, 1, 2);
        g2d.fillRect(131 + x, 131 + y, 1, 3);
        g2d.fillRect(132 + x, 135 + y, 1, 2);
        g2d.fillRect(137 + x, 135 + y, 1, 4);
        g2d.fillRect(126 + x, 138 + y, 1, 2);
        g2d.fillRect(133 + x, 139 + y, 1, 2);
        g2d.fillRect(138 + x, 139 + y, 1, 1);
        g2d.fillRect(132 + x, 141 + y, 1, 2);
        g2d.fillRect(134 + x, 141 + y, 1, 2);
        g2d.fillRect(139 + x, 142 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,222,165,255), COLORS.get(ImageUtilities.GREY_4)));
        g2d.fillRect(111 + x, 115 + y, 1, 2);
        g2d.fillRect(116 + x, 118 + y, 1, 1);
        g2d.fillRect(120 + x, 119 + y, 1, 3);
        g2d.fillRect(121 + x, 122 + y, 1, 1);
        g2d.fillRect(122 + x, 123 + y, 1, 1);
        g2d.fillRect(127 + x, 123 + y, 1, 2);
        g2d.fillRect(124 + x, 125 + y, 1, 3);
        g2d.fillRect(128 + x, 125 + y, 1, 1);
        g2d.fillRect(122 + x, 127 + y, 1, 1);
        g2d.fillRect(124 + x, 130 + y, 1, 2);
        g2d.fillRect(129 + x, 130 + y, 1, 3);
        g2d.fillRect(130 + x, 131 + y, 1, 4);
        g2d.fillRect(125 + x, 132 + y, 1, 1);
        g2d.fillRect(133 + x, 135 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,189,165,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 98 + y, 1, 2);
        g2d.fillRect(98 + x, 103 + y, 1, 1);
        g2d.fillRect(134 + x, 131 + y, 1, 1);
        g2d.fillRect(133 + x, 133 + y, 1, 2);
        g2d.fillRect(135 + x, 133 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,206,206,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 127 + y, 1, 1);
        g2d.fillRect(123 + x, 133 + y, 1, 2);
        g2d.fillRect(124 + x, 134 + y, 1, 2);
        g2d.fillRect(135 + x, 142 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,222,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(95 + x, 101 + y, 1, 2);
        g2d.fillRect(96 + x, 101 + y, 1, 2);
        g2d.fillRect(93 + x, 103 + y, 1, 1);
        g2d.fillRect(105 + x, 110 + y, 1, 2);
        g2d.fillRect(108 + x, 110 + y, 1, 2);
        g2d.fillRect(105 + x, 113 + y, 1, 2);
        g2d.fillRect(106 + x, 113 + y, 2, 1);
        g2d.fillRect(113 + x, 115 + y, 1, 2);
        g2d.fillRect(117 + x, 122 + y, 1, 1);
        g2d.fillRect(128 + x, 123 + y, 1, 2);
        g2d.fillRect(131 + x, 124 + y, 1, 2);
        g2d.fillRect(123 + x, 125 + y, 1, 1);
        g2d.fillRect(128 + x, 126 + y, 1, 1);
        g2d.fillRect(136 + x, 126 + y, 1, 2);
        g2d.fillRect(137 + x, 126 + y, 1, 3);
        g2d.fillRect(129 + x, 127 + y, 1, 3);
        g2d.fillRect(132 + x, 127 + y, 1, 3);
        g2d.fillRect(122 + x, 129 + y, 1, 2);
        g2d.fillRect(124 + x, 129 + y, 1, 1);
        g2d.fillRect(128 + x, 130 + y, 1, 1);
        g2d.fillRect(130 + x, 130 + y, 1, 1);
        g2d.fillRect(126 + x, 132 + y, 1, 1);
        g2d.fillRect(125 + x, 134 + y, 1, 2);
        g2d.fillRect(131 + x, 134 + y, 1, 5);
        g2d.fillRect(130 + x, 135 + y, 1, 1);
        g2d.fillRect(126 + x, 136 + y, 1, 1);
        g2d.fillRect(136 + x, 136 + y, 1, 2);
        g2d.fillRect(132 + x, 137 + y, 1, 2);
        g2d.fillRect(134 + x, 137 + y, 1, 1);
        g2d.fillRect(135 + x, 138 + y, 1, 2);
        g2d.fillRect(136 + x, 139 + y, 1, 2);
        g2d.fillRect(138 + x, 140 + y, 1, 3);
        g2d.fillRect(137 + x, 141 + y, 1, 1);
        g2d.fillRect(136 + x, 142 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222,222,222,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 99 + y, 1, 1);
        g2d.fillRect(92 + x, 101 + y, 1, 2);
        g2d.fillRect(95 + x, 103 + y, 2, 1);
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(108 + x, 117 + y, 1, 2);
        g2d.fillRect(137 + x, 125 + y, 1, 1);
        g2d.fillRect(138 + x, 128 + y, 1, 2);
        g2d.fillRect(137 + x, 129 + y, 1, 1);
        g2d.fillRect(136 + x, 134 + y, 1, 2);
        g2d.fillRect(133 + x, 136 + y, 1, 3);
        g2d.fillRect(134 + x, 138 + y, 1, 2);
        g2d.fillRect(138 + x, 138 + y, 1, 1);
        g2d.fillRect(139 + x, 141 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,165,255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(93 + x, 98 + y, 1, 2);
        g2d.fillRect(92 + x, 100 + y, 1, 1);
        g2d.fillRect(124 + x, 123 + y, 1, 2);
        g2d.fillRect(135 + x, 124 + y, 1, 1);
        g2d.fillRect(133 + x, 129 + y, 1, 2);
        g2d.fillRect(134 + x, 132 + y, 1, 1);
        g2d.fillRect(134 + x, 134 + y, 1, 3);
        g2d.fillRect(136 + x, 138 + y, 1, 1);
        g2d.fillRect(136 + x, 141 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239,239,239,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 100 + y, 1, 1);
        g2d.fillRect(96 + x, 104 + y, 1, 3);
        g2d.fillRect(98 + x, 107 + y, 2, 1);
        g2d.fillRect(106 + x, 114 + y, 1, 2);
        g2d.fillRect(107 + x, 114 + y, 1, 1);
        g2d.fillRect(113 + x, 114 + y, 1, 1);
        g2d.fillRect(112 + x, 115 + y, 1, 2);
        g2d.fillRect(107 + x, 117 + y, 1, 2);
        g2d.fillRect(119 + x, 118 + y, 2, 1);
        g2d.fillRect(108 + x, 119 + y, 2, 1);
        g2d.fillRect(120 + x, 122 + y, 1, 1);
        g2d.fillRect(123 + x, 123 + y, 1, 1);
        g2d.fillRect(122 + x, 124 + y, 1, 3);
        g2d.fillRect(134 + x, 124 + y, 1, 3);
        g2d.fillRect(135 + x, 125 + y, 1, 2);
        g2d.fillRect(123 + x, 126 + y, 1, 1);
        g2d.fillRect(122 + x, 128 + y, 1, 1);
        g2d.fillRect(136 + x, 128 + y, 1, 1);
        g2d.fillRect(123 + x, 129 + y, 1, 3);
        g2d.fillRect(126 + x, 129 + y, 1, 1);
        g2d.fillRect(127 + x, 130 + y, 1, 3);
        g2d.fillRect(128 + x, 131 + y, 1, 2);
        g2d.fillRect(124 + x, 133 + y, 1, 1);
        g2d.fillRect(129 + x, 133 + y, 1, 1);
        g2d.fillRect(134 + x, 133 + y, 1, 1);
        g2d.fillRect(128 + x, 134 + y, 1, 1);
        g2d.fillRect(135 + x, 134 + y, 1, 4);
        g2d.fillRect(129 + x, 135 + y, 1, 1);
        g2d.fillRect(125 + x, 136 + y, 1, 2);
        g2d.fillRect(126 + x, 137 + y, 1, 1);
        g2d.fillRect(137 + x, 139 + y, 1, 2);
        g2d.fillRect(125 + x, 140 + y, 1, 1);
        g2d.fillRect(135 + x, 140 + y, 1, 2);
        g2d.fillRect(137 + x, 142 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 98 + y, 1, 3);
        g2d.fillRect(97 + x, 102 + y, 1, 1);
        g2d.fillRect(95 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 117 + y, 1, 2);
        g2d.fillRect(116 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 118 + y, 1, 2);
        g2d.fillRect(118 + x, 118 + y, 1, 1);
        g2d.fillRect(121 + x, 120 + y, 1, 2);
        g2d.fillRect(122 + x, 121 + y, 1, 2);
        g2d.fillRect(123 + x, 121 + y, 1, 2);
        g2d.fillRect(123 + x, 124 + y, 1, 1);
        g2d.fillRect(123 + x, 127 + y, 1, 2);
        g2d.fillRect(125 + x, 128 + y, 1, 4);
        g2d.fillRect(126 + x, 130 + y, 1, 2);
        g2d.fillRect(123 + x, 132 + y, 1, 1);
        g2d.fillRect(127 + x, 133 + y, 1, 1);
        g2d.fillRect(127 + x, 135 + y, 1, 2);
    }





    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,123,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(133 + x, 145 + y, 1, 1);
        g2d.fillRect(134 + x, 146 + y, 2, 1);
        g2d.fillRect(132 + x, 153 + y, 1, 1);
        g2d.fillRect(134 + x, 157 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,148,148,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(139 + x, 144 + y, 1, 1);
        g2d.fillRect(140 + x, 145 + y, 1, 4);
        g2d.fillRect(141 + x, 150 + y, 1, 2);
        g2d.fillRect(142 + x, 152 + y, 1, 5);
        g2d.fillRect(141 + x, 157 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,156,82,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(133 + x, 143 + y, 1, 2);
        g2d.fillRect(134 + x, 145 + y, 1, 1);
        g2d.fillRect(135 + x, 147 + y, 1, 2);
        g2d.fillRect(134 + x, 148 + y, 1, 2);
        g2d.fillRect(132 + x, 151 + y, 1, 2);
        g2d.fillRect(136 + x, 151 + y, 1, 1);
        g2d.fillRect(139 + x, 151 + y, 1, 2);
        g2d.fillRect(137 + x, 153 + y, 1, 1);
        g2d.fillRect(133 + x, 154 + y, 1, 2);
        g2d.fillRect(140 + x, 154 + y, 1, 2);
        g2d.fillRect(134 + x, 155 + y, 1, 2);
        g2d.fillRect(135 + x, 157 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,189,82,255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(131 + x, 143 + y, 1, 1);
        g2d.fillRect(136 + x, 143 + y, 1, 2);
        g2d.fillRect(138 + x, 147 + y, 1, 3);
        g2d.fillRect(139 + x, 150 + y, 1, 1);
        g2d.fillRect(136 + x, 153 + y, 1, 1);
        g2d.fillRect(134 + x, 154 + y, 1, 1);
        g2d.fillRect(137 + x, 154 + y, 1, 3);
        g2d.fillRect(138 + x, 154 + y, 1, 1);
        g2d.fillRect(139 + x, 158 + y, 2, 1);
        g2d.fillRect(135 + x, 159 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,173,165,255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(138 + x, 143 + y, 1, 1);
        g2d.fillRect(139 + x, 145 + y, 1, 2);
        g2d.fillRect(133 + x, 150 + y, 1, 1);
        g2d.fillRect(136 + x, 152 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(181,189,181,255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(139 + x, 143 + y, 1, 1);
        g2d.fillRect(133 + x, 146 + y, 1, 2);
        g2d.fillRect(135 + x, 149 + y, 1, 3);
        g2d.fillRect(136 + x, 149 + y, 1, 2);
        g2d.fillRect(137 + x, 152 + y, 1, 1);
        g2d.fillRect(140 + x, 152 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,189,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(134 + x, 143 + y, 1, 2);
        g2d.fillRect(137 + x, 144 + y, 1, 1);
        g2d.fillRect(138 + x, 145 + y, 1, 2);
        g2d.fillRect(137 + x, 146 + y, 1, 1);
        g2d.fillRect(139 + x, 147 + y, 1, 2);
        g2d.fillRect(140 + x, 149 + y, 1, 2);
        g2d.fillRect(134 + x, 150 + y, 1, 1);
        g2d.fillRect(133 + x, 152 + y, 1, 2);
        g2d.fillRect(141 + x, 152 + y, 1, 2);
        g2d.fillRect(139 + x, 153 + y, 1, 2);
        g2d.fillRect(132 + x, 154 + y, 1, 1);
        g2d.fillRect(141 + x, 155 + y, 1, 2);
        g2d.fillRect(140 + x, 156 + y, 1, 2);
        g2d.fillRect(137 + x, 157 + y, 1, 2);
        g2d.fillRect(138 + x, 159 + y, 2, 1);
        g2d.fillRect(137 + x, 161 + y, 1, 2);
        g2d.fillRect(136 + x, 163 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,222,165,255), COLORS.get(ImageUtilities.GREY_4)));
        g2d.fillRect(135 + x, 145 + y, 1, 1);
        g2d.fillRect(134 + x, 147 + y, 1, 1);
        g2d.fillRect(137 + x, 147 + y, 1, 3);
        g2d.fillRect(133 + x, 148 + y, 1, 2);
        g2d.fillRect(138 + x, 150 + y, 1, 3);
        g2d.fillRect(134 + x, 152 + y, 1, 2);
        g2d.fillRect(135 + x, 155 + y, 1, 1);
        g2d.fillRect(136 + x, 158 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,189,165,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(132 + x, 149 + y, 1, 1);
        g2d.fillRect(134 + x, 151 + y, 1, 1);
        g2d.fillRect(138 + x, 155 + y, 1, 3);
        g2d.fillRect(135 + x, 156 + y, 1, 1);
        g2d.fillRect(136 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,206,206,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(139 + x, 149 + y, 1, 1);
        g2d.fillRect(132 + x, 150 + y, 1, 1);
        g2d.fillRect(133 + x, 151 + y, 1, 1);
        g2d.fillRect(140 + x, 151 + y, 1, 1);
        g2d.fillRect(135 + x, 153 + y, 1, 2);
        g2d.fillRect(136 + x, 154 + y, 1, 2);
        g2d.fillRect(141 + x, 154 + y, 1, 1);
        g2d.fillRect(138 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,222,165,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(136 + x, 156 + y, 1, 1);
        g2d.fillRect(139 + x, 156 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,165,255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(135 + x, 143 + y, 1, 2);
        g2d.fillRect(137 + x, 143 + y, 1, 1);
        g2d.fillRect(138 + x, 144 + y, 1, 1);
        g2d.fillRect(136 + x, 145 + y, 2, 1);
        g2d.fillRect(137 + x, 150 + y, 1, 2);
        g2d.fillRect(135 + x, 152 + y, 1, 1);
        g2d.fillRect(139 + x, 155 + y, 1, 1);
        g2d.fillRect(136 + x, 157 + y, 1, 1);
        g2d.fillRect(136 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239,239,239,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(132 + x, 143 + y, 1, 1);
        g2d.fillRect(136 + x, 146 + y, 1, 3);
        g2d.fillRect(138 + x, 153 + y, 1, 1);
        g2d.fillRect(137 + x, 159 + y, 1, 2);
        g2d.fillRect(136 + x, 162 + y, 1, 1);
    }
}
