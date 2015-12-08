package util.dFactoryTypes;

import clts.SuperB;
import clts.SuperC;
import clts.SuperS;
import clts.SuperTL;
import clts.SuperTU;
import draw.Panel;
import java.util.ArrayList;
import util.ColorArray;
import util.CthsFactory;
import util.DFactory;

public class Police {

    protected Police() {
        super();
    }

    public static SuperC[] newSuperC(Panel p) {
        SuperC[] c = null;

        SuperC[] tuTlB = getRandomOutfit(p.b.sMiddle, DFactory.primaryArray);
        SuperC[] acc = getAccessories();

        SuperC tu = tuTlB[0];
        SuperC tl = tuTlB[1];
        SuperC b = tuTlB[2];
        SuperC s = getRandomShoes((SuperTU) tu, (SuperTL) tl, (SuperB) b, DFactory.secondaryArray);
        SuperC as = getRandomAnkleStraps((SuperTU) tu, (SuperTL) tl, (SuperB) b, (SuperS) s, DFactory.secondaryArray);
        SuperC pl = util.CthsFactory.getRandomPlatz((SuperTU) tu, (SuperTL) tl, (SuperB) b, (SuperS) s, DFactory.secondaryArray);
        if (((clts.SuperP) pl).height < 7) {
            ((clts.SuperP) pl).height = 7;
        }

        SuperC sk = getRandomSock((SuperS) s, DFactory.accPrimaryArray);


        ArrayList al = new ArrayList();
        al.add(sk);
        al.add(pl);
        al.add(s);
        if (("" + as.getClass()).indexOf("Blank") == -1) {
            al.add(as);
        }
        if (("" + b.getClass()).indexOf("Blank") == -1) {
            al.add(b);
        }
        al.add(tl);
        al.add(tu);

        for (int i = 3; i < tuTlB.length; i++) {
            al.add(tuTlB[i]);
        }

        for (int i = 0; i < acc.length; i++) {
            al.add(acc[i]);
        }

        c = new SuperC[al.size()];

        for (int i = 0; i < c.length; i++) {
            c[i] = (SuperC) al.get(i);
        }

        ArrayList uppers = new ArrayList();
        for (int j = 0; j < c.length; j++) {
            if (c[j] instanceof clts.SuperTU) {
                uppers.add(c[j]);
            }
            if (c[j] instanceof clts.SuperTL) {
                uppers.add(c[j]);
            }
        }

        for (int j = 0; j < uppers.size(); j++) {
            DFactory.checkArms(p, (clts.SuperC) uppers.get(j));
        }

        return c;

    }

    public static SuperC getRandomSock(SuperS shoe, ColorArray colors) {
        if (Math.random() < .5) {
            return new clts.Blank();
        }

        SuperC[] temp = CthsFactory.getAllShoes();

        ArrayList al = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            if (((SuperS) temp[i]).nurse && ((SuperS) temp[i]).sock && (shoe.slenderS == ((SuperS) temp[i]).slenderS)) {
                al.add(temp[i]);
            }
        }

        temp = CthsFactory.getAllAnkleStraps();

        for (int i = 0; i < temp.length; i++) {
            if (((SuperS) temp[i]).nurse && ((SuperS) temp[i]).sock && (shoe.slenderS == ((SuperS) temp[i]).slenderS)) {
                al.add(temp[i]);
            }
        }

        SuperC s = (SuperC) al.get((int) (Math.random() * al.size()));

        s.setColors(colors);

        return s;
    }

    public static SuperC[] getAccessories() {
        ArrayList al = new ArrayList();

        if (Math.random() < .7) {
            al.add(new clts.t.u.a.Gun0(DFactory.accSecondaryArray));
        }
        if (Math.random() < .9) {
            al.add(new clts.h.H3(DFactory.primaryArray));
            al.add(new clts.h.HB1(DFactory.accPrimaryArray));
        }

        if (Math.random() < .5) {
            al.add(new clts.b.a.Blt4(DFactory.accPrimaryArray));
        }

        SuperC[] c = new SuperC[al.size()];

        for (int i = 0; i < c.length; i++) {
            c[i] = (SuperC) al.get(i);
        }

        return c;
    }

    public static SuperC[] getRandomOutfit(String middle, ColorArray colors) {
        SuperB[] bots = {new clts.b.Bot44(2, DFactory.tercaryArray), new clts.b.Bot44(2, DFactory.tercaryArray), new clts.b.Bot44(2, DFactory.tercaryArray), new clts.b.Bot0(2, DFactory.tercaryArray)};
        SuperC[] tuTlB = new SuperC[3];


        tuTlB = new SuperC[3];
        tuTlB[0] = new clts.t.u.TopUpper10(middle, colors);
        tuTlB[1] = new clts.t.l.TopLower12(colors);
        tuTlB[2] = bots[(int) (Math.random() * bots.length)];



        return tuTlB;
    }

    public static SuperC getRandomShoes(SuperTU topUpper, SuperTL topLower, SuperB bottoms, ColorArray colors) {
        SuperC[] temp = CthsFactory.getAllShoes();

        if (topUpper.slenderS || topLower.slenderS || bottoms.slenderS) {
            ArrayList al = new ArrayList();
            for (int i = 0; i < temp.length; i++) {
                if (!((SuperS) temp[i]).notSlenderS) {
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
            if (((SuperS) temp[i]).police) {
                al.add(temp[i]);
            }
        }

        SuperC s = (SuperC) al.get((int) (Math.random() * al.size()));

        s.setColors(colors);

        return s;
    }

    public static SuperC getRandomAnkleStraps(SuperTU topUpper, SuperTL topLower, SuperB bottoms, SuperS shoe, ColorArray colors) {
        if (Math.random() < .5) {
            return new clts.Blank();
        }


        if (!shoe.strapAllowed) {
            return new clts.Blank();
        }

        SuperC[] temp = CthsFactory.getAllAnkleStraps();

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
