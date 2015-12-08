/*
 * ImageUtilities.java
 */
package util;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.util.*;
import javax.imageio.ImageIO;
import clts.Piece;

public class ImageUtilities {

    public static final int NEG_GREY_7 = 0;
    public static final int NEG_GREY_6 = 1;
    public static final int NEG_GREY_5 = 2;
    public static final int NEG_GREY_4 = 3;
    public static final int NEG_GREY_3 = 4;
    public static final int NEG_GREY_2 = 5;
    public static final int NEG_GREY_1 = 6;
    public static final int GREY = 7;
    public static final int GREY_1 = 8;
    public static final int GREY_2 = 9;
    public static final int GREY_3 = 10;
    public static final int GREY_4 = 11;
    public static final int GREY_5 = 12;
    public static final int GREY_6 = 13;
    BufferedImage bufferedImage = null;
    Hashtable hash = null;
    String name = "";

    public ImageUtilities() {
        setBufferedImage("F:/JavaStuff/JavaApplication1/x/3.gif");
        hash = defaultColorToSwitch();
    }

    public ImageUtilities(String fileName) {
        name = fileName;
        setBufferedImage(fileName);
        hash = defaultColorToSwitch();
    }

    public ImageUtilities(String fileName, Hashtable colorSwitcher) {
        name = fileName;
        setBufferedImage(fileName);
        hash = colorSwitcher;
    }

    public static void fillRect(GraphicsMap g2d, int flipOverX, int x, int offsetX, int y, int offsetY, int width, int height) {
        int temp = x + width - 1;
        temp = -1 * temp + flipOverX;
        g2d.fillRect(temp + offsetX, y + offsetY, width, height);
    }

    public Hashtable defaultColorToSwitch() {
        Hashtable temp = new Hashtable();
        temp.put(new Color(255, 255, 255, 0), new Color(0, 0, 0, 0));
        temp.put(new Color(255, 184, 171, 255), new Color(0, 255, 0, 255));
        temp.put(new Color(94, 60, 54, 255), new Color(94, 60, 54, 255));
        temp.put(new Color(0, 0, 0, 255), new Color(0, 0, 0, 255));
        temp.put(new Color(255, 38, 0, 255), new Color(0, 0, 100, 255));
        temp.put(new Color(47, 219, 255, 255), new Color(47, 219, 255, 255));
        temp.put(new Color(103, 229, 255, 255), new Color(103, 229, 255, 255));
        temp.put(new Color(131, 234, 255, 255), new Color(131, 234, 255, 255));
        temp.put(new Color(236, 0, 0, 255), new Color(236, 0, 0, 255));

        return temp;
    }

    public void setColorToSwitch(Hashtable h) {
        hash = h;
    }

    public Hashtable getColorToSwitch() {
        return hash;
    }

    public void setBufferedImage(String filename) {
        try {
            File f = new File(filename);
            if (f.exists()) {
                bufferedImage = ImageIO.read(f);
            } else {
                bufferedImage = null;
                System.out.println("setBufferedImage filename does not exist: " + filename);
            }
        } catch (Exception e) {
            e.printStackTrace();
            bufferedImage = null;
        }
    }

    public boolean imageExists() {
        return bufferedImage != null;
    }

