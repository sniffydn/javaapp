/*
 * GraphicsMap.java
 *
 * Created on July 17, 2007, 12:44 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author doubleD
 */
public class GraphicsMap
{

    public int colorSprayHue = 0;
    public int colorSpraySaturation = 0;
    public int colorSprayBrightness = 0;
    public int colorSprayType = 0;
    public int colorSprayFrequency = 0;
    int width = 0;
    int height = 0;
    int color = -1;
    Color baseColor = null;
    public int startSize = 3500;
    ArrayList points = null;
    ArrayList colorAtPoint = null;
    ArrayList colors = null;
    ArrayList translucentPoints = null;
    ArrayList translucentColorAtPoint = null;
    ArrayList translucentColors = null;
    ArrayList lines = null;
    private int index;
    private int lastIndex;
    private int firstX = -1;
    private int firstY = -1;

    /** Creates a new instance of GraphicsMap */
    public GraphicsMap(int width, int height)
    {
        this.width = width;
        this.height = height;
        reset();
    }

    public GraphicsMap(int width, int height, int startSize)
    {
        this.width = width;
        this.height = height;
        this.startSize = startSize;
        reset();
    }

    public void reset()
    {
        points = new ArrayList(startSize);
        colorAtPoint = new ArrayList(startSize);
        colors = new ArrayList();
        translucentPoints = new ArrayList();
        translucentColorAtPoint = new ArrayList();
        translucentColors = new ArrayList();
        lines = new ArrayList();
    }

    public static void paint(Graphics2D g2d, ArrayList lines)
    {
        if(lines == null)
        {
           return;
        }
        boolean debug = false;
        if(debug)
        {
            System.out.println("\n\n\n\n");
        }
        for(int i = 0; i < lines.size(); i++)
        {
            Object o = lines.get(i);
            if(o instanceof Color)
            {
                g2d.setColor(((util.Color)o).getColor());
                if(debug)
                {
                    System.out.println("g2d.setColor(" + (Color)o +");");
                }
            }
            else if(o instanceof Double)
            {
                g2d.scale(((Double)o).doubleValue(), ((Double)o).doubleValue());
                if(debug)
                {
                    System.out.println("g2d.scale(" + ((Double)o).doubleValue() + ", " + ((Double)o).doubleValue() + ");");
                }
            }
            else
            {
                if(((int [])o).length == 4)
                {
                    int [] xywh = (int [])o;
                    g2d.fillRect(xywh[0],xywh[1],xywh[2],xywh[3]);
                    if(debug)
                    {
                        System.out.println("g2d.fillRect(" + xywh[0] + "," + xywh[1] + "," + xywh[2] + "," + xywh[3] + ");");
                    }
                }
                else
                {
                    int [] xy = (int [])o;
                    g2d.translate(xy[0],xy[1]);
                    if(debug)
                    {
                        System.out.println("g2d.translate(" + xy[0] + "," + xy[1] + ");");
                    }
                }
            }
        }
    }

    public void paint(Graphics2D g2d)
    {
        if(lines == null)
        {
            prime();
        }
        paint(g2d, lines);
    }

    public void setColorSpray(int colorSprayHue, int colorSpraySaturation, int colorSprayBrightness, int colorSprayType, int colorSprayFrequency)
    {
        this.colorSprayHue = colorSprayHue;
        this.colorSpraySaturation = colorSpraySaturation;
        this.colorSprayBrightness = colorSprayBrightness;
        this.colorSprayType = colorSprayType;
        this.colorSprayFrequency = colorSprayFrequency;
    }

    public void setColor(Color c)
    {
        baseColor = c;
        setInternalColor(c);
    }

    public void setIndex(int i)
    {
        index = i;
    }

    public void setLastIndex(int i) {
        lastIndex = i;
    }

    private void setInternalColor(Color c)
    {
        if(c.getAlpha() < 255)
        {
            if(!translucentColors.contains(c))
            {
                translucentColors.add(c);
            }
            color = translucentColors.indexOf(c);
        }
        else
        {
            if(!colors.contains(c))
            {
                colors.add(c);
            }
            color = colors.indexOf(c);
        }
    }

