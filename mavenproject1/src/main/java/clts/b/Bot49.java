/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b;

import clts.SuperB;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot49 extends SuperB {

    {
        jean = true;
        pant = true;
        slenderS = true;
        platzHeight = 1;
    }
    public Bot49() {
        super();
    }

    public Bot49(int layer) {
        super(layer);
    }

    public Bot49(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Bot49(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void drawBody(b.Bd bd, int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void drawBody(b.Bd bd) {
        bd.paintLegs = false;
    }

    public void paintBack(int offsetX, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (step <= 12 && step > 3) {
            paintLeft(offsetX, 0, g2d);
        } else {
            paintRight(offsetX, 0, g2d);
        }
    }

    public void paintMiddle(int offsetX, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);


        if (step <= 12 && step > 3) {
            paintRight(offsetX, 0, g2d);
        } else {
            paintLeft(offsetX, 0, g2d);
        }
        paintpt(offsetX, 0, g2d);
    }

    private void paintRight(int x, int y, GraphicsMap g2d) {
        if (step == 0 || step == 8 || step == 9 || step == 15) {
            paintOne(x, y, g2d);
        } else if (step == 11 || step == 12 || step == 13) {
            paintThree(x, y, g2d);
        } else if (step == 1 || step == 7) {
            paintFour(x, y, g2d);
        } else if (step == 2 || step == 6) {
            paintFive(x, y, g2d);
        } else if (step == 3 || step == 5) {
            paintSix(x, y, g2d);
        } else if (step == 10 || step == 14) {
            paintTwo(x, y, g2d);
        } else if (step == 4) {
            paintSeven(x, y, g2d);
        }
    }

    private void paintLeft(int x, int y, GraphicsMap g2d) {
        x = x + 7;
        if (step == 0 || step == 1 || step == 7 || step == 8) {
            paintBackOne(x, y, g2d);
        } else if (step == 3 || step == 4 || step == 5) {
            paintBackThree(x, y, g2d);
        } else if (step == 2 || step == 6) {
            paintBackTwo(x, y, g2d);
        } else if (step == 9 || step == 15) {
            paintBackFour(x, y, g2d);
        } else if (step == 10 || step == 14) {
            paintBackFive(x, y, g2d);
        } else if (step == 11 || step == 13) {
            paintBackSix(x, y, g2d);
        } else if (step == 12) {
            paintBackSeven(x, y, g2d);
        }
    }

    public void paintFive(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 8);
        g2d.fillRect(121 + x, 91 + y, 1, 7);
        g2d.fillRect(120 + x, 98 + y, 1, 4);
        g2d.fillRect(112 + x, 99 + y, 1, 4);
        g2d.fillRect(119 + x, 102 + y, 1, 2);
        g2d.fillRect(111 + x, 103 + y, 1, 8);
        g2d.fillRect(118 + x, 104 + y, 1, 20);
        g2d.fillRect(110 + x, 111 + y, 1, 8);
        g2d.fillRect(109 + x, 119 + y, 1, 8);
        g2d.fillRect(119 + x, 124 + y, 1, 14);
        g2d.fillRect(108 + x, 127 + y, 1, 7);
        g2d.fillRect(107 + x, 134 + y, 1, 4);
        g2d.fillRect(106 + x, 138 + y, 1, 8);
        g2d.fillRect(120 + x, 138 + y, 1, 6);
        g2d.fillRect(121 + x, 144 + y, 1, 4);
        g2d.fillRect(105 + x, 146 + y, 1, 2);
        g2d.fillRect(109 + x, 147 + y, 5, 1);
        g2d.fillRect(104 + x, 148 + y, 1, 4);
        g2d.fillRect(113 + x, 148 + y, 2, 1);
        g2d.fillRect(122 + x, 148 + y, 1, 1);
        g2d.fillRect(115 + x, 149 + y, 1, 3);
        g2d.fillRect(123 + x, 149 + y, 1, 1);
        g2d.fillRect(107 + x, 150 + y, 1, 5);
        g2d.fillRect(124 + x, 150 + y, 1, 4);
        g2d.fillRect(116 + x, 151 + y, 1, 2);
        g2d.fillRect(103 + x, 152 + y, 1, 2);
        g2d.fillRect(102 + x, 153 + y, 1, 1);
        g2d.fillRect(117 + x, 153 + y, 1, 2);
        g2d.fillRect(123 + x, 153 + y, 1, 1);
        g2d.fillRect(125 + x, 153 + y, 1, 1);
        g2d.fillRect(104 + x, 154 + y, 3, 1);
        g2d.fillRect(120 + x, 154 + y, 3, 1);
        g2d.fillRect(118 + x, 155 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 7);
        g2d.fillRect(114 + x, 94 + y, 1, 10);
        g2d.fillRect(115 + x, 95 + y, 1, 3);
        g2d.fillRect(113 + x, 99 + y, 1, 9);
        g2d.fillRect(118 + x, 99 + y, 1, 3);
        g2d.fillRect(117 + x, 102 + y, 1, 2);
        g2d.fillRect(112 + x, 103 + y, 1, 12);
        g2d.fillRect(116 + x, 106 + y, 1, 24);
        g2d.fillRect(111 + x, 111 + y, 1, 21);
        g2d.fillRect(112 + x, 117 + y, 1, 2);
        g2d.fillRect(110 + x, 119 + y, 1, 19);
        g2d.fillRect(117 + x, 124 + y, 1, 17);
        g2d.fillRect(109 + x, 127 + y, 1, 15);
        g2d.fillRect(108 + x, 134 + y, 1, 10);
        g2d.fillRect(116 + x, 134 + y, 1, 2);
        g2d.fillRect(107 + x, 138 + y, 1, 9);
        g2d.fillRect(118 + x, 138 + y, 1, 9);
        g2d.fillRect(119 + x, 144 + y, 1, 5);
        g2d.fillRect(106 + x, 146 + y, 1, 2);
        g2d.fillRect(109 + x, 146 + y, 6, 1);
        g2d.fillRect(114 + x, 147 + y, 2, 1);
        g2d.fillRect(105 + x, 148 + y, 1, 6);
        g2d.fillRect(107 + x, 148 + y, 1, 2);
        g2d.fillRect(108 + x, 148 + y, 1, 1);
        g2d.fillRect(115 + x, 148 + y, 1, 1);
        g2d.fillRect(120 + x, 148 + y, 1, 3);
        g2d.fillRect(116 + x, 149 + y, 1, 2);
        g2d.fillRect(121 + x, 149 + y, 1, 5);
        g2d.fillRect(117 + x, 150 + y, 1, 3);
        g2d.fillRect(122 + x, 150 + y, 1, 4);
        g2d.fillRect(106 + x, 151 + y, 1, 3);
        g2d.fillRect(118 + x, 151 + y, 1, 4);
        g2d.fillRect(104 + x, 152 + y, 1, 2);
        g2d.fillRect(119 + x, 152 + y, 1, 3);
        g2d.fillRect(120 + x, 153 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 91 + y, 1, 7);
        g2d.fillRect(119 + x, 98 + y, 1, 4);
        g2d.fillRect(118 + x, 102 + y, 1, 2);
        g2d.fillRect(117 + x, 104 + y, 1, 20);
        g2d.fillRect(118 + x, 124 + y, 1, 14);
        g2d.fillRect(119 + x, 138 + y, 1, 6);
        g2d.fillRect(120 + x, 144 + y, 1, 4);
        g2d.fillRect(121 + x, 148 + y, 1, 1);
        g2d.fillRect(122 + x, 149 + y, 1, 1);
        g2d.fillRect(123 + x, 150 + y, 1, 3);
        g2d.fillRect(108 + x, 151 + y, 1, 2);
        g2d.fillRect(114 + x, 151 + y, 1, 2);
        g2d.fillRect(109 + x, 152 + y, 1, 2);
        g2d.fillRect(110 + x, 152 + y, 1, 2);
        g2d.fillRect(111 + x, 152 + y, 1, 2);
        g2d.fillRect(112 + x, 152 + y, 1, 2);
        g2d.fillRect(113 + x, 152 + y, 1, 2);
        g2d.fillRect(115 + x, 152 + y, 1, 1);
        g2d.fillRect(116 + x, 153 + y, 1, 1);
        g2d.fillRect(115 + x, 154 + y, 1, 1);
        g2d.fillRect(108 + x, 155 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 4);
        g2d.fillRect(118 + x, 91 + y, 1, 8);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 4);
        g2d.fillRect(115 + x, 98 + y, 1, 44);
        g2d.fillRect(117 + x, 98 + y, 1, 4);
        g2d.fillRect(116 + x, 102 + y, 1, 4);
        g2d.fillRect(114 + x, 104 + y, 1, 4);
        g2d.fillRect(113 + x, 108 + y, 1, 20);
        g2d.fillRect(112 + x, 115 + y, 1, 2);
        g2d.fillRect(114 + x, 115 + y, 1, 5);
        g2d.fillRect(112 + x, 119 + y, 1, 22);
        g2d.fillRect(114 + x, 128 + y, 1, 13);
        g2d.fillRect(116 + x, 130 + y, 1, 4);
        g2d.fillRect(111 + x, 132 + y, 1, 14);
        g2d.fillRect(116 + x, 136 + y, 1, 8);
        g2d.fillRect(110 + x, 138 + y, 1, 8);
        g2d.fillRect(117 + x, 141 + y, 1, 5);
        g2d.fillRect(109 + x, 142 + y, 1, 4);
        g2d.fillRect(112 + x, 142 + y, 1, 4);
        g2d.fillRect(113 + x, 142 + y, 1, 4);
        g2d.fillRect(108 + x, 144 + y, 1, 4);
        g2d.fillRect(114 + x, 144 + y, 1, 2);
        g2d.fillRect(115 + x, 144 + y, 1, 3);
        g2d.fillRect(116 + x, 146 + y, 1, 3);
        g2d.fillRect(107 + x, 147 + y, 1, 1);
        g2d.fillRect(117 + x, 147 + y, 1, 3);
        g2d.fillRect(118 + x, 147 + y, 1, 4);
        g2d.fillRect(106 + x, 148 + y, 1, 3);
        g2d.fillRect(119 + x, 149 + y, 1, 3);
        g2d.fillRect(120 + x, 151 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 95 + y, 1, 3);
        g2d.fillRect(116 + x, 99 + y, 1, 3);
        g2d.fillRect(114 + x, 108 + y, 1, 7);
        g2d.fillRect(114 + x, 120 + y, 1, 8);
        g2d.fillRect(113 + x, 128 + y, 1, 14);
        g2d.fillRect(112 + x, 141 + y, 1, 1);
        g2d.fillRect(114 + x, 141 + y, 1, 3);
        g2d.fillRect(115 + x, 142 + y, 1, 2);
        g2d.fillRect(116 + x, 144 + y, 1, 2);
        g2d.fillRect(117 + x, 146 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 151 + y, 5, 1);
        g2d.fillRect(108 + x, 153 + y, 1, 2);
        g2d.fillRect(114 + x, 153 + y, 1, 2);
        g2d.fillRect(115 + x, 153 + y, 1, 1);
        g2d.fillRect(109 + x, 154 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 148 + y, 1, 3);
        g2d.fillRect(110 + x, 148 + y, 1, 3);
        g2d.fillRect(111 + x, 148 + y, 1, 3);
        g2d.fillRect(112 + x, 148 + y, 1, 3);
        g2d.fillRect(108 + x, 149 + y, 1, 2);
        g2d.fillRect(113 + x, 149 + y, 1, 2);
        g2d.fillRect(114 + x, 149 + y, 1, 2);
    }

    public void paintFour(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 10);
        g2d.fillRect(121 + x, 91 + y, 1, 9);
        g2d.fillRect(120 + x, 100 + y, 1, 4);
        g2d.fillRect(112 + x, 101 + y, 1, 5);
        g2d.fillRect(119 + x, 104 + y, 1, 3);
        g2d.fillRect(111 + x, 106 + y, 1, 8);
        g2d.fillRect(118 + x, 107 + y, 1, 20);
        g2d.fillRect(110 + x, 114 + y, 1, 8);
        g2d.fillRect(109 + x, 122 + y, 1, 8);
        g2d.fillRect(119 + x, 127 + y, 1, 15);
        g2d.fillRect(108 + x, 130 + y, 1, 8);
        g2d.fillRect(107 + x, 138 + y, 1, 4);
        g2d.fillRect(106 + x, 142 + y, 1, 8);
        g2d.fillRect(120 + x, 142 + y, 1, 6);
        g2d.fillRect(121 + x, 148 + y, 1, 4);
        g2d.fillRect(105 + x, 150 + y, 1, 2);
        g2d.fillRect(109 + x, 151 + y, 5, 1);
        g2d.fillRect(104 + x, 152 + y, 1, 4);
        g2d.fillRect(113 + x, 152 + y, 2, 1);
        g2d.fillRect(122 + x, 152 + y, 1, 1);
        g2d.fillRect(115 + x, 153 + y, 1, 3);
        g2d.fillRect(123 + x, 153 + y, 1, 1);
        g2d.fillRect(107 + x, 154 + y, 1, 5);
        g2d.fillRect(124 + x, 154 + y, 1, 4);
        g2d.fillRect(116 + x, 155 + y, 1, 2);
        g2d.fillRect(103 + x, 156 + y, 1, 2);
        g2d.fillRect(102 + x, 157 + y, 1, 1);
        g2d.fillRect(117 + x, 157 + y, 1, 2);
        g2d.fillRect(123 + x, 157 + y, 1, 1);
        g2d.fillRect(125 + x, 157 + y, 1, 1);
        g2d.fillRect(104 + x, 158 + y, 3, 1);
        g2d.fillRect(120 + x, 158 + y, 3, 1);
        g2d.fillRect(118 + x, 159 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 9);
        g2d.fillRect(114 + x, 94 + y, 1, 13);
        g2d.fillRect(115 + x, 97 + y, 1, 3);
        g2d.fillRect(113 + x, 101 + y, 1, 10);
        g2d.fillRect(118 + x, 101 + y, 1, 3);
        g2d.fillRect(117 + x, 105 + y, 1, 2);
        g2d.fillRect(112 + x, 106 + y, 1, 12);
        g2d.fillRect(116 + x, 109 + y, 1, 24);
        g2d.fillRect(111 + x, 114 + y, 1, 22);
        g2d.fillRect(112 + x, 120 + y, 1, 2);
        g2d.fillRect(110 + x, 122 + y, 1, 20);
        g2d.fillRect(117 + x, 127 + y, 1, 18);
        g2d.fillRect(109 + x, 130 + y, 1, 16);
        g2d.fillRect(108 + x, 138 + y, 1, 10);
        g2d.fillRect(116 + x, 138 + y, 1, 2);
        g2d.fillRect(107 + x, 142 + y, 1, 9);
        g2d.fillRect(118 + x, 142 + y, 1, 9);
        g2d.fillRect(119 + x, 148 + y, 1, 5);
        g2d.fillRect(106 + x, 150 + y, 1, 2);
        g2d.fillRect(109 + x, 150 + y, 6, 1);
        g2d.fillRect(114 + x, 151 + y, 2, 1);
        g2d.fillRect(105 + x, 152 + y, 1, 6);
        g2d.fillRect(107 + x, 152 + y, 1, 2);
        g2d.fillRect(108 + x, 152 + y, 1, 1);
        g2d.fillRect(115 + x, 152 + y, 1, 1);
        g2d.fillRect(120 + x, 152 + y, 1, 3);
        g2d.fillRect(116 + x, 153 + y, 1, 2);
        g2d.fillRect(121 + x, 153 + y, 1, 5);
        g2d.fillRect(117 + x, 154 + y, 1, 3);
        g2d.fillRect(122 + x, 154 + y, 1, 4);
        g2d.fillRect(106 + x, 155 + y, 1, 3);
        g2d.fillRect(118 + x, 155 + y, 1, 4);
        g2d.fillRect(104 + x, 156 + y, 1, 2);
        g2d.fillRect(119 + x, 156 + y, 1, 3);
        g2d.fillRect(120 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 91 + y, 1, 9);
        g2d.fillRect(119 + x, 100 + y, 1, 4);
        g2d.fillRect(118 + x, 104 + y, 1, 3);
        g2d.fillRect(117 + x, 107 + y, 1, 20);
        g2d.fillRect(118 + x, 127 + y, 1, 15);
        g2d.fillRect(119 + x, 142 + y, 1, 6);
        g2d.fillRect(120 + x, 148 + y, 1, 4);
        g2d.fillRect(121 + x, 152 + y, 1, 1);
        g2d.fillRect(122 + x, 153 + y, 1, 1);
        g2d.fillRect(123 + x, 154 + y, 1, 3);
        g2d.fillRect(108 + x, 155 + y, 1, 2);
        g2d.fillRect(114 + x, 155 + y, 1, 2);
        g2d.fillRect(109 + x, 156 + y, 1, 2);
        g2d.fillRect(110 + x, 156 + y, 1, 2);
        g2d.fillRect(111 + x, 156 + y, 1, 2);
        g2d.fillRect(112 + x, 156 + y, 1, 2);
        g2d.fillRect(113 + x, 156 + y, 1, 2);
        g2d.fillRect(115 + x, 156 + y, 1, 1);
        g2d.fillRect(116 + x, 157 + y, 1, 1);
        g2d.fillRect(115 + x, 158 + y, 1, 1);
        g2d.fillRect(108 + x, 159 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 91 + y, 1, 6);
        g2d.fillRect(117 + x, 91 + y, 1, 6);
        g2d.fillRect(118 + x, 91 + y, 1, 10);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 2);
        g2d.fillRect(116 + x, 97 + y, 1, 4);
        g2d.fillRect(115 + x, 100 + y, 1, 46);
        g2d.fillRect(117 + x, 100 + y, 1, 5);
        g2d.fillRect(116 + x, 104 + y, 1, 5);
        g2d.fillRect(114 + x, 107 + y, 1, 4);
        g2d.fillRect(113 + x, 111 + y, 1, 20);
        g2d.fillRect(112 + x, 118 + y, 1, 2);
        g2d.fillRect(114 + x, 118 + y, 1, 5);
        g2d.fillRect(112 + x, 122 + y, 1, 23);
        g2d.fillRect(114 + x, 131 + y, 1, 14);
        g2d.fillRect(116 + x, 133 + y, 1, 5);
        g2d.fillRect(111 + x, 136 + y, 1, 14);
        g2d.fillRect(116 + x, 140 + y, 1, 8);
        g2d.fillRect(110 + x, 142 + y, 1, 8);
        g2d.fillRect(117 + x, 145 + y, 1, 5);
        g2d.fillRect(109 + x, 146 + y, 1, 4);
        g2d.fillRect(112 + x, 146 + y, 1, 4);
        g2d.fillRect(113 + x, 146 + y, 1, 4);
        g2d.fillRect(108 + x, 148 + y, 1, 4);
        g2d.fillRect(114 + x, 148 + y, 1, 2);
        g2d.fillRect(115 + x, 148 + y, 1, 3);
        g2d.fillRect(116 + x, 150 + y, 1, 3);
        g2d.fillRect(107 + x, 151 + y, 1, 1);
        g2d.fillRect(117 + x, 151 + y, 1, 3);
        g2d.fillRect(118 + x, 151 + y, 1, 4);
        g2d.fillRect(106 + x, 152 + y, 1, 3);
        g2d.fillRect(119 + x, 153 + y, 1, 3);
        g2d.fillRect(120 + x, 155 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 91 + y, 1, 3);
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 3);
        g2d.fillRect(116 + x, 101 + y, 1, 3);
        g2d.fillRect(114 + x, 111 + y, 1, 7);
        g2d.fillRect(114 + x, 123 + y, 1, 8);
        g2d.fillRect(113 + x, 131 + y, 1, 15);
        g2d.fillRect(112 + x, 145 + y, 1, 1);
        g2d.fillRect(114 + x, 145 + y, 1, 3);
        g2d.fillRect(115 + x, 146 + y, 1, 2);
        g2d.fillRect(116 + x, 148 + y, 1, 2);
        g2d.fillRect(117 + x, 150 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 155 + y, 5, 1);
        g2d.fillRect(108 + x, 157 + y, 1, 2);
        g2d.fillRect(114 + x, 157 + y, 1, 2);
        g2d.fillRect(115 + x, 157 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 152 + y, 1, 3);
        g2d.fillRect(110 + x, 152 + y, 1, 3);
        g2d.fillRect(111 + x, 152 + y, 1, 3);
        g2d.fillRect(112 + x, 152 + y, 1, 3);
        g2d.fillRect(108 + x, 153 + y, 1, 2);
        g2d.fillRect(113 + x, 153 + y, 1, 2);
        g2d.fillRect(114 + x, 153 + y, 1, 2);
    }

    public void paintOne(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(121 + x, 91 + y, 1, 4);
        g2d.fillRect(112 + x, 93 + y, 1, 9);
        g2d.fillRect(120 + x, 95 + y, 1, 6);
        g2d.fillRect(119 + x, 101 + y, 1, 4);
        g2d.fillRect(111 + x, 102 + y, 1, 5);
        g2d.fillRect(118 + x, 105 + y, 1, 3);
        g2d.fillRect(110 + x, 107 + y, 1, 9);
        g2d.fillRect(117 + x, 108 + y, 1, 21);
        g2d.fillRect(109 + x, 116 + y, 1, 8);
        g2d.fillRect(108 + x, 124 + y, 1, 8);
        g2d.fillRect(118 + x, 129 + y, 1, 17);
        g2d.fillRect(107 + x, 132 + y, 1, 8);
        g2d.fillRect(106 + x, 140 + y, 1, 6);
        g2d.fillRect(105 + x, 146 + y, 1, 8);
        g2d.fillRect(119 + x, 146 + y, 1, 6);
        g2d.fillRect(120 + x, 152 + y, 1, 4);
        g2d.fillRect(104 + x, 154 + y, 1, 2);
        g2d.fillRect(108 + x, 155 + y, 5, 1);
        g2d.fillRect(103 + x, 156 + y, 1, 4);
        g2d.fillRect(112 + x, 156 + y, 2, 1);
        g2d.fillRect(121 + x, 156 + y, 1, 1);
        g2d.fillRect(114 + x, 157 + y, 1, 3);
        g2d.fillRect(122 + x, 157 + y, 1, 1);
        g2d.fillRect(106 + x, 158 + y, 1, 5);
        g2d.fillRect(123 + x, 158 + y, 1, 4);
        g2d.fillRect(115 + x, 159 + y, 1, 2);
        g2d.fillRect(102 + x, 160 + y, 1, 2);
        g2d.fillRect(101 + x, 161 + y, 1, 1);
        g2d.fillRect(116 + x, 161 + y, 1, 2);
        g2d.fillRect(122 + x, 161 + y, 1, 1);
        g2d.fillRect(124 + x, 161 + y, 1, 1);
        g2d.fillRect(103 + x, 162 + y, 3, 1);
        g2d.fillRect(119 + x, 162 + y, 3, 1);
        g2d.fillRect(117 + x, 163 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 4);
        g2d.fillRect(113 + x, 93 + y, 1, 15);
        g2d.fillRect(118 + x, 95 + y, 1, 6);
        g2d.fillRect(114 + x, 98 + y, 1, 3);
        g2d.fillRect(112 + x, 102 + y, 1, 11);
        g2d.fillRect(117 + x, 102 + y, 1, 3);
        g2d.fillRect(116 + x, 106 + y, 1, 2);
        g2d.fillRect(111 + x, 107 + y, 1, 13);
        g2d.fillRect(115 + x, 111 + y, 1, 24);
        g2d.fillRect(110 + x, 116 + y, 1, 22);
        g2d.fillRect(111 + x, 122 + y, 1, 2);
        g2d.fillRect(109 + x, 124 + y, 1, 22);
        g2d.fillRect(116 + x, 129 + y, 1, 20);
        g2d.fillRect(108 + x, 132 + y, 1, 18);
        g2d.fillRect(107 + x, 140 + y, 1, 12);
        g2d.fillRect(115 + x, 141 + y, 1, 3);
        g2d.fillRect(106 + x, 146 + y, 1, 9);
        g2d.fillRect(117 + x, 146 + y, 1, 9);
        g2d.fillRect(118 + x, 152 + y, 1, 5);
        g2d.fillRect(105 + x, 154 + y, 1, 2);
        g2d.fillRect(108 + x, 154 + y, 6, 1);
        g2d.fillRect(113 + x, 155 + y, 2, 1);
        g2d.fillRect(104 + x, 156 + y, 1, 6);
        g2d.fillRect(106 + x, 156 + y, 1, 2);
        g2d.fillRect(107 + x, 156 + y, 1, 1);
        g2d.fillRect(114 + x, 156 + y, 1, 1);
        g2d.fillRect(119 + x, 156 + y, 1, 3);
        g2d.fillRect(115 + x, 157 + y, 1, 2);
        g2d.fillRect(120 + x, 157 + y, 1, 5);
        g2d.fillRect(116 + x, 158 + y, 1, 3);
        g2d.fillRect(121 + x, 158 + y, 1, 4);
        g2d.fillRect(105 + x, 159 + y, 1, 3);
        g2d.fillRect(117 + x, 159 + y, 1, 4);
        g2d.fillRect(103 + x, 160 + y, 1, 2);
        g2d.fillRect(118 + x, 160 + y, 1, 3);
        g2d.fillRect(119 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 91 + y, 1, 4);
        g2d.fillRect(119 + x, 95 + y, 1, 6);
        g2d.fillRect(118 + x, 101 + y, 1, 4);
        g2d.fillRect(117 + x, 105 + y, 1, 3);
        g2d.fillRect(116 + x, 108 + y, 1, 21);
        g2d.fillRect(117 + x, 129 + y, 1, 17);
        g2d.fillRect(118 + x, 146 + y, 1, 6);
        g2d.fillRect(119 + x, 152 + y, 1, 4);
        g2d.fillRect(120 + x, 156 + y, 1, 1);
        g2d.fillRect(121 + x, 157 + y, 1, 1);
        g2d.fillRect(122 + x, 158 + y, 1, 3);
        g2d.fillRect(107 + x, 159 + y, 1, 2);
        g2d.fillRect(113 + x, 159 + y, 1, 2);
        g2d.fillRect(108 + x, 160 + y, 1, 2);
        g2d.fillRect(109 + x, 160 + y, 1, 2);
        g2d.fillRect(110 + x, 160 + y, 1, 2);
        g2d.fillRect(111 + x, 160 + y, 1, 2);
        g2d.fillRect(112 + x, 160 + y, 1, 2);
        g2d.fillRect(114 + x, 160 + y, 1, 1);
        g2d.fillRect(115 + x, 161 + y, 1, 1);
        g2d.fillRect(114 + x, 162 + y, 1, 1);
        g2d.fillRect(107 + x, 163 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 91 + y, 1, 6);
        g2d.fillRect(117 + x, 91 + y, 1, 11);
        g2d.fillRect(118 + x, 91 + y, 1, 4);
        g2d.fillRect(114 + x, 93 + y, 1, 5);
        g2d.fillRect(116 + x, 95 + y, 1, 3);
        g2d.fillRect(115 + x, 98 + y, 1, 4);
        g2d.fillRect(114 + x, 101 + y, 1, 49);
        g2d.fillRect(116 + x, 101 + y, 1, 5);
        g2d.fillRect(115 + x, 105 + y, 1, 6);
        g2d.fillRect(113 + x, 108 + y, 1, 5);
        g2d.fillRect(112 + x, 113 + y, 1, 20);
        g2d.fillRect(111 + x, 120 + y, 1, 2);
        g2d.fillRect(113 + x, 120 + y, 1, 5);
        g2d.fillRect(111 + x, 124 + y, 1, 25);
        g2d.fillRect(113 + x, 133 + y, 1, 16);
        g2d.fillRect(115 + x, 135 + y, 1, 6);
        g2d.fillRect(110 + x, 138 + y, 1, 16);
        g2d.fillRect(115 + x, 144 + y, 1, 8);
        g2d.fillRect(109 + x, 146 + y, 1, 8);
        g2d.fillRect(116 + x, 149 + y, 1, 5);
        g2d.fillRect(108 + x, 150 + y, 1, 4);
        g2d.fillRect(111 + x, 150 + y, 1, 4);
        g2d.fillRect(112 + x, 150 + y, 1, 4);
        g2d.fillRect(107 + x, 152 + y, 1, 4);
        g2d.fillRect(113 + x, 152 + y, 1, 2);
        g2d.fillRect(114 + x, 152 + y, 1, 3);
        g2d.fillRect(115 + x, 154 + y, 1, 3);
        g2d.fillRect(106 + x, 155 + y, 1, 1);
        g2d.fillRect(116 + x, 155 + y, 1, 3);
        g2d.fillRect(117 + x, 155 + y, 1, 4);
        g2d.fillRect(105 + x, 156 + y, 1, 3);
        g2d.fillRect(118 + x, 157 + y, 1, 3);
        g2d.fillRect(119 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(115 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 1, 3);
        g2d.fillRect(115 + x, 102 + y, 1, 3);
        g2d.fillRect(113 + x, 113 + y, 1, 7);
        g2d.fillRect(113 + x, 125 + y, 1, 8);
        g2d.fillRect(112 + x, 133 + y, 1, 17);
        g2d.fillRect(111 + x, 149 + y, 1, 1);
        g2d.fillRect(113 + x, 149 + y, 1, 3);
        g2d.fillRect(114 + x, 150 + y, 1, 2);
        g2d.fillRect(115 + x, 152 + y, 1, 2);
        g2d.fillRect(116 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 159 + y, 5, 1);
        g2d.fillRect(107 + x, 161 + y, 1, 2);
        g2d.fillRect(113 + x, 161 + y, 1, 2);
        g2d.fillRect(114 + x, 161 + y, 1, 1);
        g2d.fillRect(108 + x, 162 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(108 + x, 156 + y, 1, 3);
        g2d.fillRect(109 + x, 156 + y, 1, 3);
        g2d.fillRect(110 + x, 156 + y, 1, 3);
        g2d.fillRect(111 + x, 156 + y, 1, 3);
        g2d.fillRect(107 + x, 157 + y, 1, 2);
        g2d.fillRect(112 + x, 157 + y, 1, 2);
        g2d.fillRect(113 + x, 157 + y, 1, 2);
    }

    public void paintpt(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 80 + y, 1, 10);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(121 + x, 81 + y, 1, 10);
        g2d.fillRect(103 + x, 82 + y, 3, 1);
        g2d.fillRect(114 + x, 82 + y, 4, 1);
        g2d.fillRect(106 + x, 83 + y, 8, 1);
        g2d.fillRect(108 + x, 87 + y, 6, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 3);
        g2d.fillRect(110 + x, 88 + y, 1, 3);
        g2d.fillRect(111 + x, 88 + y, 1, 3);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 82 + y, 1, 7);
        g2d.fillRect(102 + x, 83 + y, 4, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 83 + y, 5, 1);
        g2d.fillRect(105 + x, 84 + y, 9, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 7);
        g2d.fillRect(108 + x, 86 + y, 6, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 4);
        g2d.fillRect(107 + x, 87 + y, 1, 4);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 3);
        g2d.fillRect(113 + x, 88 + y, 1, 3);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 82 + y, 1, 9);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 84 + y, 1, 3);
        g2d.fillRect(103 + x, 84 + y, 1, 7);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 7);
        g2d.fillRect(117 + x, 84 + y, 1, 7);
        g2d.fillRect(118 + x, 84 + y, 1, 5);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 1, 6);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 3, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 5);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 3, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 4);
        g2d.fillRect(116 + x, 88 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
    }

    public void paintSeven(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 13);
        g2d.fillRect(121 + x, 91 + y, 1, 6);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 19);
        g2d.fillRect(112 + x, 104 + y, 1, 8);
        g2d.fillRect(111 + x, 112 + y, 1, 6);
        g2d.fillRect(121 + x, 116 + y, 1, 13);
        g2d.fillRect(110 + x, 118 + y, 1, 6);
        g2d.fillRect(109 + x, 124 + y, 1, 5);
        g2d.fillRect(108 + x, 129 + y, 1, 7);
        g2d.fillRect(122 + x, 129 + y, 1, 5);
        g2d.fillRect(123 + x, 134 + y, 1, 4);
        g2d.fillRect(107 + x, 136 + y, 1, 2);
        g2d.fillRect(111 + x, 137 + y, 5, 1);
        g2d.fillRect(106 + x, 138 + y, 1, 4);
        g2d.fillRect(115 + x, 138 + y, 2, 1);
        g2d.fillRect(124 + x, 138 + y, 1, 1);
        g2d.fillRect(117 + x, 139 + y, 1, 3);
        g2d.fillRect(125 + x, 139 + y, 1, 1);
        g2d.fillRect(109 + x, 140 + y, 1, 5);
        g2d.fillRect(126 + x, 140 + y, 1, 4);
        g2d.fillRect(118 + x, 141 + y, 1, 2);
        g2d.fillRect(105 + x, 142 + y, 1, 2);
        g2d.fillRect(104 + x, 143 + y, 1, 1);
        g2d.fillRect(119 + x, 143 + y, 1, 2);
        g2d.fillRect(125 + x, 143 + y, 1, 1);
        g2d.fillRect(127 + x, 143 + y, 1, 1);
        g2d.fillRect(106 + x, 144 + y, 3, 1);
        g2d.fillRect(122 + x, 144 + y, 3, 1);
        g2d.fillRect(120 + x, 145 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 6);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 6);
        g2d.fillRect(114 + x, 96 + y, 1, 12);
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 99 + y, 1, 21);
        g2d.fillRect(113 + x, 104 + y, 1, 18);
        g2d.fillRect(114 + x, 110 + y, 1, 2);
        g2d.fillRect(112 + x, 112 + y, 1, 17);
        g2d.fillRect(119 + x, 116 + y, 1, 15);
        g2d.fillRect(111 + x, 118 + y, 1, 14);
        g2d.fillRect(110 + x, 124 + y, 1, 10);
        g2d.fillRect(118 + x, 124 + y, 1, 3);
        g2d.fillRect(109 + x, 129 + y, 1, 8);
        g2d.fillRect(120 + x, 129 + y, 1, 8);
        g2d.fillRect(121 + x, 134 + y, 1, 5);
        g2d.fillRect(108 + x, 136 + y, 1, 2);
        g2d.fillRect(111 + x, 136 + y, 6, 1);
        g2d.fillRect(116 + x, 137 + y, 2, 1);
        g2d.fillRect(107 + x, 138 + y, 1, 6);
        g2d.fillRect(109 + x, 138 + y, 1, 2);
        g2d.fillRect(110 + x, 138 + y, 1, 1);
        g2d.fillRect(117 + x, 138 + y, 1, 1);
        g2d.fillRect(122 + x, 138 + y, 1, 3);
        g2d.fillRect(118 + x, 139 + y, 1, 2);
        g2d.fillRect(123 + x, 139 + y, 1, 5);
        g2d.fillRect(119 + x, 140 + y, 1, 3);
        g2d.fillRect(124 + x, 140 + y, 1, 4);
        g2d.fillRect(108 + x, 141 + y, 1, 3);
        g2d.fillRect(120 + x, 141 + y, 1, 4);
        g2d.fillRect(106 + x, 142 + y, 1, 2);
        g2d.fillRect(121 + x, 142 + y, 1, 3);
        g2d.fillRect(122 + x, 143 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 91 + y, 1, 6);
        g2d.fillRect(119 + x, 97 + y, 1, 19);
        g2d.fillRect(120 + x, 116 + y, 1, 13);
        g2d.fillRect(121 + x, 129 + y, 1, 5);
        g2d.fillRect(122 + x, 134 + y, 1, 4);
        g2d.fillRect(123 + x, 138 + y, 1, 1);
        g2d.fillRect(124 + x, 139 + y, 1, 1);
        g2d.fillRect(125 + x, 140 + y, 1, 3);
        g2d.fillRect(110 + x, 141 + y, 1, 2);
        g2d.fillRect(116 + x, 141 + y, 1, 2);
        g2d.fillRect(111 + x, 142 + y, 1, 2);
        g2d.fillRect(112 + x, 142 + y, 1, 2);
        g2d.fillRect(113 + x, 142 + y, 1, 2);
        g2d.fillRect(114 + x, 142 + y, 1, 2);
        g2d.fillRect(115 + x, 142 + y, 1, 2);
        g2d.fillRect(117 + x, 142 + y, 1, 1);
        g2d.fillRect(118 + x, 143 + y, 1, 1);
        g2d.fillRect(117 + x, 144 + y, 1, 1);
        g2d.fillRect(110 + x, 145 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 41);
        g2d.fillRect(118 + x, 91 + y, 1, 8);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 4);
        g2d.fillRect(115 + x, 101 + y, 1, 17);
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(116 + x, 108 + y, 1, 5);
        g2d.fillRect(114 + x, 112 + y, 1, 19);
        g2d.fillRect(116 + x, 118 + y, 1, 13);
        g2d.fillRect(118 + x, 120 + y, 1, 4);
        g2d.fillRect(113 + x, 122 + y, 1, 14);
        g2d.fillRect(118 + x, 127 + y, 1, 7);
        g2d.fillRect(112 + x, 129 + y, 1, 7);
        g2d.fillRect(119 + x, 131 + y, 1, 5);
        g2d.fillRect(111 + x, 132 + y, 1, 4);
        g2d.fillRect(114 + x, 132 + y, 1, 4);
        g2d.fillRect(115 + x, 132 + y, 1, 4);
        g2d.fillRect(110 + x, 134 + y, 1, 4);
        g2d.fillRect(116 + x, 134 + y, 1, 2);
        g2d.fillRect(117 + x, 134 + y, 1, 3);
        g2d.fillRect(118 + x, 136 + y, 1, 3);
        g2d.fillRect(109 + x, 137 + y, 1, 1);
        g2d.fillRect(119 + x, 137 + y, 1, 3);
        g2d.fillRect(120 + x, 137 + y, 1, 4);
        g2d.fillRect(108 + x, 138 + y, 1, 3);
        g2d.fillRect(121 + x, 139 + y, 1, 3);
        g2d.fillRect(122 + x, 141 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(116 + x, 101 + y, 1, 7);
        g2d.fillRect(116 + x, 113 + y, 1, 5);
        g2d.fillRect(115 + x, 118 + y, 1, 14);
        g2d.fillRect(114 + x, 131 + y, 1, 1);
        g2d.fillRect(116 + x, 131 + y, 1, 3);
        g2d.fillRect(117 + x, 132 + y, 1, 2);
        g2d.fillRect(118 + x, 134 + y, 1, 2);
        g2d.fillRect(119 + x, 136 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 141 + y, 5, 1);
        g2d.fillRect(110 + x, 143 + y, 1, 2);
        g2d.fillRect(116 + x, 143 + y, 1, 2);
        g2d.fillRect(117 + x, 143 + y, 1, 1);
        g2d.fillRect(111 + x, 144 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(111 + x, 138 + y, 1, 3);
        g2d.fillRect(112 + x, 138 + y, 1, 3);
        g2d.fillRect(113 + x, 138 + y, 1, 3);
        g2d.fillRect(114 + x, 138 + y, 1, 3);
        g2d.fillRect(110 + x, 139 + y, 1, 2);
        g2d.fillRect(115 + x, 139 + y, 1, 2);
        g2d.fillRect(116 + x, 139 + y, 1, 2);
    }

    public void paintSix(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 9);
        g2d.fillRect(121 + x, 91 + y, 1, 8);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(112 + x, 100 + y, 1, 8);
        g2d.fillRect(119 + x, 101 + y, 1, 20);
        g2d.fillRect(111 + x, 108 + y, 1, 8);
        g2d.fillRect(110 + x, 116 + y, 1, 7);
        g2d.fillRect(120 + x, 121 + y, 1, 13);
        g2d.fillRect(109 + x, 123 + y, 1, 7);
        g2d.fillRect(108 + x, 130 + y, 1, 4);
        g2d.fillRect(107 + x, 134 + y, 1, 6);
        g2d.fillRect(121 + x, 134 + y, 1, 4);
        g2d.fillRect(122 + x, 138 + y, 1, 4);
        g2d.fillRect(106 + x, 140 + y, 1, 2);
        g2d.fillRect(110 + x, 141 + y, 5, 1);
        g2d.fillRect(105 + x, 142 + y, 1, 4);
        g2d.fillRect(114 + x, 142 + y, 2, 1);
        g2d.fillRect(123 + x, 142 + y, 1, 1);
        g2d.fillRect(116 + x, 143 + y, 1, 3);
        g2d.fillRect(124 + x, 143 + y, 1, 1);
        g2d.fillRect(108 + x, 144 + y, 1, 5);
        g2d.fillRect(125 + x, 144 + y, 1, 4);
        g2d.fillRect(117 + x, 145 + y, 1, 2);
        g2d.fillRect(104 + x, 146 + y, 1, 2);
        g2d.fillRect(103 + x, 147 + y, 1, 1);
        g2d.fillRect(118 + x, 147 + y, 1, 2);
        g2d.fillRect(124 + x, 147 + y, 1, 1);
        g2d.fillRect(126 + x, 147 + y, 1, 1);
        g2d.fillRect(105 + x, 148 + y, 3, 1);
        g2d.fillRect(121 + x, 148 + y, 3, 1);
        g2d.fillRect(119 + x, 149 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 4);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 6);
        g2d.fillRect(114 + x, 96 + y, 1, 9);
        g2d.fillRect(119 + x, 96 + y, 1, 3);
        g2d.fillRect(118 + x, 99 + y, 1, 2);
        g2d.fillRect(113 + x, 100 + y, 1, 12);
        g2d.fillRect(117 + x, 103 + y, 1, 22);
        g2d.fillRect(112 + x, 108 + y, 1, 20);
        g2d.fillRect(113 + x, 114 + y, 1, 2);
        g2d.fillRect(111 + x, 116 + y, 1, 18);
        g2d.fillRect(118 + x, 121 + y, 1, 14);
        g2d.fillRect(110 + x, 123 + y, 1, 13);
        g2d.fillRect(109 + x, 130 + y, 1, 8);
        g2d.fillRect(117 + x, 130 + y, 1, 2);
        g2d.fillRect(108 + x, 134 + y, 1, 7);
        g2d.fillRect(119 + x, 134 + y, 1, 7);
        g2d.fillRect(120 + x, 138 + y, 1, 5);
        g2d.fillRect(107 + x, 140 + y, 1, 2);
        g2d.fillRect(110 + x, 140 + y, 6, 1);
        g2d.fillRect(115 + x, 141 + y, 2, 1);
        g2d.fillRect(106 + x, 142 + y, 1, 6);
        g2d.fillRect(108 + x, 142 + y, 1, 2);
        g2d.fillRect(109 + x, 142 + y, 1, 1);
        g2d.fillRect(116 + x, 142 + y, 1, 1);
        g2d.fillRect(121 + x, 142 + y, 1, 3);
        g2d.fillRect(117 + x, 143 + y, 1, 2);
        g2d.fillRect(122 + x, 143 + y, 1, 5);
        g2d.fillRect(118 + x, 144 + y, 1, 3);
        g2d.fillRect(123 + x, 144 + y, 1, 4);
        g2d.fillRect(107 + x, 145 + y, 1, 3);
        g2d.fillRect(119 + x, 145 + y, 1, 4);
        g2d.fillRect(105 + x, 146 + y, 1, 2);
        g2d.fillRect(120 + x, 146 + y, 1, 3);
        g2d.fillRect(121 + x, 147 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 91 + y, 1, 8);
        g2d.fillRect(119 + x, 99 + y, 1, 2);
        g2d.fillRect(118 + x, 101 + y, 1, 20);
        g2d.fillRect(119 + x, 121 + y, 1, 13);
        g2d.fillRect(120 + x, 134 + y, 1, 4);
        g2d.fillRect(121 + x, 138 + y, 1, 4);
        g2d.fillRect(122 + x, 142 + y, 1, 1);
        g2d.fillRect(123 + x, 143 + y, 1, 1);
        g2d.fillRect(124 + x, 144 + y, 1, 3);
        g2d.fillRect(109 + x, 145 + y, 1, 2);
        g2d.fillRect(115 + x, 145 + y, 1, 2);
        g2d.fillRect(110 + x, 146 + y, 1, 2);
        g2d.fillRect(111 + x, 146 + y, 1, 2);
        g2d.fillRect(112 + x, 146 + y, 1, 2);
        g2d.fillRect(113 + x, 146 + y, 1, 2);
        g2d.fillRect(114 + x, 146 + y, 1, 2);
        g2d.fillRect(116 + x, 146 + y, 1, 1);
        g2d.fillRect(117 + x, 147 + y, 1, 1);
        g2d.fillRect(116 + x, 148 + y, 1, 1);
        g2d.fillRect(109 + x, 149 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 5);
        g2d.fillRect(118 + x, 91 + y, 1, 8);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 41);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 4);
        g2d.fillRect(115 + x, 101 + y, 1, 4);
        g2d.fillRect(114 + x, 105 + y, 1, 18);
        g2d.fillRect(113 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 1, 5);
        g2d.fillRect(113 + x, 116 + y, 1, 19);
        g2d.fillRect(115 + x, 123 + y, 1, 12);
        g2d.fillRect(117 + x, 125 + y, 1, 5);
        g2d.fillRect(112 + x, 128 + y, 1, 12);
        g2d.fillRect(117 + x, 132 + y, 1, 6);
        g2d.fillRect(111 + x, 134 + y, 1, 6);
        g2d.fillRect(118 + x, 135 + y, 1, 5);
        g2d.fillRect(110 + x, 136 + y, 1, 4);
        g2d.fillRect(113 + x, 136 + y, 1, 4);
        g2d.fillRect(114 + x, 136 + y, 1, 4);
        g2d.fillRect(109 + x, 138 + y, 1, 4);
        g2d.fillRect(115 + x, 138 + y, 1, 2);
        g2d.fillRect(116 + x, 138 + y, 1, 3);
        g2d.fillRect(117 + x, 140 + y, 1, 3);
        g2d.fillRect(108 + x, 141 + y, 1, 1);
        g2d.fillRect(118 + x, 141 + y, 1, 3);
        g2d.fillRect(119 + x, 141 + y, 1, 4);
        g2d.fillRect(107 + x, 142 + y, 1, 3);
        g2d.fillRect(120 + x, 143 + y, 1, 3);
        g2d.fillRect(121 + x, 145 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 96 + y, 1, 3);
        g2d.fillRect(115 + x, 105 + y, 1, 7);
        g2d.fillRect(115 + x, 117 + y, 1, 6);
        g2d.fillRect(114 + x, 123 + y, 1, 13);
        g2d.fillRect(113 + x, 135 + y, 1, 1);
        g2d.fillRect(115 + x, 135 + y, 1, 3);
        g2d.fillRect(116 + x, 136 + y, 1, 2);
        g2d.fillRect(117 + x, 138 + y, 1, 2);
        g2d.fillRect(118 + x, 140 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 145 + y, 5, 1);
        g2d.fillRect(109 + x, 147 + y, 1, 2);
        g2d.fillRect(115 + x, 147 + y, 1, 2);
        g2d.fillRect(116 + x, 147 + y, 1, 1);
        g2d.fillRect(110 + x, 148 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 142 + y, 1, 3);
        g2d.fillRect(111 + x, 142 + y, 1, 3);
        g2d.fillRect(112 + x, 142 + y, 1, 3);
        g2d.fillRect(113 + x, 142 + y, 1, 3);
        g2d.fillRect(109 + x, 143 + y, 1, 2);
        g2d.fillRect(114 + x, 143 + y, 1, 2);
        g2d.fillRect(115 + x, 143 + y, 1, 2);
    }

    public void paintThree(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 16);
        g2d.fillRect(121 + x, 91 + y, 1, 14);
        g2d.fillRect(120 + x, 105 + y, 1, 3);
        g2d.fillRect(112 + x, 107 + y, 1, 9);
        g2d.fillRect(119 + x, 108 + y, 1, 21);
        g2d.fillRect(111 + x, 116 + y, 1, 8);
        g2d.fillRect(110 + x, 124 + y, 1, 8);
        g2d.fillRect(120 + x, 129 + y, 1, 17);
        g2d.fillRect(109 + x, 132 + y, 1, 8);
        g2d.fillRect(108 + x, 140 + y, 1, 6);
        g2d.fillRect(107 + x, 146 + y, 1, 8);
        g2d.fillRect(121 + x, 146 + y, 1, 6);
        g2d.fillRect(122 + x, 152 + y, 1, 4);
        g2d.fillRect(106 + x, 154 + y, 1, 2);
        g2d.fillRect(110 + x, 155 + y, 5, 1);
        g2d.fillRect(105 + x, 156 + y, 1, 4);
        g2d.fillRect(114 + x, 156 + y, 2, 1);
        g2d.fillRect(123 + x, 156 + y, 1, 1);
        g2d.fillRect(116 + x, 157 + y, 1, 3);
        g2d.fillRect(124 + x, 157 + y, 1, 1);
        g2d.fillRect(108 + x, 158 + y, 1, 5);
        g2d.fillRect(125 + x, 158 + y, 1, 4);
        g2d.fillRect(117 + x, 159 + y, 1, 2);
        g2d.fillRect(104 + x, 160 + y, 1, 2);
        g2d.fillRect(103 + x, 161 + y, 1, 1);
        g2d.fillRect(118 + x, 161 + y, 1, 2);
        g2d.fillRect(124 + x, 161 + y, 1, 1);
        g2d.fillRect(126 + x, 161 + y, 1, 1);
        g2d.fillRect(105 + x, 162 + y, 3, 1);
        g2d.fillRect(121 + x, 162 + y, 3, 1);
        g2d.fillRect(119 + x, 163 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 91 + y, 1, 22);
        g2d.fillRect(119 + x, 91 + y, 1, 10);
        g2d.fillRect(115 + x, 98 + y, 1, 10);
        g2d.fillRect(119 + x, 102 + y, 1, 3);
        g2d.fillRect(118 + x, 106 + y, 1, 2);
        g2d.fillRect(113 + x, 107 + y, 1, 13);
        g2d.fillRect(117 + x, 111 + y, 1, 24);
        g2d.fillRect(112 + x, 116 + y, 1, 22);
        g2d.fillRect(113 + x, 122 + y, 1, 2);
        g2d.fillRect(111 + x, 124 + y, 1, 22);
        g2d.fillRect(118 + x, 129 + y, 1, 20);
        g2d.fillRect(110 + x, 132 + y, 1, 18);
        g2d.fillRect(109 + x, 140 + y, 1, 12);
        g2d.fillRect(117 + x, 141 + y, 1, 3);
        g2d.fillRect(108 + x, 146 + y, 1, 9);
        g2d.fillRect(119 + x, 146 + y, 1, 9);
        g2d.fillRect(120 + x, 152 + y, 1, 5);
        g2d.fillRect(107 + x, 154 + y, 1, 2);
        g2d.fillRect(110 + x, 154 + y, 6, 1);
        g2d.fillRect(115 + x, 155 + y, 2, 1);
        g2d.fillRect(106 + x, 156 + y, 1, 6);
        g2d.fillRect(108 + x, 156 + y, 1, 2);
        g2d.fillRect(109 + x, 156 + y, 1, 1);
        g2d.fillRect(116 + x, 156 + y, 1, 1);
        g2d.fillRect(121 + x, 156 + y, 1, 3);
        g2d.fillRect(117 + x, 157 + y, 1, 2);
        g2d.fillRect(122 + x, 157 + y, 1, 5);
        g2d.fillRect(118 + x, 158 + y, 1, 3);
        g2d.fillRect(123 + x, 158 + y, 1, 4);
        g2d.fillRect(107 + x, 159 + y, 1, 3);
        g2d.fillRect(119 + x, 159 + y, 1, 4);
        g2d.fillRect(105 + x, 160 + y, 1, 2);
        g2d.fillRect(120 + x, 160 + y, 1, 3);
        g2d.fillRect(121 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 91 + y, 1, 14);
        g2d.fillRect(119 + x, 105 + y, 1, 3);
        g2d.fillRect(118 + x, 108 + y, 1, 21);
        g2d.fillRect(119 + x, 129 + y, 1, 17);
        g2d.fillRect(120 + x, 146 + y, 1, 6);
        g2d.fillRect(121 + x, 152 + y, 1, 4);
        g2d.fillRect(122 + x, 156 + y, 1, 1);
        g2d.fillRect(123 + x, 157 + y, 1, 1);
        g2d.fillRect(124 + x, 158 + y, 1, 3);
        g2d.fillRect(109 + x, 159 + y, 1, 2);
        g2d.fillRect(115 + x, 159 + y, 1, 2);
        g2d.fillRect(110 + x, 160 + y, 1, 2);
        g2d.fillRect(111 + x, 160 + y, 1, 2);
        g2d.fillRect(112 + x, 160 + y, 1, 2);
        g2d.fillRect(113 + x, 160 + y, 1, 2);
        g2d.fillRect(114 + x, 160 + y, 1, 2);
        g2d.fillRect(116 + x, 160 + y, 1, 1);
        g2d.fillRect(117 + x, 161 + y, 1, 1);
        g2d.fillRect(116 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 163 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 91 + y, 1, 7);
        g2d.fillRect(117 + x, 91 + y, 1, 7);
        g2d.fillRect(118 + x, 91 + y, 1, 15);
        g2d.fillRect(116 + x, 95 + y, 1, 2);
        g2d.fillRect(116 + x, 98 + y, 1, 52);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 6);
        g2d.fillRect(115 + x, 108 + y, 1, 5);
        g2d.fillRect(114 + x, 113 + y, 1, 20);
        g2d.fillRect(113 + x, 120 + y, 1, 2);
        g2d.fillRect(115 + x, 120 + y, 1, 5);
        g2d.fillRect(113 + x, 124 + y, 1, 25);
        g2d.fillRect(115 + x, 133 + y, 1, 16);
        g2d.fillRect(117 + x, 135 + y, 1, 6);
        g2d.fillRect(112 + x, 138 + y, 1, 16);
        g2d.fillRect(117 + x, 144 + y, 1, 8);
        g2d.fillRect(111 + x, 146 + y, 1, 8);
        g2d.fillRect(118 + x, 149 + y, 1, 5);
        g2d.fillRect(110 + x, 150 + y, 1, 4);
        g2d.fillRect(113 + x, 150 + y, 1, 4);
        g2d.fillRect(114 + x, 150 + y, 1, 4);
        g2d.fillRect(109 + x, 152 + y, 1, 4);
        g2d.fillRect(115 + x, 152 + y, 1, 2);
        g2d.fillRect(116 + x, 152 + y, 1, 3);
        g2d.fillRect(117 + x, 154 + y, 1, 3);
        g2d.fillRect(108 + x, 155 + y, 1, 1);
        g2d.fillRect(118 + x, 155 + y, 1, 3);
        g2d.fillRect(119 + x, 155 + y, 1, 4);
        g2d.fillRect(107 + x, 156 + y, 1, 3);
        g2d.fillRect(120 + x, 157 + y, 1, 3);
        g2d.fillRect(121 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 3);
        g2d.fillRect(117 + x, 102 + y, 1, 3);
        g2d.fillRect(115 + x, 113 + y, 1, 7);
        g2d.fillRect(115 + x, 125 + y, 1, 8);
        g2d.fillRect(114 + x, 133 + y, 1, 17);
        g2d.fillRect(113 + x, 149 + y, 1, 1);
        g2d.fillRect(115 + x, 149 + y, 1, 3);
        g2d.fillRect(116 + x, 150 + y, 1, 2);
        g2d.fillRect(117 + x, 152 + y, 1, 2);
        g2d.fillRect(118 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 159 + y, 5, 1);
        g2d.fillRect(109 + x, 161 + y, 1, 2);
        g2d.fillRect(115 + x, 161 + y, 1, 2);
        g2d.fillRect(116 + x, 161 + y, 1, 1);
        g2d.fillRect(110 + x, 162 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 156 + y, 1, 3);
        g2d.fillRect(111 + x, 156 + y, 1, 3);
        g2d.fillRect(112 + x, 156 + y, 1, 3);
        g2d.fillRect(113 + x, 156 + y, 1, 3);
        g2d.fillRect(109 + x, 157 + y, 1, 2);
        g2d.fillRect(114 + x, 157 + y, 1, 2);
        g2d.fillRect(115 + x, 157 + y, 1, 2);
    }

    public void paintTwo(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 11);
        g2d.fillRect(121 + x, 91 + y, 1, 10);
        g2d.fillRect(120 + x, 101 + y, 1, 4);
        g2d.fillRect(112 + x, 102 + y, 1, 5);
        g2d.fillRect(119 + x, 105 + y, 1, 3);
        g2d.fillRect(111 + x, 107 + y, 1, 9);
        g2d.fillRect(118 + x, 108 + y, 1, 21);
        g2d.fillRect(110 + x, 116 + y, 1, 8);
        g2d.fillRect(109 + x, 124 + y, 1, 8);
        g2d.fillRect(119 + x, 129 + y, 1, 17);
        g2d.fillRect(108 + x, 132 + y, 1, 8);
        g2d.fillRect(107 + x, 140 + y, 1, 6);
        g2d.fillRect(106 + x, 146 + y, 1, 8);
        g2d.fillRect(120 + x, 146 + y, 1, 6);
        g2d.fillRect(121 + x, 152 + y, 1, 4);
        g2d.fillRect(105 + x, 154 + y, 1, 2);
        g2d.fillRect(109 + x, 155 + y, 5, 1);
        g2d.fillRect(104 + x, 156 + y, 1, 4);
        g2d.fillRect(113 + x, 156 + y, 2, 1);
        g2d.fillRect(122 + x, 156 + y, 1, 1);
        g2d.fillRect(115 + x, 157 + y, 1, 3);
        g2d.fillRect(123 + x, 157 + y, 1, 1);
        g2d.fillRect(107 + x, 158 + y, 1, 5);
        g2d.fillRect(124 + x, 158 + y, 1, 4);
        g2d.fillRect(116 + x, 159 + y, 1, 2);
        g2d.fillRect(103 + x, 160 + y, 1, 2);
        g2d.fillRect(102 + x, 161 + y, 1, 1);
        g2d.fillRect(117 + x, 161 + y, 1, 2);
        g2d.fillRect(123 + x, 161 + y, 1, 1);
        g2d.fillRect(125 + x, 161 + y, 1, 1);
        g2d.fillRect(104 + x, 162 + y, 3, 1);
        g2d.fillRect(120 + x, 162 + y, 3, 1);
        g2d.fillRect(118 + x, 163 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 91 + y, 1, 17);
        g2d.fillRect(119 + x, 91 + y, 1, 10);
        g2d.fillRect(115 + x, 98 + y, 1, 3);
        g2d.fillRect(113 + x, 102 + y, 1, 11);
        g2d.fillRect(118 + x, 102 + y, 1, 3);
        g2d.fillRect(117 + x, 106 + y, 1, 2);
        g2d.fillRect(112 + x, 107 + y, 1, 13);
        g2d.fillRect(116 + x, 111 + y, 1, 24);
        g2d.fillRect(111 + x, 116 + y, 1, 22);
        g2d.fillRect(112 + x, 122 + y, 1, 2);
        g2d.fillRect(110 + x, 124 + y, 1, 22);
        g2d.fillRect(117 + x, 129 + y, 1, 20);
        g2d.fillRect(109 + x, 132 + y, 1, 18);
        g2d.fillRect(108 + x, 140 + y, 1, 12);
        g2d.fillRect(116 + x, 141 + y, 1, 3);
        g2d.fillRect(107 + x, 146 + y, 1, 9);
        g2d.fillRect(118 + x, 146 + y, 1, 9);
        g2d.fillRect(119 + x, 152 + y, 1, 5);
        g2d.fillRect(106 + x, 154 + y, 1, 2);
        g2d.fillRect(109 + x, 154 + y, 6, 1);
        g2d.fillRect(114 + x, 155 + y, 2, 1);
        g2d.fillRect(105 + x, 156 + y, 1, 6);
        g2d.fillRect(107 + x, 156 + y, 1, 2);
        g2d.fillRect(108 + x, 156 + y, 1, 1);
        g2d.fillRect(115 + x, 156 + y, 1, 1);
        g2d.fillRect(120 + x, 156 + y, 1, 3);
        g2d.fillRect(116 + x, 157 + y, 1, 2);
        g2d.fillRect(121 + x, 157 + y, 1, 5);
        g2d.fillRect(117 + x, 158 + y, 1, 3);
        g2d.fillRect(122 + x, 158 + y, 1, 4);
        g2d.fillRect(106 + x, 159 + y, 1, 3);
        g2d.fillRect(118 + x, 159 + y, 1, 4);
        g2d.fillRect(104 + x, 160 + y, 1, 2);
        g2d.fillRect(119 + x, 160 + y, 1, 3);
        g2d.fillRect(120 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 91 + y, 1, 10);
        g2d.fillRect(119 + x, 101 + y, 1, 4);
        g2d.fillRect(118 + x, 105 + y, 1, 3);
        g2d.fillRect(117 + x, 108 + y, 1, 21);
        g2d.fillRect(118 + x, 129 + y, 1, 17);
        g2d.fillRect(119 + x, 146 + y, 1, 6);
        g2d.fillRect(120 + x, 152 + y, 1, 4);
        g2d.fillRect(121 + x, 156 + y, 1, 1);
        g2d.fillRect(122 + x, 157 + y, 1, 1);
        g2d.fillRect(123 + x, 158 + y, 1, 3);
        g2d.fillRect(108 + x, 159 + y, 1, 2);
        g2d.fillRect(114 + x, 159 + y, 1, 2);
        g2d.fillRect(109 + x, 160 + y, 1, 2);
        g2d.fillRect(110 + x, 160 + y, 1, 2);
        g2d.fillRect(111 + x, 160 + y, 1, 2);
        g2d.fillRect(112 + x, 160 + y, 1, 2);
        g2d.fillRect(113 + x, 160 + y, 1, 2);
        g2d.fillRect(115 + x, 160 + y, 1, 1);
        g2d.fillRect(116 + x, 161 + y, 1, 1);
        g2d.fillRect(115 + x, 162 + y, 1, 1);
        g2d.fillRect(108 + x, 163 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 91 + y, 1, 7);
        g2d.fillRect(117 + x, 91 + y, 1, 7);
        g2d.fillRect(118 + x, 91 + y, 1, 11);
        g2d.fillRect(116 + x, 95 + y, 1, 2);
        g2d.fillRect(116 + x, 98 + y, 1, 4);
        g2d.fillRect(115 + x, 101 + y, 1, 49);
        g2d.fillRect(117 + x, 101 + y, 1, 5);
        g2d.fillRect(116 + x, 105 + y, 1, 6);
        g2d.fillRect(114 + x, 108 + y, 1, 5);
        g2d.fillRect(113 + x, 113 + y, 1, 20);
        g2d.fillRect(112 + x, 120 + y, 1, 2);
        g2d.fillRect(114 + x, 120 + y, 1, 5);
        g2d.fillRect(112 + x, 124 + y, 1, 25);
        g2d.fillRect(114 + x, 133 + y, 1, 16);
        g2d.fillRect(116 + x, 135 + y, 1, 6);
        g2d.fillRect(111 + x, 138 + y, 1, 16);
        g2d.fillRect(116 + x, 144 + y, 1, 8);
        g2d.fillRect(110 + x, 146 + y, 1, 8);
        g2d.fillRect(117 + x, 149 + y, 1, 5);
        g2d.fillRect(109 + x, 150 + y, 1, 4);
        g2d.fillRect(112 + x, 150 + y, 1, 4);
        g2d.fillRect(113 + x, 150 + y, 1, 4);
        g2d.fillRect(108 + x, 152 + y, 1, 4);
        g2d.fillRect(114 + x, 152 + y, 1, 2);
        g2d.fillRect(115 + x, 152 + y, 1, 3);
        g2d.fillRect(116 + x, 154 + y, 1, 3);
        g2d.fillRect(107 + x, 155 + y, 1, 1);
        g2d.fillRect(117 + x, 155 + y, 1, 3);
        g2d.fillRect(118 + x, 155 + y, 1, 4);
        g2d.fillRect(106 + x, 156 + y, 1, 3);
        g2d.fillRect(119 + x, 157 + y, 1, 3);
        g2d.fillRect(120 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 3);
        g2d.fillRect(116 + x, 102 + y, 1, 3);
        g2d.fillRect(114 + x, 113 + y, 1, 7);
        g2d.fillRect(114 + x, 125 + y, 1, 8);
        g2d.fillRect(113 + x, 133 + y, 1, 17);
        g2d.fillRect(112 + x, 149 + y, 1, 1);
        g2d.fillRect(114 + x, 149 + y, 1, 3);
        g2d.fillRect(115 + x, 150 + y, 1, 2);
        g2d.fillRect(116 + x, 152 + y, 1, 2);
        g2d.fillRect(117 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 159 + y, 5, 1);
        g2d.fillRect(108 + x, 161 + y, 1, 2);
        g2d.fillRect(114 + x, 161 + y, 1, 2);
        g2d.fillRect(115 + x, 161 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 156 + y, 1, 3);
        g2d.fillRect(110 + x, 156 + y, 1, 3);
        g2d.fillRect(111 + x, 156 + y, 1, 3);
        g2d.fillRect(112 + x, 156 + y, 1, 3);
        g2d.fillRect(108 + x, 157 + y, 1, 2);
        g2d.fillRect(113 + x, 157 + y, 1, 2);
        g2d.fillRect(114 + x, 157 + y, 1, 2);
    }

    public void paintBackFive(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 8);
        g2d.fillRect(94 + x, 91 + y, 1, 7);
        g2d.fillRect(95 + x, 98 + y, 1, 4);
        g2d.fillRect(103 + x, 99 + y, 1, 4);
        g2d.fillRect(96 + x, 102 + y, 1, 2);
        g2d.fillRect(104 + x, 103 + y, 1, 8);
        g2d.fillRect(97 + x, 104 + y, 1, 20);
        g2d.fillRect(105 + x, 111 + y, 1, 8);
        g2d.fillRect(106 + x, 119 + y, 1, 8);
        g2d.fillRect(96 + x, 124 + y, 1, 14);
        g2d.fillRect(107 + x, 127 + y, 1, 7);
        g2d.fillRect(108 + x, 134 + y, 1, 4);
        g2d.fillRect(109 + x, 138 + y, 1, 8);
        g2d.fillRect(95 + x, 138 + y, 1, 6);
        g2d.fillRect(94 + x, 144 + y, 1, 4);
        g2d.fillRect(110 + x, 146 + y, 1, 2);
        g2d.fillRect(102 + x, 147 + y, 5, 1);
        g2d.fillRect(111 + x, 148 + y, 1, 4);
        g2d.fillRect(101 + x, 148 + y, 2, 1);
        g2d.fillRect(93 + x, 148 + y, 1, 1);
        g2d.fillRect(100 + x, 149 + y, 1, 3);
        g2d.fillRect(92 + x, 149 + y, 1, 1);
        g2d.fillRect(108 + x, 150 + y, 1, 5);
        g2d.fillRect(91 + x, 150 + y, 1, 4);
        g2d.fillRect(99 + x, 151 + y, 1, 2);
        g2d.fillRect(112 + x, 152 + y, 1, 2);
        g2d.fillRect(113 + x, 153 + y, 1, 1);
        g2d.fillRect(98 + x, 153 + y, 1, 2);
        g2d.fillRect(92 + x, 153 + y, 1, 1);
        g2d.fillRect(90 + x, 153 + y, 1, 1);
        g2d.fillRect(109 + x, 154 + y, 3, 1);
        g2d.fillRect(93 + x, 154 + y, 3, 1);
        g2d.fillRect(96 + x, 155 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 1, 2);
        g2d.fillRect(96 + x, 91 + y, 1, 7);
        g2d.fillRect(101 + x, 94 + y, 1, 10);
        g2d.fillRect(100 + x, 95 + y, 1, 3);
        g2d.fillRect(102 + x, 99 + y, 1, 9);
        g2d.fillRect(97 + x, 99 + y, 1, 3);
        g2d.fillRect(98 + x, 102 + y, 1, 2);
        g2d.fillRect(103 + x, 103 + y, 1, 12);
        g2d.fillRect(99 + x, 106 + y, 1, 24);
        g2d.fillRect(104 + x, 111 + y, 1, 21);
        g2d.fillRect(103 + x, 117 + y, 1, 2);
        g2d.fillRect(105 + x, 119 + y, 1, 19);
        g2d.fillRect(98 + x, 124 + y, 1, 17);
        g2d.fillRect(106 + x, 127 + y, 1, 15);
        g2d.fillRect(107 + x, 134 + y, 1, 10);
        g2d.fillRect(99 + x, 134 + y, 1, 2);
        g2d.fillRect(108 + x, 138 + y, 1, 9);
        g2d.fillRect(97 + x, 138 + y, 1, 9);
        g2d.fillRect(96 + x, 144 + y, 1, 5);
        g2d.fillRect(109 + x, 146 + y, 1, 2);
        g2d.fillRect(101 + x, 146 + y, 6, 1);
        g2d.fillRect(100 + x, 147 + y, 2, 1);
        g2d.fillRect(110 + x, 148 + y, 1, 6);
        g2d.fillRect(108 + x, 148 + y, 1, 2);
        g2d.fillRect(107 + x, 148 + y, 1, 1);
        g2d.fillRect(100 + x, 148 + y, 1, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 3);
        g2d.fillRect(99 + x, 149 + y, 1, 2);
        g2d.fillRect(94 + x, 149 + y, 1, 5);
        g2d.fillRect(98 + x, 150 + y, 1, 3);
        g2d.fillRect(93 + x, 150 + y, 1, 4);
        g2d.fillRect(109 + x, 151 + y, 1, 3);
        g2d.fillRect(97 + x, 151 + y, 1, 4);
        g2d.fillRect(111 + x, 152 + y, 1, 2);
        g2d.fillRect(96 + x, 152 + y, 1, 3);
        g2d.fillRect(95 + x, 153 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 91 + y, 1, 7);
        g2d.fillRect(96 + x, 98 + y, 1, 4);
        g2d.fillRect(97 + x, 102 + y, 1, 2);
        g2d.fillRect(98 + x, 104 + y, 1, 20);
        g2d.fillRect(97 + x, 124 + y, 1, 14);
        g2d.fillRect(96 + x, 138 + y, 1, 6);
        g2d.fillRect(95 + x, 144 + y, 1, 4);
        g2d.fillRect(94 + x, 148 + y, 1, 1);
        g2d.fillRect(93 + x, 149 + y, 1, 1);
        g2d.fillRect(92 + x, 150 + y, 1, 3);
        g2d.fillRect(107 + x, 151 + y, 1, 2);
        g2d.fillRect(101 + x, 151 + y, 1, 2);
        g2d.fillRect(106 + x, 152 + y, 1, 2);
        g2d.fillRect(105 + x, 152 + y, 1, 2);
        g2d.fillRect(104 + x, 152 + y, 1, 2);
        g2d.fillRect(103 + x, 152 + y, 1, 2);
        g2d.fillRect(102 + x, 152 + y, 1, 2);
        g2d.fillRect(100 + x, 152 + y, 1, 1);
        g2d.fillRect(99 + x, 153 + y, 1, 1);
        g2d.fillRect(100 + x, 154 + y, 1, 1);
        g2d.fillRect(101 + x, 155 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 91 + y, 1, 4);
        g2d.fillRect(98 + x, 91 + y, 1, 4);
        g2d.fillRect(97 + x, 91 + y, 1, 8);
        g2d.fillRect(101 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 4);
        g2d.fillRect(100 + x, 98 + y, 1, 44);
        g2d.fillRect(98 + x, 98 + y, 1, 4);
        g2d.fillRect(99 + x, 102 + y, 1, 4);
        g2d.fillRect(101 + x, 104 + y, 1, 4);
        g2d.fillRect(102 + x, 108 + y, 1, 20);
        g2d.fillRect(103 + x, 115 + y, 1, 2);
        g2d.fillRect(101 + x, 115 + y, 1, 5);
        g2d.fillRect(103 + x, 119 + y, 1, 22);
        g2d.fillRect(101 + x, 128 + y, 1, 13);
        g2d.fillRect(99 + x, 130 + y, 1, 4);
        g2d.fillRect(104 + x, 132 + y, 1, 14);
        g2d.fillRect(99 + x, 136 + y, 1, 8);
        g2d.fillRect(105 + x, 138 + y, 1, 8);
        g2d.fillRect(98 + x, 141 + y, 1, 5);
        g2d.fillRect(106 + x, 142 + y, 1, 4);
        g2d.fillRect(103 + x, 142 + y, 1, 4);
        g2d.fillRect(102 + x, 142 + y, 1, 4);
        g2d.fillRect(107 + x, 144 + y, 1, 4);
        g2d.fillRect(101 + x, 144 + y, 1, 2);
        g2d.fillRect(100 + x, 144 + y, 1, 3);
        g2d.fillRect(99 + x, 146 + y, 1, 3);
        g2d.fillRect(108 + x, 147 + y, 1, 1);
        g2d.fillRect(98 + x, 147 + y, 1, 3);
        g2d.fillRect(97 + x, 147 + y, 1, 4);
        g2d.fillRect(109 + x, 148 + y, 1, 3);
        g2d.fillRect(96 + x, 149 + y, 1, 3);
        g2d.fillRect(95 + x, 151 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(98 + x, 95 + y, 1, 3);
        g2d.fillRect(99 + x, 99 + y, 1, 3);
        g2d.fillRect(101 + x, 108 + y, 1, 7);
        g2d.fillRect(101 + x, 120 + y, 1, 8);
        g2d.fillRect(102 + x, 128 + y, 1, 14);
        g2d.fillRect(103 + x, 141 + y, 1, 1);
        g2d.fillRect(101 + x, 141 + y, 1, 3);
        g2d.fillRect(100 + x, 142 + y, 1, 2);
        g2d.fillRect(99 + x, 144 + y, 1, 2);
        g2d.fillRect(98 + x, 146 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 151 + y, 5, 1);
        g2d.fillRect(107 + x, 153 + y, 1, 2);
        g2d.fillRect(101 + x, 153 + y, 1, 2);
        g2d.fillRect(100 + x, 153 + y, 1, 1);
        g2d.fillRect(102 + x, 154 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 148 + y, 1, 3);
        g2d.fillRect(105 + x, 148 + y, 1, 3);
        g2d.fillRect(104 + x, 148 + y, 1, 3);
        g2d.fillRect(103 + x, 148 + y, 1, 3);
        g2d.fillRect(107 + x, 149 + y, 1, 2);
        g2d.fillRect(102 + x, 149 + y, 1, 2);
        g2d.fillRect(101 + x, 149 + y, 1, 2);
    }

    public void paintBackFour(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 10);
        g2d.fillRect(94 + x, 91 + y, 1, 9);
        g2d.fillRect(95 + x, 100 + y, 1, 4);
        g2d.fillRect(103 + x, 101 + y, 1, 5);
        g2d.fillRect(96 + x, 104 + y, 1, 3);
        g2d.fillRect(104 + x, 106 + y, 1, 8);
        g2d.fillRect(97 + x, 107 + y, 1, 20);
        g2d.fillRect(105 + x, 114 + y, 1, 8);
        g2d.fillRect(106 + x, 122 + y, 1, 8);
        g2d.fillRect(96 + x, 127 + y, 1, 15);
        g2d.fillRect(107 + x, 130 + y, 1, 8);
        g2d.fillRect(108 + x, 138 + y, 1, 4);
        g2d.fillRect(109 + x, 142 + y, 1, 8);
        g2d.fillRect(95 + x, 142 + y, 1, 6);
        g2d.fillRect(94 + x, 148 + y, 1, 4);
        g2d.fillRect(110 + x, 150 + y, 1, 2);
        g2d.fillRect(102 + x, 151 + y, 5, 1);
        g2d.fillRect(111 + x, 152 + y, 1, 4);
        g2d.fillRect(101 + x, 152 + y, 2, 1);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(100 + x, 153 + y, 1, 3);
        g2d.fillRect(92 + x, 153 + y, 1, 1);
        g2d.fillRect(108 + x, 154 + y, 1, 5);
        g2d.fillRect(91 + x, 154 + y, 1, 4);
        g2d.fillRect(99 + x, 155 + y, 1, 2);
        g2d.fillRect(112 + x, 156 + y, 1, 2);
        g2d.fillRect(113 + x, 157 + y, 1, 1);
        g2d.fillRect(98 + x, 157 + y, 1, 2);
        g2d.fillRect(92 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 157 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 3, 1);
        g2d.fillRect(93 + x, 158 + y, 3, 1);
        g2d.fillRect(96 + x, 159 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 1, 2);
        g2d.fillRect(96 + x, 91 + y, 1, 9);
        g2d.fillRect(101 + x, 94 + y, 1, 13);
        g2d.fillRect(100 + x, 97 + y, 1, 3);
        g2d.fillRect(102 + x, 101 + y, 1, 10);
        g2d.fillRect(97 + x, 101 + y, 1, 3);
        g2d.fillRect(98 + x, 105 + y, 1, 2);
        g2d.fillRect(103 + x, 106 + y, 1, 12);
        g2d.fillRect(99 + x, 109 + y, 1, 24);
        g2d.fillRect(104 + x, 114 + y, 1, 22);
        g2d.fillRect(103 + x, 120 + y, 1, 2);
        g2d.fillRect(105 + x, 122 + y, 1, 20);
        g2d.fillRect(98 + x, 127 + y, 1, 18);
        g2d.fillRect(106 + x, 130 + y, 1, 16);
        g2d.fillRect(107 + x, 138 + y, 1, 10);
        g2d.fillRect(99 + x, 138 + y, 1, 2);
        g2d.fillRect(108 + x, 142 + y, 1, 9);
        g2d.fillRect(97 + x, 142 + y, 1, 9);
        g2d.fillRect(96 + x, 148 + y, 1, 5);
        g2d.fillRect(109 + x, 150 + y, 1, 2);
        g2d.fillRect(101 + x, 150 + y, 6, 1);
        g2d.fillRect(100 + x, 151 + y, 2, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 6);
        g2d.fillRect(108 + x, 152 + y, 1, 2);
        g2d.fillRect(107 + x, 152 + y, 1, 1);
        g2d.fillRect(100 + x, 152 + y, 1, 1);
        g2d.fillRect(95 + x, 152 + y, 1, 3);
        g2d.fillRect(99 + x, 153 + y, 1, 2);
        g2d.fillRect(94 + x, 153 + y, 1, 5);
        g2d.fillRect(98 + x, 154 + y, 1, 3);
        g2d.fillRect(93 + x, 154 + y, 1, 4);
        g2d.fillRect(109 + x, 155 + y, 1, 3);
        g2d.fillRect(97 + x, 155 + y, 1, 4);
        g2d.fillRect(111 + x, 156 + y, 1, 2);
        g2d.fillRect(96 + x, 156 + y, 1, 3);
        g2d.fillRect(95 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 91 + y, 1, 9);
        g2d.fillRect(96 + x, 100 + y, 1, 4);
        g2d.fillRect(97 + x, 104 + y, 1, 3);
        g2d.fillRect(98 + x, 107 + y, 1, 20);
        g2d.fillRect(97 + x, 127 + y, 1, 15);
        g2d.fillRect(96 + x, 142 + y, 1, 6);
        g2d.fillRect(95 + x, 148 + y, 1, 4);
        g2d.fillRect(94 + x, 152 + y, 1, 1);
        g2d.fillRect(93 + x, 153 + y, 1, 1);
        g2d.fillRect(92 + x, 154 + y, 1, 3);
        g2d.fillRect(107 + x, 155 + y, 1, 2);
        g2d.fillRect(101 + x, 155 + y, 1, 2);
        g2d.fillRect(106 + x, 156 + y, 1, 2);
        g2d.fillRect(105 + x, 156 + y, 1, 2);
        g2d.fillRect(104 + x, 156 + y, 1, 2);
        g2d.fillRect(103 + x, 156 + y, 1, 2);
        g2d.fillRect(102 + x, 156 + y, 1, 2);
        g2d.fillRect(100 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 157 + y, 1, 1);
        g2d.fillRect(100 + x, 158 + y, 1, 1);
        g2d.fillRect(101 + x, 159 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 91 + y, 1, 6);
        g2d.fillRect(98 + x, 91 + y, 1, 6);
        g2d.fillRect(97 + x, 91 + y, 1, 10);
        g2d.fillRect(101 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 94 + y, 1, 2);
        g2d.fillRect(99 + x, 97 + y, 1, 4);
        g2d.fillRect(100 + x, 100 + y, 1, 46);
        g2d.fillRect(98 + x, 100 + y, 1, 5);
        g2d.fillRect(99 + x, 104 + y, 1, 5);
        g2d.fillRect(101 + x, 107 + y, 1, 4);
        g2d.fillRect(102 + x, 111 + y, 1, 20);
        g2d.fillRect(103 + x, 118 + y, 1, 2);
        g2d.fillRect(101 + x, 118 + y, 1, 5);
        g2d.fillRect(103 + x, 122 + y, 1, 23);
        g2d.fillRect(101 + x, 131 + y, 1, 14);
        g2d.fillRect(99 + x, 133 + y, 1, 5);
        g2d.fillRect(104 + x, 136 + y, 1, 14);
        g2d.fillRect(99 + x, 140 + y, 1, 8);
        g2d.fillRect(105 + x, 142 + y, 1, 8);
        g2d.fillRect(98 + x, 145 + y, 1, 5);
        g2d.fillRect(106 + x, 146 + y, 1, 4);
        g2d.fillRect(103 + x, 146 + y, 1, 4);
        g2d.fillRect(102 + x, 146 + y, 1, 4);
        g2d.fillRect(107 + x, 148 + y, 1, 4);
        g2d.fillRect(101 + x, 148 + y, 1, 2);
        g2d.fillRect(100 + x, 148 + y, 1, 3);
        g2d.fillRect(99 + x, 150 + y, 1, 3);
        g2d.fillRect(108 + x, 151 + y, 1, 1);
        g2d.fillRect(98 + x, 151 + y, 1, 3);
        g2d.fillRect(97 + x, 151 + y, 1, 4);
        g2d.fillRect(109 + x, 152 + y, 1, 3);
        g2d.fillRect(96 + x, 153 + y, 1, 3);
        g2d.fillRect(95 + x, 155 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 3);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 97 + y, 1, 3);
        g2d.fillRect(99 + x, 101 + y, 1, 3);
        g2d.fillRect(101 + x, 111 + y, 1, 7);
        g2d.fillRect(101 + x, 123 + y, 1, 8);
        g2d.fillRect(102 + x, 131 + y, 1, 15);
        g2d.fillRect(103 + x, 145 + y, 1, 1);
        g2d.fillRect(101 + x, 145 + y, 1, 3);
        g2d.fillRect(100 + x, 146 + y, 1, 2);
        g2d.fillRect(99 + x, 148 + y, 1, 2);
        g2d.fillRect(98 + x, 150 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 155 + y, 5, 1);
        g2d.fillRect(107 + x, 157 + y, 1, 2);
        g2d.fillRect(101 + x, 157 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 1, 1);
        g2d.fillRect(102 + x, 158 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 152 + y, 1, 3);
        g2d.fillRect(105 + x, 152 + y, 1, 3);
        g2d.fillRect(104 + x, 152 + y, 1, 3);
        g2d.fillRect(103 + x, 152 + y, 1, 3);
        g2d.fillRect(107 + x, 153 + y, 1, 2);
        g2d.fillRect(102 + x, 153 + y, 1, 2);
        g2d.fillRect(101 + x, 153 + y, 1, 2);
    }

    public void paintBackOne(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(94 + x, 91 + y, 1, 4);
        g2d.fillRect(103 + x, 93 + y, 1, 9);
        g2d.fillRect(95 + x, 95 + y, 1, 6);
        g2d.fillRect(96 + x, 101 + y, 1, 4);
        g2d.fillRect(104 + x, 102 + y, 1, 5);
        g2d.fillRect(97 + x, 105 + y, 1, 3);
        g2d.fillRect(105 + x, 107 + y, 1, 9);
        g2d.fillRect(98 + x, 108 + y, 1, 21);
        g2d.fillRect(106 + x, 116 + y, 1, 8);
        g2d.fillRect(107 + x, 124 + y, 1, 8);
        g2d.fillRect(97 + x, 129 + y, 1, 17);
        g2d.fillRect(108 + x, 132 + y, 1, 8);
        g2d.fillRect(109 + x, 140 + y, 1, 6);
        g2d.fillRect(110 + x, 146 + y, 1, 8);
        g2d.fillRect(96 + x, 146 + y, 1, 6);
        g2d.fillRect(95 + x, 152 + y, 1, 4);
        g2d.fillRect(111 + x, 154 + y, 1, 2);
        g2d.fillRect(103 + x, 155 + y, 5, 1);
        g2d.fillRect(112 + x, 156 + y, 1, 4);
        g2d.fillRect(102 + x, 156 + y, 2, 1);
        g2d.fillRect(94 + x, 156 + y, 1, 1);
        g2d.fillRect(101 + x, 157 + y, 1, 3);
        g2d.fillRect(93 + x, 157 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 1, 5);
        g2d.fillRect(92 + x, 158 + y, 1, 4);
        g2d.fillRect(100 + x, 159 + y, 1, 2);
        g2d.fillRect(113 + x, 160 + y, 1, 2);
        g2d.fillRect(114 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 161 + y, 1, 2);
        g2d.fillRect(93 + x, 161 + y, 1, 1);
        g2d.fillRect(91 + x, 161 + y, 1, 1);
        g2d.fillRect(110 + x, 162 + y, 3, 1);
        g2d.fillRect(94 + x, 162 + y, 3, 1);
        g2d.fillRect(97 + x, 163 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 1, 2);
        g2d.fillRect(96 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 93 + y, 1, 15);
        g2d.fillRect(97 + x, 95 + y, 1, 6);
        g2d.fillRect(101 + x, 98 + y, 1, 3);
        g2d.fillRect(103 + x, 102 + y, 1, 11);
        g2d.fillRect(98 + x, 102 + y, 1, 3);
        g2d.fillRect(99 + x, 106 + y, 1, 2);
        g2d.fillRect(104 + x, 107 + y, 1, 13);
        g2d.fillRect(100 + x, 111 + y, 1, 24);
        g2d.fillRect(105 + x, 116 + y, 1, 22);
        g2d.fillRect(104 + x, 122 + y, 1, 2);
        g2d.fillRect(106 + x, 124 + y, 1, 22);
        g2d.fillRect(99 + x, 129 + y, 1, 20);
        g2d.fillRect(107 + x, 132 + y, 1, 18);
        g2d.fillRect(108 + x, 140 + y, 1, 12);
        g2d.fillRect(100 + x, 141 + y, 1, 3);
        g2d.fillRect(109 + x, 146 + y, 1, 9);
        g2d.fillRect(98 + x, 146 + y, 1, 9);
        g2d.fillRect(97 + x, 152 + y, 1, 5);
        g2d.fillRect(110 + x, 154 + y, 1, 2);
        g2d.fillRect(102 + x, 154 + y, 6, 1);
        g2d.fillRect(101 + x, 155 + y, 2, 1);
        g2d.fillRect(111 + x, 156 + y, 1, 6);
        g2d.fillRect(109 + x, 156 + y, 1, 2);
        g2d.fillRect(108 + x, 156 + y, 1, 1);
        g2d.fillRect(101 + x, 156 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 3);
        g2d.fillRect(100 + x, 157 + y, 1, 2);
        g2d.fillRect(95 + x, 157 + y, 1, 5);
        g2d.fillRect(99 + x, 158 + y, 1, 3);
        g2d.fillRect(94 + x, 158 + y, 1, 4);
        g2d.fillRect(110 + x, 159 + y, 1, 3);
        g2d.fillRect(98 + x, 159 + y, 1, 4);
        g2d.fillRect(112 + x, 160 + y, 1, 2);
        g2d.fillRect(97 + x, 160 + y, 1, 3);
        g2d.fillRect(96 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 91 + y, 1, 4);
        g2d.fillRect(96 + x, 95 + y, 1, 6);
        g2d.fillRect(97 + x, 101 + y, 1, 4);
        g2d.fillRect(98 + x, 105 + y, 1, 3);
        g2d.fillRect(99 + x, 108 + y, 1, 21);
        g2d.fillRect(98 + x, 129 + y, 1, 17);
        g2d.fillRect(97 + x, 146 + y, 1, 6);
        g2d.fillRect(96 + x, 152 + y, 1, 4);
        g2d.fillRect(95 + x, 156 + y, 1, 1);
        g2d.fillRect(94 + x, 157 + y, 1, 1);
        g2d.fillRect(93 + x, 158 + y, 1, 3);
        g2d.fillRect(108 + x, 159 + y, 1, 2);
        g2d.fillRect(102 + x, 159 + y, 1, 2);
        g2d.fillRect(107 + x, 160 + y, 1, 2);
        g2d.fillRect(106 + x, 160 + y, 1, 2);
        g2d.fillRect(105 + x, 160 + y, 1, 2);
        g2d.fillRect(104 + x, 160 + y, 1, 2);
        g2d.fillRect(103 + x, 160 + y, 1, 2);
        g2d.fillRect(101 + x, 160 + y, 1, 1);
        g2d.fillRect(100 + x, 161 + y, 1, 1);
        g2d.fillRect(101 + x, 162 + y, 1, 1);
        g2d.fillRect(102 + x, 163 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 91 + y, 1, 6);
        g2d.fillRect(98 + x, 91 + y, 1, 11);
        g2d.fillRect(97 + x, 91 + y, 1, 4);
        g2d.fillRect(101 + x, 93 + y, 1, 5);
        g2d.fillRect(99 + x, 95 + y, 1, 3);
        g2d.fillRect(100 + x, 98 + y, 1, 4);
        g2d.fillRect(101 + x, 101 + y, 1, 49);
        g2d.fillRect(99 + x, 101 + y, 1, 5);
        g2d.fillRect(100 + x, 105 + y, 1, 6);
        g2d.fillRect(102 + x, 108 + y, 1, 5);
        g2d.fillRect(103 + x, 113 + y, 1, 20);
        g2d.fillRect(104 + x, 120 + y, 1, 2);
        g2d.fillRect(102 + x, 120 + y, 1, 5);
        g2d.fillRect(104 + x, 124 + y, 1, 25);
        g2d.fillRect(102 + x, 133 + y, 1, 16);
        g2d.fillRect(100 + x, 135 + y, 1, 6);
        g2d.fillRect(105 + x, 138 + y, 1, 16);
        g2d.fillRect(100 + x, 144 + y, 1, 8);
        g2d.fillRect(106 + x, 146 + y, 1, 8);
        g2d.fillRect(99 + x, 149 + y, 1, 5);
        g2d.fillRect(107 + x, 150 + y, 1, 4);
        g2d.fillRect(104 + x, 150 + y, 1, 4);
        g2d.fillRect(103 + x, 150 + y, 1, 4);
        g2d.fillRect(108 + x, 152 + y, 1, 4);
        g2d.fillRect(102 + x, 152 + y, 1, 2);
        g2d.fillRect(101 + x, 152 + y, 1, 3);
        g2d.fillRect(100 + x, 154 + y, 1, 3);
        g2d.fillRect(109 + x, 155 + y, 1, 1);
        g2d.fillRect(99 + x, 155 + y, 1, 3);
        g2d.fillRect(98 + x, 155 + y, 1, 4);
        g2d.fillRect(110 + x, 156 + y, 1, 3);
        g2d.fillRect(97 + x, 157 + y, 1, 3);
        g2d.fillRect(96 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(100 + x, 97 + y, 1, 1);
        g2d.fillRect(99 + x, 98 + y, 1, 3);
        g2d.fillRect(100 + x, 102 + y, 1, 3);
        g2d.fillRect(102 + x, 113 + y, 1, 7);
        g2d.fillRect(102 + x, 125 + y, 1, 8);
        g2d.fillRect(103 + x, 133 + y, 1, 17);
        g2d.fillRect(104 + x, 149 + y, 1, 1);
        g2d.fillRect(102 + x, 149 + y, 1, 3);
        g2d.fillRect(101 + x, 150 + y, 1, 2);
        g2d.fillRect(100 + x, 152 + y, 1, 2);
        g2d.fillRect(99 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 159 + y, 5, 1);
        g2d.fillRect(108 + x, 161 + y, 1, 2);
        g2d.fillRect(102 + x, 161 + y, 1, 2);
        g2d.fillRect(101 + x, 161 + y, 1, 1);
        g2d.fillRect(103 + x, 162 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(107 + x, 156 + y, 1, 3);
        g2d.fillRect(106 + x, 156 + y, 1, 3);
        g2d.fillRect(105 + x, 156 + y, 1, 3);
        g2d.fillRect(104 + x, 156 + y, 1, 3);
        g2d.fillRect(108 + x, 157 + y, 1, 2);
        g2d.fillRect(103 + x, 157 + y, 1, 2);
        g2d.fillRect(102 + x, 157 + y, 1, 2);
    }

    public void paintBackSeven(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 13);
        g2d.fillRect(94 + x, 91 + y, 1, 6);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(95 + x, 97 + y, 1, 19);
        g2d.fillRect(103 + x, 104 + y, 1, 8);
        g2d.fillRect(104 + x, 112 + y, 1, 6);
        g2d.fillRect(94 + x, 116 + y, 1, 13);
        g2d.fillRect(105 + x, 118 + y, 1, 6);
        g2d.fillRect(106 + x, 124 + y, 1, 5);
        g2d.fillRect(107 + x, 129 + y, 1, 7);
        g2d.fillRect(93 + x, 129 + y, 1, 5);
        g2d.fillRect(92 + x, 134 + y, 1, 4);
        g2d.fillRect(108 + x, 136 + y, 1, 2);
        g2d.fillRect(100 + x, 137 + y, 5, 1);
        g2d.fillRect(109 + x, 138 + y, 1, 4);
        g2d.fillRect(99 + x, 138 + y, 2, 1);
        g2d.fillRect(91 + x, 138 + y, 1, 1);
        g2d.fillRect(98 + x, 139 + y, 1, 3);
        g2d.fillRect(90 + x, 139 + y, 1, 1);
        g2d.fillRect(106 + x, 140 + y, 1, 5);
        g2d.fillRect(89 + x, 140 + y, 1, 4);
        g2d.fillRect(97 + x, 141 + y, 1, 2);
        g2d.fillRect(110 + x, 142 + y, 1, 2);
        g2d.fillRect(111 + x, 143 + y, 1, 1);
        g2d.fillRect(96 + x, 143 + y, 1, 2);
        g2d.fillRect(90 + x, 143 + y, 1, 1);
        g2d.fillRect(88 + x, 143 + y, 1, 1);
        g2d.fillRect(107 + x, 144 + y, 3, 1);
        g2d.fillRect(91 + x, 144 + y, 3, 1);
        g2d.fillRect(94 + x, 145 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 1, 2);
        g2d.fillRect(96 + x, 91 + y, 1, 6);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(100 + x, 95 + y, 1, 6);
        g2d.fillRect(101 + x, 96 + y, 1, 12);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(97 + x, 99 + y, 1, 21);
        g2d.fillRect(102 + x, 104 + y, 1, 18);
        g2d.fillRect(101 + x, 110 + y, 1, 2);
        g2d.fillRect(103 + x, 112 + y, 1, 17);
        g2d.fillRect(96 + x, 116 + y, 1, 15);
        g2d.fillRect(104 + x, 118 + y, 1, 14);
        g2d.fillRect(105 + x, 124 + y, 1, 10);
        g2d.fillRect(97 + x, 124 + y, 1, 3);
        g2d.fillRect(106 + x, 129 + y, 1, 8);
        g2d.fillRect(95 + x, 129 + y, 1, 8);
        g2d.fillRect(94 + x, 134 + y, 1, 5);
        g2d.fillRect(107 + x, 136 + y, 1, 2);
        g2d.fillRect(99 + x, 136 + y, 6, 1);
        g2d.fillRect(98 + x, 137 + y, 2, 1);
        g2d.fillRect(108 + x, 138 + y, 1, 6);
        g2d.fillRect(106 + x, 138 + y, 1, 2);
        g2d.fillRect(105 + x, 138 + y, 1, 1);
        g2d.fillRect(98 + x, 138 + y, 1, 1);
        g2d.fillRect(93 + x, 138 + y, 1, 3);
        g2d.fillRect(97 + x, 139 + y, 1, 2);
        g2d.fillRect(92 + x, 139 + y, 1, 5);
        g2d.fillRect(96 + x, 140 + y, 1, 3);
        g2d.fillRect(91 + x, 140 + y, 1, 4);
        g2d.fillRect(107 + x, 141 + y, 1, 3);
        g2d.fillRect(95 + x, 141 + y, 1, 4);
        g2d.fillRect(109 + x, 142 + y, 1, 2);
        g2d.fillRect(94 + x, 142 + y, 1, 3);
        g2d.fillRect(93 + x, 143 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 91 + y, 1, 6);
        g2d.fillRect(96 + x, 97 + y, 1, 19);
        g2d.fillRect(95 + x, 116 + y, 1, 13);
        g2d.fillRect(94 + x, 129 + y, 1, 5);
        g2d.fillRect(93 + x, 134 + y, 1, 4);
        g2d.fillRect(92 + x, 138 + y, 1, 1);
        g2d.fillRect(91 + x, 139 + y, 1, 1);
        g2d.fillRect(90 + x, 140 + y, 1, 3);
        g2d.fillRect(105 + x, 141 + y, 1, 2);
        g2d.fillRect(99 + x, 141 + y, 1, 2);
        g2d.fillRect(104 + x, 142 + y, 1, 2);
        g2d.fillRect(103 + x, 142 + y, 1, 2);
        g2d.fillRect(102 + x, 142 + y, 1, 2);
        g2d.fillRect(101 + x, 142 + y, 1, 2);
        g2d.fillRect(100 + x, 142 + y, 1, 2);
        g2d.fillRect(98 + x, 142 + y, 1, 1);
        g2d.fillRect(97 + x, 143 + y, 1, 1);
        g2d.fillRect(98 + x, 144 + y, 1, 1);
        g2d.fillRect(99 + x, 145 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 91 + y, 1, 4);
        g2d.fillRect(98 + x, 91 + y, 1, 41);
        g2d.fillRect(97 + x, 91 + y, 1, 8);
        g2d.fillRect(101 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 4);
        g2d.fillRect(100 + x, 101 + y, 1, 17);
        g2d.fillRect(101 + x, 108 + y, 1, 2);
        g2d.fillRect(99 + x, 108 + y, 1, 5);
        g2d.fillRect(101 + x, 112 + y, 1, 19);
        g2d.fillRect(99 + x, 118 + y, 1, 13);
        g2d.fillRect(97 + x, 120 + y, 1, 4);
        g2d.fillRect(102 + x, 122 + y, 1, 14);
        g2d.fillRect(97 + x, 127 + y, 1, 7);
        g2d.fillRect(103 + x, 129 + y, 1, 7);
        g2d.fillRect(96 + x, 131 + y, 1, 5);
        g2d.fillRect(104 + x, 132 + y, 1, 4);
        g2d.fillRect(101 + x, 132 + y, 1, 4);
        g2d.fillRect(100 + x, 132 + y, 1, 4);
        g2d.fillRect(105 + x, 134 + y, 1, 4);
        g2d.fillRect(99 + x, 134 + y, 1, 2);
        g2d.fillRect(98 + x, 134 + y, 1, 3);
        g2d.fillRect(97 + x, 136 + y, 1, 3);
        g2d.fillRect(106 + x, 137 + y, 1, 1);
        g2d.fillRect(96 + x, 137 + y, 1, 3);
        g2d.fillRect(95 + x, 137 + y, 1, 4);
        g2d.fillRect(107 + x, 138 + y, 1, 3);
        g2d.fillRect(94 + x, 139 + y, 1, 3);
        g2d.fillRect(93 + x, 141 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(99 + x, 101 + y, 1, 7);
        g2d.fillRect(99 + x, 113 + y, 1, 5);
        g2d.fillRect(100 + x, 118 + y, 1, 14);
        g2d.fillRect(101 + x, 131 + y, 1, 1);
        g2d.fillRect(99 + x, 131 + y, 1, 3);
        g2d.fillRect(98 + x, 132 + y, 1, 2);
        g2d.fillRect(97 + x, 134 + y, 1, 2);
        g2d.fillRect(96 + x, 136 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 141 + y, 5, 1);
        g2d.fillRect(105 + x, 143 + y, 1, 2);
        g2d.fillRect(99 + x, 143 + y, 1, 2);
        g2d.fillRect(98 + x, 143 + y, 1, 1);
        g2d.fillRect(100 + x, 144 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 138 + y, 1, 3);
        g2d.fillRect(103 + x, 138 + y, 1, 3);
        g2d.fillRect(102 + x, 138 + y, 1, 3);
        g2d.fillRect(101 + x, 138 + y, 1, 3);
        g2d.fillRect(105 + x, 139 + y, 1, 2);
        g2d.fillRect(100 + x, 139 + y, 1, 2);
        g2d.fillRect(99 + x, 139 + y, 1, 2);
    }

    public void paintBackSix(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 9);
        g2d.fillRect(94 + x, 91 + y, 1, 8);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(95 + x, 99 + y, 1, 2);
        g2d.fillRect(103 + x, 100 + y, 1, 8);
        g2d.fillRect(96 + x, 101 + y, 1, 20);
        g2d.fillRect(104 + x, 108 + y, 1, 8);
        g2d.fillRect(105 + x, 116 + y, 1, 7);
        g2d.fillRect(95 + x, 121 + y, 1, 13);
        g2d.fillRect(106 + x, 123 + y, 1, 7);
        g2d.fillRect(107 + x, 130 + y, 1, 4);
        g2d.fillRect(108 + x, 134 + y, 1, 6);
        g2d.fillRect(94 + x, 134 + y, 1, 4);
        g2d.fillRect(93 + x, 138 + y, 1, 4);
        g2d.fillRect(109 + x, 140 + y, 1, 2);
        g2d.fillRect(101 + x, 141 + y, 5, 1);
        g2d.fillRect(110 + x, 142 + y, 1, 4);
        g2d.fillRect(100 + x, 142 + y, 2, 1);
        g2d.fillRect(92 + x, 142 + y, 1, 1);
        g2d.fillRect(99 + x, 143 + y, 1, 3);
        g2d.fillRect(91 + x, 143 + y, 1, 1);
        g2d.fillRect(107 + x, 144 + y, 1, 5);
        g2d.fillRect(90 + x, 144 + y, 1, 4);
        g2d.fillRect(98 + x, 145 + y, 1, 2);
        g2d.fillRect(111 + x, 146 + y, 1, 2);
        g2d.fillRect(112 + x, 147 + y, 1, 1);
        g2d.fillRect(97 + x, 147 + y, 1, 2);
        g2d.fillRect(91 + x, 147 + y, 1, 1);
        g2d.fillRect(89 + x, 147 + y, 1, 1);
        g2d.fillRect(108 + x, 148 + y, 3, 1);
        g2d.fillRect(92 + x, 148 + y, 3, 1);
        g2d.fillRect(95 + x, 149 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 1, 2);
        g2d.fillRect(96 + x, 91 + y, 1, 4);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(100 + x, 95 + y, 1, 6);
        g2d.fillRect(101 + x, 96 + y, 1, 9);
        g2d.fillRect(96 + x, 96 + y, 1, 3);
        g2d.fillRect(97 + x, 99 + y, 1, 2);
        g2d.fillRect(102 + x, 100 + y, 1, 12);
        g2d.fillRect(98 + x, 103 + y, 1, 22);
        g2d.fillRect(103 + x, 108 + y, 1, 20);
        g2d.fillRect(102 + x, 114 + y, 1, 2);
        g2d.fillRect(104 + x, 116 + y, 1, 18);
        g2d.fillRect(97 + x, 121 + y, 1, 14);
        g2d.fillRect(105 + x, 123 + y, 1, 13);
        g2d.fillRect(106 + x, 130 + y, 1, 8);
        g2d.fillRect(98 + x, 130 + y, 1, 2);
        g2d.fillRect(107 + x, 134 + y, 1, 7);
        g2d.fillRect(96 + x, 134 + y, 1, 7);
        g2d.fillRect(95 + x, 138 + y, 1, 5);
        g2d.fillRect(108 + x, 140 + y, 1, 2);
        g2d.fillRect(100 + x, 140 + y, 6, 1);
        g2d.fillRect(99 + x, 141 + y, 2, 1);
        g2d.fillRect(109 + x, 142 + y, 1, 6);
        g2d.fillRect(107 + x, 142 + y, 1, 2);
        g2d.fillRect(106 + x, 142 + y, 1, 1);
        g2d.fillRect(99 + x, 142 + y, 1, 1);
        g2d.fillRect(94 + x, 142 + y, 1, 3);
        g2d.fillRect(98 + x, 143 + y, 1, 2);
        g2d.fillRect(93 + x, 143 + y, 1, 5);
        g2d.fillRect(97 + x, 144 + y, 1, 3);
        g2d.fillRect(92 + x, 144 + y, 1, 4);
        g2d.fillRect(108 + x, 145 + y, 1, 3);
        g2d.fillRect(96 + x, 145 + y, 1, 4);
        g2d.fillRect(110 + x, 146 + y, 1, 2);
        g2d.fillRect(95 + x, 146 + y, 1, 3);
        g2d.fillRect(94 + x, 147 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 91 + y, 1, 8);
        g2d.fillRect(96 + x, 99 + y, 1, 2);
        g2d.fillRect(97 + x, 101 + y, 1, 20);
        g2d.fillRect(96 + x, 121 + y, 1, 13);
        g2d.fillRect(95 + x, 134 + y, 1, 4);
        g2d.fillRect(94 + x, 138 + y, 1, 4);
        g2d.fillRect(93 + x, 142 + y, 1, 1);
        g2d.fillRect(92 + x, 143 + y, 1, 1);
        g2d.fillRect(91 + x, 144 + y, 1, 3);
        g2d.fillRect(106 + x, 145 + y, 1, 2);
        g2d.fillRect(100 + x, 145 + y, 1, 2);
        g2d.fillRect(105 + x, 146 + y, 1, 2);
        g2d.fillRect(104 + x, 146 + y, 1, 2);
        g2d.fillRect(103 + x, 146 + y, 1, 2);
        g2d.fillRect(102 + x, 146 + y, 1, 2);
        g2d.fillRect(101 + x, 146 + y, 1, 2);
        g2d.fillRect(99 + x, 146 + y, 1, 1);
        g2d.fillRect(98 + x, 147 + y, 1, 1);
        g2d.fillRect(99 + x, 148 + y, 1, 1);
        g2d.fillRect(100 + x, 149 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 91 + y, 1, 4);
        g2d.fillRect(98 + x, 91 + y, 1, 5);
        g2d.fillRect(97 + x, 91 + y, 1, 8);
        g2d.fillRect(101 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 41);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 99 + y, 1, 4);
        g2d.fillRect(100 + x, 101 + y, 1, 4);
        g2d.fillRect(101 + x, 105 + y, 1, 18);
        g2d.fillRect(102 + x, 112 + y, 1, 2);
        g2d.fillRect(100 + x, 112 + y, 1, 5);
        g2d.fillRect(102 + x, 116 + y, 1, 19);
        g2d.fillRect(100 + x, 123 + y, 1, 12);
        g2d.fillRect(98 + x, 125 + y, 1, 5);
        g2d.fillRect(103 + x, 128 + y, 1, 12);
        g2d.fillRect(98 + x, 132 + y, 1, 6);
        g2d.fillRect(104 + x, 134 + y, 1, 6);
        g2d.fillRect(97 + x, 135 + y, 1, 5);
        g2d.fillRect(105 + x, 136 + y, 1, 4);
        g2d.fillRect(102 + x, 136 + y, 1, 4);
        g2d.fillRect(101 + x, 136 + y, 1, 4);
        g2d.fillRect(106 + x, 138 + y, 1, 4);
        g2d.fillRect(100 + x, 138 + y, 1, 2);
        g2d.fillRect(99 + x, 138 + y, 1, 3);
        g2d.fillRect(98 + x, 140 + y, 1, 3);
        g2d.fillRect(107 + x, 141 + y, 1, 1);
        g2d.fillRect(97 + x, 141 + y, 1, 3);
        g2d.fillRect(96 + x, 141 + y, 1, 4);
        g2d.fillRect(108 + x, 142 + y, 1, 3);
        g2d.fillRect(95 + x, 143 + y, 1, 3);
        g2d.fillRect(94 + x, 145 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(98 + x, 96 + y, 1, 3);
        g2d.fillRect(100 + x, 105 + y, 1, 7);
        g2d.fillRect(100 + x, 117 + y, 1, 6);
        g2d.fillRect(101 + x, 123 + y, 1, 13);
        g2d.fillRect(102 + x, 135 + y, 1, 1);
        g2d.fillRect(100 + x, 135 + y, 1, 3);
        g2d.fillRect(99 + x, 136 + y, 1, 2);
        g2d.fillRect(98 + x, 138 + y, 1, 2);
        g2d.fillRect(97 + x, 140 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 145 + y, 5, 1);
        g2d.fillRect(106 + x, 147 + y, 1, 2);
        g2d.fillRect(100 + x, 147 + y, 1, 2);
        g2d.fillRect(99 + x, 147 + y, 1, 1);
        g2d.fillRect(101 + x, 148 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 142 + y, 1, 3);
        g2d.fillRect(104 + x, 142 + y, 1, 3);
        g2d.fillRect(103 + x, 142 + y, 1, 3);
        g2d.fillRect(102 + x, 142 + y, 1, 3);
        g2d.fillRect(106 + x, 143 + y, 1, 2);
        g2d.fillRect(101 + x, 143 + y, 1, 2);
        g2d.fillRect(100 + x, 143 + y, 1, 2);
    }

    public void paintBackThree(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 16);
        g2d.fillRect(94 + x, 91 + y, 1, 14);
        g2d.fillRect(95 + x, 105 + y, 1, 3);
        g2d.fillRect(103 + x, 107 + y, 1, 9);
        g2d.fillRect(96 + x, 108 + y, 1, 21);
        g2d.fillRect(104 + x, 116 + y, 1, 8);
        g2d.fillRect(105 + x, 124 + y, 1, 8);
        g2d.fillRect(95 + x, 129 + y, 1, 17);
        g2d.fillRect(106 + x, 132 + y, 1, 8);
        g2d.fillRect(107 + x, 140 + y, 1, 6);
        g2d.fillRect(108 + x, 146 + y, 1, 8);
        g2d.fillRect(94 + x, 146 + y, 1, 6);
        g2d.fillRect(93 + x, 152 + y, 1, 4);
        g2d.fillRect(109 + x, 154 + y, 1, 2);
        g2d.fillRect(101 + x, 155 + y, 5, 1);
        g2d.fillRect(110 + x, 156 + y, 1, 4);
        g2d.fillRect(100 + x, 156 + y, 2, 1);
        g2d.fillRect(92 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 157 + y, 1, 3);
        g2d.fillRect(91 + x, 157 + y, 1, 1);
        g2d.fillRect(107 + x, 158 + y, 1, 5);
        g2d.fillRect(90 + x, 158 + y, 1, 4);
        g2d.fillRect(98 + x, 159 + y, 1, 2);
        g2d.fillRect(111 + x, 160 + y, 1, 2);
        g2d.fillRect(112 + x, 161 + y, 1, 1);
        g2d.fillRect(97 + x, 161 + y, 1, 2);
        g2d.fillRect(91 + x, 161 + y, 1, 1);
        g2d.fillRect(89 + x, 161 + y, 1, 1);
        g2d.fillRect(108 + x, 162 + y, 3, 1);
        g2d.fillRect(92 + x, 162 + y, 3, 1);
        g2d.fillRect(95 + x, 163 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 1, 22);
        g2d.fillRect(96 + x, 91 + y, 1, 10);
        g2d.fillRect(100 + x, 98 + y, 1, 10);
        g2d.fillRect(96 + x, 102 + y, 1, 3);
        g2d.fillRect(97 + x, 106 + y, 1, 2);
        g2d.fillRect(102 + x, 107 + y, 1, 13);
        g2d.fillRect(98 + x, 111 + y, 1, 24);
        g2d.fillRect(103 + x, 116 + y, 1, 22);
        g2d.fillRect(102 + x, 122 + y, 1, 2);
        g2d.fillRect(104 + x, 124 + y, 1, 22);
        g2d.fillRect(97 + x, 129 + y, 1, 20);
        g2d.fillRect(105 + x, 132 + y, 1, 18);
        g2d.fillRect(106 + x, 140 + y, 1, 12);
        g2d.fillRect(98 + x, 141 + y, 1, 3);
        g2d.fillRect(107 + x, 146 + y, 1, 9);
        g2d.fillRect(96 + x, 146 + y, 1, 9);
        g2d.fillRect(95 + x, 152 + y, 1, 5);
        g2d.fillRect(108 + x, 154 + y, 1, 2);
        g2d.fillRect(100 + x, 154 + y, 6, 1);
        g2d.fillRect(99 + x, 155 + y, 2, 1);
        g2d.fillRect(109 + x, 156 + y, 1, 6);
        g2d.fillRect(107 + x, 156 + y, 1, 2);
        g2d.fillRect(106 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 1);
        g2d.fillRect(94 + x, 156 + y, 1, 3);
        g2d.fillRect(98 + x, 157 + y, 1, 2);
        g2d.fillRect(93 + x, 157 + y, 1, 5);
        g2d.fillRect(97 + x, 158 + y, 1, 3);
        g2d.fillRect(92 + x, 158 + y, 1, 4);
        g2d.fillRect(108 + x, 159 + y, 1, 3);
        g2d.fillRect(96 + x, 159 + y, 1, 4);
        g2d.fillRect(110 + x, 160 + y, 1, 2);
        g2d.fillRect(95 + x, 160 + y, 1, 3);
        g2d.fillRect(94 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 91 + y, 1, 14);
        g2d.fillRect(96 + x, 105 + y, 1, 3);
        g2d.fillRect(97 + x, 108 + y, 1, 21);
        g2d.fillRect(96 + x, 129 + y, 1, 17);
        g2d.fillRect(95 + x, 146 + y, 1, 6);
        g2d.fillRect(94 + x, 152 + y, 1, 4);
        g2d.fillRect(93 + x, 156 + y, 1, 1);
        g2d.fillRect(92 + x, 157 + y, 1, 1);
        g2d.fillRect(91 + x, 158 + y, 1, 3);
        g2d.fillRect(106 + x, 159 + y, 1, 2);
        g2d.fillRect(100 + x, 159 + y, 1, 2);
        g2d.fillRect(105 + x, 160 + y, 1, 2);
        g2d.fillRect(104 + x, 160 + y, 1, 2);
        g2d.fillRect(103 + x, 160 + y, 1, 2);
        g2d.fillRect(102 + x, 160 + y, 1, 2);
        g2d.fillRect(101 + x, 160 + y, 1, 2);
        g2d.fillRect(99 + x, 160 + y, 1, 1);
        g2d.fillRect(98 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 162 + y, 1, 1);
        g2d.fillRect(100 + x, 163 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 91 + y, 1, 7);
        g2d.fillRect(98 + x, 91 + y, 1, 7);
        g2d.fillRect(97 + x, 91 + y, 1, 15);
        g2d.fillRect(99 + x, 95 + y, 1, 2);
        g2d.fillRect(99 + x, 98 + y, 1, 52);
        g2d.fillRect(98 + x, 101 + y, 1, 1);
        g2d.fillRect(96 + x, 101 + y, 1, 1);
        g2d.fillRect(98 + x, 105 + y, 1, 6);
        g2d.fillRect(100 + x, 108 + y, 1, 5);
        g2d.fillRect(101 + x, 113 + y, 1, 20);
        g2d.fillRect(102 + x, 120 + y, 1, 2);
        g2d.fillRect(100 + x, 120 + y, 1, 5);
        g2d.fillRect(102 + x, 124 + y, 1, 25);
        g2d.fillRect(100 + x, 133 + y, 1, 16);
        g2d.fillRect(98 + x, 135 + y, 1, 6);
        g2d.fillRect(103 + x, 138 + y, 1, 16);
        g2d.fillRect(98 + x, 144 + y, 1, 8);
        g2d.fillRect(104 + x, 146 + y, 1, 8);
        g2d.fillRect(97 + x, 149 + y, 1, 5);
        g2d.fillRect(105 + x, 150 + y, 1, 4);
        g2d.fillRect(102 + x, 150 + y, 1, 4);
        g2d.fillRect(101 + x, 150 + y, 1, 4);
        g2d.fillRect(106 + x, 152 + y, 1, 4);
        g2d.fillRect(100 + x, 152 + y, 1, 2);
        g2d.fillRect(99 + x, 152 + y, 1, 3);
        g2d.fillRect(98 + x, 154 + y, 1, 3);
        g2d.fillRect(107 + x, 155 + y, 1, 1);
        g2d.fillRect(97 + x, 155 + y, 1, 3);
        g2d.fillRect(96 + x, 155 + y, 1, 4);
        g2d.fillRect(108 + x, 156 + y, 1, 3);
        g2d.fillRect(95 + x, 157 + y, 1, 3);
        g2d.fillRect(94 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(99 + x, 97 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 3);
        g2d.fillRect(98 + x, 102 + y, 1, 3);
        g2d.fillRect(100 + x, 113 + y, 1, 7);
        g2d.fillRect(100 + x, 125 + y, 1, 8);
        g2d.fillRect(101 + x, 133 + y, 1, 17);
        g2d.fillRect(102 + x, 149 + y, 1, 1);
        g2d.fillRect(100 + x, 149 + y, 1, 3);
        g2d.fillRect(99 + x, 150 + y, 1, 2);
        g2d.fillRect(98 + x, 152 + y, 1, 2);
        g2d.fillRect(97 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 159 + y, 5, 1);
        g2d.fillRect(106 + x, 161 + y, 1, 2);
        g2d.fillRect(100 + x, 161 + y, 1, 2);
        g2d.fillRect(99 + x, 161 + y, 1, 1);
        g2d.fillRect(101 + x, 162 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 156 + y, 1, 3);
        g2d.fillRect(104 + x, 156 + y, 1, 3);
        g2d.fillRect(103 + x, 156 + y, 1, 3);
        g2d.fillRect(102 + x, 156 + y, 1, 3);
        g2d.fillRect(106 + x, 157 + y, 1, 2);
        g2d.fillRect(101 + x, 157 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 1, 2);
    }

    public void paintBackTwo(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 11);
        g2d.fillRect(94 + x, 91 + y, 1, 10);
        g2d.fillRect(95 + x, 101 + y, 1, 4);
        g2d.fillRect(103 + x, 102 + y, 1, 5);
        g2d.fillRect(96 + x, 105 + y, 1, 3);
        g2d.fillRect(104 + x, 107 + y, 1, 9);
        g2d.fillRect(97 + x, 108 + y, 1, 21);
        g2d.fillRect(105 + x, 116 + y, 1, 8);
        g2d.fillRect(106 + x, 124 + y, 1, 8);
        g2d.fillRect(96 + x, 129 + y, 1, 17);
        g2d.fillRect(107 + x, 132 + y, 1, 8);
        g2d.fillRect(108 + x, 140 + y, 1, 6);
        g2d.fillRect(109 + x, 146 + y, 1, 8);
        g2d.fillRect(95 + x, 146 + y, 1, 6);
        g2d.fillRect(94 + x, 152 + y, 1, 4);
        g2d.fillRect(110 + x, 154 + y, 1, 2);
        g2d.fillRect(102 + x, 155 + y, 5, 1);
        g2d.fillRect(111 + x, 156 + y, 1, 4);
        g2d.fillRect(101 + x, 156 + y, 2, 1);
        g2d.fillRect(93 + x, 156 + y, 1, 1);
        g2d.fillRect(100 + x, 157 + y, 1, 3);
        g2d.fillRect(92 + x, 157 + y, 1, 1);
        g2d.fillRect(108 + x, 158 + y, 1, 5);
        g2d.fillRect(91 + x, 158 + y, 1, 4);
        g2d.fillRect(99 + x, 159 + y, 1, 2);
        g2d.fillRect(112 + x, 160 + y, 1, 2);
        g2d.fillRect(113 + x, 161 + y, 1, 1);
        g2d.fillRect(98 + x, 161 + y, 1, 2);
        g2d.fillRect(92 + x, 161 + y, 1, 1);
        g2d.fillRect(90 + x, 161 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 3, 1);
        g2d.fillRect(93 + x, 162 + y, 3, 1);
        g2d.fillRect(96 + x, 163 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 1, 17);
        g2d.fillRect(96 + x, 91 + y, 1, 10);
        g2d.fillRect(100 + x, 98 + y, 1, 3);
        g2d.fillRect(102 + x, 102 + y, 1, 11);
        g2d.fillRect(97 + x, 102 + y, 1, 3);
        g2d.fillRect(98 + x, 106 + y, 1, 2);
        g2d.fillRect(103 + x, 107 + y, 1, 13);
        g2d.fillRect(99 + x, 111 + y, 1, 24);
        g2d.fillRect(104 + x, 116 + y, 1, 22);
        g2d.fillRect(103 + x, 122 + y, 1, 2);
        g2d.fillRect(105 + x, 124 + y, 1, 22);
        g2d.fillRect(98 + x, 129 + y, 1, 20);
        g2d.fillRect(106 + x, 132 + y, 1, 18);
        g2d.fillRect(107 + x, 140 + y, 1, 12);
        g2d.fillRect(99 + x, 141 + y, 1, 3);
        g2d.fillRect(108 + x, 146 + y, 1, 9);
        g2d.fillRect(97 + x, 146 + y, 1, 9);
        g2d.fillRect(96 + x, 152 + y, 1, 5);
        g2d.fillRect(109 + x, 154 + y, 1, 2);
        g2d.fillRect(101 + x, 154 + y, 6, 1);
        g2d.fillRect(100 + x, 155 + y, 2, 1);
        g2d.fillRect(110 + x, 156 + y, 1, 6);
        g2d.fillRect(108 + x, 156 + y, 1, 2);
        g2d.fillRect(107 + x, 156 + y, 1, 1);
        g2d.fillRect(100 + x, 156 + y, 1, 1);
        g2d.fillRect(95 + x, 156 + y, 1, 3);
        g2d.fillRect(99 + x, 157 + y, 1, 2);
        g2d.fillRect(94 + x, 157 + y, 1, 5);
        g2d.fillRect(98 + x, 158 + y, 1, 3);
        g2d.fillRect(93 + x, 158 + y, 1, 4);
        g2d.fillRect(109 + x, 159 + y, 1, 3);
        g2d.fillRect(97 + x, 159 + y, 1, 4);
        g2d.fillRect(111 + x, 160 + y, 1, 2);
        g2d.fillRect(96 + x, 160 + y, 1, 3);
        g2d.fillRect(95 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 91 + y, 1, 10);
        g2d.fillRect(96 + x, 101 + y, 1, 4);
        g2d.fillRect(97 + x, 105 + y, 1, 3);
        g2d.fillRect(98 + x, 108 + y, 1, 21);
        g2d.fillRect(97 + x, 129 + y, 1, 17);
        g2d.fillRect(96 + x, 146 + y, 1, 6);
        g2d.fillRect(95 + x, 152 + y, 1, 4);
        g2d.fillRect(94 + x, 156 + y, 1, 1);
        g2d.fillRect(93 + x, 157 + y, 1, 1);
        g2d.fillRect(92 + x, 158 + y, 1, 3);
        g2d.fillRect(107 + x, 159 + y, 1, 2);
        g2d.fillRect(101 + x, 159 + y, 1, 2);
        g2d.fillRect(106 + x, 160 + y, 1, 2);
        g2d.fillRect(105 + x, 160 + y, 1, 2);
        g2d.fillRect(104 + x, 160 + y, 1, 2);
        g2d.fillRect(103 + x, 160 + y, 1, 2);
        g2d.fillRect(102 + x, 160 + y, 1, 2);
        g2d.fillRect(100 + x, 160 + y, 1, 1);
        g2d.fillRect(99 + x, 161 + y, 1, 1);
        g2d.fillRect(100 + x, 162 + y, 1, 1);
        g2d.fillRect(101 + x, 163 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 91 + y, 1, 7);
        g2d.fillRect(98 + x, 91 + y, 1, 7);
        g2d.fillRect(97 + x, 91 + y, 1, 11);
        g2d.fillRect(99 + x, 95 + y, 1, 2);
        g2d.fillRect(99 + x, 98 + y, 1, 4);
        g2d.fillRect(100 + x, 101 + y, 1, 49);
        g2d.fillRect(98 + x, 101 + y, 1, 5);
        g2d.fillRect(99 + x, 105 + y, 1, 6);
        g2d.fillRect(101 + x, 108 + y, 1, 5);
        g2d.fillRect(102 + x, 113 + y, 1, 20);
        g2d.fillRect(103 + x, 120 + y, 1, 2);
        g2d.fillRect(101 + x, 120 + y, 1, 5);
        g2d.fillRect(103 + x, 124 + y, 1, 25);
        g2d.fillRect(101 + x, 133 + y, 1, 16);
        g2d.fillRect(99 + x, 135 + y, 1, 6);
        g2d.fillRect(104 + x, 138 + y, 1, 16);
        g2d.fillRect(99 + x, 144 + y, 1, 8);
        g2d.fillRect(105 + x, 146 + y, 1, 8);
        g2d.fillRect(98 + x, 149 + y, 1, 5);
        g2d.fillRect(106 + x, 150 + y, 1, 4);
        g2d.fillRect(103 + x, 150 + y, 1, 4);
        g2d.fillRect(102 + x, 150 + y, 1, 4);
        g2d.fillRect(107 + x, 152 + y, 1, 4);
        g2d.fillRect(101 + x, 152 + y, 1, 2);
        g2d.fillRect(100 + x, 152 + y, 1, 3);
        g2d.fillRect(99 + x, 154 + y, 1, 3);
        g2d.fillRect(108 + x, 155 + y, 1, 1);
        g2d.fillRect(98 + x, 155 + y, 1, 3);
        g2d.fillRect(97 + x, 155 + y, 1, 4);
        g2d.fillRect(109 + x, 156 + y, 1, 3);
        g2d.fillRect(96 + x, 157 + y, 1, 3);
        g2d.fillRect(95 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(99 + x, 97 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 3);
        g2d.fillRect(99 + x, 102 + y, 1, 3);
        g2d.fillRect(101 + x, 113 + y, 1, 7);
        g2d.fillRect(101 + x, 125 + y, 1, 8);
        g2d.fillRect(102 + x, 133 + y, 1, 17);
        g2d.fillRect(103 + x, 149 + y, 1, 1);
        g2d.fillRect(101 + x, 149 + y, 1, 3);
        g2d.fillRect(100 + x, 150 + y, 1, 2);
        g2d.fillRect(99 + x, 152 + y, 1, 2);
        g2d.fillRect(98 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 159 + y, 5, 1);
        g2d.fillRect(107 + x, 161 + y, 1, 2);
        g2d.fillRect(101 + x, 161 + y, 1, 2);
        g2d.fillRect(100 + x, 161 + y, 1, 1);
        g2d.fillRect(102 + x, 162 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 156 + y, 1, 3);
        g2d.fillRect(105 + x, 156 + y, 1, 3);
        g2d.fillRect(104 + x, 156 + y, 1, 3);
        g2d.fillRect(103 + x, 156 + y, 1, 3);
        g2d.fillRect(107 + x, 157 + y, 1, 2);
        g2d.fillRect(102 + x, 157 + y, 1, 2);
        g2d.fillRect(101 + x, 157 + y, 1, 2);
    }
}