    public Color getColor(int x, int y) {
        int rgb = bufferedImage.getRGB(x, y);
        int alpha = ((rgb >> 24) & 0xff);
        int red = ((rgb >> 16) & 0xff);
        int green = ((rgb >> 8) & 0xff);
        int blue = ((rgb) & 0xff);
        return new Color(red, green, blue, alpha);
    }

//    public void draw(int x, int y, int width, int height, int changeInOffsetX, int changeInOffsetY, Graphics2D g2d)
//    {
//        if(width < 0)
//            width = bufferedImage.getWidth() - x;
//        if(height < 0)
//            height = bufferedImage.getHeight() - y;
//        ArrayList xS = new ArrayList();
//        ArrayList yS = new ArrayList();
//        ArrayList pieces = new ArrayList();
//        for(int j = 0; j < y + height; j++)
//        {
//            for(int i = x; i < x + width; i++)
//            {
//                Color gottenColor = getColor(i, j);
//                Object o = hash.get(gottenColor);
//                if(o != null)
//                {
//                    if(o.getClass().equals(gottenColor.getClass()))
//                    {
//                        Color temp = (Color)o;
//                        if(temp.getAlpha() != 0)
//                        {
//                            g2d.setColor(temp);
//                            g2d.fillRect(i, j, 1, 1);
//                        }
//                    }
//                    else
//                    {
//                        xS.add(new Integer(i));
//                        yS.add(new Integer(j));
//                        pieces.add(o);
//                    }
//                }
//                else
//                {
//                    System.out.println("missing color " + gottenColor + " a=" + gottenColor.getAlpha() + " in hash");
//                }
//            }
//        }
//        for(int i = 0; i < xS.size(); i++)
//        {
//            Piece p = (Piece) pieces.get(i);
////            p.paint(((Integer)xS.get(i)).intValue(),((Integer)yS.get(i)).intValue(), changeInOffsetX, changeInOffsetY, g2d);
//        }
//    }

//    public void draw(Graphics2D g2d)
//    {
//        draw(0,0,-1,-1,0,0,g2d);
//    }
    public Vector drawAllFiltered(int x, int y, Graphics2D g2d, Vector colorsToInclude) {
        if (bufferedImage == null) {
            return null;
        }
        Vector xS = new Vector();
        Vector yS = new Vector();
        Vector width = new Vector();
        Vector height = new Vector();
        Vector strings = new Vector();
        Vector points = new Vector();
        for (int j = 0; j < bufferedImage.getHeight(); j++) {
            for (int i = 0; i < bufferedImage.getWidth(); i++) {
                if (i + x >= 0 && j + y >= 0) {
                    Color gottenColor = getColor(i, j);
                    if (gottenColor.getAlpha() != 0 && colorsToInclude.contains(gottenColor)) {
                        if (g2d != null) {
                            java.awt.Color drawnColor = new java.awt.Color((gottenColor.getRed() / 7) + 130, (gottenColor.getGreen() / 7) + 130, (gottenColor.getBlue() / 7) + 130, 255);
                            g2d.setColor(drawnColor);
                            g2d.fillRect(i + x, j + y, 1, 1);
                        }
                        points.add(new Point(i, j));
                    }
                }
            }
        }

        while (points.size() > 0) {
            Point orig = (Point) points.remove(0);
            xS.add(new Integer((int) orig.getX()));
            yS.add(new Integer((int) orig.getY()));
            Point temp = new Point((int) orig.getX(), (int) orig.getY() + 1);
            int w = 1;
            int h = 1;
            while (points.contains(temp)) {
                points.remove(temp);
                h++;
                temp = new Point((int) temp.getX(), (int) temp.getY() + 1);
            }
            if (h == 1) {
                temp = new Point((int) orig.getX() + 1, (int) orig.getY());
                while (points.contains(temp)) {
                    points.remove(temp);
                    w++;
                    temp = new Point((int) temp.getX() + 1, (int) temp.getY());
                }
            }
            width.add(new Integer(w));
            height.add(new Integer(h));
            strings.add("\tg2d.fillRect(" + ((int) orig.getX() + DrawHelper.offX) + " + x, " + ((int) orig.getY() + DrawHelper.offY) + " + y, " + w + ", " + h + ");");
        }

        Vector v = new Vector();
        v.add(xS);
        v.add(yS);
        v.add(width);
        v.add(height);
        v.add(strings);
        return v;
    }

    public Vector drawFiltered(int x, int y, Graphics2D g2d, Vector colorsToInclude, boolean first) {
        if (bufferedImage == null) {
            return null;
        }
        Vector xS = new Vector();
        Vector yS = new Vector();
        Vector width = new Vector();
        Vector height = new Vector();
        Vector strings = new Vector();
        for (int j = 0; j < bufferedImage.getHeight(); j++) {
            for (int i = 0; i < bufferedImage.getWidth(); i++) {
                if (i + x >= 0 && j + y >= 0) {
                    Color gottenColor = getColor(i, j);
                    if (gottenColor.getAlpha() != 0 && colorsToInclude.contains(gottenColor)) {
                        java.awt.Color drawnColor = new java.awt.Color((gottenColor.getRed() / 7) + 130, (gottenColor.getGreen() / 7) + 130, (gottenColor.getBlue() / 7) + 130, 255);
                        g2d.setColor(drawnColor);
                        g2d.fillRect(i + x, j + y, 1, 1);

                        if (first) {
                            drawObvious(i, j, colorsToInclude, xS, yS, width, height, strings);
                        }
                    }
                }
            }
        }
        Vector v = new Vector();
        if (first) {
            v.add(xS);
            v.add(yS);
            v.add(width);
            v.add(height);
            v.add(strings);
        }
        return v;
    }

