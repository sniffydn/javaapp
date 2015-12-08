/*
 * RBow.java
 *
 * Created on July 2, 2007, 12:36 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import draw.Panel;
import util.Color;
import util.ColorArray;
import util.ColorArrayFactory;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class RegHr {
    private static int size = 1;
    private static float hue = 0;
    private static float sat = 0;
    private static float bri = 0;
    private static int redLine = 2;
    private static int brownLine = 30;
    private static int blonLine = 35;
    public static Panel panel = null;

    /** Creates a new instance of RBow */
    private RegHr() {
    }

//    public static void setArraysBlack(Panel p)
//    {
//            float h = (float) ((Math.random() * (blonLine)));
//            float b = (float) ((Math.random() * 10) + 15);
//            float s = (float) ((Math.random() * 20) + 80);
//            Color tempCol = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
//            p.bd.hr.COLORS = ColorArrayFactory.getArrayFromColor("m," + tempCol.getRed() + "," + tempCol.getGreen() + "," + tempCol.getBlue() + "," + 255);
//    }
//
//    public static void setArraysRed(Panel p)
//    {
//            float h = (float) ((Math.random() * (redLine)));
//            float b = (float) ((Math.random() * 20) + 80);
//            float s = (float) ((Math.random() * 20) + 80);
//            if(b > 97)
//            {
//                s = (float) ((Math.random() * 60) + 40);
//            }
//            else if(b > 95)
//            {
//                s = (float) ((Math.random() * 50) + 50);
//            }
//            Color tempCol = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
//            p.bd.hr.COLORS = ColorArrayFactory.getArrayFromColor("m," + tempCol.getRed() + "," + tempCol.getGreen() + "," + tempCol.getBlue() + "," + 255);
//    }
//
//    public static void setArraysBrown(Panel p)
//    {
//            float h = (float) ((Math.random() * brownLine));
//            float s = (float) ((Math.random() * 45) + 55);
//            float b = (float) ((Math.random() * 25) + 45);
//            Color tempCol = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
//            p.bd.hr.COLORS = ColorArrayFactory.getArrayFromColor("m," + tempCol.getRed() + "," + tempCol.getGreen() + "," + tempCol.getBlue() + "," + 255);
//    }
//
//    public static void setArraysBlonde(Panel p)
//    {
//            float h = (float) ((Math.random() * 17) + blonLine);
//            float s = (float) ((Math.random() * 20) + 50);
//            float b = (float) ((Math.random() * 10) + 90);
//            Color tempCol = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
//            p.bd.hr.COLORS = ColorArrayFactory.getArrayFromColor("m," + tempCol.getRed() + "," + tempCol.getGreen() + "," + tempCol.getBlue() + "," + 255);
//    }
//
//
//    public static void setArraysSame(Panel p)
//    {
//        if(panel == null)
//            panel = p;
//        else
//        {
//            p.bd.hd.EYE_COLOR = panel.bd.hd.EYE_COLOR;
//            p.bd.hr = panel.bd.hr.cloneH();
//            p.bd.setMiddle(panel.bd.sMiddle);
//        }
//    }
}
