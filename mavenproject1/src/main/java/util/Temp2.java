/*
 * Temp2.java
 *
 * Created on March 2, 2007, 11:32 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author doubleD
 */
public class Temp2
{
        public static void main(String [] args)
        {
            try {
                BufferedReader in = new BufferedReader(new FileReader("F:/JavaStuff/JavaApplication1/x/Copy of Right.txt"));
                String str;
                while ((str = in.readLine()) != null)
                {
                    if(str.startsWith("g2d.fillRect"))
                    {
                        String top = str;
                        while(top.startsWith("g2d.fillRect"))
                        {
                            int y = getY(top);
                            String temp;
                            int count = 1;
                            while (!(temp = in.readLine()).trim().equals(""))
                            {
                                y++;
                                if(y == getY(temp))
                                {
                                    count++;
                                }
                                else
                                {
                                    break;
                                }
                            }
                            System.out.println(top.substring(0, top.indexOf("1);")) + count + ");");
                            top = temp;
                        }

                    }
                    else
                    {
                        System.out.println(str);
                    }
                }
                in.close();
            } catch (IOException e) {
            };
        }

    private static int getY(String temp)
    {
        return Integer.valueOf(temp.substring(temp.indexOf(",") + 2, temp.indexOf(" + y"))).intValue();
    }
}