    public void fillRect(int x, int y, int w, int h)
    {
        for(int i = 0; i < w; i++)
        {
            for(int j = 0; j < h; j++)
            {
                fillPoint(x + i, y + j);
            }
        }
    }

    public void fillPoint(int x, int y)
    {

        IntPoint temp = new IntPoint(x, y);
        if(! points.contains(temp))
        {
            int rand = (int)(Math.random() * 100);
            fillPoint(temp, rand);
        }
    }

    public synchronized void fillPoint(IntPoint temp, int rand)
    {
        if(rand < colorSprayFrequency || colorSprayType == 1)
        {
            if(colorSprayHue != 0 || colorSpraySaturation != 0 || colorSprayBrightness != 0)
            {
                changeColor();
            }
        }

        if(colorSprayType == 2)
        {
            drawOne(temp, rand);
        }else if(colorSprayType == 3)
        {
            drawTwo(temp, rand);
        }else if(colorSprayType == 4)
        {
            drawThree(temp, rand);
        }else if(colorSprayType == 5)
        {
            drawFour(temp, rand);
        }else if(colorSprayType == 6)
        {
            drawFive(temp, rand);
        }else if(colorSprayType == 7)
        {
            drawSix(temp, rand);
        }else if(colorSprayType == 8)
        {
            drawSeven(temp, rand);
        }else if(colorSprayType == 9)
        {
            drawEight(temp, rand);
        }else if(colorSprayType == 10)
        {
            drawNine(temp, rand);
        }else if(colorSprayType == 11)
        {
            drawTen(temp, rand);
        }else if(colorSprayType == 12)
        {
            drawEleven(temp, rand);
        }else
        {
            addToLists(temp);
        }
    }

    private synchronized void addToLists(final IntPoint temp)
    {
        if(baseColor.getAlpha() < 255)
        {
            translucentColorAtPoint.add(new Integer(color));
            translucentPoints.add(temp);
        }
        else
        {
            colorAtPoint.add(new Integer(color));
            points.add(temp);
        }
    }

    public ArrayList prime()
    {
        if(lines.size() > 30)
        {
            return lines;
        }
        leftXStrapLoc = -9999;
        leftYStrapLoc = -9999;
        rightXStrapLoc = -9999;
        rightYStrapLoc = -9999;

        ArrayList tempLines = new ArrayList();
        tempLines.add(size);
        tempLines.add(firstTranslate);
        for(int i = 0; i < colors.size(); i++)
        {
            tempLines.add(colors.get(i));
            addToLines(i, tempLines);
        }

        for(int i = 0; i < translucentColors.size(); i++)
        {
            tempLines.add(translucentColors.get(i));
            addTranslucentToLines(i, tempLines);
        }
        tempLines.add(new Double(1 / size.doubleValue()));
        tempLines.add(lastTranslate);
        lines = tempLines;
        return lines;
    }

    private void addToLines(int c, ArrayList tempLines)
    {
        Integer col = new Integer(c);
        while(colorAtPoint.contains(col))
        {
            int indexOfCol = colorAtPoint.indexOf(col);
            colorAtPoint.remove(indexOfCol);
            IntPoint orig = (IntPoint) points.remove(indexOfCol);

            IntPoint temp = new IntPoint(orig.getX(), orig.getY() + 1);
            int w = 1;
            int h = 1;
            int tempIndex = points.indexOf(temp);
            while(tempIndex != -1 && colorAtPoint.get(tempIndex).equals(col))
            {
                points.remove(tempIndex);
                colorAtPoint.remove(tempIndex);
                h++;
                temp = new IntPoint(temp.getX(), temp.getY() + 1);
                tempIndex = points.indexOf(temp);
            }
            if(h == 1)
            {
                temp = new IntPoint(orig.getX() + 1, orig.getY());
                tempIndex = points.indexOf(temp);
                while(tempIndex != -1 && colorAtPoint.get(tempIndex).equals(col))
                {
                    points.remove(tempIndex);
                    colorAtPoint.remove(tempIndex);
                    w++;
                    temp = new IntPoint(temp.getX() + 1, temp.getY());
                    tempIndex = points.indexOf(temp);
                }
            }
            int [] xywh = new int [4];
            xywh[0] = orig.getX();
            xywh[1] = orig.getY();
            xywh[2] = w;
            xywh[3] = h;
            tempLines.add(xywh);
        }
    }

