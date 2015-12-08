/*
 * ColorArrayModifier.java
 *
 * Created on October 24, 2008, 11:24 AM
 */
package draw;

import draw.*;
import java.awt.Color;
import javax.swing.JPanel;
import util.ColorArray;
import util.ColorArrayFactory;
import util.DFactory;
import util.GetAndSetMethodHolder;

/**
 *
 * @author  nyffeldd
 */
public class ColorArrayModifier extends javax.swing.JPanel {

    ColorArray colors;
    GetAndSetMethodHolder methods;

    /** Creates new form ColorArrayModifier */
    public ColorArrayModifier(GetAndSetMethodHolder methods) {
        initComponents();
        colors = (ColorArray) methods.get();
        sizeSpinner.setValue(20);
        alphaSpinner.setValue(new Integer(255));
        hSpinner1.setValue(360);
        sSpinner1.setValue(100);
        bSpinner1.setValue(100);
        typeBox.setModel(new javax.swing.DefaultComboBoxModel(ColorArrayFactory.types));
        typeBox.setSelectedItem("m");
        colors = (ColorArray) methods.get();
        resetPanels();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        northPanel = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        westPanel = new javax.swing.JPanel();
        cycle1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sizeSpinner = new javax.swing.JSpinner();
        cycle2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        sSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        bSpinner = new javax.swing.JSpinner();
        cycle3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        hSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        sSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        bSpinner1 = new javax.swing.JSpinner();
        opacity = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        alphaSpinner = new javax.swing.JSpinner();
        typeBox = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayPanel = new javax.swing.JPanel();

        jFrame1.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        setLayout(new java.awt.BorderLayout());

        jButton8.setText("pri");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        northPanel.add(jButton8);

        jButton7.setText("sec");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        northPanel.add(jButton7);

        jButton6.setText("ter");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        northPanel.add(jButton6);

        jButton4.setText("accPri");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        northPanel.add(jButton4);

        jButton5.setText("accSec");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        northPanel.add(jButton5);

        jButton3.setText("accTer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        northPanel.add(jButton3);

        jToggleButton1.setText("set Stored Array");
        northPanel.add(jToggleButton1);

        add(northPanel, java.awt.BorderLayout.PAGE_START);

        westPanel.setLayout(new java.awt.GridLayout(0, 1));

        jLabel5.setText("Size:");
        cycle1.add(jLabel5);

        sizeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sizeSpinnerStateChanged(evt);
            }
        });
        cycle1.add(sizeSpinner);

        westPanel.add(cycle1);

        cycle2.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setText("Hue:");
        cycle2.add(jLabel1);

        hSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hSpinnerStateChanged(evt);
            }
        });
        cycle2.add(hSpinner);

        jLabel2.setText("Sat:");
        cycle2.add(jLabel2);

        sSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sSpinnerStateChanged(evt);
            }
        });
        cycle2.add(sSpinner);

        jLabel3.setText("Bri:");
        cycle2.add(jLabel3);

        bSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bSpinnerStateChanged(evt);
            }
        });
        cycle2.add(bSpinner);

        westPanel.add(cycle2);

        cycle3.setLayout(new java.awt.GridLayout(0, 2));

        jLabel4.setText("Hue:");
        cycle3.add(jLabel4);

        hSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hSpinner1StateChanged(evt);
            }
        });
        cycle3.add(hSpinner1);

        jLabel7.setText("Sat:");
        cycle3.add(jLabel7);

        sSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sSpinner1StateChanged(evt);
            }
        });
        cycle3.add(sSpinner1);

        jLabel6.setText("Bri:");
        cycle3.add(jLabel6);

        bSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bSpinner1StateChanged(evt);
            }
        });
        cycle3.add(bSpinner1);

        westPanel.add(cycle3);

        jLabel8.setText("Opacity:");
        opacity.add(jLabel8);

        alphaSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                alphaSpinnerStateChanged(evt);
            }
        });
        opacity.add(alphaSpinner);

        westPanel.add(opacity);

        typeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        westPanel.add(typeBox);

        jTextField1.setText("999");
        westPanel.add(jTextField1);

        jButton2.setText("New Array");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        westPanel.add(jButton2);

        add(westPanel, java.awt.BorderLayout.WEST);

        displayPanel.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(displayPanel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!jToggleButton1.isSelected()) {
            colors.setArray(DFactory.primaryArray.getNewColorArray());
            resetPanels();
            try {
                Main.moveTo.setSelected(false);
            } catch (Exception e) {
            }
        } else {
            DFactory.primaryArray = colors.getNewColorArray();
            jToggleButton1.setSelected(false);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!jToggleButton1.isSelected()) {
            colors.setArray(DFactory.secondaryArray.getNewColorArray());
            resetPanels();
            try {
                Main.moveTo.setSelected(false);
            } catch (Exception e) {
            }
        } else {
            DFactory.secondaryArray = colors.getNewColorArray();
            jToggleButton1.setSelected(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!jToggleButton1.isSelected()) {
            colors.setArray(DFactory.tercaryArray.getNewColorArray());
            resetPanels();
            try {
                Main.moveTo.setSelected(false);
            } catch (Exception e) {
            }
        } else {
            DFactory.tercaryArray = colors.getNewColorArray();
            jToggleButton1.setSelected(false);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!jToggleButton1.isSelected()) {
            colors.setArray(DFactory.accPrimaryArray.getNewColorArray());
            resetPanels();
            try {
                Main.moveTo.setSelected(false);
            } catch (Exception e) {
            }
        } else {
            DFactory.accPrimaryArray = colors.getNewColorArray();
            jToggleButton1.setSelected(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!jToggleButton1.isSelected()) {
            colors.setArray(DFactory.accSecondaryArray.getNewColorArray());
            resetPanels();
            try {
                Main.moveTo.setSelected(false);
            } catch (Exception e) {
            }
        } else {
            DFactory.accSecondaryArray = colors.getNewColorArray();
            jToggleButton1.setSelected(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!jToggleButton1.isSelected()) {
            colors.setArray(DFactory.accTercaryArray.getNewColorArray());
            resetPanels();
            try {
                Main.moveTo.setSelected(false);
            } catch (Exception e) {
            }
        } else {
            DFactory.accTercaryArray = colors.getNewColorArray();
            jToggleButton1.setSelected(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setField(typeBox.getSelectedItem() + "");

        ColorArray temp = null;
        temp = util.ColorArrayFactory.getArray(jTextField1.getText());
        colors.setArray(temp);

        resetPanels();
        try {
            Main.show = true;
            Main.moveTo.setSelected(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void alphaSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_alphaSpinnerStateChanged
        int a = Integer.parseInt(alphaSpinner.getValue() + "");
        if (a > 255) {
            a = 255;
            alphaSpinner.setValue(new Integer(a));
        }
        if (a < 0) {
            a = 0;
            alphaSpinner.setValue(new Integer(a));
        }
    }//GEN-LAST:event_alphaSpinnerStateChanged

    private void resetPreview() {
        ColorArray temp = ColorArrayFactory.getCyclingColorArray(typeBox.getSelectedItem() + "",
                Integer.parseInt(sizeSpinner.getValue() + ""),
                Integer.parseInt("" + hSpinner1.getValue()),
                Integer.parseInt("" + hSpinner.getValue()),
                Integer.parseInt("" + sSpinner1.getValue()),
                Integer.parseInt("" + sSpinner.getValue()),
                Integer.parseInt("" + bSpinner1.getValue()),
                Integer.parseInt("" + bSpinner.getValue()),
                Integer.parseInt(alphaSpinner.getValue() + ""));


        colors.setArray(temp);
        resetPanels();
    }

    private void sizeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sizeSpinnerStateChanged
        resetPreview();
    }//GEN-LAST:event_sizeSpinnerStateChanged

    private void hSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hSpinnerStateChanged
        resetPreview();
    }//GEN-LAST:event_hSpinnerStateChanged

    private void sSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sSpinnerStateChanged
        resetPreview();
    }//GEN-LAST:event_sSpinnerStateChanged

    private void bSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bSpinnerStateChanged
        resetPreview();
    }//GEN-LAST:event_bSpinnerStateChanged

    private void bSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bSpinner1StateChanged
        resetPreview();
    }//GEN-LAST:event_bSpinner1StateChanged

    private void sSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sSpinner1StateChanged
        resetPreview();
    }//GEN-LAST:event_sSpinner1StateChanged

    private void hSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hSpinner1StateChanged
        resetPreview();
    }//GEN-LAST:event_hSpinner1StateChanged

    private void setField(String s) {
        Color c = Color.getHSBColor(Integer.parseInt(hSpinner.getValue() + "") / 360f, Integer.parseInt(sSpinner.getValue() + "") / 100f, Integer.parseInt(bSpinner.getValue() + "") / 100f);
        jTextField1.setText(s + "," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + "," + alphaSpinner.getValue());
        jTextField1.repaint();
    }

    private void resetPanels() {
        displayPanel.setVisible(false);
        displayPanel.removeAll();
        int size = colors.getSize();
        JPanel temp = new JPanel();
        temp.setLayout(new java.awt.GridLayout(0, 1));

        for (int i = 0; i < colors.getLength(); i++) {
            util.Color c = colors.get(i);
            javax.swing.JPanel tempL = new javax.swing.JPanel();
            tempL.setLayout(new java.awt.GridLayout(0, 1));
            tempL.setBackground(c.getColor());
            temp.add(tempL);
        }

        displayPanel.add(temp);

        displayPanel.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner alphaSpinner;
    private javax.swing.JSpinner bSpinner;
    private javax.swing.JSpinner bSpinner1;
    private javax.swing.JPanel cycle1;
    private javax.swing.JPanel cycle2;
    private javax.swing.JPanel cycle3;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JSpinner hSpinner;
    private javax.swing.JSpinner hSpinner1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel northPanel;
    private javax.swing.JPanel opacity;
    private javax.swing.JSpinner sSpinner;
    private javax.swing.JSpinner sSpinner1;
    private javax.swing.JSpinner sizeSpinner;
    private javax.swing.JComboBox typeBox;
    private javax.swing.JPanel westPanel;
    // End of variables declaration//GEN-END:variables
}