    private void drawObvious(final int i, final int j, final Vector colorsToInclude, final Vector xS, final Vector yS, final Vector width, final Vector height, final Vector strings) {
        int neighbors = 0;
        if (colorsToInclude.contains(getColor(i + 1, j))) {
            neighbors++;
        }
        if (colorsToInclude.contains(getColor(i - 1, j))) {
            neighbors++;
        }
        if (colorsToInclude.contains(getColor(i, j + 1))) {
            neighbors++;
        }
        if (colorsToInclude.contains(getColor(i, j - 1))) {
            neighbors++;
        }


        if (neighbors == 0) {
            String s = "\tg2d.fillRect(" + (i + DrawHelper.offX) + " + x, " + (j + DrawHelper.offY) + " + y, 1, 1);";
            strings.insertElementAt(s, 0);
            xS.insertElementAt(new Integer(i), 0);
            yS.insertElementAt(new Integer(j), 0);
            width.insertElementAt(new Integer(1), 0);
            height.insertElementAt(new Integer(1), 0);
        } else if (neighbors == 1) {
            if (colorsToInclude.contains(getColor(i, j + 1))) {
                if (colorsToInclude.contains(getColor(i - 1, j + 1)) && colorsToInclude.contains(getColor(i + 1, j + 1))) {
                    String s = "\tg2d.fillRect(" + (i + DrawHelper.offX) + " + x, " + (j + DrawHelper.offY) + " + y, 1, 1);";
                    strings.add(s);
                    xS.add(new Integer(i));
                    yS.add(new Integer(j));
                    width.add(new Integer(1));
                    height.add(new Integer(1));
                } else {
                    int count = 2;
                    while (colorsToInclude.contains(getColor(i, j + count))) {
                        count++;
                    }

                    String s = "\tg2d.fillRect(" + (i + DrawHelper.offX) + " + x, " + (j + DrawHelper.offY) + " + y, 1, " + count + ");";
                    strings.insertElementAt(s, 0);
                    xS.insertElementAt(new Integer(i), 0);
                    yS.insertElementAt(new Integer(j), 0);
                    width.insertElementAt(new Integer(1), 0);
                    height.insertElementAt(new Integer(count), 0);
                }
            } else if (colorsToInclude.contains(getColor(i + 1, j))) {
                boolean obvious = true;
                if (colorsToInclude.contains(getColor(i + 1, j - 1)) || colorsToInclude.contains(getColor(i + 1, j + 1))) {
                    obvious = false;
                }
                if (colorsToInclude.contains(getColor(i + 1, j - 1)) && colorsToInclude.contains(getColor(i + 1, j + 1))) {
                    String s = "\tg2d.fillRect(" + (i + DrawHelper.offX) + " + x, " + (j + DrawHelper.offY) + " + y, 1, 1);";
                    strings.add(s);
                    xS.add(new Integer(i));
                    yS.add(new Integer(j));
                    width.add(new Integer(1));
                    height.add(new Integer(1));
                } else {
                    int count = 2;
                    while (colorsToInclude.contains(getColor(i + count, j))) {
                        if (colorsToInclude.contains(getColor(i + count, j - 1)) && colorsToInclude.contains(getColor(i + count, j + 1))) {
                            break;
                        }

                        if (colorsToInclude.contains(getColor(i + count, j - 1)) || colorsToInclude.contains(getColor(i + count, j + 1))) {
                            obvious = false;
                        }
                        count++;
                    }
                    if (!obvious) {
                        String s = "\tg2d.fillRect(" + (i + DrawHelper.offX) + " + x, " + (j + DrawHelper.offY) + " + y, " + count + ", 1);";
                        strings.add(s);
                        xS.add(new Integer(i));
                        yS.add(new Integer(j));
                        width.add(new Integer(count));
                        height.add(new Integer(1));
                    } else {
                        String s = "\tg2d.fillRect(" + (i + DrawHelper.offX) + " + x, " + (j + DrawHelper.offY) + " + y, " + count + ", 1);";
                        strings.insertElementAt(s, 0);
                        xS.insertElementAt(new Integer(i), 0);
                        yS.insertElementAt(new Integer(j), 0);
                        width.insertElementAt(new Integer(count), 0);
                        height.insertElementAt(new Integer(1), 0);
                    }
                }
            } else if (colorsToInclude.contains(getColor(i - 1, j))) {
                if (colorsToInclude.contains(getColor(i - 1, j - 1))) {
                    if (colorsToInclude.contains(getColor(i - 1, j + 1))) {
                        String s = "\tg2d.fillRect(" + (i + DrawHelper.offX) + " + x, " + (j + DrawHelper.offY) + " + y, 1, 1);";
                        strings.insertElementAt(s, 0);
                        xS.insertElementAt(new Integer(i), 0);
                        yS.insertElementAt(new Integer(j), 0);
                        width.insertElementAt(new Integer(1), 0);
                        height.insertElementAt(new Integer(1), 0);
                    }
                }
            } else if (colorsToInclude.contains(getColor(i, j - 1))) {
                if (colorsToInclude.contains(getColor(i + 1, j - 1))) {
                    if (colorsToInclude.contains(getColor(i - 1, j - 1))) {
                        String s = "\tg2d.fillRect(" + (i + DrawHelper.offX) + " + x, " + (j + DrawHelper.offY) + " + y, 1, 1);";
                        strings.insertElementAt(s, 0);
                        xS.insertElementAt(new Integer(i), 0);
                        yS.insertElementAt(new Integer(j), 0);
                        width.insertElementAt(new Integer(1), 0);
                        height.insertElementAt(new Integer(1), 0);
                    }
                }
            }
        }
    }

