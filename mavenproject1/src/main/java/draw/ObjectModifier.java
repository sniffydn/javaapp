/*
 * ObjectModifierPanel.java
 *
 * Created on October 24, 2008, 9:24 AM
 */

package draw;

import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JToggleButton;
import util.GetAndSetMethodHolder;

/**
 *
 * @author  nyffeldd
 */
public class ObjectModifier extends javax.swing.JPanel {
    
    private JToggleButton[] panelControllers;
    ArrayList<GetAndSetMethodHolder> changeables;
    
    /** Creates new form ObjectModifierPanel */
    public ObjectModifier(Object o) {
        initComponents();
        setUpObjectModifierPanel(o);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        controlPanel = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setLayout(new java.awt.BorderLayout());

        modPanel.setLayout(new java.awt.BorderLayout());
        add(modPanel, java.awt.BorderLayout.CENTER);

        controlPanel.setLayout(new java.awt.GridLayout(0, 1));

        jToggleButton1.setText("jToggleButton1");
        controlPanel.add(jToggleButton1);

        jScrollPane1.setViewportView(controlPanel);

        add(jScrollPane1, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void setUpObjectModifierPanel(Object o) {
        ArrayList temp = new ArrayList();
        ArrayList<Method> temp2 = new ArrayList<Method>();
        changeables = new ArrayList<GetAndSetMethodHolder>();
        Method[] methods = o.getClass().getMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().startsWith("set")) {
                temp.add(methods[i].getName().substring(3));
                temp2.add(methods[i]);
            }
        }

        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().startsWith("get")) {
                int indexOfSet = temp.indexOf(methods[i].getName().substring(3));
                if (indexOfSet != -1) {
                    changeables.add(new GetAndSetMethodHolder(o, methods[i].getName().substring(3), methods[i].getGenericReturnType() + "", methods[i], temp2.get(indexOfSet)));
                }
            }
        }

        resetSubControlPanel(changeables);
    }
    
    private void resetSubControlPanel(ArrayList changeables) {
        jScrollPane1.setVisible(false);
        controlPanel.removeAll();
        panelControllers = new JToggleButton[changeables.size()];
        for (int i = 0; i < changeables.size(); i++) {
            JToggleButton b = new JToggleButton(changeables.get(i).toString());
            b.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    JToggleButton b = (JToggleButton) evt.getSource();
                    if (b.isSelected()) {
                        int index = 0;
                        for (int i = 0; i < panelControllers.length; i++) {
                            if (panelControllers[i] == b) {
                                index = i;
                            } else {
                                panelControllers[i].setSelected(false);
                            }
                        }
                        modPanel.setVisible(false);
                        modPanel.removeAll();
                        modPanel.add(getModifierPanel(index));
                        modPanel.setVisible(true);
                    }
                }
            });
            panelControllers[i] = b;
            controlPanel.add(b);
            jScrollPane1.setVisible(true);
        }
    }
    
    
    private javax.swing.JPanel getModifierPanel(int index) {
        GetAndSetMethodHolder o = changeables.get(index);

        if (o.getType().equals("int")) {
            return new draw.IntModifier(o);
        }
        else if (o.getType().equals("class util.ColorArray")) {
            return new draw.ColorArraySetUp(o);
        }else if (o.getType().equals("class java.lang.String")) {
            return new draw.StringModifier(o);
        }else if (o.getType().equals("class util.Color")) {
            return new draw.ColorModifier((util.Color)o.get());
        }else if (o.getType().equals("boolean")) {
            return new draw.BooleanModifier(o);
        }



        System.out.println(o.getType());
        return new javax.swing.JPanel();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel modPanel;
    // End of variables declaration//GEN-END:variables
    
}