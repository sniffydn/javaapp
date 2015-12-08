/*
 * ColorArray.java
 *
 * Created on July 3, 2007, 12:41 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author doubleD
 */
public class ColorArray implements java.io.Serializable {

    int index = 0;
    Color[][] colors = {{
    new Color(0, 0, 0, 255),
    new Color(105, 0, 0, 255),
    new Color(130, 0, 0, 255),
    new Color(155, 0, 2, 255),
    new Color(180, 0, 27, 255),
    new Color(205, 0, 52, 255),
    new Color(230, 0, 77, 255),
    new Color(255, 0, 102, 255),
    new Color(255, 100, 120, 255),
    new Color(255, 150, 150, 255),
    new Color(255, 170, 170, 255),
    new Color(255, 200, 200, 255),
    new Color(255, 227, 227, 255),
    new Color(255, 255, 255, 255)
}
    };

    /** Creates a new instance of ColorArray */
    public ColorArray() {

    }

    public ColorArray(int size) {
        Color[][] temp = new Color[size][14];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j] = colors[0][j];
            }
        }
        colors = temp;
    }

    public ColorArray(Color[][] temp) {
        colors = temp;
    }

    public void setStep(int step) {
        index = step % colors.length;
    }

    public int getLength() {
        return colors[index].length;
    }

    public int getSize() {
        return colors.length;
    }

    public Color[] getColorArray() {
        return colors[index];
    }

    public Color[] getColorsAtIndex(int index) {
        return colors[index % colors.length];
    }

    public Color[] getColorsAtRow(int row) {
        Color[] temp = new Color[colors.length];
        for (int i = 0; i < colors.length; i++) {
            temp[i] = colors[i][row];
        }
        return temp;
    }

    public void set(int i, Color color) {
        for (int j = 0; j < colors.length; j++) {
            colors[j][i] = color;
        }
    }

    public void setArrayAt(int index, ColorArray array) {
        for (int i = 0; i < array.getLength(); i++) {
            colors[index][i] = array.get(i);
        }
    }

    public void setArray(ColorArray array) {
        index = 0;
        colors = array.colors;
    }

    public ColorArray getNewColorArray() {
        ColorArray retVal = new ColorArray(colors.length);
        retVal.index = index;
        for (int i = 0; i < retVal.colors.length; i++) {
            for (int j = 0; j < retVal.colors[0].length; j++) {
                retVal.colors[i][j] = new Color(colors[i][j].getRed(), colors[i][j].getGreen(), colors[i][j].getBlue(), colors[i][j].getAlpha());
            }
        }
        return retVal;
    }

    public void brighter() {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                Color color = colors[i][j];

                float[] temp = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
                int h = (int) (temp[0] * 360);
                int s = (int) (temp[1] * 100);
                int b = (int) (temp[2] * 100);
                int a = color.getAlpha();

                b += 10;
                int increment = (colors[0].length - j) * 5;

                if (b > 100 - increment) {
                    b = 100 - increment;
                }

                color = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
                colors[i][j] = new Color(color.getRed(), color.getGreen(), color.getBlue(), a);
            }
        }
    }

    public void darker() {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                Color color = colors[i][j];

                float[] temp = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
                int h = (int) (temp[0] * 360);
                int s = (int) (temp[1] * 100);
                int b = (int) (temp[2] * 100);
                int a = color.getAlpha();

                b -= 10;
                int increment = (colors[0].length - j) * 5;

                if (b < 0 + increment) {
                    b = 0 + increment;
                }

                color = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
                colors[i][j] = new Color(color.getRed(), color.getGreen(), color.getBlue(), a);
            }
        }
    }

    public void saturate() {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                Color color = colors[i][j];

                float[] temp = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
                int h = (int) (temp[0] * 360);
                int s = (int) (temp[1] * 100);
                int b = (int) (temp[2] * 100);
                int a = color.getAlpha();

                s += 10;
                if (s > 100) {
                    s = 100;
                }

                color = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
                colors[i][j] = new Color(color.getRed(), color.getGreen(), color.getBlue(), a);
            }
        }
    }

    public void desaturate() {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                Color color = colors[i][j];

                float[] temp = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
                int h = (int) (temp[0] * 360);
                int s = (int) (temp[1] * 100);
                int b = (int) (temp[2] * 100);
                int a = color.getAlpha();

                s -= 10;
                if (s < 0) {
                    s = 0;
                }

                color = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
                colors[i][j] = new Color(color.getRed(), color.getGreen(), color.getBlue(), a);
            }
        }
    }

    public void setAlpha(int a) {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                Color color = colors[i][j];
                colors[i][j] = new Color(color.getRed(), color.getGreen(), color.getBlue(), a);
            }
        }
    }

    public Color getColorAt(int index, int i) {
        return colors[index % colors.length][i];
    }

    public Color get(int i) {
        return colors[index][i];
    }

    public Color get(int lower, int upper) {
        Color col = null;

        Color low = get(lower);

        float[] temp = Color.RGBtoHSB(low.getRed(), low.getGreen(), low.getBlue(), null);
        float h = temp[0];
        float s = temp[1];
        float b = temp[2];
        int a = low.getAlpha();

        Color up = get(upper);
        temp = Color.RGBtoHSB(up.getRed(), up.getGreen(), up.getBlue(), null);
        h = (temp[0] + h) / 2;
        s = (temp[1] + s) / 2;
        b = (temp[2] + b) / 2;
        a = (up.getAlpha() + a) / 2;

        col = Color.getHSBColor(h, s, b);
        return new Color(col.getRed(), col.getGreen(), col.getBlue(), a);
    }

    public Color[] getColorsAt(int index) {
        Color[] temp = new Color[colors.length];
        for (int i = 0; i < colors.length; i++) {
            temp[i] = colors[i][index];
        }
        return temp;
    }

    public ColorArray oppositeColorArray() {
        ColorArray retVal = getNewColorArray();

        for (int i = 0; i < retVal.colors.length; i++) {
            for (int j = 0; j < retVal.colors[0].length; j++) {
                Color color = retVal.colors[i][j];

                float[] temp = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
                int h = (int) (temp[0] * 360);
                int s = (int) (temp[1] * 100);
                int b = (int) (temp[2] * 100);
                int a = color.getAlpha();

                h += 180;

                if (h > 360) {
                    h -= 360;
                }

                color = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
                retVal.colors[i][j] = new Color(color.getRed(), color.getGreen(), color.getBlue(), a);
            }
        }

        return retVal;
    }
}
