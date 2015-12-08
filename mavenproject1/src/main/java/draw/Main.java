/*
 * Main_2.java
 *
 * Created on May 21, 2007, 11:25 AM
 */
package draw;

import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JToggleButton;
import javax.swing.Timer;
import util.*;

/**
 *
 * @author  doubleD
 */
public class Main extends javax.swing.JFrame {

    double MAX_START_SIZE_PERCENT = .55;

//    private MainThread thread;
    /** Creates new form Main_2 */
    public Main() {
        try {
            home = false;
        } catch (Exception e) {
            System.out.println(e);
        }
        initComponents();
        jPanel17.add(dPanel);
        initLabels();
        resetPanels();
        addAll();

        int delay = 150; //milliseconds
        ActionListener taskPerformer = new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                nextStep();
            }
        };
        timer = new Timer(delay, taskPerformer);

        controlPanel.setVisible(false);
        dPanel.setVisible(true);
        this.pack();
        this.setVisible(true);
    }

    public void addAll() {
        boolean done = false;
        while (!done) {
            done = true;
            if (sorted == null || sorted.length != panel.length) {
                sorted = new int[panel.length];

                for (int i = 0; i < sorted.length; i++) {
                    sorted[i] = i;
                }
            }

            for (int i = 1; i < sorted.length; i++) {
                if (panel[sorted[i]].viewingSize > panel[sorted[i - 1]].viewingSize) {
                    done = false;
                    int tempI = sorted[i];
                    sorted[i] = sorted[i - 1];
                    sorted[i - 1] = tempI;
                }
            }
        }

        mainPanel.setVisible(false);
        mainPanel.removeAll();
        for (int i = 0; i < sorted.length; i++) {
            Panel temp = panel[sorted[i]];
            mainPanel.add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        }
        mainPanel.setVisible(true);
    }

    public void nextStep() {
        for (int i = 0; i < panel.length; i++) {
            panel[i].nextStep();
        }
        addAll();
    }

    private void resetPanelControlPanel() {
        panelControlPanel.setVisible(false);
        panelControlPanel.removeAll();
        panelControllers = new JToggleButton[panel.length];
        for (int i = 0; i < panel.length; i++) {
            JToggleButton b = new JToggleButton(panel[i].labelText);
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
                        modPanel.add(new PanelModifier(panel[index]));
                        modPanel.setVisible(true);
                    }
                }
            });
            panelControllers[i] = b;
            panelControlPanel.add(b);
        }
        panelControlPanel.setVisible(true);
    }

    private void resetPanels() {
        DFactory.primaryArray = null;
        DFactory.primaryC = null;
        DFactory.hrArray = null;
        DFactory.reset = true;
        DFactory.ARRAY_SIZE = -1;
        DFactory.RAND_ONE = -1;
        obsolete.RegHr.panel = null;
        panel = DFactory.newPanelArray(true, panel.length, typeMethods[typeBox.getSelectedIndex()], colorMethods[colorBox.getSelectedIndex()], secondaryColorMethods[secondaryColorBox.getSelectedIndex()]);

        repositionPanels();
        resetPanelControlPanel();
    }

    private void repositionPanels() {
        SCREEN_WIDTH = (int) (((panel.length * 30) + 230) * DFactory.ONE);
        SCREEN_HEIGHT = (int) (230 * DFactory.ONE) + 30;

        for (int i = 0; i < panel.length; i++) {
            repositionPanel(i);
        }
    }

    private void repositionPanel(int i) {
        if (panel.length > 10) {
            panel[i].setCenter((SCREEN_WIDTH / 3) + ((i * ((SCREEN_WIDTH / 3) / panel.length)) % (SCREEN_WIDTH / 3)));
            panel[i].setViewingIndex((int) (Math.random() * (panel[i].stepArray.length) * MAX_START_SIZE_PERCENT));
        } //                if(panel.length > 1)
        //                {
        //                    if(i % 2 == 0)
        //                        panel[i].setCenter(350);
        //                    else
        //                        panel[i].setCenter(450);
        //                    if(!DFactory.KEEP_SIZE_AT_ONE)
        //                        panel[i].setViewingIndex((int)(((double)i / panel.length) * (panel[i].stepArray.length)));
        //                }
        else {
            if (i % 2 == 0) {
                panel[i].setCenter((SCREEN_WIDTH / 2) + (i * 3) + (i * 2));
            } else {
                panel[i].setCenter((SCREEN_WIDTH / 2) - ((i * 5) + 5));
            }
        }
        panel[i].setOrigYPos(20);//20
        panel[i].setLabel("" + i);
        panel[i].thread.start();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jTextArea2 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fileChooser = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        dFrame = new javax.swing.JFrame();
        mainWrapperPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jPanel18 = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        moveToCheck = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        moveTo = new javax.swing.JCheckBox();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        alwaysShow = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox();
        colorBox = new javax.swing.JComboBox();
        secondaryColorBox = new javax.swing.JComboBox();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        panelControlPanel = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        modPanel = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 120, 120)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("a");

        jSeparator1.setForeground(new java.awt.Color(50, 106, 197));

        jPanel5.setLayout(new java.awt.GridLayout(0, 1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 12));
        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setColumns(160);
        jTextField2.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel2.setText("a");

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel6Layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 99, Short.MAX_VALUE)
                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 369, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton1)
                .add(jLabel2)
                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel6);

        jButton2.setFont(new java.awt.Font("Arial", 0, 12));
        jButton2.setText("Browse...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel3.setText("Export Rule File:");

        jPasswordField1.setFont(new java.awt.Font("Arial", 0, 12));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel7Layout.createSequentialGroup()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 17, Short.MAX_VALUE)
                .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 369, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton2))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton2)
                .add(jLabel3)
                .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel7);

        jButton3.setFont(new java.awt.Font("Arial", 0, 12));
        jButton3.setText("Browse...");
        jButton3.setEnabled(false);

        jTextField5.setBackground(new java.awt.Color(200, 200, 200));
        jTextField5.setColumns(160);
        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Arial", 0, 12));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 12));
        jRadioButton1.setText("as");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel8Layout = new org.jdesktop.layout.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(jRadioButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 65, Short.MAX_VALUE)
                .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 369, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton3))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton3)
                .add(jRadioButton1)
                .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel8);

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "System default", "Check out" }));

        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 12));
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("as");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel9Layout = new org.jdesktop.layout.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .add(jRadioButton2)
                .add(42, 42, 42)
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel9Layout.createSequentialGroup()
                .add(jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioButton2)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel9);

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 12));
        jCheckBox1.setText("Detailed Log");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel10Layout = new org.jdesktop.layout.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .add(jCheckBox1)
                .addContainerGap(467, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jCheckBox1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel10);

        jSeparator2.setForeground(new java.awt.Color(50, 106, 197));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Configuration Specification", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jButton4.setFont(new java.awt.Font("Arial", 0, 12));
        jButton4.setText("Set Config Spec");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "as", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel11.setLayout(new java.awt.GridLayout(0, 1));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Objects", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);

        jButton5.setFont(new java.awt.Font("Arial", 0, 12));
        jButton5.setText("Add...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 0, 12));
        jButton6.setText("Delete");

        org.jdesktop.layout.GroupLayout jPanel12Layout = new org.jdesktop.layout.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel12Layout.createSequentialGroup()
                .add(jTextArea1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jButton5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel12Layout.createSequentialGroup()
                .add(jPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextArea1, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel12Layout.createSequentialGroup()
                        .add(jButton5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6)))
                .addContainerGap())
        );

        jPanel11.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Filters", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);

        jButton7.setFont(new java.awt.Font("Arial", 0, 12));
        jButton7.setText("Add...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Arial", 0, 12));
        jButton8.setText("Delete");

        org.jdesktop.layout.GroupLayout jPanel13Layout = new org.jdesktop.layout.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel13Layout.createSequentialGroup()
                .add(jTextArea2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jButton7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel13Layout.createSequentialGroup()
                .add(jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextArea2, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel13Layout.createSequentialGroup()
                        .add(jButton7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton8)))
                .addContainerGap())
        );

        jPanel11.add(jPanel13);

        jSeparator3.setForeground(new java.awt.Color(50, 106, 197));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "sd", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("                                                                                                            \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        jScrollPane1.setViewportView(jTextArea3);

        org.jdesktop.layout.GroupLayout jPanel15Layout = new org.jdesktop.layout.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
        );

        jPanel16.setLayout(new java.awt.GridLayout(1, 0, 4, 0));

        jButton9.setFont(new java.awt.Font("Arial", 0, 12));
        jButton9.setText("Preview");
        jPanel16.add(jButton9);

        jButton10.setFont(new java.awt.Font("Arial", 0, 12));
        jButton10.setText("Submit");
        jPanel16.add(jButton10);

        jButton11.setFont(new java.awt.Font("Arial", 0, 12));
        jButton11.setText("Save log...");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton11);

        jButton12.setFont(new java.awt.Font("Arial", 0, 12));
        jButton12.setText("Exit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton12);

        jButton13.setFont(new java.awt.Font("Arial", 0, 12));
        jButton13.setText("Cancel");
        jButton13.setEnabled(false);
        jPanel16.add(jButton13);

        jButton14.setFont(new java.awt.Font("Arial", 0, 12));
        jButton14.setText("Help");
        jPanel16.add(jButton14);

        org.jdesktop.layout.GroupLayout jPanel14Layout = new org.jdesktop.layout.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel15, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel14Layout.createSequentialGroup()
                .add(jPanel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .add(jSeparator2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .add(jPanel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .add(jPanel14, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(16, 16, 16)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel14, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 11));
        jLabel4.setText(" Java Applet Window");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jLabel4)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel4))
        );

        org.jdesktop.layout.GroupLayout dPanelLayout = new org.jdesktop.layout.GroupLayout(dPanel);
        dPanel.setLayout(dPanelLayout);
        dPanelLayout.setHorizontalGroup(
            dPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dPanelLayout.setVerticalGroup(
            dPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(dPanelLayout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        fileChooser.getContentPane().add(jFileChooser1, java.awt.BorderLayout.CENTER);

        dFrame.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        mainWrapperPanel.setBackground(new java.awt.Color(57, 123, 241));
        mainWrapperPanel.setLayout(new java.awt.GridLayout(1, 0));

        mainPanel.setBackground(new java.awt.Color(245, 252, 245));
        mainPanel.setOpaque(false);
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainWrapperPanel.add(mainPanel);

        dFrame.getContentPane().add(mainWrapperPanel);

        org.jdesktop.layout.GroupLayout jPanel18Layout = new org.jdesktop.layout.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        jFrame1.getContentPane().add(jPanel18, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Export");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jButton15.setText("No.");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        moveTo.setText("Move To");
        moveTo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        moveTo.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton16.setText("Timer");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Reset");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton17MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton17MouseReleased(evt);
            }
        });
        jButton17.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton17MouseWheelMoved(evt);
            }
        });

        alwaysShow.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        alwaysShow.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel5.setText("Something");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jLabel5.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel5MouseWheelMoved(evt);
            }
        });

        typeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        colorBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        secondaryColorBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton19.setText("Ex");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });

        jButton20.setText("0 out");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("arm ch");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        panelControlPanel.setLayout(new java.awt.GridLayout(1, 0));

        jButton18.setText("Add");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton22.setText("Del");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("Cont.");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout moveToCheckLayout = new org.jdesktop.layout.GroupLayout(moveToCheck);
        moveToCheck.setLayout(moveToCheckLayout);
        moveToCheckLayout.setHorizontalGroup(
            moveToCheckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelControlPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, moveToCheckLayout.createSequentialGroup()
                .add(moveToCheckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(moveToCheckLayout.createSequentialGroup()
                        .add(jButton17)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(typeBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton23, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton15)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(moveTo))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, moveToCheckLayout.createSequentialGroup()
                        .add(jButton18)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton22)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(colorBox, 0, 274, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(moveToCheckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(moveToCheckLayout.createSequentialGroup()
                        .add(jButton16)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(alwaysShow)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton20)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton21)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton19))
                    .add(secondaryColorBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        moveToCheckLayout.setVerticalGroup(
            moveToCheckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(moveToCheckLayout.createSequentialGroup()
                .add(moveToCheckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton17)
                    .add(moveTo)
                    .add(jButton16)
                    .add(alwaysShow)
                    .add(jLabel5)
                    .add(jButton20)
                    .add(jButton21)
                    .add(jButton19)
                    .add(typeBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton23)
                    .add(jButton15))
                .add(1, 1, 1)
                .add(moveToCheckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton18)
                    .add(jButton22)
                    .add(colorBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(secondaryColorBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelControlPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
        );

        modPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modPanelMouseExited(evt);
            }
        });
        modPanel.setLayout(new java.awt.BorderLayout());

        org.jdesktop.layout.GroupLayout controlPanelLayout = new org.jdesktop.layout.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(moveToCheck, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(modPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(controlPanelLayout.createSequentialGroup()
                .add(moveToCheck, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(modPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
        );

        getContentPane().add(controlPanel, java.awt.BorderLayout.CENTER);

        jPanel17.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel17, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jLabel5MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel5MouseWheelMoved
        nextStep();
    }//GEN-LAST:event_jLabel5MouseWheelMoved

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        for (int i = 0; i < panel.length; i++) {
            panel[i].repaint();
        }
        tryIt();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        mainPanelVisibility(alwaysShow.isSelected());
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        mainPanelVisibility(true);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jButton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseExited
        mainPanelVisibility(alwaysShow.isSelected());
    }//GEN-LAST:event_jButton17MouseExited

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        s = evt.getKeyCode() + s;
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jButton17MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton17MouseWheelMoved
        nextStep();
    }//GEN-LAST:event_jButton17MouseWheelMoved

    private void jButton17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseReleased
//thread.stopThread();
        mainPanelVisibility(true);
    }//GEN-LAST:event_jButton17MouseReleased

    private void modPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modPanelMouseExited
        moveTo.setSelected(false);
    }//GEN-LAST:event_modPanelMouseExited

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        modPanel.setVisible(false);
        modPanel.removeAll();
        modPanel.setVisible(true);
        for (int i = 0; i < panel.length; i++) {
            panel[i].thread.stopThread();
        }
        resetPanels();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (timer.isRunning()) {
            timer.stop();
        } else {
            timer.start();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        if (moveTo.isSelected()) {
            time = 1000 + System.currentTimeMillis();
        }
    }//GEN-LAST:event_formMouseEntered

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        focusLost();
    }//GEN-LAST:event_formWindowLostFocus

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tryIt();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            show(evt.getClickCount());
        }
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        showFileDialog();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        showFileDialog();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        showFileDialog();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showFileDialog();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showFileDialog();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        for (int i = 0; i < panel.length; i++) {
            panel[i].setLabelsVisible(!panel[i].labelsAreVisible());
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            drawAllToFile();
        } else {
            drawToFile();
        }
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        //        thread.stopThread();
        for (int i = 0; i < panel.length; i++) {
            panel[i].rePrime();
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        for (int i = 0; i < panel.length; i++) {

            ArrayList uppers = new ArrayList();
            for (int j = 0; j < panel[i].getObjs().length; j++) {
                if (panel[i].getObjs()[j] instanceof clts.SuperTU) {
                    uppers.add(panel[i].getObjs()[j]);
                }
                if (panel[i].getObjs()[j] instanceof clts.SuperTL) {
                    uppers.add(panel[i].getObjs()[j]);
                }
            }

            for (int j = 0; j < uppers.size(); j++) {
                DFactory.checkArms(panel[i], (clts.SuperC) uppers.get(j));
            }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        copy();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        del();
    }//GEN-LAST:event_jButton22ActionPerformed

private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton23ActionPerformed

    private void copy() {

        Panel[] tempPanel = DFactory.newPanelArray(true, panel.length + 1, typeMethods[typeBox.getSelectedIndex()], colorMethods[colorBox.getSelectedIndex()], secondaryColorMethods[secondaryColorBox.getSelectedIndex()]);

        for (int i = 0; i < panel.length; i++) {
            tempPanel[i] = panel[i];
        }
        
        for(int i = 0; i < tempPanel.length; i++){
            tempPanel[i].setLabel(i + "");
        }

        panel = tempPanel;

        repositionPanel(panel.length - 1);
        resetPanelControlPanel();
    }

    private void del() {
        Panel[] tempPanel = new Panel[panel.length - 1];

        int index = -1;

        for(int i = 0; i < panelControllers.length; i++){
            if(panelControllers[i].isSelected())
            {
                index = i;
                break;
            }
        }

        int j = 0;
        for (int i = 0; i < tempPanel.length; i++) {
            if(i == index){
                j = 1;
            }
            
            tempPanel[i] = panel[i + j];
        }

        panel = tempPanel;

        resetPanelControlPanel();
    }

    private void mainPanelVisibility(boolean visible) {
        mainWrapperPanel.setVisible(visible);
        mainPanel.setVisible(visible);
    }

    private void showFileDialog() {
        fileChooser.pack();
        fileChooser.setVisible(true);
    }

    public static void main(String args[]) {
        DEFAULT_X_VALUE = 1590;
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void show(int i) {
        if (i == 2 && s.startsWith("78738483856816")) {
            show = true;
        }
    }

    private void tryIt() {
        mainPanel.setVisible(false);
        dPanel.setVisible(!show);
        controlPanel.setVisible(show);
        dFrame.setLocation(Main.DEFAULT_X_VALUE, -29);
        dFrame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        dFrame.setVisible(show);

        if (show) {
            this.pack();
        }
        this.setVisible(true);
        time = System.currentTimeMillis();
    }

    private void focusLost() {
        if (home) {
            return;
        }
        if (!moveTo.isSelected()) {
            if (System.currentTimeMillis() - (500 + time) > 0) {
                dFrame.setVisible(false);
                show = false;
                dPanel.setVisible(true);
                controlPanel.setVisible(false);
                this.pack();
                this.setVisible(true);
            }
        }
    }

    private void initLabels() {
        setUpTypes();
        setUpColors();
        setUpSecondaryColors();
        setTitle(("" + ((char) 69)) + ("" + ((char) 120)) + ("" + ((char) 112)) + ("" + ((char) 111)) + ("" + ((char) 114)) + ("" + ((char) 116)));
        jLabel1.setText(("" + ((char) 83)) + ("" + ((char) 111)) + ("" + ((char) 117)) + ("" + ((char) 114)) + ("" + ((char) 99)) + ("" + ((char) 101)) + ("" + ((char) 32)) + ("" + ((char) 67)) + ("" + ((char) 111)) + ("" + ((char) 110)) + ("" + ((char) 116)) + ("" + ((char) 101)) + ("" + ((char) 120)) + ("" + ((char) 116)) + ": \"" + ("" + ((char) 87)) + ("" + ((char) 105)) + ("" + ((char) 110)) + ("" + ((char) 100)) + ("" + ((char) 99)) + ("" + ((char) 104)) + ("" + ((char) 105)) + ("" + ((char) 108)) + ("" + ((char) 108)) + ("" + ((char) 32)) + ("" + ((char) 80)) + ("" + ((char) 68)) + ("" + ((char) 77)) + "\"");
        jLabel2.setText(("" + ((char) 69)) + ("" + ((char) 120)) + ("" + ((char) 112)) + ("" + ((char) 111)) + ("" + ((char) 114)) + ("" + ((char) 116)) + " File Name:");
        jRadioButton1.setText(("" + ((char) 69)) + ("" + ((char) 120)) + ("" + ((char) 112)) + ("" + ((char) 111)) + ("" + ((char) 114)) + ("" + ((char) 116)) + " " + ("" + ((char) 80)) + ("" + ((char) 111)) + ("" + ((char) 108)) + ("" + ((char) 105)) + ("" + ((char) 99)) + ("" + ((char) 121)) + " File:");
        jRadioButton2.setText(("" + ((char) 69)) + ("" + ((char) 120)) + ("" + ((char) 112)) + ("" + ((char) 111)) + ("" + ((char) 114)) + ("" + ((char) 116)) + " Action:");
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Objects for " + ("" + ((char) 69)) + ("" + ((char) 120)) + ("" + ((char) 112)) + ("" + ((char) 111)) + ("" + ((char) 114)) + ("" + ((char) 116)), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0)));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), ("" + ((char) 69)) + ("" + ((char) 120)) + ("" + ((char) 112)) + ("" + ((char) 111)) + ("" + ((char) 114)) + ("" + ((char) 116)) + " " + ("" + ((char) 83)) + ("" + ((char) 116)) + ("" + ((char) 97)) + ("" + ((char) 116)) + ("" + ((char) 117)) + ("" + ((char) 115)) + ("" + ((char) 32)) + ("" + ((char) 76)) + ("" + ((char) 111)) + ("" + ((char) 103)), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0)));
    }

    private void setUpTypes() {
        Vector v = new Vector();
        File dir = new File("build/classes/util/dFactoryTypes");

        String[] children = dir.list();
        if (children == null) {
            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
        }
        for (int i = 0; i < children.length; i++) {
            try {
                Class c = Class.forName("util.dFactoryTypes." + children[i].substring(0, children[i].indexOf(".")));
                Method[] m = c.getMethods();
                for (int j = 0; j < m.length; j++) {
                    if (m[j].getName().startsWith("new")) {
                        v.add(m[j]);
                    }
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }

        typeMethods = new Method[v.size()];
        String[] names = new String[v.size()];
        for (int i = 0; i < v.size(); i++) {
            typeMethods[i] = (Method) v.elementAt(i);
            names[i] = typeMethods[i].getDeclaringClass() + "." + typeMethods[i].getName();
            names[i] = names[i].substring(25);
            names[i] = names[i].replaceAll(".newSuperC", "");
        }

        typeBox.setModel(new javax.swing.DefaultComboBoxModel(names));
        typeBox.setSelectedItem("Random");
//        typeBox.setSelectedItem("Ling");
    }

    private void setUpColors() {
        Vector v = new Vector();
        File dir = new File("build/classes/util/dFactoryArrays");

        String[] children = dir.list();
        if (children == null) {
            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
        }
        for (int i = 0; i < children.length; i++) {
            try {
                Class c = Class.forName("util.dFactoryArrays." + children[i].substring(0, children[i].indexOf(".")));
                Method[] m = c.getMethods();
                for (int j = 0; j < m.length; j++) {
                    if (m[j].getName().startsWith("set")) {
                        v.add(m[j]);
                    }
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        colorMethods = new Method[v.size()];
        String[] names = new String[v.size()];
        for (int i = 0; i < v.size(); i++) {
            colorMethods[i] = (Method) v.elementAt(i);
            names[i] = colorMethods[i].getDeclaringClass() + "." + colorMethods[i].getName();
            names[i] = names[i].substring(26);
            names[i] = names[i].replaceAll(".setArrays", "");
        }

        colorBox.setModel(new javax.swing.DefaultComboBoxModel(names));
        colorBox.setSelectedItem("RandomArraysSolid");
//        colorBox.setSelectedItem("SolidArraysCycling");
    }

    private void setUpSecondaryColors() {
        Vector v = new Vector();
        File dir = new File("build/classes/util/dFactoryAccArrays");

        String[] children = dir.list();
        if (children == null) {
            System.out.println("dir: " + dir.getAbsolutePath() + " does not exist");
        }
        for (int i = 0; i < children.length; i++) {
            try {
                Class c = Class.forName("util.dFactoryAccArrays." + children[i].substring(0, children[i].indexOf(".")));
                Method[] m = c.getMethods();
                for (int j = 0; j < m.length; j++) {
                    if (m[j].getName().startsWith("set")) {
                        v.add(m[j]);
                    }
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        secondaryColorMethods = new Method[v.size()];
        String[] names = new String[v.size()];
        for (int i = 0; i < v.size(); i++) {
            secondaryColorMethods[i] = (Method) v.elementAt(i);
            names[i] = secondaryColorMethods[i].getDeclaringClass() + "." + secondaryColorMethods[i].getName();
            names[i] = names[i].substring(29);
            names[i] = names[i].replaceAll(".setArrays", "");
        }

        secondaryColorBox.setModel(new javax.swing.DefaultComboBoxModel(names));
        secondaryColorBox.setSelectedItem("NothingNothing");
//        secondaryColorBox.setSelectedItem("LingArrays");
    }

    private void drawAllToFile() {
        for (int i = 0; i < panel[0].stepArray.length; i++) {
            nextStep();
            addAll();
            drawToFile();
        }
    }

    private void drawToFile() {
        BufferedImage bufferedImage = new BufferedImage(SCREEN_WIDTH, SCREEN_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        File f = null;
        try {
            f = new File("x/Warning");
            if (!f.exists()) {
                System.out.println("dir does not exist: " + f.getName());
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            bufferedImage = null;
        }

        Graphics2D g2d = bufferedImage.createGraphics();

        for (int i = 0; i < sorted.length; i++) {
            panel[sorted[(sorted.length - 1) - i]].paint2D(g2d);
        }

        g2d.dispose();
        try {
            f = new File("x/Warning/" + System.currentTimeMillis() + ".png");
            ImageIO.write(bufferedImage, "png", f);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alwaysShow;
    private javax.swing.JComboBox colorBox;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JFrame dFrame;
    private javax.swing.JPanel dPanel;
    private javax.swing.JFrame fileChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainWrapperPanel;
    private javax.swing.JPanel modPanel;
    public static javax.swing.JCheckBox moveTo;
    private javax.swing.JPanel moveToCheck;
    private javax.swing.JPanel panelControlPanel;
    private javax.swing.JComboBox secondaryColorBox;
    private javax.swing.JComboBox typeBox;
    // End of variables declaration//GEN-END:variables
    public static boolean show = false;
    public static boolean goOn = false;
    long time = -1;
    Panel[] panel = new Panel[1];
    JToggleButton[] panelControllers = new JToggleButton[7];
    Timer timer;
    int[] sorted = null;
    String s = "";
    public static int SCREEN_WIDTH = 800;
    public static int SCREEN_HEIGHT = 1200;
    boolean home = false;
    Method[] typeMethods = new Method[0];
    Method[] colorMethods = new Method[0];
    Method[] secondaryColorMethods = new Method[0];
    public static int DEFAULT_X_VALUE = 0;
}
