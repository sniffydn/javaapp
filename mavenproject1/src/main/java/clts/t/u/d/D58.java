/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.d;

import util.ColorArray;
import util.GraphicsMap;

/**
 *
 * @author doubleD
 */
public class D58 extends D55 {


    public D58() {
        super();
    }

    public D58(String middle) {
        super(middle);
    }

    public D58(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
    }    

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {        
        prevY = offsetY;
    }
}
