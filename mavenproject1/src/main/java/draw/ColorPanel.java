/*
 * ColorPanel.java
 *
 * Created on October 24, 2008, 12:47 PM
 */

package draw;

import util.Color;

/**
 *
 * @author  nyffeldd
 */
public class ColorPanel extends javax.swing.JPanel {
    Color [] colors = new Color[1];
    /** Creates new form ColorPanel */
    public ColorPanel(Color color) {
        initComponents();
        jLabel1.setText(" ");
        colors[0] = color;
        this.setBackground(colors[0].getColor());
        float [] temp = java.awt.Color.RGBtoHSB(colors[0].getRed(), colors[0].getGreen(), colors[0].getBlue(), null);
        this.setForeground(java.awt.Color.getHSBColor(temp[0], temp[1], temp[2] + .5f));
    }
    
    public ColorPanel(Color [] color, int i) {
        initComponents();
        colors = color;
        this.setBackground(colors[0].getColor());
        jLabel1.setText("" + i);
        float [] temp = java.awt.Color.RGBtoHSB(colors[0].getRed(), colors[0].getGreen(), colors[0].getBlue(), null);
        this.setForeground(java.awt.Color.getHSBColor(temp[0], temp[1], temp[2] + 1f));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("+");
        add(jLabel1);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
