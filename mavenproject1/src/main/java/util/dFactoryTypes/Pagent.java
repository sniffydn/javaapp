/*
 * Jean.java
 *
 * Created on July 2, 2007, 11:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryTypes;

import clts.SuperC;
import draw.Panel;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class Pagent {

    /** Creates a new instance of Jean */
    private Pagent() {
    }

    private static int count = 0;
    
    public static SuperC [] newSuperC(Panel p)
    {
        
        if(DFactory.primaryC == null)
        {
            DFactory.primaryC = p.getObjs();
            count = 0;
        }
        
        if(count == 0)
        {
            count++;
            return Swim.newSuperC(p);
        }
        else if(count == 1)
        {
            count++;
            return Jean.newSuperC(p);
        }
        else if(count == 2)
        {
            count++;
            return Career.newSuperC(p);
        }
        else
        {
            count++;
            return Dress.newSuperC(p);
        }
    }
}