    public Vector drawTrue(int x, int y, Graphics2D g2d, int whatever) {
        Vector retVal = new Vector();
        if (bufferedImage == null) {
            return null;
        }

        HashMap map = new HashMap();

        for (int j = 0; j < bufferedImage.getHeight(); j++) {
            for (int i = 0; i < bufferedImage.getWidth(); i++) {
                if (i + x >= 0 && j + y >= 0) {
                    java.awt.Color gottenColor = getColor(i, j).getColor();
                    if (gottenColor.getAlpha() != 0) {
                        if (g2d != null) {
                            g2d.setColor(gottenColor);
                            g2d.fillRect(i + x, j + y, 1, 1);
                        }

                        if (whatever == 1) {
                            System.out.println("g2d.setColor(new Color(" + gottenColor.getRed() + "," + gottenColor.getGreen() + "," + gottenColor.getBlue() + "," + gottenColor.getAlpha() + "));\n" + "g2d.fillRect(" + i + " + x, " + j + " + y, 1, 1));");
                        } else if (whatever == 2) {
                            map.put(gottenColor, gottenColor);
                        }
                    }
                }
            }
        }

        if (whatever == 2) {
            Object[] temp = map.keySet().toArray();
            if (temp.length > 0) {
                sortColors(temp);
                System.out.println("\n\n\n\n" + temp.length);
                for (int i = 0; i < temp.length; i++) {
                    Color gottenColor = (Color) temp[i];
                    retVal.add(gottenColor);
                    System.out.println("v.add(new Color(" + gottenColor.getRed() + "," + gottenColor.getGreen() + "," + gottenColor.getBlue() + "," + gottenColor.getAlpha() + "));");
                }
            }
        }
        return retVal;
    }

    public static void sortColors(Object[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int prevIndex = 0;
            for (int i = 1; i < array.length - j; i++) {

                int prevTot = ((Color) array[prevIndex]).getRed() + ((Color) array[prevIndex]).getGreen() + ((Color) array[prevIndex]).getBlue();
                int currTot = ((Color) array[i]).getRed() + ((Color) array[i]).getGreen() + ((Color) array[i]).getBlue();

                if (prevTot > currTot) {
                    Color temp = (Color) array[i];
                    array[i] = array[prevIndex];
                    array[prevIndex] = temp;
                }
                prevIndex = i;
            }
        }
    }

