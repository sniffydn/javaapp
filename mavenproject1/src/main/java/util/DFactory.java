/*11
 * 35,76,100
 * 40,65,100
 * dFactory.java
 *
 * Created on April 9, 2007, 12:53 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package util;

import clts.*;
import draw.Panel;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author doubleD
 */
public class DFactory {

    public static boolean reset = true;
    public static ColorArray primaryArray;
    public static ColorArray hrArray;
    public static Paintable[] primaryC;
    public static ColorArray secondaryArray;
    public static ColorArray tercaryArray;
    public static ColorArray accPrimaryArray;
    public static ColorArray accSecondaryArray;
    public static ColorArray accTercaryArray;
    public static double ONE = 3;
    public static int MIN_ARRAY_SIZE = 30;
    public static int MAX_ARRAY_ADDITION = 20;
    public static int ARRAY_SIZE = -1;
    public static double RAND_ONE = -1;

    /** Creates a new instance of dFactory */
    private DFactory() {
    }

    public static Panel newPanel() {
        return newPanel(false);
    }

    public static Panel newPanel(boolean notEasy) {
        Panel p = new Panel();
        initRandomArrays(p);
        initRandomClothes(p, notEasy);
        return p;
    }

    public static Panel newPanel(int type) {
        int i = 0;

//      if(type == i++)
//      {
//         ColorArray hairColors;
//ColorArray temp;
//SuperC [] c = new SuperC [6];
//hairColors = util.ColorArrayFactory.getArrayFromColor("m," + 250 + "," + 168 + "," + 68 + "," + 255);
//
//Bd bd = new Bd(new b.h.MediumStraight1(0, 0, null, null, hairColors), true);
//bd.hd.EYE_COLOR = new Color(188,155,99,255);
//bd.hd.EYELASH_COLOR = new Color(0,0,0,255);
//bd.hd.MAKEUP_COLOR = new Color(255,100,100,255);
//
//
//c[0] = new clts.Platz(7, 0);
//
//temp = util.ColorArrayFactory.getArrayFromColor("c," + 153 + "," + 51 + "," + 255 + "," + 255);
//c[0].setColors(temp);
//
//c[1] = new clts.b.Bot2(2);
//
//temp = util.ColorArrayFactory.getArrayFromColor("c," + 153 + "," + 51 + "," + 255 + "," + 255);
//c[1].setColors(temp);
//
//c[2] = new clts.t.l.TopLower8(2);
//
//temp = util.ColorArrayFactory.getArrayFromColor("c," + 153 + "," + 51 + "," + 255 + "," + 255);
//c[2].setColors(temp);
//
//c[3] = new clts.t.u.TopUpper7(bd.sMiddle, 3);
//
//temp = util.ColorArrayFactory.getArrayFromColor("c," + 153 + "," + 51 + "," + 255 + "," + 255);
//c[3].setColors(temp);
//
//c[4] = new clts.s.s.S6();
//
//temp = util.ColorArrayFactory.getArrayFromColor("c," + 153 + "," + 51 + "," + 255 + "," + 255);
//c[4].setColors(temp);
//
//c[5] = new clts.s.as.AS1();
//
//temp = util.ColorArrayFactory.getArrayFromColor("c," + 153 + "," + 51 + "," + 255 + "," + 255);
//c[5].setColors(temp);
//
//return new Panel(c, bd);
//
//    }
        if (type == i++) {

            Panel p = new Panel();
            return p;
        } else {
            return newPanel((int) (Math.random() * i));
        }
    }

    /**
     *@param String creationString - "${size},type=${type},colorScheme=${colorScheme}"
     */
    public static Panel[] newPanelArray(String size) {
        Panel[] retVal = new Panel[Integer.parseInt(size)];

        for (int i = 0; i < retVal.length; i++) {
            util.dFactoryArrays.RandomArrays.setArraysRand(i);
            Panel p = newPanel();

            retVal[i] = p;
        }

        return retVal;
    }

    public static Panel[] newPanelArray(boolean notEasy, int size, Method typeMethod, Method colorMethod, Method accColorMethod) {
        if (size == 1) {
            reset();
        }
        Panel[] retVal = new Panel[size];

        for (int i = 0; i < retVal.length; i++) {
            changeColorScheme(colorMethod, accColorMethod, i);
            Panel p = newPanel(notEasy);
            changeType(p, typeMethod);

            retVal[i] = p;
        }

        return retVal;
    }

