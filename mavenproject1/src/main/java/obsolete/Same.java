/*
 * Same.java
 *
 * Created on July 2, 2007, 11:48 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.*;
import clts.p.Platz0;
import draw.Panel;
import util.Color;
import java.lang.reflect.Method;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class Same
{
    /** Creates a new instance of Same */
    protected Same() {
        super();
    }

//    public static SuperC [] newSuperC(Panel p)
//    {
//        if(DFactory.primaryC == null)
//        {
//            DFactory.primaryC = p.objs;
//        }
//        SuperC [] c = {new clts.p.Platz0(5, 0), util.CthsFactory.getRandomShoes()};
//        c = new SuperC [DFactory.primaryC.length];
//        for(int i = 0; i < c.length; i++)
//        {
//            c[i] = DFactory.primaryC[i].cloneC();
//            if(c[i] instanceof Platz0 || c[i] instanceof SuperS)
//            {
//                c[i].setColors(DFactory.secondaryArray);
//            }
//            else if(c[i] instanceof SuperTL || c[i] instanceof SuperTU || c[i] instanceof clts.t.u.d.D1 || c[i] instanceof clts.t.u.d.D2 || c[i] instanceof obsolete.L1 || c[i] instanceof clts.t.u.s.Srt1 || c[i] instanceof clts.t.u.s.Srt2)
//            {
//                c[i].setColors(DFactory.primaryArray.getNewColorArray());
//            }
//            else if(c[i] instanceof SuperB)
//            {
//                if(Math.random() < .3)
//                    c[i].setColors(DFactory.primaryArray.getNewColorArray());
//                else
//                    if(Math.random() < .5)
//                        c[i].setColors(DFactory.secondaryArray.getNewColorArray());
//                    else
//                        c[i].setColors(DFactory.tercaryArray.getNewColorArray());
//            }
//            else
//            {
//                if(Math.random() < .3)
//                    c[i].setColors(DFactory.accPrimaryArray.getNewColorArray());
//                else
//                    if(Math.random() < .5)
//                        c[i].setColors(DFactory.accSecondaryArray.getNewColorArray());
//                    else
//                        c[i].setColors(DFactory.accTercaryArray.getNewColorArray());
//            }
//
//            checkTU(p,c[i]);
//            DFactory.checkArms(p, (SuperC)c[i]);
//        }
//
//        return c;
//    }
//
//    public static void checkTU(Panel p, SuperC c)
//    {
//        if(c instanceof SuperTU)
//        {
//            Method [] methods = c.getClass().getMethods();
//            boolean ok = false;
//            String tempSmiddle = "d";
//            for(int j = 0; j < methods.length; j++)
//            {
//                if(methods[j].getName().equalsIgnoreCase("draw" + p.bd.sMiddle))
//                {
//                    ok = true;
//                    break;
//                }
//                if(methods[j].getName().length() == 5)
//                {
//                    if(methods[j].getName().startsWith("draw"))
//                    {
//                        tempSmiddle = methods[j].getName().substring(4).toLowerCase();
//                    }
//                }
//            }
//
//            if(!ok)
//            {
//                p.bd.setMiddle(tempSmiddle);
//            }
//
//            c.setMiddle(p.bd.sMiddle);
//        }
//    }
}
