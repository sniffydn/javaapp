/*
 * Created on March 8, 2007, 9:25 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package util;

import clts.*;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author doubleD
 */
public class CthsFactory {

    public static ColorArray COLORS = null;
    public static String DIR = "build/classes/clts/";

    private CthsFactory() {
    }

    public static void initColorArray() {
        if (COLORS == null) {
            COLORS = ColorArrayFactory.getArray(999);
        }
    }

    public static SuperC getRecommendedAccessory(SuperC c, ColorArray colors) {
        SuperC retVal = null;
        try {
            Method[] temp = c.getClass().getMethods();
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].getName().equalsIgnoreCase("getRecommendedAccessory")) {
                    Object[] oa = {colors};
                    retVal = (SuperC) temp[i].invoke(c, oa);
                    break;
                }
            }
        } catch (Exception e) {
        }
        return retVal;
    }

    public static SuperC[] getAllClts(String folder) {
        String forClass = folder.replaceAll("/", ".");
        File dir = new File("build/classes/clts/" + folder);

        String[] children = getFiles(dir);
        if (children == null) {
            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
        }

        SuperC[] retVal = new SuperC[children.length];
        int i = 0;

        try {
            for (; i < retVal.length; i++) {
                Class[] classParm = null;
                Object[] objectParm = null;
                Class c = Class.forName("clts." + forClass + "." + children[i].substring(0, children[i].indexOf(".")));
                java.lang.reflect.Constructor co = c.getConstructor(classParm);
                retVal[i] = (SuperC) co.newInstance(objectParm);
            }

        } catch (Exception ex) {
            System.out.println("ERROR - retVal[i]:" + retVal[i] + "\nretVal.length:" + retVal.length + "\ni:" + i);
            System.out.println("In Folder: " + folder);
            ex.printStackTrace();
        }

        return retVal;
    }

    public static SuperC[] getAllShoes() {
        return getAllClts("s/s");
    }

    public static SuperC getRandomShoes() {
        SuperC[] temp = CthsFactory.getAllShoes();
        SuperS s = (SuperS) temp[(int) (Math.random() * temp.length)];
        return s;
    }

    public static SuperS getRandomShoes(SuperTU topUpper, SuperTL topLower, SuperB bottoms, ColorArray colors) {
        if (bottoms.noWalk) {
            return new clts.BlankS();
        }
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
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }

        SuperS s = (SuperS) temp[(int) (Math.random() * temp.length)];

        s.setColors(colors);

        return s;
    }
    
    public static SuperC[] getAllSocks(){
        return getAllClts("s/so");
    }
    
    public static SuperC getRandomSocks(SuperTU topUpper, SuperTL topLower, SuperB bottoms, SuperS shoe, ColorArray colors) {
        if (Math.random() < .5 || bottoms.noWalk) {
            return new clts.Blank();
        }

        SuperC[] temp = CthsFactory.getAllSocks();

        ArrayList al = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }
        SuperS s = (SuperS) temp[(int) (Math.random() * temp.length)];

        s.setColors(colors);

        return s;
    }

    public static SuperC[] getAllAnkleStraps() {

        return getAllClts("s/as");
//        File dir = new File("build/classes/clts/s/as");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = new SuperC[children.length];
//
//        try {
//            for (int i = 0; i < retVal.length; i++) {
//                Class[] classParm = null;
//                Object[] objectParm = null;
//                Class c = Class.forName("clts.s.as." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                retVal[i] = (SuperC) co.newInstance(objectParm);
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperC getRandomAnkleStraps(SuperTU topUpper, SuperTL topLower, SuperB bottoms, SuperS shoe, ColorArray colors) {
        if (Math.random() < .5 || bottoms.noWalk) {
            return new clts.Blank();
        }

        SuperC[] temp = CthsFactory.getAllAnkleStraps();

        if (!shoe.strapAllowed) {
            ArrayList al = new ArrayList();
            for (int i = 0; i < temp.length; i++) {
                if (!((SuperS) temp[i]).strap) {
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
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }
        SuperS s = (SuperS) temp[(int) (Math.random() * temp.length)];

        s.setColors(colors);

        return s;
    }

    public static SuperC[] getAllBottoms() {

        return getAllClts("b");

//        File dir = new File("build/classes/clts/b");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = new SuperC[children.length];
//
//        try {
//            for (int i = 0; i < retVal.length; i++) {
//                Class[] classParm = null;
//                Object[] objectParm = null;
//                Class c = Class.forName("clts.b." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                retVal[i] = (SuperC) co.newInstance(objectParm);
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperB getRandomBottoms(SuperTU topUpper, SuperTL topLower, ColorArray colors) {
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
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }

        SuperB b = (SuperB) temp[(int) (Math.random() * temp.length)];

        b.setColors(colors);

        return b;
    }

    private static SuperC[] filterMiddle(String sMiddle, SuperC[] array)
    {
        try {
            ArrayList temp = new ArrayList();
            for (int i = 0; i < array.length; i++) {
                boolean add = false;
                Method[] methods = array[i].getClass().getMethods();
                for (int j = 0; j < methods.length; j++) {
                    if (methods[j].getName().equalsIgnoreCase("draw" + sMiddle)) {
                        add = true;
                    }
                }

                if (add) {
                    temp.add(array[i]);
                }
            }

            array = new SuperC[temp.size()];
            for (int i = 0; i < array.length; i++) {
                array[i] = (SuperC) temp.get(i);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return array;
    }
    
    private static SuperC[] filerIncludeInAutoPick(SuperC[] array)
    {
        return array;
    }
    
    public static SuperC[] getAllShirts(String sMiddle) {

        return filterMiddle(sMiddle, getAllClts("t/u/s"));
        


//        File dir = new File("build/classes/clts/t/u/s");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = null;
//        ArrayList temp = new ArrayList();
//
//        try {
//            for (int i = 0; i < children.length; i++) {
//                Class[] classParm = null;
//                Object[] objectParm = null;
//                Class c = Class.forName("clts.t.u.s." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                SuperC tempC = (SuperC) co.newInstance(objectParm);
//
//                boolean add = false;
//                Method[] methods = tempC.getClass().getMethods();
//                for (int j = 0; j < methods.length; j++) {
//                    if (methods[j].getName().equalsIgnoreCase("draw" + sMiddle)) {
//                        add = true;
//                    }
//                }
//
//                if (add) {
//                    temp.add(tempC);
//                }
//            }
//
//            retVal = new SuperC[temp.size()];
//            for (int i = 0; i < retVal.length; i++) {
//                retVal[i] = (SuperC) temp.get(i);
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperC[] getAllDresses(String sMiddle) {
        
        
        return filterMiddle(sMiddle, getAllClts("t/u/d"));
//        File dir = new File("build/classes/clts/t/u/d");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = null;
//        ArrayList temp = new ArrayList();
//
//        try {
//            for (int i = 0; i < children.length; i++) {
//                Class[] classParm = null;
//                Object[] objectParm = null;
//                Class c = Class.forName("clts.t.u.d." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                SuperC tempC = (SuperC) co.newInstance(objectParm);
//
//                boolean add = false;
//                Method[] methods = tempC.getClass().getMethods();
//                for (int j = 0; j < methods.length; j++) {
//                    if (methods[j].getName().equalsIgnoreCase("draw" + sMiddle)) {
//                        add = true;
//                    }
//                }
//
//                if (add) {
//                    temp.add(tempC);
//                }
//            }
//
//            retVal = new SuperC[temp.size()];
//            for (int i = 0; i < retVal.length; i++) {
//                retVal[i] = (SuperC) temp.get(i);
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperC[] getAllTopUppers(String sMiddle) {
        
        return filterMiddle(sMiddle, getAllClts("t/u"));
//        File dir = new File("build/classes/clts/t/u");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = null;
//        ArrayList temp = new ArrayList();
//
//        try {
//            for (int i = 0; i < children.length; i++) {
//                Class[] classParm = null;
//                Object[] objectParm = null;
//                Class c = Class.forName("clts.t.u." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                SuperC tempC = (SuperC) co.newInstance(objectParm);
//
//                boolean add = false;
//                Method[] methods = tempC.getClass().getMethods();
//                for (int j = 0; j < methods.length; j++) {
//                    if (methods[j].getName().equalsIgnoreCase("draw" + sMiddle)) {
//                        add = true;
//                    }
//                }
//
//                if (add) {
//                    temp.add(tempC);
//                }
//            }
//
//
//
//            retVal = new SuperC[temp.size()];
//            for (int i = 0; i < retVal.length; i++) {
//                retVal[i] = (SuperC) temp.get(i);
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperC getRandomTopUpper(String middle, ColorArray colors) {
        SuperC[] temp = CthsFactory.getAllTopUppers(middle);

        ArrayList al = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = CthsFactory.getAllShirts(middle);

        for (int i = 0; i < temp.length; i++) {
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = CthsFactory.getAllDresses(middle);

        for (int i = 0; i < temp.length; i++) {
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }

        SuperTU tu = (SuperTU) temp[(int) (Math.random() * temp.length)];

        tu.setMiddle(middle);
        tu.setColors(colors);

        return tu;
    }

    public static SuperC[] getAllTopUppersAcc() {
        
        return getAllClts("t/u/a");
//        File dir = new File("build/classes/clts/t/u/a");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = new SuperC[children.length];
//
//        try {
//            for (int i = 0; i < retVal.length; i++) {
//                Class[] classParm = null;
//                Object[] objectParm = null;
//                Class c = Class.forName("clts.t.u.a." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                retVal[i] = (SuperC) co.newInstance(objectParm);
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperC[] getAllTopLowers() {
        return getAllClts("t/l");
//        File dir = new File("build/classes/clts/t/l");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = new SuperC[children.length];
//
//        try {
//            for (int i = 0; i < retVal.length; i++) {
//                Class[] classParm = null;
//                Object[] objectParm = null;
//                Class c = Class.forName("clts.t.l." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                retVal[i] = (SuperC) co.newInstance(objectParm);
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperTL getRandomTopLower(SuperTU topUpper, ColorArray colors) {
        if (topUpper.containsTL) {
            return new clts.BlankTL();
        }

        SuperTL tl = new clts.BlankTL();

        SuperC[] temp = CthsFactory.getAllTopLowers();

        if (topUpper.shuni) {
            ArrayList al = new ArrayList();
            for (int i = 0; i < temp.length; i++) {
                if (!temp[i].prep) {
                    al.add(temp[i]);
                }
            }

            temp = new SuperC[al.size()];

            for (int i = 0; i < temp.length; i++) {
                temp[i] = (SuperC) al.get(i);
            }
        } else if (topUpper.prep) {
            ArrayList al = new ArrayList();
            for (int i = 0; i < temp.length; i++) {
                if (!temp[i].shuni) {
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
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }

        SuperC tempTl = null;
        try {
            tempTl = temp[(int) (Math.random() * temp.length)];
            tl = (SuperTL) tempTl;
        } catch (Exception e) {
            System.out.println("Exception in CthsFactory: " + e);
            System.out.println("\t" + tempTl + "\n\t" + tempTl.getClass());
        }

        tl.setColors(colors);

        return tl;
    }

    public static String[] getFiles(File dir) {
        File[] temp = dir.listFiles();
        java.util.Vector v = new java.util.Vector();
        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].isDirectory()) {
                v.add(temp[i].getName());
            }
        }
        String[] retVal = new String[v.size()];
        for (int i = 0; i < v.size(); i++) {
            retVal[i] = "" + v.elementAt(i);
        }

        return retVal;
    }

    public static SuperC[] getAllPlatz() {
        return getAllClts("p");
//        File dir = new File("build/classes/clts/p");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = new SuperC[children.length];
//
//        try {
//            for (int i = 0; i < retVal.length; i++) {
//                Class[] classParm = {String.class, String.class};
//                Object[] objectParm = {"5", "0"};
//                Class c = Class.forName("clts.p." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                retVal[i] = (SuperC) co.newInstance(objectParm);
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperC getRandomPlatz(SuperTU topUpper, SuperTL topLower, SuperB bottoms, SuperS shoe, ColorArray colors) {
        if (bottoms.noWalk) {
            return new clts.p.Platz3(0);
        }
        SuperC[] temp = CthsFactory.getAllPlatz();

        ArrayList al = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }

        SuperP p = (SuperP) temp[(int) (Math.random() * temp.length)];

        p.setColors(colors);

        if (topUpper.platzHeight != -1) {
            p.setHeight(topUpper.platzHeight);
        } else if (topLower.platzHeight != -1) {
            p.setHeight(topLower.platzHeight);
        } else if (bottoms.platzHeight != -1) {
            p.setHeight(bottoms.platzHeight);
        } else {
            p.setHeight((int) (Math.random() * (shoe.upperPlatzHeight - shoe.lowerPlatzHeight)) + shoe.lowerPlatzHeight);
        }

        return p;
    }

    public static SuperC[] getAllBottomAccessorys() {
        return getAllClts("b/a");
//        File dir = new File("build/classes/clts/b/a");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = new SuperC[children.length];
//
//        try {
//            for (int i = 0; i < retVal.length; i++) {
//                Class[] classParm = null;
//                Object[] objectParm = null;
//                Class c = Class.forName("clts.b.a." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                retVal[i] = (SuperC) co.newInstance(objectParm);
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperC getRandomBottomAccessory(SuperB bottoms, ColorArray colors) {
        SuperC[] temp = CthsFactory.getAllBottomAccessorys();

        if (bottoms.slenderB) {
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
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }

        SuperC b = (SuperC) temp[(int) (Math.random() * temp.length)];

        b.setColors(colors);

        return b;
    }
    
    public static SuperC[] getAllMU() {
        return getAllClts("h/mu");
    }
    
    public static SuperC getRandomMU(ColorArray colors) {
        SuperC[] temp = CthsFactory.getAllMU();

        ArrayList al = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }

        SuperC b = (SuperC) temp[(int) (Math.random() * temp.length)];

        b.setColors(colors);

        return b;
    }

    public static SuperC[] getAllHats() {
        
        return getAllClts("h");
//        File dir = new File("build/classes/clts/h");
//
//        String[] children = getFiles(dir);
//        if (children == null) {
//            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
//        }
//
//        SuperC[] retVal = new SuperC[children.length];
//
//        try {
//            for (int i = 0; i < retVal.length; i++) {
//                Class[] classParm = null;
//                Object[] objectParm = null;
//                Class c = Class.forName("clts.h." + children[i].substring(0, children[i].indexOf(".")));
//                java.lang.reflect.Constructor co = c.getConstructor(classParm);
//                retVal[i] = (SuperC) co.newInstance(objectParm);
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (NoSuchMethodException ex) {
//            ex.printStackTrace();
//        } catch (java.lang.reflect.InvocationTargetException ex) {
//            ex.printStackTrace();
//        }
//
//        return retVal;
    }

    public static SuperC getRandomHat(ColorArray colors) {
        SuperC[] temp = CthsFactory.getAllHats();

        ArrayList al = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            if (((SuperC) temp[i]).includeInAutoPick) {
                al.add(temp[i]);
            }
        }

        temp = new SuperC[al.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (SuperC) al.get(i);
        }

        SuperC b = (SuperC) temp[(int) (Math.random() * temp.length)];

        b.setColors(colors);

        return b;
    }

    public static SuperH getRandomHair(ColorArray colors) {
        SuperH[] temp = getAllHair(colors);
        return temp[(int) (Math.random() * temp.length)];
    }

    public static SuperH[] getAllHair(ColorArray c) {
        SuperH[] retVal = getAllHair();
        for (int i = 0; i < retVal.length; i++) {
            retVal[i].setColors(c);
        }
        return retVal;
    }

    public static SuperH[] getAllHair() {
        File dir = new File("build/classes/b/h");

        String[] children = CthsFactory.getFiles(dir);
        if (children == null) {
            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
        }

        SuperH[] retVal = new SuperH[children.length];

        try {
            for (int i = 0; i < retVal.length; i++) {
                Class[] classParm = null;
                Object[] objectParm = null;
                Class c = Class.forName("b.h." + children[i].substring(0, children[i].indexOf(".")));
                java.lang.reflect.Constructor co = c.getConstructor(classParm);
                retVal[i] = (SuperH) co.newInstance(objectParm);
            }

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (NoSuchMethodException ex) {
            ex.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException ex) {
            ex.printStackTrace();
        }

        return retVal;
    }
}
