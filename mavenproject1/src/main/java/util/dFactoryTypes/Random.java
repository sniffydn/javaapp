/*
 * Random.java
 *
 * Created on July 2, 2007, 1:23 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryTypes;

import clts.Paintable;
import draw.Panel;

/**
 *
 * @author doubleD
 */
public class Random {

    /** Creates a new instance of Random */
    protected Random()
    {
    }

    public Paintable [] newSuperC(Panel p)
    {
        System.out.println("You should never get here!");
        return p.getObjs();
    }
}