    public void drawTrue(int x, int y, Graphics2D g2d) {
        drawTrue(x, y, g2d, 0);
    }

//    public void draw(int x, int y, Graphics2D g2d)
//    {
//        if(bufferedImage == null)
//        {
//            return;
//        }
//        if(hash == null)
//        {
//            hash = defaultColorToSwitch();
//        }
//        
//        ArrayList xS = new ArrayList();
//        ArrayList yS = new ArrayList();
//        for(int j = 0; j < bufferedImage.getHeight(); j++)
//        {
//            for(int i = x; i < bufferedImage.getWidth(); i++)
//            {
//                
//                if(i+x >= 0 && j+y >= 0)
//                {
//                    Color gottenColor = getColor(i, j);
//                    Object o = hash.get(gottenColor);
//                    if(o != null)
//                    {
//                        if(o.getClass().equals(gottenColor.getClass()))
//                        {
//                            Color temp = (Color)o;
//                            if(temp.getAlpha() != 0)
//                            {
//                                g2d.setColor(temp);
//                                g2d.fillRect(i + x, j + y, 1, 1);
//                            }
//                        }
//                        else
//                        {
//                            ((Piece)o).paint(i + x, j + y, g2d);
//                        }
//                    }
//                    else
//                    {
//                        //System.out.println("missing color " + gottenColor + " a=" + gottenColor.getAlpha() + " in hash\ntemp.put(new Color(" + gottenColor.getRed() + "," + gottenColor.getGreen() + "," + gottenColor.getBlue() + "," + gottenColor.getAlpha() + "),new Color(" + gottenColor.getRed() + "," + gottenColor.getGreen() + "," + gottenColor.getBlue() + "," + gottenColor.getAlpha() + "));");
//                        g2d.setColor(gottenColor);
//                        g2d.fillRect(i + x, j + y, 1, 1);
//                    }
//                }
//            }
//        }
//    }
    public static Point drawRandomPointAround(int x, int y, GraphicsMap g2d) {

        if (g2d == null) {
            if (Math.random() > .5) {
                return new Point(x, y);
            }
        }

        if (Math.random() < .33) {
            if (Math.random() < .67) {
                if (Math.random() < .5) {
                    x++;
                    y++;
                } else {
                    x++;
                }
            } else {
                x++;
                y--;
            }
        } else {
            if (Math.random() < .5) {
                if (Math.random() < .67) {
                    if (Math.random() < .5) {
                        x--;
                        y++;
                    } else {
                        x--;
                    }
                } else {
                    x--;
                    y--;
                }
            } else {
                if (Math.random() < .67) {
                    if (Math.random() < .5) {
                        y++;
                    } else {
                        ;
                    }
                } else {
                    y--;
                }
            }
        }
        if (g2d != null) {
            g2d.fillRect(x, y, 1, 1);
        }
        return new Point(x, y);
    }

    public static ArrayList drawTrap(ArrayList firstLine, ArrayList secondLine, int lowerY, int upperY, GraphicsMap g2d) {
        ArrayList checkedOff = new ArrayList();
        for (int i = 0; i < firstLine.size(); i++) {
            boolean checkedAlready = false;
            if (upperY < (int) ((Point) firstLine.get(i)).getY() || lowerY > (int) ((Point) firstLine.get(i)).getY()) {
                checkedAlready = true;
            }
            for (int j = 0; j < checkedOff.size(); j++) {
                if ((int) ((Point) checkedOff.get(j)).getY() == (int) ((Point) firstLine.get(i)).getY()) {
                    checkedAlready = true;
                }
            }
            checkedOff.add(firstLine.get(i));

            if (!checkedAlready) {
                int length = 0;
                for (int j = (int) ((Point) firstLine.get(i)).getX(); j < 2000; j++) {
                    Point temp = new Point(j, (int) ((Point) firstLine.get(i)).getY());
                    if (secondLine.contains(temp)) {
                        break;
                    } else {
                        if (!firstLine.contains(temp)) {
                            length++;
                        }
                    }
                }
                if ((int) ((Point) firstLine.get(i)).getX() + 1 + length != 2000) {
                    g2d.fillRect((int) ((Point) firstLine.get(i)).getX() + 1, (int) ((Point) firstLine.get(i)).getY(), length, 1);
                }
            }
        }

        return null;
    }

