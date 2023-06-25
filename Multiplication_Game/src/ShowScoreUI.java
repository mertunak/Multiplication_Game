
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class ShowScoreUI extends javax.swing.JFrame {
    
    private static User currentUser;
    private static Exercise exercise;
    private static Score exerciseScore;
    
    private DefaultTableModel highScoresTableModel;
    
    /**
     * Creates new form ShowScoreUI
     */
    public ShowScoreUI(User currentUser, Exercise exercise, Score exerciseScore) {
        initComponents();
        
        this.currentUser = currentUser;
        this.exercise = exercise;
        this.exerciseScore = exerciseScore;
        
        highScoresTableModel = new CustomTableModel(highScoreTable).loadLeaderBoardTableModel(exercise.getHighScores());
        
        correctnessScoreLabel.setText(String.format("%.1f", exerciseScore.getCorrectnessScore()));
        timeScoreLabel.setText(String.format("%.1f", exerciseScore.getTimeScore()));
        totalScoreLabel.setText(String.format("%.1f", exerciseScore.getTotalScore()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showScorePanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        highScoreTable = new javax.swing.JTable();
        yourScoreLabel = new javax.swing.JLabel();
        scoreTableLabel = new javax.swing.JLabel();
        timeScoreLabel = new javax.swing.JLabel();
        correctnessScoreLabel = new javax.swing.JLabel();
        totalScoreLabel = new javax.swing.JLabel();
        correctnessTitle = new javax.swing.JLabel();
        timeTitle = new javax.swing.JLabel();
        totalTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/5,Toolkit.getDefaultToolkit().getScreenSize().height/10);

        showScorePanel.setBackground(new java.awt.Color(5, 191, 219));
        showScorePanel.setPreferredSize(new java.awt.Dimension(800, 550));
        showScorePanel.setRequestFocusEnabled(false);
        showScorePanel.setVerifyInputWhenFocusTarget(false);

        backButton.setBackground(new java.awt.Color(0, 255, 202));
        backButton.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(238, 238, 238));
        backButton.setText("Geri Dön");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(10, 77, 104));
        jScrollPane3.setForeground(new java.awt.Color(238, 238, 238));
        jScrollPane3.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N

        highScoreTable.setBackground(new java.awt.Color(10, 77, 104));
        highScoreTable.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        highScoreTable.setForeground(new java.awt.Color(238, 238, 238));
        highScoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı Adı", "Toplam Skor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        highScoreTable.setFocusable(false);
        highScoreTable.setGridColor(new java.awt.Color(0, 0, 51));
        highScoreTable.setSelectionBackground(new java.awt.Color(8, 131, 149));
        highScoreTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        highScoreTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        highScoreTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        highScoreTable.setShowGrid(true);
        highScoreTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(highScoreTable);
        highScoreTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (highScoreTable.getColumnModel().getColumnCount() > 0) {
            highScoreTable.getColumnModel().getColumn(0).setMinWidth(150);
            highScoreTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            highScoreTable.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        yourScoreLabel.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        yourScoreLabel.setForeground(new java.awt.Color(238, 238, 238));
        yourScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourScoreLabel.setText("Skorunuz");
        yourScoreLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        scoreTableLabel.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        scoreTableLabel.setForeground(new java.awt.Color(238, 238, 238));
        scoreTableLabel.setText("Yüksek Skor Tablosu");

        timeScoreLabel.setBackground(new java.awt.Color(170, 119, 255));
        timeScoreLabel.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        timeScoreLabel.setForeground(new java.awt.Color(238, 238, 238));
        timeScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeScoreLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        timeScoreLabel.setOpaque(true);

        correctnessScoreLabel.setBackground(new java.awt.Color(170, 119, 255));
        correctnessScoreLabel.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        correctnessScoreLabel.setForeground(new java.awt.Color(238, 238, 238));
        correctnessScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correctnessScoreLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        correctnessScoreLabel.setOpaque(true);

        totalScoreLabel.setBackground(new java.awt.Color(170, 119, 255));
        totalScoreLabel.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        totalScoreLabel.setForeground(new java.awt.Color(238, 238, 238));
        totalScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalScoreLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        totalScoreLabel.setOpaque(true);

        correctnessTitle.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        correctnessTitle.setForeground(new java.awt.Color(238, 238, 238));
        correctnessTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correctnessTitle.setText("Doğruluk Skoru");
        correctnessTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        timeTitle.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        timeTitle.setForeground(new java.awt.Color(238, 238, 238));
        timeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeTitle.setText("Hız Skoru");
        timeTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        totalTitle.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        totalTitle.setForeground(new java.awt.Color(238, 238, 238));
        totalTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalTitle.setText("Toplam Skor");
        totalTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout showScorePanelLayout = new javax.swing.GroupLayout(showScorePanel);
        showScorePanel.setLayout(showScorePanelLayout);
        showScorePanelLayout.setHorizontalGroup(
            showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showScorePanelLayout.createSequentialGroup()
                .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(showScorePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton))
                    .addGroup(showScorePanelLayout.createSequentialGroup()
                        .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(showScorePanelLayout.createSequentialGroup()
                                .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(yourScoreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, showScorePanelLayout.createSequentialGroup()
                                        .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, showScorePanelLayout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addComponent(totalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, showScorePanelLayout.createSequentialGroup()
                                                .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(showScorePanelLayout.createSequentialGroup()
                                                        .addGap(28, 28, 28)
                                                        .addComponent(correctnessTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(showScorePanelLayout.createSequentialGroup()
                                                        .addGap(56, 56, 56)
                                                        .addComponent(correctnessScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(showScorePanelLayout.createSequentialGroup()
                                                        .addGap(32, 32, 32)
                                                        .addComponent(timeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showScorePanelLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(timeScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(21, 21, 21)))))
                                        .addGap(0, 34, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(showScorePanelLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(totalScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scoreTableLabel)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        showScorePanelLayout.setVerticalGroup(
            showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showScorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showScorePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(showScorePanelLayout.createSequentialGroup()
                        .addComponent(yourScoreLabel)
                        .addGap(67, 67, 67)
                        .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correctnessTitle)
                            .addComponent(timeTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(showScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correctnessScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showScorePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        dispose();
        new GameScreenUI(currentUser, exercise).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaulParentPanelsed" desc="ParentPanel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(ShowScoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowScoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowScoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowScoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowScoreUI(currentUser, exercise, exerciseScore).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel correctnessScoreLabel;
    private javax.swing.JLabel correctnessTitle;
    private javax.swing.JTable highScoreTable;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel scoreTableLabel;
    private javax.swing.JPanel showScorePanel;
    private javax.swing.JLabel timeScoreLabel;
    private javax.swing.JLabel timeTitle;
    private javax.swing.JLabel totalScoreLabel;
    private javax.swing.JLabel totalTitle;
    private javax.swing.JLabel yourScoreLabel;
    // End of variables declaration//GEN-END:variables
}