    public void translate(int xPos, int yPos)
    {
        firstTranslate[0] = xPos;
        firstTranslate[1] = yPos;

        lastTranslate[0] = -xPos;
        lastTranslate[1] = -yPos;
    }

    public void scale(double s)
    {
        this.size = new Double(s);
    }

    private void changeColor()
    {
        if(colorSprayType == 0 || Math.random() * 100 < colorSprayFrequency)
        {
            float [] temp = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
            float hue = temp[0] * 360;
            float sat = temp[1] * 100;
            float bri = temp[2] * 100;
            int alp = baseColor.getAlpha();

            if(colorSprayType == 0)
            {
                hue += (float)((colorSprayHue * Math.random()) - (colorSprayHue / 2.0)) % 360;
                sat += (float)((colorSpraySaturation * Math.random()) - (colorSpraySaturation / 2.0));
                if(sat < 0)
                    sat = -sat;
                else if(sat > 100)
                    sat = 100 - (sat - 100);
                bri += (float)((colorSprayBrightness * Math.random()) - (colorSprayBrightness / 2.0));
                if(bri < 0)
                    bri = -bri;
                else if(bri > 100)
                    bri = 100 - (bri - 100);
            }
            else if(colorSprayType == 1 || colorSprayType == 2)
            {
                hue += (float)((colorSprayHue) - (colorSprayHue / 2.0)) % 360;
                sat += (float)((colorSpraySaturation) - (colorSpraySaturation / 2.0));
                if(sat < 0)
                    sat = -sat;
                else if(sat > 100)
                    sat = 100 - (sat - 100);
                bri += (float)((colorSprayBrightness) - (colorSprayBrightness / 2.0));
                if(bri < 0)
                    bri = -bri;
                else if(bri > 100)
                    bri = 100 - (bri - 100);
            }

            Color col = Color.getHSBColor(hue / 360f, sat / 100f, bri / 100f);
            col = new Color(col.getRed(), col.getGreen(), col.getBlue(), alp);
            setInternalColor(col);
        }
    }

    private void addTranslucentToLines(int c, ArrayList tempLines)
    {
        Integer col = new Integer(c);
        while(translucentColorAtPoint.contains(col))
        {
            int indexOfCol = translucentColorAtPoint.indexOf(col);
            translucentColorAtPoint.remove(indexOfCol);
            IntPoint orig = (IntPoint) translucentPoints.remove(indexOfCol);

            IntPoint temp = new IntPoint(orig.getX(), orig.getY() + 1);
            int w = 1;
            int h = 1;
            int tempIndex = translucentPoints.indexOf(temp);
            while(tempIndex != -1 && translucentColorAtPoint.get(tempIndex).equals(col))
            {
                translucentPoints.remove(tempIndex);
                translucentColorAtPoint.remove(tempIndex);
                h++;
                temp = new IntPoint(temp.getX(), temp.getY() + 1);
                tempIndex = translucentPoints.indexOf(temp);
            }
            if(h == 1)
            {
                temp = new IntPoint(orig.getX() + 1, orig.getY());
                tempIndex = translucentPoints.indexOf(temp);
                while(tempIndex != -1 && translucentColorAtPoint.get(tempIndex).equals(col))
                {
                    translucentPoints.remove(tempIndex);
                    translucentColorAtPoint.remove(tempIndex);
                    w++;
                    temp = new IntPoint(temp.getX() + 1, temp.getY());
                    tempIndex = translucentPoints.indexOf(temp);
                }
            }
            int [] xywh = new int [4];
            xywh[0] = orig.getX();
            xywh[1] = orig.getY();
            xywh[2] = w;
            xywh[3] = h;
            tempLines.add(xywh);
        }
    }

    private void overwrite(IntPoint temp)
    {
        if(!points.contains(temp))
        {
            addToLists(temp);
        }
        else
        {
            if(baseColor.getAlpha() < 255)
            {
                int i = translucentPoints.indexOf(temp);
                if(i == -1)
                {
                    addToLists(temp);
                }
                else
                {
                    translucentColorAtPoint.set(i, new Integer(color));
                }
            }
            else
            {
                int i = points.indexOf(temp);
                colorAtPoint.set(i, new Integer(color));
            }
        }
    }

