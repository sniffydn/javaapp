/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b;

import b.Bd;
import clts.SuperB;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Pnt16 extends SuperB {
    private Bd b = new Bd();

    /** Creates a new instance of GenericClothes */
    public Pnt16() {
        super();
        jean = true;
        pant = true;
        slenderS = true;
        platzHeight = 0;
        
    }

    public Pnt16(int layer) {
        super(layer);
        jean = true;
        pant = true;
        slenderS = true;
        platzHeight = 0;
    }

    public Pnt16(ColorArray colorSwitch) {
        super(colorSwitch);
        jean = true;
        pant = true;
        slenderS = true;
        platzHeight = 0;
    }

    public Pnt16(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
        jean = true;
        pant = true;
        slenderS = true;
        platzHeight = 0;
    }

    public void paintBack(int offsetX, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (step <= 12 && step > 3) {
            paintLeft(offsetX, 0, g2d);
        } else {
            paintRight(offsetX, 0, g2d);
        }
        drawBody(offsetX, 0, g2d);
    }

    public void paintMiddle(int offsetX, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);


        if (step <= 12 && step > 3) {
            paintRight(offsetX, 0, g2d);
        } else {
            paintLeft(offsetX, 0, g2d);
        }
        paintT(offsetX, 0, g2d);
    }

    private void paintRight(int x, int y, GraphicsMap g2d) {
        
        if (step == 0 || step == 8 || step == 9 || step == 15) {
            paint1(x, y, g2d);
        } else if (step == 11 || step == 12 || step == 13) {
            paint3(x, y, g2d);
        } else if (step == 1 || step == 7) {
            paint4(x, y, g2d);
        } else if (step == 2 || step == 6) {
            paint5(x, y, g2d);
        } else if (step == 3 || step == 5) {
            paint6(x, y, g2d);
        } else if (step == 10 || step == 14) {
            paint2(x, y, g2d);
        } else if (step == 4) {
            paint7(x, y, g2d);
        }
    }

    private void paintLeft(int x, int y, GraphicsMap g2d) {
        x += 7;
        if (step == 0 || step == 1 || step == 7 || step == 8) {
            paintBack1(x, y, g2d);
        } else if (step == 3 || step == 4 || step == 5) {
            paintBack3(x, y, g2d);
        } else if (step == 2 || step == 6) {
            paintBack2(x, y, g2d);
        } else if (step == 9 || step == 15) {
            paintBack4(x, y, g2d);
        } else if (step == 10 || step == 14) {
            paintBack5(x, y, g2d);
        } else if (step == 11 || step == 13) {
            paintBack6(x, y, g2d);
        } else if (step == 12) {
            paintBack7(x, y, g2d);
        }
    }

    public void paintT(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 84 + y, 1, 7);
        g2d.fillRect(100 + x, 85 + y, 1, 3);
        g2d.fillRect(111 + x, 87 + y, 1, 4);
        g2d.fillRect(101 + x, 88 + y, 1, 3);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 85 + y, 1, 3);
        g2d.fillRect(102 + x, 85 + y, 1, 6);
        g2d.fillRect(119 + x, 85 + y, 1, 3);
        g2d.fillRect(120 + x, 85 + y, 1, 6);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 86 + y, 1, 2);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 1, 4);
        g2d.fillRect(116 + x, 86 + y, 1, 4);
        g2d.fillRect(117 + x, 86 + y, 1, 2);
        g2d.fillRect(118 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 87 + y, 1, 3);
        g2d.fillRect(108 + x, 87 + y, 1, 4);
        g2d.fillRect(109 + x, 87 + y, 1, 4);
        g2d.fillRect(110 + x, 87 + y, 1, 3);
        g2d.fillRect(112 + x, 87 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 4);
        g2d.fillRect(114 + x, 87 + y, 1, 4);
        g2d.fillRect(103 + x, 89 + y, 4, 1);
        g2d.fillRect(117 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 82 + y, 1, 3);
        g2d.fillRect(101 + x, 82 + y, 2, 1);
        g2d.fillRect(119 + x, 82 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 4, 1);
        g2d.fillRect(115 + x, 83 + y, 4, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 3, 1);
        g2d.fillRect(113 + x, 84 + y, 2, 1);
        g2d.fillRect(119 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 4, 1);
        g2d.fillRect(115 + x, 85 + y, 4, 1);
        g2d.fillRect(107 + x, 86 + y, 3, 1);
        g2d.fillRect(113 + x, 86 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 84 + y, 1, 3);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 88 + y, 4, 1);
        g2d.fillRect(117 + x, 88 + y, 3, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 5, 1);
        g2d.fillRect(115 + x, 90 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 83 + y, 2, 1);
        g2d.fillRect(119 + x, 83 + y, 2, 1);
        g2d.fillRect(103 + x, 84 + y, 4, 1);
        g2d.fillRect(115 + x, 84 + y, 4, 1);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(113 + x, 85 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(111 + x, 85 + y, 1, 1);
    }

    public void paint1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 91 + y, 1, 5);
        g2d.fillRect(121 + x, 91 + y, 1, 4);
        g2d.fillRect(120 + x, 95 + y, 1, 6);
        g2d.fillRect(111 + x, 96 + y, 1, 9);
        g2d.fillRect(119 + x, 101 + y, 1, 4);
        g2d.fillRect(110 + x, 105 + y, 1, 11);
        g2d.fillRect(118 + x, 105 + y, 1, 7);
        g2d.fillRect(117 + x, 112 + y, 1, 13);
        g2d.fillRect(109 + x, 116 + y, 1, 12);
        g2d.fillRect(116 + x, 125 + y, 1, 6);
        g2d.fillRect(108 + x, 128 + y, 1, 11);
        g2d.fillRect(115 + x, 131 + y, 1, 14);
        g2d.fillRect(107 + x, 139 + y, 1, 10);
        g2d.fillRect(116 + x, 145 + y, 1, 9);
        g2d.fillRect(106 + x, 149 + y, 1, 5);
        g2d.fillRect(105 + x, 154 + y, 1, 5);
        g2d.fillRect(117 + x, 154 + y, 1, 8);
        g2d.fillRect(104 + x, 159 + y, 1, 2);
        g2d.fillRect(105 + x, 161 + y, 2, 1);
        g2d.fillRect(116 + x, 161 + y, 1, 1);
        g2d.fillRect(107 + x, 162 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 91 + y, 1, 14);
        g2d.fillRect(114 + x, 91 + y, 1, 6);
        g2d.fillRect(115 + x, 91 + y, 6, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 3);
        g2d.fillRect(115 + x, 93 + y, 1, 2);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 7);
        g2d.fillRect(112 + x, 96 + y, 1, 20);
        g2d.fillRect(118 + x, 96 + y, 1, 9);
        g2d.fillRect(117 + x, 99 + y, 1, 13);
        g2d.fillRect(114 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 22);
        g2d.fillRect(111 + x, 105 + y, 1, 23);
        g2d.fillRect(115 + x, 111 + y, 1, 20);
        g2d.fillRect(110 + x, 116 + y, 1, 24);
        g2d.fillRect(114 + x, 125 + y, 1, 29);
        g2d.fillRect(109 + x, 128 + y, 1, 21);
        g2d.fillRect(113 + x, 131 + y, 1, 14);
        g2d.fillRect(108 + x, 139 + y, 1, 15);
        g2d.fillRect(115 + x, 145 + y, 1, 17);
        g2d.fillRect(107 + x, 149 + y, 1, 13);
        g2d.fillRect(106 + x, 154 + y, 1, 7);
        g2d.fillRect(116 + x, 154 + y, 1, 7);
        g2d.fillRect(108 + x, 158 + y, 1, 4);
        g2d.fillRect(113 + x, 158 + y, 1, 4);
        g2d.fillRect(114 + x, 158 + y, 1, 4);
        g2d.fillRect(105 + x, 159 + y, 1, 2);
        g2d.fillRect(109 + x, 159 + y, 1, 3);
        g2d.fillRect(110 + x, 159 + y, 1, 3);
        g2d.fillRect(111 + x, 159 + y, 1, 3);
        g2d.fillRect(112 + x, 159 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 92 + y, 5, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 3);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 5);
        g2d.fillRect(115 + x, 95 + y, 1, 16);
        g2d.fillRect(116 + x, 95 + y, 1, 8);
        g2d.fillRect(114 + x, 97 + y, 1, 3);
        g2d.fillRect(114 + x, 101 + y, 1, 24);
        g2d.fillRect(113 + x, 105 + y, 1, 26);
        g2d.fillRect(112 + x, 116 + y, 1, 43);
        g2d.fillRect(111 + x, 128 + y, 1, 31);
        g2d.fillRect(110 + x, 140 + y, 1, 19);
        g2d.fillRect(113 + x, 145 + y, 1, 13);
        g2d.fillRect(109 + x, 149 + y, 1, 10);
        g2d.fillRect(108 + x, 154 + y, 1, 4);
        g2d.fillRect(114 + x, 154 + y, 1, 4);
    }

    public void paint2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 91 + y, 1, 14);
        g2d.fillRect(121 + x, 91 + y, 1, 10);
        g2d.fillRect(120 + x, 101 + y, 1, 4);
        g2d.fillRect(111 + x, 105 + y, 1, 11);
        g2d.fillRect(119 + x, 105 + y, 1, 7);
        g2d.fillRect(118 + x, 112 + y, 1, 13);
        g2d.fillRect(110 + x, 116 + y, 1, 12);
        g2d.fillRect(117 + x, 125 + y, 1, 6);
        g2d.fillRect(109 + x, 128 + y, 1, 11);
        g2d.fillRect(116 + x, 131 + y, 1, 14);
        g2d.fillRect(108 + x, 139 + y, 1, 10);
        g2d.fillRect(117 + x, 145 + y, 1, 9);
        g2d.fillRect(107 + x, 149 + y, 1, 5);
        g2d.fillRect(106 + x, 154 + y, 1, 5);
        g2d.fillRect(118 + x, 154 + y, 1, 8);
        g2d.fillRect(105 + x, 159 + y, 1, 2);
        g2d.fillRect(106 + x, 161 + y, 2, 1);
        g2d.fillRect(117 + x, 161 + y, 1, 1);
        g2d.fillRect(108 + x, 162 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 91 + y, 1, 25);
        g2d.fillRect(114 + x, 91 + y, 1, 14);
        g2d.fillRect(115 + x, 91 + y, 6, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 9);
        g2d.fillRect(115 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 9);
        g2d.fillRect(118 + x, 99 + y, 1, 13);
        g2d.fillRect(115 + x, 100 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 22);
        g2d.fillRect(112 + x, 105 + y, 1, 23);
        g2d.fillRect(116 + x, 111 + y, 1, 20);
        g2d.fillRect(111 + x, 116 + y, 1, 24);
        g2d.fillRect(115 + x, 125 + y, 1, 29);
        g2d.fillRect(110 + x, 128 + y, 1, 21);
        g2d.fillRect(114 + x, 131 + y, 1, 14);
        g2d.fillRect(109 + x, 139 + y, 1, 15);
        g2d.fillRect(116 + x, 145 + y, 1, 17);
        g2d.fillRect(108 + x, 149 + y, 1, 13);
        g2d.fillRect(107 + x, 154 + y, 1, 7);
        g2d.fillRect(117 + x, 154 + y, 1, 7);
        g2d.fillRect(109 + x, 158 + y, 1, 4);
        g2d.fillRect(114 + x, 158 + y, 1, 4);
        g2d.fillRect(115 + x, 158 + y, 1, 4);
        g2d.fillRect(106 + x, 159 + y, 1, 2);
        g2d.fillRect(110 + x, 159 + y, 1, 3);
        g2d.fillRect(111 + x, 159 + y, 1, 3);
        g2d.fillRect(112 + x, 159 + y, 1, 3);
        g2d.fillRect(113 + x, 159 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 92 + y, 5, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 6);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 9);
        g2d.fillRect(116 + x, 95 + y, 1, 16);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 3);
        g2d.fillRect(115 + x, 101 + y, 1, 24);
        g2d.fillRect(114 + x, 105 + y, 1, 26);
        g2d.fillRect(113 + x, 116 + y, 1, 43);
        g2d.fillRect(112 + x, 128 + y, 1, 31);
        g2d.fillRect(111 + x, 140 + y, 1, 19);
        g2d.fillRect(114 + x, 145 + y, 1, 13);
        g2d.fillRect(110 + x, 149 + y, 1, 10);
        g2d.fillRect(109 + x, 154 + y, 1, 4);
        g2d.fillRect(115 + x, 154 + y, 1, 4);
    }

    public void paint3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 91 + y, 1, 25);
        g2d.fillRect(121 + x, 91 + y, 1, 14);
        g2d.fillRect(120 + x, 105 + y, 1, 7);
        g2d.fillRect(119 + x, 112 + y, 1, 13);
        g2d.fillRect(111 + x, 116 + y, 1, 12);
        g2d.fillRect(118 + x, 125 + y, 1, 6);
        g2d.fillRect(110 + x, 128 + y, 1, 11);
        g2d.fillRect(117 + x, 131 + y, 1, 14);
        g2d.fillRect(109 + x, 139 + y, 1, 10);
        g2d.fillRect(118 + x, 145 + y, 1, 9);
        g2d.fillRect(108 + x, 149 + y, 1, 5);
        g2d.fillRect(107 + x, 154 + y, 1, 5);
        g2d.fillRect(119 + x, 154 + y, 1, 8);
        g2d.fillRect(106 + x, 159 + y, 1, 2);
        g2d.fillRect(107 + x, 161 + y, 2, 1);
        g2d.fillRect(118 + x, 161 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 91 + y, 1, 37);
        g2d.fillRect(114 + x, 91 + y, 1, 25);
        g2d.fillRect(115 + x, 91 + y, 6, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 13);
        g2d.fillRect(115 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 16);
        g2d.fillRect(118 + x, 99 + y, 1, 2);
        g2d.fillRect(118 + x, 103 + y, 1, 22);
        g2d.fillRect(117 + x, 111 + y, 1, 20);
        g2d.fillRect(112 + x, 116 + y, 1, 24);
        g2d.fillRect(116 + x, 125 + y, 1, 29);
        g2d.fillRect(111 + x, 128 + y, 1, 21);
        g2d.fillRect(115 + x, 131 + y, 1, 14);
        g2d.fillRect(110 + x, 139 + y, 1, 15);
        g2d.fillRect(117 + x, 145 + y, 1, 17);
        g2d.fillRect(109 + x, 149 + y, 1, 13);
        g2d.fillRect(108 + x, 154 + y, 1, 7);
        g2d.fillRect(118 + x, 154 + y, 1, 7);
        g2d.fillRect(110 + x, 158 + y, 1, 4);
        g2d.fillRect(115 + x, 158 + y, 1, 4);
        g2d.fillRect(116 + x, 158 + y, 1, 4);
        g2d.fillRect(107 + x, 159 + y, 1, 2);
        g2d.fillRect(111 + x, 159 + y, 1, 3);
        g2d.fillRect(112 + x, 159 + y, 1, 3);
        g2d.fillRect(113 + x, 159 + y, 1, 3);
        g2d.fillRect(114 + x, 159 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 92 + y, 5, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 6);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 17);
        g2d.fillRect(116 + x, 95 + y, 1, 30);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 34);
        g2d.fillRect(118 + x, 101 + y, 1, 2);
        g2d.fillRect(114 + x, 116 + y, 1, 43);
        g2d.fillRect(113 + x, 128 + y, 1, 31);
        g2d.fillRect(112 + x, 140 + y, 1, 19);
        g2d.fillRect(115 + x, 145 + y, 1, 13);
        g2d.fillRect(111 + x, 149 + y, 1, 10);
        g2d.fillRect(110 + x, 154 + y, 1, 4);
        g2d.fillRect(116 + x, 154 + y, 1, 4);
    }

    public void paint4(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 91 + y, 1, 13);
        g2d.fillRect(121 + x, 91 + y, 1, 9);
        g2d.fillRect(120 + x, 100 + y, 1, 4);
        g2d.fillRect(111 + x, 104 + y, 1, 10);
        g2d.fillRect(119 + x, 104 + y, 1, 6);
        g2d.fillRect(118 + x, 110 + y, 1, 12);
        g2d.fillRect(110 + x, 114 + y, 1, 10);
        g2d.fillRect(117 + x, 122 + y, 1, 5);
        g2d.fillRect(109 + x, 124 + y, 1, 11);
        g2d.fillRect(116 + x, 127 + y, 1, 14);
        g2d.fillRect(108 + x, 135 + y, 1, 10);
        g2d.fillRect(117 + x, 141 + y, 1, 9);
        g2d.fillRect(107 + x, 145 + y, 1, 5);
        g2d.fillRect(106 + x, 150 + y, 1, 5);
        g2d.fillRect(118 + x, 150 + y, 1, 8);
        g2d.fillRect(105 + x, 155 + y, 1, 2);
        g2d.fillRect(106 + x, 157 + y, 2, 1);
        g2d.fillRect(117 + x, 157 + y, 1, 1);
        g2d.fillRect(108 + x, 158 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 91 + y, 1, 23);
        g2d.fillRect(114 + x, 91 + y, 1, 13);
        g2d.fillRect(115 + x, 91 + y, 6, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 8);
        g2d.fillRect(115 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 8);
        g2d.fillRect(118 + x, 99 + y, 1, 11);
        g2d.fillRect(117 + x, 102 + y, 1, 20);
        g2d.fillRect(112 + x, 104 + y, 1, 20);
        g2d.fillRect(116 + x, 109 + y, 1, 18);
        g2d.fillRect(111 + x, 114 + y, 1, 22);
        g2d.fillRect(115 + x, 121 + y, 1, 29);
        g2d.fillRect(110 + x, 124 + y, 1, 21);
        g2d.fillRect(114 + x, 127 + y, 1, 14);
        g2d.fillRect(109 + x, 135 + y, 1, 15);
        g2d.fillRect(116 + x, 141 + y, 1, 17);
        g2d.fillRect(108 + x, 145 + y, 1, 13);
        g2d.fillRect(107 + x, 150 + y, 1, 7);
        g2d.fillRect(117 + x, 150 + y, 1, 7);
        g2d.fillRect(109 + x, 154 + y, 1, 4);
        g2d.fillRect(114 + x, 154 + y, 1, 4);
        g2d.fillRect(115 + x, 154 + y, 1, 4);
        g2d.fillRect(106 + x, 155 + y, 1, 2);
        g2d.fillRect(110 + x, 155 + y, 1, 3);
        g2d.fillRect(111 + x, 155 + y, 1, 3);
        g2d.fillRect(112 + x, 155 + y, 1, 3);
        g2d.fillRect(113 + x, 155 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 92 + y, 5, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 6);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 8);
        g2d.fillRect(116 + x, 95 + y, 1, 14);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 24);
        g2d.fillRect(114 + x, 104 + y, 1, 23);
        g2d.fillRect(113 + x, 114 + y, 1, 41);
        g2d.fillRect(112 + x, 124 + y, 1, 31);
        g2d.fillRect(111 + x, 136 + y, 1, 19);
        g2d.fillRect(114 + x, 141 + y, 1, 13);
        g2d.fillRect(110 + x, 145 + y, 1, 10);
        g2d.fillRect(109 + x, 150 + y, 1, 4);
        g2d.fillRect(115 + x, 150 + y, 1, 4);
    }

    public void paint5(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 91 + y, 1, 11);
        g2d.fillRect(121 + x, 91 + y, 1, 8);
        g2d.fillRect(120 + x, 99 + y, 1, 3);
        g2d.fillRect(111 + x, 102 + y, 1, 8);
        g2d.fillRect(119 + x, 102 + y, 1, 4);
        g2d.fillRect(118 + x, 106 + y, 1, 13);
        g2d.fillRect(110 + x, 110 + y, 1, 10);
        g2d.fillRect(117 + x, 119 + y, 1, 4);
        g2d.fillRect(109 + x, 120 + y, 1, 11);
        g2d.fillRect(116 + x, 123 + y, 1, 14);
        g2d.fillRect(108 + x, 131 + y, 1, 10);
        g2d.fillRect(117 + x, 137 + y, 1, 9);
        g2d.fillRect(107 + x, 141 + y, 1, 5);
        g2d.fillRect(106 + x, 146 + y, 1, 5);
        g2d.fillRect(118 + x, 146 + y, 1, 8);
        g2d.fillRect(105 + x, 151 + y, 1, 2);
        g2d.fillRect(106 + x, 153 + y, 2, 1);
        g2d.fillRect(117 + x, 153 + y, 1, 1);
        g2d.fillRect(108 + x, 154 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 91 + y, 1, 19);
        g2d.fillRect(114 + x, 91 + y, 1, 11);
        g2d.fillRect(115 + x, 91 + y, 6, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 7);
        g2d.fillRect(115 + x, 93 + y, 1, 3);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 6);
        g2d.fillRect(118 + x, 98 + y, 1, 8);
        g2d.fillRect(117 + x, 100 + y, 1, 19);
        g2d.fillRect(112 + x, 102 + y, 1, 18);
        g2d.fillRect(116 + x, 105 + y, 1, 18);
        g2d.fillRect(111 + x, 110 + y, 1, 22);
        g2d.fillRect(115 + x, 118 + y, 1, 28);
        g2d.fillRect(110 + x, 120 + y, 1, 21);
        g2d.fillRect(114 + x, 123 + y, 1, 14);
        g2d.fillRect(109 + x, 131 + y, 1, 15);
        g2d.fillRect(116 + x, 137 + y, 1, 17);
        g2d.fillRect(108 + x, 141 + y, 1, 13);
        g2d.fillRect(107 + x, 146 + y, 1, 7);
        g2d.fillRect(117 + x, 146 + y, 1, 7);
        g2d.fillRect(109 + x, 150 + y, 1, 4);
        g2d.fillRect(114 + x, 150 + y, 1, 4);
        g2d.fillRect(115 + x, 150 + y, 1, 4);
        g2d.fillRect(106 + x, 151 + y, 1, 2);
        g2d.fillRect(110 + x, 151 + y, 1, 3);
        g2d.fillRect(111 + x, 151 + y, 1, 3);
        g2d.fillRect(112 + x, 151 + y, 1, 3);
        g2d.fillRect(113 + x, 151 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 92 + y, 5, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 5);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 6);
        g2d.fillRect(116 + x, 95 + y, 1, 10);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 22);
        g2d.fillRect(114 + x, 102 + y, 1, 21);
        g2d.fillRect(113 + x, 110 + y, 1, 41);
        g2d.fillRect(112 + x, 120 + y, 1, 31);
        g2d.fillRect(111 + x, 132 + y, 1, 19);
        g2d.fillRect(114 + x, 137 + y, 1, 13);
        g2d.fillRect(110 + x, 141 + y, 1, 10);
        g2d.fillRect(109 + x, 146 + y, 1, 4);
        g2d.fillRect(115 + x, 146 + y, 1, 4);
    }

    public void paint6(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 91 + y, 1, 14);
        g2d.fillRect(121 + x, 91 + y, 1, 8);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 101 + y, 1, 14);
        g2d.fillRect(111 + x, 105 + y, 1, 10);
        g2d.fillRect(110 + x, 115 + y, 1, 10);
        g2d.fillRect(118 + x, 115 + y, 1, 4);
        g2d.fillRect(117 + x, 119 + y, 1, 12);
        g2d.fillRect(109 + x, 125 + y, 1, 10);
        g2d.fillRect(118 + x, 131 + y, 1, 9);
        g2d.fillRect(108 + x, 135 + y, 1, 5);
        g2d.fillRect(107 + x, 140 + y, 1, 5);
        g2d.fillRect(119 + x, 140 + y, 1, 8);
        g2d.fillRect(106 + x, 145 + y, 1, 2);
        g2d.fillRect(107 + x, 147 + y, 2, 1);
        g2d.fillRect(118 + x, 147 + y, 1, 1);
        g2d.fillRect(109 + x, 148 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 91 + y, 1, 24);
        g2d.fillRect(114 + x, 91 + y, 1, 14);
        g2d.fillRect(115 + x, 91 + y, 6, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 7);
        g2d.fillRect(115 + x, 93 + y, 1, 3);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 5);
        g2d.fillRect(118 + x, 97 + y, 1, 18);
        g2d.fillRect(117 + x, 100 + y, 1, 19);
        g2d.fillRect(112 + x, 105 + y, 1, 21);
        g2d.fillRect(116 + x, 113 + y, 1, 27);
        g2d.fillRect(111 + x, 115 + y, 1, 20);
        g2d.fillRect(115 + x, 118 + y, 1, 13);
        g2d.fillRect(110 + x, 125 + y, 1, 15);
        g2d.fillRect(117 + x, 131 + y, 1, 17);
        g2d.fillRect(109 + x, 135 + y, 1, 13);
        g2d.fillRect(108 + x, 140 + y, 1, 7);
        g2d.fillRect(118 + x, 140 + y, 1, 7);
        g2d.fillRect(110 + x, 144 + y, 1, 4);
        g2d.fillRect(115 + x, 144 + y, 1, 4);
        g2d.fillRect(116 + x, 144 + y, 1, 4);
        g2d.fillRect(107 + x, 145 + y, 1, 2);
        g2d.fillRect(111 + x, 145 + y, 1, 3);
        g2d.fillRect(112 + x, 145 + y, 1, 3);
        g2d.fillRect(113 + x, 145 + y, 1, 3);
        g2d.fillRect(114 + x, 145 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 92 + y, 5, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 4);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 6);
        g2d.fillRect(116 + x, 95 + y, 1, 18);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 22);
        g2d.fillRect(114 + x, 105 + y, 1, 40);
        g2d.fillRect(113 + x, 115 + y, 1, 30);
        g2d.fillRect(112 + x, 126 + y, 1, 19);
        g2d.fillRect(115 + x, 131 + y, 1, 13);
        g2d.fillRect(111 + x, 135 + y, 1, 10);
        g2d.fillRect(110 + x, 140 + y, 1, 4);
        g2d.fillRect(116 + x, 140 + y, 1, 4);
    }

    public void paint7(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 12);
        g2d.fillRect(121 + x, 91 + y, 1, 9);
        g2d.fillRect(120 + x, 100 + y, 1, 13);
        g2d.fillRect(112 + x, 103 + y, 1, 10);
        g2d.fillRect(111 + x, 113 + y, 1, 9);
        g2d.fillRect(119 + x, 113 + y, 1, 4);
        g2d.fillRect(118 + x, 117 + y, 1, 10);
        g2d.fillRect(110 + x, 122 + y, 1, 9);
        g2d.fillRect(119 + x, 127 + y, 1, 9);
        g2d.fillRect(109 + x, 131 + y, 1, 5);
        g2d.fillRect(108 + x, 136 + y, 1, 5);
        g2d.fillRect(120 + x, 136 + y, 1, 8);
        g2d.fillRect(107 + x, 141 + y, 1, 2);
        g2d.fillRect(108 + x, 143 + y, 2, 1);
        g2d.fillRect(119 + x, 143 + y, 1, 1);
        g2d.fillRect(110 + x, 144 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 91 + y, 1, 22);
        g2d.fillRect(115 + x, 91 + y, 1, 12);
        g2d.fillRect(116 + x, 91 + y, 5, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 8);
        g2d.fillRect(116 + x, 93 + y, 1, 3);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 2);
        g2d.fillRect(119 + x, 96 + y, 1, 17);
        g2d.fillRect(118 + x, 99 + y, 1, 18);
        g2d.fillRect(113 + x, 103 + y, 1, 20);
        g2d.fillRect(117 + x, 111 + y, 1, 25);
        g2d.fillRect(112 + x, 113 + y, 1, 18);
        g2d.fillRect(116 + x, 116 + y, 1, 11);
        g2d.fillRect(111 + x, 122 + y, 1, 14);
        g2d.fillRect(118 + x, 127 + y, 1, 17);
        g2d.fillRect(110 + x, 131 + y, 1, 13);
        g2d.fillRect(109 + x, 136 + y, 1, 7);
        g2d.fillRect(119 + x, 136 + y, 1, 7);
        g2d.fillRect(111 + x, 140 + y, 1, 4);
        g2d.fillRect(116 + x, 140 + y, 1, 4);
        g2d.fillRect(117 + x, 140 + y, 1, 4);
        g2d.fillRect(108 + x, 141 + y, 1, 2);
        g2d.fillRect(112 + x, 141 + y, 1, 3);
        g2d.fillRect(113 + x, 141 + y, 1, 3);
        g2d.fillRect(114 + x, 141 + y, 1, 3);
        g2d.fillRect(115 + x, 141 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 92 + y, 4, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 3);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 17);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 20);
        g2d.fillRect(118 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 1, 38);
        g2d.fillRect(114 + x, 113 + y, 1, 28);
        g2d.fillRect(113 + x, 123 + y, 1, 18);
        g2d.fillRect(116 + x, 127 + y, 1, 13);
        g2d.fillRect(112 + x, 131 + y, 1, 10);
        g2d.fillRect(111 + x, 136 + y, 1, 4);
        g2d.fillRect(117 + x, 136 + y, 1, 4);
    }

    public void paintBack1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 91 + y, 1, 5);
        g2d.fillRect(94 + x, 91 + y, 1, 4);
        g2d.fillRect(95 + x, 95 + y, 1, 6);
        g2d.fillRect(104 + x, 96 + y, 1, 9);
        g2d.fillRect(96 + x, 101 + y, 1, 4);
        g2d.fillRect(105 + x, 105 + y, 1, 11);
        g2d.fillRect(97 + x, 105 + y, 1, 7);
        g2d.fillRect(98 + x, 112 + y, 1, 13);
        g2d.fillRect(106 + x, 116 + y, 1, 12);
        g2d.fillRect(99 + x, 125 + y, 1, 6);
        g2d.fillRect(107 + x, 128 + y, 1, 11);
        g2d.fillRect(100 + x, 131 + y, 1, 14);
        g2d.fillRect(108 + x, 139 + y, 1, 10);
        g2d.fillRect(99 + x, 145 + y, 1, 9);
        g2d.fillRect(109 + x, 149 + y, 1, 5);
        g2d.fillRect(110 + x, 154 + y, 1, 5);
        g2d.fillRect(98 + x, 154 + y, 1, 8);
        g2d.fillRect(111 + x, 159 + y, 1, 2);
        g2d.fillRect(109 + x, 161 + y, 2, 1);
        g2d.fillRect(99 + x, 161 + y, 1, 1);
        g2d.fillRect(100 + x, 162 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 91 + y, 1, 14);
        g2d.fillRect(101 + x, 91 + y, 1, 6);
        g2d.fillRect(95 + x, 91 + y, 6, 1);
        g2d.fillRect(95 + x, 92 + y, 1, 3);
        g2d.fillRect(100 + x, 93 + y, 1, 2);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 7);
        g2d.fillRect(103 + x, 96 + y, 1, 20);
        g2d.fillRect(97 + x, 96 + y, 1, 9);
        g2d.fillRect(98 + x, 99 + y, 1, 13);
        g2d.fillRect(101 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 103 + y, 1, 22);
        g2d.fillRect(104 + x, 105 + y, 1, 23);
        g2d.fillRect(100 + x, 111 + y, 1, 20);
        g2d.fillRect(105 + x, 116 + y, 1, 24);
        g2d.fillRect(101 + x, 125 + y, 1, 29);
        g2d.fillRect(106 + x, 128 + y, 1, 21);
        g2d.fillRect(102 + x, 131 + y, 1, 14);
        g2d.fillRect(107 + x, 139 + y, 1, 15);
        g2d.fillRect(100 + x, 145 + y, 1, 17);
        g2d.fillRect(108 + x, 149 + y, 1, 13);
        g2d.fillRect(109 + x, 154 + y, 1, 7);
        g2d.fillRect(99 + x, 154 + y, 1, 7);
        g2d.fillRect(107 + x, 158 + y, 1, 4);
        g2d.fillRect(102 + x, 158 + y, 1, 4);
        g2d.fillRect(101 + x, 158 + y, 1, 4);
        g2d.fillRect(110 + x, 159 + y, 1, 2);
        g2d.fillRect(106 + x, 159 + y, 1, 3);
        g2d.fillRect(105 + x, 159 + y, 1, 3);
        g2d.fillRect(104 + x, 159 + y, 1, 3);
        g2d.fillRect(103 + x, 159 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 92 + y, 5, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 3);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 5);
        g2d.fillRect(100 + x, 95 + y, 1, 16);
        g2d.fillRect(99 + x, 95 + y, 1, 8);
        g2d.fillRect(101 + x, 97 + y, 1, 3);
        g2d.fillRect(101 + x, 101 + y, 1, 24);
        g2d.fillRect(102 + x, 105 + y, 1, 26);
        g2d.fillRect(103 + x, 116 + y, 1, 43);
        g2d.fillRect(104 + x, 128 + y, 1, 31);
        g2d.fillRect(105 + x, 140 + y, 1, 19);
        g2d.fillRect(102 + x, 145 + y, 1, 13);
        g2d.fillRect(106 + x, 149 + y, 1, 10);
        g2d.fillRect(107 + x, 154 + y, 1, 4);
        g2d.fillRect(101 + x, 154 + y, 1, 4);
    }

    public void paintBack2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 91 + y, 1, 14);
        g2d.fillRect(94 + x, 91 + y, 1, 10);
        g2d.fillRect(95 + x, 101 + y, 1, 4);
        g2d.fillRect(104 + x, 105 + y, 1, 11);
        g2d.fillRect(96 + x, 105 + y, 1, 7);
        g2d.fillRect(97 + x, 112 + y, 1, 13);
        g2d.fillRect(105 + x, 116 + y, 1, 12);
        g2d.fillRect(98 + x, 125 + y, 1, 6);
        g2d.fillRect(106 + x, 128 + y, 1, 11);
        g2d.fillRect(99 + x, 131 + y, 1, 14);
        g2d.fillRect(107 + x, 139 + y, 1, 10);
        g2d.fillRect(98 + x, 145 + y, 1, 9);
        g2d.fillRect(108 + x, 149 + y, 1, 5);
        g2d.fillRect(109 + x, 154 + y, 1, 5);
        g2d.fillRect(97 + x, 154 + y, 1, 8);
        g2d.fillRect(110 + x, 159 + y, 1, 2);
        g2d.fillRect(108 + x, 161 + y, 2, 1);
        g2d.fillRect(98 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 162 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 91 + y, 1, 25);
        g2d.fillRect(101 + x, 91 + y, 1, 14);
        g2d.fillRect(95 + x, 91 + y, 6, 1);
        g2d.fillRect(95 + x, 92 + y, 1, 9);
        g2d.fillRect(100 + x, 93 + y, 1, 4);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 9);
        g2d.fillRect(97 + x, 99 + y, 1, 13);
        g2d.fillRect(100 + x, 100 + y, 1, 1);
        g2d.fillRect(98 + x, 103 + y, 1, 22);
        g2d.fillRect(103 + x, 105 + y, 1, 23);
        g2d.fillRect(99 + x, 111 + y, 1, 20);
        g2d.fillRect(104 + x, 116 + y, 1, 24);
        g2d.fillRect(100 + x, 125 + y, 1, 29);
        g2d.fillRect(105 + x, 128 + y, 1, 21);
        g2d.fillRect(101 + x, 131 + y, 1, 14);
        g2d.fillRect(106 + x, 139 + y, 1, 15);
        g2d.fillRect(99 + x, 145 + y, 1, 17);
        g2d.fillRect(107 + x, 149 + y, 1, 13);
        g2d.fillRect(108 + x, 154 + y, 1, 7);
        g2d.fillRect(98 + x, 154 + y, 1, 7);
        g2d.fillRect(106 + x, 158 + y, 1, 4);
        g2d.fillRect(101 + x, 158 + y, 1, 4);
        g2d.fillRect(100 + x, 158 + y, 1, 4);
        g2d.fillRect(109 + x, 159 + y, 1, 2);
        g2d.fillRect(105 + x, 159 + y, 1, 3);
        g2d.fillRect(104 + x, 159 + y, 1, 3);
        g2d.fillRect(103 + x, 159 + y, 1, 3);
        g2d.fillRect(102 + x, 159 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 92 + y, 5, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 6);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 9);
        g2d.fillRect(99 + x, 95 + y, 1, 16);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 3);
        g2d.fillRect(100 + x, 101 + y, 1, 24);
        g2d.fillRect(101 + x, 105 + y, 1, 26);
        g2d.fillRect(102 + x, 116 + y, 1, 43);
        g2d.fillRect(103 + x, 128 + y, 1, 31);
        g2d.fillRect(104 + x, 140 + y, 1, 19);
        g2d.fillRect(101 + x, 145 + y, 1, 13);
        g2d.fillRect(105 + x, 149 + y, 1, 10);
        g2d.fillRect(106 + x, 154 + y, 1, 4);
        g2d.fillRect(100 + x, 154 + y, 1, 4);
    }

    public void paintBack3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 91 + y, 1, 25);
        g2d.fillRect(94 + x, 91 + y, 1, 14);
        g2d.fillRect(95 + x, 105 + y, 1, 7);
        g2d.fillRect(96 + x, 112 + y, 1, 13);
        g2d.fillRect(104 + x, 116 + y, 1, 12);
        g2d.fillRect(97 + x, 125 + y, 1, 6);
        g2d.fillRect(105 + x, 128 + y, 1, 11);
        g2d.fillRect(98 + x, 131 + y, 1, 14);
        g2d.fillRect(106 + x, 139 + y, 1, 10);
        g2d.fillRect(97 + x, 145 + y, 1, 9);
        g2d.fillRect(107 + x, 149 + y, 1, 5);
        g2d.fillRect(108 + x, 154 + y, 1, 5);
        g2d.fillRect(96 + x, 154 + y, 1, 8);
        g2d.fillRect(109 + x, 159 + y, 1, 2);
        g2d.fillRect(107 + x, 161 + y, 2, 1);
        g2d.fillRect(97 + x, 161 + y, 1, 1);
        g2d.fillRect(98 + x, 162 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 91 + y, 1, 37);
        g2d.fillRect(101 + x, 91 + y, 1, 25);
        g2d.fillRect(95 + x, 91 + y, 6, 1);
        g2d.fillRect(95 + x, 92 + y, 1, 13);
        g2d.fillRect(100 + x, 93 + y, 1, 4);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 16);
        g2d.fillRect(97 + x, 99 + y, 1, 2);
        g2d.fillRect(97 + x, 103 + y, 1, 22);
        g2d.fillRect(98 + x, 111 + y, 1, 20);
        g2d.fillRect(103 + x, 116 + y, 1, 24);
        g2d.fillRect(99 + x, 125 + y, 1, 29);
        g2d.fillRect(104 + x, 128 + y, 1, 21);
        g2d.fillRect(100 + x, 131 + y, 1, 14);
        g2d.fillRect(105 + x, 139 + y, 1, 15);
        g2d.fillRect(98 + x, 145 + y, 1, 17);
        g2d.fillRect(106 + x, 149 + y, 1, 13);
        g2d.fillRect(107 + x, 154 + y, 1, 7);
        g2d.fillRect(97 + x, 154 + y, 1, 7);
        g2d.fillRect(105 + x, 158 + y, 1, 4);
        g2d.fillRect(100 + x, 158 + y, 1, 4);
        g2d.fillRect(99 + x, 158 + y, 1, 4);
        g2d.fillRect(108 + x, 159 + y, 1, 2);
        g2d.fillRect(104 + x, 159 + y, 1, 3);
        g2d.fillRect(103 + x, 159 + y, 1, 3);
        g2d.fillRect(102 + x, 159 + y, 1, 3);
        g2d.fillRect(101 + x, 159 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 92 + y, 5, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 6);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 17);
        g2d.fillRect(99 + x, 95 + y, 1, 30);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 34);
        g2d.fillRect(97 + x, 101 + y, 1, 2);
        g2d.fillRect(101 + x, 116 + y, 1, 43);
        g2d.fillRect(102 + x, 128 + y, 1, 31);
        g2d.fillRect(103 + x, 140 + y, 1, 19);
        g2d.fillRect(100 + x, 145 + y, 1, 13);
        g2d.fillRect(104 + x, 149 + y, 1, 10);
        g2d.fillRect(105 + x, 154 + y, 1, 4);
        g2d.fillRect(99 + x, 154 + y, 1, 4);
    }

    public void paintBack4(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 91 + y, 1, 13);
        g2d.fillRect(94 + x, 91 + y, 1, 9);
        g2d.fillRect(95 + x, 100 + y, 1, 4);
        g2d.fillRect(104 + x, 104 + y, 1, 10);
        g2d.fillRect(96 + x, 104 + y, 1, 6);
        g2d.fillRect(97 + x, 110 + y, 1, 12);
        g2d.fillRect(105 + x, 114 + y, 1, 10);
        g2d.fillRect(98 + x, 122 + y, 1, 5);
        g2d.fillRect(106 + x, 124 + y, 1, 11);
        g2d.fillRect(99 + x, 127 + y, 1, 14);
        g2d.fillRect(107 + x, 135 + y, 1, 10);
        g2d.fillRect(98 + x, 141 + y, 1, 9);
        g2d.fillRect(108 + x, 145 + y, 1, 5);
        g2d.fillRect(109 + x, 150 + y, 1, 5);
        g2d.fillRect(97 + x, 150 + y, 1, 8);
        g2d.fillRect(110 + x, 155 + y, 1, 2);
        g2d.fillRect(108 + x, 157 + y, 2, 1);
        g2d.fillRect(98 + x, 157 + y, 1, 1);
        g2d.fillRect(99 + x, 158 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 91 + y, 1, 23);
        g2d.fillRect(101 + x, 91 + y, 1, 13);
        g2d.fillRect(95 + x, 91 + y, 6, 1);
        g2d.fillRect(95 + x, 92 + y, 1, 8);
        g2d.fillRect(100 + x, 93 + y, 1, 4);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 8);
        g2d.fillRect(97 + x, 99 + y, 1, 11);
        g2d.fillRect(98 + x, 102 + y, 1, 20);
        g2d.fillRect(103 + x, 104 + y, 1, 20);
        g2d.fillRect(99 + x, 109 + y, 1, 18);
        g2d.fillRect(104 + x, 114 + y, 1, 22);
        g2d.fillRect(100 + x, 121 + y, 1, 29);
        g2d.fillRect(105 + x, 124 + y, 1, 21);
        g2d.fillRect(101 + x, 127 + y, 1, 14);
        g2d.fillRect(106 + x, 135 + y, 1, 15);
        g2d.fillRect(99 + x, 141 + y, 1, 17);
        g2d.fillRect(107 + x, 145 + y, 1, 13);
        g2d.fillRect(108 + x, 150 + y, 1, 7);
        g2d.fillRect(98 + x, 150 + y, 1, 7);
        g2d.fillRect(106 + x, 154 + y, 1, 4);
        g2d.fillRect(101 + x, 154 + y, 1, 4);
        g2d.fillRect(100 + x, 154 + y, 1, 4);
        g2d.fillRect(109 + x, 155 + y, 1, 2);
        g2d.fillRect(105 + x, 155 + y, 1, 3);
        g2d.fillRect(104 + x, 155 + y, 1, 3);
        g2d.fillRect(103 + x, 155 + y, 1, 3);
        g2d.fillRect(102 + x, 155 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 92 + y, 5, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 6);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 8);
        g2d.fillRect(99 + x, 95 + y, 1, 14);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 24);
        g2d.fillRect(101 + x, 104 + y, 1, 23);
        g2d.fillRect(102 + x, 114 + y, 1, 41);
        g2d.fillRect(103 + x, 124 + y, 1, 31);
        g2d.fillRect(104 + x, 136 + y, 1, 19);
        g2d.fillRect(101 + x, 141 + y, 1, 13);
        g2d.fillRect(105 + x, 145 + y, 1, 10);
        g2d.fillRect(106 + x, 150 + y, 1, 4);
        g2d.fillRect(100 + x, 150 + y, 1, 4);
    }

    public void paintBack5(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 91 + y, 1, 11);
        g2d.fillRect(94 + x, 91 + y, 1, 8);
        g2d.fillRect(95 + x, 99 + y, 1, 3);
        g2d.fillRect(104 + x, 102 + y, 1, 8);
        g2d.fillRect(96 + x, 102 + y, 1, 4);
        g2d.fillRect(97 + x, 106 + y, 1, 13);
        g2d.fillRect(105 + x, 110 + y, 1, 10);
        g2d.fillRect(98 + x, 119 + y, 1, 4);
        g2d.fillRect(106 + x, 120 + y, 1, 11);
        g2d.fillRect(99 + x, 123 + y, 1, 14);
        g2d.fillRect(107 + x, 131 + y, 1, 10);
        g2d.fillRect(98 + x, 137 + y, 1, 9);
        g2d.fillRect(108 + x, 141 + y, 1, 5);
        g2d.fillRect(109 + x, 146 + y, 1, 5);
        g2d.fillRect(97 + x, 146 + y, 1, 8);
        g2d.fillRect(110 + x, 151 + y, 1, 2);
        g2d.fillRect(108 + x, 153 + y, 2, 1);
        g2d.fillRect(98 + x, 153 + y, 1, 1);
        g2d.fillRect(99 + x, 154 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 91 + y, 1, 19);
        g2d.fillRect(101 + x, 91 + y, 1, 11);
        g2d.fillRect(95 + x, 91 + y, 6, 1);
        g2d.fillRect(95 + x, 92 + y, 1, 7);
        g2d.fillRect(100 + x, 93 + y, 1, 3);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 6);
        g2d.fillRect(97 + x, 98 + y, 1, 8);
        g2d.fillRect(98 + x, 100 + y, 1, 19);
        g2d.fillRect(103 + x, 102 + y, 1, 18);
        g2d.fillRect(99 + x, 105 + y, 1, 18);
        g2d.fillRect(104 + x, 110 + y, 1, 22);
        g2d.fillRect(100 + x, 118 + y, 1, 28);
        g2d.fillRect(105 + x, 120 + y, 1, 21);
        g2d.fillRect(101 + x, 123 + y, 1, 14);
        g2d.fillRect(106 + x, 131 + y, 1, 15);
        g2d.fillRect(99 + x, 137 + y, 1, 17);
        g2d.fillRect(107 + x, 141 + y, 1, 13);
        g2d.fillRect(108 + x, 146 + y, 1, 7);
        g2d.fillRect(98 + x, 146 + y, 1, 7);
        g2d.fillRect(106 + x, 150 + y, 1, 4);
        g2d.fillRect(101 + x, 150 + y, 1, 4);
        g2d.fillRect(100 + x, 150 + y, 1, 4);
        g2d.fillRect(109 + x, 151 + y, 1, 2);
        g2d.fillRect(105 + x, 151 + y, 1, 3);
        g2d.fillRect(104 + x, 151 + y, 1, 3);
        g2d.fillRect(103 + x, 151 + y, 1, 3);
        g2d.fillRect(102 + x, 151 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 92 + y, 5, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 5);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 6);
        g2d.fillRect(99 + x, 95 + y, 1, 10);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 22);
        g2d.fillRect(101 + x, 102 + y, 1, 21);
        g2d.fillRect(102 + x, 110 + y, 1, 41);
        g2d.fillRect(103 + x, 120 + y, 1, 31);
        g2d.fillRect(104 + x, 132 + y, 1, 19);
        g2d.fillRect(101 + x, 137 + y, 1, 13);
        g2d.fillRect(105 + x, 141 + y, 1, 10);
        g2d.fillRect(106 + x, 146 + y, 1, 4);
        g2d.fillRect(100 + x, 146 + y, 1, 4);
    }

    public void paintBack6(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 91 + y, 1, 14);
        g2d.fillRect(94 + x, 91 + y, 1, 8);
        g2d.fillRect(95 + x, 99 + y, 1, 2);
        g2d.fillRect(96 + x, 101 + y, 1, 14);
        g2d.fillRect(104 + x, 105 + y, 1, 10);
        g2d.fillRect(105 + x, 115 + y, 1, 10);
        g2d.fillRect(97 + x, 115 + y, 1, 4);
        g2d.fillRect(98 + x, 119 + y, 1, 12);
        g2d.fillRect(106 + x, 125 + y, 1, 10);
        g2d.fillRect(97 + x, 131 + y, 1, 9);
        g2d.fillRect(107 + x, 135 + y, 1, 5);
        g2d.fillRect(108 + x, 140 + y, 1, 5);
        g2d.fillRect(96 + x, 140 + y, 1, 8);
        g2d.fillRect(109 + x, 145 + y, 1, 2);
        g2d.fillRect(107 + x, 147 + y, 2, 1);
        g2d.fillRect(97 + x, 147 + y, 1, 1);
        g2d.fillRect(98 + x, 148 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 91 + y, 1, 24);
        g2d.fillRect(101 + x, 91 + y, 1, 14);
        g2d.fillRect(95 + x, 91 + y, 6, 1);
        g2d.fillRect(95 + x, 92 + y, 1, 7);
        g2d.fillRect(100 + x, 93 + y, 1, 3);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 5);
        g2d.fillRect(97 + x, 97 + y, 1, 18);
        g2d.fillRect(98 + x, 100 + y, 1, 19);
        g2d.fillRect(103 + x, 105 + y, 1, 21);
        g2d.fillRect(99 + x, 113 + y, 1, 27);
        g2d.fillRect(104 + x, 115 + y, 1, 20);
        g2d.fillRect(100 + x, 118 + y, 1, 13);
        g2d.fillRect(105 + x, 125 + y, 1, 15);
        g2d.fillRect(98 + x, 131 + y, 1, 17);
        g2d.fillRect(106 + x, 135 + y, 1, 13);
        g2d.fillRect(107 + x, 140 + y, 1, 7);
        g2d.fillRect(97 + x, 140 + y, 1, 7);
        g2d.fillRect(105 + x, 144 + y, 1, 4);
        g2d.fillRect(100 + x, 144 + y, 1, 4);
        g2d.fillRect(99 + x, 144 + y, 1, 4);
        g2d.fillRect(108 + x, 145 + y, 1, 2);
        g2d.fillRect(104 + x, 145 + y, 1, 3);
        g2d.fillRect(103 + x, 145 + y, 1, 3);
        g2d.fillRect(102 + x, 145 + y, 1, 3);
        g2d.fillRect(101 + x, 145 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 92 + y, 5, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 4);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 6);
        g2d.fillRect(99 + x, 95 + y, 1, 18);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 22);
        g2d.fillRect(101 + x, 105 + y, 1, 40);
        g2d.fillRect(102 + x, 115 + y, 1, 30);
        g2d.fillRect(103 + x, 126 + y, 1, 19);
        g2d.fillRect(100 + x, 131 + y, 1, 13);
        g2d.fillRect(104 + x, 135 + y, 1, 10);
        g2d.fillRect(105 + x, 140 + y, 1, 4);
        g2d.fillRect(99 + x, 140 + y, 1, 4);
    }

    public void paintBack7(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 12);
        g2d.fillRect(94 + x, 91 + y, 1, 9);
        g2d.fillRect(95 + x, 100 + y, 1, 13);
        g2d.fillRect(103 + x, 103 + y, 1, 10);
        g2d.fillRect(104 + x, 113 + y, 1, 9);
        g2d.fillRect(96 + x, 113 + y, 1, 4);
        g2d.fillRect(97 + x, 117 + y, 1, 10);
        g2d.fillRect(105 + x, 122 + y, 1, 9);
        g2d.fillRect(96 + x, 127 + y, 1, 9);
        g2d.fillRect(106 + x, 131 + y, 1, 5);
        g2d.fillRect(107 + x, 136 + y, 1, 5);
        g2d.fillRect(95 + x, 136 + y, 1, 8);
        g2d.fillRect(108 + x, 141 + y, 1, 2);
        g2d.fillRect(106 + x, 143 + y, 2, 1);
        g2d.fillRect(96 + x, 143 + y, 1, 1);
        g2d.fillRect(97 + x, 144 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 1, 22);
        g2d.fillRect(100 + x, 91 + y, 1, 12);
        g2d.fillRect(95 + x, 91 + y, 5, 1);
        g2d.fillRect(95 + x, 92 + y, 1, 8);
        g2d.fillRect(99 + x, 93 + y, 1, 3);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(97 + x, 96 + y, 1, 2);
        g2d.fillRect(96 + x, 96 + y, 1, 17);
        g2d.fillRect(97 + x, 99 + y, 1, 18);
        g2d.fillRect(102 + x, 103 + y, 1, 20);
        g2d.fillRect(98 + x, 111 + y, 1, 25);
        g2d.fillRect(103 + x, 113 + y, 1, 18);
        g2d.fillRect(99 + x, 116 + y, 1, 11);
        g2d.fillRect(104 + x, 122 + y, 1, 14);
        g2d.fillRect(97 + x, 127 + y, 1, 17);
        g2d.fillRect(105 + x, 131 + y, 1, 13);
        g2d.fillRect(106 + x, 136 + y, 1, 7);
        g2d.fillRect(96 + x, 136 + y, 1, 7);
        g2d.fillRect(104 + x, 140 + y, 1, 4);
        g2d.fillRect(99 + x, 140 + y, 1, 4);
        g2d.fillRect(98 + x, 140 + y, 1, 4);
        g2d.fillRect(107 + x, 141 + y, 1, 2);
        g2d.fillRect(103 + x, 141 + y, 1, 3);
        g2d.fillRect(102 + x, 141 + y, 1, 3);
        g2d.fillRect(101 + x, 141 + y, 1, 3);
        g2d.fillRect(100 + x, 141 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 92 + y, 4, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 3);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 17);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 20);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(100 + x, 103 + y, 1, 38);
        g2d.fillRect(101 + x, 113 + y, 1, 28);
        g2d.fillRect(102 + x, 123 + y, 1, 18);
        g2d.fillRect(99 + x, 127 + y, 1, 13);
        g2d.fillRect(103 + x, 131 + y, 1, 10);
        g2d.fillRect(104 + x, 136 + y, 1, 4);
        g2d.fillRect(98 + x, 136 + y, 1, 4);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.GREY, new Color(204, 127, 85));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(102, 127, 170));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(153, 159, 170));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(153, 255, 153));
        COLORS.set(ImageUtilities.GREY, new Color(102, 204, 255));
        COLORS.set(ImageUtilities.GREY_1, new Color(204, 191, 170));
        COLORS.set(ImageUtilities.GREY_2, new Color(204, 255, 204));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
    
    public void drawBody(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 4, 1);
        g2d.fillRect(115 + x, 82 + y, 3, 1);
        g2d.fillRect(107 + x, 83 + y, 8, 1);
    }

    public void drawBody(b.Bd bd, int offsetX, int offsetY, GraphicsMap g2d)
    {
        
    }
    
    public void drawBody(b.Bd bd)
    {
        b = bd;
        b.paintLegs = false;
    }
}
