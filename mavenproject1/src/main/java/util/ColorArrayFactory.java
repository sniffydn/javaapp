/*
 * ColorArrayFactory.java
 *
 * Created on March 27, 2007, 10:14 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package util;

import java.util.StringTokenizer;

/**
 *
 * @author doubleD
 */
public class ColorArrayFactory {

    /** Creates a new instance of ColorArrayFactory */
    private ColorArrayFactory() {
    }
    private static int LARGEST_NUMBER = 0;
    public static String[] types = {"c", "m", "g", "b", "n", "s", "t"};
    public static String[] randomTypes = {"c", "m", "g"};
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;

    public static ColorArray getArray(String type, Color color) {
        return getArray(type + "," + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "," + color.getAlpha());
    }

    public static ColorArray getArray(int color) {
        return getArray(color, 255);
    }

    public static ColorArray getArray(int color, int aValue) {
        ColorArray colors = new ColorArray();
        colors = getArrayFromColor(types[(int) Math.round(Math.random() * (types.length - 1))] + "," + (int) (Math.random() * 255) + "," + (int) (Math.random() * 255) + "," + (int) (Math.random() * 255) + "," + 255);

        return colors;
    }

    public static String arrayIsCommon(ColorArray COLORS) {
        boolean found;
        for (int i = 0; i < types.length; i++) {
            ColorArray colorsFrom7 = getArrayFromColor(types[i] + "," + COLORS.get(7).getRed() + "," + COLORS.get(7).getGreen() + "," + COLORS.get(7).getBlue() + "," + 255);

            found = true;
            for (int j = 0; j < COLORS.getLength(); j++) {
                if (colorsFrom7.get(j).getRed() != COLORS.get(j).getRed()) {
                    found = false;
                }
                if (colorsFrom7.get(j).getGreen() != COLORS.get(j).getGreen()) {
                    found = false;
                }
                if (colorsFrom7.get(j).getBlue() != COLORS.get(j).getBlue()) {
                    found = false;
                }
            }
            if (found) {
                return "util.ColorArrayFactory.getArrayFromColor(\"" + types[i] + ",\" + " + COLORS.get(7).getRed() + " + \",\" + " + COLORS.get(7).getGreen() + " + \",\" + " + COLORS.get(7).getBlue() + " + \",\" + " + COLORS.get(7).getAlpha() + ");";
            }
        }

        for (int i = 0; i <= LARGEST_NUMBER; i++) {
            found = true;
            ColorArray temp = getArray(i);
            for (int j = 0; j < COLORS.getLength(); j++) {
                if (temp.get(j).getRed() != COLORS.get(j).getRed()) {
                    found = false;
                }
                if (temp.get(j).getGreen() != COLORS.get(j).getGreen()) {
                    found = false;
                }
                if (temp.get(j).getBlue() != COLORS.get(j).getBlue()) {
                    found = false;
                }
            }
            if (found) {
                return "util.ColorArrayFactory.getArray(" + i + ", " + COLORS.get(i).getAlpha() + ");";
            }
        }

        return "";
    }

