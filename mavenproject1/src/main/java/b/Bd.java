/*
 * Body.java
 */
package b;

import util.*;

/**
 * Fill:      12: 32:100
 * Highlight:  8: 40: 90
 * Outline:    6: 47: 70
 * @author doubleD
 */
public class Bd implements java.io.Serializable, clts.Paintable {

    protected Color fillColor = new Color(255, 156, 82, 255);
    protected Color outlineColor = new Color(148, 90, 82, 255);
    protected Color highlightColor = new Color(206, 123, 82, 255);
    protected Color eyeColor = new Color(103, 146, 255, 255);
    protected ColorArray lipColor = ColorArrayFactory.getLipstickArray();
    protected int legLength = 0;
    protected int legPosition = 0;
    public String sMiddle = "b";
    public transient LeftLeg leftLeg = new LeftLeg(this);
    public transient RightLeg rightLeg = new RightLeg(this);
    public transient LeftArm leftArm = new LeftArm(this);
    public transient RightArm rightArm = new RightArm(this);
    public transient Hd hd = new Hd(this);
    public transient Middle middle = new Middle(sMiddle, this);
    transient int step = 0;
    public transient boolean paintLegs = true;
    public transient boolean paintCore = true;

    public void setMiddle(String m) {
        if (!m.equalsIgnoreCase("b")) {
            if (!m.equalsIgnoreCase("c")) {
                if (!m.equalsIgnoreCase("d")) {
                    return;
                }
            }
        }

        sMiddle = m;
        middle = new Middle(sMiddle, this);
    }

    public String getMiddle() {
        return sMiddle;
    }

    public void setStep(int s) {
        step = s;
        if (leftLeg == null) {
            leftLeg = new LeftLeg(this);
            rightLeg = new RightLeg(this);
        }
        leftLeg.setStep(s);
        rightLeg.setStep(s);
        lipColor.setStep(s);
    }

    public void setStep(int s, int direction, int eyebrows, int eyes, int smile, int teeth) {
        if (hd == null) {
            hd = new Hd(this);
            middle = new Middle(sMiddle, this);
        }
        hd.setStep(s, direction, eyebrows, eyes, smile, teeth);
    }