    private static void changeType(Panel p, Method typeMethod) {
        if (typeMethod == null || typeMethod.getDeclaringClass().getName().equals("util.dFactoryTypes.Random")) {
            return;
        }
        Object[] params = {p};
        SuperC[] c = {new clts.p.Platz0(5, 0), util.CthsFactory.getRandomShoes()};
        try {
            c = (SuperC[]) typeMethod.invoke(null, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        p.setObjs(c);
        p.objectSetStep(p.stepArray[p.index % p.stepArray.length], p.index);
    }

    private static void changeColorScheme(Method colorMethod, Method accColorMethod, int index) {
        Object[] params = {new Integer(index)};
        try {
            colorMethod.invoke(null, params);
        } catch (Exception ex) {
            System.out.println("declaring Class: " + colorMethod.getDeclaringClass() + "\ncolorMethod: " + colorMethod.getName());
            ex.printStackTrace();
        }

        try {
            accColorMethod.invoke(null, params);
        } catch (Exception ex) {
            System.out.println("declaring Class: " + accColorMethod.getDeclaringClass() + "\ncolorMethod: " + accColorMethod.getName());
            ex.printStackTrace();
        }
        reset = false;
    }

    private static void setArraySize() {
        if (ARRAY_SIZE == -1) {
            ARRAY_SIZE = (int) (Math.random() * MAX_ARRAY_ADDITION) + MIN_ARRAY_SIZE;
        }
    }

    private static void initRandomArrays(Panel p) {
        setArraySize();
        p.stepArray = new int[ARRAY_SIZE];
        int curr = 0;
        for (int i = 0; i < p.stepArray.length; i++) {
            if (p.stepArray.length - 15 < i) {
                if (curr != 0) {
                    curr++;
                    curr = curr % 16;
                }
            } else {
//                if(!(curr == 0 && Math.random() < .8))
//                {
//                    if(!(curr == 8 && Math.random() < .2))
//                        curr++;
//                    curr = curr % 16;
//                }
                if (!(curr == 0 && Math.random() < .05)) {
                    if (!(curr == 8 && Math.random() < .05)) {
                        curr++;
                    }
                    curr = curr % 16;
                }
            }
            p.stepArray[i] = curr;
        }


        p.directionArray = new int[(int) (Math.random() * 5) + 10];
        curr = (int) Math.round(Math.random());
        for (int i = 0; i < p.directionArray.length; i++) {
            if (Math.random() < .1) {
                curr = (int) Math.round(Math.random());
            }
            p.directionArray[i] = curr;
        }

        p.leftArmArray = new int[p.directionArray.length];
        curr = b.LeftArm.choices[(int) (Math.round(Math.random() * (b.LeftArm.choices.length - 1)))];
        for (int i = 0; i < p.leftArmArray.length; i++) {
            if (curr == 0 || curr == 1) {
                if (Math.random() < .1) {
                    curr = b.LeftArm.choices[(int) (Math.round(Math.random() * (b.LeftArm.choices.length - 1)))];
                }
            } else {
                if (curr == 5) {
                    if (Math.random() < .2) {
                        curr = b.LeftArm.choices[(int) (Math.round(Math.random() * (b.LeftArm.choices.length - 1)))];
                    }
                }
            }

            if (curr == 2 || curr == 4 || curr == 6 || curr == 7 || curr == 8 || curr == 9 || curr == 10 || curr == 11) {
                curr = 0;
            }
            p.leftArmArray[i] = curr;
        }

        p.rightArmArray = new int[p.directionArray.length];
        curr = b.RightArm.choices[(int) Math.round(Math.random() * (b.RightArm.choices.length - 1))];
        for (int i = 0; i < p.rightArmArray.length; i++) {
            if (Math.random() < .1) {
                curr = b.RightArm.choices[(int) (Math.round(Math.random() * (b.RightArm.choices.length - 1)))];
            }
            if ((p.directionArray[i] == 0 && curr == 1) || curr == 5 || curr == 6 || curr == 7 || curr == 8 || curr == 9) {
                curr = 0;
            }
            p.rightArmArray[i] = curr;
        }

        p.mouthTeethArray = new int[(int) (Math.random() * 5) + 10];
        curr = (int) Math.round(Math.random());
        for (int i = 0; i < p.mouthTeethArray.length; i++) {
            if (Math.random() < .1) {
                curr = (int) Math.round(Math.random());
            }
            p.mouthTeethArray[i] = curr;
        }

        p.eyebrowsArray = new int[(int) (Math.random() * 5) + 10];
        curr = (int) Math.round(Math.random()) - 1;
        for (int i = 0; i < p.eyebrowsArray.length; i++) {
            if (Math.random() < .1) {
                curr = (int) Math.round(Math.random()) - 1;
            }
            p.eyebrowsArray[i] = curr;
        }

        p.mouthSmileArray = new int[(int) (Math.random() * 5) + 10];
        curr = (int) Math.round(Math.random() * 2);
        for (int i = 0; i < p.mouthSmileArray.length; i++) {
            if (curr == 2) {
                if (Math.random() < .5) {
                    curr = (int) Math.round(Math.random() * 2);
                }
            } else if (Math.random() < .1) {
                curr = (int) Math.round(Math.random() * 2);
            }
            p.mouthSmileArray[i] = curr;
        }

        p.eyesArray = new int[(int) (Math.random() * 5) + 10];
        curr = (int) Math.round(Math.random() * 2);
        for (int i = 0; i < p.eyesArray.length; i++) {
            if (curr == 0) {
                if (Math.random() < .1) {
                    curr = (int) Math.round(Math.random() * 2);
                }
            } else {
                if (Math.random() < .5) {
                    curr = 0;
                }
            }
            p.eyesArray[i] = curr;
        }

        p.inFrontArray = new int[p.directionArray.length];
        curr = (int) Math.round(Math.random());
        for (int i = 0; i < p.inFrontArray.length; i++) {
            p.inFrontArray[i] = curr;
        }
    }

    private static void initRandomClothes(Panel p, boolean notEasy) {
        ColorArray shoesColorArray = tercaryArray.getNewColorArray();
        if (Math.random() > .3) {
            if (Math.random() < .5) {
                shoesColorArray = secondaryArray.getNewColorArray();
            } else {
                shoesColorArray = primaryArray.getNewColorArray();
            }
        }
        ColorArray bottomsColorArray = primaryArray.getNewColorArray();
        if (Math.random() < .5) {
            bottomsColorArray = secondaryArray.getNewColorArray();
        }
        ColorArray topsColorArray = bottomsColorArray.getNewColorArray();
        if (Math.random() < .5) {
            if (Math.random() < .5) {
                topsColorArray = tercaryArray.getNewColorArray();
            } else {
                topsColorArray = shoesColorArray.getNewColorArray();
            }
        }

        SuperTU tu = (SuperTU) CthsFactory.getRandomTopUpper(p.b.getMiddle(), topsColorArray.getNewColorArray());
        SuperTL tl = (SuperTL) CthsFactory.getRandomTopLower(tu, topsColorArray.getNewColorArray());
        SuperB b = (SuperB) CthsFactory.getRandomBottoms(tu, tl, bottomsColorArray.getNewColorArray());
        SuperS sh = (SuperS) CthsFactory.getRandomShoes(tu, tl, b, shoesColorArray.getNewColorArray());
        SuperC as = CthsFactory.getRandomAnkleStraps(tu, tl, b, sh, shoesColorArray.getNewColorArray());
        SuperC pl = (SuperC) CthsFactory.getRandomPlatz(tu, tl, b, sh, shoesColorArray.getNewColorArray());
        SuperC so = (SuperC) CthsFactory.getRandomSocks(tu, tl, b, sh, topsColorArray.getNewColorArray());

        ColorArray colorArray = ColorArrayFactory.getMakeupArray();
        SuperC mu = (SuperC) CthsFactory.getRandomMU(colorArray);

        if (b.jean) {
            b.setColors(accPrimaryArray.getNewColorArray());
        }
        ArrayList al = new ArrayList();

        al.add(tu);
        SuperC temp = CthsFactory.getRecommendedAccessory(tu, topsColorArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }
        al.add(tl);
        temp = CthsFactory.getRecommendedAccessory(tl, topsColorArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }
        al.add(b);
        temp = CthsFactory.getRecommendedAccessory(b, bottomsColorArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }
        al.add(as);
        al.add(sh);
        temp = CthsFactory.getRecommendedAccessory(sh, shoesColorArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }
        temp = CthsFactory.getRecommendedAccessory(as, DFactory.accPrimaryArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }
        al.add(pl);
        al.add(mu);
        temp = CthsFactory.getRecommendedAccessory(mu, tercaryArray.getNewColorArray());
        if (temp != null) {
            al.add(temp);
        }
        al.add(so);

        for (int j = 0; j < al.size(); j++) {
            if (al.get(j) instanceof clts.Blank || al.get(j) instanceof clts.BlankTL || al.get(j) instanceof clts.BlankB) {
                al.remove(j);
                j--;
            } else {
                if (((SuperC) al.get(j)).noWalk) {
                    for (int k = 0; k < p.stepArray.length; k++) {
                        p.stepArray[k] = 0;
                    }
                    al.remove(so);
                    al.remove(as);
                    al.remove(sh);
                    al.remove(pl);
                    pl = new clts.p.Platz3(0, 0);
                    al.add(pl);
                }
            }
        }

        if (((clts.SuperP) pl).getHeight() > 5) {
            int legLength = (int) Math.round(Math.random() * 3);
            int legPos = (int) Math.round(Math.random() * 1);
            ((clts.SuperP) pl).setHeight(((clts.SuperP) pl).getHeight() - (legLength + legPos));
            p.getB().setLegLength(legLength);
            p.getB().setLegPosition(legPos);
        }

        SuperC[] tempObjs = new SuperC[al.size()];
        for (int j = 0; j < al.size(); j++) {
            if (al.get(j) instanceof SuperTU || al.get(j) instanceof SuperTL) {
                checkArms(p, (SuperC) al.get(j));
            }
            checkLegs(p, (SuperC) al.get(j));
            tempObjs[j] = (SuperC) al.get(j);
        }

        p.setObjs(tempObjs);
        Paintable[] objs = new Paintable[p.getObjs().length + 1];
        for (int i = 0; i < p.getObjs().length; i++) {
            objs[i + 1] = p.getObjs()[i];
        }
        objs[0] = CthsFactory.getRandomHair(ColorArrayFactory.getHairArray());
        p.setObjs(objs);
        p.objectSetStep(p.stepArray[p.index % p.stepArray.length], p.index);

    }

    public static void checkLegs(Panel p, SuperC cl) {
        if (cl.legLength != -1) {
            if(cl.legLength < p.b.getLegLength())
            {
                p.b.setLegLength(cl.legLength);
            }
        }
        if (cl.legPos != -1) {
            if(cl.legPos < p.b.getLegPosition())
            {
                p.b.setLegPosition(cl.legPos);
            }
        }
    }

    public static void checkArms(Panel p, SuperC cl) {
        Method[] methods = cl.getClass().getMethods();

        boolean cont = false;
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().startsWith("drawSleeves")) {
                cont = true;
                break;
            }
        }

        if (!cont) {
            return;
        }
        boolean[] left = new boolean[b.LeftArm.choices.length];
        for (int i = 0; i < left.length; i++) {
            left[i] = false;
        }
        boolean[] right = new boolean[b.RightArm.choices.length];
        for (int i = 0; i < right.length; i++) {
            right[i] = false;
        }
        boolean containsRight = false;
        boolean containsLeft = false;

        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().startsWith("drawSleevesLeft")) {
                containsLeft = true;
                left[Integer.parseInt(methods[i].getName().substring(methods[i].getName().lastIndexOf("t") + 1))] = true;
            } else if (methods[i].getName().startsWith("drawSleevesRight")) {
                containsRight = true;
                right[Integer.parseInt(methods[i].getName().substring(methods[i].getName().lastIndexOf("t") + 1))] = true;
            }
        }

        for (int i = 0; i < p.leftArmArray.length && containsLeft; i++) {
            try {
                if (!left[p.leftArmArray[i]]) {
                    if (i == 0) {
                        int j = left.length - 1;
                        for (; j >= 0; j--) {
                            if (left[j]) {
                                break;
                            }
                        }
                        p.leftArmArray[0] = j;
                    } else {
                        p.leftArmArray[i] = p.leftArmArray[i - 1];
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                if (i == 0) {
                    int j = left.length - 1;
                    for (; j >= 0; j--) {
                        if (left[j]) {
                            break;
                        }
                    }
                    p.leftArmArray[0] = j;
                } else {
                    p.leftArmArray[i] = p.leftArmArray[i - 1];
                }
            }
        }

        for (int i = 0; i < p.rightArmArray.length && containsRight; i++) {
            try {
                if (!right[p.rightArmArray[i]]) {
                    if (i == 0) {
                        int j = right.length - 1;
                        for (; j >= 0; j--) {
                            if (right[j]) {
                                break;
                            }
                        }
                        p.rightArmArray[0] = j;
                    } else {
                        p.rightArmArray[i] = p.rightArmArray[i - 1];
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                if (i == 0) {
                    int j = right.length - 1;
                    for (; j >= 0; j--) {
                        if (right[j]) {
                            break;
                        }
                    }
                    p.rightArmArray[0] = j;
                } else {
                    p.rightArmArray[i] = p.rightArmArray[i - 1];
                }
            }
        }

    }

    public static void reset() {
        primaryArray = null;
        primaryC = null;
        hrArray = null;
        reset = true;
        ARRAY_SIZE = -1;
        RAND_ONE = -1;
    }
}
