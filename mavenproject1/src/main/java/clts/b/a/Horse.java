/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b.a;

import clts.SuperB;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Horse extends SuperB
{

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }

    boolean originalColorArray = true;
    public Horse()
    {
        super();
    }

    public Horse(int layer)
    {
        super(layer);
    }

    public Horse(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public Horse(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintF(offsetX, offsetY, g2d);
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintM(offsetX, offsetY, g2d);

        if(tail == 0)
        {
            paintB1(offsetX, offsetY, g2d);
            if(Math.random() < .2)
                tail++;
        }
        else if (tail == 1)
        {
            paintB2(offsetX, offsetY, g2d);
            tail++;
        }
        else if (tail == 2)
        {
            paintB4(offsetX, offsetY, g2d);
            tail++;
        }
        else if (tail == 3)
        {
            paintB3(offsetX, offsetY, g2d);
            tail = 0;
        }
    }
    int tail = 0;

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44,18,8,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(74 + x, 127 + y, 1, 1);
        g2d.fillRect(59 + x, 132 + y, 1, 1);
        g2d.fillRect(57 + x, 133 + y, 1, 2);
        g2d.fillRect(71 + x, 133 + y, 2, 1);
        g2d.fillRect(82 + x, 133 + y, 1, 1);
        g2d.fillRect(81 + x, 134 + y, 1, 1);
        g2d.fillRect(112 + x, 138 + y, 1, 1);
        g2d.fillRect(98 + x, 147 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70,26,10,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(82 + x, 124 + y, 1, 1);
        g2d.fillRect(73 + x, 127 + y, 1, 1);
        g2d.fillRect(66 + x, 128 + y, 1, 1);
        g2d.fillRect(65 + x, 129 + y, 1, 1);
        g2d.fillRect(70 + x, 133 + y, 1, 1);
        g2d.fillRect(81 + x, 133 + y, 1, 1);
        g2d.fillRect(99 + x, 145 + y, 1, 1);
        g2d.fillRect(98 + x, 146 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78,34,13,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(82 + x, 131 + y, 1, 1);
        g2d.fillRect(109 + x, 141 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73,34,19,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(74 + x, 119 + y, 1, 2);
        g2d.fillRect(71 + x, 124 + y, 2, 1);
        g2d.fillRect(76 + x, 124 + y, 1, 2);
        g2d.fillRect(79 + x, 124 + y, 1, 2);
        g2d.fillRect(73 + x, 126 + y, 1, 1);
        g2d.fillRect(64 + x, 128 + y, 1, 1);
        g2d.fillRect(60 + x, 129 + y, 1, 2);
        g2d.fillRect(66 + x, 129 + y, 1, 1);
        g2d.fillRect(83 + x, 129 + y, 1, 3);
        g2d.fillRect(65 + x, 130 + y, 1, 2);
        g2d.fillRect(59 + x, 131 + y, 1, 1);
        g2d.fillRect(62 + x, 131 + y, 1, 1);
        g2d.fillRect(71 + x, 132 + y, 1, 1);
        g2d.fillRect(82 + x, 132 + y, 1, 1);
        g2d.fillRect(58 + x, 133 + y, 1, 1);
        g2d.fillRect(66 + x, 133 + y, 1, 2);
        g2d.fillRect(62 + x, 134 + y, 1, 1);
        g2d.fillRect(60 + x, 135 + y, 2, 1);
        g2d.fillRect(58 + x, 136 + y, 2, 1);
        g2d.fillRect(99 + x, 137 + y, 1, 2);
        g2d.fillRect(108 + x, 139 + y, 1, 1);
        g2d.fillRect(102 + x, 140 + y, 1, 2);
        g2d.fillRect(104 + x, 140 + y, 1, 2);
        g2d.fillRect(109 + x, 140 + y, 1, 1);
        g2d.fillRect(110 + x, 141 + y, 1, 1);
        g2d.fillRect(105 + x, 142 + y, 1, 1);
        g2d.fillRect(96 + x, 144 + y, 1, 1);
        g2d.fillRect(99 + x, 144 + y, 1, 1);
        g2d.fillRect(99 + x, 146 + y, 1, 1);
        g2d.fillRect(97 + x, 147 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86,41,21,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(58 + x, 77 + y, 1, 1);
        g2d.fillRect(71 + x, 91 + y, 1, 2);
        g2d.fillRect(72 + x, 93 + y, 1, 3);
        g2d.fillRect(79 + x, 123 + y, 1, 1);
        g2d.fillRect(70 + x, 124 + y, 1, 1);
        g2d.fillRect(72 + x, 126 + y, 1, 1);
        g2d.fillRect(74 + x, 126 + y, 2, 1);
        g2d.fillRect(79 + x, 126 + y, 1, 1);
        g2d.fillRect(64 + x, 129 + y, 1, 1);
        g2d.fillRect(67 + x, 129 + y, 1, 1);
        g2d.fillRect(57 + x, 136 + y, 1, 1);
        g2d.fillRect(107 + x, 138 + y, 1, 1);
        g2d.fillRect(102 + x, 139 + y, 1, 1);
        g2d.fillRect(100 + x, 140 + y, 1, 1);
        g2d.fillRect(100 + x, 142 + y, 1, 2);
        g2d.fillRect(97 + x, 144 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96,45,19,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(65 + x, 132 + y, 1, 1);
        g2d.fillRect(104 + x, 139 + y, 1, 1);
        g2d.fillRect(108 + x, 140 + y, 1, 1);
        g2d.fillRect(100 + x, 141 + y, 1, 1);
        g2d.fillRect(105 + x, 141 + y, 1, 1);
        g2d.fillRect(102 + x, 142 + y, 1, 1);
        g2d.fillRect(99 + x, 143 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89,50,31,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(59 + x, 76 + y, 1, 1);
        g2d.fillRect(67 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(98,51,24,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(66 + x, 72 + y, 1, 1);
        g2d.fillRect(72 + x, 96 + y, 1, 1);
        g2d.fillRect(89 + x, 103 + y, 1, 1);
        g2d.fillRect(71 + x, 126 + y, 1, 1);
        g2d.fillRect(75 + x, 127 + y, 1, 1);
        g2d.fillRect(63 + x, 128 + y, 1, 1);
        g2d.fillRect(65 + x, 128 + y, 1, 1);
        g2d.fillRect(70 + x, 131 + y, 1, 1);
        g2d.fillRect(108 + x, 136 + y, 1, 1);
        g2d.fillRect(101 + x, 138 + y, 1, 1);
        g2d.fillRect(105 + x, 140 + y, 1, 1);
        g2d.fillRect(110 + x, 140 + y, 1, 1);
        g2d.fillRect(104 + x, 142 + y, 1, 1);
        g2d.fillRect(106 + x, 142 + y, 1, 1);
        g2d.fillRect(97 + x, 143 + y, 1, 1);
        g2d.fillRect(102 + x, 143 + y, 1, 1);
        g2d.fillRect(105 + x, 143 + y, 1, 1);
        g2d.fillRect(96 + x, 145 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65,59,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(70 + x, 127 + y, 1, 4);
        g2d.fillRect(71 + x, 131 + y, 1, 1);
        g2d.fillRect(72 + x, 132 + y, 1, 1);
        g2d.fillRect(76 + x, 137 + y, 2, 1);
        g2d.fillRect(113 + x, 148 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96,58,26,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(64 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,61,21,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(62 + x, 74 + y, 1, 1);
        g2d.fillRect(61 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105,54,26,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 97 + y, 1, 1);
        g2d.fillRect(73 + x, 98 + y, 1, 1);
        g2d.fillRect(89 + x, 102 + y, 1, 1);
        g2d.fillRect(77 + x, 124 + y, 1, 1);
        g2d.fillRect(72 + x, 125 + y, 1, 1);
        g2d.fillRect(66 + x, 127 + y, 1, 1);
        g2d.fillRect(79 + x, 128 + y, 1, 1);
        g2d.fillRect(68 + x, 129 + y, 1, 1);
        g2d.fillRect(59 + x, 130 + y, 1, 1);
        g2d.fillRect(69 + x, 130 + y, 1, 1);
        g2d.fillRect(60 + x, 131 + y, 1, 1);
        g2d.fillRect(64 + x, 135 + y, 1, 1);
        g2d.fillRect(104 + x, 137 + y, 1, 1);
        g2d.fillRect(109 + x, 139 + y, 1, 1);
        g2d.fillRect(101 + x, 140 + y, 1, 3);
        g2d.fillRect(99 + x, 147 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(109,58,27,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(73 + x, 96 + y, 1, 2);
        g2d.fillRect(72 + x, 98 + y, 1, 1);
        g2d.fillRect(74 + x, 98 + y, 2, 1);
        g2d.fillRect(76 + x, 99 + y, 1, 1);
        g2d.fillRect(109 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(72 + x, 101 + y, 1, 1);
        g2d.fillRect(108 + x, 101 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 1, 1);
        g2d.fillRect(107 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 1, 1);
        g2d.fillRect(89 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 104 + y, 1, 3);
        g2d.fillRect(104 + x, 104 + y, 3, 1);
        g2d.fillRect(112 + x, 104 + y, 3, 1);
        g2d.fillRect(103 + x, 105 + y, 1, 2);
        g2d.fillRect(109 + x, 105 + y, 3, 1);
        g2d.fillRect(104 + x, 106 + y, 5, 1);
        g2d.fillRect(73 + x, 108 + y, 1, 1);
        g2d.fillRect(96 + x, 114 + y, 1, 1);
        g2d.fillRect(77 + x, 120 + y, 1, 1);
        g2d.fillRect(74 + x, 122 + y, 1, 1);
        g2d.fillRect(80 + x, 123 + y, 1, 1);
        g2d.fillRect(71 + x, 125 + y, 1, 1);
        g2d.fillRect(67 + x, 127 + y, 1, 1);
        g2d.fillRect(60 + x, 128 + y, 1, 1);
        g2d.fillRect(83 + x, 128 + y, 1, 1);
        g2d.fillRect(69 + x, 133 + y, 1, 1);
        g2d.fillRect(79 + x, 134 + y, 1, 2);
        g2d.fillRect(105 + x, 139 + y, 1, 1);
        g2d.fillRect(106 + x, 141 + y, 1, 1);
        g2d.fillRect(112 + x, 142 + y, 1, 1);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(100 + x, 146 + y, 1, 1);
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(98 + x, 148 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(120,57,22,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 88 + y, 1, 5);
        g2d.fillRect(71 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 104 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113,60,28,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 99 + y, 1, 2);
        g2d.fillRect(82 + x, 101 + y, 1, 1);
        g2d.fillRect(72 + x, 102 + y, 1, 1);
        g2d.fillRect(71 + x, 103 + y, 1, 1);
        g2d.fillRect(88 + x, 104 + y, 1, 1);
        g2d.fillRect(89 + x, 105 + y, 2, 1);
        g2d.fillRect(70 + x, 106 + y, 1, 2);
        g2d.fillRect(72 + x, 108 + y, 1, 1);
        g2d.fillRect(74 + x, 108 + y, 1, 1);
        g2d.fillRect(67 + x, 111 + y, 1, 1);
        g2d.fillRect(95 + x, 113 + y, 1, 1);
        g2d.fillRect(73 + x, 120 + y, 1, 1);
        g2d.fillRect(103 + x, 121 + y, 1, 1);
        g2d.fillRect(72 + x, 123 + y, 1, 1);
        g2d.fillRect(82 + x, 123 + y, 1, 1);
        g2d.fillRect(73 + x, 124 + y, 1, 1);
        g2d.fillRect(75 + x, 125 + y, 1, 1);
        g2d.fillRect(76 + x, 126 + y, 1, 1);
        g2d.fillRect(59 + x, 135 + y, 1, 1);
        g2d.fillRect(61 + x, 138 + y, 1, 1);
        g2d.fillRect(105 + x, 138 + y, 1, 1);
        g2d.fillRect(106 + x, 140 + y, 1, 1);
        g2d.fillRect(107 + x, 142 + y, 1, 1);
        g2d.fillRect(111 + x, 142 + y, 1, 1);
        g2d.fillRect(96 + x, 143 + y, 1, 1);
        g2d.fillRect(101 + x, 143 + y, 1, 1);
        g2d.fillRect(106 + x, 143 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(72,67,63,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(78 + x, 133 + y, 1, 4);
        g2d.fillRect(74 + x, 136 + y, 1, 1);
        g2d.fillRect(77 + x, 136 + y, 1, 1);
        g2d.fillRect(75 + x, 137 + y, 1, 1);
        g2d.fillRect(114 + x, 143 + y, 1, 1);
        g2d.fillRect(115 + x, 144 + y, 1, 2);
        g2d.fillRect(108 + x, 145 + y, 1, 1);
        g2d.fillRect(112 + x, 148 + y, 1, 1);
        g2d.fillRect(115 + x, 148 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111,61,34,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(64 + x, 127 + y, 1, 1);
        g2d.fillRect(61 + x, 129 + y, 1, 1);
        g2d.fillRect(80 + x, 133 + y, 1, 1);
        g2d.fillRect(58 + x, 134 + y, 1, 1);
        g2d.fillRect(102 + x, 144 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(116,64,28,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(79 + x, 72 + y, 1, 1);
        g2d.fillRect(77 + x, 99 + y, 1, 1);
        g2d.fillRect(57 + x, 100 + y, 1, 1);
        g2d.fillRect(80 + x, 100 + y, 1, 1);
        g2d.fillRect(81 + x, 101 + y, 1, 1);
        g2d.fillRect(58 + x, 102 + y, 1, 2);
        g2d.fillRect(82 + x, 102 + y, 3, 1);
        g2d.fillRect(87 + x, 103 + y, 1, 1);
        g2d.fillRect(71 + x, 104 + y, 1, 2);
        g2d.fillRect(59 + x, 105 + y, 1, 9);
        g2d.fillRect(90 + x, 106 + y, 1, 1);
        g2d.fillRect(69 + x, 108 + y, 1, 1);
        g2d.fillRect(75 + x, 108 + y, 2, 1);
        g2d.fillRect(72 + x, 109 + y, 1, 1);
        g2d.fillRect(68 + x, 110 + y, 1, 1);
        g2d.fillRect(66 + x, 112 + y, 1, 1);
        g2d.fillRect(76 + x, 120 + y, 1, 1);
        g2d.fillRect(75 + x, 121 + y, 1, 2);
        g2d.fillRect(103 + x, 122 + y, 1, 1);
        g2d.fillRect(71 + x, 123 + y, 1, 1);
        g2d.fillRect(74 + x, 123 + y, 1, 1);
        g2d.fillRect(81 + x, 123 + y, 1, 3);
        g2d.fillRect(83 + x, 124 + y, 1, 3);
        g2d.fillRect(77 + x, 125 + y, 1, 1);
        g2d.fillRect(82 + x, 125 + y, 1, 2);
        g2d.fillRect(67 + x, 126 + y, 1, 1);
        g2d.fillRect(80 + x, 128 + y, 1, 1);
        g2d.fillRect(64 + x, 130 + y, 1, 4);
        g2d.fillRect(58 + x, 132 + y, 1, 1);
        g2d.fillRect(60 + x, 132 + y, 1, 1);
        g2d.fillRect(81 + x, 132 + y, 1, 1);
        g2d.fillRect(59 + x, 133 + y, 1, 1);
        g2d.fillRect(67 + x, 134 + y, 1, 1);
        g2d.fillRect(57 + x, 135 + y, 2, 1);
        g2d.fillRect(65 + x, 135 + y, 1, 1);
        g2d.fillRect(97 + x, 136 + y, 1, 2);
        g2d.fillRect(104 + x, 136 + y, 1, 1);
        g2d.fillRect(96 + x, 137 + y, 1, 3);
        g2d.fillRect(108 + x, 138 + y, 1, 1);
        g2d.fillRect(110 + x, 138 + y, 1, 1);
        g2d.fillRect(95 + x, 139 + y, 1, 3);
        g2d.fillRect(99 + x, 139 + y, 1, 1);
        g2d.fillRect(101 + x, 139 + y, 1, 1);
        g2d.fillRect(98 + x, 140 + y, 1, 1);
        g2d.fillRect(96 + x, 141 + y, 1, 1);
        g2d.fillRect(108 + x, 142 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75,70,66,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 127 + y, 1, 1);
        g2d.fillRect(73 + x, 128 + y, 1, 1);
        g2d.fillRect(79 + x, 133 + y, 1, 1);
        g2d.fillRect(113 + x, 142 + y, 1, 1);
        g2d.fillRect(107 + x, 144 + y, 1, 1);
        g2d.fillRect(109 + x, 146 + y, 1, 1);
        g2d.fillRect(116 + x, 146 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,62,26,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 87 + y, 1, 1);
        g2d.fillRect(71 + x, 90 + y, 1, 1);
        g2d.fillRect(73 + x, 91 + y, 1, 2);
        g2d.fillRect(71 + x, 94 + y, 1, 2);
        g2d.fillRect(88 + x, 103 + y, 1, 1);
        g2d.fillRect(106 + x, 103 + y, 1, 1);
        g2d.fillRect(108 + x, 104 + y, 1, 1);
        g2d.fillRect(75 + x, 119 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(116,65,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(63 + x, 127 + y, 1, 1);
        g2d.fillRect(65 + x, 134 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,67,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(69 + x, 71 + y, 1, 1);
        g2d.fillRect(73 + x, 71 + y, 6, 1);
        g2d.fillRect(80 + x, 72 + y, 1, 1);
        g2d.fillRect(81 + x, 73 + y, 1, 1);
        g2d.fillRect(55 + x, 90 + y, 1, 1);
        g2d.fillRect(73 + x, 90 + y, 1, 1);
        g2d.fillRect(78 + x, 99 + y, 1, 1);
        g2d.fillRect(79 + x, 100 + y, 1, 1);
        g2d.fillRect(57 + x, 101 + y, 1, 1);
        g2d.fillRect(81 + x, 103 + y, 2, 1);
        g2d.fillRect(86 + x, 103 + y, 1, 1);
        g2d.fillRect(58 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 1);
        g2d.fillRect(77 + x, 108 + y, 1, 1);
        g2d.fillRect(69 + x, 109 + y, 1, 1);
        g2d.fillRect(66 + x, 113 + y, 1, 1);
        g2d.fillRect(59 + x, 114 + y, 1, 2);
        g2d.fillRect(67 + x, 114 + y, 1, 1);
        g2d.fillRect(68 + x, 115 + y, 1, 1);
        g2d.fillRect(104 + x, 116 + y, 1, 2);
        g2d.fillRect(60 + x, 117 + y, 1, 1);
        g2d.fillRect(101 + x, 117 + y, 1, 1);
        g2d.fillRect(102 + x, 118 + y, 1, 3);
        g2d.fillRect(103 + x, 118 + y, 1, 1);
        g2d.fillRect(73 + x, 119 + y, 1, 1);
        g2d.fillRect(94 + x, 119 + y, 1, 1);
        g2d.fillRect(80 + x, 122 + y, 1, 1);
        g2d.fillRect(95 + x, 122 + y, 1, 5);
        g2d.fillRect(103 + x, 123 + y, 1, 8);
        g2d.fillRect(83 + x, 127 + y, 1, 1);
        g2d.fillRect(97 + x, 129 + y, 1, 1);
        g2d.fillRect(98 + x, 130 + y, 1, 1);
        g2d.fillRect(57 + x, 132 + y, 1, 1);
        g2d.fillRect(68 + x, 132 + y, 1, 1);
        g2d.fillRect(83 + x, 132 + y, 1, 1);
        g2d.fillRect(108 + x, 135 + y, 1, 1);
        g2d.fillRect(60 + x, 136 + y, 1, 1);
        g2d.fillRect(63 + x, 136 + y, 1, 1);
        g2d.fillRect(112 + x, 137 + y, 1, 1);
        g2d.fillRect(104 + x, 138 + y, 1, 1);
        g2d.fillRect(111 + x, 138 + y, 1, 1);
        g2d.fillRect(109 + x, 142 + y, 2, 1);
        g2d.fillRect(99 + x, 148 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,69,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 71 + y, 1, 1);
        g2d.fillRect(67 + x, 72 + y, 2, 1);
        g2d.fillRect(82 + x, 73 + y, 1, 1);
        g2d.fillRect(83 + x, 74 + y, 1, 1);
        g2d.fillRect(84 + x, 75 + y, 2, 1);
        g2d.fillRect(85 + x, 76 + y, 4, 1);
        g2d.fillRect(93 + x, 76 + y, 6, 1);
        g2d.fillRect(85 + x, 103 + y, 1, 1);
        g2d.fillRect(81 + x, 104 + y, 1, 2);
        g2d.fillRect(80 + x, 105 + y, 1, 2);
        g2d.fillRect(104 + x, 105 + y, 1, 1);
        g2d.fillRect(78 + x, 107 + y, 1, 1);
        g2d.fillRect(90 + x, 107 + y, 1, 1);
        g2d.fillRect(91 + x, 108 + y, 1, 1);
        g2d.fillRect(102 + x, 108 + y, 1, 1);
        g2d.fillRect(94 + x, 113 + y, 1, 1);
        g2d.fillRect(101 + x, 113 + y, 1, 4);
        g2d.fillRect(69 + x, 115 + y, 1, 1);
        g2d.fillRect(104 + x, 115 + y, 1, 1);
        g2d.fillRect(60 + x, 116 + y, 1, 1);
        g2d.fillRect(70 + x, 116 + y, 1, 1);
        g2d.fillRect(72 + x, 117 + y, 1, 1);
        g2d.fillRect(60 + x, 118 + y, 1, 1);
        g2d.fillRect(77 + x, 119 + y, 1, 1);
        g2d.fillRect(75 + x, 120 + y, 1, 1);
        g2d.fillRect(94 + x, 120 + y, 1, 2);
        g2d.fillRect(60 + x, 123 + y, 1, 5);
        g2d.fillRect(67 + x, 125 + y, 1, 1);
        g2d.fillRect(96 + x, 128 + y, 1, 1);
        g2d.fillRect(103 + x, 131 + y, 1, 1);
        g2d.fillRect(80 + x, 132 + y, 1, 1);
        g2d.fillRect(99 + x, 133 + y, 1, 2);
        g2d.fillRect(103 + x, 133 + y, 1, 2);
        g2d.fillRect(104 + x, 135 + y, 1, 1);
        g2d.fillRect(63 + x, 137 + y, 1, 1);
        g2d.fillRect(62 + x, 138 + y, 1, 2);
        g2d.fillRect(102 + x, 138 + y, 1, 1);
        g2d.fillRect(97 + x, 141 + y, 1, 2);
        g2d.fillRect(112 + x, 141 + y, 1, 1);
        g2d.fillRect(95 + x, 142 + y, 2, 1);
        g2d.fillRect(101 + x, 146 + y, 1, 1);
        g2d.fillRect(98 + x, 149 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,76,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(60 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,69,38,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(65 + x, 127 + y, 1, 1);
        g2d.fillRect(64 + x, 134 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81,77,72,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(71 + x, 127 + y, 1, 1);
        g2d.fillRect(72 + x, 128 + y, 1, 2);
        g2d.fillRect(74 + x, 128 + y, 1, 1);
        g2d.fillRect(73 + x, 129 + y, 1, 1);
        g2d.fillRect(79 + x, 132 + y, 1, 1);
        g2d.fillRect(72 + x, 134 + y, 1, 1);
        g2d.fillRect(73 + x, 135 + y, 1, 1);
        g2d.fillRect(75 + x, 138 + y, 1, 1);
        g2d.fillRect(110 + x, 147 + y, 1, 1);
        g2d.fillRect(111 + x, 148 + y, 1, 1);
        g2d.fillRect(116 + x, 148 + y, 1, 1);
        g2d.fillRect(112 + x, 149 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129,70,32,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(74 + x, 118 + y, 1, 1);
        g2d.fillRect(74 + x, 121 + y, 1, 1);
        g2d.fillRect(78 + x, 121 + y, 1, 1);
        g2d.fillRect(76 + x, 123 + y, 1, 1);
        g2d.fillRect(100 + x, 136 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,72,33,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(70 + x, 71 + y, 2, 1);
        g2d.fillRect(65 + x, 73 + y, 1, 1);
        g2d.fillRect(89 + x, 76 + y, 4, 1);
        g2d.fillRect(79 + x, 107 + y, 1, 1);
        g2d.fillRect(102 + x, 109 + y, 1, 4);
        g2d.fillRect(65 + x, 114 + y, 1, 1);
        g2d.fillRect(67 + x, 115 + y, 1, 1);
        g2d.fillRect(77 + x, 116 + y, 1, 1);
        g2d.fillRect(65 + x, 117 + y, 1, 3);
        g2d.fillRect(71 + x, 117 + y, 1, 1);
        g2d.fillRect(72 + x, 118 + y, 1, 1);
        g2d.fillRect(61 + x, 119 + y, 1, 4);
        g2d.fillRect(66 + x, 123 + y, 1, 2);
        g2d.fillRect(95 + x, 127 + y, 1, 1);
        g2d.fillRect(59 + x, 129 + y, 1, 1);
        g2d.fillRect(79 + x, 130 + y, 1, 1);
        g2d.fillRect(98 + x, 131 + y, 1, 1);
        g2d.fillRect(103 + x, 132 + y, 1, 1);
        g2d.fillRect(69 + x, 135 + y, 1, 1);
        g2d.fillRect(62 + x, 137 + y, 1, 1);
        g2d.fillRect(106 + x, 137 + y, 1, 1);
        g2d.fillRect(99 + x, 142 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(134,68,29,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 86 + y, 1, 1);
        g2d.fillRect(71 + x, 87 + y, 1, 3);
        g2d.fillRect(73 + x, 87 + y, 1, 3);
        g2d.fillRect(73 + x, 93 + y, 1, 3);
        g2d.fillRect(71 + x, 96 + y, 1, 1);
        g2d.fillRect(75 + x, 99 + y, 1, 2);
        g2d.fillRect(89 + x, 101 + y, 1, 1);
        g2d.fillRect(109 + x, 101 + y, 1, 4);
        g2d.fillRect(115 + x, 101 + y, 1, 1);
        g2d.fillRect(88 + x, 102 + y, 1, 1);
        g2d.fillRect(90 + x, 102 + y, 1, 3);
        g2d.fillRect(112 + x, 102 + y, 1, 1);
        g2d.fillRect(108 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 103 + y, 1, 2);
        g2d.fillRect(75 + x, 104 + y, 1, 1);
        g2d.fillRect(111 + x, 104 + y, 1, 1);
        g2d.fillRect(101 + x, 105 + y, 1, 1);
        g2d.fillRect(107 + x, 105 + y, 2, 1);
        g2d.fillRect(74 + x, 106 + y, 1, 1);
        g2d.fillRect(71 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128,73,34,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(87 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 107 + y, 1, 1);
        g2d.fillRect(78 + x, 108 + y, 1, 1);
        g2d.fillRect(72 + x, 110 + y, 1, 1);
        g2d.fillRect(92 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 113 + y, 1, 2);
        g2d.fillRect(66 + x, 114 + y, 1, 1);
        g2d.fillRect(93 + x, 115 + y, 1, 4);
        g2d.fillRect(65 + x, 116 + y, 1, 1);
        g2d.fillRect(78 + x, 117 + y, 1, 1);
        g2d.fillRect(65 + x, 120 + y, 1, 2);
        g2d.fillRect(83 + x, 123 + y, 1, 1);
        g2d.fillRect(78 + x, 126 + y, 1, 1);
        g2d.fillRect(77 + x, 127 + y, 1, 1);
        g2d.fillRect(78 + x, 129 + y, 1, 1);
        g2d.fillRect(96 + x, 129 + y, 1, 1);
        g2d.fillRect(97 + x, 130 + y, 1, 1);
        g2d.fillRect(80 + x, 131 + y, 1, 1);
        g2d.fillRect(111 + x, 140 + y, 1, 1);
        g2d.fillRect(94 + x, 142 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128,73,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(65 + x, 115 + y, 1, 1);
        g2d.fillRect(62 + x, 126 + y, 1, 1);
        g2d.fillRect(68 + x, 135 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85,80,76,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(71 + x, 128 + y, 1, 3);
        g2d.fillRect(72 + x, 130 + y, 2, 1);
        g2d.fillRect(79 + x, 131 + y, 1, 1);
        g2d.fillRect(73 + x, 132 + y, 1, 1);
        g2d.fillRect(71 + x, 134 + y, 1, 1);
        g2d.fillRect(76 + x, 136 + y, 1, 1);
        g2d.fillRect(76 + x, 139 + y, 1, 2);
        g2d.fillRect(63 + x, 140 + y, 1, 1);
        g2d.fillRect(64 + x, 141 + y, 3, 1);
        g2d.fillRect(74 + x, 141 + y, 2, 1);
        g2d.fillRect(108 + x, 144 + y, 1, 1);
        g2d.fillRect(100 + x, 147 + y, 1, 1);
        g2d.fillRect(99 + x, 149 + y, 1, 3);
        g2d.fillRect(112 + x, 150 + y, 1, 1);
        g2d.fillRect(113 + x, 151 + y, 1, 2);
        g2d.fillRect(100 + x, 152 + y, 1, 1);
        g2d.fillRect(101 + x, 153 + y, 2, 1);
        g2d.fillRect(112 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131,76,35,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 111 + y, 1, 1);
        g2d.fillRect(73 + x, 112 + y, 1, 1);
        g2d.fillRect(75 + x, 114 + y, 1, 1);
        g2d.fillRect(79 + x, 118 + y, 1, 1);
        g2d.fillRect(80 + x, 119 + y, 1, 1);
        g2d.fillRect(81 + x, 120 + y, 1, 3);
        g2d.fillRect(72 + x, 121 + y, 1, 2);
        g2d.fillRect(82 + x, 121 + y, 1, 2);
        g2d.fillRect(66 + x, 122 + y, 1, 1);
        g2d.fillRect(81 + x, 126 + y, 1, 1);
        g2d.fillRect(59 + x, 128 + y, 1, 1);
        g2d.fillRect(78 + x, 128 + y, 1, 1);
        g2d.fillRect(79 + x, 129 + y, 1, 1);
        g2d.fillRect(98 + x, 132 + y, 1, 3);
        g2d.fillRect(98 + x, 136 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,76,36,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 97 + y, 1, 2);
        g2d.fillRect(91 + x, 109 + y, 1, 1);
        g2d.fillRect(73 + x, 111 + y, 1, 1);
        g2d.fillRect(93 + x, 111 + y, 1, 1);
        g2d.fillRect(104 + x, 112 + y, 1, 1);
        g2d.fillRect(74 + x, 113 + y, 1, 1);
        g2d.fillRect(93 + x, 114 + y, 1, 1);
        g2d.fillRect(76 + x, 115 + y, 1, 1);
        g2d.fillRect(80 + x, 120 + y, 1, 1);
        g2d.fillRect(81 + x, 127 + y, 1, 1);
        g2d.fillRect(98 + x, 135 + y, 1, 1);
        g2d.fillRect(106 + x, 144 + y, 1, 1);
        g2d.fillRect(102 + x, 146 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,75,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(63 + x, 74 + y, 1, 1);
        g2d.fillRect(76 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140,74,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(73 + x, 84 + y, 1, 3);
        g2d.fillRect(71 + x, 86 + y, 1, 1);
        g2d.fillRect(70 + x, 90 + y, 1, 4);
        g2d.fillRect(74 + x, 91 + y, 1, 5);
        g2d.fillRect(75 + x, 94 + y, 1, 2);
        g2d.fillRect(76 + x, 95 + y, 1, 2);
        g2d.fillRect(77 + x, 96 + y, 1, 3);
        g2d.fillRect(74 + x, 97 + y, 1, 1);
        g2d.fillRect(78 + x, 97 + y, 1, 2);
        g2d.fillRect(79 + x, 98 + y, 1, 2);
        g2d.fillRect(90 + x, 98 + y, 1, 2);
        g2d.fillRect(74 + x, 99 + y, 1, 1);
        g2d.fillRect(80 + x, 99 + y, 2, 1);
        g2d.fillRect(89 + x, 99 + y, 1, 2);
        g2d.fillRect(76 + x, 100 + y, 2, 1);
        g2d.fillRect(81 + x, 100 + y, 3, 1);
        g2d.fillRect(115 + x, 100 + y, 2, 1);
        g2d.fillRect(83 + x, 101 + y, 3, 1);
        g2d.fillRect(88 + x, 101 + y, 1, 1);
        g2d.fillRect(113 + x, 101 + y, 1, 3);
        g2d.fillRect(114 + x, 101 + y, 1, 3);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(86 + x, 102 + y, 2, 1);
        g2d.fillRect(106 + x, 102 + y, 2, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 2);
        g2d.fillRect(115 + x, 102 + y, 1, 1);
        g2d.fillRect(76 + x, 103 + y, 1, 2);
        g2d.fillRect(105 + x, 103 + y, 1, 1);
        g2d.fillRect(112 + x, 103 + y, 1, 1);
        g2d.fillRect(101 + x, 104 + y, 1, 1);
        g2d.fillRect(73 + x, 105 + y, 1, 3);
        g2d.fillRect(74 + x, 105 + y, 2, 1);
        g2d.fillRect(106 + x, 105 + y, 1, 1);
        g2d.fillRect(72 + x, 106 + y, 1, 2);
        g2d.fillRect(75 + x, 106 + y, 1, 1);
        g2d.fillRect(68 + x, 109 + y, 1, 1);
        g2d.fillRect(75 + x, 118 + y, 1, 1);
        g2d.fillRect(103 + x, 119 + y, 1, 2);
        g2d.fillRect(79 + x, 122 + y, 1, 1);
        g2d.fillRect(101 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(135,75,36,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(73 + x, 121 + y, 1, 3);
        g2d.fillRect(77 + x, 121 + y, 1, 1);
        g2d.fillRect(77 + x, 123 + y, 1, 1);
        g2d.fillRect(61 + x, 125 + y, 1, 1);
        g2d.fillRect(61 + x, 128 + y, 1, 1);
        g2d.fillRect(67 + x, 130 + y, 1, 1);
        g2d.fillRect(68 + x, 131 + y, 1, 1);
        g2d.fillRect(62 + x, 132 + y, 1, 2);
        g2d.fillRect(69 + x, 132 + y, 2, 1);
        g2d.fillRect(61 + x, 134 + y, 1, 1);
        g2d.fillRect(99 + x, 136 + y, 1, 1);
        g2d.fillRect(110 + x, 137 + y, 1, 1);
        g2d.fillRect(103 + x, 138 + y, 1, 2);
        g2d.fillRect(111 + x, 141 + y, 1, 1);
        g2d.fillRect(98 + x, 142 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(133,78,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(104 + x, 109 + y, 1, 2);
        g2d.fillRect(74 + x, 112 + y, 1, 1);
        g2d.fillRect(75 + x, 113 + y, 1, 1);
        g2d.fillRect(93 + x, 113 + y, 1, 1);
        g2d.fillRect(76 + x, 114 + y, 1, 1);
        g2d.fillRect(77 + x, 115 + y, 1, 1);
        g2d.fillRect(78 + x, 116 + y, 1, 1);
        g2d.fillRect(79 + x, 117 + y, 1, 1);
        g2d.fillRect(77 + x, 128 + y, 1, 1);
        g2d.fillRect(81 + x, 128 + y, 1, 1);
        g2d.fillRect(95 + x, 128 + y, 1, 1);
        g2d.fillRect(108 + x, 128 + y, 1, 2);
        g2d.fillRect(80 + x, 129 + y, 1, 2);
        g2d.fillRect(67 + x, 131 + y, 1, 1);
        g2d.fillRect(109 + x, 135 + y, 1, 1);
        g2d.fillRect(110 + x, 136 + y, 1, 1);
        g2d.fillRect(97 + x, 138 + y, 1, 1);
        g2d.fillRect(61 + x, 139 + y, 1, 2);
        g2d.fillRect(112 + x, 140 + y, 1, 1);
        g2d.fillRect(95 + x, 145 + y, 1, 3);
        g2d.fillRect(97 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132,77,41,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(63 + x, 129 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,83,43,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(59 + x, 77 + y, 1, 1);
        g2d.fillRect(56 + x, 82 + y, 1, 1);
        g2d.fillRect(56 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(134,80,39,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139,77,38,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(77 + x, 122 + y, 1, 1);
        g2d.fillRect(61 + x, 126 + y, 1, 2);
        g2d.fillRect(79 + x, 127 + y, 1, 1);
        g2d.fillRect(62 + x, 130 + y, 1, 1);
        g2d.fillRect(68 + x, 130 + y, 1, 1);
        g2d.fillRect(69 + x, 131 + y, 1, 1);
        g2d.fillRect(101 + x, 137 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(145,78,33,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(66 + x, 73 + y, 1, 1);
        g2d.fillRect(64 + x, 74 + y, 1, 2);
        g2d.fillRect(65 + x, 74 + y, 1, 1);
        g2d.fillRect(63 + x, 75 + y, 1, 2);
        g2d.fillRect(62 + x, 76 + y, 1, 2);
        g2d.fillRect(61 + x, 77 + y, 1, 2);
        g2d.fillRect(60 + x, 78 + y, 1, 2);
        g2d.fillRect(59 + x, 79 + y, 1, 2);
        g2d.fillRect(58 + x, 82 + y, 1, 1);
        g2d.fillRect(74 + x, 83 + y, 1, 1);
        g2d.fillRect(72 + x, 85 + y, 1, 1);
        g2d.fillRect(56 + x, 89 + y, 1, 1);
        g2d.fillRect(70 + x, 89 + y, 1, 1);
        g2d.fillRect(74 + x, 90 + y, 1, 1);
        g2d.fillRect(70 + x, 94 + y, 1, 3);
        g2d.fillRect(75 + x, 96 + y, 1, 2);
        g2d.fillRect(71 + x, 97 + y, 1, 1);
        g2d.fillRect(76 + x, 97 + y, 1, 2);
        g2d.fillRect(80 + x, 98 + y, 1, 1);
        g2d.fillRect(89 + x, 98 + y, 1, 1);
        g2d.fillRect(58 + x, 99 + y, 1, 3);
        g2d.fillRect(74 + x, 100 + y, 1, 1);
        g2d.fillRect(84 + x, 100 + y, 1, 1);
        g2d.fillRect(90 + x, 100 + y, 1, 2);
        g2d.fillRect(76 + x, 101 + y, 1, 1);
        g2d.fillRect(86 + x, 101 + y, 1, 1);
        g2d.fillRect(59 + x, 102 + y, 1, 3);
        g2d.fillRect(85 + x, 102 + y, 1, 1);
        g2d.fillRect(110 + x, 102 + y, 1, 1);
        g2d.fillRect(74 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 104 + y, 1, 1);
        g2d.fillRect(76 + x, 105 + y, 1, 1);
        g2d.fillRect(60 + x, 106 + y, 1, 8);
        g2d.fillRect(71 + x, 106 + y, 1, 1);
        g2d.fillRect(91 + x, 106 + y, 1, 1);
        g2d.fillRect(74 + x, 107 + y, 1, 1);
        g2d.fillRect(68 + x, 108 + y, 1, 1);
        g2d.fillRect(71 + x, 108 + y, 1, 1);
        g2d.fillRect(67 + x, 109 + y, 1, 2);
        g2d.fillRect(93 + x, 109 + y, 1, 1);
        g2d.fillRect(66 + x, 111 + y, 1, 1);
        g2d.fillRect(105 + x, 115 + y, 1, 3);
        g2d.fillRect(106 + x, 115 + y, 1, 4);
        g2d.fillRect(107 + x, 116 + y, 1, 1);
        g2d.fillRect(102 + x, 121 + y, 1, 1);
        g2d.fillRect(101 + x, 129 + y, 2, 1);
        g2d.fillRect(107 + x, 137 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(138,82,39,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(62 + x, 75 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 3);
        g2d.fillRect(104 + x, 108 + y, 1, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 2);
        g2d.fillRect(72 + x, 111 + y, 1, 1);
        g2d.fillRect(93 + x, 112 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 1);
        g2d.fillRect(113 + x, 114 + y, 1, 1);
        g2d.fillRect(112 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 117 + y, 1, 3);
        g2d.fillRect(110 + x, 120 + y, 1, 3);
        g2d.fillRect(69 + x, 122 + y, 3, 1);
        g2d.fillRect(110 + x, 124 + y, 1, 3);
        g2d.fillRect(109 + x, 127 + y, 1, 1);
        g2d.fillRect(81 + x, 129 + y, 1, 1);
        g2d.fillRect(58 + x, 130 + y, 1, 2);
        g2d.fillRect(108 + x, 130 + y, 1, 2);
        g2d.fillRect(57 + x, 131 + y, 1, 1);
        g2d.fillRect(56 + x, 132 + y, 1, 2);
        g2d.fillRect(107 + x, 132 + y, 1, 3);
        g2d.fillRect(55 + x, 133 + y, 1, 1);
        g2d.fillRect(108 + x, 134 + y, 1, 1);
        g2d.fillRect(60 + x, 137 + y, 1, 4);
        g2d.fillRect(113 + x, 140 + y, 1, 1);
        g2d.fillRect(104 + x, 144 + y, 1, 2);
        g2d.fillRect(105 + x, 144 + y, 1, 2);
        g2d.fillRect(103 + x, 145 + y, 1, 1);
        g2d.fillRect(94 + x, 146 + y, 1, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(146,80,34,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(60 + x, 80 + y, 1, 1);
        g2d.fillRect(59 + x, 81 + y, 1, 1);
        g2d.fillRect(70 + x, 88 + y, 1, 1);
        g2d.fillRect(74 + x, 96 + y, 1, 1);
        g2d.fillRect(82 + x, 99 + y, 1, 1);
        g2d.fillRect(87 + x, 101 + y, 1, 1);
        g2d.fillRect(60 + x, 104 + y, 1, 1);
        g2d.fillRect(72 + x, 105 + y, 1, 1);
        g2d.fillRect(69 + x, 114 + y, 2, 1);
        g2d.fillRect(107 + x, 117 + y, 1, 1);
        g2d.fillRect(104 + x, 120 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,80,34,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(71 + x, 72 + y, 1, 1);
        g2d.fillRect(66 + x, 74 + y, 1, 1);
        g2d.fillRect(61 + x, 79 + y, 1, 1);
        g2d.fillRect(56 + x, 90 + y, 1, 1);
        g2d.fillRect(57 + x, 97 + y, 1, 3);
        g2d.fillRect(70 + x, 97 + y, 1, 1);
        g2d.fillRect(79 + x, 97 + y, 1, 1);
        g2d.fillRect(58 + x, 98 + y, 1, 1);
        g2d.fillRect(70 + x, 99 + y, 1, 1);
        g2d.fillRect(59 + x, 101 + y, 1, 1);
        g2d.fillRect(70 + x, 101 + y, 1, 1);
        g2d.fillRect(75 + x, 101 + y, 1, 1);
        g2d.fillRect(77 + x, 101 + y, 1, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 1);
        g2d.fillRect(75 + x, 103 + y, 1, 1);
        g2d.fillRect(77 + x, 103 + y, 1, 1);
        g2d.fillRect(73 + x, 104 + y, 1, 1);
        g2d.fillRect(60 + x, 105 + y, 1, 1);
        g2d.fillRect(101 + x, 106 + y, 1, 1);
        g2d.fillRect(92 + x, 107 + y, 1, 2);
        g2d.fillRect(70 + x, 108 + y, 1, 1);
        g2d.fillRect(66 + x, 110 + y, 1, 1);
        g2d.fillRect(94 + x, 110 + y, 1, 1);
        g2d.fillRect(68 + x, 111 + y, 1, 2);
        g2d.fillRect(65 + x, 112 + y, 1, 1);
        g2d.fillRect(69 + x, 113 + y, 1, 1);
        g2d.fillRect(96 + x, 113 + y, 1, 1);
        g2d.fillRect(107 + x, 115 + y, 1, 1);
        g2d.fillRect(75 + x, 117 + y, 1, 1);
        g2d.fillRect(107 + x, 118 + y, 1, 1);
        g2d.fillRect(76 + x, 119 + y, 1, 1);
        g2d.fillRect(102 + x, 122 + y, 1, 1);
        g2d.fillRect(66 + x, 126 + y, 1, 1);
        g2d.fillRect(102 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92,88,84,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(74 + x, 129 + y, 1, 2);
        g2d.fillRect(72 + x, 131 + y, 2, 1);
        g2d.fillRect(77 + x, 132 + y, 1, 3);
        g2d.fillRect(73 + x, 133 + y, 1, 1);
        g2d.fillRect(76 + x, 135 + y, 1, 1);
        g2d.fillRect(67 + x, 142 + y, 1, 1);
        g2d.fillRect(73 + x, 142 + y, 1, 1);
        g2d.fillRect(108 + x, 143 + y, 1, 1);
        g2d.fillRect(109 + x, 144 + y, 1, 2);
        g2d.fillRect(113 + x, 144 + y, 1, 2);
        g2d.fillRect(114 + x, 144 + y, 1, 3);
        g2d.fillRect(115 + x, 146 + y, 1, 1);
        g2d.fillRect(103 + x, 153 + y, 1, 1);
        g2d.fillRect(111 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(143,82,39,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(61 + x, 76 + y, 1, 1);
        g2d.fillRect(60 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 1);
        g2d.fillRect(65 + x, 126 + y, 1, 1);
        g2d.fillRect(66 + x, 132 + y, 1, 1);
        g2d.fillRect(63 + x, 135 + y, 1, 1);
        g2d.fillRect(102 + x, 137 + y, 1, 1);
        g2d.fillRect(98 + x, 143 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(149,82,36,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(70 + x, 72 + y, 1, 1);
        g2d.fillRect(80 + x, 73 + y, 1, 1);
        g2d.fillRect(65 + x, 75 + y, 1, 1);
        g2d.fillRect(64 + x, 76 + y, 1, 1);
        g2d.fillRect(63 + x, 77 + y, 1, 1);
        g2d.fillRect(62 + x, 78 + y, 1, 1);
        g2d.fillRect(73 + x, 83 + y, 1, 1);
        g2d.fillRect(74 + x, 84 + y, 1, 1);
        g2d.fillRect(70 + x, 87 + y, 1, 1);
        g2d.fillRect(74 + x, 89 + y, 1, 1);
        g2d.fillRect(56 + x, 91 + y, 1, 1);
        g2d.fillRect(75 + x, 93 + y, 1, 1);
        g2d.fillRect(56 + x, 95 + y, 1, 2);
        g2d.fillRect(57 + x, 96 + y, 1, 1);
        g2d.fillRect(90 + x, 97 + y, 1, 1);
        g2d.fillRect(70 + x, 98 + y, 2, 1);
        g2d.fillRect(71 + x, 99 + y, 1, 4);
        g2d.fillRect(73 + x, 99 + y, 1, 1);
        g2d.fillRect(91 + x, 99 + y, 1, 1);
        g2d.fillRect(59 + x, 100 + y, 1, 1);
        g2d.fillRect(70 + x, 100 + y, 1, 1);
        g2d.fillRect(78 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 1, 1);
        g2d.fillRect(117 + x, 100 + y, 1, 1);
        g2d.fillRect(70 + x, 102 + y, 1, 1);
        g2d.fillRect(77 + x, 102 + y, 2, 1);
        g2d.fillRect(105 + x, 102 + y, 1, 1);
        g2d.fillRect(60 + x, 103 + y, 1, 1);
        g2d.fillRect(102 + x, 103 + y, 3, 1);
        g2d.fillRect(69 + x, 104 + y, 1, 1);
        g2d.fillRect(77 + x, 104 + y, 1, 1);
        g2d.fillRect(91 + x, 105 + y, 1, 1);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(68 + x, 106 + y, 1, 2);
        g2d.fillRect(109 + x, 106 + y, 2, 1);
        g2d.fillRect(69 + x, 107 + y, 1, 1);
        g2d.fillRect(91 + x, 107 + y, 1, 1);
        g2d.fillRect(106 + x, 107 + y, 2, 1);
        g2d.fillRect(61 + x, 108 + y, 1, 1);
        g2d.fillRect(67 + x, 108 + y, 1, 1);
        g2d.fillRect(93 + x, 108 + y, 1, 1);
        g2d.fillRect(92 + x, 109 + y, 1, 1);
        g2d.fillRect(94 + x, 109 + y, 1, 1);
        g2d.fillRect(67 + x, 112 + y, 1, 1);
        g2d.fillRect(68 + x, 113 + y, 1, 1);
        g2d.fillRect(71 + x, 114 + y, 1, 1);
        g2d.fillRect(105 + x, 114 + y, 3, 1);
        g2d.fillRect(70 + x, 115 + y, 1, 1);
        g2d.fillRect(100 + x, 115 + y, 1, 1);
        g2d.fillRect(74 + x, 116 + y, 1, 2);
        g2d.fillRect(94 + x, 116 + y, 1, 1);
        g2d.fillRect(104 + x, 118 + y, 1, 2);
        g2d.fillRect(105 + x, 118 + y, 1, 1);
        g2d.fillRect(106 + x, 119 + y, 1, 1);
        g2d.fillRect(104 + x, 122 + y, 1, 1);
        g2d.fillRect(97 + x, 128 + y, 1, 1);
        g2d.fillRect(102 + x, 128 + y, 1, 1);
        g2d.fillRect(100 + x, 130 + y, 1, 1);
        g2d.fillRect(62 + x, 136 + y, 1, 1);
        g2d.fillRect(105 + x, 137 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139,84,44,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 86 + y, 1, 1);
        g2d.fillRect(55 + x, 92 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,85,40,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,84,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(151,84,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 72 + y, 1, 1);
        g2d.fillRect(67 + x, 73 + y, 1, 1);
        g2d.fillRect(66 + x, 75 + y, 1, 1);
        g2d.fillRect(56 + x, 92 + y, 1, 1);
        g2d.fillRect(58 + x, 97 + y, 1, 1);
        g2d.fillRect(85 + x, 100 + y, 1, 1);
        g2d.fillRect(114 + x, 100 + y, 1, 1);
        g2d.fillRect(78 + x, 101 + y, 1, 1);
        g2d.fillRect(106 + x, 101 + y, 2, 1);
        g2d.fillRect(76 + x, 102 + y, 1, 1);
        g2d.fillRect(69 + x, 103 + y, 1, 1);
        g2d.fillRect(68 + x, 105 + y, 2, 1);
        g2d.fillRect(92 + x, 106 + y, 1, 1);
        g2d.fillRect(61 + x, 107 + y, 1, 1);
        g2d.fillRect(106 + x, 108 + y, 1, 6);
        g2d.fillRect(107 + x, 108 + y, 1, 1);
        g2d.fillRect(93 + x, 110 + y, 1, 1);
        g2d.fillRect(107 + x, 110 + y, 1, 4);
        g2d.fillRect(95 + x, 112 + y, 1, 1);
        g2d.fillRect(105 + x, 112 + y, 1, 2);
        g2d.fillRect(109 + x, 112 + y, 1, 1);
        g2d.fillRect(65 + x, 113 + y, 1, 1);
        g2d.fillRect(70 + x, 113 + y, 1, 1);
        g2d.fillRect(98 + x, 116 + y, 2, 1);
        g2d.fillRect(94 + x, 117 + y, 1, 1);
        g2d.fillRect(95 + x, 119 + y, 1, 1);
        g2d.fillRect(105 + x, 119 + y, 1, 2);
        g2d.fillRect(104 + x, 123 + y, 1, 1);
        g2d.fillRect(102 + x, 127 + y, 1, 1);
        g2d.fillRect(98 + x, 129 + y, 2, 1);
        g2d.fillRect(100 + x, 135 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,84,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(69 + x, 72 + y, 1, 1);
        g2d.fillRect(68 + x, 73 + y, 1, 1);
        g2d.fillRect(79 + x, 73 + y, 1, 1);
        g2d.fillRect(67 + x, 74 + y, 1, 1);
        g2d.fillRect(80 + x, 74 + y, 1, 1);
        g2d.fillRect(65 + x, 76 + y, 1, 1);
        g2d.fillRect(64 + x, 77 + y, 1, 1);
        g2d.fillRect(74 + x, 82 + y, 1, 1);
        g2d.fillRect(69 + x, 89 + y, 1, 1);
        g2d.fillRect(56 + x, 93 + y, 1, 1);
        g2d.fillRect(76 + x, 94 + y, 1, 1);
        g2d.fillRect(77 + x, 95 + y, 1, 1);
        g2d.fillRect(78 + x, 96 + y, 1, 1);
        g2d.fillRect(91 + x, 97 + y, 1, 2);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(111 + x, 101 + y, 2, 1);
        g2d.fillRect(74 + x, 103 + y, 1, 1);
        g2d.fillRect(72 + x, 104 + y, 1, 1);
        g2d.fillRect(100 + x, 105 + y, 1, 1);
        g2d.fillRect(69 + x, 106 + y, 1, 1);
        g2d.fillRect(101 + x, 107 + y, 1, 1);
        g2d.fillRect(110 + x, 107 + y, 1, 1);
        g2d.fillRect(61 + x, 109 + y, 1, 1);
        g2d.fillRect(66 + x, 109 + y, 1, 1);
        g2d.fillRect(107 + x, 109 + y, 1, 1);
        g2d.fillRect(95 + x, 110 + y, 1, 2);
        g2d.fillRect(65 + x, 111 + y, 1, 1);
        g2d.fillRect(94 + x, 111 + y, 1, 1);
        g2d.fillRect(109 + x, 111 + y, 1, 1);
        g2d.fillRect(96 + x, 112 + y, 1, 1);
        g2d.fillRect(108 + x, 112 + y, 1, 5);
        g2d.fillRect(100 + x, 113 + y, 1, 2);
        g2d.fillRect(71 + x, 115 + y, 1, 1);
        g2d.fillRect(94 + x, 115 + y, 1, 1);
        g2d.fillRect(99 + x, 115 + y, 1, 1);
        g2d.fillRect(75 + x, 116 + y, 1, 1);
        g2d.fillRect(100 + x, 116 + y, 1, 2);
        g2d.fillRect(94 + x, 118 + y, 1, 1);
        g2d.fillRect(101 + x, 118 + y, 1, 1);
        g2d.fillRect(95 + x, 120 + y, 1, 1);
        g2d.fillRect(105 + x, 121 + y, 1, 1);
        g2d.fillRect(102 + x, 123 + y, 1, 1);
        g2d.fillRect(96 + x, 124 + y, 1, 1);
        g2d.fillRect(96 + x, 127 + y, 1, 1);
        g2d.fillRect(100 + x, 129 + y, 1, 1);
        g2d.fillRect(99 + x, 130 + y, 1, 1);
        g2d.fillRect(102 + x, 133 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,84,43,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(80 + x, 124 + y, 1, 1);
        g2d.fillRect(73 + x, 125 + y, 1, 1);
        g2d.fillRect(62 + x, 127 + y, 1, 1);
        g2d.fillRect(61 + x, 130 + y, 1, 1);
        g2d.fillRect(63 + x, 130 + y, 1, 2);
        g2d.fillRect(63 + x, 133 + y, 1, 2);
        g2d.fillRect(68 + x, 133 + y, 1, 1);
        g2d.fillRect(109 + x, 136 + y, 1, 1);
        g2d.fillRect(61 + x, 137 + y, 1, 1);
        g2d.fillRect(111 + x, 137 + y, 1, 1);
        g2d.fillRect(100 + x, 144 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142,88,46,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(59 + x, 78 + y, 1, 1);
        g2d.fillRect(58 + x, 80 + y, 1, 1);
        g2d.fillRect(55 + x, 94 + y, 1, 1);
        g2d.fillRect(55 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(152,86,40,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(59 + x, 82 + y, 1, 1);
        g2d.fillRect(69 + x, 88 + y, 1, 1);
        g2d.fillRect(75 + x, 92 + y, 1, 1);
        g2d.fillRect(56 + x, 94 + y, 1, 1);
        g2d.fillRect(57 + x, 95 + y, 1, 1);
        g2d.fillRect(74 + x, 101 + y, 1, 1);
        g2d.fillRect(60 + x, 102 + y, 1, 1);
        g2d.fillRect(61 + x, 106 + y, 1, 1);
        g2d.fillRect(108 + x, 107 + y, 2, 1);
        g2d.fillRect(110 + x, 108 + y, 1, 1);
        g2d.fillRect(108 + x, 110 + y, 1, 2);
        g2d.fillRect(105 + x, 111 + y, 1, 1);
        g2d.fillRect(69 + x, 112 + y, 1, 1);
        g2d.fillRect(60 + x, 114 + y, 1, 1);
        g2d.fillRect(72 + x, 115 + y, 1, 1);
        g2d.fillRect(101 + x, 119 + y, 1, 1);
        g2d.fillRect(105 + x, 122 + y, 1, 1);
        g2d.fillRect(75 + x, 123 + y, 1, 1);
        g2d.fillRect(78 + x, 123 + y, 1, 3);
        g2d.fillRect(96 + x, 123 + y, 1, 1);
        g2d.fillRect(102 + x, 124 + y, 1, 2);
        g2d.fillRect(77 + x, 126 + y, 1, 1);
        g2d.fillRect(80 + x, 127 + y, 1, 1);
        g2d.fillRect(82 + x, 127 + y, 1, 3);
        g2d.fillRect(62 + x, 128 + y, 1, 1);
        g2d.fillRect(61 + x, 131 + y, 1, 1);
        g2d.fillRect(63 + x, 132 + y, 1, 1);
        g2d.fillRect(60 + x, 133 + y, 1, 2);
        g2d.fillRect(59 + x, 134 + y, 1, 1);
        g2d.fillRect(62 + x, 135 + y, 1, 1);
        g2d.fillRect(99 + x, 135 + y, 1, 1);
        g2d.fillRect(103 + x, 137 + y, 1, 1);
        g2d.fillRect(109 + x, 138 + y, 1, 1);
        g2d.fillRect(98 + x, 139 + y, 1, 1);
        g2d.fillRect(110 + x, 139 + y, 2, 1);
        g2d.fillRect(97 + x, 140 + y, 1, 1);
        g2d.fillRect(99 + x, 140 + y, 1, 1);
        g2d.fillRect(103 + x, 140 + y, 1, 3);
        g2d.fillRect(98 + x, 141 + y, 1, 1);
        g2d.fillRect(107 + x, 141 + y, 1, 1);
        g2d.fillRect(97 + x, 146 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(98,92,88,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(77 + x, 131 + y, 1, 1);
        g2d.fillRect(78 + x, 132 + y, 1, 1);
        g2d.fillRect(76 + x, 134 + y, 1, 1);
        g2d.fillRect(77 + x, 135 + y, 1, 1);
        g2d.fillRect(68 + x, 142 + y, 1, 1);
        g2d.fillRect(72 + x, 142 + y, 1, 1);
        g2d.fillRect(107 + x, 143 + y, 1, 1);
        g2d.fillRect(112 + x, 143 + y, 2, 1);
        g2d.fillRect(115 + x, 147 + y, 1, 1);
        g2d.fillRect(104 + x, 153 + y, 1, 2);
        g2d.fillRect(105 + x, 154 + y, 6, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,88,61,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(57 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(147,89,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(58 + x, 81 + y, 1, 1);
        g2d.fillRect(57 + x, 84 + y, 1, 1);
        g2d.fillRect(56 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 141 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(156,87,39,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(74 + x, 72 + y, 5, 1);
        g2d.fillRect(78 + x, 73 + y, 1, 1);
        g2d.fillRect(79 + x, 74 + y, 1, 1);
        g2d.fillRect(81 + x, 74 + y, 1, 3);
        g2d.fillRect(80 + x, 75 + y, 1, 1);
        g2d.fillRect(63 + x, 78 + y, 1, 1);
        g2d.fillRect(62 + x, 79 + y, 1, 1);
        g2d.fillRect(61 + x, 80 + y, 1, 1);
        g2d.fillRect(60 + x, 81 + y, 1, 1);
        g2d.fillRect(58 + x, 83 + y, 1, 2);
        g2d.fillRect(59 + x, 83 + y, 1, 1);
        g2d.fillRect(57 + x, 85 + y, 1, 1);
        g2d.fillRect(59 + x, 85 + y, 1, 1);
        g2d.fillRect(74 + x, 85 + y, 1, 1);
        g2d.fillRect(68 + x, 88 + y, 1, 1);
        g2d.fillRect(74 + x, 88 + y, 1, 1);
        g2d.fillRect(69 + x, 90 + y, 1, 2);
        g2d.fillRect(81 + x, 98 + y, 1, 1);
        g2d.fillRect(59 + x, 99 + y, 1, 1);
        g2d.fillRect(83 + x, 99 + y, 1, 1);
        g2d.fillRect(88 + x, 100 + y, 1, 1);
        g2d.fillRect(107 + x, 100 + y, 1, 1);
        g2d.fillRect(79 + x, 101 + y, 1, 2);
        g2d.fillRect(80 + x, 101 + y, 1, 1);
        g2d.fillRect(69 + x, 102 + y, 1, 1);
        g2d.fillRect(74 + x, 102 + y, 2, 1);
        g2d.fillRect(70 + x, 103 + y, 1, 3);
        g2d.fillRect(78 + x, 103 + y, 1, 1);
        g2d.fillRect(91 + x, 104 + y, 1, 1);
        g2d.fillRect(100 + x, 104 + y, 1, 1);
        g2d.fillRect(61 + x, 105 + y, 1, 1);
        g2d.fillRect(100 + x, 106 + y, 1, 2);
        g2d.fillRect(67 + x, 107 + y, 1, 1);
        g2d.fillRect(101 + x, 108 + y, 1, 1);
        g2d.fillRect(108 + x, 108 + y, 1, 2);
        g2d.fillRect(109 + x, 108 + y, 1, 3);
        g2d.fillRect(105 + x, 109 + y, 1, 2);
        g2d.fillRect(110 + x, 109 + y, 1, 3);
        g2d.fillRect(61 + x, 110 + y, 1, 1);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
        g2d.fillRect(72 + x, 114 + y, 1, 1);
        g2d.fillRect(99 + x, 114 + y, 1, 1);
        g2d.fillRect(73 + x, 115 + y, 1, 2);
        g2d.fillRect(74 + x, 115 + y, 1, 1);
        g2d.fillRect(98 + x, 115 + y, 1, 1);
        g2d.fillRect(97 + x, 116 + y, 1, 1);
        g2d.fillRect(61 + x, 117 + y, 1, 1);
        g2d.fillRect(73 + x, 118 + y, 1, 1);
        g2d.fillRect(76 + x, 118 + y, 1, 1);
        g2d.fillRect(95 + x, 118 + y, 1, 1);
        g2d.fillRect(64 + x, 120 + y, 1, 4);
        g2d.fillRect(96 + x, 120 + y, 1, 3);
        g2d.fillRect(106 + x, 120 + y, 1, 4);
        g2d.fillRect(76 + x, 121 + y, 1, 1);
        g2d.fillRect(105 + x, 123 + y, 1, 1);
        g2d.fillRect(65 + x, 125 + y, 2, 1);
        g2d.fillRect(74 + x, 125 + y, 1, 1);
        g2d.fillRect(96 + x, 125 + y, 1, 2);
        g2d.fillRect(102 + x, 126 + y, 1, 1);
        g2d.fillRect(97 + x, 127 + y, 1, 1);
        g2d.fillRect(98 + x, 128 + y, 1, 1);
        g2d.fillRect(82 + x, 130 + y, 1, 1);
        g2d.fillRect(101 + x, 131 + y, 1, 1);
        g2d.fillRect(67 + x, 133 + y, 1, 1);
        g2d.fillRect(103 + x, 135 + y, 1, 1);
        g2d.fillRect(105 + x, 136 + y, 1, 1);
        g2d.fillRect(107 + x, 140 + y, 1, 1);
        g2d.fillRect(103 + x, 143 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(134,94,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(57 + x, 80 + y, 1, 3);
        g2d.fillRect(56 + x, 83 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(162,84,39,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(111 + x, 100 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(160,86,40,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 84 + y, 1, 1);
        g2d.fillRect(75 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158,89,40,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(73 + x, 72 + y, 1, 1);
        g2d.fillRect(61 + x, 81 + y, 1, 1);
        g2d.fillRect(60 + x, 82 + y, 1, 2);
        g2d.fillRect(75 + x, 83 + y, 1, 1);
        g2d.fillRect(57 + x, 86 + y, 1, 5);
        g2d.fillRect(59 + x, 86 + y, 1, 1);
        g2d.fillRect(58 + x, 88 + y, 1, 3);
        g2d.fillRect(57 + x, 94 + y, 1, 1);
        g2d.fillRect(58 + x, 96 + y, 1, 1);
        g2d.fillRect(86 + x, 100 + y, 1, 1);
        g2d.fillRect(73 + x, 103 + y, 1, 1);
        g2d.fillRect(68 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 1);
        g2d.fillRect(111 + x, 106 + y, 1, 1);
        g2d.fillRect(105 + x, 108 + y, 1, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 1);
        g2d.fillRect(69 + x, 110 + y, 1, 1);
        g2d.fillRect(100 + x, 112 + y, 1, 1);
        g2d.fillRect(110 + x, 112 + y, 1, 1);
        g2d.fillRect(71 + x, 113 + y, 1, 1);
        g2d.fillRect(68 + x, 114 + y, 1, 1);
        g2d.fillRect(60 + x, 115 + y, 1, 1);
        g2d.fillRect(97 + x, 115 + y, 1, 1);
        g2d.fillRect(64 + x, 117 + y, 1, 3);
        g2d.fillRect(76 + x, 117 + y, 1, 1);
        g2d.fillRect(95 + x, 117 + y, 1, 1);
        g2d.fillRect(99 + x, 117 + y, 1, 1);
        g2d.fillRect(61 + x, 118 + y, 1, 1);
        g2d.fillRect(96 + x, 119 + y, 1, 1);
        g2d.fillRect(107 + x, 119 + y, 1, 1);
        g2d.fillRect(78 + x, 120 + y, 1, 1);
        g2d.fillRect(78 + x, 122 + y, 1, 1);
        g2d.fillRect(65 + x, 124 + y, 1, 1);
        g2d.fillRect(104 + x, 124 + y, 1, 4);
        g2d.fillRect(102 + x, 131 + y, 1, 1);
        g2d.fillRect(100 + x, 134 + y, 1, 1);
        g2d.fillRect(103 + x, 136 + y, 1, 1);
        g2d.fillRect(100 + x, 139 + y, 1, 1);
        g2d.fillRect(96 + x, 140 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(160,90,41,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(84 + x, 77 + y, 1, 1);
        g2d.fillRect(90 + x, 78 + y, 2, 1);
        g2d.fillRect(68 + x, 81 + y, 1, 1);
        g2d.fillRect(59 + x, 84 + y, 2, 1);
        g2d.fillRect(58 + x, 85 + y, 1, 3);
        g2d.fillRect(57 + x, 91 + y, 2, 1);
        g2d.fillRect(57 + x, 93 + y, 1, 1);
        g2d.fillRect(58 + x, 95 + y, 1, 1);
        g2d.fillRect(59 + x, 98 + y, 1, 1);
        g2d.fillRect(73 + x, 100 + y, 1, 1);
        g2d.fillRect(60 + x, 101 + y, 1, 1);
        g2d.fillRect(77 + x, 105 + y, 1, 1);
        g2d.fillRect(93 + x, 107 + y, 1, 1);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(62 + x, 108 + y, 1, 2);
        g2d.fillRect(100 + x, 108 + y, 1, 1);
        g2d.fillRect(61 + x, 111 + y, 1, 1);
        g2d.fillRect(96 + x, 111 + y, 1, 1);
        g2d.fillRect(101 + x, 112 + y, 1, 1);
        g2d.fillRect(67 + x, 113 + y, 1, 1);
        g2d.fillRect(73 + x, 114 + y, 1, 1);
        g2d.fillRect(94 + x, 114 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(95 + x, 116 + y, 1, 1);
        g2d.fillRect(73 + x, 117 + y, 1, 1);
        g2d.fillRect(100 + x, 118 + y, 1, 1);
        g2d.fillRect(63 + x, 120 + y, 1, 2);
        g2d.fillRect(65 + x, 123 + y, 1, 1);
        g2d.fillRect(104 + x, 128 + y, 1, 3);
        g2d.fillRect(106 + x, 130 + y, 1, 1);
        g2d.fillRect(100 + x, 133 + y, 1, 1);
        g2d.fillRect(106 + x, 136 + y, 1, 1);
        g2d.fillRect(100 + x, 138 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(146,93,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(57 + x, 83 + y, 1, 1);
        g2d.fillRect(55 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102,97,93,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(76 + x, 133 + y, 1, 1);
        g2d.fillRect(70 + x, 134 + y, 1, 1);
        g2d.fillRect(72 + x, 135 + y, 1, 1);
        g2d.fillRect(64 + x, 136 + y, 1, 1);
        g2d.fillRect(73 + x, 137 + y, 1, 1);
        g2d.fillRect(69 + x, 142 + y, 1, 1);
        g2d.fillRect(71 + x, 142 + y, 1, 1);
        g2d.fillRect(111 + x, 143 + y, 1, 1);
        g2d.fillRect(112 + x, 144 + y, 1, 1);
        g2d.fillRect(110 + x, 145 + y, 2, 1);
        g2d.fillRect(108 + x, 146 + y, 1, 1);
        g2d.fillRect(112 + x, 146 + y, 1, 1);
        g2d.fillRect(113 + x, 147 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158,91,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(69 + x, 111 + y, 1, 1);
        g2d.fillRect(62 + x, 125 + y, 1, 1);
        g2d.fillRect(76 + x, 127 + y, 1, 1);
        g2d.fillRect(66 + x, 130 + y, 1, 2);
        g2d.fillRect(61 + x, 132 + y, 1, 1);
        g2d.fillRect(61 + x, 136 + y, 1, 1);
        g2d.fillRect(102 + x, 136 + y, 1, 1);
        g2d.fillRect(98 + x, 137 + y, 1, 2);
        g2d.fillRect(97 + x, 139 + y, 1, 1);
        g2d.fillRect(99 + x, 141 + y, 1, 1);
        g2d.fillRect(104 + x, 143 + y, 1, 1);
        g2d.fillRect(97 + x, 145 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(161,92,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(69 + x, 73 + y, 1, 1);
        g2d.fillRect(67 + x, 75 + y, 1, 1);
        g2d.fillRect(77 + x, 76 + y, 1, 1);
        g2d.fillRect(82 + x, 76 + y, 1, 2);
        g2d.fillRect(83 + x, 76 + y, 1, 2);
        g2d.fillRect(65 + x, 77 + y, 1, 1);
        g2d.fillRect(89 + x, 77 + y, 1, 2);
        g2d.fillRect(90 + x, 77 + y, 3, 1);
        g2d.fillRect(98 + x, 77 + y, 1, 1);
        g2d.fillRect(84 + x, 78 + y, 1, 1);
        g2d.fillRect(92 + x, 78 + y, 1, 1);
        g2d.fillRect(62 + x, 80 + y, 1, 1);
        g2d.fillRect(61 + x, 82 + y, 1, 1);
        g2d.fillRect(60 + x, 85 + y, 1, 1);
        g2d.fillRect(59 + x, 87 + y, 1, 5);
        g2d.fillRect(68 + x, 87 + y, 2, 1);
        g2d.fillRect(74 + x, 87 + y, 1, 1);
        g2d.fillRect(68 + x, 89 + y, 1, 1);
        g2d.fillRect(75 + x, 91 + y, 1, 1);
        g2d.fillRect(57 + x, 92 + y, 2, 1);
        g2d.fillRect(69 + x, 92 + y, 1, 1);
        g2d.fillRect(58 + x, 93 + y, 1, 2);
        g2d.fillRect(59 + x, 97 + y, 1, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 1);
        g2d.fillRect(101 + x, 103 + y, 1, 1);
        g2d.fillRect(61 + x, 104 + y, 1, 1);
        g2d.fillRect(62 + x, 107 + y, 1, 1);
        g2d.fillRect(70 + x, 109 + y, 2, 1);
        g2d.fillRect(100 + x, 109 + y, 1, 3);
        g2d.fillRect(101 + x, 109 + y, 1, 3);
        g2d.fillRect(111 + x, 109 + y, 1, 1);
        g2d.fillRect(62 + x, 110 + y, 1, 1);
        g2d.fillRect(71 + x, 116 + y, 2, 1);
        g2d.fillRect(98 + x, 117 + y, 1, 1);
        g2d.fillRect(63 + x, 118 + y, 1, 2);
        g2d.fillRect(101 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 121 + y, 1, 1);
        g2d.fillRect(65 + x, 122 + y, 1, 1);
        g2d.fillRect(64 + x, 124 + y, 1, 1);
        g2d.fillRect(105 + x, 124 + y, 1, 2);
        g2d.fillRect(106 + x, 124 + y, 1, 6);
        g2d.fillRect(99 + x, 128 + y, 1, 1);
        g2d.fillRect(105 + x, 130 + y, 1, 2);
        g2d.fillRect(100 + x, 131 + y, 1, 1);
        g2d.fillRect(104 + x, 131 + y, 1, 1);
        g2d.fillRect(106 + x, 131 + y, 1, 1);
        g2d.fillRect(102 + x, 132 + y, 1, 1);
        g2d.fillRect(101 + x, 133 + y, 1, 2);
        g2d.fillRect(102 + x, 135 + y, 1, 1);
        g2d.fillRect(105 + x, 135 + y, 1, 1);
        g2d.fillRect(109 + x, 137 + y, 1, 1);
        g2d.fillRect(107 + x, 139 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,89,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(66 + x, 76 + y, 1, 1);
        g2d.fillRect(75 + x, 82 + y, 1, 1);
        g2d.fillRect(71 + x, 85 + y, 1, 1);
        g2d.fillRect(70 + x, 86 + y, 1, 1);
        g2d.fillRect(91 + x, 95 + y, 1, 2);
        g2d.fillRect(92 + x, 95 + y, 1, 3);
        g2d.fillRect(90 + x, 96 + y, 1, 1);
        g2d.fillRect(89 + x, 97 + y, 1, 1);
        g2d.fillRect(88 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 100 + y, 2, 1);
        g2d.fillRect(91 + x, 103 + y, 1, 1);
        g2d.fillRect(76 + x, 106 + y, 1, 1);
        g2d.fillRect(65 + x, 110 + y, 1, 1);
        g2d.fillRect(97 + x, 113 + y, 1, 2);
        g2d.fillRect(95 + x, 114 + y, 1, 1);
        g2d.fillRect(108 + x, 117 + y, 1, 1);
        g2d.fillRect(101 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(163,95,44,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(93 + x, 78 + y, 1, 1);
        g2d.fillRect(59 + x, 96 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 1);
        g2d.fillRect(61 + x, 112 + y, 1, 1);
        g2d.fillRect(64 + x, 116 + y, 1, 1);
        g2d.fillRect(62 + x, 120 + y, 1, 1);
        g2d.fillRect(63 + x, 122 + y, 1, 1);
        g2d.fillRect(107 + x, 125 + y, 1, 1);
        g2d.fillRect(105 + x, 132 + y, 2, 1);
        g2d.fillRect(106 + x, 135 + y, 1, 1);
        g2d.fillRect(98 + x, 144 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164,94,44,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(70 + x, 73 + y, 2, 1);
        g2d.fillRect(76 + x, 75 + y, 2, 1);
        g2d.fillRect(93 + x, 77 + y, 1, 1);
        g2d.fillRect(83 + x, 78 + y, 1, 1);
        g2d.fillRect(85 + x, 78 + y, 1, 1);
        g2d.fillRect(69 + x, 79 + y, 1, 3);
        g2d.fillRect(68 + x, 80 + y, 1, 1);
        g2d.fillRect(73 + x, 82 + y, 1, 1);
        g2d.fillRect(75 + x, 84 + y, 1, 1);
        g2d.fillRect(68 + x, 90 + y, 1, 1);
        g2d.fillRect(59 + x, 92 + y, 1, 1);
        g2d.fillRect(80 + x, 97 + y, 1, 1);
        g2d.fillRect(84 + x, 99 + y, 1, 1);
        g2d.fillRect(60 + x, 100 + y, 1, 1);
        g2d.fillRect(87 + x, 100 + y, 1, 1);
        g2d.fillRect(91 + x, 100 + y, 1, 1);
        g2d.fillRect(69 + x, 101 + y, 1, 1);
        g2d.fillRect(73 + x, 101 + y, 1, 2);
        g2d.fillRect(105 + x, 101 + y, 1, 1);
        g2d.fillRect(81 + x, 102 + y, 1, 1);
        g2d.fillRect(72 + x, 103 + y, 1, 1);
        g2d.fillRect(94 + x, 108 + y, 1, 1);
        g2d.fillRect(95 + x, 115 + y, 1, 1);
        g2d.fillRect(61 + x, 116 + y, 1, 1);
        g2d.fillRect(61 + x, 124 + y, 1, 1);
        g2d.fillRect(80 + x, 125 + y, 1, 1);
        g2d.fillRect(105 + x, 126 + y, 1, 4);
        g2d.fillRect(78 + x, 127 + y, 1, 1);
        g2d.fillRect(67 + x, 132 + y, 1, 1);
        g2d.fillRect(100 + x, 132 + y, 2, 1);
        g2d.fillRect(101 + x, 136 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,96,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(77 + x, 73 + y, 1, 1);
        g2d.fillRect(68 + x, 74 + y, 1, 1);
        g2d.fillRect(82 + x, 75 + y, 1, 1);
        g2d.fillRect(77 + x, 77 + y, 1, 1);
        g2d.fillRect(85 + x, 77 + y, 1, 1);
        g2d.fillRect(88 + x, 77 + y, 1, 2);
        g2d.fillRect(94 + x, 77 + y, 1, 1);
        g2d.fillRect(97 + x, 77 + y, 1, 1);
        g2d.fillRect(69 + x, 78 + y, 1, 1);
        g2d.fillRect(86 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 78 + y, 1, 1);
        g2d.fillRect(74 + x, 86 + y, 1, 1);
        g2d.fillRect(75 + x, 90 + y, 1, 1);
        g2d.fillRect(68 + x, 91 + y, 1, 1);
        g2d.fillRect(59 + x, 93 + y, 1, 3);
        g2d.fillRect(76 + x, 93 + y, 1, 1);
        g2d.fillRect(85 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 1);
        g2d.fillRect(61 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(113 + x, 105 + y, 1, 2);
        g2d.fillRect(112 + x, 106 + y, 1, 3);
        g2d.fillRect(63 + x, 110 + y, 1, 1);
        g2d.fillRect(111 + x, 110 + y, 1, 1);
        g2d.fillRect(62 + x, 111 + y, 1, 1);
        g2d.fillRect(72 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 113 + y, 1, 1);
        g2d.fillRect(109 + x, 115 + y, 1, 1);
        g2d.fillRect(62 + x, 119 + y, 1, 1);
        g2d.fillRect(62 + x, 121 + y, 1, 4);
        g2d.fillRect(63 + x, 123 + y, 1, 1);
        g2d.fillRect(107 + x, 123 + y, 1, 2);
        g2d.fillRect(75 + x, 124 + y, 1, 1);
        g2d.fillRect(64 + x, 125 + y, 1, 1);
        g2d.fillRect(107 + x, 127 + y, 1, 1);
        g2d.fillRect(107 + x, 129 + y, 1, 2);
        g2d.fillRect(105 + x, 134 + y, 1, 1);
        g2d.fillRect(101 + x, 135 + y, 1, 1);
        g2d.fillRect(107 + x, 136 + y, 1, 1);
        g2d.fillRect(106 + x, 139 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,94,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(72 + x, 73 + y, 1, 1);
        g2d.fillRect(78 + x, 74 + y, 1, 1);
        g2d.fillRect(79 + x, 75 + y, 1, 1);
        g2d.fillRect(76 + x, 76 + y, 1, 1);
        g2d.fillRect(80 + x, 76 + y, 1, 1);
        g2d.fillRect(84 + x, 76 + y, 1, 1);
        g2d.fillRect(64 + x, 78 + y, 1, 1);
        g2d.fillRect(64 + x, 83 + y, 2, 1);
        g2d.fillRect(69 + x, 99 + y, 1, 2);
        g2d.fillRect(80 + x, 102 + y, 1, 1);
        g2d.fillRect(91 + x, 102 + y, 1, 1);
        g2d.fillRect(92 + x, 105 + y, 1, 1);
        g2d.fillRect(66 + x, 108 + y, 1, 1);
        g2d.fillRect(95 + x, 109 + y, 1, 1);
        g2d.fillRect(64 + x, 112 + y, 1, 1);
        g2d.fillRect(98 + x, 114 + y, 1, 1);
        g2d.fillRect(96 + x, 115 + y, 1, 1);
        g2d.fillRect(108 + x, 118 + y, 1, 1);
        g2d.fillRect(76 + x, 122 + y, 1, 1);
        g2d.fillRect(97 + x, 126 + y, 1, 1);
        g2d.fillRect(106 + x, 138 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164,95,49,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(64 + x, 126 + y, 1, 1);
        g2d.fillRect(80 + x, 126 + y, 1, 1);
        g2d.fillRect(62 + x, 129 + y, 1, 1);
        g2d.fillRect(61 + x, 133 + y, 1, 1);
        g2d.fillRect(65 + x, 133 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,99,66,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(58 + x, 78 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,97,46,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(74 + x, 73 + y, 3, 1);
        g2d.fillRect(74 + x, 75 + y, 1, 1);
        g2d.fillRect(67 + x, 76 + y, 1, 1);
        g2d.fillRect(66 + x, 77 + y, 1, 1);
        g2d.fillRect(75 + x, 77 + y, 1, 2);
        g2d.fillRect(76 + x, 77 + y, 1, 2);
        g2d.fillRect(81 + x, 77 + y, 1, 1);
        g2d.fillRect(86 + x, 77 + y, 2, 1);
        g2d.fillRect(95 + x, 77 + y, 2, 1);
        g2d.fillRect(68 + x, 78 + y, 1, 2);
        g2d.fillRect(63 + x, 79 + y, 1, 1);
        g2d.fillRect(80 + x, 80 + y, 1, 2);
        g2d.fillRect(62 + x, 81 + y, 1, 1);
        g2d.fillRect(67 + x, 81 + y, 1, 1);
        g2d.fillRect(74 + x, 81 + y, 1, 1);
        g2d.fillRect(66 + x, 82 + y, 1, 1);
        g2d.fillRect(61 + x, 83 + y, 1, 1);
        g2d.fillRect(67 + x, 83 + y, 1, 1);
        g2d.fillRect(79 + x, 83 + y, 1, 1);
        g2d.fillRect(60 + x, 86 + y, 1, 1);
        g2d.fillRect(67 + x, 88 + y, 1, 1);
        g2d.fillRect(60 + x, 90 + y, 1, 1);
        g2d.fillRect(69 + x, 93 + y, 1, 3);
        g2d.fillRect(92 + x, 94 + y, 1, 1);
        g2d.fillRect(93 + x, 95 + y, 1, 1);
        g2d.fillRect(69 + x, 97 + y, 1, 2);
        g2d.fillRect(82 + x, 98 + y, 1, 1);
        g2d.fillRect(91 + x, 101 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(68 + x, 103 + y, 1, 1);
        g2d.fillRect(79 + x, 103 + y, 1, 1);
        g2d.fillRect(100 + x, 103 + y, 1, 1);
        g2d.fillRect(78 + x, 104 + y, 1, 1);
        g2d.fillRect(62 + x, 105 + y, 1, 2);
        g2d.fillRect(67 + x, 106 + y, 1, 1);
        g2d.fillRect(76 + x, 107 + y, 1, 1);
        g2d.fillRect(64 + x, 111 + y, 1, 1);
        g2d.fillRect(111 + x, 111 + y, 1, 1);
        g2d.fillRect(94 + x, 112 + y, 1, 1);
        g2d.fillRect(97 + x, 112 + y, 1, 1);
        g2d.fillRect(61 + x, 113 + y, 1, 3);
        g2d.fillRect(76 + x, 116 + y, 1, 1);
        g2d.fillRect(96 + x, 116 + y, 1, 1);
        g2d.fillRect(77 + x, 118 + y, 1, 1);
        g2d.fillRect(96 + x, 118 + y, 1, 1);
        g2d.fillRect(79 + x, 121 + y, 1, 1);
        g2d.fillRect(107 + x, 122 + y, 1, 1);
        g2d.fillRect(61 + x, 123 + y, 1, 1);
        g2d.fillRect(74 + x, 124 + y, 1, 1);
        g2d.fillRect(107 + x, 126 + y, 1, 1);
        g2d.fillRect(98 + x, 127 + y, 1, 1);
        g2d.fillRect(100 + x, 128 + y, 1, 1);
        g2d.fillRect(107 + x, 128 + y, 1, 1);
        g2d.fillRect(99 + x, 131 + y, 1, 1);
        g2d.fillRect(104 + x, 134 + y, 1, 1);
        g2d.fillRect(108 + x, 137 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164,99,51,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(70 + x, 112 + y, 1, 1);
        g2d.fillRect(64 + x, 115 + y, 1, 1);
        g2d.fillRect(63 + x, 126 + y, 1, 1);
        g2d.fillRect(103 + x, 144 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(109,104,102,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(75 + x, 128 + y, 1, 2);
        g2d.fillRect(77 + x, 130 + y, 2, 1);
        g2d.fillRect(74 + x, 131 + y, 1, 1);
        g2d.fillRect(78 + x, 131 + y, 1, 1);
        g2d.fillRect(76 + x, 132 + y, 1, 1);
        g2d.fillRect(73 + x, 134 + y, 1, 1);
        g2d.fillRect(75 + x, 134 + y, 1, 2);
        g2d.fillRect(71 + x, 135 + y, 1, 1);
        g2d.fillRect(65 + x, 136 + y, 1, 5);
        g2d.fillRect(73 + x, 136 + y, 1, 1);
        g2d.fillRect(64 + x, 137 + y, 1, 4);
        g2d.fillRect(66 + x, 137 + y, 1, 4);
        g2d.fillRect(74 + x, 137 + y, 1, 4);
        g2d.fillRect(63 + x, 138 + y, 1, 2);
        g2d.fillRect(73 + x, 138 + y, 1, 3);
        g2d.fillRect(75 + x, 139 + y, 1, 2);
        g2d.fillRect(70 + x, 142 + y, 1, 1);
        g2d.fillRect(110 + x, 144 + y, 2, 1);
        g2d.fillRect(107 + x, 145 + y, 1, 2);
        g2d.fillRect(112 + x, 145 + y, 1, 1);
        g2d.fillRect(111 + x, 146 + y, 1, 1);
        g2d.fillRect(113 + x, 146 + y, 1, 1);
        g2d.fillRect(101 + x, 147 + y, 1, 6);
        g2d.fillRect(102 + x, 147 + y, 1, 6);
        g2d.fillRect(108 + x, 147 + y, 1, 2);
        g2d.fillRect(109 + x, 147 + y, 1, 4);
        g2d.fillRect(100 + x, 148 + y, 1, 4);
        g2d.fillRect(110 + x, 148 + y, 1, 4);
        g2d.fillRect(111 + x, 149 + y, 1, 5);
        g2d.fillRect(112 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,100,48,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(78 + x, 75 + y, 1, 1);
        g2d.fillRect(80 + x, 78 + y, 1, 2);
        g2d.fillRect(87 + x, 78 + y, 1, 1);
        g2d.fillRect(94 + x, 78 + y, 4, 1);
        g2d.fillRect(80 + x, 82 + y, 1, 1);
        g2d.fillRect(78 + x, 83 + y, 1, 1);
        g2d.fillRect(65 + x, 84 + y, 1, 1);
        g2d.fillRect(77 + x, 84 + y, 1, 1);
        g2d.fillRect(64 + x, 86 + y, 1, 1);
        g2d.fillRect(75 + x, 89 + y, 1, 1);
        g2d.fillRect(76 + x, 92 + y, 1, 1);
        g2d.fillRect(69 + x, 96 + y, 1, 1);
        g2d.fillRect(60 + x, 99 + y, 1, 1);
        g2d.fillRect(61 + x, 102 + y, 1, 1);
        g2d.fillRect(114 + x, 105 + y, 1, 2);
        g2d.fillRect(113 + x, 107 + y, 1, 2);
        g2d.fillRect(112 + x, 109 + y, 1, 1);
        g2d.fillRect(63 + x, 111 + y, 1, 1);
        g2d.fillRect(111 + x, 112 + y, 1, 1);
        g2d.fillRect(64 + x, 113 + y, 1, 1);
        g2d.fillRect(75 + x, 115 + y, 1, 1);
        g2d.fillRect(63 + x, 117 + y, 1, 1);
        g2d.fillRect(62 + x, 118 + y, 1, 1);
        g2d.fillRect(100 + x, 119 + y, 1, 1);
        g2d.fillRect(101 + x, 121 + y, 1, 1);
        g2d.fillRect(97 + x, 122 + y, 1, 3);
        g2d.fillRect(63 + x, 124 + y, 1, 2);
        g2d.fillRect(108 + x, 125 + y, 1, 1);
        g2d.fillRect(107 + x, 131 + y, 1, 1);
        g2d.fillRect(104 + x, 132 + y, 1, 2);
        g2d.fillRect(105 + x, 133 + y, 2, 1);
        g2d.fillRect(106 + x, 134 + y, 1, 1);
        g2d.fillRect(107 + x, 135 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(173,98,48,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(67 + x, 77 + y, 3, 1);
        g2d.fillRect(74 + x, 77 + y, 1, 2);
        g2d.fillRect(73 + x, 81 + y, 1, 1);
        g2d.fillRect(75 + x, 81 + y, 1, 1);
        g2d.fillRect(65 + x, 82 + y, 1, 1);
        g2d.fillRect(66 + x, 83 + y, 1, 2);
        g2d.fillRect(72 + x, 83 + y, 1, 1);
        g2d.fillRect(64 + x, 84 + y, 1, 1);
        g2d.fillRect(93 + x, 94 + y, 1, 1);
        g2d.fillRect(90 + x, 95 + y, 1, 1);
        g2d.fillRect(92 + x, 98 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(173,100,49,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(73 + x, 73 + y, 1, 1);
        g2d.fillRect(74 + x, 74 + y, 1, 1);
        g2d.fillRect(76 + x, 74 + y, 2, 1);
        g2d.fillRect(82 + x, 74 + y, 1, 1);
        g2d.fillRect(75 + x, 75 + y, 1, 1);
        g2d.fillRect(83 + x, 75 + y, 1, 1);
        g2d.fillRect(74 + x, 76 + y, 1, 1);
        g2d.fillRect(78 + x, 76 + y, 1, 2);
        g2d.fillRect(73 + x, 77 + y, 1, 1);
        g2d.fillRect(79 + x, 77 + y, 2, 1);
        g2d.fillRect(65 + x, 78 + y, 1, 3);
        g2d.fillRect(66 + x, 78 + y, 2, 1);
        g2d.fillRect(70 + x, 78 + y, 1, 1);
        g2d.fillRect(77 + x, 78 + y, 1, 1);
        g2d.fillRect(82 + x, 78 + y, 1, 1);
        g2d.fillRect(83 + x, 79 + y, 1, 1);
        g2d.fillRect(89 + x, 79 + y, 1, 1);
        g2d.fillRect(91 + x, 79 + y, 1, 1);
        g2d.fillRect(93 + x, 79 + y, 1, 1);
        g2d.fillRect(98 + x, 79 + y, 1, 1);
        g2d.fillRect(72 + x, 80 + y, 1, 1);
        g2d.fillRect(67 + x, 82 + y, 2, 1);
        g2d.fillRect(67 + x, 84 + y, 1, 1);
        g2d.fillRect(69 + x, 84 + y, 1, 2);
        g2d.fillRect(76 + x, 84 + y, 1, 1);
        g2d.fillRect(62 + x, 85 + y, 1, 2);
        g2d.fillRect(64 + x, 85 + y, 1, 1);
        g2d.fillRect(66 + x, 85 + y, 1, 1);
        g2d.fillRect(75 + x, 85 + y, 1, 1);
        g2d.fillRect(61 + x, 86 + y, 1, 1);
        g2d.fillRect(65 + x, 86 + y, 1, 1);
        g2d.fillRect(67 + x, 87 + y, 1, 1);
        g2d.fillRect(80 + x, 87 + y, 1, 1);
        g2d.fillRect(66 + x, 88 + y, 1, 1);
        g2d.fillRect(60 + x, 89 + y, 1, 1);
        g2d.fillRect(62 + x, 89 + y, 1, 2);
        g2d.fillRect(61 + x, 90 + y, 1, 2);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(77 + x, 94 + y, 1, 1);
        g2d.fillRect(94 + x, 94 + y, 1, 1);
        g2d.fillRect(79 + x, 96 + y, 1, 1);
        g2d.fillRect(88 + x, 98 + y, 1, 1);
        g2d.fillRect(67 + x, 105 + y, 1, 1);
        g2d.fillRect(77 + x, 106 + y, 1, 1);
        g2d.fillRect(93 + x, 106 + y, 1, 1);
        g2d.fillRect(63 + x, 109 + y, 1, 1);
        g2d.fillRect(65 + x, 109 + y, 1, 1);
        g2d.fillRect(64 + x, 110 + y, 1, 1);
        g2d.fillRect(96 + x, 110 + y, 1, 1);
        g2d.fillRect(99 + x, 113 + y, 1, 1);
        g2d.fillRect(74 + x, 114 + y, 1, 1);
        g2d.fillRect(109 + x, 116 + y, 1, 3);
        g2d.fillRect(97 + x, 120 + y, 1, 2);
        g2d.fillRect(107 + x, 120 + y, 1, 2);
        g2d.fillRect(101 + x, 122 + y, 1, 1);
        g2d.fillRect(108 + x, 122 + y, 1, 1);
        g2d.fillRect(97 + x, 125 + y, 1, 1);
        g2d.fillRect(101 + x, 127 + y, 1, 1);
        g2d.fillRect(99 + x, 132 + y, 1, 1);
        g2d.fillRect(96 + x, 146 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,104,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(70 + x, 110 + y, 1, 1);
        g2d.fillRect(71 + x, 112 + y, 1, 1);
        g2d.fillRect(64 + x, 114 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177,101,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(69 + x, 74 + y, 2, 1);
        g2d.fillRect(75 + x, 74 + y, 1, 1);
        g2d.fillRect(68 + x, 75 + y, 1, 2);
        g2d.fillRect(70 + x, 75 + y, 1, 1);
        g2d.fillRect(73 + x, 75 + y, 1, 1);
        g2d.fillRect(75 + x, 76 + y, 1, 1);
        g2d.fillRect(79 + x, 76 + y, 1, 1);
        g2d.fillRect(70 + x, 77 + y, 1, 1);
        g2d.fillRect(72 + x, 77 + y, 1, 1);
        g2d.fillRect(64 + x, 79 + y, 1, 2);
        g2d.fillRect(70 + x, 79 + y, 1, 2);
        g2d.fillRect(74 + x, 79 + y, 1, 1);
        g2d.fillRect(63 + x, 80 + y, 1, 1);
        g2d.fillRect(71 + x, 80 + y, 1, 1);
        g2d.fillRect(62 + x, 82 + y, 1, 1);
        g2d.fillRect(64 + x, 82 + y, 1, 1);
        g2d.fillRect(69 + x, 82 + y, 1, 1);
        g2d.fillRect(71 + x, 82 + y, 2, 1);
        g2d.fillRect(76 + x, 82 + y, 1, 1);
        g2d.fillRect(68 + x, 83 + y, 1, 1);
        g2d.fillRect(61 + x, 84 + y, 1, 2);
        g2d.fillRect(71 + x, 84 + y, 1, 1);
        g2d.fillRect(65 + x, 85 + y, 1, 1);
        g2d.fillRect(68 + x, 85 + y, 1, 2);
        g2d.fillRect(70 + x, 85 + y, 1, 1);
        g2d.fillRect(63 + x, 86 + y, 1, 1);
        g2d.fillRect(69 + x, 86 + y, 1, 1);
        g2d.fillRect(60 + x, 87 + y, 1, 2);
        g2d.fillRect(62 + x, 87 + y, 1, 1);
        g2d.fillRect(60 + x, 91 + y, 1, 2);
        g2d.fillRect(61 + x, 92 + y, 1, 1);
        g2d.fillRect(95 + x, 92 + y, 1, 1);
        g2d.fillRect(91 + x, 94 + y, 1, 1);
        g2d.fillRect(89 + x, 96 + y, 1, 1);
        g2d.fillRect(93 + x, 96 + y, 1, 1);
        g2d.fillRect(92 + x, 99 + y, 1, 1);
        g2d.fillRect(80 + x, 103 + y, 1, 1);
        g2d.fillRect(78 + x, 105 + y, 1, 1);
        g2d.fillRect(77 + x, 107 + y, 1, 1);
        g2d.fillRect(77 + x, 117 + y, 1, 1);
        g2d.fillRect(78 + x, 119 + y, 1, 1);
        g2d.fillRect(81 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(175,103,51,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(78 + x, 78 + y, 1, 1);
        g2d.fillRect(81 + x, 78 + y, 1, 1);
        g2d.fillRect(84 + x, 79 + y, 5, 1);
        g2d.fillRect(90 + x, 79 + y, 1, 1);
        g2d.fillRect(92 + x, 79 + y, 1, 1);
        g2d.fillRect(95 + x, 79 + y, 1, 1);
        g2d.fillRect(67 + x, 80 + y, 1, 1);
        g2d.fillRect(79 + x, 80 + y, 1, 2);
        g2d.fillRect(81 + x, 80 + y, 1, 1);
        g2d.fillRect(70 + x, 81 + y, 1, 1);
        g2d.fillRect(76 + x, 83 + y, 2, 1);
        g2d.fillRect(68 + x, 84 + y, 1, 1);
        g2d.fillRect(79 + x, 86 + y, 1, 2);
        g2d.fillRect(63 + x, 87 + y, 1, 1);
        g2d.fillRect(75 + x, 88 + y, 1, 1);
        g2d.fillRect(67 + x, 89 + y, 1, 1);
        g2d.fillRect(76 + x, 89 + y, 1, 1);
        g2d.fillRect(79 + x, 89 + y, 1, 2);
        g2d.fillRect(80 + x, 89 + y, 1, 1);
        g2d.fillRect(67 + x, 91 + y, 1, 1);
        g2d.fillRect(68 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 1);
        g2d.fillRect(78 + x, 95 + y, 1, 1);
        g2d.fillRect(63 + x, 96 + y, 1, 1);
        g2d.fillRect(83 + x, 98 + y, 1, 1);
        g2d.fillRect(86 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 1);
        g2d.fillRect(99 + x, 104 + y, 1, 3);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(63 + x, 108 + y, 1, 1);
        g2d.fillRect(113 + x, 109 + y, 1, 1);
        g2d.fillRect(98 + x, 110 + y, 1, 1);
        g2d.fillRect(112 + x, 110 + y, 1, 1);
        g2d.fillRect(97 + x, 111 + y, 1, 1);
        g2d.fillRect(62 + x, 112 + y, 1, 1);
        g2d.fillRect(111 + x, 113 + y, 1, 2);
        g2d.fillRect(110 + x, 114 + y, 1, 2);
        g2d.fillRect(62 + x, 117 + y, 1, 1);
        g2d.fillRect(96 + x, 117 + y, 2, 1);
        g2d.fillRect(99 + x, 118 + y, 1, 1);
        g2d.fillRect(108 + x, 121 + y, 1, 1);
        g2d.fillRect(81 + x, 131 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,109,105,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(77 + x, 129 + y, 1, 1);
        g2d.fillRect(76 + x, 130 + y, 1, 2);
        g2d.fillRect(74 + x, 132 + y, 1, 4);
        g2d.fillRect(75 + x, 133 + y, 1, 1);
        g2d.fillRect(66 + x, 135 + y, 1, 2);
        g2d.fillRect(72 + x, 136 + y, 1, 1);
        g2d.fillRect(75 + x, 136 + y, 1, 1);
        g2d.fillRect(67 + x, 138 + y, 1, 4);
        g2d.fillRect(73 + x, 141 + y, 1, 1);
        g2d.fillRect(106 + x, 145 + y, 1, 2);
        g2d.fillRect(107 + x, 147 + y, 1, 2);
        g2d.fillRect(112 + x, 147 + y, 1, 1);
        g2d.fillRect(103 + x, 149 + y, 1, 4);
        g2d.fillRect(108 + x, 149 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177,105,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(79 + x, 78 + y, 1, 1);
        g2d.fillRect(94 + x, 79 + y, 1, 2);
        g2d.fillRect(96 + x, 79 + y, 2, 1);
        g2d.fillRect(78 + x, 82 + y, 1, 1);
        g2d.fillRect(66 + x, 86 + y, 1, 1);
        g2d.fillRect(64 + x, 87 + y, 1, 1);
        g2d.fillRect(80 + x, 88 + y, 1, 1);
        g2d.fillRect(63 + x, 89 + y, 1, 1);
        g2d.fillRect(66 + x, 89 + y, 1, 1);
        g2d.fillRect(78 + x, 89 + y, 1, 1);
        g2d.fillRect(67 + x, 90 + y, 1, 1);
        g2d.fillRect(60 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(62 + x, 94 + y, 1, 1);
        g2d.fillRect(66 + x, 94 + y, 1, 2);
        g2d.fillRect(67 + x, 94 + y, 1, 1);
        g2d.fillRect(62 + x, 97 + y, 1, 1);
        g2d.fillRect(60 + x, 98 + y, 1, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);
        g2d.fillRect(68 + x, 102 + y, 1, 1);
        g2d.fillRect(62 + x, 104 + y, 1, 1);
        g2d.fillRect(92 + x, 104 + y, 1, 1);
        g2d.fillRect(63 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(66 + x, 107 + y, 1, 1);
        g2d.fillRect(94 + x, 107 + y, 1, 1);
        g2d.fillRect(99 + x, 107 + y, 1, 1);
        g2d.fillRect(99 + x, 110 + y, 1, 1);
        g2d.fillRect(73 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 116 + y, 1, 1);
        g2d.fillRect(108 + x, 119 + y, 1, 1);
        g2d.fillRect(79 + x, 120 + y, 1, 1);
        g2d.fillRect(101 + x, 123 + y, 1, 1);
        g2d.fillRect(108 + x, 123 + y, 1, 1);
        g2d.fillRect(108 + x, 126 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180,105,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(71 + x, 74 + y, 1, 6);
        g2d.fillRect(72 + x, 74 + y, 1, 3);
        g2d.fillRect(73 + x, 74 + y, 1, 1);
        g2d.fillRect(69 + x, 75 + y, 1, 2);
        g2d.fillRect(70 + x, 76 + y, 1, 1);
        g2d.fillRect(73 + x, 76 + y, 1, 1);
        g2d.fillRect(72 + x, 78 + y, 1, 2);
        g2d.fillRect(73 + x, 78 + y, 1, 3);
        g2d.fillRect(66 + x, 79 + y, 1, 3);
        g2d.fillRect(67 + x, 79 + y, 1, 1);
        g2d.fillRect(75 + x, 79 + y, 1, 2);
        g2d.fillRect(76 + x, 79 + y, 1, 3);
        g2d.fillRect(77 + x, 79 + y, 2, 1);
        g2d.fillRect(81 + x, 79 + y, 1, 1);
        g2d.fillRect(74 + x, 80 + y, 1, 1);
        g2d.fillRect(78 + x, 80 + y, 1, 1);
        g2d.fillRect(83 + x, 80 + y, 1, 1);
        g2d.fillRect(98 + x, 80 + y, 1, 1);
        g2d.fillRect(63 + x, 81 + y, 1, 5);
        g2d.fillRect(64 + x, 81 + y, 2, 1);
        g2d.fillRect(71 + x, 81 + y, 2, 1);
        g2d.fillRect(77 + x, 81 + y, 1, 1);
        g2d.fillRect(81 + x, 81 + y, 1, 1);
        g2d.fillRect(86 + x, 81 + y, 1, 2);
        g2d.fillRect(91 + x, 81 + y, 1, 1);
        g2d.fillRect(94 + x, 81 + y, 1, 1);
        g2d.fillRect(70 + x, 82 + y, 1, 3);
        g2d.fillRect(87 + x, 82 + y, 1, 1);
        g2d.fillRect(89 + x, 82 + y, 1, 3);
        g2d.fillRect(92 + x, 82 + y, 1, 2);
        g2d.fillRect(96 + x, 82 + y, 1, 3);
        g2d.fillRect(98 + x, 82 + y, 1, 4);
        g2d.fillRect(62 + x, 83 + y, 1, 2);
        g2d.fillRect(69 + x, 83 + y, 1, 1);
        g2d.fillRect(71 + x, 83 + y, 1, 1);
        g2d.fillRect(93 + x, 83 + y, 1, 1);
        g2d.fillRect(95 + x, 83 + y, 1, 2);
        g2d.fillRect(91 + x, 84 + y, 1, 2);
        g2d.fillRect(67 + x, 85 + y, 1, 2);
        g2d.fillRect(92 + x, 85 + y, 1, 1);
        g2d.fillRect(97 + x, 85 + y, 1, 2);
        g2d.fillRect(95 + x, 86 + y, 1, 2);
        g2d.fillRect(96 + x, 86 + y, 1, 1);
        g2d.fillRect(61 + x, 87 + y, 1, 3);
        g2d.fillRect(98 + x, 87 + y, 1, 2);
        g2d.fillRect(62 + x, 88 + y, 2, 1);
        g2d.fillRect(93 + x, 88 + y, 1, 1);
        g2d.fillRect(96 + x, 88 + y, 2, 1);
        g2d.fillRect(93 + x, 90 + y, 2, 1);
        g2d.fillRect(96 + x, 90 + y, 1, 5);
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(62 + x, 91 + y, 1, 3);
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(67 + x, 92 + y, 1, 1);
        g2d.fillRect(91 + x, 92 + y, 2, 1);
        g2d.fillRect(94 + x, 92 + y, 1, 2);
        g2d.fillRect(61 + x, 93 + y, 1, 1);
        g2d.fillRect(68 + x, 93 + y, 1, 2);
        g2d.fillRect(89 + x, 93 + y, 2, 1);
        g2d.fillRect(92 + x, 93 + y, 2, 1);
        g2d.fillRect(95 + x, 93 + y, 1, 3);
        g2d.fillRect(90 + x, 94 + y, 1, 1);
        g2d.fillRect(97 + x, 94 + y, 1, 2);
        g2d.fillRect(61 + x, 95 + y, 1, 1);
        g2d.fillRect(88 + x, 95 + y, 1, 1);
        g2d.fillRect(94 + x, 95 + y, 1, 6);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(60 + x, 97 + y, 1, 1);
        g2d.fillRect(81 + x, 97 + y, 1, 1);
        g2d.fillRect(87 + x, 97 + y, 2, 1);
        g2d.fillRect(93 + x, 97 + y, 1, 1);
        g2d.fillRect(95 + x, 97 + y, 1, 2);
        g2d.fillRect(84 + x, 98 + y, 1, 1);
        g2d.fillRect(96 + x, 98 + y, 1, 1);
        g2d.fillRect(93 + x, 99 + y, 1, 1);
        g2d.fillRect(63 + x, 100 + y, 1, 1);
        g2d.fillRect(92 + x, 100 + y, 1, 1);
        g2d.fillRect(95 + x, 100 + y, 1, 1);
        g2d.fillRect(68 + x, 101 + y, 1, 1);
        g2d.fillRect(93 + x, 101 + y, 1, 1);
        g2d.fillRect(94 + x, 102 + y, 1, 1);
        g2d.fillRect(92 + x, 103 + y, 2, 1);
        g2d.fillRect(79 + x, 104 + y, 1, 3);
        g2d.fillRect(80 + x, 104 + y, 1, 1);
        g2d.fillRect(94 + x, 104 + y, 3, 1);
        g2d.fillRect(65 + x, 106 + y, 1, 1);
        g2d.fillRect(78 + x, 106 + y, 1, 1);
        g2d.fillRect(95 + x, 106 + y, 2, 1);
        g2d.fillRect(64 + x, 107 + y, 1, 1);
        g2d.fillRect(95 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(78 + x, 118 + y, 1, 1);
        g2d.fillRect(80 + x, 121 + y, 1, 1);
        g2d.fillRect(108 + x, 124 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(178,107,54,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(89 + x, 80 + y, 1, 2);
        g2d.fillRect(91 + x, 80 + y, 1, 1);
        g2d.fillRect(93 + x, 80 + y, 1, 1);
        g2d.fillRect(96 + x, 80 + y, 1, 1);
        g2d.fillRect(79 + x, 82 + y, 1, 1);
        g2d.fillRect(83 + x, 83 + y, 1, 1);
        g2d.fillRect(78 + x, 84 + y, 2, 1);
        g2d.fillRect(81 + x, 88 + y, 1, 1);
        g2d.fillRect(77 + x, 89 + y, 1, 1);
        g2d.fillRect(66 + x, 90 + y, 1, 1);
        g2d.fillRect(76 + x, 90 + y, 1, 2);
        g2d.fillRect(78 + x, 90 + y, 1, 1);
        g2d.fillRect(95 + x, 90 + y, 1, 1);
        g2d.fillRect(77 + x, 93 + y, 1, 1);
        g2d.fillRect(62 + x, 95 + y, 1, 2);
        g2d.fillRect(61 + x, 97 + y, 1, 1);
        g2d.fillRect(101 + x, 102 + y, 1, 1);
        g2d.fillRect(67 + x, 104 + y, 1, 1);
        g2d.fillRect(93 + x, 104 + y, 1, 1);
        g2d.fillRect(63 + x, 107 + y, 1, 1);
        g2d.fillRect(99 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 110 + y, 1, 1);
        g2d.fillRect(99 + x, 111 + y, 1, 2);
        g2d.fillRect(63 + x, 112 + y, 1, 1);
        g2d.fillRect(62 + x, 113 + y, 1, 1);
        g2d.fillRect(98 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 118 + y, 1, 1);
        g2d.fillRect(97 + x, 119 + y, 1, 1);
        g2d.fillRect(109 + x, 122 + y, 1, 1);
        g2d.fillRect(109 + x, 125 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(118,113,110,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(76 + x, 129 + y, 1, 1);
        g2d.fillRect(75 + x, 130 + y, 1, 3);
        g2d.fillRect(67 + x, 135 + y, 1, 3);
        g2d.fillRect(71 + x, 136 + y, 1, 1);
        g2d.fillRect(72 + x, 137 + y, 1, 1);
        g2d.fillRect(110 + x, 143 + y, 1, 1);
        g2d.fillRect(110 + x, 146 + y, 1, 1);
        g2d.fillRect(106 + x, 147 + y, 1, 1);
        g2d.fillRect(111 + x, 147 + y, 1, 1);
        g2d.fillRect(114 + x, 147 + y, 1, 1);
        g2d.fillRect(109 + x, 151 + y, 1, 1);
        g2d.fillRect(110 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(176,109,59,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(65 + x, 87 + y, 1, 4);
        g2d.fillRect(64 + x, 88 + y, 1, 3);
        g2d.fillRect(65 + x, 94 + y, 1, 2);
        g2d.fillRect(66 + x, 96 + y, 1, 1);
        g2d.fillRect(71 + x, 110 + y, 1, 1);
        g2d.fillRect(70 + x, 111 + y, 1, 1);
        g2d.fillRect(72 + x, 112 + y, 1, 1);
        g2d.fillRect(101 + x, 124 + y, 1, 1);
        g2d.fillRect(101 + x, 126 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180,109,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(80 + x, 83 + y, 1, 1);
        g2d.fillRect(82 + x, 83 + y, 1, 1);
        g2d.fillRect(83 + x, 84 + y, 1, 1);
        g2d.fillRect(80 + x, 86 + y, 1, 1);
        g2d.fillRect(88 + x, 86 + y, 1, 1);
        g2d.fillRect(77 + x, 88 + y, 2, 1);
        g2d.fillRect(63 + x, 90 + y, 1, 1);
        g2d.fillRect(80 + x, 90 + y, 1, 1);
        g2d.fillRect(66 + x, 93 + y, 1, 1);
        g2d.fillRect(88 + x, 93 + y, 1, 1);
        g2d.fillRect(63 + x, 97 + y, 1, 1);
        g2d.fillRect(67 + x, 97 + y, 1, 1);
        g2d.fillRect(83 + x, 97 + y, 1, 1);
        g2d.fillRect(87 + x, 99 + y, 1, 1);
        g2d.fillRect(67 + x, 100 + y, 1, 2);
        g2d.fillRect(103 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 2);
        g2d.fillRect(98 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(97 + x, 108 + y, 2, 1);
        g2d.fillRect(98 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 111 + y, 1, 1);
        g2d.fillRect(112 + x, 114 + y, 1, 1);
        g2d.fillRect(109 + x, 119 + y, 1, 1);
        g2d.fillRect(100 + x, 120 + y, 1, 1);
        g2d.fillRect(109 + x, 123 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(182,108,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(77 + x, 80 + y, 1, 1);
        g2d.fillRect(78 + x, 81 + y, 1, 1);
        g2d.fillRect(87 + x, 81 + y, 1, 1);
        g2d.fillRect(92 + x, 81 + y, 1, 1);
        g2d.fillRect(81 + x, 82 + y, 1, 1);
        g2d.fillRect(93 + x, 82 + y, 1, 1);
        g2d.fillRect(84 + x, 83 + y, 1, 2);
        g2d.fillRect(92 + x, 84 + y, 1, 1);
        g2d.fillRect(97 + x, 84 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 1);
        g2d.fillRect(75 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 87 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(95 + x, 91 + y, 1, 1);
        g2d.fillRect(66 + x, 92 + y, 1, 1);
        g2d.fillRect(77 + x, 92 + y, 1, 1);
        g2d.fillRect(93 + x, 92 + y, 1, 1);
        g2d.fillRect(91 + x, 93 + y, 1, 1);
        g2d.fillRect(60 + x, 94 + y, 1, 3);
        g2d.fillRect(89 + x, 95 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 1);
        g2d.fillRect(68 + x, 97 + y, 1, 1);
        g2d.fillRect(96 + x, 97 + y, 1, 1);
        g2d.fillRect(61 + x, 98 + y, 1, 1);
        g2d.fillRect(95 + x, 99 + y, 1, 1);
        g2d.fillRect(68 + x, 100 + y, 1, 1);
        g2d.fillRect(61 + x, 101 + y, 1, 1);
        g2d.fillRect(92 + x, 101 + y, 1, 1);
        g2d.fillRect(94 + x, 103 + y, 1, 1);
        g2d.fillRect(93 + x, 105 + y, 1, 1);
        g2d.fillRect(66 + x, 106 + y, 1, 1);
        g2d.fillRect(64 + x, 109 + y, 1, 1);
        g2d.fillRect(79 + x, 119 + y, 1, 1);
        g2d.fillRect(108 + x, 120 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183,108,56,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(96 + x, 85 + y, 1, 1);
        g2d.fillRect(66 + x, 87 + y, 1, 1);
        g2d.fillRect(65 + x, 108 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183,110,56,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(79 + x, 79 + y, 1, 1);
        g2d.fillRect(82 + x, 79 + y, 1, 2);
        g2d.fillRect(84 + x, 80 + y, 1, 1);
        g2d.fillRect(86 + x, 80 + y, 2, 1);
        g2d.fillRect(90 + x, 80 + y, 1, 5);
        g2d.fillRect(92 + x, 80 + y, 1, 1);
        g2d.fillRect(95 + x, 80 + y, 1, 3);
        g2d.fillRect(97 + x, 80 + y, 1, 1);
        g2d.fillRect(96 + x, 81 + y, 1, 1);
        g2d.fillRect(98 + x, 81 + y, 1, 1);
        g2d.fillRect(77 + x, 82 + y, 1, 1);
        g2d.fillRect(82 + x, 82 + y, 2, 1);
        g2d.fillRect(88 + x, 82 + y, 1, 1);
        g2d.fillRect(97 + x, 82 + y, 1, 2);
        g2d.fillRect(91 + x, 83 + y, 1, 1);
        g2d.fillRect(94 + x, 83 + y, 1, 1);
        g2d.fillRect(82 + x, 85 + y, 1, 1);
        g2d.fillRect(88 + x, 85 + y, 1, 1);
        g2d.fillRect(93 + x, 85 + y, 1, 1);
        g2d.fillRect(75 + x, 86 + y, 1, 1);
        g2d.fillRect(87 + x, 86 + y, 1, 1);
        g2d.fillRect(94 + x, 86 + y, 1, 4);
        g2d.fillRect(76 + x, 87 + y, 1, 2);
        g2d.fillRect(77 + x, 87 + y, 1, 1);
        g2d.fillRect(81 + x, 87 + y, 1, 1);
        g2d.fillRect(85 + x, 87 + y, 1, 1);
        g2d.fillRect(92 + x, 87 + y, 2, 1);
        g2d.fillRect(97 + x, 87 + y, 1, 1);
        g2d.fillRect(82 + x, 88 + y, 1, 1);
        g2d.fillRect(87 + x, 89 + y, 1, 1);
        g2d.fillRect(93 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 2, 1);
        g2d.fillRect(77 + x, 90 + y, 1, 1);
        g2d.fillRect(83 + x, 90 + y, 1, 1);
        g2d.fillRect(85 + x, 90 + y, 1, 2);
        g2d.fillRect(88 + x, 90 + y, 1, 1);
        g2d.fillRect(91 + x, 91 + y, 2, 1);
        g2d.fillRect(89 + x, 92 + y, 2, 1);
        g2d.fillRect(67 + x, 93 + y, 1, 1);
        g2d.fillRect(78 + x, 93 + y, 1, 1);
        g2d.fillRect(81 + x, 93 + y, 1, 1);
        g2d.fillRect(83 + x, 93 + y, 1, 1);
        g2d.fillRect(61 + x, 94 + y, 1, 1);
        g2d.fillRect(88 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 2);
        g2d.fillRect(67 + x, 95 + y, 1, 2);
        g2d.fillRect(68 + x, 95 + y, 1, 2);
        g2d.fillRect(81 + x, 95 + y, 1, 2);
        g2d.fillRect(84 + x, 95 + y, 1, 2);
        g2d.fillRect(87 + x, 95 + y, 1, 1);
        g2d.fillRect(86 + x, 97 + y, 1, 1);
        g2d.fillRect(68 + x, 98 + y, 1, 2);
        g2d.fillRect(85 + x, 98 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(63 + x, 99 + y, 1, 1);
        g2d.fillRect(61 + x, 100 + y, 2, 1);
        g2d.fillRect(93 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 100 + y, 2, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(94 + x, 101 + y, 1, 1);
        g2d.fillRect(92 + x, 102 + y, 2, 1);
        g2d.fillRect(95 + x, 102 + y, 1, 2);
        g2d.fillRect(100 + x, 102 + y, 1, 1);
        g2d.fillRect(62 + x, 103 + y, 1, 1);
        g2d.fillRect(99 + x, 103 + y, 1, 1);
        g2d.fillRect(63 + x, 104 + y, 1, 1);
        g2d.fillRect(95 + x, 105 + y, 2, 1);
        g2d.fillRect(63 + x, 106 + y, 2, 1);
        g2d.fillRect(94 + x, 106 + y, 1, 1);
        g2d.fillRect(65 + x, 107 + y, 1, 1);
        g2d.fillRect(114 + x, 108 + y, 2, 1);
        g2d.fillRect(96 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 112 + y, 1, 1);
        g2d.fillRect(112 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 117 + y, 1, 1);
        g2d.fillRect(97 + x, 118 + y, 2, 1);
        g2d.fillRect(98 + x, 119 + y, 1, 1);
        g2d.fillRect(100 + x, 122 + y, 1, 1);
        g2d.fillRect(98 + x, 126 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201,121,29,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(63 + x, 69 + y, 1, 1);
        g2d.fillRect(61 + x, 73 + y, 1, 1);
        g2d.fillRect(60 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185,111,57,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(85 + x, 80 + y, 1, 1);
        g2d.fillRect(88 + x, 80 + y, 1, 2);
        g2d.fillRect(93 + x, 81 + y, 1, 1);
        g2d.fillRect(97 + x, 81 + y, 1, 1);
        g2d.fillRect(84 + x, 82 + y, 1, 1);
        g2d.fillRect(94 + x, 82 + y, 1, 1);
        g2d.fillRect(85 + x, 83 + y, 1, 2);
        g2d.fillRect(93 + x, 84 + y, 1, 1);
        g2d.fillRect(77 + x, 85 + y, 1, 1);
        g2d.fillRect(87 + x, 85 + y, 1, 1);
        g2d.fillRect(89 + x, 85 + y, 1, 1);
        g2d.fillRect(82 + x, 86 + y, 1, 1);
        g2d.fillRect(92 + x, 86 + y, 2, 1);
        g2d.fillRect(84 + x, 87 + y, 1, 1);
        g2d.fillRect(88 + x, 87 + y, 1, 1);
        g2d.fillRect(91 + x, 87 + y, 1, 1);
        g2d.fillRect(85 + x, 88 + y, 1, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 1);
        g2d.fillRect(82 + x, 90 + y, 1, 1);
        g2d.fillRect(87 + x, 90 + y, 1, 1);
        g2d.fillRect(79 + x, 91 + y, 1, 1);
        g2d.fillRect(93 + x, 91 + y, 2, 1);
        g2d.fillRect(85 + x, 92 + y, 1, 1);
        g2d.fillRect(80 + x, 93 + y, 1, 1);
        g2d.fillRect(83 + x, 94 + y, 1, 1);
        g2d.fillRect(89 + x, 94 + y, 1, 1);
        g2d.fillRect(80 + x, 95 + y, 1, 1);
        g2d.fillRect(96 + x, 95 + y, 1, 2);
        g2d.fillRect(61 + x, 96 + y, 1, 1);
        g2d.fillRect(87 + x, 96 + y, 2, 1);
        g2d.fillRect(97 + x, 97 + y, 1, 1);
        g2d.fillRect(86 + x, 98 + y, 1, 1);
        g2d.fillRect(61 + x, 99 + y, 1, 1);
        g2d.fillRect(96 + x, 99 + y, 1, 2);
        g2d.fillRect(102 + x, 100 + y, 1, 2);
        g2d.fillRect(95 + x, 101 + y, 1, 1);
        g2d.fillRect(98 + x, 101 + y, 1, 1);
        g2d.fillRect(67 + x, 103 + y, 1, 1);
        g2d.fillRect(64 + x, 105 + y, 1, 1);
        g2d.fillRect(98 + x, 105 + y, 1, 1);
        g2d.fillRect(95 + x, 107 + y, 1, 1);
        g2d.fillRect(64 + x, 108 + y, 1, 1);
        g2d.fillRect(96 + x, 108 + y, 1, 1);
        g2d.fillRect(112 + x, 115 + y, 1, 1);
        g2d.fillRect(99 + x, 121 + y, 2, 1);
        g2d.fillRect(109 + x, 121 + y, 1, 1);
        g2d.fillRect(99 + x, 127 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,118,115,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(71 + x, 137 + y, 1, 1);
        g2d.fillRect(68 + x, 139 + y, 1, 3);
        g2d.fillRect(109 + x, 143 + y, 1, 1);
        g2d.fillRect(105 + x, 146 + y, 1, 1);
        g2d.fillRect(103 + x, 148 + y, 1, 1);
        g2d.fillRect(107 + x, 149 + y, 1, 1);
        g2d.fillRect(108 + x, 150 + y, 1, 1);
        g2d.fillRect(104 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(181,113,62,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(63 + x, 92 + y, 1, 2);
        g2d.fillRect(65 + x, 93 + y, 1, 1);
        g2d.fillRect(64 + x, 96 + y, 2, 1);
        g2d.fillRect(71 + x, 111 + y, 1, 1);
        g2d.fillRect(63 + x, 113 + y, 1, 1);
        g2d.fillRect(62 + x, 114 + y, 1, 1);
        g2d.fillRect(62 + x, 116 + y, 2, 1);
        g2d.fillRect(100 + x, 123 + y, 1, 1);
        g2d.fillRect(101 + x, 125 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187,112,58,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(82 + x, 81 + y, 4, 1);
        g2d.fillRect(85 + x, 82 + y, 1, 1);
        g2d.fillRect(91 + x, 82 + y, 1, 1);
        g2d.fillRect(86 + x, 83 + y, 1, 3);
        g2d.fillRect(87 + x, 83 + y, 1, 2);
        g2d.fillRect(88 + x, 83 + y, 1, 2);
        g2d.fillRect(94 + x, 84 + y, 1, 2);
        g2d.fillRect(76 + x, 85 + y, 1, 1);
        g2d.fillRect(90 + x, 85 + y, 1, 1);
        g2d.fillRect(95 + x, 85 + y, 1, 1);
        g2d.fillRect(92 + x, 88 + y, 1, 3);
        g2d.fillRect(95 + x, 88 + y, 1, 1);
        g2d.fillRect(91 + x, 89 + y, 1, 2);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(90 + x, 90 + y, 1, 2);
        g2d.fillRect(97 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 97 + y, 1, 2);
        g2d.fillRect(87 + x, 98 + y, 1, 1);
        g2d.fillRect(63 + x, 101 + y, 1, 3);
        g2d.fillRect(96 + x, 103 + y, 1, 1);
        g2d.fillRect(94 + x, 105 + y, 1, 1);
        g2d.fillRect(96 + x, 107 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(186,114,60,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(80 + x, 84 + y, 1, 1);
        g2d.fillRect(79 + x, 85 + y, 1, 1);
        g2d.fillRect(89 + x, 86 + y, 1, 1);
        g2d.fillRect(91 + x, 86 + y, 1, 1);
        g2d.fillRect(78 + x, 87 + y, 1, 1);
        g2d.fillRect(81 + x, 89 + y, 1, 1);
        g2d.fillRect(88 + x, 89 + y, 1, 1);
        g2d.fillRect(66 + x, 91 + y, 1, 1);
        g2d.fillRect(77 + x, 91 + y, 1, 1);
        g2d.fillRect(78 + x, 92 + y, 1, 1);
        g2d.fillRect(88 + x, 92 + y, 1, 1);
        g2d.fillRect(78 + x, 94 + y, 1, 1);
        g2d.fillRect(84 + x, 94 + y, 1, 1);
        g2d.fillRect(87 + x, 94 + y, 1, 1);
        g2d.fillRect(63 + x, 95 + y, 1, 1);
        g2d.fillRect(80 + x, 96 + y, 1, 1);
        g2d.fillRect(82 + x, 97 + y, 1, 1);
        g2d.fillRect(84 + x, 97 + y, 1, 1);
        g2d.fillRect(62 + x, 98 + y, 1, 2);
        g2d.fillRect(63 + x, 98 + y, 1, 1);
        g2d.fillRect(67 + x, 99 + y, 1, 1);
        g2d.fillRect(64 + x, 101 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 1, 1);
        g2d.fillRect(62 + x, 102 + y, 1, 1);
        g2d.fillRect(64 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(65 + x, 105 + y, 2, 1);
        g2d.fillRect(97 + x, 106 + y, 1, 2);
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 2);
        g2d.fillRect(97 + x, 110 + y, 1, 1);
        g2d.fillRect(98 + x, 112 + y, 1, 1);
        g2d.fillRect(112 + x, 112 + y, 1, 1);
        g2d.fillRect(111 + x, 115 + y, 1, 1);
        g2d.fillRect(99 + x, 119 + y, 1, 2);
        g2d.fillRect(98 + x, 120 + y, 1, 4);
        g2d.fillRect(99 + x, 126 + y, 1, 1);
        g2d.fillRect(109 + x, 126 + y, 1, 1);
        g2d.fillRect(100 + x, 127 + y, 1, 1);
        g2d.fillRect(101 + x, 144 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189,116,61,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(82 + x, 84 + y, 1, 1);
        g2d.fillRect(78 + x, 85 + y, 1, 1);
        g2d.fillRect(80 + x, 85 + y, 1, 1);
        g2d.fillRect(83 + x, 85 + y, 1, 2);
        g2d.fillRect(85 + x, 85 + y, 1, 2);
        g2d.fillRect(76 + x, 86 + y, 2, 1);
        g2d.fillRect(81 + x, 86 + y, 1, 1);
        g2d.fillRect(84 + x, 86 + y, 1, 1);
        g2d.fillRect(86 + x, 86 + y, 1, 3);
        g2d.fillRect(90 + x, 86 + y, 1, 1);
        g2d.fillRect(82 + x, 87 + y, 1, 1);
        g2d.fillRect(89 + x, 87 + y, 1, 1);
        g2d.fillRect(79 + x, 88 + y, 1, 1);
        g2d.fillRect(83 + x, 88 + y, 1, 2);
        g2d.fillRect(87 + x, 88 + y, 1, 1);
        g2d.fillRect(82 + x, 89 + y, 1, 1);
        g2d.fillRect(85 + x, 89 + y, 1, 1);
        g2d.fillRect(81 + x, 90 + y, 1, 1);
        g2d.fillRect(84 + x, 90 + y, 1, 1);
        g2d.fillRect(86 + x, 90 + y, 1, 3);
        g2d.fillRect(89 + x, 90 + y, 1, 2);
        g2d.fillRect(63 + x, 91 + y, 1, 1);
        g2d.fillRect(80 + x, 91 + y, 1, 2);
        g2d.fillRect(81 + x, 92 + y, 1, 1);
        g2d.fillRect(83 + x, 92 + y, 1, 1);
        g2d.fillRect(79 + x, 93 + y, 1, 1);
        g2d.fillRect(82 + x, 93 + y, 1, 1);
        g2d.fillRect(84 + x, 93 + y, 1, 1);
        g2d.fillRect(63 + x, 94 + y, 1, 1);
        g2d.fillRect(80 + x, 94 + y, 2, 1);
        g2d.fillRect(79 + x, 95 + y, 1, 1);
        g2d.fillRect(82 + x, 95 + y, 1, 2);
        g2d.fillRect(85 + x, 95 + y, 1, 2);
        g2d.fillRect(83 + x, 96 + y, 1, 1);
        g2d.fillRect(86 + x, 96 + y, 1, 1);
        g2d.fillRect(67 + x, 98 + y, 1, 1);
        g2d.fillRect(97 + x, 99 + y, 1, 1);
        g2d.fillRect(64 + x, 100 + y, 1, 1);
        g2d.fillRect(98 + x, 100 + y, 1, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 2);
        g2d.fillRect(62 + x, 101 + y, 1, 1);
        g2d.fillRect(96 + x, 101 + y, 1, 2);
        g2d.fillRect(100 + x, 101 + y, 1, 1);
        g2d.fillRect(64 + x, 102 + y, 1, 1);
        g2d.fillRect(67 + x, 102 + y, 1, 1);
        g2d.fillRect(64 + x, 104 + y, 1, 1);
        g2d.fillRect(97 + x, 104 + y, 1, 2);
        g2d.fillRect(98 + x, 104 + y, 1, 1);
        g2d.fillRect(116 + x, 107 + y, 1, 1);
        g2d.fillRect(97 + x, 109 + y, 1, 1);
        g2d.fillRect(111 + x, 116 + y, 1, 1);
        g2d.fillRect(110 + x, 119 + y, 1, 1);
        g2d.fillRect(109 + x, 120 + y, 1, 1);
        g2d.fillRect(98 + x, 124 + y, 1, 2);
        g2d.fillRect(102 + x, 145 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(186,118,67,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(64 + x, 94 + y, 1, 2);
        g2d.fillRect(64 + x, 97 + y, 1, 2);
        g2d.fillRect(65 + x, 97 + y, 2, 1);
        g2d.fillRect(66 + x, 100 + y, 1, 2);
        g2d.fillRect(65 + x, 101 + y, 1, 1);
        g2d.fillRect(66 + x, 104 + y, 1, 1);
        g2d.fillRect(63 + x, 114 + y, 1, 2);
        g2d.fillRect(62 + x, 115 + y, 1, 1);
        g2d.fillRect(99 + x, 124 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(210,130,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(62 + x, 71 + y, 1, 1);
        g2d.fillRect(61 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(192,119,62,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(81 + x, 83 + y, 1, 3);
        g2d.fillRect(84 + x, 85 + y, 1, 1);
        g2d.fillRect(78 + x, 86 + y, 1, 1);
        g2d.fillRect(83 + x, 87 + y, 1, 1);
        g2d.fillRect(87 + x, 87 + y, 1, 1);
        g2d.fillRect(90 + x, 87 + y, 1, 3);
        g2d.fillRect(84 + x, 88 + y, 1, 2);
        g2d.fillRect(88 + x, 88 + y, 2, 1);
        g2d.fillRect(91 + x, 88 + y, 1, 1);
        g2d.fillRect(86 + x, 89 + y, 1, 1);
        g2d.fillRect(89 + x, 89 + y, 1, 1);
        g2d.fillRect(78 + x, 91 + y, 1, 1);
        g2d.fillRect(81 + x, 91 + y, 4, 1);
        g2d.fillRect(87 + x, 91 + y, 1, 3);
        g2d.fillRect(88 + x, 91 + y, 1, 1);
        g2d.fillRect(79 + x, 92 + y, 1, 1);
        g2d.fillRect(82 + x, 92 + y, 1, 1);
        g2d.fillRect(84 + x, 92 + y, 1, 1);
        g2d.fillRect(85 + x, 93 + y, 1, 2);
        g2d.fillRect(86 + x, 93 + y, 1, 3);
        g2d.fillRect(79 + x, 94 + y, 1, 1);
        g2d.fillRect(82 + x, 94 + y, 1, 1);
        g2d.fillRect(83 + x, 95 + y, 1, 1);
        g2d.fillRect(85 + x, 97 + y, 1, 1);
        g2d.fillRect(64 + x, 99 + y, 1, 1);
        g2d.fillRect(98 + x, 99 + y, 1, 1);
        g2d.fillRect(97 + x, 100 + y, 1, 4);
        g2d.fillRect(98 + x, 102 + y, 1, 2);
        g2d.fillRect(99 + x, 122 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132,127,123,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(68 + x, 134 + y, 2, 1);
        g2d.fillRect(70 + x, 135 + y, 1, 1);
        g2d.fillRect(68 + x, 136 + y, 1, 3);
        g2d.fillRect(69 + x, 136 + y, 1, 2);
        g2d.fillRect(71 + x, 138 + y, 2, 1);
        g2d.fillRect(72 + x, 139 + y, 1, 1);
        g2d.fillRect(69 + x, 140 + y, 1, 2);
        g2d.fillRect(104 + x, 150 + y, 1, 1);
        g2d.fillRect(108 + x, 151 + y, 1, 1);
        g2d.fillRect(109 + x, 152 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(214,138,35,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(64 + x, 69 + y, 2, 1);
        g2d.fillRect(63 + x, 70 + y, 1, 1);
        g2d.fillRect(61 + x, 72 + y, 2, 1);
        g2d.fillRect(62 + x, 73 + y, 1, 1);
        g2d.fillRect(59 + x, 75 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193,124,71,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(64 + x, 91 + y, 1, 3);
        g2d.fillRect(65 + x, 91 + y, 1, 2);
        g2d.fillRect(65 + x, 98 + y, 1, 3);
        g2d.fillRect(66 + x, 98 + y, 1, 2);
        g2d.fillRect(65 + x, 102 + y, 1, 3);
        g2d.fillRect(66 + x, 102 + y, 1, 2);
        g2d.fillRect(99 + x, 125 + y, 2, 1);
        g2d.fillRect(100 + x, 126 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(138,135,133,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(70 + x, 136 + y, 1, 2);
        g2d.fillRect(69 + x, 138 + y, 1, 1);
        g2d.fillRect(71 + x, 139 + y, 1, 1);
        g2d.fillRect(72 + x, 140 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220,151,40,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(62 + x, 70 + y, 1, 1);
        g2d.fillRect(64 + x, 70 + y, 1, 1);
        g2d.fillRect(63 + x, 71 + y, 1, 1);
        g2d.fillRect(60 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,141,139,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(70 + x, 138 + y, 1, 1);
        g2d.fillRect(69 + x, 139 + y, 1, 1);
        g2d.fillRect(70 + x, 140 + y, 1, 2);
        g2d.fillRect(71 + x, 140 + y, 1, 1);
        g2d.fillRect(72 + x, 141 + y, 1, 1);
        g2d.fillRect(103 + x, 147 + y, 1, 1);
        g2d.fillRect(106 + x, 148 + y, 1, 1);
        g2d.fillRect(104 + x, 149 + y, 1, 1);
        g2d.fillRect(107 + x, 150 + y, 1, 1);
        g2d.fillRect(105 + x, 151 + y, 1, 1);
        g2d.fillRect(108 + x, 152 + y, 1, 1);
        g2d.fillRect(109 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224,161,47,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(65 + x, 70 + y, 3, 1);
        g2d.fillRect(61 + x, 71 + y, 1, 1);
        g2d.fillRect(63 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(150,148,146,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(70 + x, 139 + y, 1, 1);
        g2d.fillRect(71 + x, 141 + y, 1, 1);
        g2d.fillRect(103 + x, 146 + y, 2, 1);
        g2d.fillRect(104 + x, 147 + y, 1, 2);
        g2d.fillRect(105 + x, 147 + y, 1, 4);
        g2d.fillRect(106 + x, 149 + y, 1, 5);
        g2d.fillRect(107 + x, 151 + y, 1, 3);
        g2d.fillRect(105 + x, 152 + y, 1, 2);
        g2d.fillRect(108 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230,174,58,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(62 + x, 69 + y, 1, 1);
        g2d.fillRect(64 + x, 71 + y, 1, 1);
        g2d.fillRect(68 + x, 71 + y, 1, 1);
        g2d.fillRect(63 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232,181,65,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(65 + x, 71 + y, 1, 2);
        g2d.fillRect(66 + x, 71 + y, 2, 1);
        g2d.fillRect(64 + x, 72 + y, 1, 1);
    }





    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44,18,8,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(49 + x, 114 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70,26,10,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(45 + x, 111 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73,34,19,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(53 + x, 93 + y, 1, 10);
        g2d.fillRect(45 + x, 110 + y, 1, 1);
        g2d.fillRect(53 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92,39,15,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(45 + x, 97 + y, 1, 1);
        g2d.fillRect(45 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86,41,21,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(58 + x, 76 + y, 1, 1);
        g2d.fillRect(45 + x, 98 + y, 1, 1);
        g2d.fillRect(53 + x, 103 + y, 1, 2);
        g2d.fillRect(54 + x, 106 + y, 1, 4);
        g2d.fillRect(45 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81,47,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(60 + x, 69 + y, 2, 1);
        g2d.fillRect(61 + x, 70 + y, 1, 1);
        g2d.fillRect(59 + x, 74 + y, 1, 1);
        g2d.fillRect(56 + x, 80 + y, 1, 1);
        g2d.fillRect(53 + x, 92 + y, 1, 1);
        g2d.fillRect(46 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89,50,31,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(57 + x, 69 + y, 1, 1);
        g2d.fillRect(59 + x, 69 + y, 1, 1);
        g2d.fillRect(60 + x, 70 + y, 1, 1);
        g2d.fillRect(60 + x, 72 + y, 1, 1);
        g2d.fillRect(56 + x, 79 + y, 1, 1);
        g2d.fillRect(55 + x, 82 + y, 1, 3);
        g2d.fillRect(46 + x, 106 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96,58,26,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 81 + y, 1, 1);
        g2d.fillRect(55 + x, 85 + y, 1, 1);
        g2d.fillRect(54 + x, 90 + y, 1, 3);
        g2d.fillRect(50 + x, 108 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100,46,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(57 + x, 78 + y, 1, 1);
        g2d.fillRect(53 + x, 90 + y, 1, 2);
        g2d.fillRect(45 + x, 95 + y, 1, 2);
        g2d.fillRect(45 + x, 108 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,61,21,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 86 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101,56,40,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(56 + x, 69 + y, 1, 1);
        g2d.fillRect(59 + x, 70 + y, 1, 1);
        g2d.fillRect(60 + x, 71 + y, 1, 1);
        g2d.fillRect(57 + x, 77 + y, 1, 1);
        g2d.fillRect(55 + x, 79 + y, 1, 3);
        g2d.fillRect(42 + x, 87 + y, 1, 1);
        g2d.fillRect(53 + x, 88 + y, 1, 2);
        g2d.fillRect(45 + x, 91 + y, 1, 1);
        g2d.fillRect(50 + x, 91 + y, 1, 2);
        g2d.fillRect(49 + x, 93 + y, 1, 2);
        g2d.fillRect(45 + x, 94 + y, 1, 1);
        g2d.fillRect(47 + x, 100 + y, 1, 2);
        g2d.fillRect(54 + x, 103 + y, 1, 3);
        g2d.fillRect(53 + x, 105 + y, 1, 2);
        g2d.fillRect(53 + x, 109 + y, 1, 1);
        g2d.fillRect(48 + x, 110 + y, 1, 1);
        g2d.fillRect(54 + x, 110 + y, 1, 1);
        g2d.fillRect(53 + x, 111 + y, 1, 2);
        g2d.fillRect(49 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105,64,32,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 88 + y, 1, 2);
        g2d.fillRect(55 + x, 89 + y, 1, 1);
        g2d.fillRect(54 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111,61,34,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(46 + x, 89 + y, 1, 1);
        g2d.fillRect(49 + x, 92 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103,61,43,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(58 + x, 69 + y, 1, 2);
        g2d.fillRect(42 + x, 84 + y, 1, 2);
        g2d.fillRect(40 + x, 85 + y, 1, 1);
        g2d.fillRect(42 + x, 88 + y, 1, 2);
        g2d.fillRect(45 + x, 90 + y, 2, 1);
        g2d.fillRect(50 + x, 93 + y, 1, 1);
        g2d.fillRect(49 + x, 95 + y, 1, 1);
        g2d.fillRect(41 + x, 96 + y, 1, 1);
        g2d.fillRect(47 + x, 98 + y, 1, 2);
        g2d.fillRect(44 + x, 101 + y, 1, 3);
        g2d.fillRect(49 + x, 104 + y, 1, 1);
        g2d.fillRect(55 + x, 106 + y, 1, 1);
        g2d.fillRect(49 + x, 107 + y, 1, 1);
        g2d.fillRect(55 + x, 108 + y, 1, 2);
        g2d.fillRect(50 + x, 109 + y, 1, 1);
        g2d.fillRect(49 + x, 112 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105,65,44,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 69 + y, 1, 1);
        g2d.fillRect(56 + x, 70 + y, 2, 1);
        g2d.fillRect(43 + x, 78 + y, 1, 1);
        g2d.fillRect(41 + x, 82 + y, 1, 1);
        g2d.fillRect(46 + x, 87 + y, 1, 1);
        g2d.fillRect(45 + x, 88 + y, 1, 2);
        g2d.fillRect(42 + x, 90 + y, 1, 1);
        g2d.fillRect(44 + x, 96 + y, 1, 1);
        g2d.fillRect(48 + x, 99 + y, 1, 4);
        g2d.fillRect(54 + x, 99 + y, 1, 1);
        g2d.fillRect(44 + x, 100 + y, 1, 1);
        g2d.fillRect(54 + x, 101 + y, 1, 2);
        g2d.fillRect(44 + x, 104 + y, 1, 1);
        g2d.fillRect(55 + x, 104 + y, 1, 2);
        g2d.fillRect(49 + x, 106 + y, 1, 1);
        g2d.fillRect(50 + x, 107 + y, 1, 1);
        g2d.fillRect(55 + x, 107 + y, 1, 1);
        g2d.fillRect(47 + x, 108 + y, 1, 1);
        g2d.fillRect(49 + x, 108 + y, 1, 1);
        g2d.fillRect(55 + x, 110 + y, 1, 1);
        g2d.fillRect(49 + x, 111 + y, 1, 1);
        g2d.fillRect(52 + x, 111 + y, 1, 2);
        g2d.fillRect(54 + x, 112 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(116,65,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(48 + x, 97 + y, 1, 2);
        g2d.fillRect(52 + x, 106 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111,61,46,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(58 + x, 75 + y, 1, 1);
        g2d.fillRect(55 + x, 78 + y, 1, 1);
        g2d.fillRect(54 + x, 79 + y, 1, 1);
        g2d.fillRect(42 + x, 86 + y, 1, 1);
        g2d.fillRect(45 + x, 92 + y, 1, 2);
        g2d.fillRect(44 + x, 97 + y, 1, 1);
        g2d.fillRect(52 + x, 102 + y, 1, 2);
        g2d.fillRect(53 + x, 107 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(112,66,44,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(59 + x, 71 + y, 1, 3);
        g2d.fillRect(57 + x, 76 + y, 1, 1);
        g2d.fillRect(44 + x, 77 + y, 1, 1);
        g2d.fillRect(42 + x, 80 + y, 1, 1);
        g2d.fillRect(40 + x, 86 + y, 1, 1);
        g2d.fillRect(54 + x, 87 + y, 1, 1);
        g2d.fillRect(46 + x, 88 + y, 1, 1);
        g2d.fillRect(46 + x, 91 + y, 1, 1);
        g2d.fillRect(49 + x, 91 + y, 1, 1);
        g2d.fillRect(49 + x, 96 + y, 1, 1);
        g2d.fillRect(47 + x, 97 + y, 1, 1);
        g2d.fillRect(52 + x, 100 + y, 1, 2);
        g2d.fillRect(47 + x, 102 + y, 1, 1);
        g2d.fillRect(48 + x, 103 + y, 1, 1);
        g2d.fillRect(52 + x, 104 + y, 1, 2);
        g2d.fillRect(44 + x, 105 + y, 1, 1);
        g2d.fillRect(44 + x, 108 + y, 1, 1);
        g2d.fillRect(50 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,69,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(48 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108,71,48,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 68 + y, 2, 1);
        g2d.fillRect(60 + x, 68 + y, 1, 1);
        g2d.fillRect(45 + x, 72 + y, 1, 1);
        g2d.fillRect(43 + x, 74 + y, 1, 1);
        g2d.fillRect(58 + x, 74 + y, 1, 1);
        g2d.fillRect(46 + x, 86 + y, 1, 1);
        g2d.fillRect(45 + x, 87 + y, 1, 1);
        g2d.fillRect(41 + x, 93 + y, 1, 3);
        g2d.fillRect(54 + x, 96 + y, 1, 1);
        g2d.fillRect(41 + x, 97 + y, 1, 1);
        g2d.fillRect(54 + x, 100 + y, 1, 1);
        g2d.fillRect(45 + x, 105 + y, 2, 1);
        g2d.fillRect(50 + x, 111 + y, 1, 1);
        g2d.fillRect(55 + x, 111 + y, 1, 1);
        g2d.fillRect(52 + x, 113 + y, 3, 1);
        g2d.fillRect(51 + x, 114 + y, 1, 1);
        g2d.fillRect(50 + x, 115 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,69,38,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(49 + x, 99 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,71,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 94 + y, 1, 2);
        g2d.fillRect(49 + x, 97 + y, 1, 1);
        g2d.fillRect(54 + x, 97 + y, 1, 1);
        g2d.fillRect(55 + x, 98 + y, 1, 3);
        g2d.fillRect(52 + x, 108 + y, 1, 1);
        g2d.fillRect(49 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,69,49,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(47 + x, 73 + y, 1, 1);
        g2d.fillRect(56 + x, 77 + y, 1, 1);
        g2d.fillRect(44 + x, 78 + y, 1, 1);
        g2d.fillRect(43 + x, 82 + y, 1, 1);
        g2d.fillRect(41 + x, 83 + y, 1, 1);
        g2d.fillRect(54 + x, 83 + y, 1, 1);
        g2d.fillRect(47 + x, 88 + y, 1, 1);
        g2d.fillRect(50 + x, 90 + y, 1, 1);
        g2d.fillRect(50 + x, 94 + y, 1, 1);
        g2d.fillRect(52 + x, 98 + y, 1, 2);
        g2d.fillRect(44 + x, 99 + y, 1, 1);
        g2d.fillRect(49 + x, 103 + y, 1, 1);
        g2d.fillRect(46 + x, 104 + y, 1, 1);
        g2d.fillRect(48 + x, 104 + y, 1, 1);
        g2d.fillRect(49 + x, 105 + y, 1, 1);
        g2d.fillRect(44 + x, 106 + y, 1, 1);
        g2d.fillRect(48 + x, 108 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128,73,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(48 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,73,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(57 + x, 68 + y, 1, 1);
        g2d.fillRect(54 + x, 69 + y, 1, 1);
        g2d.fillRect(55 + x, 70 + y, 1, 1);
        g2d.fillRect(48 + x, 72 + y, 1, 1);
        g2d.fillRect(41 + x, 84 + y, 1, 2);
        g2d.fillRect(47 + x, 85 + y, 1, 1);
        g2d.fillRect(40 + x, 87 + y, 1, 3);
        g2d.fillRect(52 + x, 97 + y, 1, 1);
        g2d.fillRect(54 + x, 98 + y, 1, 1);
        g2d.fillRect(46 + x, 103 + y, 1, 1);
        g2d.fillRect(45 + x, 104 + y, 1, 1);
        g2d.fillRect(48 + x, 105 + y, 1, 3);
        g2d.fillRect(44 + x, 107 + y, 1, 1);
        g2d.fillRect(47 + x, 107 + y, 1, 1);
        g2d.fillRect(51 + x, 109 + y, 1, 1);
        g2d.fillRect(49 + x, 110 + y, 1, 1);
        g2d.fillRect(50 + x, 112 + y, 1, 1);
        g2d.fillRect(51 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,75,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(45 + x, 82 + y, 1, 1);
        g2d.fillRect(48 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(122,72,50,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(56 + x, 78 + y, 1, 1);
        g2d.fillRect(44 + x, 79 + y, 1, 1);
        g2d.fillRect(45 + x, 80 + y, 1, 2);
        g2d.fillRect(53 + x, 80 + y, 1, 2);
        g2d.fillRect(42 + x, 81 + y, 1, 1);
        g2d.fillRect(43 + x, 83 + y, 1, 1);
        g2d.fillRect(47 + x, 89 + y, 1, 1);
        g2d.fillRect(46 + x, 92 + y, 1, 1);
        g2d.fillRect(46 + x, 97 + y, 1, 2);
        g2d.fillRect(49 + x, 98 + y, 1, 1);
        g2d.fillRect(51 + x, 102 + y, 1, 2);
        g2d.fillRect(52 + x, 109 + y, 1, 1);
        g2d.fillRect(44 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,75,52,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(46 + x, 74 + y, 1, 1);
        g2d.fillRect(56 + x, 75 + y, 1, 1);
        g2d.fillRect(43 + x, 79 + y, 1, 1);
        g2d.fillRect(54 + x, 84 + y, 1, 1);
        g2d.fillRect(44 + x, 86 + y, 1, 1);
        g2d.fillRect(54 + x, 86 + y, 1, 1);
        g2d.fillRect(41 + x, 88 + y, 1, 1);
        g2d.fillRect(52 + x, 93 + y, 1, 2);
        g2d.fillRect(47 + x, 96 + y, 1, 1);
        g2d.fillRect(52 + x, 96 + y, 1, 1);
        g2d.fillRect(44 + x, 98 + y, 1, 1);
        g2d.fillRect(46 + x, 99 + y, 1, 1);
        g2d.fillRect(42 + x, 100 + y, 1, 1);
        g2d.fillRect(43 + x, 101 + y, 1, 2);
        g2d.fillRect(47 + x, 103 + y, 1, 4);
        g2d.fillRect(44 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,83,43,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(58 + x, 71 + y, 1, 1);
        g2d.fillRect(57 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,78,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 68 + y, 1, 1);
        g2d.fillRect(58 + x, 68 + y, 2, 1);
        g2d.fillRect(51 + x, 69 + y, 3, 1);
        g2d.fillRect(47 + x, 71 + y, 3, 1);
        g2d.fillRect(44 + x, 73 + y, 1, 1);
        g2d.fillRect(45 + x, 75 + y, 1, 1);
        g2d.fillRect(42 + x, 79 + y, 1, 1);
        g2d.fillRect(45 + x, 84 + y, 1, 3);
        g2d.fillRect(46 + x, 84 + y, 1, 2);
        g2d.fillRect(47 + x, 84 + y, 1, 1);
        g2d.fillRect(54 + x, 85 + y, 1, 1);
        g2d.fillRect(42 + x, 91 + y, 1, 1);
        g2d.fillRect(41 + x, 92 + y, 1, 1);
        g2d.fillRect(52 + x, 95 + y, 1, 1);
        g2d.fillRect(42 + x, 97 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,78,51,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(57 + x, 75 + y, 1, 1);
        g2d.fillRect(44 + x, 76 + y, 1, 1);
        g2d.fillRect(45 + x, 78 + y, 1, 2);
        g2d.fillRect(44 + x, 80 + y, 1, 1);
        g2d.fillRect(46 + x, 80 + y, 1, 1);
        g2d.fillRect(49 + x, 90 + y, 1, 1);
        g2d.fillRect(52 + x, 92 + y, 1, 1);
        g2d.fillRect(42 + x, 99 + y, 1, 1);
        g2d.fillRect(43 + x, 100 + y, 1, 1);
        g2d.fillRect(51 + x, 101 + y, 1, 1);
        g2d.fillRect(43 + x, 103 + y, 1, 2);
        g2d.fillRect(43 + x, 107 + y, 1, 1);
        g2d.fillRect(51 + x, 108 + y, 1, 1);
        g2d.fillRect(47 + x, 109 + y, 1, 1);
        g2d.fillRect(48 + x, 111 + y, 1, 1);
        g2d.fillRect(50 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,75,57,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(46 + x, 73 + y, 1, 1);
        g2d.fillRect(45 + x, 77 + y, 1, 1);
        g2d.fillRect(46 + x, 79 + y, 1, 1);
        g2d.fillRect(54 + x, 80 + y, 1, 3);
        g2d.fillRect(44 + x, 81 + y, 1, 5);
        g2d.fillRect(53 + x, 82 + y, 1, 1);
        g2d.fillRect(43 + x, 84 + y, 1, 4);
        g2d.fillRect(41 + x, 86 + y, 1, 2);
        g2d.fillRect(53 + x, 87 + y, 1, 1);
        g2d.fillRect(41 + x, 89 + y, 1, 1);
        g2d.fillRect(46 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(133,81,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(48 + x, 93 + y, 1, 1);
        g2d.fillRect(51 + x, 105 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,81,59,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 68 + y, 2, 1);
        g2d.fillRect(52 + x, 70 + y, 1, 1);
        g2d.fillRect(58 + x, 72 + y, 1, 1);
        g2d.fillRect(45 + x, 76 + y, 1, 1);
        g2d.fillRect(49 + x, 80 + y, 1, 1);
        g2d.fillRect(43 + x, 81 + y, 1, 1);
        g2d.fillRect(48 + x, 81 + y, 1, 1);
        g2d.fillRect(45 + x, 83 + y, 1, 1);
        g2d.fillRect(44 + x, 87 + y, 1, 1);
        g2d.fillRect(41 + x, 90 + y, 1, 2);
        g2d.fillRect(42 + x, 92 + y, 1, 1);
        g2d.fillRect(46 + x, 96 + y, 1, 1);
        g2d.fillRect(43 + x, 97 + y, 1, 2);
        g2d.fillRect(45 + x, 103 + y, 1, 1);
        g2d.fillRect(50 + x, 106 + y, 1, 1);
        g2d.fillRect(50 + x, 114 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,81,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(46 + x, 78 + y, 1, 1);
        g2d.fillRect(48 + x, 84 + y, 1, 1);
        g2d.fillRect(47 + x, 87 + y, 1, 1);
        g2d.fillRect(47 + x, 90 + y, 1, 1);
        g2d.fillRect(46 + x, 94 + y, 1, 1);
        g2d.fillRect(46 + x, 100 + y, 1, 1);
        g2d.fillRect(46 + x, 102 + y, 1, 1);
        g2d.fillRect(51 + x, 104 + y, 1, 1);
        g2d.fillRect(43 + x, 105 + y, 1, 2);
        g2d.fillRect(51 + x, 107 + y, 1, 1);
        g2d.fillRect(43 + x, 108 + y, 1, 1);
        g2d.fillRect(51 + x, 110 + y, 2, 1);
        g2d.fillRect(54 + x, 111 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,84,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(48 + x, 83 + y, 1, 1);
        g2d.fillRect(51 + x, 111 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,78,65,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(54 + x, 78 + y, 1, 1);
        g2d.fillRect(52 + x, 84 + y, 1, 1);
        g2d.fillRect(48 + x, 87 + y, 1, 1);
        g2d.fillRect(43 + x, 88 + y, 1, 1);
        g2d.fillRect(50 + x, 89 + y, 1, 1);
        g2d.fillRect(44 + x, 95 + y, 1, 1);
        g2d.fillRect(44 + x, 111 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129,83,61,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(47 + x, 72 + y, 1, 1);
        g2d.fillRect(48 + x, 73 + y, 1, 1);
        g2d.fillRect(58 + x, 73 + y, 1, 1);
        g2d.fillRect(45 + x, 74 + y, 1, 1);
        g2d.fillRect(44 + x, 75 + y, 1, 1);
        g2d.fillRect(56 + x, 76 + y, 1, 1);
        g2d.fillRect(43 + x, 77 + y, 1, 1);
        g2d.fillRect(43 + x, 80 + y, 1, 1);
        g2d.fillRect(48 + x, 80 + y, 1, 1);
        g2d.fillRect(46 + x, 81 + y, 1, 1);
        g2d.fillRect(42 + x, 82 + y, 1, 2);
        g2d.fillRect(53 + x, 83 + y, 1, 1);
        g2d.fillRect(48 + x, 86 + y, 1, 1);
        g2d.fillRect(44 + x, 88 + y, 1, 1);
        g2d.fillRect(48 + x, 88 + y, 1, 1);
        g2d.fillRect(51 + x, 89 + y, 1, 1);
        g2d.fillRect(51 + x, 92 + y, 1, 2);
        g2d.fillRect(46 + x, 95 + y, 1, 1);
        g2d.fillRect(50 + x, 95 + y, 1, 1);
        g2d.fillRect(43 + x, 99 + y, 1, 1);
        g2d.fillRect(51 + x, 99 + y, 1, 2);
        g2d.fillRect(45 + x, 100 + y, 1, 1);
        g2d.fillRect(46 + x, 101 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,88,61,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(51 + x, 70 + y, 1, 1);
        g2d.fillRect(46 + x, 72 + y, 1, 1);
        g2d.fillRect(44 + x, 74 + y, 1, 1);
        g2d.fillRect(43 + x, 76 + y, 1, 1);
        g2d.fillRect(42 + x, 78 + y, 1, 1);
        g2d.fillRect(48 + x, 85 + y, 1, 1);
        g2d.fillRect(48 + x, 89 + y, 1, 1);
        g2d.fillRect(47 + x, 91 + y, 1, 2);
        g2d.fillRect(52 + x, 91 + y, 1, 1);
        g2d.fillRect(42 + x, 96 + y, 1, 1);
        g2d.fillRect(51 + x, 98 + y, 1, 1);
        g2d.fillRect(45 + x, 102 + y, 1, 1);
        g2d.fillRect(51 + x, 106 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,88,57,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 71 + y, 2, 1);
        g2d.fillRect(45 + x, 73 + y, 1, 1);
        g2d.fillRect(55 + x, 75 + y, 1, 1);
        g2d.fillRect(47 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142,89,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(49 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(133,88,70,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(53 + x, 70 + y, 2, 1);
        g2d.fillRect(50 + x, 71 + y, 1, 1);
        g2d.fillRect(49 + x, 72 + y, 1, 1);
        g2d.fillRect(47 + x, 78 + y, 1, 1);
        g2d.fillRect(50 + x, 78 + y, 2, 1);
        g2d.fillRect(49 + x, 79 + y, 1, 1);
        g2d.fillRect(53 + x, 79 + y, 1, 1);
        g2d.fillRect(47 + x, 81 + y, 1, 1);
        g2d.fillRect(52 + x, 82 + y, 1, 2);
        g2d.fillRect(53 + x, 84 + y, 1, 1);
        g2d.fillRect(52 + x, 85 + y, 1, 1);
        g2d.fillRect(51 + x, 87 + y, 1, 2);
        g2d.fillRect(50 + x, 88 + y, 1, 1);
        g2d.fillRect(44 + x, 89 + y, 1, 1);
        g2d.fillRect(48 + x, 90 + y, 1, 1);
        g2d.fillRect(51 + x, 90 + y, 1, 2);
        g2d.fillRect(47 + x, 95 + y, 1, 1);
        g2d.fillRect(50 + x, 96 + y, 1, 3);
        g2d.fillRect(51 + x, 96 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142,93,60,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(49 + x, 70 + y, 1, 1);
        g2d.fillRect(57 + x, 72 + y, 1, 1);
        g2d.fillRect(56 + x, 74 + y, 1, 1);
        g2d.fillRect(49 + x, 83 + y, 1, 1);
        g2d.fillRect(48 + x, 91 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(138,94,74,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(50 + x, 70 + y, 1, 1);
        g2d.fillRect(55 + x, 71 + y, 1, 1);
        g2d.fillRect(46 + x, 75 + y, 1, 1);
        g2d.fillRect(47 + x, 77 + y, 1, 1);
        g2d.fillRect(50 + x, 79 + y, 1, 1);
        g2d.fillRect(47 + x, 80 + y, 1, 1);
        g2d.fillRect(52 + x, 81 + y, 1, 1);
        g2d.fillRect(46 + x, 82 + y, 1, 2);
        g2d.fillRect(50 + x, 83 + y, 1, 2);
        g2d.fillRect(51 + x, 83 + y, 1, 1);
        g2d.fillRect(49 + x, 84 + y, 1, 4);
        g2d.fillRect(51 + x, 86 + y, 2, 1);
        g2d.fillRect(50 + x, 87 + y, 1, 1);
        g2d.fillRect(43 + x, 89 + y, 1, 1);
        g2d.fillRect(43 + x, 96 + y, 1, 1);
        g2d.fillRect(50 + x, 99 + y, 1, 1);
        g2d.fillRect(50 + x, 105 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,99,66,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 76 + y, 1, 1);
        g2d.fillRect(42 + x, 77 + y, 1, 1);
        g2d.fillRect(46 + x, 77 + y, 1, 1);
        g2d.fillRect(49 + x, 82 + y, 1, 1);
        g2d.fillRect(53 + x, 86 + y, 1, 1);
        g2d.fillRect(47 + x, 93 + y, 1, 2);
        g2d.fillRect(45 + x, 101 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,98,76,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(47 + x, 74 + y, 1, 1);
        g2d.fillRect(55 + x, 77 + y, 1, 1);
        g2d.fillRect(47 + x, 79 + y, 1, 1);
        g2d.fillRect(50 + x, 85 + y, 1, 1);
        g2d.fillRect(52 + x, 87 + y, 1, 1);
        g2d.fillRect(49 + x, 88 + y, 1, 2);
        g2d.fillRect(44 + x, 91 + y, 1, 1);
        g2d.fillRect(51 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140,100,81,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(51 + x, 71 + y, 1, 1);
        g2d.fillRect(47 + x, 82 + y, 1, 2);
        g2d.fillRect(48 + x, 82 + y, 1, 1);
        g2d.fillRect(51 + x, 82 + y, 1, 1);
        g2d.fillRect(51 + x, 84 + y, 1, 2);
        g2d.fillRect(50 + x, 86 + y, 1, 1);
        g2d.fillRect(43 + x, 90 + y, 2, 1);
        g2d.fillRect(42 + x, 93 + y, 1, 1);
        g2d.fillRect(51 + x, 95 + y, 1, 1);
        g2d.fillRect(50 + x, 103 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(147,104,77,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 71 + y, 1, 1);
        g2d.fillRect(55 + x, 72 + y, 2, 1);
        g2d.fillRect(57 + x, 73 + y, 1, 1);
        g2d.fillRect(53 + x, 85 + y, 1, 1);
        g2d.fillRect(50 + x, 100 + y, 1, 2);
        g2d.fillRect(50 + x, 104 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(154,107,73,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 88 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(149,108,86,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 71 + y, 2, 1);
        g2d.fillRect(53 + x, 73 + y, 2, 1);
        g2d.fillRect(48 + x, 79 + y, 1, 1);
        g2d.fillRect(50 + x, 80 + y, 1, 1);
        g2d.fillRect(52 + x, 80 + y, 1, 1);
        g2d.fillRect(50 + x, 82 + y, 1, 1);
        g2d.fillRect(43 + x, 91 + y, 1, 1);
        g2d.fillRect(44 + x, 92 + y, 1, 3);
        g2d.fillRect(42 + x, 94 + y, 1, 2);
        g2d.fillRect(50 + x, 102 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158,113,78,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 72 + y, 1, 1);
        g2d.fillRect(48 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(157,115,92,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(50 + x, 72 + y, 1, 1);
        g2d.fillRect(53 + x, 72 + y, 1, 1);
        g2d.fillRect(55 + x, 73 + y, 1, 2);
        g2d.fillRect(56 + x, 73 + y, 1, 1);
        g2d.fillRect(53 + x, 74 + y, 1, 1);
        g2d.fillRect(54 + x, 75 + y, 1, 3);
        g2d.fillRect(46 + x, 76 + y, 3, 1);
        g2d.fillRect(51 + x, 77 + y, 2, 1);
        g2d.fillRect(49 + x, 78 + y, 1, 1);
        g2d.fillRect(52 + x, 78 + y, 1, 2);
        g2d.fillRect(53 + x, 78 + y, 1, 1);
        g2d.fillRect(51 + x, 79 + y, 1, 1);
        g2d.fillRect(43 + x, 92 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,120,84,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(163,123,101,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(51 + x, 72 + y, 1, 1);
        g2d.fillRect(49 + x, 73 + y, 1, 1);
        g2d.fillRect(51 + x, 74 + y, 2, 1);
        g2d.fillRect(54 + x, 74 + y, 1, 1);
        g2d.fillRect(47 + x, 75 + y, 1, 1);
        g2d.fillRect(50 + x, 75 + y, 1, 3);
        g2d.fillRect(53 + x, 76 + y, 1, 2);
        g2d.fillRect(48 + x, 77 + y, 1, 1);
        g2d.fillRect(50 + x, 81 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172,128,90,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 72 + y, 1, 1);
        g2d.fillRect(51 + x, 73 + y, 1, 1);
        g2d.fillRect(49 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174,132,101,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(50 + x, 74 + y, 1, 1);
        g2d.fillRect(48 + x, 75 + y, 1, 1);
        g2d.fillRect(51 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,132,112,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(48 + x, 74 + y, 1, 1);
        g2d.fillRect(51 + x, 75 + y, 3, 1);
        g2d.fillRect(52 + x, 76 + y, 1, 1);
        g2d.fillRect(49 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183,139,104,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(49 + x, 74 + y, 1, 1);
        g2d.fillRect(49 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(175,140,120,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(50 + x, 73 + y, 1, 1);
        g2d.fillRect(51 + x, 76 + y, 1, 1);
    }





    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44,18,8,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 80 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70,26,10,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(17 + x, 84 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73,34,19,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(19 + x, 76 + y, 1, 1);
        g2d.fillRect(27 + x, 76 + y, 10, 1);
        g2d.fillRect(19 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92,39,15,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(30 + x, 84 + y, 1, 1);
        g2d.fillRect(32 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86,41,21,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(53 + x, 71 + y, 1, 1);
        g2d.fillRect(20 + x, 75 + y, 4, 1);
        g2d.fillRect(25 + x, 76 + y, 2, 1);
        g2d.fillRect(20 + x, 84 + y, 1, 1);
        g2d.fillRect(31 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81,47,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(59 + x, 68 + y, 2, 1);
        g2d.fillRect(60 + x, 69 + y, 1, 1);
        g2d.fillRect(55 + x, 70 + y, 1, 1);
        g2d.fillRect(49 + x, 73 + y, 1, 1);
        g2d.fillRect(37 + x, 76 + y, 1, 1);
        g2d.fillRect(22 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89,50,31,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(57 + x, 69 + y, 1, 1);
        g2d.fillRect(59 + x, 69 + y, 1, 1);
        g2d.fillRect(60 + x, 70 + y, 1, 1);
        g2d.fillRect(60 + x, 72 + y, 1, 1);
        g2d.fillRect(50 + x, 73 + y, 1, 1);
        g2d.fillRect(45 + x, 74 + y, 3, 1);
        g2d.fillRect(23 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96,58,26,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(48 + x, 73 + y, 1, 1);
        g2d.fillRect(44 + x, 74 + y, 1, 1);
        g2d.fillRect(37 + x, 75 + y, 3, 1);
        g2d.fillRect(21 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100,46,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(51 + x, 72 + y, 1, 1);
        g2d.fillRect(38 + x, 76 + y, 2, 1);
        g2d.fillRect(21 + x, 84 + y, 1, 1);
        g2d.fillRect(33 + x, 84 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,61,21,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(41 + x, 74 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101,56,40,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(58 + x, 69 + y, 1, 1);
        g2d.fillRect(59 + x, 70 + y, 1, 1);
        g2d.fillRect(52 + x, 72 + y, 1, 1);
        g2d.fillRect(60 + x, 73 + y, 1, 1);
        g2d.fillRect(48 + x, 74 + y, 3, 1);
        g2d.fillRect(19 + x, 75 + y, 1, 1);
        g2d.fillRect(24 + x, 75 + y, 1, 2);
        g2d.fillRect(25 + x, 75 + y, 2, 1);
        g2d.fillRect(17 + x, 76 + y, 2, 1);
        g2d.fillRect(20 + x, 76 + y, 1, 1);
        g2d.fillRect(23 + x, 76 + y, 1, 1);
        g2d.fillRect(40 + x, 76 + y, 2, 1);
        g2d.fillRect(37 + x, 79 + y, 2, 1);
        g2d.fillRect(16 + x, 80 + y, 1, 1);
        g2d.fillRect(35 + x, 80 + y, 2, 1);
        g2d.fillRect(19 + x, 81 + y, 1, 1);
        g2d.fillRect(28 + x, 82 + y, 2, 1);
        g2d.fillRect(35 + x, 84 + y, 1, 1);
        g2d.fillRect(38 + x, 84 + y, 1, 1);
        g2d.fillRect(42 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105,64,32,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(40 + x, 74 + y, 1, 2);
        g2d.fillRect(36 + x, 75 + y, 1, 1);
        g2d.fillRect(41 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111,61,34,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(37 + x, 80 + y, 1, 1);
        g2d.fillRect(40 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103,61,43,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(59 + x, 71 + y, 2, 1);
        g2d.fillRect(20 + x, 74 + y, 2, 1);
        g2d.fillRect(23 + x, 74 + y, 1, 1);
        g2d.fillRect(20 + x, 79 + y, 1, 1);
        g2d.fillRect(36 + x, 79 + y, 1, 1);
        g2d.fillRect(17 + x, 80 + y, 1, 1);
        g2d.fillRect(22 + x, 80 + y, 1, 1);
        g2d.fillRect(25 + x, 80 + y, 1, 1);
        g2d.fillRect(34 + x, 80 + y, 1, 1);
        g2d.fillRect(30 + x, 82 + y, 2, 1);
        g2d.fillRect(39 + x, 83 + y, 1, 2);
        g2d.fillRect(26 + x, 85 + y, 3, 1);
        g2d.fillRect(40 + x, 87 + y, 2, 1);
        g2d.fillRect(44 + x, 87 + y, 2, 1);
        g2d.fillRect(33 + x, 88 + y, 1, 1);
        g2d.fillRect(44 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105,65,44,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(59 + x, 72 + y, 1, 2);
        g2d.fillRect(19 + x, 74 + y, 1, 1);
        g2d.fillRect(22 + x, 74 + y, 1, 1);
        g2d.fillRect(24 + x, 74 + y, 2, 1);
        g2d.fillRect(60 + x, 74 + y, 1, 1);
        g2d.fillRect(17 + x, 75 + y, 1, 1);
        g2d.fillRect(27 + x, 75 + y, 2, 1);
        g2d.fillRect(30 + x, 75 + y, 1, 1);
        g2d.fillRect(17 + x, 77 + y, 2, 1);
        g2d.fillRect(22 + x, 79 + y, 1, 1);
        g2d.fillRect(18 + x, 80 + y, 1, 1);
        g2d.fillRect(21 + x, 80 + y, 1, 1);
        g2d.fillRect(23 + x, 80 + y, 1, 1);
        g2d.fillRect(27 + x, 81 + y, 4, 1);
        g2d.fillRect(21 + x, 82 + y, 1, 1);
        g2d.fillRect(42 + x, 83 + y, 1, 1);
        g2d.fillRect(40 + x, 84 + y, 2, 1);
        g2d.fillRect(25 + x, 85 + y, 1, 1);
        g2d.fillRect(29 + x, 85 + y, 1, 1);
        g2d.fillRect(33 + x, 85 + y, 1, 1);
        g2d.fillRect(51 + x, 86 + y, 1, 1);
        g2d.fillRect(39 + x, 87 + y, 1, 1);
        g2d.fillRect(47 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(116,65,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(22 + x, 77 + y, 2, 1);
        g2d.fillRect(31 + x, 81 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111,61,46,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(54 + x, 71 + y, 1, 1);
        g2d.fillRect(51 + x, 74 + y, 1, 1);
        g2d.fillRect(50 + x, 75 + y, 1, 1);
        g2d.fillRect(21 + x, 76 + y, 2, 1);
        g2d.fillRect(26 + x, 77 + y, 2, 1);
        g2d.fillRect(36 + x, 84 + y, 2, 1);
        g2d.fillRect(32 + x, 85 + y, 1, 1);
        g2d.fillRect(43 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(112,66,44,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(56 + x, 70 + y, 3, 1);
        g2d.fillRect(53 + x, 72 + y, 1, 1);
        g2d.fillRect(42 + x, 75 + y, 1, 1);
        g2d.fillRect(24 + x, 77 + y, 2, 1);
        g2d.fillRect(28 + x, 77 + y, 2, 1);
        g2d.fillRect(19 + x, 79 + y, 1, 1);
        g2d.fillRect(33 + x, 80 + y, 1, 1);
        g2d.fillRect(38 + x, 80 + y, 1, 1);
        g2d.fillRect(26 + x, 81 + y, 1, 1);
        g2d.fillRect(27 + x, 82 + y, 1, 1);
        g2d.fillRect(32 + x, 82 + y, 1, 1);
        g2d.fillRect(38 + x, 83 + y, 1, 1);
        g2d.fillRect(41 + x, 83 + y, 1, 1);
        g2d.fillRect(21 + x, 85 + y, 1, 1);
        g2d.fillRect(24 + x, 85 + y, 1, 1);
        g2d.fillRect(52 + x, 85 + y, 1, 1);
        g2d.fillRect(49 + x, 87 + y, 1, 1);
        g2d.fillRect(43 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,69,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(33 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108,71,48,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(61 + x, 69 + y, 1, 1);
        g2d.fillRect(55 + x, 71 + y, 1, 1);
        g2d.fillRect(18 + x, 74 + y, 1, 1);
        g2d.fillRect(16 + x, 75 + y, 1, 3);
        g2d.fillRect(29 + x, 75 + y, 1, 1);
        g2d.fillRect(33 + x, 75 + y, 1, 1);
        g2d.fillRect(61 + x, 76 + y, 1, 2);
        g2d.fillRect(15 + x, 78 + y, 1, 1);
        g2d.fillRect(14 + x, 79 + y, 1, 1);
        g2d.fillRect(18 + x, 79 + y, 1, 1);
        g2d.fillRect(24 + x, 83 + y, 1, 2);
        g2d.fillRect(43 + x, 83 + y, 1, 1);
        g2d.fillRect(42 + x, 84 + y, 1, 1);
        g2d.fillRect(57 + x, 84 + y, 1, 1);
        g2d.fillRect(55 + x, 86 + y, 1, 1);
        g2d.fillRect(32 + x, 88 + y, 1, 1);
        g2d.fillRect(34 + x, 88 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,69,38,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(27 + x, 80 + y, 4, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,71,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(29 + x, 74 + y, 3, 1);
        g2d.fillRect(32 + x, 75 + y, 1, 1);
        g2d.fillRect(34 + x, 75 + y, 2, 1);
        g2d.fillRect(21 + x, 77 + y, 1, 1);
        g2d.fillRect(20 + x, 80 + y, 1, 1);
        g2d.fillRect(32 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,69,49,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(52 + x, 73 + y, 1, 1);
        g2d.fillRect(46 + x, 75 + y, 1, 1);
        g2d.fillRect(30 + x, 77 + y, 2, 1);
        g2d.fillRect(35 + x, 79 + y, 1, 1);
        g2d.fillRect(39 + x, 79 + y, 1, 1);
        g2d.fillRect(24 + x, 80 + y, 1, 1);
        g2d.fillRect(26 + x, 80 + y, 1, 1);
        g2d.fillRect(20 + x, 81 + y, 2, 1);
        g2d.fillRect(25 + x, 81 + y, 1, 1);
        g2d.fillRect(41 + x, 82 + y, 1, 1);
        g2d.fillRect(56 + x, 82 + y, 1, 1);
        g2d.fillRect(25 + x, 83 + y, 1, 1);
        g2d.fillRect(23 + x, 85 + y, 1, 1);
        g2d.fillRect(30 + x, 85 + y, 1, 1);
        g2d.fillRect(51 + x, 85 + y, 1, 1);
        g2d.fillRect(47 + x, 86 + y, 1, 1);
        g2d.fillRect(46 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128,73,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(34 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,73,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(61 + x, 72 + y, 1, 1);
        g2d.fillRect(59 + x, 74 + y, 1, 1);
        g2d.fillRect(31 + x, 75 + y, 1, 1);
        g2d.fillRect(60 + x, 75 + y, 1, 1);
        g2d.fillRect(32 + x, 77 + y, 1, 1);
        g2d.fillRect(16 + x, 78 + y, 1, 1);
        g2d.fillRect(20 + x, 78 + y, 1, 1);
        g2d.fillRect(17 + x, 79 + y, 1, 1);
        g2d.fillRect(19 + x, 80 + y, 1, 1);
        g2d.fillRect(22 + x, 81 + y, 1, 2);
        g2d.fillRect(23 + x, 81 + y, 2, 1);
        g2d.fillRect(57 + x, 81 + y, 1, 1);
        g2d.fillRect(44 + x, 82 + y, 1, 1);
        g2d.fillRect(26 + x, 83 + y, 1, 1);
        g2d.fillRect(25 + x, 84 + y, 1, 1);
        g2d.fillRect(22 + x, 85 + y, 1, 1);
        g2d.fillRect(44 + x, 88 + y, 2, 1);
        g2d.fillRect(40 + x, 89 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,75,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(35 + x, 81 + y, 1, 1);
        g2d.fillRect(47 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(122,72,50,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(51 + x, 73 + y, 1, 1);
        g2d.fillRect(48 + x, 76 + y, 2, 1);
        g2d.fillRect(20 + x, 77 + y, 1, 1);
        g2d.fillRect(26 + x, 78 + y, 2, 1);
        g2d.fillRect(31 + x, 80 + y, 1, 1);
        g2d.fillRect(40 + x, 82 + y, 1, 1);
        g2d.fillRect(31 + x, 83 + y, 2, 1);
        g2d.fillRect(37 + x, 83 + y, 1, 1);
        g2d.fillRect(48 + x, 84 + y, 2, 1);
        g2d.fillRect(19 + x, 85 + y, 1, 1);
        g2d.fillRect(50 + x, 85 + y, 1, 1);
        g2d.fillRect(46 + x, 86 + y, 1, 1);
        g2d.fillRect(48 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,75,52,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(54 + x, 73 + y, 1, 1);
        g2d.fillRect(43 + x, 75 + y, 1, 1);
        g2d.fillRect(45 + x, 75 + y, 1, 1);
        g2d.fillRect(33 + x, 77 + y, 1, 1);
        g2d.fillRect(35 + x, 77 + y, 2, 1);
        g2d.fillRect(23 + x, 82 + y, 4, 1);
        g2d.fillRect(33 + x, 82 + y, 1, 1);
        g2d.fillRect(30 + x, 83 + y, 1, 1);
        g2d.fillRect(55 + x, 83 + y, 1, 1);
        g2d.fillRect(20 + x, 85 + y, 1, 1);
        g2d.fillRect(31 + x, 85 + y, 1, 1);
        g2d.fillRect(43 + x, 85 + y, 1, 1);
        g2d.fillRect(27 + x, 86 + y, 2, 1);
        g2d.fillRect(50 + x, 86 + y, 1, 1);
        g2d.fillRect(29 + x, 87 + y, 1, 1);
        g2d.fillRect(41 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,83,43,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(58 + x, 71 + y, 1, 1);
        g2d.fillRect(55 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,78,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(61 + x, 70 + y, 1, 2);
        g2d.fillRect(61 + x, 73 + y, 1, 1);
        g2d.fillRect(44 + x, 75 + y, 1, 1);
        g2d.fillRect(60 + x, 76 + y, 1, 3);
        g2d.fillRect(34 + x, 77 + y, 1, 1);
        g2d.fillRect(58 + x, 80 + y, 1, 3);
        g2d.fillRect(45 + x, 82 + y, 1, 3);
        g2d.fillRect(44 + x, 83 + y, 1, 2);
        g2d.fillRect(43 + x, 84 + y, 1, 1);
        g2d.fillRect(54 + x, 84 + y, 1, 1);
        g2d.fillRect(56 + x, 85 + y, 1, 1);
        g2d.fillRect(31 + x, 87 + y, 2, 1);
        g2d.fillRect(38 + x, 87 + y, 1, 1);
        g2d.fillRect(50 + x, 87 + y, 1, 1);
        g2d.fillRect(37 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,78,51,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 72 + y, 1, 1);
        g2d.fillRect(37 + x, 77 + y, 1, 1);
        g2d.fillRect(21 + x, 78 + y, 1, 1);
        g2d.fillRect(28 + x, 78 + y, 1, 1);
        g2d.fillRect(16 + x, 79 + y, 1, 1);
        g2d.fillRect(39 + x, 80 + y, 1, 1);
        g2d.fillRect(18 + x, 81 + y, 1, 1);
        g2d.fillRect(20 + x, 82 + y, 1, 1);
        g2d.fillRect(49 + x, 83 + y, 1, 1);
        g2d.fillRect(50 + x, 84 + y, 2, 1);
        g2d.fillRect(49 + x, 85 + y, 1, 1);
        g2d.fillRect(53 + x, 85 + y, 1, 1);
        g2d.fillRect(22 + x, 86 + y, 1, 1);
        g2d.fillRect(25 + x, 86 + y, 2, 1);
        g2d.fillRect(29 + x, 86 + y, 1, 1);
        g2d.fillRect(30 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,75,57,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(47 + x, 75 + y, 1, 2);
        g2d.fillRect(48 + x, 75 + y, 2, 1);
        g2d.fillRect(42 + x, 76 + y, 1, 1);
        g2d.fillRect(36 + x, 83 + y, 1, 1);
        g2d.fillRect(50 + x, 83 + y, 1, 1);
        g2d.fillRect(56 + x, 83 + y, 1, 1);
        g2d.fillRect(52 + x, 84 + y, 1, 1);
        g2d.fillRect(44 + x, 85 + y, 1, 2);
        g2d.fillRect(45 + x, 85 + y, 1, 2);
        g2d.fillRect(46 + x, 85 + y, 3, 1);
        g2d.fillRect(42 + x, 86 + y, 2, 1);
        g2d.fillRect(40 + x, 88 + y, 1, 1);
        g2d.fillRect(42 + x, 88 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(133,81,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(24 + x, 78 + y, 1, 1);
        g2d.fillRect(36 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,81,59,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(57 + x, 71 + y, 1, 1);
        g2d.fillRect(61 + x, 74 + y, 1, 2);
        g2d.fillRect(59 + x, 77 + y, 1, 1);
        g2d.fillRect(15 + x, 79 + y, 1, 1);
        g2d.fillRect(23 + x, 79 + y, 1, 1);
        g2d.fillRect(49 + x, 80 + y, 1, 1);
        g2d.fillRect(48 + x, 81 + y, 1, 1);
        g2d.fillRect(33 + x, 83 + y, 1, 1);
        g2d.fillRect(26 + x, 84 + y, 1, 1);
        g2d.fillRect(46 + x, 84 + y, 1, 1);
        g2d.fillRect(53 + x, 84 + y, 1, 1);
        g2d.fillRect(42 + x, 85 + y, 1, 1);
        g2d.fillRect(31 + x, 86 + y, 2, 1);
        g2d.fillRect(48 + x, 86 + y, 1, 1);
        g2d.fillRect(37 + x, 87 + y, 1, 1);
        g2d.fillRect(38 + x, 88 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,81,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(18 + x, 75 + y, 1, 1);
        g2d.fillRect(19 + x, 77 + y, 1, 2);
        g2d.fillRect(22 + x, 78 + y, 1, 1);
        g2d.fillRect(25 + x, 78 + y, 1, 1);
        g2d.fillRect(45 + x, 81 + y, 1, 1);
        g2d.fillRect(39 + x, 82 + y, 1, 1);
        g2d.fillRect(42 + x, 82 + y, 1, 1);
        g2d.fillRect(27 + x, 83 + y, 1, 1);
        g2d.fillRect(29 + x, 83 + y, 1, 1);
        g2d.fillRect(35 + x, 83 + y, 1, 1);
        g2d.fillRect(51 + x, 83 + y, 1, 1);
        g2d.fillRect(21 + x, 86 + y, 1, 1);
        g2d.fillRect(23 + x, 86 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,84,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(17 + x, 78 + y, 2, 1);
        g2d.fillRect(46 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,78,65,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(51 + x, 75 + y, 1, 1);
        g2d.fillRect(45 + x, 77 + y, 1, 1);
        g2d.fillRect(40 + x, 79 + y, 1, 1);
        g2d.fillRect(42 + x, 81 + y, 1, 1);
        g2d.fillRect(18 + x, 85 + y, 1, 1);
        g2d.fillRect(34 + x, 85 + y, 1, 1);
        g2d.fillRect(41 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129,83,61,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(56 + x, 71 + y, 1, 1);
        g2d.fillRect(53 + x, 73 + y, 1, 1);
        g2d.fillRect(46 + x, 76 + y, 1, 1);
        g2d.fillRect(29 + x, 78 + y, 2, 1);
        g2d.fillRect(36 + x, 78 + y, 2, 1);
        g2d.fillRect(40 + x, 78 + y, 1, 1);
        g2d.fillRect(34 + x, 79 + y, 1, 1);
        g2d.fillRect(41 + x, 81 + y, 1, 1);
        g2d.fillRect(43 + x, 81 + y, 1, 1);
        g2d.fillRect(49 + x, 81 + y, 1, 1);
        g2d.fillRect(56 + x, 81 + y, 1, 1);
        g2d.fillRect(57 + x, 82 + y, 1, 1);
        g2d.fillRect(28 + x, 83 + y, 1, 1);
        g2d.fillRect(34 + x, 83 + y, 1, 1);
        g2d.fillRect(48 + x, 83 + y, 1, 1);
        g2d.fillRect(29 + x, 84 + y, 1, 1);
        g2d.fillRect(55 + x, 84 + y, 1, 1);
        g2d.fillRect(41 + x, 85 + y, 1, 1);
        g2d.fillRect(54 + x, 85 + y, 1, 1);
        g2d.fillRect(30 + x, 86 + y, 1, 1);
        g2d.fillRect(49 + x, 86 + y, 1, 1);
        g2d.fillRect(52 + x, 86 + y, 1, 1);
        g2d.fillRect(46 + x, 87 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,88,61,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(38 + x, 77 + y, 1, 1);
        g2d.fillRect(23 + x, 78 + y, 1, 1);
        g2d.fillRect(31 + x, 78 + y, 1, 1);
        g2d.fillRect(59 + x, 78 + y, 1, 1);
        g2d.fillRect(40 + x, 81 + y, 1, 1);
        g2d.fillRect(44 + x, 81 + y, 1, 1);
        g2d.fillRect(37 + x, 82 + y, 2, 1);
        g2d.fillRect(57 + x, 83 + y, 1, 1);
        g2d.fillRect(27 + x, 84 + y, 1, 1);
        g2d.fillRect(55 + x, 85 + y, 1, 1);
        g2d.fillRect(53 + x, 86 + y, 1, 1);
        g2d.fillRect(33 + x, 87 + y, 1, 1);
        g2d.fillRect(51 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,88,57,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(58 + x, 72 + y, 1, 2);
        g2d.fillRect(54 + x, 74 + y, 1, 1);
        g2d.fillRect(43 + x, 82 + y, 1, 1);
        g2d.fillRect(56 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142,89,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(48 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(133,88,70,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(59 + x, 75 + y, 1, 2);
        g2d.fillRect(45 + x, 76 + y, 1, 1);
        g2d.fillRect(50 + x, 76 + y, 1, 1);
        g2d.fillRect(44 + x, 77 + y, 1, 1);
        g2d.fillRect(46 + x, 77 + y, 2, 1);
        g2d.fillRect(32 + x, 78 + y, 1, 2);
        g2d.fillRect(33 + x, 78 + y, 1, 2);
        g2d.fillRect(38 + x, 78 + y, 2, 1);
        g2d.fillRect(41 + x, 78 + y, 1, 2);
        g2d.fillRect(42 + x, 78 + y, 1, 1);
        g2d.fillRect(51 + x, 78 + y, 1, 2);
        g2d.fillRect(31 + x, 79 + y, 1, 1);
        g2d.fillRect(58 + x, 79 + y, 1, 1);
        g2d.fillRect(50 + x, 80 + y, 1, 1);
        g2d.fillRect(57 + x, 80 + y, 1, 1);
        g2d.fillRect(39 + x, 81 + y, 1, 1);
        g2d.fillRect(34 + x, 82 + y, 1, 1);
        g2d.fillRect(48 + x, 82 + y, 1, 1);
        g2d.fillRect(51 + x, 82 + y, 1, 1);
        g2d.fillRect(40 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142,93,60,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(57 + x, 72 + y, 1, 1);
        g2d.fillRect(55 + x, 73 + y, 1, 1);
        g2d.fillRect(46 + x, 80 + y, 1, 1);
        g2d.fillRect(59 + x, 80 + y, 1, 1);
        g2d.fillRect(37 + x, 81 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(138,94,74,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(58 + x, 74 + y, 1, 1);
        g2d.fillRect(43 + x, 77 + y, 1, 2);
        g2d.fillRect(48 + x, 77 + y, 1, 1);
        g2d.fillRect(46 + x, 78 + y, 1, 2);
        g2d.fillRect(24 + x, 79 + y, 1, 1);
        g2d.fillRect(30 + x, 79 + y, 1, 1);
        g2d.fillRect(42 + x, 79 + y, 1, 2);
        g2d.fillRect(45 + x, 79 + y, 1, 2);
        g2d.fillRect(50 + x, 79 + y, 1, 1);
        g2d.fillRect(59 + x, 79 + y, 1, 1);
        g2d.fillRect(43 + x, 80 + y, 2, 1);
        g2d.fillRect(49 + x, 82 + y, 1, 1);
        g2d.fillRect(52 + x, 82 + y, 1, 1);
        g2d.fillRect(46 + x, 83 + y, 2, 1);
        g2d.fillRect(54 + x, 83 + y, 1, 1);
        g2d.fillRect(33 + x, 86 + y, 1, 1);
        g2d.fillRect(40 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,99,66,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 74 + y, 1, 1);
        g2d.fillRect(43 + x, 76 + y, 1, 1);
        g2d.fillRect(47 + x, 80 + y, 1, 1);
        g2d.fillRect(35 + x, 82 + y, 2, 1);
        g2d.fillRect(52 + x, 83 + y, 1, 1);
        g2d.fillRect(28 + x, 84 + y, 1, 1);
        g2d.fillRect(52 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,98,76,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(52 + x, 74 + y, 1, 1);
        g2d.fillRect(42 + x, 77 + y, 1, 1);
        g2d.fillRect(35 + x, 78 + y, 1, 1);
        g2d.fillRect(44 + x, 79 + y, 1, 1);
        g2d.fillRect(40 + x, 80 + y, 2, 1);
        g2d.fillRect(50 + x, 82 + y, 1, 1);
        g2d.fillRect(55 + x, 82 + y, 1, 1);
        g2d.fillRect(38 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140,100,81,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(34 + x, 78 + y, 1, 1);
        g2d.fillRect(44 + x, 78 + y, 2, 1);
        g2d.fillRect(47 + x, 78 + y, 1, 1);
        g2d.fillRect(58 + x, 78 + y, 1, 1);
        g2d.fillRect(26 + x, 79 + y, 1, 1);
        g2d.fillRect(43 + x, 79 + y, 1, 1);
        g2d.fillRect(47 + x, 81 + y, 1, 2);
        g2d.fillRect(46 + x, 82 + y, 1, 1);
        g2d.fillRect(39 + x, 85 + y, 1, 2);
        g2d.fillRect(36 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(147,104,77,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 72 + y, 1, 1);
        g2d.fillRect(57 + x, 73 + y, 1, 2);
        g2d.fillRect(58 + x, 75 + y, 1, 1);
        g2d.fillRect(44 + x, 76 + y, 1, 1);
        g2d.fillRect(25 + x, 79 + y, 1, 1);
        g2d.fillRect(28 + x, 79 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(154,107,73,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(39 + x, 77 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(149,108,86,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 75 + y, 1, 2);
        g2d.fillRect(58 + x, 76 + y, 1, 2);
        g2d.fillRect(49 + x, 77 + y, 1, 1);
        g2d.fillRect(27 + x, 79 + y, 1, 1);
        g2d.fillRect(47 + x, 79 + y, 1, 1);
        g2d.fillRect(49 + x, 79 + y, 1, 1);
        g2d.fillRect(50 + x, 81 + y, 1, 1);
        g2d.fillRect(35 + x, 85 + y, 3, 1);
        g2d.fillRect(38 + x, 86 + y, 1, 1);
        g2d.fillRect(34 + x, 87 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158,113,78,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(57 + x, 75 + y, 1, 1);
        g2d.fillRect(51 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(157,115,92,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 73 + y, 1, 2);
        g2d.fillRect(55 + x, 74 + y, 1, 1);
        g2d.fillRect(52 + x, 75 + y, 3, 1);
        g2d.fillRect(51 + x, 76 + y, 1, 2);
        g2d.fillRect(55 + x, 76 + y, 1, 1);
        g2d.fillRect(57 + x, 76 + y, 1, 1);
        g2d.fillRect(50 + x, 77 + y, 1, 2);
        g2d.fillRect(52 + x, 77 + y, 1, 2);
        g2d.fillRect(57 + x, 79 + y, 1, 1);
        g2d.fillRect(51 + x, 80 + y, 1, 1);
        g2d.fillRect(53 + x, 81 + y, 1, 3);
        g2d.fillRect(34 + x, 86 + y, 4, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,120,84,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(163,123,101,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 75 + y, 1, 1);
        g2d.fillRect(52 + x, 76 + y, 2, 1);
        g2d.fillRect(55 + x, 77 + y, 1, 2);
        g2d.fillRect(48 + x, 78 + y, 1, 2);
        g2d.fillRect(57 + x, 78 + y, 1, 1);
        g2d.fillRect(52 + x, 79 + y, 3, 1);
        g2d.fillRect(56 + x, 80 + y, 1, 1);
        g2d.fillRect(52 + x, 81 + y, 1, 1);
        g2d.fillRect(54 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172,128,90,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(57 + x, 77 + y, 1, 1);
        g2d.fillRect(56 + x, 78 + y, 1, 1);
        g2d.fillRect(54 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174,132,101,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(49 + x, 78 + y, 1, 1);
        g2d.fillRect(55 + x, 79 + y, 1, 1);
        g2d.fillRect(54 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,132,112,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 76 + y, 1, 3);
        g2d.fillRect(53 + x, 77 + y, 1, 1);
        g2d.fillRect(52 + x, 80 + y, 1, 1);
        g2d.fillRect(55 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183,139,104,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 80 + y, 1, 1);
        g2d.fillRect(55 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(175,140,120,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 78 + y, 1, 1);
        g2d.fillRect(56 + x, 79 + y, 1, 1);
    }





    public void paintB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44,18,8,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 65 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70,26,10,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(17 + x, 61 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73,34,19,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(19 + x, 61 + y, 1, 1);
        g2d.fillRect(19 + x, 69 + y, 1, 1);
        g2d.fillRect(27 + x, 69 + y, 10, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92,39,15,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(30 + x, 61 + y, 1, 1);
        g2d.fillRect(32 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86,41,21,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(20 + x, 61 + y, 1, 1);
        g2d.fillRect(31 + x, 61 + y, 1, 1);
        g2d.fillRect(25 + x, 69 + y, 2, 1);
        g2d.fillRect(20 + x, 70 + y, 4, 1);
        g2d.fillRect(53 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81,47,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(22 + x, 62 + y, 1, 1);
        g2d.fillRect(37 + x, 69 + y, 1, 1);
        g2d.fillRect(49 + x, 72 + y, 1, 1);
        g2d.fillRect(55 + x, 75 + y, 1, 1);
        g2d.fillRect(60 + x, 76 + y, 1, 2);
        g2d.fillRect(59 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89,50,31,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(23 + x, 62 + y, 1, 1);
        g2d.fillRect(45 + x, 71 + y, 3, 1);
        g2d.fillRect(50 + x, 72 + y, 1, 1);
        g2d.fillRect(60 + x, 73 + y, 1, 1);
        g2d.fillRect(60 + x, 75 + y, 1, 1);
        g2d.fillRect(57 + x, 76 + y, 1, 1);
        g2d.fillRect(59 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96,58,26,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(21 + x, 66 + y, 1, 1);
        g2d.fillRect(37 + x, 70 + y, 3, 1);
        g2d.fillRect(44 + x, 71 + y, 1, 1);
        g2d.fillRect(48 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100,46,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(21 + x, 61 + y, 1, 1);
        g2d.fillRect(33 + x, 61 + y, 2, 1);
        g2d.fillRect(38 + x, 69 + y, 2, 1);
        g2d.fillRect(51 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,61,21,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(41 + x, 71 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101,56,40,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(42 + x, 58 + y, 1, 1);
        g2d.fillRect(35 + x, 61 + y, 1, 1);
        g2d.fillRect(38 + x, 61 + y, 1, 1);
        g2d.fillRect(28 + x, 63 + y, 2, 1);
        g2d.fillRect(19 + x, 64 + y, 1, 1);
        g2d.fillRect(16 + x, 65 + y, 1, 1);
        g2d.fillRect(35 + x, 65 + y, 2, 1);
        g2d.fillRect(37 + x, 66 + y, 2, 1);
        g2d.fillRect(17 + x, 69 + y, 2, 1);
        g2d.fillRect(20 + x, 69 + y, 1, 1);
        g2d.fillRect(23 + x, 69 + y, 2, 1);
        g2d.fillRect(40 + x, 69 + y, 2, 1);
        g2d.fillRect(19 + x, 70 + y, 1, 1);
        g2d.fillRect(24 + x, 70 + y, 3, 1);
        g2d.fillRect(48 + x, 71 + y, 3, 1);
        g2d.fillRect(60 + x, 72 + y, 1, 1);
        g2d.fillRect(52 + x, 73 + y, 1, 1);
        g2d.fillRect(59 + x, 75 + y, 1, 1);
        g2d.fillRect(58 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105,64,32,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(36 + x, 70 + y, 1, 1);
        g2d.fillRect(40 + x, 70 + y, 1, 2);
        g2d.fillRect(41 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111,61,34,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(40 + x, 62 + y, 1, 1);
        g2d.fillRect(37 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103,61,43,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(44 + x, 56 + y, 1, 1);
        g2d.fillRect(33 + x, 57 + y, 1, 1);
        g2d.fillRect(40 + x, 58 + y, 2, 1);
        g2d.fillRect(44 + x, 58 + y, 2, 1);
        g2d.fillRect(26 + x, 60 + y, 3, 1);
        g2d.fillRect(39 + x, 61 + y, 1, 2);
        g2d.fillRect(30 + x, 63 + y, 2, 1);
        g2d.fillRect(17 + x, 65 + y, 1, 1);
        g2d.fillRect(22 + x, 65 + y, 1, 1);
        g2d.fillRect(25 + x, 65 + y, 1, 1);
        g2d.fillRect(34 + x, 65 + y, 1, 1);
        g2d.fillRect(20 + x, 66 + y, 1, 1);
        g2d.fillRect(36 + x, 66 + y, 1, 1);
        g2d.fillRect(20 + x, 71 + y, 2, 1);
        g2d.fillRect(23 + x, 71 + y, 1, 1);
        g2d.fillRect(59 + x, 74 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105,65,44,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(47 + x, 57 + y, 1, 1);
        g2d.fillRect(39 + x, 58 + y, 1, 1);
        g2d.fillRect(51 + x, 59 + y, 1, 1);
        g2d.fillRect(25 + x, 60 + y, 1, 1);
        g2d.fillRect(29 + x, 60 + y, 1, 1);
        g2d.fillRect(33 + x, 60 + y, 1, 1);
        g2d.fillRect(40 + x, 61 + y, 2, 1);
        g2d.fillRect(42 + x, 62 + y, 1, 1);
        g2d.fillRect(21 + x, 63 + y, 1, 1);
        g2d.fillRect(27 + x, 64 + y, 4, 1);
        g2d.fillRect(18 + x, 65 + y, 1, 1);
        g2d.fillRect(21 + x, 65 + y, 1, 1);
        g2d.fillRect(23 + x, 65 + y, 1, 1);
        g2d.fillRect(22 + x, 66 + y, 1, 1);
        g2d.fillRect(17 + x, 68 + y, 2, 1);
        g2d.fillRect(17 + x, 70 + y, 1, 1);
        g2d.fillRect(27 + x, 70 + y, 2, 1);
        g2d.fillRect(30 + x, 70 + y, 1, 1);
        g2d.fillRect(19 + x, 71 + y, 1, 1);
        g2d.fillRect(22 + x, 71 + y, 1, 1);
        g2d.fillRect(24 + x, 71 + y, 2, 1);
        g2d.fillRect(60 + x, 71 + y, 1, 1);
        g2d.fillRect(59 + x, 72 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(116,65,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(31 + x, 64 + y, 2, 1);
        g2d.fillRect(22 + x, 68 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111,61,46,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(43 + x, 58 + y, 1, 1);
        g2d.fillRect(32 + x, 60 + y, 1, 1);
        g2d.fillRect(36 + x, 61 + y, 2, 1);
        g2d.fillRect(26 + x, 68 + y, 2, 1);
        g2d.fillRect(21 + x, 69 + y, 2, 1);
        g2d.fillRect(50 + x, 70 + y, 1, 1);
        g2d.fillRect(51 + x, 71 + y, 1, 1);
        g2d.fillRect(54 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(112,66,44,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(43 + x, 56 + y, 1, 1);
        g2d.fillRect(49 + x, 58 + y, 1, 1);
        g2d.fillRect(21 + x, 60 + y, 1, 1);
        g2d.fillRect(24 + x, 60 + y, 1, 1);
        g2d.fillRect(52 + x, 60 + y, 1, 1);
        g2d.fillRect(38 + x, 62 + y, 1, 1);
        g2d.fillRect(41 + x, 62 + y, 1, 1);
        g2d.fillRect(27 + x, 63 + y, 1, 1);
        g2d.fillRect(32 + x, 63 + y, 1, 1);
        g2d.fillRect(26 + x, 64 + y, 1, 1);
        g2d.fillRect(33 + x, 65 + y, 1, 1);
        g2d.fillRect(38 + x, 65 + y, 1, 1);
        g2d.fillRect(19 + x, 66 + y, 1, 1);
        g2d.fillRect(24 + x, 68 + y, 2, 1);
        g2d.fillRect(28 + x, 68 + y, 2, 1);
        g2d.fillRect(42 + x, 70 + y, 1, 1);
        g2d.fillRect(53 + x, 73 + y, 1, 1);
        g2d.fillRect(56 + x, 75 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,69,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(33 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108,71,48,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(32 + x, 57 + y, 1, 1);
        g2d.fillRect(34 + x, 57 + y, 3, 1);
        g2d.fillRect(55 + x, 59 + y, 1, 1);
        g2d.fillRect(24 + x, 61 + y, 1, 2);
        g2d.fillRect(42 + x, 61 + y, 1, 1);
        g2d.fillRect(57 + x, 61 + y, 1, 1);
        g2d.fillRect(43 + x, 62 + y, 1, 1);
        g2d.fillRect(14 + x, 66 + y, 1, 1);
        g2d.fillRect(18 + x, 66 + y, 1, 1);
        g2d.fillRect(15 + x, 67 + y, 1, 1);
        g2d.fillRect(16 + x, 68 + y, 1, 3);
        g2d.fillRect(61 + x, 68 + y, 1, 2);
        g2d.fillRect(29 + x, 70 + y, 1, 1);
        g2d.fillRect(33 + x, 70 + y, 1, 1);
        g2d.fillRect(18 + x, 71 + y, 1, 1);
        g2d.fillRect(55 + x, 74 + y, 1, 1);
        g2d.fillRect(61 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,69,38,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(27 + x, 65 + y, 4, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,71,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(20 + x, 65 + y, 1, 1);
        g2d.fillRect(32 + x, 65 + y, 1, 1);
        g2d.fillRect(21 + x, 68 + y, 1, 1);
        g2d.fillRect(32 + x, 70 + y, 1, 1);
        g2d.fillRect(34 + x, 70 + y, 2, 1);
        g2d.fillRect(29 + x, 71 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,69,49,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(46 + x, 57 + y, 1, 1);
        g2d.fillRect(47 + x, 59 + y, 1, 1);
        g2d.fillRect(23 + x, 60 + y, 1, 1);
        g2d.fillRect(30 + x, 60 + y, 1, 1);
        g2d.fillRect(51 + x, 60 + y, 1, 1);
        g2d.fillRect(25 + x, 62 + y, 1, 1);
        g2d.fillRect(41 + x, 63 + y, 1, 1);
        g2d.fillRect(56 + x, 63 + y, 1, 1);
        g2d.fillRect(20 + x, 64 + y, 2, 1);
        g2d.fillRect(25 + x, 64 + y, 1, 1);
        g2d.fillRect(24 + x, 65 + y, 1, 1);
        g2d.fillRect(26 + x, 65 + y, 1, 1);
        g2d.fillRect(35 + x, 66 + y, 1, 1);
        g2d.fillRect(39 + x, 66 + y, 1, 1);
        g2d.fillRect(30 + x, 68 + y, 2, 1);
        g2d.fillRect(46 + x, 70 + y, 1, 1);
        g2d.fillRect(52 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128,73,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(34 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,73,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(40 + x, 56 + y, 3, 1);
        g2d.fillRect(44 + x, 57 + y, 2, 1);
        g2d.fillRect(22 + x, 60 + y, 1, 1);
        g2d.fillRect(25 + x, 61 + y, 1, 1);
        g2d.fillRect(26 + x, 62 + y, 1, 1);
        g2d.fillRect(22 + x, 63 + y, 1, 2);
        g2d.fillRect(44 + x, 63 + y, 1, 1);
        g2d.fillRect(23 + x, 64 + y, 2, 1);
        g2d.fillRect(57 + x, 64 + y, 1, 1);
        g2d.fillRect(19 + x, 65 + y, 1, 1);
        g2d.fillRect(17 + x, 66 + y, 1, 1);
        g2d.fillRect(16 + x, 67 + y, 1, 1);
        g2d.fillRect(20 + x, 67 + y, 1, 1);
        g2d.fillRect(32 + x, 68 + y, 1, 1);
        g2d.fillRect(31 + x, 70 + y, 1, 1);
        g2d.fillRect(60 + x, 70 + y, 1, 1);
        g2d.fillRect(59 + x, 71 + y, 1, 1);
        g2d.fillRect(61 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,75,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(47 + x, 61 + y, 1, 1);
        g2d.fillRect(35 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(122,72,50,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(48 + x, 58 + y, 1, 1);
        g2d.fillRect(46 + x, 59 + y, 1, 1);
        g2d.fillRect(19 + x, 60 + y, 1, 1);
        g2d.fillRect(50 + x, 60 + y, 1, 1);
        g2d.fillRect(48 + x, 61 + y, 2, 1);
        g2d.fillRect(31 + x, 62 + y, 2, 1);
        g2d.fillRect(37 + x, 62 + y, 1, 1);
        g2d.fillRect(40 + x, 63 + y, 1, 1);
        g2d.fillRect(31 + x, 65 + y, 1, 1);
        g2d.fillRect(26 + x, 67 + y, 2, 1);
        g2d.fillRect(20 + x, 68 + y, 1, 1);
        g2d.fillRect(48 + x, 69 + y, 2, 1);
        g2d.fillRect(51 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,75,52,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(41 + x, 57 + y, 1, 1);
        g2d.fillRect(29 + x, 58 + y, 1, 1);
        g2d.fillRect(27 + x, 59 + y, 2, 1);
        g2d.fillRect(50 + x, 59 + y, 1, 1);
        g2d.fillRect(20 + x, 60 + y, 1, 1);
        g2d.fillRect(31 + x, 60 + y, 1, 1);
        g2d.fillRect(43 + x, 60 + y, 1, 1);
        g2d.fillRect(30 + x, 62 + y, 1, 1);
        g2d.fillRect(55 + x, 62 + y, 1, 1);
        g2d.fillRect(23 + x, 63 + y, 4, 1);
        g2d.fillRect(33 + x, 63 + y, 1, 1);
        g2d.fillRect(33 + x, 68 + y, 1, 1);
        g2d.fillRect(35 + x, 68 + y, 2, 1);
        g2d.fillRect(43 + x, 70 + y, 1, 1);
        g2d.fillRect(45 + x, 70 + y, 1, 1);
        g2d.fillRect(54 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,83,43,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 73 + y, 1, 1);
        g2d.fillRect(58 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,78,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(37 + x, 57 + y, 1, 1);
        g2d.fillRect(31 + x, 58 + y, 2, 1);
        g2d.fillRect(38 + x, 58 + y, 1, 1);
        g2d.fillRect(50 + x, 58 + y, 1, 1);
        g2d.fillRect(56 + x, 60 + y, 1, 1);
        g2d.fillRect(43 + x, 61 + y, 3, 1);
        g2d.fillRect(54 + x, 61 + y, 1, 1);
        g2d.fillRect(44 + x, 62 + y, 2, 1);
        g2d.fillRect(45 + x, 63 + y, 1, 1);
        g2d.fillRect(58 + x, 63 + y, 1, 3);
        g2d.fillRect(60 + x, 67 + y, 1, 3);
        g2d.fillRect(34 + x, 68 + y, 1, 1);
        g2d.fillRect(44 + x, 70 + y, 1, 1);
        g2d.fillRect(61 + x, 72 + y, 1, 1);
        g2d.fillRect(61 + x, 74 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,78,51,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(30 + x, 58 + y, 1, 1);
        g2d.fillRect(22 + x, 59 + y, 1, 1);
        g2d.fillRect(25 + x, 59 + y, 2, 1);
        g2d.fillRect(29 + x, 59 + y, 1, 1);
        g2d.fillRect(49 + x, 60 + y, 1, 1);
        g2d.fillRect(53 + x, 60 + y, 1, 1);
        g2d.fillRect(50 + x, 61 + y, 2, 1);
        g2d.fillRect(49 + x, 62 + y, 1, 1);
        g2d.fillRect(20 + x, 63 + y, 1, 1);
        g2d.fillRect(18 + x, 64 + y, 1, 1);
        g2d.fillRect(39 + x, 65 + y, 1, 1);
        g2d.fillRect(16 + x, 66 + y, 1, 1);
        g2d.fillRect(21 + x, 67 + y, 1, 1);
        g2d.fillRect(28 + x, 67 + y, 1, 1);
        g2d.fillRect(37 + x, 68 + y, 1, 1);
        g2d.fillRect(54 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,75,57,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(40 + x, 57 + y, 1, 1);
        g2d.fillRect(42 + x, 57 + y, 2, 1);
        g2d.fillRect(42 + x, 59 + y, 4, 1);
        g2d.fillRect(44 + x, 60 + y, 5, 1);
        g2d.fillRect(52 + x, 61 + y, 1, 1);
        g2d.fillRect(36 + x, 62 + y, 1, 1);
        g2d.fillRect(50 + x, 62 + y, 1, 1);
        g2d.fillRect(56 + x, 62 + y, 1, 1);
        g2d.fillRect(42 + x, 69 + y, 1, 1);
        g2d.fillRect(47 + x, 69 + y, 1, 2);
        g2d.fillRect(48 + x, 70 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(133,81,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(36 + x, 64 + y, 1, 1);
        g2d.fillRect(24 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,81,59,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(38 + x, 57 + y, 2, 1);
        g2d.fillRect(37 + x, 58 + y, 1, 1);
        g2d.fillRect(31 + x, 59 + y, 2, 1);
        g2d.fillRect(48 + x, 59 + y, 1, 1);
        g2d.fillRect(42 + x, 60 + y, 1, 1);
        g2d.fillRect(26 + x, 61 + y, 1, 1);
        g2d.fillRect(46 + x, 61 + y, 1, 1);
        g2d.fillRect(53 + x, 61 + y, 1, 1);
        g2d.fillRect(33 + x, 62 + y, 1, 1);
        g2d.fillRect(48 + x, 64 + y, 1, 1);
        g2d.fillRect(49 + x, 65 + y, 1, 1);
        g2d.fillRect(15 + x, 66 + y, 1, 1);
        g2d.fillRect(23 + x, 66 + y, 1, 1);
        g2d.fillRect(59 + x, 68 + y, 1, 1);
        g2d.fillRect(61 + x, 70 + y, 1, 2);
        g2d.fillRect(57 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,81,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(21 + x, 59 + y, 1, 1);
        g2d.fillRect(23 + x, 59 + y, 2, 1);
        g2d.fillRect(27 + x, 62 + y, 1, 1);
        g2d.fillRect(29 + x, 62 + y, 1, 1);
        g2d.fillRect(35 + x, 62 + y, 1, 1);
        g2d.fillRect(51 + x, 62 + y, 1, 1);
        g2d.fillRect(39 + x, 63 + y, 1, 1);
        g2d.fillRect(42 + x, 63 + y, 1, 1);
        g2d.fillRect(45 + x, 64 + y, 1, 1);
        g2d.fillRect(19 + x, 67 + y, 1, 2);
        g2d.fillRect(22 + x, 67 + y, 1, 1);
        g2d.fillRect(25 + x, 67 + y, 1, 1);
        g2d.fillRect(18 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,84,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(46 + x, 64 + y, 1, 1);
        g2d.fillRect(17 + x, 67 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,78,65,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(41 + x, 59 + y, 1, 1);
        g2d.fillRect(18 + x, 60 + y, 1, 1);
        g2d.fillRect(34 + x, 60 + y, 1, 1);
        g2d.fillRect(42 + x, 64 + y, 1, 1);
        g2d.fillRect(40 + x, 66 + y, 1, 1);
        g2d.fillRect(45 + x, 68 + y, 1, 1);
        g2d.fillRect(51 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129,83,61,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(46 + x, 58 + y, 2, 1);
        g2d.fillRect(30 + x, 59 + y, 1, 1);
        g2d.fillRect(49 + x, 59 + y, 1, 1);
        g2d.fillRect(52 + x, 59 + y, 1, 1);
        g2d.fillRect(41 + x, 60 + y, 1, 1);
        g2d.fillRect(54 + x, 60 + y, 1, 1);
        g2d.fillRect(29 + x, 61 + y, 1, 1);
        g2d.fillRect(55 + x, 61 + y, 1, 1);
        g2d.fillRect(28 + x, 62 + y, 1, 1);
        g2d.fillRect(34 + x, 62 + y, 1, 1);
        g2d.fillRect(48 + x, 62 + y, 1, 1);
        g2d.fillRect(57 + x, 63 + y, 1, 1);
        g2d.fillRect(41 + x, 64 + y, 1, 1);
        g2d.fillRect(43 + x, 64 + y, 1, 1);
        g2d.fillRect(49 + x, 64 + y, 1, 1);
        g2d.fillRect(56 + x, 64 + y, 1, 1);
        g2d.fillRect(34 + x, 66 + y, 1, 1);
        g2d.fillRect(29 + x, 67 + y, 2, 1);
        g2d.fillRect(36 + x, 67 + y, 2, 1);
        g2d.fillRect(40 + x, 67 + y, 1, 1);
        g2d.fillRect(46 + x, 69 + y, 1, 1);
        g2d.fillRect(53 + x, 72 + y, 1, 1);
        g2d.fillRect(56 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,88,61,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(33 + x, 58 + y, 1, 1);
        g2d.fillRect(51 + x, 58 + y, 1, 1);
        g2d.fillRect(53 + x, 59 + y, 1, 1);
        g2d.fillRect(55 + x, 60 + y, 1, 1);
        g2d.fillRect(27 + x, 61 + y, 1, 1);
        g2d.fillRect(57 + x, 62 + y, 1, 1);
        g2d.fillRect(37 + x, 63 + y, 2, 1);
        g2d.fillRect(40 + x, 64 + y, 1, 1);
        g2d.fillRect(44 + x, 64 + y, 1, 1);
        g2d.fillRect(23 + x, 67 + y, 1, 1);
        g2d.fillRect(31 + x, 67 + y, 1, 1);
        g2d.fillRect(59 + x, 67 + y, 1, 1);
        g2d.fillRect(38 + x, 68 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,88,57,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 61 + y, 1, 1);
        g2d.fillRect(43 + x, 63 + y, 1, 1);
        g2d.fillRect(54 + x, 71 + y, 1, 1);
        g2d.fillRect(58 + x, 72 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142,89,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(48 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(133,88,70,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(40 + x, 60 + y, 1, 1);
        g2d.fillRect(34 + x, 63 + y, 1, 1);
        g2d.fillRect(48 + x, 63 + y, 1, 1);
        g2d.fillRect(51 + x, 63 + y, 1, 1);
        g2d.fillRect(39 + x, 64 + y, 1, 1);
        g2d.fillRect(50 + x, 65 + y, 1, 1);
        g2d.fillRect(57 + x, 65 + y, 1, 1);
        g2d.fillRect(31 + x, 66 + y, 3, 1);
        g2d.fillRect(41 + x, 66 + y, 1, 2);
        g2d.fillRect(51 + x, 66 + y, 1, 2);
        g2d.fillRect(58 + x, 66 + y, 1, 1);
        g2d.fillRect(32 + x, 67 + y, 2, 1);
        g2d.fillRect(38 + x, 67 + y, 2, 1);
        g2d.fillRect(42 + x, 67 + y, 1, 1);
        g2d.fillRect(44 + x, 68 + y, 1, 1);
        g2d.fillRect(46 + x, 68 + y, 2, 1);
        g2d.fillRect(45 + x, 69 + y, 1, 1);
        g2d.fillRect(50 + x, 69 + y, 1, 1);
        g2d.fillRect(59 + x, 69 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142,93,60,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(37 + x, 64 + y, 2, 1);
        g2d.fillRect(46 + x, 65 + y, 1, 1);
        g2d.fillRect(59 + x, 65 + y, 1, 1);
        g2d.fillRect(55 + x, 72 + y, 1, 1);
        g2d.fillRect(57 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(138,94,74,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(33 + x, 59 + y, 1, 1);
        g2d.fillRect(40 + x, 59 + y, 1, 1);
        g2d.fillRect(46 + x, 62 + y, 2, 1);
        g2d.fillRect(54 + x, 62 + y, 1, 1);
        g2d.fillRect(49 + x, 63 + y, 1, 1);
        g2d.fillRect(52 + x, 63 + y, 1, 1);
        g2d.fillRect(42 + x, 65 + y, 1, 2);
        g2d.fillRect(43 + x, 65 + y, 3, 1);
        g2d.fillRect(24 + x, 66 + y, 1, 1);
        g2d.fillRect(30 + x, 66 + y, 1, 1);
        g2d.fillRect(45 + x, 66 + y, 2, 1);
        g2d.fillRect(50 + x, 66 + y, 1, 1);
        g2d.fillRect(59 + x, 66 + y, 1, 1);
        g2d.fillRect(43 + x, 67 + y, 1, 2);
        g2d.fillRect(46 + x, 67 + y, 1, 1);
        g2d.fillRect(48 + x, 68 + y, 1, 1);
        g2d.fillRect(58 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,99,66,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 58 + y, 1, 1);
        g2d.fillRect(28 + x, 61 + y, 1, 1);
        g2d.fillRect(52 + x, 62 + y, 1, 1);
        g2d.fillRect(35 + x, 63 + y, 2, 1);
        g2d.fillRect(47 + x, 65 + y, 1, 1);
        g2d.fillRect(43 + x, 69 + y, 1, 1);
        g2d.fillRect(53 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,98,76,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(38 + x, 60 + y, 1, 1);
        g2d.fillRect(50 + x, 63 + y, 1, 1);
        g2d.fillRect(55 + x, 63 + y, 1, 1);
        g2d.fillRect(40 + x, 65 + y, 2, 1);
        g2d.fillRect(44 + x, 66 + y, 1, 1);
        g2d.fillRect(35 + x, 67 + y, 1, 1);
        g2d.fillRect(42 + x, 68 + y, 1, 1);
        g2d.fillRect(52 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140,100,81,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(36 + x, 58 + y, 1, 1);
        g2d.fillRect(39 + x, 59 + y, 1, 2);
        g2d.fillRect(46 + x, 63 + y, 2, 1);
        g2d.fillRect(47 + x, 64 + y, 1, 1);
        g2d.fillRect(26 + x, 66 + y, 1, 1);
        g2d.fillRect(43 + x, 66 + y, 1, 1);
        g2d.fillRect(34 + x, 67 + y, 1, 1);
        g2d.fillRect(44 + x, 67 + y, 2, 1);
        g2d.fillRect(47 + x, 67 + y, 1, 1);
        g2d.fillRect(58 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(147,104,77,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(25 + x, 66 + y, 1, 1);
        g2d.fillRect(28 + x, 66 + y, 2, 1);
        g2d.fillRect(44 + x, 69 + y, 1, 1);
        g2d.fillRect(58 + x, 70 + y, 1, 1);
        g2d.fillRect(57 + x, 71 + y, 1, 2);
        g2d.fillRect(56 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(154,107,73,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(39 + x, 68 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(149,108,86,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(34 + x, 58 + y, 2, 1);
        g2d.fillRect(38 + x, 59 + y, 1, 1);
        g2d.fillRect(35 + x, 60 + y, 3, 1);
        g2d.fillRect(50 + x, 64 + y, 1, 1);
        g2d.fillRect(27 + x, 66 + y, 1, 1);
        g2d.fillRect(47 + x, 66 + y, 1, 1);
        g2d.fillRect(49 + x, 66 + y, 1, 1);
        g2d.fillRect(49 + x, 68 + y, 1, 1);
        g2d.fillRect(58 + x, 68 + y, 1, 2);
        g2d.fillRect(56 + x, 69 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158,113,78,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(51 + x, 64 + y, 1, 1);
        g2d.fillRect(57 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(157,115,92,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(34 + x, 59 + y, 4, 1);
        g2d.fillRect(53 + x, 62 + y, 1, 3);
        g2d.fillRect(51 + x, 65 + y, 1, 1);
        g2d.fillRect(57 + x, 66 + y, 1, 1);
        g2d.fillRect(50 + x, 67 + y, 1, 2);
        g2d.fillRect(52 + x, 67 + y, 1, 2);
        g2d.fillRect(51 + x, 68 + y, 1, 2);
        g2d.fillRect(55 + x, 69 + y, 1, 1);
        g2d.fillRect(57 + x, 69 + y, 1, 1);
        g2d.fillRect(52 + x, 70 + y, 3, 1);
        g2d.fillRect(55 + x, 71 + y, 2, 1);
        g2d.fillRect(56 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,120,84,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 68 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(163,123,101,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 63 + y, 1, 1);
        g2d.fillRect(52 + x, 64 + y, 1, 1);
        g2d.fillRect(56 + x, 65 + y, 1, 1);
        g2d.fillRect(48 + x, 66 + y, 1, 2);
        g2d.fillRect(52 + x, 66 + y, 3, 1);
        g2d.fillRect(55 + x, 67 + y, 1, 2);
        g2d.fillRect(57 + x, 67 + y, 1, 1);
        g2d.fillRect(52 + x, 69 + y, 2, 1);
        g2d.fillRect(55 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172,128,90,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 65 + y, 1, 1);
        g2d.fillRect(56 + x, 67 + y, 1, 1);
        g2d.fillRect(57 + x, 68 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174,132,101,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 64 + y, 1, 1);
        g2d.fillRect(55 + x, 66 + y, 1, 1);
        g2d.fillRect(49 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,132,112,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 64 + y, 1, 1);
        g2d.fillRect(52 + x, 65 + y, 1, 1);
        g2d.fillRect(54 + x, 67 + y, 1, 3);
        g2d.fillRect(53 + x, 68 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183,139,104,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 65 + y, 1, 1);
        g2d.fillRect(55 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(175,140,120,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 66 + y, 1, 1);
        g2d.fillRect(53 + x, 67 + y, 1, 1);
    }





    public void paintB4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44,18,8,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(53 + x, 30 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70,26,10,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(49 + x, 33 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73,34,19,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(49 + x, 35 + y, 1, 1);
        g2d.fillRect(57 + x, 35 + y, 1, 1);
        g2d.fillRect(57 + x, 43 + y, 1, 10);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92,39,15,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(49 + x, 46 + y, 1, 1);
        g2d.fillRect(49 + x, 48 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86,41,21,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(49 + x, 36 + y, 1, 1);
        g2d.fillRect(58 + x, 36 + y, 1, 4);
        g2d.fillRect(57 + x, 41 + y, 1, 2);
        g2d.fillRect(49 + x, 47 + y, 1, 1);
        g2d.fillRect(62 + x, 69 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81,47,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(50 + x, 38 + y, 1, 1);
        g2d.fillRect(57 + x, 53 + y, 1, 1);
        g2d.fillRect(60 + x, 65 + y, 1, 1);
        g2d.fillRect(63 + x, 71 + y, 1, 1);
        g2d.fillRect(65 + x, 75 + y, 1, 2);
        g2d.fillRect(64 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89,50,31,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(50 + x, 39 + y, 1, 1);
        g2d.fillRect(59 + x, 61 + y, 1, 3);
        g2d.fillRect(60 + x, 66 + y, 1, 1);
        g2d.fillRect(64 + x, 73 + y, 1, 1);
        g2d.fillRect(64 + x, 75 + y, 1, 1);
        g2d.fillRect(61 + x, 76 + y, 1, 1);
        g2d.fillRect(63 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96,58,26,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 37 + y, 1, 1);
        g2d.fillRect(58 + x, 53 + y, 1, 3);
        g2d.fillRect(59 + x, 60 + y, 1, 1);
        g2d.fillRect(60 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100,46,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(49 + x, 37 + y, 1, 1);
        g2d.fillRect(49 + x, 49 + y, 1, 2);
        g2d.fillRect(57 + x, 54 + y, 1, 2);
        g2d.fillRect(61 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,61,21,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(59 + x, 57 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101,56,40,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(53 + x, 32 + y, 1, 1);
        g2d.fillRect(57 + x, 33 + y, 1, 2);
        g2d.fillRect(52 + x, 35 + y, 1, 1);
        g2d.fillRect(58 + x, 35 + y, 1, 1);
        g2d.fillRect(57 + x, 36 + y, 1, 1);
        g2d.fillRect(57 + x, 39 + y, 1, 2);
        g2d.fillRect(58 + x, 40 + y, 1, 3);
        g2d.fillRect(51 + x, 44 + y, 1, 2);
        g2d.fillRect(49 + x, 51 + y, 1, 1);
        g2d.fillRect(53 + x, 51 + y, 1, 2);
        g2d.fillRect(54 + x, 53 + y, 1, 2);
        g2d.fillRect(49 + x, 54 + y, 1, 1);
        g2d.fillRect(57 + x, 56 + y, 1, 2);
        g2d.fillRect(46 + x, 58 + y, 1, 1);
        g2d.fillRect(59 + x, 64 + y, 1, 3);
        g2d.fillRect(61 + x, 68 + y, 1, 1);
        g2d.fillRect(64 + x, 74 + y, 1, 1);
        g2d.fillRect(63 + x, 75 + y, 1, 1);
        g2d.fillRect(60 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105,64,32,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(58 + x, 52 + y, 1, 1);
        g2d.fillRect(58 + x, 56 + y, 1, 2);
        g2d.fillRect(59 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111,61,34,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 53 + y, 1, 1);
        g2d.fillRect(50 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103,61,43,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(53 + x, 33 + y, 1, 1);
        g2d.fillRect(54 + x, 36 + y, 1, 1);
        g2d.fillRect(59 + x, 36 + y, 1, 2);
        g2d.fillRect(53 + x, 38 + y, 1, 1);
        g2d.fillRect(59 + x, 39 + y, 1, 1);
        g2d.fillRect(53 + x, 41 + y, 1, 1);
        g2d.fillRect(48 + x, 42 + y, 1, 3);
        g2d.fillRect(51 + x, 46 + y, 1, 2);
        g2d.fillRect(45 + x, 49 + y, 1, 1);
        g2d.fillRect(53 + x, 50 + y, 1, 1);
        g2d.fillRect(54 + x, 52 + y, 1, 1);
        g2d.fillRect(49 + x, 55 + y, 2, 1);
        g2d.fillRect(46 + x, 56 + y, 1, 2);
        g2d.fillRect(44 + x, 60 + y, 1, 1);
        g2d.fillRect(46 + x, 60 + y, 1, 2);
        g2d.fillRect(62 + x, 75 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105,65,44,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 33 + y, 1, 2);
        g2d.fillRect(58 + x, 33 + y, 1, 1);
        g2d.fillRect(53 + x, 34 + y, 1, 1);
        g2d.fillRect(59 + x, 35 + y, 1, 1);
        g2d.fillRect(51 + x, 37 + y, 1, 1);
        g2d.fillRect(53 + x, 37 + y, 1, 1);
        g2d.fillRect(54 + x, 38 + y, 1, 1);
        g2d.fillRect(59 + x, 38 + y, 1, 1);
        g2d.fillRect(53 + x, 39 + y, 1, 1);
        g2d.fillRect(59 + x, 40 + y, 1, 2);
        g2d.fillRect(48 + x, 41 + y, 1, 1);
        g2d.fillRect(52 + x, 43 + y, 1, 4);
        g2d.fillRect(58 + x, 43 + y, 1, 2);
        g2d.fillRect(48 + x, 45 + y, 1, 1);
        g2d.fillRect(58 + x, 46 + y, 1, 1);
        g2d.fillRect(48 + x, 49 + y, 1, 1);
        g2d.fillRect(46 + x, 55 + y, 1, 1);
        g2d.fillRect(49 + x, 56 + y, 1, 2);
        g2d.fillRect(50 + x, 58 + y, 1, 1);
        g2d.fillRect(45 + x, 63 + y, 1, 1);
        g2d.fillRect(47 + x, 67 + y, 1, 1);
        g2d.fillRect(60 + x, 75 + y, 2, 1);
        g2d.fillRect(59 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(116,65,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 38 + y, 1, 2);
        g2d.fillRect(52 + x, 47 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111,61,46,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(57 + x, 37 + y, 1, 2);
        g2d.fillRect(56 + x, 42 + y, 1, 2);
        g2d.fillRect(48 + x, 48 + y, 1, 1);
        g2d.fillRect(49 + x, 52 + y, 1, 2);
        g2d.fillRect(46 + x, 59 + y, 1, 1);
        g2d.fillRect(58 + x, 66 + y, 1, 1);
        g2d.fillRect(59 + x, 67 + y, 1, 1);
        g2d.fillRect(62 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(112,66,44,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(54 + x, 35 + y, 1, 1);
        g2d.fillRect(48 + x, 37 + y, 1, 1);
        g2d.fillRect(48 + x, 40 + y, 1, 1);
        g2d.fillRect(56 + x, 40 + y, 1, 2);
        g2d.fillRect(52 + x, 42 + y, 1, 1);
        g2d.fillRect(51 + x, 43 + y, 1, 1);
        g2d.fillRect(56 + x, 44 + y, 1, 2);
        g2d.fillRect(51 + x, 48 + y, 1, 1);
        g2d.fillRect(53 + x, 49 + y, 1, 1);
        g2d.fillRect(50 + x, 54 + y, 1, 1);
        g2d.fillRect(53 + x, 54 + y, 1, 1);
        g2d.fillRect(50 + x, 57 + y, 1, 1);
        g2d.fillRect(58 + x, 58 + y, 1, 1);
        g2d.fillRect(44 + x, 59 + y, 1, 1);
        g2d.fillRect(46 + x, 65 + y, 1, 1);
        g2d.fillRect(48 + x, 68 + y, 1, 1);
        g2d.fillRect(61 + x, 69 + y, 1, 1);
        g2d.fillRect(63 + x, 72 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,69,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108,71,48,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 30 + y, 1, 1);
        g2d.fillRect(55 + x, 31 + y, 1, 1);
        g2d.fillRect(56 + x, 32 + y, 3, 1);
        g2d.fillRect(54 + x, 34 + y, 1, 1);
        g2d.fillRect(59 + x, 34 + y, 1, 1);
        g2d.fillRect(49 + x, 40 + y, 2, 1);
        g2d.fillRect(58 + x, 45 + y, 1, 1);
        g2d.fillRect(45 + x, 48 + y, 1, 1);
        g2d.fillRect(58 + x, 49 + y, 1, 1);
        g2d.fillRect(45 + x, 50 + y, 1, 3);
        g2d.fillRect(49 + x, 58 + y, 1, 1);
        g2d.fillRect(50 + x, 59 + y, 1, 1);
        g2d.fillRect(47 + x, 71 + y, 1, 1);
        g2d.fillRect(62 + x, 71 + y, 1, 1);
        g2d.fillRect(49 + x, 73 + y, 1, 1);
        g2d.fillRect(56 + x, 77 + y, 2, 1);
        g2d.fillRect(64 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,69,38,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 43 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,71,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 36 + y, 1, 1);
        g2d.fillRect(56 + x, 37 + y, 1, 1);
        g2d.fillRect(59 + x, 45 + y, 1, 3);
        g2d.fillRect(53 + x, 48 + y, 1, 1);
        g2d.fillRect(58 + x, 48 + y, 1, 1);
        g2d.fillRect(58 + x, 50 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,69,49,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(52 + x, 36 + y, 1, 2);
        g2d.fillRect(48 + x, 39 + y, 1, 1);
        g2d.fillRect(53 + x, 40 + y, 1, 1);
        g2d.fillRect(50 + x, 41 + y, 1, 1);
        g2d.fillRect(52 + x, 41 + y, 1, 1);
        g2d.fillRect(53 + x, 42 + y, 1, 1);
        g2d.fillRect(48 + x, 46 + y, 1, 1);
        g2d.fillRect(56 + x, 46 + y, 1, 2);
        g2d.fillRect(54 + x, 51 + y, 1, 1);
        g2d.fillRect(54 + x, 55 + y, 1, 1);
        g2d.fillRect(51 + x, 57 + y, 1, 1);
        g2d.fillRect(45 + x, 62 + y, 1, 1);
        g2d.fillRect(58 + x, 62 + y, 1, 1);
        g2d.fillRect(47 + x, 63 + y, 1, 1);
        g2d.fillRect(48 + x, 67 + y, 1, 1);
        g2d.fillRect(60 + x, 68 + y, 1, 1);
        g2d.fillRect(51 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128,73,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 50 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,73,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 32 + y, 1, 1);
        g2d.fillRect(54 + x, 33 + y, 1, 1);
        g2d.fillRect(53 + x, 35 + y, 1, 1);
        g2d.fillRect(55 + x, 36 + y, 1, 1);
        g2d.fillRect(48 + x, 38 + y, 1, 1);
        g2d.fillRect(51 + x, 38 + y, 2, 1);
        g2d.fillRect(52 + x, 39 + y, 1, 2);
        g2d.fillRect(49 + x, 41 + y, 1, 1);
        g2d.fillRect(50 + x, 42 + y, 1, 1);
        g2d.fillRect(58 + x, 47 + y, 1, 1);
        g2d.fillRect(56 + x, 48 + y, 1, 1);
        g2d.fillRect(44 + x, 56 + y, 1, 3);
        g2d.fillRect(45 + x, 60 + y, 1, 2);
        g2d.fillRect(51 + x, 60 + y, 1, 1);
        g2d.fillRect(52 + x, 73 + y, 1, 1);
        g2d.fillRect(59 + x, 75 + y, 1, 1);
        g2d.fillRect(58 + x, 76 + y, 1, 1);
        g2d.fillRect(61 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,75,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 51 + y, 1, 1);
        g2d.fillRect(49 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(122,72,50,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(48 + x, 35 + y, 1, 1);
        g2d.fillRect(56 + x, 36 + y, 1, 1);
        g2d.fillRect(55 + x, 42 + y, 1, 2);
        g2d.fillRect(50 + x, 47 + y, 1, 2);
        g2d.fillRect(53 + x, 47 + y, 1, 1);
        g2d.fillRect(50 + x, 53 + y, 1, 1);
        g2d.fillRect(51 + x, 56 + y, 1, 1);
        g2d.fillRect(47 + x, 62 + y, 1, 1);
        g2d.fillRect(46 + x, 64 + y, 1, 1);
        g2d.fillRect(49 + x, 64 + y, 1, 2);
        g2d.fillRect(57 + x, 64 + y, 1, 2);
        g2d.fillRect(48 + x, 66 + y, 1, 1);
        g2d.fillRect(60 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,75,52,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(48 + x, 36 + y, 1, 1);
        g2d.fillRect(51 + x, 39 + y, 1, 4);
        g2d.fillRect(47 + x, 43 + y, 1, 2);
        g2d.fillRect(46 + x, 45 + y, 1, 1);
        g2d.fillRect(50 + x, 46 + y, 1, 1);
        g2d.fillRect(48 + x, 47 + y, 1, 1);
        g2d.fillRect(51 + x, 49 + y, 1, 1);
        g2d.fillRect(56 + x, 49 + y, 1, 1);
        g2d.fillRect(56 + x, 51 + y, 1, 2);
        g2d.fillRect(45 + x, 57 + y, 1, 1);
        g2d.fillRect(48 + x, 59 + y, 1, 1);
        g2d.fillRect(58 + x, 59 + y, 1, 1);
        g2d.fillRect(58 + x, 61 + y, 1, 1);
        g2d.fillRect(47 + x, 66 + y, 1, 1);
        g2d.fillRect(60 + x, 70 + y, 1, 1);
        g2d.fillRect(50 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,83,43,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(61 + x, 71 + y, 1, 1);
        g2d.fillRect(62 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,78,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(46 + x, 47 + y, 1, 2);
        g2d.fillRect(56 + x, 50 + y, 1, 1);
        g2d.fillRect(45 + x, 53 + y, 1, 1);
        g2d.fillRect(46 + x, 54 + y, 1, 1);
        g2d.fillRect(49 + x, 59 + y, 1, 3);
        g2d.fillRect(50 + x, 60 + y, 1, 2);
        g2d.fillRect(58 + x, 60 + y, 1, 1);
        g2d.fillRect(51 + x, 61 + y, 1, 1);
        g2d.fillRect(46 + x, 66 + y, 1, 1);
        g2d.fillRect(49 + x, 70 + y, 1, 1);
        g2d.fillRect(48 + x, 72 + y, 1, 1);
        g2d.fillRect(51 + x, 74 + y, 3, 1);
        g2d.fillRect(55 + x, 76 + y, 3, 1);
        g2d.fillRect(60 + x, 77 + y, 1, 1);
        g2d.fillRect(62 + x, 77 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126,78,51,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 32 + y, 1, 1);
        g2d.fillRect(52 + x, 34 + y, 1, 1);
        g2d.fillRect(51 + x, 36 + y, 1, 1);
        g2d.fillRect(55 + x, 37 + y, 1, 1);
        g2d.fillRect(47 + x, 38 + y, 1, 1);
        g2d.fillRect(47 + x, 41 + y, 1, 2);
        g2d.fillRect(55 + x, 44 + y, 1, 1);
        g2d.fillRect(47 + x, 45 + y, 1, 1);
        g2d.fillRect(46 + x, 46 + y, 1, 1);
        g2d.fillRect(56 + x, 53 + y, 1, 1);
        g2d.fillRect(53 + x, 55 + y, 1, 1);
        g2d.fillRect(48 + x, 65 + y, 1, 1);
        g2d.fillRect(50 + x, 65 + y, 1, 1);
        g2d.fillRect(49 + x, 66 + y, 1, 2);
        g2d.fillRect(48 + x, 69 + y, 1, 1);
        g2d.fillRect(61 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124,75,57,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(50 + x, 52 + y, 1, 1);
        g2d.fillRect(45 + x, 56 + y, 1, 1);
        g2d.fillRect(45 + x, 58 + y, 1, 2);
        g2d.fillRect(47 + x, 58 + y, 1, 4);
        g2d.fillRect(57 + x, 58 + y, 1, 1);
        g2d.fillRect(48 + x, 60 + y, 1, 5);
        g2d.fillRect(57 + x, 63 + y, 2, 1);
        g2d.fillRect(58 + x, 64 + y, 1, 2);
        g2d.fillRect(50 + x, 66 + y, 1, 1);
        g2d.fillRect(49 + x, 68 + y, 1, 1);
        g2d.fillRect(50 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(133,81,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 40 + y, 1, 1);
        g2d.fillRect(52 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,81,59,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 31 + y, 1, 1);
        g2d.fillRect(54 + x, 39 + y, 1, 1);
        g2d.fillRect(49 + x, 42 + y, 1, 1);
        g2d.fillRect(47 + x, 47 + y, 1, 2);
        g2d.fillRect(50 + x, 49 + y, 1, 1);
        g2d.fillRect(46 + x, 53 + y, 1, 1);
        g2d.fillRect(45 + x, 54 + y, 1, 2);
        g2d.fillRect(48 + x, 58 + y, 1, 1);
        g2d.fillRect(49 + x, 62 + y, 1, 1);
        g2d.fillRect(47 + x, 64 + y, 1, 1);
        g2d.fillRect(52 + x, 64 + y, 1, 1);
        g2d.fillRect(53 + x, 65 + y, 1, 1);
        g2d.fillRect(49 + x, 69 + y, 1, 1);
        g2d.fillRect(62 + x, 73 + y, 1, 1);
        g2d.fillRect(56 + x, 75 + y, 1, 1);
        g2d.fillRect(58 + x, 77 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,81,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(58 + x, 34 + y, 1, 1);
        g2d.fillRect(55 + x, 35 + y, 2, 1);
        g2d.fillRect(47 + x, 37 + y, 1, 1);
        g2d.fillRect(55 + x, 38 + y, 1, 1);
        g2d.fillRect(47 + x, 39 + y, 1, 2);
        g2d.fillRect(55 + x, 41 + y, 1, 1);
        g2d.fillRect(50 + x, 43 + y, 1, 1);
        g2d.fillRect(50 + x, 45 + y, 1, 1);
        g2d.fillRect(50 + x, 51 + y, 1, 1);
        g2d.fillRect(51 + x, 55 + y, 1, 1);
        g2d.fillRect(51 + x, 58 + y, 1, 1);
        g2d.fillRect(52 + x, 61 + y, 1, 1);
        g2d.fillRect(50 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,84,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 33 + y, 1, 2);
        g2d.fillRect(52 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,78,65,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(48 + x, 34 + y, 1, 1);
        g2d.fillRect(48 + x, 50 + y, 1, 1);
        g2d.fillRect(54 + x, 56 + y, 1, 1);
        g2d.fillRect(47 + x, 57 + y, 1, 1);
        g2d.fillRect(52 + x, 58 + y, 1, 1);
        g2d.fillRect(56 + x, 61 + y, 1, 1);
        g2d.fillRect(58 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129,83,61,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(50 + x, 44 + y, 1, 1);
        g2d.fillRect(49 + x, 45 + y, 1, 1);
        g2d.fillRect(55 + x, 45 + y, 1, 2);
        g2d.fillRect(47 + x, 46 + y, 1, 1);
        g2d.fillRect(50 + x, 50 + y, 1, 1);
        g2d.fillRect(54 + x, 50 + y, 1, 1);
        g2d.fillRect(55 + x, 52 + y, 1, 2);
        g2d.fillRect(55 + x, 56 + y, 1, 1);
        g2d.fillRect(48 + x, 57 + y, 1, 1);
        g2d.fillRect(52 + x, 57 + y, 1, 1);
        g2d.fillRect(52 + x, 59 + y, 1, 1);
        g2d.fillRect(46 + x, 62 + y, 1, 2);
        g2d.fillRect(57 + x, 62 + y, 1, 1);
        g2d.fillRect(50 + x, 64 + y, 1, 1);
        g2d.fillRect(47 + x, 65 + y, 1, 1);
        g2d.fillRect(52 + x, 65 + y, 1, 1);
        g2d.fillRect(47 + x, 68 + y, 1, 1);
        g2d.fillRect(60 + x, 69 + y, 1, 1);
        g2d.fillRect(48 + x, 70 + y, 1, 1);
        g2d.fillRect(49 + x, 71 + y, 1, 1);
        g2d.fillRect(52 + x, 72 + y, 1, 1);
        g2d.fillRect(62 + x, 72 + y, 1, 1);
        g2d.fillRect(51 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130,88,61,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 39 + y, 1, 1);
        g2d.fillRect(49 + x, 43 + y, 1, 1);
        g2d.fillRect(55 + x, 47 + y, 1, 1);
        g2d.fillRect(46 + x, 49 + y, 1, 1);
        g2d.fillRect(51 + x, 53 + y, 1, 2);
        g2d.fillRect(56 + x, 54 + y, 1, 1);
        g2d.fillRect(52 + x, 56 + y, 1, 1);
        g2d.fillRect(52 + x, 60 + y, 1, 1);
        g2d.fillRect(46 + x, 67 + y, 1, 1);
        g2d.fillRect(47 + x, 69 + y, 1, 1);
        g2d.fillRect(48 + x, 71 + y, 1, 1);
        g2d.fillRect(50 + x, 73 + y, 1, 1);
        g2d.fillRect(55 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,88,57,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(51 + x, 59 + y, 1, 1);
        g2d.fillRect(59 + x, 70 + y, 1, 1);
        g2d.fillRect(49 + x, 72 + y, 1, 1);
        g2d.fillRect(60 + x, 74 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142,89,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(133,88,70,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(54 + x, 47 + y, 1, 3);
        g2d.fillRect(55 + x, 48 + y, 1, 2);
        g2d.fillRect(51 + x, 50 + y, 1, 1);
        g2d.fillRect(55 + x, 54 + y, 1, 2);
        g2d.fillRect(52 + x, 55 + y, 1, 1);
        g2d.fillRect(48 + x, 56 + y, 1, 1);
        g2d.fillRect(54 + x, 57 + y, 2, 1);
        g2d.fillRect(55 + x, 58 + y, 1, 1);
        g2d.fillRect(56 + x, 60 + y, 1, 1);
        g2d.fillRect(57 + x, 61 + y, 1, 1);
        g2d.fillRect(56 + x, 62 + y, 1, 2);
        g2d.fillRect(51 + x, 64 + y, 1, 1);
        g2d.fillRect(53 + x, 66 + y, 1, 1);
        g2d.fillRect(57 + x, 66 + y, 1, 1);
        g2d.fillRect(51 + x, 67 + y, 1, 1);
        g2d.fillRect(54 + x, 67 + y, 2, 1);
        g2d.fillRect(53 + x, 73 + y, 1, 1);
        g2d.fillRect(54 + x, 74 + y, 1, 1);
        g2d.fillRect(57 + x, 75 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142,93,60,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 53 + y, 1, 2);
        g2d.fillRect(53 + x, 62 + y, 1, 1);
        g2d.fillRect(60 + x, 71 + y, 1, 1);
        g2d.fillRect(61 + x, 73 + y, 1, 1);
        g2d.fillRect(53 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(138,94,74,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(54 + x, 40 + y, 1, 1);
        g2d.fillRect(54 + x, 46 + y, 1, 1);
        g2d.fillRect(47 + x, 49 + y, 1, 1);
        g2d.fillRect(47 + x, 56 + y, 1, 1);
        g2d.fillRect(53 + x, 58 + y, 1, 4);
        g2d.fillRect(54 + x, 58 + y, 1, 1);
        g2d.fillRect(55 + x, 59 + y, 2, 1);
        g2d.fillRect(54 + x, 61 + y, 1, 2);
        g2d.fillRect(50 + x, 62 + y, 1, 2);
        g2d.fillRect(55 + x, 62 + y, 1, 1);
        g2d.fillRect(56 + x, 64 + y, 1, 1);
        g2d.fillRect(51 + x, 65 + y, 1, 1);
        g2d.fillRect(54 + x, 66 + y, 1, 1);
        g2d.fillRect(51 + x, 68 + y, 1, 1);
        g2d.fillRect(50 + x, 70 + y, 1, 1);
        g2d.fillRect(59 + x, 74 + y, 1, 1);
        g2d.fillRect(54 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,99,66,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(49 + x, 44 + y, 1, 1);
        g2d.fillRect(51 + x, 51 + y, 1, 2);
        g2d.fillRect(57 + x, 59 + y, 1, 1);
        g2d.fillRect(53 + x, 63 + y, 1, 1);
        g2d.fillRect(46 + x, 68 + y, 1, 1);
        g2d.fillRect(50 + x, 68 + y, 1, 1);
        g2d.fillRect(59 + x, 69 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144,98,76,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(55 + x, 51 + y, 1, 1);
        g2d.fillRect(48 + x, 54 + y, 1, 1);
        g2d.fillRect(53 + x, 56 + y, 1, 2);
        g2d.fillRect(56 + x, 58 + y, 1, 1);
        g2d.fillRect(54 + x, 60 + y, 1, 1);
        g2d.fillRect(51 + x, 66 + y, 1, 1);
        g2d.fillRect(59 + x, 68 + y, 1, 1);
        g2d.fillRect(51 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140,100,81,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(54 + x, 42 + y, 1, 1);
        g2d.fillRect(55 + x, 50 + y, 1, 1);
        g2d.fillRect(46 + x, 52 + y, 1, 1);
        g2d.fillRect(47 + x, 55 + y, 2, 1);
        g2d.fillRect(54 + x, 59 + y, 1, 1);
        g2d.fillRect(55 + x, 60 + y, 1, 2);
        g2d.fillRect(51 + x, 62 + y, 1, 2);
        g2d.fillRect(52 + x, 63 + y, 1, 1);
        g2d.fillRect(55 + x, 63 + y, 1, 1);
        g2d.fillRect(55 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(147,104,77,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 41 + y, 1, 1);
        g2d.fillRect(54 + x, 44 + y, 1, 2);
        g2d.fillRect(57 + x, 60 + y, 1, 1);
        g2d.fillRect(61 + x, 72 + y, 1, 1);
        g2d.fillRect(59 + x, 73 + y, 2, 1);
        g2d.fillRect(58 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(154,107,73,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 55 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(149,108,86,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 43 + y, 1, 1);
        g2d.fillRect(46 + x, 50 + y, 1, 2);
        g2d.fillRect(48 + x, 51 + y, 1, 3);
        g2d.fillRect(47 + x, 54 + y, 1, 1);
        g2d.fillRect(54 + x, 63 + y, 1, 1);
        g2d.fillRect(54 + x, 65 + y, 1, 1);
        g2d.fillRect(56 + x, 65 + y, 1, 1);
        g2d.fillRect(52 + x, 66 + y, 1, 1);
        g2d.fillRect(57 + x, 72 + y, 2, 1);
        g2d.fillRect(56 + x, 74 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158,113,78,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(52 + x, 67 + y, 1, 1);
        g2d.fillRect(58 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(157,115,92,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(47 + x, 50 + y, 1, 4);
        g2d.fillRect(55 + x, 66 + y, 2, 1);
        g2d.fillRect(53 + x, 67 + y, 1, 1);
        g2d.fillRect(56 + x, 67 + y, 1, 2);
        g2d.fillRect(57 + x, 67 + y, 1, 1);
        g2d.fillRect(55 + x, 68 + y, 1, 1);
        g2d.fillRect(58 + x, 68 + y, 1, 3);
        g2d.fillRect(50 + x, 69 + y, 3, 1);
        g2d.fillRect(57 + x, 71 + y, 1, 1);
        g2d.fillRect(59 + x, 71 + y, 1, 2);
        g2d.fillRect(60 + x, 72 + y, 1, 1);
        g2d.fillRect(54 + x, 73 + y, 1, 1);
        g2d.fillRect(57 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,120,84,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(56 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(163,123,101,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(54 + x, 64 + y, 2, 1);
        g2d.fillRect(52 + x, 68 + y, 1, 1);
        g2d.fillRect(54 + x, 68 + y, 1, 3);
        g2d.fillRect(57 + x, 68 + y, 1, 2);
        g2d.fillRect(51 + x, 70 + y, 1, 1);
        g2d.fillRect(55 + x, 71 + y, 2, 1);
        g2d.fillRect(58 + x, 71 + y, 1, 1);
        g2d.fillRect(53 + x, 72 + y, 1, 1);
        g2d.fillRect(55 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172,128,90,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 70 + y, 1, 1);
        g2d.fillRect(55 + x, 72 + y, 1, 1);
        g2d.fillRect(56 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174,132,101,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 65 + y, 1, 1);
        g2d.fillRect(52 + x, 70 + y, 1, 1);
        g2d.fillRect(54 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,132,112,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 68 + y, 1, 1);
        g2d.fillRect(56 + x, 69 + y, 1, 2);
        g2d.fillRect(55 + x, 70 + y, 1, 1);
        g2d.fillRect(57 + x, 70 + y, 1, 1);
        g2d.fillRect(52 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183,139,104,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(53 + x, 69 + y, 1, 1);
        g2d.fillRect(53 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(175,140,120,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(55 + x, 69 + y, 1, 1);
        g2d.fillRect(54 + x, 72 + y, 1, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(109,58,27,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(119 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113,60,28,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(116,64,28,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(121 + x, 81 + y, 1, 3);
        g2d.fillRect(122 + x, 85 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121,67,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(122 + x, 84 + y, 1, 1);
        g2d.fillRect(122 + x, 92 + y, 1, 4);
        g2d.fillRect(121 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,69,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(99 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140,74,31,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(118 + x, 97 + y, 1, 2);
        g2d.fillRect(117 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(145,78,33,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,80,34,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(121 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 93 + y, 1, 3);
        g2d.fillRect(119 + x, 95 + y, 1, 3);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(149,82,36,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 3);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(151,84,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,84,37,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(121 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(152,86,40,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(156,87,39,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(162,84,39,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(110 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(160,86,40,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(121 + x, 95 + y, 1, 1);
        g2d.fillRect(110 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158,89,40,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(121 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(160,90,41,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 98 + y, 1, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(161,92,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(99 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 3);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 97 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,89,42,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(110 + x, 97 + y, 3, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(111 + x, 98 + y, 1, 2);
        g2d.fillRect(112 + x, 98 + y, 1, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(163,95,44,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(107 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164,94,44,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(119 + x, 91 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,96,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,94,45,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(112 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,97,46,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(114 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 2);
        g2d.fillRect(113 + x, 98 + y, 2, 1);
        g2d.fillRect(106 + x, 99 + y, 1, 1);
        g2d.fillRect(114 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,100,48,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(100 + x, 77 + y, 1, 2);
        g2d.fillRect(99 + x, 78 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 96 + y, 1, 1);
        g2d.fillRect(107 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(173,98,48,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(114 + x, 95 + y, 1, 2);
        g2d.fillRect(113 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(173,100,49,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177,101,50,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(112 + x, 87 + y, 4, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 4);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 2);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(110 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(175,103,51,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177,105,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180,105,53,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(99 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 3);
        g2d.fillRect(100 + x, 83 + y, 1, 3);
        g2d.fillRect(101 + x, 83 + y, 1, 4);
        g2d.fillRect(102 + x, 83 + y, 1, 4);
        g2d.fillRect(99 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 88 + y, 2, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 5, 1);
        g2d.fillRect(116 + x, 89 + y, 2, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 5);
        g2d.fillRect(113 + x, 90 + y, 1, 4);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 2, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 2, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 2, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(110 + x, 94 + y, 2, 1);
        g2d.fillRect(115 + x, 94 + y, 2, 1);
        g2d.fillRect(111 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 2, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 2);
        g2d.fillRect(113 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(178,107,54,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(99 + x, 79 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180,109,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(182,108,55,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 1);
        g2d.fillRect(111 + x, 93 + y, 1, 1);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183,110,56,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(100 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 3, 1);
        g2d.fillRect(102 + x, 88 + y, 3, 1);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 3, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(100 + x, 93 + y, 3, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(110 + x, 93 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 2, 1);
        g2d.fillRect(104 + x, 98 + y, 2, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185,111,57,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(99 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 82 + y, 2, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 2, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(111 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(110 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187,112,58,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 5, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 2, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 2);
        g2d.fillRect(109 + x, 93 + y, 1, 2);
        g2d.fillRect(99 + x, 94 + y, 2, 1);
        g2d.fillRect(100 + x, 95 + y, 3, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(186,114,60,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(101 + x, 91 + y, 2, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 95 + y, 2, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 1);
        g2d.fillRect(99 + x, 98 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189,116,61,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(106 + x, 85 + y, 2, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(103 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 97 + y, 1, 1);
        g2d.fillRect(100 + x, 98 + y, 1, 1);
        g2d.fillRect(102 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(192,119,62,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 2);
        g2d.fillRect(105 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 2);
        g2d.fillRect(101 + x, 98 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193,124,71,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 2, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198,128,77,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(102 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201,135,85,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206,144,94,255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 3, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 4, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 9, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
    }
}
