/*
 * Jean.java
 *
 * Created on July 2, 2007, 11:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package util.dFactoryTypes;

import clts.SuperB;
import clts.SuperC;
import clts.SuperP;
import clts.SuperS;
import clts.SuperTL;
import clts.SuperTU;
import draw.Panel;
import java.util.ArrayList;
import util.ColorArray;
import util.CthsFactory;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class Swim {

    /** Creates a new instance of Jean */
    private Swim() {
    }

    public static SuperC[] newSuperC(Panel p) {
        SuperC[] c = null;

        ColorArray top = DFactory.accTercaryArray;
        if (Math.random() < .5) {
            if (Math.random() < .5) {
                top = DFactory.tercaryArray;
            } else {
                top = DFactory.primaryArray;
            }
        }

        ColorArray bottom = DFactory.accPrimaryArray;
        if (Math.random() < .66) {
            if (Math.random() < .5) {
                bottom = DFactory.secondaryArray;
            } else {
                bottom = DFactory.accSecondaryArray;
            }
        }

        SuperC tu = getRandomTopUpper(p.b.sMiddle, top.getNewColorArray());
        SuperC b = getRandomBottoms((SuperTU) tu, (SuperTL) new clts.BlankTL(), DFactory.primaryArray.getNewColorArray());
        SuperC s = CthsFactory.getRandomShoes((SuperTU) tu, (SuperTL) new clts.BlankTL(), (SuperB) b, bottom.getNewColorArray());
        SuperC as = getRandomAnkleStraps((SuperTU) tu, (SuperTL) new clts.BlankTL(), (SuperB) b, (SuperS) s, bottom.getNewColorArray());
        SuperC pl = CthsFactory.getRandomPlatz((SuperTU) tu, (SuperTL) new clts.BlankTL(), (SuperB) b, (SuperS) s, bottom.getNewColorArray());

        if (((SuperP) pl).height > 6) {
            ((SuperP) pl).height = 6;
        }


        ArrayList al = new ArrayList();

        al.add(pl);
        al.add(s);
        SuperC temp = CthsFactory.getRecommendedAccessory(s, DFactory.accSecondaryArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }
        al.add(as);
        temp = CthsFactory.getRecommendedAccessory(as, DFactory.accSecondaryArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }
        al.add(b);
        temp = CthsFactory.getRecommendedAccessory(b, DFactory.accSecondaryArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }
        al.add(tu);
        temp = CthsFactory.getRecommendedAccessory(tu, DFactory.tercaryArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }

        c = new SuperC[al.size()];

        for (int i = 0; i < c.length; i++) {
            c[i] = (SuperC) al.get(i);
        }

        return c;
    }

    public static SuperC getRandomTopUpper(String middle, ColorArray colors) {
        SuperC[] temp = CthsFactory.getAllTopUppers( middle);

        ArrayList al = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].swim) {
                al.add(temp[i]);
            }
        }

        SuperTU tu = (SuperTU) al.get((int) (Math.random() * al.size()));

        tu.setMiddle(middle);
        tu.setColors(colors);

        return tu;
    }

    public static SuperC getRandomBottoms(SuperTU topUpper, SuperTL topLower, ColorArray colors) {
        if (topUpper.containsB || topLower.containsB) {
            return new clts.BlankB();
        }

        SuperC[] temp = CthsFactory.getAllBottoms();

        if (topLower.slenderB) {
            ArrayList al = new ArrayList();
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].slenderB) {
                    al.add(temp[i]);
                }
            }

            temp = new SuperC[al.size()];

            for (int i = 0; i < temp.length; i++) {
                temp[i] = (SuperC) al.get(i);
            }
        }

        ArrayList al = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].swim) {
                al.add(temp[i]);
            }
        }

        SuperC b = (SuperC) al.get((int) (Math.random() * al.size()));

        b.setColors(colors);

        return b;
    }

    public static SuperC getRandomAnkleStraps(SuperTU topUpper, SuperTL topLower, SuperB bottoms, SuperS shoe, ColorArray colors) {
        if (Math.random() < .5) {
            return new clts.Blank();
        }

        SuperC[] temp = CthsFactory.getAllAnkleStraps();

        if (!shoe.strapAllowed) {
            return new clts.Blank();
        }

        ArrayList al = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            if (((SuperS) temp[i]).strap) {
                al.add(temp[i]);
            }
        }

        SuperC s = (SuperC) al.get((int) (Math.random() * al.size()));

        s.setColors(colors);

        return s;
    }
}
