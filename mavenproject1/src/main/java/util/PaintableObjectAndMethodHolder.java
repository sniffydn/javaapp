/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author nyffeldd
 */
public class PaintableObjectAndMethodHolder implements Comparable {

    private double rank = 0;
    clts.Paintable paintable;
    java.lang.reflect.Method method;

    public PaintableObjectAndMethodHolder(clts.Paintable p, java.lang.reflect.Method m, draw.Panel panel) {
        paintable = p;
        method = m;
        if (method.getName().equals("paintVeryBack")) {
            if (p instanceof clts.SuperH) {
                rank = 500000000.5;
            } else if (p instanceof b.Bd) {
                rank = 500000000.4;
            } else {
                rank = 500000000 + panel.POAMHcounter++;
            }
        } else if (method.getName().equals("paintBack")) {
            if (p instanceof clts.SuperH) {
                rank = 500000000.3;
            } else if (p instanceof clts.SuperMU) {
                rank = 500000000.35;
            } else if (p instanceof clts.h.mu.MakeUnder) {
                rank = 500000000.36;
            } else  if (p instanceof b.Bd) {
                rank = 500000000.2;
            } else {
                rank = 400000000 + panel.POAMHcounter++;
            }
        } else if (method.getName().equals("paintMiddle")) {
            if (p instanceof clts.SuperH) {
                rank = 400000000.2;
            } else if (p instanceof clts.SuperMU) {
                rank = 400000000.25;
            } else if (p instanceof b.Bd) {
                rank = 400000000.1;
            } else {
                rank = 300000000 + panel.POAMHcounter++;
            }
        } else if (method.getName().equals("paintFront")) {
            if (p instanceof clts.SuperH) {
                rank = 300000000.2;
            } else if (p instanceof clts.SuperMU) {
                rank = 300000000.25;
            } else if (p instanceof b.Bd) {
                rank = 300000000.1;
            } else {
                rank = 200000000 + panel.POAMHcounter++;
            }
        } else if (method.getName().equals("paintStationaryFront")) {
            if (p instanceof clts.SuperH) {
                rank = 200000000.2;
            } else if (p instanceof b.Bd) {
                rank = 200000000.1;
            } else {
                rank = 100000000 + panel.POAMHcounter++;
            }
        } else if (method.getName().equals("paintVeryFront")) {
            if (p instanceof clts.SuperH) {
                rank = 100000000.2;
            } else if (p instanceof clts.SuperMU) {
                rank = 100000000.25;
            } else if (p instanceof b.Bd) {
                rank = 100000000.1;
            } else {
                rank = 0 + panel.POAMHcounter++;
            }
        }
    }

    public int compareTo(Object o) {

        double diff = this.getRank() - ((PaintableObjectAndMethodHolder) o).getRank();
        if (diff < 0) {
            return -1;
        } else if (diff > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public void invoke(Object[] args) {
        try {
            method.invoke(paintable, args);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String toString() {
        return paintable + " " + method.getName();
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }
}
/*
public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d) {
public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
 * */