    public static ArrayList drawLine(int x1, int y1, int x2, int y2, GraphicsMap g2d) {
        if (x1 > x2) {
            int tempX = x2;
            int tempY = y2;

            x2 = x1;
            y2 = y1;

            x1 = tempX;
            y1 = tempY;
        }

        ArrayList al = new ArrayList();

        double run = x2 - x1;
        double rise = y2 - y1;
        double m = rise / run;
        double b = y1 - (m * x1);

        if (x1 == x2) {
            for (int i = 0; i < Math.abs(rise) + 1; i++) {
                g2d.fillRect(x1, y1 + i, 1, 1);
                al.add(new Point(x1, y1 + i));
            }
        } else if (Math.abs(rise) > Math.abs(run)) {
            for (int i = 0; i < Math.abs(rise) + 1; i++) {
                if (rise > 0) {
                    g2d.fillRect((int) Math.round(((y1 + i) - b) / m), y1 + i, 1, 1);
                    al.add(new Point((int) Math.round(((y1 + i) - b) / m), y1 + i));
                } else {
                    g2d.fillRect((int) Math.round(((y2 + i) - b) / m), y2 + i, 1, 1);
                    al.add(new Point((int) Math.round(((y2 + i) - b) / m), y2 + i));
                }
            }
        } else {
            for (int i = 0; i < Math.abs(run) + 1; i++) {
                if (run > 0) {
                    g2d.fillRect(x1 + i, (int) Math.round(m * (x1 + i) + b), 1, 1);
                    al.add(new Point(x1 + i, (int) Math.round(m * (x1 + i) + b)));
                } else {
                    g2d.fillRect(x2 + i, (int) Math.round(m * (x2 + i) + b), 1, 1);
                    al.add(new Point(x2 + i, (int) Math.round(m * (x2 + i) + b)));
                }
            }
        }

        return al;
    }

    public static int findXatY(ArrayList line, int y) {
        for (int i = 0; i < line.size(); i++) {
            if ((int) ((Point) line.get(i)).getY() == y) {
                return (int) ((Point) line.get(i)).getX();
            }
        }
        return -1;
    }

    public static Color relative(boolean originalColor, Color oldColor, Color baseColor) {
        if(originalColor)
            return oldColor;
        else
            return relative(oldColor, baseColor);
    }

    private static Color relative(Color oldColor, Color baseColor) {
        float[] base = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        float[] old = Color.RGBtoHSB(oldColor.getRed(), oldColor.getGreen(), oldColor.getBlue(), null);

        float hue = base[0];
        float sat = old[1];
        float bri = old[2];

        sat = (float) ((base[1] + .5)) * old[1];

        if (sat > 1) {
            sat = 1f;
        }
        if (sat < 0) {
            sat = 0f;
        }

        bri = (float) ((base[2] + .5)) * old[2];

        if (bri > 1) {
            bri = 1f;
        }
        if (bri < 0) {
            bri = 0f;
        }




        Color newColor = Color.getHSBColor(hue, sat, bri);
        newColor = new Color(newColor.getRed(), newColor.getGreen(), newColor.getBlue(), baseColor.getAlpha());

        return newColor;
    }

    public static void paint(String fileName, ColorArray colors, int x, int y, GraphicsMap g2d) {
        try {
            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(fileName));
            String str;
            while ((str = in.readLine()) != null) {
                paintStringReader(str, colors, x, y, g2d);
            }
            in.close();
        } catch (java.io.IOException e) {
        }
    }

    public static void paintStringReader(String line, ColorArray colors, int x, int y, GraphicsMap g2d) {
        line = line.trim();
        if (line.startsWith("g2d.")) {
            line = line.substring(4);

            if (line.startsWith("setColor(")) {
                line = line.substring(9);
                if (line.startsWith("new Color(")) {
                    line = line.substring(10);
                    int red = Integer.parseInt(line.substring(0, line.indexOf(",")));
                    line = line.substring(line.indexOf(",") + 1);
                    int green = Integer.parseInt(line.substring(0, line.indexOf(",")));
                    line = line.substring(line.indexOf(",") + 1);
                    int blue = Integer.parseInt(line.substring(0, line.indexOf(",")));
                    line = line.substring(line.indexOf(",") + 1);
                    int alpha = Integer.parseInt(line.substring(0, line.indexOf(")")));

                    g2d.setColor(new Color(red, green, blue, alpha));
                }
            } else if (line.startsWith("fillRect(")) {
                line = line.substring(9);
                int xVal = Integer.parseInt(line.substring(0, line.indexOf(" +"))) + x;
                line = line.substring(line.indexOf(",") + 2);
                int yVal = Integer.parseInt(line.substring(0, line.indexOf(" +"))) + y;
                line = line.substring(line.indexOf(",") + 2);
                int w = Integer.parseInt(line.substring(0, line.indexOf(",")));
                line = line.substring(line.indexOf(",") + 2);
                int h = Integer.parseInt(line.substring(0, line.indexOf(")")));
                g2d.fillRect(xVal, yVal, w, h);
            }
        }
    }
}
