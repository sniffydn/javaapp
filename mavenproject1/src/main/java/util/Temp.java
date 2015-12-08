package util;

import b.Bd;
import java.awt.AWTException;
import util.Color;
import java.awt.Graphics2D;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author doubleD
 */
public class Temp
{
    static String [] outline = new String [48];
    static String [] highlight = new String [48];
    static String [] fill = new String [48];
    public static void main(String [] args)
    {
        String err = "";
        String str = "";
        String temp = "";
        int lineNumber = 0;
        int index = 0;
        try {
            resetArrays();
            BufferedReader in = new BufferedReader(new FileReader("F:/JavaStuff/JavaApplication1/x/Right.txt"));
            while ((str = in.readLine()) != null)
            {
                lineNumber++;
                str = str.trim();

                if(str.equalsIgnoreCase("g2d.setColor(Body.OUTLINE_COLOR);"))
                {
                    temp = in.readLine() + "\n";
                    index = Integer.valueOf(temp.substring(temp.indexOf("(") + 1, temp.indexOf(" "))).intValue();
                    outline[index] += temp;
                    lineNumber++;
                }
                else if(str.equalsIgnoreCase("g2d.setColor(Body.HIGHLIGHT_COLOR);"))
                {
                    temp = in.readLine() + "\n";
                    index = Integer.valueOf(temp.substring(temp.indexOf("(") + 1, temp.indexOf(" "))).intValue();
                    highlight[index] += temp;
                    lineNumber++;
                }
                else if(str.equalsIgnoreCase("g2d.setColor(Body.FILL_COLOR);"))
                {
                    temp = in.readLine() + "\n";
                    index = Integer.valueOf(temp.substring(temp.indexOf("(") + 1, temp.indexOf(" "))).intValue();
                    fill[index] += temp;
                    lineNumber++;
                }
                else
                {
                    System.out.println("if(step == " + (Integer.valueOf(str).intValue() - 1) +")\n{");
                    System.out.print("g2d.setColor(Body.OUTLINE_COLOR);\n");
                    for(int i = 0; i < outline.length; i++)
                    {
                        if(outline[i].length() > 1)
                            System.out.println(outline[i]);
                    }
                    System.out.print("g2d.setColor(Body.HIGHLIGHT_COLOR);\n");
                    for(int i = 0; i < highlight.length; i++)
                    {
                        if(highlight[i].length() > 1)
                            System.out.println(highlight[i]);
                    }
                    System.out.print("g2d.setColor(Body.FILL_COLOR);\n");
                    for(int i = 0; i < fill.length; i++)
                    {
                        if(fill[i].length() > 1)
                            System.out.println(fill[i]);
                    }
                    System.out.print("} else ");
                    resetArrays();
                }
            }

                    System.out.println("if(step == 15)\n{");
                    System.out.print("g2d.setColor(Body.OUTLINE_COLOR);\n");
                    for(int i = 0; i < outline.length; i++)
                    {
                        if(outline[i].length() > 1)
                            System.out.println(outline[i]);
                    }
                    System.out.print("g2d.setColor(Body.HIGHLIGHT_COLOR);\n");
                    for(int i = 0; i < highlight.length; i++)
                    {
                        if(highlight[i].length() > 1)
                            System.out.println(highlight[i]);
                    }
                    System.out.print("g2d.setColor(Body.FILL_COLOR);\n");
                    for(int i = 0; i < fill.length; i++)
                    {
                        if(fill[i].length() > 1)
                            System.out.println(fill[i]);
                    }
                    System.out.println("}");
            in.close();
        } catch (Exception e)
        {
            err += e + "   " + str + "   " + lineNumber + "\n";
        }
        System.out.println(err);
    }

    public static void resetArrays()
    {
        for(int i = 0; i < outline.length; i++)
        {
            outline[i] = "";
            highlight[i] = "";
            fill[i] = "";
        }
    }
}
/*

 */
