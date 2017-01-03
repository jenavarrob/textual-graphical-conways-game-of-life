
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author navarro
 */
public class ConwaysJFrameForm extends javax.swing.JFrame {

    private static final Random random = new Random();
    boolean[][] _welt;
    boolean[][] _welt_neu;
    boolean[][] _gwelt;
    boolean[][] _gwelt_neu;

    /**
     * Creates new form ConwaysJFrameForm
     */
    public ConwaysJFrameForm() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Text = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        canvas1 = new java.awt.Canvas();
        jPanel_Text = new javax.swing.JPanel();
        jTextButton_NumGenerations = new javax.swing.JButton();
        jTextField_NumGenerations = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton_Graphical = new javax.swing.JButton();
        jButton_InitializeText = new javax.swing.JButton();
        jButton_StepText = new javax.swing.JButton();
        jButton_InitializeGraphical = new javax.swing.JButton();
        jButton_StepGraphical = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Text.setText("Text");
        jButton_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TextActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextButton_NumGenerations.setText("Text Random");
        jTextButton_NumGenerations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextButton_NumGenerationsActionPerformed(evt);
            }
        });

        jTextField_NumGenerations.setText("2");
        jTextField_NumGenerations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NumGenerationsActionPerformed(evt);
            }
        });

        jLabel1.setText("Anzahl von Generationen:");

        jButton_Graphical.setText("Graphical");
        jButton_Graphical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GraphicalActionPerformed(evt);
            }
        });

        jButton_InitializeText.setText("Initialize");
        jButton_InitializeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InitializeTextActionPerformed(evt);
            }
        });

        jButton_StepText.setText("Step");
        jButton_StepText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StepTextActionPerformed(evt);
            }
        });

        jButton_InitializeGraphical.setText("Initialize");
        jButton_InitializeGraphical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InitializeGraphicalActionPerformed(evt);
            }
        });

        jButton_StepGraphical.setText("Step");
        jButton_StepGraphical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StepGraphicalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TextLayout = new javax.swing.GroupLayout(jPanel_Text);
        jPanel_Text.setLayout(jPanel_TextLayout);
        jPanel_TextLayout.setHorizontalGroup(
            jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_TextLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_NumGenerations, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextButton_NumGenerations, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_StepText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_InitializeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Graphical, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TextLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_InitializeGraphical))
                    .addComponent(jButton_StepGraphical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_TextLayout.setVerticalGroup(
            jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextLayout.createSequentialGroup()
                .addGroup(jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton_Graphical, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_TextLayout.createSequentialGroup()
                            .addGroup(jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_NumGenerations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_InitializeText)))
                            .addGroup(jPanel_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel_TextLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton_StepText))
                                .addGroup(jPanel_TextLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextButton_NumGenerations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel_TextLayout.createSequentialGroup()
                        .addComponent(jButton_InitializeGraphical)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_StepGraphical)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void gebeAus(boolean[][] m) {   // Ein "X" symbolisiert eine lebendige Zelle
        jTextArea1.append("\n\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (m[i][j]) {
                    jTextArea1.append("1");
                } else {
                    jTextArea1.append("0");
                }
            }
            jTextArea1.append("\n");
        }
    }

    public static int zaehleUmgebung(boolean[][] m, int x, int y) {
        int ret = 0;
        for (int i = (x - 1); i < (x + 2); i++) {
            for (int j = (y - 1); j < (y + 2); j++) {
                if (m[i][j]) {
                    ret++;
                }
            }
        }
        if (m[x][y]) //einen zuviel mitgezaehlt?
        {
            ret--;
        }
        return ret;
    }

    private void jButton_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TextActionPerformed
        // TODO add your handling code here:
        jTextArea1.append("\nGame of Life\n");


// unsere Welt soll "Momentan" aus 10x10 Elemente bestehen
        boolean[][] welt = new boolean[10][10];
        boolean[][] welt_neu = new boolean[10][10];

//Erzeugt erstmal eine Konstellation von Nullen in der Matrix welt.

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                welt[0][0] = false;
            }
        }
//Einige Einsen in der Matrix einstellen (beliebig)
        welt[3][4] = true;
        welt[4][3] = true;
        welt[4][4] = true;
        welt[4][5] = true;
        welt[5][4] = true;
        welt[5][5] = true;
        welt[5][6] = true;
        welt[6][4] = true;
        welt[6][5] = true;
        welt[6][6] = true;
        welt[7][5] = true;

