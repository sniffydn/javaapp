/*
 * IntPoint.java
 *
 * Created on July 17, 2007, 4:02 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author doubleD
 */
public class IntPoint {

    public int x;
    public int y;
    /** Creates a new instance of IntPoint */
    public IntPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object o)
    {
        return ((IntPoint)o).x == this.x && ((IntPoint)o).y == this.y;
    }
}
