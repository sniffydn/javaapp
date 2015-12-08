/*
 * Panel.java
 *
 */
package draw;

import b.Bd;
import java.util.ArrayList;
import util.GraphicsMap;
import clts.SuperC;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.Method;
import java.util.TreeSet;

/**
 * @author  doubleD
 */
public class Panel extends javax.swing.JPanel implements java.io.Serializable {

    transient public int originalCenterPoint = -99999;
    transient public int yPercent = 100;
    transient public int origYPos = -99999;
    public transient int xPos = -99999;
    public transient int yPos = 0;
    public Bd b = new Bd();
    protected clts.Paintable[] objs = new clts.Paintable[0];
    public int[] stepArray = {0};
    public int[] directionArray = {1}; //1 right, 0 left
    public int[] leftArmArray = {0};
    public int[] rightArmArray = {0};
    public int[] eyebrowsArray = {0};// 0 normal, -1 up
    public int[] eyesArray = {0};
    public int[] mouthSmileArray = {0};//0,1,2
    public int[] mouthTeethArray = {0};//0,1
    public int[] inFrontArray = {0};// 0 behind, 1 infront
    transient public int index = 0;
    transient public int viewingIndex = -1;
    transient public double viewingSize = 0;
    transient int step = 0;
    transient int offsetX = 0;
    transient int offsetY = 0;
    transient int labelX = Main.SCREEN_WIDTH;
    transient int labelY = Main.SCREEN_HEIGHT;
    transient String labelText = "x";
    transient boolean showLabels = false;
    public transient ArrayList lines = null;
    public transient PanelThread thread = null;
    protected transient TreeSet<util.PaintableObjectAndMethodHolder> paintObjects = null;
    public transient double POAMHcounter = 2;

    {
        setPaintObjects(getOriginalPOAMH());
    }

    /** Creates new form Panel */
    public Panel() {
        initComponents();
        thread = new PanelThread(this);
    }

    public Panel(SuperC[] cArray) {
        objs = cArray;
        initComponents();
        thread = new PanelThread(this);
    }

    public String toString() {
        return labelText;
    }

    public void objectSetStep(int s, int index) {
        b.setStep(s,
                directionArray[index % directionArray.length],
                eyebrowsArray[index % eyebrowsArray.length],
                eyesArray[index % eyesArray.length],
                mouthSmileArray[index % mouthSmileArray.length],
                mouthTeethArray[index % mouthTeethArray.length]);
        b.setStep(s,
                directionArray[index % directionArray.length],
                leftArmArray[index % leftArmArray.length],
                rightArmArray[index % rightArmArray.length],
                eyesArray[index % eyesArray.length]);

        for (int i = 0; i < getObjs().length; i++) {
            getObjs()[i].setStep(s,
                    directionArray[index % directionArray.length],
                    leftArmArray[index % leftArmArray.length],
                    rightArmArray[index % rightArmArray.length],
                    eyesArray[index % eyesArray.length]);
            getObjs()[i].getColors().setStep(index);

            if (getObjs()[i] instanceof clts.SuperH) {
                ((clts.SuperH) getObjs()[i]).setInFront(inFrontArray[index % inFrontArray.length]);
            }
        }
    }

    public void setViewingIndex(int i) {
        viewingIndex = i % stepArray.length;
    }