    public static ColorArray getArrayFromColor(String s) {
        int increment = 25;
        ColorArray colors = new ColorArray();

        StringTokenizer tok = new StringTokenizer(s, ",");
        String type = tok.nextToken();
        int red = Integer.valueOf(tok.nextToken()).intValue();
        int green = Integer.valueOf(tok.nextToken()).intValue();
        int blue = Integer.valueOf(tok.nextToken()).intValue();
        int alpha = Integer.valueOf(tok.nextToken()).intValue();

        Color col = new Color(red, green, blue, 255);
        Color dark = col.darker();
        Color brig = col.brighter();



        if (type.equalsIgnoreCase("s")) {
            for (int i = 0; i < colors.getLength(); i++) {
                colors.set(i, new Color(red, green, blue, alpha));
            }

            return colors;
        }

        if (type.equalsIgnoreCase("t")) {
            float hueAdd = (float) (360.0 / colors.getLength());
            float[] hsb = Color.RGBtoHSB(red, green, blue, null);
            float hue = hsb[0];
            float sat = hsb[1];
            float bri = hsb[2];

            for (int i = 0; i < colors.getLength(); i++) {
                Color temp = Color.getHSBColor(((hue * 360) + (hueAdd * i)) / 360f, sat, bri);
                colors.set(i, new Color(temp.getRed(), temp.getGreen(), temp.getBlue(), alpha));
            }

            return colors;
        }

        colors.set(7, new Color(red, green, blue, alpha));

        if (type.equalsIgnoreCase("m") || type.equalsIgnoreCase("n")) {
            red -= increment;
            green -= increment;
            blue -= increment;

            if (red < 0) {
                red = 0;
            }
            if (green < 0) {
                green = 0;
            }
            if (blue < 0) {
                blue = 0;
            }
            dark = new Color(red, green, blue, 255);

            red += increment + increment;
            green += increment + increment;
            blue += increment + increment;

            if (red > 255) {
                red = 255;
            }
            if (green > 255) {
                green = 255;
            }
            if (blue > 255) {
                blue = 255;
            }
            brig = new Color(red, green, blue, 255);
        }


        if (type.equalsIgnoreCase("g")) {
            float[] hsbVals = col.RGBtoHSB(red, green, blue, null);
            float h = hsbVals[0] - .1f;
            dark = col.getHSBColor(h, hsbVals[1], hsbVals[2]);
            colors.set(7, new Color(dark.getRed(), dark.getGreen(), dark.getBlue(), alpha));
            dark = dark.darker();
        }
        int[] temp = {dark.getRed(), dark.getGreen(), dark.getBlue()};

        for (int i = 6; i >= 0; i--) {
            colors.set(i, new Color(temp[RED], temp[GREEN], temp[BLUE], alpha));

            if (temp[RED] <= 0 && temp[GREEN] <= 0 && temp[BLUE] <= 0) {
                temp[RED] = dark.getRed();
                temp[GREEN] = dark.getGreen();
                temp[BLUE] = dark.getBlue();
            }

            temp[RED] -= increment;
            temp[GREEN] -= increment;
            temp[BLUE] -= increment;

            if (temp[RED] < 0) {
                temp[RED] = 0;
            }
            if (temp[GREEN] < 0) {
                temp[GREEN] = 0;
            }
            if (temp[BLUE] < 0) {
                temp[BLUE] = 0;
            }
        }

        temp[RED] = brig.getRed();
        temp[GREEN] = brig.getGreen();
        temp[BLUE] = brig.getBlue();

        for (int i = 8; i < colors.getLength(); i++) {
            colors.set(i, new Color(temp[RED], temp[GREEN], temp[BLUE], alpha));

            if (temp[RED] >= 255 && temp[GREEN] >= 255 && temp[BLUE] >= 255) {
                temp[RED] = brig.getRed();
                temp[GREEN] = brig.getGreen();
                temp[BLUE] = brig.getBlue();
            }

            temp[RED] += increment;
            temp[GREEN] += increment;
            temp[BLUE] += increment;

            if (temp[RED] > 255) {
                temp[RED] = 255;
            }
            if (temp[GREEN] > 255) {
                temp[GREEN] = 255;
            }
            if (temp[BLUE] > 255) {
                temp[BLUE] = 255;
            }

            changeColorForVisibleDifference(temp);
        }

        if (type.equalsIgnoreCase("b") || type.equalsIgnoreCase("n")) {
            int j = colors.getLength() - 1;
            Color tempForSwitch = null;
            for (int i = 0; i < colors.getLength() / 2; i++) {
                tempForSwitch = colors.get(i);
                colors.set(i, colors.get(j));
                colors.set(j, tempForSwitch);
                j--;
            }
        }

        return colors;
    }

    public static ColorArray getArray(String s) {
        try {
            int i = Integer.valueOf(s).intValue();
            return getArray(i);
        } catch (Exception e) {
            return getArrayFromColor(s);
        }
    }
    
    
    public static ColorArray getMakeupArray() {
        ColorArray colors = null;
        
        int hue = (int) (Math.random() * 360.0);
        while(hue > 17 && hue < 100)
        {
            hue = (int) (Math.random() * 360.0);
        }
        
        float h = (float) (hue / 360.0);
        float s = (float) ((Math.random() * .4) + .1);
        float b = (float) ((Math.random() * .3) + .6);
        Color tempCol = Color.getHSBColor(h, s, b);
        colors = getArrayFromColor("m," + tempCol.getRed() + "," + tempCol.getGreen() + "," + tempCol.getBlue() + "," + 255);
        
        return colors;
    }

    public static ColorArray getHairArray() {
        ColorArray colors = null;

        if (Math.random() < .1) {
            int temp = (int) (Math.random() * 100);
            colors = getArrayFromColor("m," + temp + "," + temp + "," + temp + "," + 255);
        } else {
            float h = (float) ((Math.random() * (50 / 360.0)));
            float s = (float) ((Math.random() * .4) + .6);
            float b = (float) ((Math.random() * .3) + .7);
            Color tempCol = Color.getHSBColor(h, s, b);
            colors = getArrayFromColor("m," + tempCol.getRed() + "," + tempCol.getGreen() + "," + tempCol.getBlue() + "," + 255);
        }
        return colors;
    }