    private void drawOne(IntPoint temp, int rand)
    {
        if(rand < colorSprayFrequency)
        {
            float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
            float bri = tempC[2] * 100;
            float sat = tempC[1] * 100;

            bri += colorSprayBrightness;
            if(bri < 0)
                bri = 0;
            else if(bri > 100)
            {
                sat -= bri - 100;
                if(sat < 0)
                    sat = 0;
                bri = 100;

            }

            Color col = Color.getHSBColor(tempC[0], sat / 100f, bri / 100f);
            col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
            setInternalColor(col);
        }

        addToLists(temp);
        setColor(baseColor);
    }

    private void drawTwo(IntPoint temp, int rand)
    {
        if(rand < colorSprayFrequency)
        {
            float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
            float bri = tempC[2] * 100;
            float sat = tempC[1] * 100;

            bri += colorSprayBrightness;
            if(bri < 0)
                bri = 0;
            else if(bri > 100)
            {
                sat -= bri - 100;
                if(sat < 0)
                    sat = 0;
                bri = 100;

            }

            Color col = Color.getHSBColor(tempC[0], sat / 100f, bri / 100f);
            col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
            setInternalColor(col);

            if(Math.random() < .6)
            {
            }
            else
            {
                if(Math.random() < .5)
                {
                    IntPoint temp2 = new IntPoint(temp.getX() + 1, temp.getY());
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX() - 1, temp.getY());
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX(), temp.getY() + 1);
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX(), temp.getY() - 1);
                    overwrite(temp2);
                }
                else
                {
                    IntPoint temp2 = new IntPoint(temp.getX() + 1, temp.getY() + 1);
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX() - 1, temp.getY() - 1);
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX() - 1, temp.getY() + 1);
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX() + 1, temp.getY() - 1);
                    overwrite(temp2);
                }
            }
        }
        addToLists(temp);
        setColor(baseColor);
    }

    private void drawThree(IntPoint temp, int rand)//line on X
    {
        int spacing = lastIndex / colorSprayFrequency;
            if(firstX == -1)
                firstX = temp.getX();
            if(firstY == -1)
                firstY = temp.getY();


            if(((firstX + index) - temp.getX()) % spacing == 0)
            {
                float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
                float bri = tempC[2] * 100;
                float sat = tempC[1] * 100;

                bri += colorSprayBrightness;
                if(bri < 0)
                    bri = 0;
                else if(bri > 100)
                {
                    sat -= bri - 100;
                    if(sat < 0)
                        sat = 0;
                    bri = 100;

                }

                Color col = Color.getHSBColor(tempC[0], sat / 100f, bri / 100f);
                col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
                setInternalColor(col);
            }



        addToLists(temp);
        setColor(baseColor);
    }

    private void drawFour(IntPoint temp, int rand)//line on Y
    {
        int spacing = lastIndex / colorSprayFrequency;
            if(firstX == -1)
                firstX = temp.getX();
            if(firstY == -1)
                firstY = temp.getY();


            if(((firstY + index) - temp.getY()) % spacing == 0)
            {
                float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
                float bri = tempC[2] * 100;
                float sat = tempC[1] * 100;

                bri += colorSprayBrightness;
                if(bri < 0)
                    bri = 0;
                else if(bri > 100)
                {
                    sat -= bri - 100;
                    if(sat < 0)
                        sat = 0;
                    bri = 100;

                }

                Color col = Color.getHSBColor(tempC[0], sat / 100f, bri / 100f);
                col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
                setInternalColor(col);
            }



        addToLists(temp);
        setColor(baseColor);
    }

    private void drawFive(IntPoint temp, int rand)//line on Y
    {
        if(colorSprayFrequency == 0)
            colorSprayFrequency = 1;
        int spacing = lastIndex / colorSprayFrequency;
            if(firstX == -1)
                firstX = temp.getX();
            if(firstY == -1)
                firstY = temp.getY();


            if(((firstY + index) - temp.getY()) % spacing == 0)
            {
                float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
                float bri = tempC[2] * 100;
                float sat = tempC[1] * 100;

                bri += colorSprayBrightness;
                if(bri < 0)
                    bri = 0;
                else if(bri > 100)
                {
                    sat -= bri - 100;
                    if(sat < 0)
                        sat = 0;
                    bri = 100;

                }

                Color col = Color.getHSBColor(tempC[0], sat / 100f, bri / 100f);
                col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
                setInternalColor(col);
            }

            if(((firstX + index) - temp.getX()) % spacing == 0)
            {
                float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
                float bri = tempC[2] * 100;
                float sat = tempC[1] * 100;

                bri += colorSprayBrightness;
                if(bri < 0)
                    bri = 0;
                else if(bri > 100)
                {
                    sat -= bri - 100;
                    if(sat < 0)
                        sat = 0;
                    bri = 100;

                }

                Color col = Color.getHSBColor(tempC[0], sat / 100f, bri / 100f);
                col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
                setInternalColor(col);
            }

        addToLists(temp);
        setColor(baseColor);
    }

    private void drawSix(IntPoint temp, int rand)
    {
        if(rand < colorSprayFrequency)
        {
            float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
            float bri = tempC[2] * 100;
            float sat = tempC[1] * 100;

            bri += colorSprayBrightness;
            if(bri < 0)
                bri = 0;
            else if(bri > 100)
            {
                sat -= bri - 100;
                if(sat < 0)
                    sat = 0;
                bri = 100;

            }

            Color col = Color.getHSBColor(tempC[0], sat / 100f, bri / 100f);
            col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
            setInternalColor(col);

            if(Math.random() < .6)
            {
            }
            else
            {
                IntPoint temp2 = new IntPoint(temp.getX() + 1, temp.getY());
                overwrite(temp2);
                temp2 = new IntPoint(temp.getX() - 1, temp.getY());
                overwrite(temp2);
                temp2 = new IntPoint(temp.getX() + 2, temp.getY());
                overwrite(temp2);
                temp2 = new IntPoint(temp.getX() - 2, temp.getY());
                overwrite(temp2);
                temp2 = new IntPoint(temp.getX() + 1, temp.getY() - 1);
                overwrite(temp2);
                temp2 = new IntPoint(temp.getX() - 1, temp.getY() - 1);
                overwrite(temp2);
                temp2 = new IntPoint(temp.getX(), temp.getY() + 1);
                overwrite(temp2);
                temp2 = new IntPoint(temp.getX() + 1, temp.getY() + 1);
                overwrite(temp2);
                temp2 = new IntPoint(temp.getX() - 1, temp.getY() + 1);
                overwrite(temp2);
                temp2 = new IntPoint(temp.getX(), temp.getY() + 2);
                overwrite(temp2);
            }
        }
        addToLists(temp);
        setColor(baseColor);
    }

    private void drawSeven(IntPoint temp, int rand)//hue
    {
        if(colorSprayFrequency == 0)
            colorSprayFrequency = 1;
        double tempHueSpray = 1;
        if(colorSprayHue > 0)
            tempHueSpray = colorSprayHue / 360.0;
        float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        float hue = tempC[0];

        double xLen = (temp.getX()) ^ 2;
        double yLen = (temp.getY()) ^ 2;
        double len = (float) (Math.sqrt(xLen + yLen));

        double tempLen = len;
        while(tempLen > 0)
        {
            len = tempLen;
            tempLen -= colorSprayFrequency;
        }

        hue += tempHueSpray * (len / colorSprayFrequency);

        Color col = Color.getHSBColor(hue, tempC[1], tempC[2]);
        col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
        setInternalColor(col);

        addToLists(temp);
        setColor(baseColor);
    }

    private void drawEight(IntPoint temp, int rand)//hue
    {
        if(colorSprayFrequency == 0)
            colorSprayFrequency = 1;
        double tempHueSpray = 1;
        if(colorSprayHue > 0)
            tempHueSpray = colorSprayHue / 360.0;
        float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        float hue = tempC[0];

        double len = temp.getY() - firstY;

        double tempLen = len;
        while(tempLen > 0)
        {
            len = tempLen;
            tempLen -= colorSprayFrequency;
        }

        hue += tempHueSpray * (len / colorSprayFrequency);

        Color col = Color.getHSBColor(hue, tempC[1], tempC[2]);
        col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
        setInternalColor(col);

        addToLists(temp);
        setColor(baseColor);
    }


    private void drawNine(IntPoint temp, int rand)//hue
    {

        if(firstX == -1)
            firstX = (int) (Math.random() * 200);
        if(firstY == -1)
            firstY = (int) (Math.random() * 200);

        if(colorSprayFrequency == 0)
            colorSprayFrequency = 1;
        double tempHueSpray = 1;
        if(colorSprayHue > 0)
            tempHueSpray = colorSprayHue / 360.0;
        float [] tempC = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        float hue = tempC[0];

        double xLen = (temp.getX() - firstX) ^ 2;
        if(temp.getX() < firstX)
        {
            xLen = (firstX - temp.getX()) ^ 2;
        }

        double yLen = (temp.getY() - firstY) ^ 2;
        if(temp.getY() < firstY)
        {
            yLen = (firstY - temp.getY()) ^ 2;
        }

        double len = (float) (Math.sqrt(xLen + yLen));

        double tempLen = len;
        while(tempLen > 0)
        {
            len = tempLen;
            tempLen -= colorSprayFrequency;
        }

        hue += tempHueSpray * (len / colorSprayFrequency);

        Color col = Color.getHSBColor(hue, tempC[1], tempC[2]);
        col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
        setInternalColor(col);

        addToLists(temp);
        setColor(baseColor);
    }

    private void drawTen(IntPoint temp, int rand)//hue
    {
        if(rand < colorSprayFrequency)
        {
            float bri = colorSprayBrightness;
            if(colorSprayBrightness == 0)
                bri = 100;

            float sat = colorSpraySaturation;
            if(colorSpraySaturation == 0)
                sat = 100;

            float hue = (float)Math.random();


            Color col = Color.getHSBColor(hue, sat / 100f, bri / 100f);
            col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
            setInternalColor(col);
        }

        addToLists(temp);
        setColor(baseColor);
    }

    private void drawEleven(IntPoint temp, int rand)//hue
    {
        if(rand < colorSprayFrequency)
        {
            float bri = colorSprayBrightness;
            if(colorSprayBrightness == 0)
                bri = 100;

            float sat = colorSpraySaturation;
            if(colorSpraySaturation == 0)
                sat = 100;

            float hue = (float)Math.random();


            Color col = Color.getHSBColor(hue, sat / 100f, bri / 100f);
            col = new Color(col.getRed(), col.getGreen(), col.getBlue(), baseColor.getAlpha());
            setInternalColor(col);

            if(Math.random() < .6)
            {
            }
            else
            {
                if(Math.random() < .5)
                {
                    IntPoint temp2 = new IntPoint(temp.getX() + 1, temp.getY());
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX() - 1, temp.getY());
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX(), temp.getY() + 1);
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX(), temp.getY() - 1);
                    overwrite(temp2);
                }
                else
                {
                    IntPoint temp2 = new IntPoint(temp.getX() + 1, temp.getY() + 1);
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX() - 1, temp.getY() - 1);
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX() - 1, temp.getY() + 1);
                    overwrite(temp2);
                    temp2 = new IntPoint(temp.getX() + 1, temp.getY() - 1);
                    overwrite(temp2);
                }
            }
        }
        addToLists(temp);
        setColor(baseColor);
    }

    public void setRightStrap(int x, int y) {
        rightXStrapLoc = x;
        rightYStrapLoc = y;
    }

    public void setLeftStrap(int x, int y) {
        leftXStrapLoc = x;
        leftYStrapLoc = y;
    }

    public int [] getRightStrap()
    {
        return new int [] {rightXStrapLoc, rightYStrapLoc};
    }

    public int [] getLeftStrap()
    {
        return new int [] {leftXStrapLoc, leftYStrapLoc};
    }


    public int leftXStrapLoc = -9999;
    public int leftYStrapLoc = -9999;
    public int rightXStrapLoc = -9999;
    public int rightYStrapLoc = -9999;

    Double size = new Double(1.0);
    int [] firstTranslate = {0, 0};
    int [] lastTranslate = {0, 0};
}
