/*
 * Piece.java
 *
 */

package clts;

import util.Color;
import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public abstract class Piece implements java.io.Serializable
{

    protected ColorArray COLORS = new ColorArray();

    public Piece()
    {

    }

    public Piece(ColorArray colorSwitch)
    {
        COLORS = colorSwitch;
    }

    public String toString()
    {
        return this.getClass() + "";
    }

    public abstract void paint(int x, int y, GraphicsMap g2d);

    public String printColorArray(String arrayName)
    {
        String colorArray = "\n" + util.PrintHelper.printColorArray(COLORS);
        colorArray.replaceFirst("temp", arrayName);
        return colorArray;
    }

    public String print(String arrayName)
    {
        String retVal = this.getClass() + "";
        retVal = retVal.substring(retVal.indexOf(" "));
        return "new" + retVal + "(" + arrayName + ")";
    }

    public ColorArray getColors() {
        return COLORS;
    }

    public void setColors(ColorArray COLORS) {
        this.COLORS = COLORS;
    }
}