    public void nextStep() {
        viewingIndex = (viewingIndex + 1) % stepArray.length;
        int platzHeight = 0;
        try {
            int platzIndex = 0;
            for (; platzIndex < getObjs().length; platzIndex++) {
                if (getObjs()[platzIndex] instanceof clts.SuperP) {
                    break;
                }
            }

            platzHeight = ((clts.SuperP) (getObjs()[platzIndex])).getHeight();
        } catch (Exception e) {
            e.printStackTrace();
        }
        viewingSize = yPos + platzHeight;

        if (lines == null || lines.get(viewingIndex) == null) {
            if (!thread.isAlive()) {
                PanelThread temp = new PanelThread(this);
                thread = temp;
                thread.start();
            }
        }

        if (showLabels) {
            jLabel1.setText(" ");
            setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "step:" + stepArray[viewingIndex] + "     " + labelText, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 12), getObjs()[0].getColors().get(7).getColor()));
        } else {
            jLabel1.setText(" ");
        }

        jLabel1.setVisible(false);
        remove(jLabel1);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(labelX, labelY, -1, -1));
        jLabel1.setVisible(true);
    }

    public void rePrime() {
        lines = null;
        index = 0;
        step = 0;
        offsetX = 0;
        offsetY = 0;
        setOrigYPos(origYPos);
    }

    public synchronized void primeIndex(int i) {
        if (lines == null) {
            lines = new ArrayList();
            for (int j = 0; j < stepArray.length; j++) {
                lines.add(null);
            }
        }
        if (lines.get(i % stepArray.length) == null) {
            setStep(stepArray[i % stepArray.length], i);
            GraphicsMap temp = new GraphicsMap(labelX, labelY, getStartSize());

            rePosition();

            temp.translate(xPos, yPos);
            temp.scale(util.DFactory.ONE);
            temp.setIndex(i);
            temp.setLastIndex(stepArray.length - 1);
            paintHelper(temp);

            if (lines != null && temp != null) {
                lines.set(i % stepArray.length, temp.prime());
            }
        }
    }

    public void setIndex(int i) {
        index = i % stepArray.length;
        if (lines == null || lines.get(index) == null) {
            primeIndex(index);
        }
    }
    transient int floatCounter = 0;
    transient int[] floatPos = {-1, -1, 1, 1, 1, -1};
    transient int[] floatOff = {1, 0, -1, -1, 0, 1};

    void setPanel(Panel p) {
        b = p.b;
        objs = p.objs;
        stepArray = p.stepArray;
        directionArray = p.directionArray;
        leftArmArray = p.leftArmArray;
        rightArmArray = p.rightArmArray;
        eyebrowsArray = p.eyebrowsArray;
        eyesArray = p.eyesArray;
        mouthSmileArray = p.mouthSmileArray;
        mouthTeethArray = p.mouthTeethArray;
        inFrontArray = p.inFrontArray;

        setPaintObjects(getOriginalPOAMH());
        this.rePrime();
    }

    private TreeSet<util.PaintableObjectAndMethodHolder> getOriginalPOAMH() {
        POAMHcounter = 2;
        TreeSet<util.PaintableObjectAndMethodHolder> temp = new TreeSet<util.PaintableObjectAndMethodHolder>();
        getPOAMAMH(b, temp);
        for (int i = 0; i < getObjs().length; i++) {
            getPOAMAMH(getObjs()[i], temp);
        }
        return temp;
    }

    private void getPOAMAMH(clts.Paintable p, TreeSet<util.PaintableObjectAndMethodHolder> list) {
        Method[] methods = p.getClass().getMethods();

        for (int j = 0; j < methods.length; j++) {
            if (methods[j].getName().equals("paintVeryBack")) {
                list.add(new util.PaintableObjectAndMethodHolder(p, methods[j], this));
            } else if (methods[j].getName().equals("paintBack")) {
                list.add(new util.PaintableObjectAndMethodHolder(p, methods[j], this));
            } else if (methods[j].getName().equals("paintMiddle")) {
                list.add(new util.PaintableObjectAndMethodHolder(p, methods[j], this));
            } else if (methods[j].getName().equals("paintFront")) {
                list.add(new util.PaintableObjectAndMethodHolder(p, methods[j], this));
            } else if (methods[j].getName().equals("paintStationaryFront")) {
                list.add(new util.PaintableObjectAndMethodHolder(p, methods[j], this));
            } else if (methods[j].getName().equals("paintVeryFront")) {
                list.add(new util.PaintableObjectAndMethodHolder(p, methods[j], this));
            }
        }
    }

    private void setStep(int s, int index) {

        if (s == 0 || s == 8) {
            if (step != 0 && step != 8) {
                offsetY = 1;
            } else {
                offsetY = 0;
            }
        } else if (s == 1 || s == 9) {
            offsetY = 1;
        } else if (s == 2 || s == 10) {
            offsetY = 0;
        } else if (s == 4 || s == 12) {
            offsetY = -1;
        } else if (s == 6 || s == 14) {
            offsetY = 0;
        }

        objectSetStep(s, index);

        if (step == 1 || step == 9) {
            yPos--;
        }
        if (step == 4 || step == 12) {
            yPos--;
        }
        if (s == 14 || s == 7) {
            yPos++;
        }
        if (s == 0 || s == 8) {
            if (step != 0 && step != 8) {
                yPos++;
            }
        }

        if (step == 11 || step == 3) {
            if (s == 11 || s == 3) {
                offsetY = floatOff[floatCounter];
                yPos += floatPos[floatCounter];
                floatCounter = (floatCounter + 1) % floatPos.length;
            }
            if ((s == 10 || s == 2) && (floatCounter % 3 == 0)) {
                yPos += floatPos[floatCounter];
                floatCounter = (floatCounter + 1) % floatPos.length;
            }
        }



        step = s;
        if (step == 2 || step == 6) {
            offsetX = 1;
        } else if (step == 3 || step == 4 || step == 5) {
            offsetX = 2;
        } else if (step == 10 || step == 14) {
            offsetX = -1;
        } else if (step == 11 || step == 12 || step == 13) {
            offsetX = -2;
        } else {
            offsetX = 0;
        }
    }

    public void setLabel(String label) {
        labelText = label;
    }

    public void setLabelsVisible(boolean visible) {
        showLabels = visible;

        if (showLabels) {
            setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), labelText + "     " + labelText, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 12), getObjs()[0].getColors().get(7).getColor()));
        } else {
            setBorder(null);
        }
    }

    public boolean labelsAreVisible() {
        return showLabels;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        paint2D(g2d);
        super.paint(g);
    }

    public void paint2D(Graphics2D g2d) {
        try {
            if (lines.get(stepArray.length - 1) == null) {
                g2d.setColor(Color.RED);
                g2d.fillRect(2, 2, 1, 9);
                g2d.fillRect(3, 2, 3, 1);
                g2d.fillRect(6, 3, 1, 3);
                g2d.fillRect(3, 6, 3, 1);
                g2d.fillRect(9, 7, 1, 4);
                g2d.fillRect(9, 6, 1, 1);
                g2d.fillRect(10, 7, 1, 1);
                g2d.fillRect(11, 6, 2, 1);
                g2d.fillRect(15, 7, 1, 3);
                g2d.fillRect(16, 10, 2, 1);
                g2d.fillRect(16, 6, 2, 1);
                g2d.fillRect(18, 7, 1, 3);
                g2d.fillRect(21, 7, 1, 3);
                g2d.fillRect(22, 10, 2, 1);
                g2d.fillRect(22, 6, 2, 1);
                g2d.fillRect(24, 9, 1, 1);
                g2d.fillRect(27, 7, 1, 3);
                g2d.fillRect(28, 10, 3, 1);
                g2d.fillRect(28, 6, 2, 1);
                g2d.fillRect(28, 8, 2, 1);
                g2d.fillRect(30, 7, 1, 1);
                g2d.fillRect(34, 6, 2, 1);
                g2d.fillRect(33, 7, 1, 1);
                g2d.fillRect(34, 8, 2, 1);
                g2d.fillRect(36, 9, 1, 1);
                g2d.fillRect(34, 10, 2, 1);
                g2d.fillRect(39, 7, 1, 1);
                g2d.fillRect(40, 6, 2, 1);
                g2d.fillRect(40, 8, 2, 1);
                g2d.fillRect(42, 9, 1, 1);
                g2d.fillRect(40, 10, 2, 1);
                g2d.fillRect(45, 9, 1, 2);
                g2d.fillRect(45, 6, 1, 1);
                g2d.fillRect(45, 8, 1, 1);
                g2d.fillRect(48, 6, 1, 5);
                g2d.fillRect(49, 7, 1, 1);
                g2d.fillRect(50, 6, 2, 1);
                g2d.fillRect(52, 7, 1, 4);
                g2d.fillRect(55, 7, 1, 3);
                g2d.fillRect(56, 6, 2, 1);
                g2d.fillRect(56, 10, 3, 1);
                g2d.fillRect(58, 7, 1, 3);
                g2d.fillRect(58, 11, 1, 2);
                g2d.fillRect(56, 13, 2, 1);
                
                if(viewingIndex == -1)
                    viewingIndex = 0;
            }

            ArrayList instructions = (ArrayList) lines.get(viewingIndex);
            int temp = viewingIndex;
            while (instructions == null && temp > 0) {
                instructions = (ArrayList) lines.get(--temp);
                Thread.sleep(50);
            }
            GraphicsMap.paint(g2d, instructions);
        } catch (Exception e) {
            
            System.out.println("Exception in Panel: " + e);
            System.out.println("\tstepArray.length:" + stepArray.length);
            System.out.println("\t    viewingIndex:" + viewingIndex);
        }
    }

    public void paintHelper(GraphicsMap map) {

        for (int i = 0; i < getObjs().length; i++) {
            getObjs()[i].drawBody(b);
        }

        Object[] array = {offsetX, offsetY, map};

        for (util.PaintableObjectAndMethodHolder pOAMH : getPaintObjects()) {
            pOAMH.invoke(array);
        }

        for (int i = 0; i < getObjs().length; i++) {
            getObjs()[i].drawBody(b, offsetX, offsetY, map);
        }

//        for(int i = cths.length - 1; i >= 0; i--)
//        {
//            cths[i].drawBody(bd);
//        }
//        
//        for(int i = cths.length - 1; i >= 0; i--)
//            cths[i].paintVeryFront(offsetX, offsetY, map);
//
//        bd.drawVeryFront(offsetX, offsetY, map);
//
//        for(int i = cths.length - 1; i >= 0; i--)
//            cths[i].paintStationaryFront(offsetX, offsetY, map);
//
//        for(int i = cths.length - 1; i >= 0; i--)
//            cths[i].paintFront(offsetX, offsetY, map);
//
//        bd.drawFront(offsetX, offsetY, map);
//
//        for(int i = cths.length - 1; i >= 0; i--)
//            cths[i].paintMiddle(offsetX, offsetY, map);
//
//        bd.paintFrontLeg(offsetX, offsetY, map);
//
//        for(int i = cths.length - 1; i >= 0; i--)
//            cths[i].paintBack(offsetX, offsetY, map);
//
//        bd.paintBackLeg(offsetX, offsetY, map);
//
//        bd.drawBack(offsetX, offsetY, map);
//
//        for(int i = cths.length - 1; i >= 0; i--)
//        {
//            cths[i].drawBody(bd, offsetX, offsetY, map);
//        }
//
//        for(int i = cths.length - 1; i >= 0; i--)
//            cths[i].paintVeryBack(offsetX, offsetY, map);

//        bd.paintCore = true;
//        bd.paintLegs = true;
    }

    public void rePosition() {
    }

    protected void figureOutYPos() {
        try {
            int platzIndex = 0;
            for (; platzIndex < getObjs().length; platzIndex++) {
                if (getObjs()[platzIndex] instanceof clts.SuperP) {
                    break;
                }
            }
            yPos = origYPos - ((clts.SuperP) (getObjs()[platzIndex])).getHeight();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//
//    protected void figureOutXPos()
//    {
//        int vanishingPointX = Main.SCREEN_WIDTH / 2;
//        int vanishingPointY = 0;
//
//        int stageLeftPointX = Main.SCREEN_WIDTH / 5;
//        int stageLeftPointY = Main.SCREEN_HEIGHT / 4;
//
//        double slope = (stageLeftPointY - vanishingPointY) / (double) (stageLeftPointX - vanishingPointX);
//        double b = stageLeftPointY - (slope * stageLeftPointX);
//
//        int distanceFromCenter = (int) originalCenterPoint - vanishingPointX;
//        int newCenterPoint = (int)((yPos - b) / slope) - distanceFromCenter;
//
//        if(distanceFromCenter < 0)//if(originalCenterPoint > vanishingPointX)should be going left
//        {
//            xPos = (int) (newCenterPoint - (222 * size));
//        }
//        else
//        {
//            xPos = (int) (newCenterPoint - (111 * size));
//        }
//    }
    protected void figureOutXPos() {
        xPos = (int) (originalCenterPoint - (111 * util.DFactory.ONE));


//        double posPercent = (originalCenterPoint / Main.SCREEN_WIDTH) - .5;
//        double distanceToMove = posPercent * size * 2500;//distance to move the centerpoint
//
//        xPos = (int) ((originalCenterPoint + distanceToMove) - (labelX * size) / 2.0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setBackground(new java.awt.Color(204, 204, 255));
        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });

        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 750, -1, -1));

    }// </editor-fold>//GEN-END:initComponents
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
// TODO add your handling code here:
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
// TODO add your handling code here:
        nextStep();
        repaint();
    }//GEN-LAST:event_formMouseWheelMoved

    public void setCenter(int x) {
//        System.out.println("setCenter: " + x);
        if (x == Main.SCREEN_WIDTH / 2) {
            x--;
        }
        originalCenterPoint = x;

        figureOutXPos();
    }

    public void setOrigYPos(int i) {
        origYPos = i;

        figureOutYPos();
    }

    private int getStartSize() {
        for (int i = 0; i < getObjs().length; i++) {
            if (getObjs()[i] instanceof clts.t.u.d.D3) {
                return 9500;
            }

            if (getObjs()[i] instanceof clts.t.u.d.D2) {
                return 5000;
            }

            if (getObjs()[i] instanceof clts.t.u.d.D1) {
                return 4800;
            }
        }
        return 3400;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public Bd getB() {
        return b;
    }

    public void setB(Bd b) {
        this.b = b;
    }

    public int[] getStepA() {
        return stepArray;
    }

    public void setStepA(int[] stepArray) {
        this.stepArray = stepArray;
    }

    public int[] getDirection() {
        return directionArray;
    }

    public void setDirection(int[] directionArray) {
        this.directionArray = directionArray;
    }

    public int[] getLeftArm() {
        return leftArmArray;
    }

    public void setLeftArm(int[] leftArmArray) {
        this.leftArmArray = leftArmArray;
    }

    public int[] getRightArm() {
        return rightArmArray;
    }

    public void setRightArm(int[] rightArmArray) {
        this.rightArmArray = rightArmArray;
    }

    public int[] getEyebrows() {
        return eyebrowsArray;
    }

    public void setEyebrows(int[] eyebrowsArray) {
        this.eyebrowsArray = eyebrowsArray;
    }

    public int[] getEyes() {
        return eyesArray;
    }

    public void setEyes(int[] eyesArray) {
        this.eyesArray = eyesArray;
    }

    public int[] getMouthSmile() {
        return mouthSmileArray;
    }

    public void setMouthSmile(int[] mouthSmileArray) {
        this.mouthSmileArray = mouthSmileArray;
    }

    public int[] getMouthTeeth() {
        return mouthTeethArray;
    }

    public void setMouthTeeth(int[] mouthTeethArray) {
        this.mouthTeethArray = mouthTeethArray;
    }

    public int[] getInFront() {
        return inFrontArray;
    }

    public void setInFront(int[] inFrontArray) {
        this.inFrontArray = inFrontArray;
    }

    public clts.Paintable[] getObjs() {
        return objs;
    }

    public void setObjs(clts.Paintable[] objs) {
        this.objs = objs;
        setPaintObjects(getOriginalPOAMH());
    }

    public TreeSet<util.PaintableObjectAndMethodHolder> getPaintObjects() {
        return paintObjects;
    }

    public void setPaintObjects(TreeSet<util.PaintableObjectAndMethodHolder> paintObjects) {
        this.paintObjects = paintObjects;
    }
}
