/*
 * SelectionHelperPanel.java
 *
 * Created on May 15, 2007, 1:24 PM
 */

package draw;

import clts.Paintable;
import java.awt.Graphics;
import java.awt.Graphics2D;
import util.SecondaryGraphicsMap;

/**
 *
 * @author  doubleD
 */
public class SelectionHelperPanel extends javax.swing.JPanel {

    public Paintable objs = null;
    public int index = -1;
    /** Creates new form SelectionHelperPanel */
    public SelectionHelperPanel(int i, Paintable o) {
        initComponents();
        objs = o;
        index = i;
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        SecondaryGraphicsMap g2d = new SecondaryGraphicsMap((Graphics2D)g);
        objs.paintVeryFront(-70, 0, g2d);
        objs.paintStationaryFront(-70, 0, g2d);
        objs.paintFront(-70, 0, g2d);
        objs.paintMiddle(-70, 0, g2d);
        objs.paintBack(-55, 0, g2d);
        objs.paintVeryBack(-70, 0, g2d);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 118, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