// Ausgabe der ersten Generation
        jTextArea1.append("Generation 1");
        gebeAus(welt);

        int nachbarn;
        for (int i = 1; i < 9; i++) {   //i=1 und i<9 zur Vermeidung arrayOutOfBoundsException
            for (int j = 1; j < 9; j++) {
                // Zaehle die Nachbarn
                nachbarn = zaehleUmgebung(welt, i, j);

                if (welt[ i][ j]) {  //Zell ist am Leben
                    // Regel 1 , 2:
                    if ((nachbarn < 2) || (nachbarn > 3)) {
                        welt_neu[ i][ j] = false;
                    }

                    // Regel 3:
                    if ((nachbarn == 2) || (nachbarn == 3)) {
                        welt_neu[ i][ j] = true;
                    }
                } else {
                    // Regel 4:
                    if (nachbarn == 3) {
                        welt_neu[ i][ j] = true;
                    }
                }
            }
        }

// Ausgabe der zweiten Generation
        jTextArea1.append("Generation 2");
        gebeAus(welt_neu);
    }//GEN-LAST:event_jButton_TextActionPerformed

    private void jButton_GraphicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GraphicalActionPerformed
        // TODO add your handling code here:
        Graphics g = canvas1.getGraphics();

        for (int x = 0; x < canvas1.getWidth(); x++) {
            for (int y = 0; y < canvas1.getHeight(); y++) {
                g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));  //get a new random color
                g.drawLine(x, y, x, y);
            }
        }

    }//GEN-LAST:event_jButton_GraphicalActionPerformed

    private void jTextField_NumGenerationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NumGenerationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NumGenerationsActionPerformed

    private void jTextButton_NumGenerationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextButton_NumGenerationsActionPerformed
        // TODO add your handling code here:
        jTextArea1.append("Game of Life\n");

        // unsere Welt soll "Momentan" aus 10x10 Elemente bestehen
        boolean[][] welt = new boolean[10][10];
        boolean[][] welt_neu = new boolean[10][10];

        //Erzeugt erstmal eine Konstellation von Nullen in der Matrix welt.
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                welt[i][j] = random.nextBoolean();
            }
        }

        // Ausgabe der ersten Generation
        jTextArea1.append("\nGeneration 1\n");
        gebeAus(welt);

        int nachbarn;
        int numGenerations = Integer.parseInt(jTextField_NumGenerations.getText());
        for (int g = 2; g <= numGenerations; g++) {
            for (int i = 1; i < 9; i++) {   //i=1 und i<9 zur Vermeidung arrayOutOfBoundsException
                for (int j = 1; j < 9; j++) {
                    // Zaehle die Nachbarn
                    nachbarn = zaehleUmgebung(welt, i, j);

                    if (welt[ i][ j]) {  //Zell ist am Leben
                        // Regel 1 , 2:
                        if ((nachbarn < 2) || (nachbarn > 3)) {
                            welt_neu[ i][ j] = false;
                        }

                        // Regel 3:
                        if ((nachbarn == 2) || (nachbarn == 3)) {
                            welt_neu[ i][ j] = true;
                        }
                    } else {
                        // Regel 4:
                        if (nachbarn == 3) {
                            welt_neu[ i][ j] = true;
                        }
                    }
                }
            }

            // Ausgabe der zweiten Generation

            jTextArea1.append("\nGeneration " + g + "\n");
            gebeAus(welt_neu);

            //welt_neu zu welt kopieren für die naechste Iteration
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    welt[i][j] = welt_neu[i][j];
                }
            }

        }
    }//GEN-LAST:event_jTextButton_NumGenerationsActionPerformed

    private void jButton_InitializeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InitializeTextActionPerformed
        // TODO add your handling code here:
        _welt = new boolean[10][10];
        _welt_neu = new boolean[10][10];

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                _welt[i][j] = random.nextBoolean();
            }
        }

        jTextArea1.setText("\nGeneration 1\n");
        gebeAus(_welt);
    }//GEN-LAST:event_jButton_InitializeTextActionPerformed

    private void jButton_StepTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StepTextActionPerformed
        // TODO add your handling code here:

        int nachbarn;
        for (int i = 1; i < 9; i++) {   //i=1 und i<9 zur Vermeidung arrayOutOfBoundsException
            for (int j = 1; j < 9; j++) {
                // Zaehle die Nachbarn
                nachbarn = zaehleUmgebung(_welt, i, j);

                if (_welt[ i][ j]) {  //Zell ist am Leben
                    // Regel 1 , 2:
                    if ((nachbarn < 2) || (nachbarn > 3)) {
                        _welt_neu[ i][ j] = false;
                    }

                    // Regel 3:
                    if ((nachbarn == 2) || (nachbarn == 3)) {
                        _welt_neu[ i][ j] = true;
                    }
                } else {
                    // Regel 4:
                    if (nachbarn == 3) {
                        _welt_neu[ i][ j] = true;
                    }
                }
            }
        }

        // Ausgabe der n Generation
        jTextArea1.setText("\nNeue Generation \n");
        gebeAus(_welt_neu);

        //welt_neu zu welt kopieren für die naechste Iteration
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                _welt[i][j] = _welt_neu[i][j];
            }
        }
    }//GEN-LAST:event_jButton_StepTextActionPerformed

    private void jButton_InitializeGraphicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InitializeGraphicalActionPerformed
        // TODO add your handling code here:
        Graphics g = canvas1.getGraphics();

        _gwelt = new boolean[canvas1.getHeight()][canvas1.getWidth()];
        _gwelt_neu = new boolean[canvas1.getHeight()][canvas1.getWidth()];

        for (int i = 1; i < canvas1.getHeight()-1; i++) {
            for (int j = 1; j < canvas1.getWidth()-1; j++) {
                _gwelt[i][j] = random.nextBoolean();
                if (_gwelt[i][j]) {
                    g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));  //get a new random color
                    g.drawLine(i, j, i, j);
                } else {
                    g.setColor(new Color(255, 255, 255));
                    g.drawLine(i, j, i, j);
                }
            }
        }
        g.dispose();
    }//GEN-LAST:event_jButton_InitializeGraphicalActionPerformed

    private void jButton_StepGraphicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StepGraphicalActionPerformed
        // TODO add your handling code here:
        
        Graphics g = canvas1.getGraphics();
                
        int nachbarn;
        for (int i = 1; i < canvas1.getHeight()-1; i++) {   //i=1 und i<9 zur Vermeidung arrayOutOfBoundsException
            for (int j = 1; j < canvas1.getWidth()-1; j++) {
                // Zaehle die Nachbarn
                nachbarn = zaehleUmgebung(_gwelt, i, j);

                if (_gwelt[ i][ j]) {  //Zell ist am Leben
                    // Regel 1 , 2:
                    if ((nachbarn < 2) || (nachbarn > 3)) {
                        _gwelt_neu[ i][ j] = false;
                    }

                    // Regel 3:
                    if ((nachbarn == 2) || (nachbarn == 3)) {
                        _gwelt_neu[ i][ j] = true;
                    }
                } else {
                    // Regel 4:
                    if (nachbarn == 3) {
                        _gwelt_neu[ i][ j] = true;
                    }
                }
            }
        }

        //welt_neu zu welt kopieren für die naechste Iteration
        for (int i = 0; i < canvas1.getHeight()-1; i++) {
            for (int j = 0; j < canvas1.getWidth()-1; j++) {
                _gwelt[i][j] = _gwelt_neu[i][j];

                if (_gwelt[i][j]) {
                    g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));  //get a new random color
                    g.drawLine(i, j, i, j);
                } else {
                    g.setColor(new Color(255, 255, 255));
                    g.drawLine(i, j, i, j);
                }

            }
        }
        
        g.dispose();
    }//GEN-LAST:event_jButton_StepGraphicalActionPerformed

    private Color randomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConwaysJFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConwaysJFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConwaysJFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConwaysJFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConwaysJFrameForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton_Graphical;
    private javax.swing.JButton jButton_InitializeGraphical;
    private javax.swing.JButton jButton_InitializeText;
    private javax.swing.JButton jButton_StepGraphical;
    private javax.swing.JButton jButton_StepText;
    private javax.swing.JButton jButton_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel_Text;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jTextButton_NumGenerations;
    private javax.swing.JTextField jTextField_NumGenerations;
    // End of variables declaration//GEN-END:variables
}
