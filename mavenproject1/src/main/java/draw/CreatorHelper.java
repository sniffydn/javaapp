/*
 * CreatorHelper.java
 *
 * Created on March 11, 2009, 8:24 AM
 */
package draw;

/**
 *
 * @author  nyffeldd
 */
public class CreatorHelper extends javax.swing.JPanel {

    /** Creates new form CreatorHelper */
    public CreatorHelper() {
        initComponents();
    }

    /*
     * SuperTU tu = (SuperTU) CthsFactory.getRandomTopUpper(p.b.getMiddle(), topsColorArray.getNewColorArray());
    SuperTL tl = (SuperTL) CthsFactory.getRandomTopLower(tu, topsColorArray.getNewColorArray());
    SuperB b = (SuperB) CthsFactory.getRandomBottoms(tu, tl, bottomsColorArray.getNewColorArray());
    SuperS sh = (SuperS) CthsFactory.getRandomShoes(tu, tl, b, shoesColorArray.getNewColorArray());
    SuperC as = CthsFactory.getRandomAnkleStraps(tu, tl, b, sh, shoesColorArray.getNewColorArray());
    SuperC pl = (SuperC) CthsFactory.getRandomPlatz(tu, tl, b, sh, shoesColorArray.getNewColorArray());
    SuperC so = (SuperC) CthsFactory.getRandomSocks(tu, tl, b, sh, topsColorArray.getNewColorArray());
     * 
     * 
     * 
    public boolean slenderS = false;
    public boolean drs = false;
    public boolean pant = false;
    public boolean under = false;
    public boolean jean = false;
    public boolean skt = false;
    public boolean shrt = false;
    public boolean sch = false;
    public boolean ling = false;
    public boolean containsTL = false;
    public boolean containsB = false;
    public boolean slenderB = false;
    public boolean shuni = false;
    public boolean prep = false;
    public boolean swim = false;
    public boolean includeInAutoPick = true;
    public boolean noWalk = false;
    public int legLength = -1;
    public int legPos = -1;
    public int platzHeight = -1;
    protected ColorArray COLORS = new ColorArray();
     * */
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tuButton = new javax.swing.JToggleButton();
        tlButton = new javax.swing.JToggleButton();
        bButton = new javax.swing.JToggleButton();
        shButton = new javax.swing.JToggleButton();
        asButton = new javax.swing.JToggleButton();
        soButton = new javax.swing.JToggleButton();
        pButton = new javax.swing.JToggleButton();

        setLayout(new java.awt.BorderLayout());

        modPanel.setLayout(new java.awt.BorderLayout());
        add(modPanel, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout());

        tuButton.setText("TU");
        tuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuButtonActionPerformed(evt);
            }
        });
        jPanel2.add(tuButton);

        tlButton.setText("TL");
        tlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlButtonActionPerformed(evt);
            }
        });
        jPanel2.add(tlButton);

        bButton.setText("B");
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });
        jPanel2.add(bButton);

        shButton.setText("SH");
        shButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shButtonActionPerformed(evt);
            }
        });
        jPanel2.add(shButton);

        asButton.setText("AS");
        asButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asButtonActionPerformed(evt);
            }
        });
        jPanel2.add(asButton);

        soButton.setText("SO");
        soButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soButtonActionPerformed(evt);
            }
        });
        jPanel2.add(soButton);

        pButton.setText("P");
        pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });
        jPanel2.add(pButton);

        add(jPanel2, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

private void tuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tuButtonActionPerformed

private void tlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tlButtonActionPerformed

private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_bButtonActionPerformed

private void shButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_shButtonActionPerformed

private void asButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_asButtonActionPerformed

private void soButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_soButtonActionPerformed

private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_pButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton asButton;
    private javax.swing.JToggleButton bButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel modPanel;
    private javax.swing.JToggleButton pButton;
    private javax.swing.JToggleButton shButton;
    private javax.swing.JToggleButton soButton;
    private javax.swing.JToggleButton tlButton;
    private javax.swing.JToggleButton tuButton;
    // End of variables declaration//GEN-END:variables
}