    public static ColorArray getEyeMakeUpArray() {
        float h = (float) ((Math.random()));
        float s = (float) ((Math.random() * .4) + .6);
        float b = (float) ((Math.random() * .3) + .7);
        Color c = Color.getHSBColor(1, s, b);
        return getArrayFromColor("m," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + "," + 255);
    }

    public static ColorArray getLipstickArray() {
        //316 + 4
        float h = (float) ((Math.random() * ((360 - 316) / 360.0)) + (320 / 360.0));
        float s = (float) ((Math.random() * .4) + .6);
        float b = (float) ((Math.random() * .3) + .5);
        Color c = Color.getHSBColor(h, s, b);
        return getArrayFromColor("m," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + "," + 255);
    }

    private static void changeColorForVisibleDifference(int[] temp) {
        if (temp[RED] >= 255 && temp[GREEN] >= 255) {
            if (temp[BLUE] < 160) {
                temp[BLUE] = 160;
            }
        }
        if (temp[BLUE] >= 255 && temp[GREEN] >= 255) {
            if (temp[RED] < 120) {
                temp[RED] = 120;
            }
        }

        if (temp[BLUE] >= 255 && temp[RED] >= 255) {
            if (temp[GREEN] < 100) {
                temp[GREEN] = 100;
            }
        }
    }

    public static ColorArray getArray(String[] temp) {
        ColorArray retVal = new ColorArray(temp.length);
        for (int i = 0; i < temp.length; i++) {
            retVal.setArrayAt(i, getArray(temp[i]));
        }
        return retVal;
    }

    public static ColorArray getArray(String string, Color[] color) {
        ColorArray retVal = new ColorArray(color.length);
        for (int i = 0; i < color.length; i++) {
            retVal.setArrayAt(i, getArray(string, color[i]));
        }
        return retVal;
    }

    public static ColorArray getCyclingColorArray(String type, int size, int hUpper, int hLower, int sUpper, int sLower, int bUpper, int bLower, int alpha) {
        boolean DEBUG = false;
        if (DEBUG) {
            System.out.println("type: " + type + "  size:" + size + "  alpha:" + alpha);

            System.out.println("\th  \ts \tb ");
            System.out.println("\t" + hUpper + "\t" + sUpper + "\t" + bUpper);
            System.out.println("\t" + hLower + "\t" + sLower + "\t" + bLower);
        }

        if (size == 1) {
            Color c = Color.getHSBColor(hUpper / 360f, sUpper / 100f, bUpper / 100f);
            return getArray(type, c);
        }

        String[] temp = new String[size];
        int h = 0;
        int s = 0;
        int b = 0;

        for (int i = 0; i < temp.length; i++) {
            if (hUpper > hLower) {
                h = (int) (((double) i / temp.length) * (hUpper - hLower) + hLower);
            } else if (hLower > hUpper) {
                h = ((int) (((double) i / temp.length) * ((hUpper + 360) - hLower) + hLower)) % 360;
            } else {
                h = hUpper;
            }

            if (sUpper > sLower) {
                s = (int) (((double) i / temp.length) * (sUpper - sLower) + sLower);
            } else if (sUpper < sLower) {
                s = (int) (((double) (temp.length - i) / temp.length) * (sLower - sUpper) + sUpper);
            } else {
                s = sUpper;
            }

            if (bUpper > bLower) {
                b = (int) (((double) i / temp.length) * (bUpper - bLower) + bLower);
            } else if (bUpper < bLower) {
                b = (int) (((double) (temp.length - i) / temp.length) * (bLower - bUpper) + bUpper);
            } else {
                b = bUpper;
            }

            Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
            temp[i] = type + "," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + "," + alpha;
        }

        String[] gen = new String[temp.length + temp.length - 2];
        int place = 0;
        boolean forward = true;
        for (int i = 0; i < gen.length; i++) {
            gen[i] = temp[place];
            if (forward) {
                place++;
                if (place == temp.length) {
                    place -= 2;
                    forward = false;
                }
            } else {
                place--;
            }
        }

        return ColorArrayFactory.getArray(gen);
    }

    public static ColorArray getCyclingColorArray(String type, int size, float hUpper, float hLower, float sUpper, float sLower, float bUpper, float bLower, int alpha) {
        return getCyclingColorArray(type, size, (int) (360 * hUpper), (int) (360 * hLower), (int) (100 * sUpper), (int) (100 * sLower), (int) (100 * bUpper), (int) (100 * bLower), alpha);
    }
}
