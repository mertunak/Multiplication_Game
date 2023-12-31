
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class DetailedReportUI extends javax.swing.JFrame {
    
    private static User currentUser;
    
    private static ArrayList<String[]> questionReports;
    private DefaultTableModel questionReportTableModel;
    
    private int correctNum;
    
    private DefaultCategoryDataset barDataset;
    private JFreeChart barChart;
    private CategoryPlot barCategoryPlot;
    private ChartPanel barChartPanel;
    
    private DefaultPieDataset pieDataset;
    private JFreeChart pieChart;
    private PiePlot piePlot;
    private ChartPanel pieChartPanel;
    /**
     * Creates new form DetailedReportUI
     */
    public DetailedReportUI(User currentUser, ArrayList<String[]> questionReports) {
        initComponents();
        
        this.currentUser = currentUser;
        this.questionReports = questionReports;
        
        this.correctNum = 0;
        for (String[] questionReport : questionReports) {
            
            if(questionReport[2].equals("D")){                                             //Grafiklerde kullanmak için doğru sayısı hesaplama
                
                this.correctNum++;
            }
        }
        
        questionReportTableModel = new CustomTableModel(reportsTable).loadQuestionReportTableModel(questionReports);
        
        showBarChart();
        showPieChart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reportsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        questionsLabel = new javax.swing.JLabel();
        timeCorrectnessPanel = new javax.swing.JPanel();
        timeTFLabel = new javax.swing.JLabel();
        correctnessPanel = new javax.swing.JPanel();
        tFLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/5,Toolkit.getDefaultToolkit().getScreenSize().height/10);

        reportPanel.setBackground(new java.awt.Color(5, 191, 219));
        reportPanel.setMaximumSize(new java.awt.Dimension(291, 1));
        reportPanel.setPreferredSize(new java.awt.Dimension(800, 550));
        reportPanel.setRequestFocusEnabled(false);
        reportPanel.setVerifyInputWhenFocusTarget(false);

        jScrollPane3.setBackground(new java.awt.Color(10, 77, 104));
        jScrollPane3.setForeground(new java.awt.Color(238, 238, 238));
        jScrollPane3.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N

        reportsTable.setBackground(new java.awt.Color(10, 77, 104));
        reportsTable.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        reportsTable.setForeground(new java.awt.Color(238, 238, 238));
        reportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Soru", "Süre", "D/Y"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportsTable.setFocusable(false);
        reportsTable.setGridColor(new java.awt.Color(0, 0, 51));
        reportsTable.setSelectionBackground(new java.awt.Color(8, 131, 149));
        reportsTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        reportsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        reportsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        reportsTable.setShowGrid(true);
        reportsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(reportsTable);
        if (reportsTable.getColumnModel().getColumnCount() > 0) {
            reportsTable.getColumnModel().getColumn(0).setMinWidth(40);
            reportsTable.getColumnModel().getColumn(0).setMaxWidth(40);
            reportsTable.getColumnModel().getColumn(3).setMinWidth(30);
            reportsTable.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        backButton.setBackground(new java.awt.Color(0, 255, 202));
        backButton.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(238, 238, 238));
        backButton.setText("Geri Dön");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        questionsLabel.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        questionsLabel.setForeground(new java.awt.Color(238, 238, 238));
        questionsLabel.setText("Sorular");

        timeCorrectnessPanel.setBackground(new java.awt.Color(151, 222, 255));
        timeCorrectnessPanel.setMaximumSize(new java.awt.Dimension(520, 250));
        timeCorrectnessPanel.setLayout(new java.awt.BorderLayout());

        timeTFLabel.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        timeTFLabel.setForeground(new java.awt.Color(238, 238, 238));
        timeTFLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeTFLabel.setText("Soru Zamanlama ve Doğruluk");

        correctnessPanel.setBackground(new java.awt.Color(151, 222, 255));
        correctnessPanel.setMaximumSize(new java.awt.Dimension(286, 188));
        correctnessPanel.setLayout(new java.awt.BorderLayout());

        tFLabel.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        tFLabel.setForeground(new java.awt.Color(238, 238, 238));
        tFLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tFLabel.setText("Doğru/Yanlış Oranı");

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportPanelLayout.createSequentialGroup()
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tFLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(correctnessPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(137, 137, 137))
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timeTFLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(timeCorrectnessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportPanelLayout.createSequentialGroup()
                        .addComponent(questionsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(questionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeTFLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addComponent(timeCorrectnessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correctnessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        dispose();
        new ReportsUI(currentUser).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    public void showPieChart(){
        
        //Doğru-Yanlış oranı grafiği oluşturma ve gösterme
        
        pieDataset = new DefaultPieDataset();
        
        //Doğru-Yanlış sayısını grafiğe atama
        pieDataset.setValue("Doğru", correctNum);
        pieDataset.setValue("Yanlış", questionReports.size()- correctNum);
        
        pieChart = ChartFactory.createPieChart("", pieDataset, true, true, false);
        
        piePlot = (PiePlot)pieChart.getPlot();
        piePlot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} ({1})"));       //Doğru-Yanlış sayılarının grafikte gösterilmesi
        
        piePlot.setBackgroundPaint(new Color(151, 222, 255));
        piePlot.setSectionPaint("Doğru", new Color(0, 255, 0));                             //Doğru kısmına yeşil renk verme
        piePlot.setSectionPaint("Yanlış", new Color(255, 0, 0));                            //Yanlış kısmına kırmızı renk verme
        pieChartPanel = new ChartPanel(pieChart);
        pieChartPanel.setPreferredSize(new Dimension(286, 188));
        correctnessPanel.removeAll();
        correctnessPanel.add(pieChartPanel, BorderLayout.CENTER);
        pieChartPanel.validate();
    }
    
    public void showBarChart(){
        
        //Soru çözüm süresi grafiği oluşturma
        
        barDataset = new DefaultCategoryDataset();
        
        int i = 1;
        for (String[] questionReport : questionReports) {
            
            barDataset.setValue(Integer.parseInt(questionReport[1]), "","Soru" + i);        //Çözüm sürelerini grafiğe atama
            i++;
        }
        
        barChart = ChartFactory.createBarChart("", "", "Saniye", barDataset, PlotOrientation.VERTICAL, true, true, false);
        
        barCategoryPlot = (CategoryPlot)barChart.getCategoryPlot();
        barCategoryPlot.setBackgroundPaint(new Color(151, 222, 255));
        
        //Soruların barlarını doğruluk durumuna göre renklendirme
        BarRenderer renderer = new BarRenderer() {
            @Override
            public Paint getItemPaint(int row, int column) {
                
                if(questionReports.get(column)[2].equals("D")){
                        
                    return new Color(0, 255, 0);                                            //Doğru sorulara yeşil renk verme
                }else{
                        
                    return new Color(255, 0, 0);                                            //Yanlış sorulara kırmızı renk verme
                }
            }
        };
        barCategoryPlot.setRenderer(renderer);
        
        barChartPanel = new ChartPanel(barChart);
        barChartPanel.setPreferredSize(new Dimension(520, 250));
        timeCorrectnessPanel.removeAll();
        timeCorrectnessPanel.add(barChartPanel, BorderLayout.CENTER);
        barChartPanel.validate();
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
            java.util.logging.Logger.getLogger(DetailedReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailedReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailedReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailedReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailedReportUI(currentUser, questionReports).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel correctnessPanel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel questionsLabel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JTable reportsTable;
    private javax.swing.JLabel tFLabel;
    private javax.swing.JPanel timeCorrectnessPanel;
    private javax.swing.JLabel timeTFLabel;
    // End of variables declaration//GEN-END:variables
}