    public void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm, int eye) {
        setStep(iStep);
        if (leftArm == null) {
            leftArm = new LeftArm(this);
            rightArm = new RightArm(this);
        }
        leftArm.setStep(iLeftArm);
        rightArm.setStep(iRightArm);
    }

    public void paintBackLeg(int offsetX, int offsetY, GraphicsMap g2d) {
        if (paintLegs) {
            g2d.setColorSpray(0, 0, 0, 0, 0);
            if (step <= 12 && step > 3) {
                leftLeg.paint(offsetX, legPosition, g2d);
            } else {
                rightLeg.paint(offsetX, legPosition, g2d);
            }
        }
    }

    public void paintFrontLeg(int offsetX, int offsetY, GraphicsMap g2d) {
        if (paintLegs) {
            g2d.setColorSpray(0, 0, 0, 0, 0);
            if (step <= 12 && step > 3) {
                rightLeg.paint(offsetX, legPosition, g2d);
            } else {
                leftLeg.paint(offsetX, legPosition, g2d);
            }
        }
    }

    public void drawFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(0, 0, 0, 0, 0);

        if (paintCore) {
            middle.paint(offsetX, offsetY, g2d);
        }
    }

    public void drawVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        if (paintCore) {
            g2d.setColorSpray(0, 0, 0, 0, 0);
            leftArm.paintFront(offsetX, 0, g2d);
            rightArm.paintFront(offsetX, 0, g2d);
        }
    }

    private void drawB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(outlineColor);
        g2d.fillRect(111 + x, 40 + y, 1, 1);


        g2d.setColor(outlineColor);
        g2d.fillRect(117 + x, 56 + y, 1, 6);
        g2d.fillRect(102 + x, 62 + y, 1, 3);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 8);
        g2d.fillRect(101 + x, 77 + y, 1, 4);
        g2d.fillRect(100 + x, 80 + y, 1, 7);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 9);
        g2d.fillRect(101 + x, 87 + y, 1, 4);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 3, 1);


        g2d.setColor(outlineColor);
        g2d.fillRect(112 + x, 40 + y, 3, 1);
        g2d.fillRect(99 + x, 41 + y, 3, 1);
        g2d.fillRect(115 + x, 41 + y, 2, 1);


        g2d.setColor(highlightColor);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);


        g2d.setColor(highlightColor);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 18, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(104 + x, 56 + y, 1, 3);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(106 + x, 56 + y, 1, 3);
        g2d.fillRect(107 + x, 56 + y, 1, 4);
        g2d.fillRect(108 + x, 56 + y, 1, 9);
        g2d.fillRect(109 + x, 56 + y, 1, 8);
        g2d.fillRect(110 + x, 56 + y, 1, 6);
        g2d.fillRect(111 + x, 56 + y, 1, 7);
        g2d.fillRect(112 + x, 56 + y, 1, 9);
        g2d.fillRect(113 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 3);
        g2d.fillRect(115 + x, 56 + y, 1, 4);
        g2d.fillRect(116 + x, 56 + y, 1, 3);
        g2d.fillRect(113 + x, 60 + y, 1, 6);
        g2d.fillRect(105 + x, 61 + y, 1, 6);
        g2d.fillRect(106 + x, 61 + y, 1, 5);
        g2d.fillRect(107 + x, 61 + y, 1, 5);
        g2d.fillRect(114 + x, 61 + y, 1, 7);
        g2d.fillRect(115 + x, 61 + y, 1, 9);
        g2d.fillRect(103 + x, 62 + y, 1, 3);
        g2d.fillRect(104 + x, 62 + y, 1, 11);
        g2d.fillRect(116 + x, 68 + y, 1, 5);
        g2d.fillRect(117 + x, 70 + y, 1, 11);
        g2d.fillRect(103 + x, 73 + y, 1, 4);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 73 + y, 1, 10);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 14);
        g2d.fillRect(101 + x, 81 + y, 1, 6);
        g2d.fillRect(119 + x, 81 + y, 1, 10);
        g2d.fillRect(120 + x, 82 + y, 1, 9);
        g2d.fillRect(107 + x, 84 + y, 1, 3);
        g2d.fillRect(114 + x, 84 + y, 1, 7);
        g2d.fillRect(108 + x, 85 + y, 1, 6);
        g2d.fillRect(113 + x, 85 + y, 1, 4);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 5);
        g2d.fillRect(109 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 3);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 2);


        g2d.setColor(highlightColor);
        g2d.fillRect(110 + x, 40 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 1);
        g2d.fillRect(112 + x, 41 + y, 2, 1);
        g2d.fillRect(99 + x, 42 + y, 3, 1);
        g2d.fillRect(115 + x, 42 + y, 2, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 3);
        g2d.fillRect(103 + x, 59 + y, 1, 3);
        g2d.fillRect(104 + x, 59 + y, 1, 3);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 2, 1);


        g2d.setColor(fillColor);
        g2d.fillRect(104 + x, 40 + y, 1, 15);
        g2d.fillRect(105 + x, 40 + y, 1, 15);
        g2d.fillRect(106 + x, 40 + y, 1, 15);
        g2d.fillRect(107 + x, 40 + y, 1, 15);
        g2d.fillRect(108 + x, 40 + y, 1, 15);
        g2d.fillRect(109 + x, 40 + y, 1, 15);
        g2d.fillRect(110 + x, 41 + y, 1, 14);
        g2d.fillRect(111 + x, 41 + y, 1, 14);
        g2d.fillRect(102 + x, 42 + y, 1, 13);
        g2d.fillRect(103 + x, 42 + y, 1, 13);
        g2d.fillRect(112 + x, 42 + y, 1, 13);
        g2d.fillRect(113 + x, 42 + y, 1, 13);
        g2d.fillRect(114 + x, 42 + y, 1, 13);
        g2d.fillRect(99 + x, 43 + y, 1, 12);
        g2d.fillRect(100 + x, 43 + y, 1, 12);
        g2d.fillRect(101 + x, 43 + y, 1, 12);
        g2d.fillRect(115 + x, 43 + y, 1, 12);
        g2d.fillRect(116 + x, 43 + y, 1, 12);
        g2d.fillRect(110 + x, 62 + y, 1, 11);
        g2d.fillRect(111 + x, 63 + y, 1, 11);
        g2d.fillRect(109 + x, 64 + y, 1, 10);
        g2d.fillRect(108 + x, 65 + y, 1, 20);
        g2d.fillRect(112 + x, 65 + y, 1, 22);
        g2d.fillRect(106 + x, 66 + y, 1, 25);
        g2d.fillRect(107 + x, 66 + y, 1, 18);
        g2d.fillRect(113 + x, 66 + y, 1, 19);
        g2d.fillRect(105 + x, 67 + y, 1, 24);
        g2d.fillRect(114 + x, 68 + y, 1, 16);
        g2d.fillRect(115 + x, 70 + y, 1, 15);
        g2d.fillRect(104 + x, 73 + y, 1, 18);
        g2d.fillRect(116 + x, 73 + y, 1, 18);
        g2d.fillRect(110 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 12);
        g2d.fillRect(111 + x, 75 + y, 1, 13);
        g2d.fillRect(110 + x, 76 + y, 1, 12);
        g2d.fillRect(103 + x, 77 + y, 1, 9);
        g2d.fillRect(117 + x, 81 + y, 1, 10);
        g2d.fillRect(118 + x, 83 + y, 1, 8);
        g2d.fillRect(107 + x, 87 + y, 1, 4);
        g2d.fillRect(115 + x, 87 + y, 1, 4);
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getOutlineColor() {
        return outlineColor;
    }

    public void setOutlineColor(Color outlineColor) {
        this.outlineColor = outlineColor;
    }

    public Color getHighlightColor() {
        return highlightColor;
    }

    public void setHighlightColor(Color highlightColor) {
        this.highlightColor = highlightColor;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public ColorArray getLipColor() {
        return lipColor;
    }

    public void setLipColor(ColorArray lipColor) {
        this.lipColor = lipColor;
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        hd.paint(offsetX, 0, g2d);
        paintLegs = true;
        paintCore = true;
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        if (paintCore) {
            g2d.setColorSpray(0, 0, 0, 0, 0);
            leftArm.paintBack(offsetX, 0, g2d);
            rightArm.paintBack(offsetX, 0, g2d);
            drawB(offsetX, 0, g2d);
        }
        paintBackLeg(offsetX, offsetY, g2d);
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d) {
        drawFront(offsetX, offsetY, g2d);
        paintFrontLeg(offsetX, offsetY, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        drawVeryFront(offsetX, offsetY, g2d);
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {

    }

    public void drawBody(Bd bd) {
    }

    public void drawBody(Bd bd, int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public ColorArray getColors() {
        return lipColor;
    }

    public void setColors(ColorArray colors) {
        lipColor = colors;
    }

    public int getCSType() {
        return 0;
    }

    public void setCSType(int colorSprayType) {
    }

    public int getCSHue() {
        return 0;
    }

    public void setCSHue(int colorSprayHue) {
    }

    public int getCSSaturation() {
        return 0;
    }

    public void setCSSaturation(int colorSpraySaturation) {
    }

    public int getCSBrightness() {
        return 0;
    }

    public void setCSBrightness(int colorSprayBrightness) {
    }

    public int getCSFrequency() {
        return 0;
    }

    public void setCSFrequency(int colorSprayFrequency) {
    }

    public int getLegLength() {
        return legLength;
    }

    public void setLegLength(int legLength) {
        if(legLength < 0)
            legLength = 0;
        this.legLength = legLength;
    }

    public int getLegPosition() {
        return legPosition;
    }

    public void setLegPosition(int legPosition) {
        this.legPosition = legPosition;
    }
}
