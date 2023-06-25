
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class UserOperationsUI extends javax.swing.JFrame {
    
    private static User currentUser;
    
    private UserManagement userManagement;
    
    private DefaultTableModel childrenTableModel;
    /**
     * Creates new form ShowReportUI
     */
    public UserOperationsUI(User currentUser) {
        initComponents();
        
        this.currentUser = currentUser;
        prFullNameTF.setText(currentUser.getFullName());
        prUserNameTF.setText(currentUser.getUsername());
        prPasswordTF.setText(currentUser.getPassword());
        
        userManagement = new UserManagement();
        
        childrenTableModel = new CustomTableModel(childrenTable).loadChildrenTableModel(userManagement.getChildren());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userOperationsPanel = new javax.swing.JPanel();
        updateAdminPanel = new javax.swing.JPanel();
        prFullNameTF = new javax.swing.JTextField();
        prUserNameTF = new javax.swing.JTextField();
        prPasswordTF = new javax.swing.JTextField();
        updateAdminLabel = new javax.swing.JLabel();
        updateAdminButton = new javax.swing.JButton();
        addChildPanel = new javax.swing.JPanel();
        chFullNameTF = new javax.swing.JTextField();
        chUserNameTF = new javax.swing.JTextField();
        chPasswordTF = new javax.swing.JTextField();
        addChildLabel = new javax.swing.JLabel();
        addChildButton = new javax.swing.JButton();
        deleteChildPanel = new javax.swing.JPanel();
        delChildLabel = new javax.swing.JLabel();
        delChildButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        childrenTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/5,Toolkit.getDefaultToolkit().getScreenSize().height/10);

        userOperationsPanel.setBackground(new java.awt.Color(8, 131, 149));
        userOperationsPanel.setPreferredSize(new java.awt.Dimension(800, 550));

        updateAdminPanel.setBackground(new java.awt.Color(5, 191, 219));
        updateAdminPanel.setPreferredSize(new java.awt.Dimension(394, 272));

        prFullNameTF.setBackground(new java.awt.Color(5, 191, 219));
        prFullNameTF.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        prFullNameTF.setForeground(new java.awt.Color(238, 238, 238));
        prFullNameTF.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true), "İsim Soyisim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 12), new java.awt.Color(238, 238, 238))); // NOI18N

        prUserNameTF.setBackground(new java.awt.Color(5, 191, 219));
        prUserNameTF.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        prUserNameTF.setForeground(new java.awt.Color(238, 238, 238));
        prUserNameTF.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true), "Kullanıcı Adı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 12), new java.awt.Color(238, 238, 238))); // NOI18N

        prPasswordTF.setBackground(new java.awt.Color(5, 191, 219));
        prPasswordTF.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        prPasswordTF.setForeground(new java.awt.Color(238, 238, 238));
        prPasswordTF.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true), "Şifre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 12), new java.awt.Color(238, 238, 238))); // NOI18N

        updateAdminLabel.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        updateAdminLabel.setForeground(new java.awt.Color(238, 238, 238));
        updateAdminLabel.setText("      Ebeveyn Güncelle");
        updateAdminLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        updateAdminButton.setBackground(new java.awt.Color(8, 131, 149));
        updateAdminButton.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        updateAdminButton.setForeground(new java.awt.Color(238, 238, 238));
        updateAdminButton.setText("Güncelle");
        updateAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateAdminPanelLayout = new javax.swing.GroupLayout(updateAdminPanel);
        updateAdminPanel.setLayout(updateAdminPanelLayout);
        updateAdminPanelLayout.setHorizontalGroup(
            updateAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateAdminPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(updateAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateAdminButton)
                    .addGroup(updateAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(prFullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prUserNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(updateAdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateAdminPanelLayout.setVerticalGroup(
            updateAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateAdminPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(updateAdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prFullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prUserNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        addChildPanel.setBackground(new java.awt.Color(5, 191, 219));
        addChildPanel.setPreferredSize(new java.awt.Dimension(394, 272));

        chFullNameTF.setBackground(new java.awt.Color(5, 191, 219));
        chFullNameTF.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        chFullNameTF.setForeground(new java.awt.Color(238, 238, 238));
        chFullNameTF.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true), "İsim Soyisim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 12), new java.awt.Color(238, 238, 238))); // NOI18N

        chUserNameTF.setBackground(new java.awt.Color(5, 191, 219));
        chUserNameTF.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        chUserNameTF.setForeground(new java.awt.Color(238, 238, 238));
        chUserNameTF.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true), "Kullanıcı Adı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 12), new java.awt.Color(238, 238, 238))); // NOI18N

        chPasswordTF.setBackground(new java.awt.Color(5, 191, 219));
        chPasswordTF.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        chPasswordTF.setForeground(new java.awt.Color(238, 238, 238));
        chPasswordTF.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true), "Şifre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 12), new java.awt.Color(238, 238, 238))); // NOI18N

        addChildLabel.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        addChildLabel.setForeground(new java.awt.Color(238, 238, 238));
        addChildLabel.setText("      Çocuk Ekle");
        addChildLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addChildButton.setBackground(new java.awt.Color(8, 131, 149));
        addChildButton.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        addChildButton.setForeground(new java.awt.Color(238, 238, 238));
        addChildButton.setText("Ekle");
        addChildButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChildButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addChildPanelLayout = new javax.swing.GroupLayout(addChildPanel);
        addChildPanel.setLayout(addChildPanelLayout);
        addChildPanelLayout.setHorizontalGroup(
            addChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addChildPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(addChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addChildButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chFullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chUserNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(addChildLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addChildPanelLayout.setVerticalGroup(
            addChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addChildPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addChildLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chFullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chUserNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addChildButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        deleteChildPanel.setBackground(new java.awt.Color(5, 191, 219));
        deleteChildPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        delChildLabel.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        delChildLabel.setForeground(new java.awt.Color(238, 238, 238));
        delChildLabel.setText("      Çocuk Sil");
        delChildLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        delChildButton.setBackground(new java.awt.Color(8, 131, 149));
        delChildButton.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        delChildButton.setForeground(new java.awt.Color(238, 238, 238));
        delChildButton.setText("Sil");
        delChildButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delChildButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(0, 255, 202));
        homeButton.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(238, 238, 238));
        homeButton.setText("Ana Sayfa");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(10, 77, 104));
        jScrollPane3.setForeground(new java.awt.Color(238, 238, 238));

        childrenTable.setBackground(new java.awt.Color(10, 77, 104));
        childrenTable.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        childrenTable.setForeground(new java.awt.Color(238, 238, 238));
        childrenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İsim"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
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
        childrenTable.setFocusable(false);
        childrenTable.setGridColor(new java.awt.Color(0, 0, 51));
        childrenTable.setSelectionBackground(new java.awt.Color(8, 131, 149));
        childrenTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        childrenTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        childrenTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        childrenTable.setShowGrid(true);
        childrenTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(childrenTable);
        childrenTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (childrenTable.getColumnModel().getColumnCount() > 0) {
            childrenTable.getColumnModel().getColumn(0).setMinWidth(40);
            childrenTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            childrenTable.getColumnModel().getColumn(0).setMaxWidth(50);
            childrenTable.getColumnModel().getColumn(1).setMinWidth(150);
            childrenTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        javax.swing.GroupLayout deleteChildPanelLayout = new javax.swing.GroupLayout(deleteChildPanel);
        deleteChildPanel.setLayout(deleteChildPanelLayout);
        deleteChildPanelLayout.setHorizontalGroup(
            deleteChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteChildPanelLayout.createSequentialGroup()
                .addGroup(deleteChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteChildPanelLayout.createSequentialGroup()
                        .addComponent(delChildLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeButton))
                    .addGroup(deleteChildPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(deleteChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delChildButton, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        deleteChildPanelLayout.setVerticalGroup(
            deleteChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteChildPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delChildLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(delChildButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout userOperationsPanelLayout = new javax.swing.GroupLayout(userOperationsPanel);
        userOperationsPanel.setLayout(userOperationsPanelLayout);
        userOperationsPanelLayout.setHorizontalGroup(
            userOperationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userOperationsPanelLayout.createSequentialGroup()
                .addGroup(userOperationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addChildPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteChildPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userOperationsPanelLayout.setVerticalGroup(
            userOperationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userOperationsPanelLayout.createSequentialGroup()
                .addComponent(updateAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addChildPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(deleteChildPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userOperationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userOperationsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delChildButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delChildButtonActionPerformed
        
        int selectedRow = childrenTable.getSelectedRow();
        
        if(selectedRow == -1){
            
            if(childrenTable.getRowCount() == 0){
                
                JOptionPane.showMessageDialog(this, "Silinecek Çocuk Yok", "Hata!", JOptionPane.ERROR_MESSAGE);
            }else{
                
                JOptionPane.showMessageDialog(this, "Lütfen Tablodan Silinecek Çocuğu Seçiniz", "Hata!", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            
            //Silme onayı
            int option = JOptionPane.showConfirmDialog(this, "ID Numarası " + childrenTableModel.getValueAt(selectedRow, 0) + " Olan Çocuğu Silmek İstiyor Musunuz?", "Onay", JOptionPane.YES_NO_OPTION);
            
            if(option == JOptionPane.YES_OPTION){
                
                if(userManagement.delChild((int)childrenTable.getValueAt(selectedRow, 0))){

                    childrenTableModel.removeRow(selectedRow);
                }else{

                    JOptionPane.showMessageDialog(this, "Silme İşlemi başarısız", "Hata!", JOptionPane.ERROR_MESSAGE);
                }    
            }
        }
    }//GEN-LAST:event_delChildButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        
        dispose();
        new ParentMainUI(currentUser).setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void addChildButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChildButtonActionPerformed
        
        String fullName = chFullNameTF.getText();
        String userName = chUserNameTF.getText();
        String password = chPasswordTF.getText();
        
        //Boş değer yoksa
        if(!fullName.isEmpty() && !userName.isEmpty() && !password.isEmpty()){
            
            int ID = userManagement.addChild(fullName, userName, password);
            JOptionPane.showMessageDialog(this, 
                    fullName + " " 
                    + userManagement.getChildren().get(userManagement.getChildren().size() - 1).getID()
                    + " ID numarası ile başarıyla eklendi."
            );
            
            childrenTableModel = CustomTableModel.addChildRow(childrenTableModel, ID, fullName);
            
            chFullNameTF.setText("");
            chUserNameTF.setText("");
            chPasswordTF.setText("");
        }else{
            
            JOptionPane.showMessageDialog(this, "Lütfen Gerekli Bütün Alanları Doldurunuz", "Hata!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addChildButtonActionPerformed

    private void updateAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAdminButtonActionPerformed
        
        String fullName = prFullNameTF.getText();
        String userName = prUserNameTF.getText();
        String password = prPasswordTF.getText();
        
        //Boş değer yoksa
        if(!fullName.isEmpty() && !userName.isEmpty() && !password.isEmpty()){
            
            userManagement.updateAdmin(fullName, userName, password);
            JOptionPane.showMessageDialog(this, 
                    fullName + " yeni admin olarak ayarlandı."
            );
            
            currentUser = userManagement.getAdmin();
        }else{
            
            JOptionPane.showMessageDialog(this, "Lütfen Gerekli Bütün Alanları Doldurunuz", "Hata!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateAdminButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserOperationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserOperationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserOperationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserOperationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserOperationsUI(currentUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addChildButton;
    private javax.swing.JLabel addChildLabel;
    private javax.swing.JPanel addChildPanel;
    private javax.swing.JTextField chFullNameTF;
    private javax.swing.JTextField chPasswordTF;
    private javax.swing.JTextField chUserNameTF;
    private javax.swing.JTable childrenTable;
    private javax.swing.JButton delChildButton;
    private javax.swing.JLabel delChildLabel;
    private javax.swing.JPanel deleteChildPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField prFullNameTF;
    private javax.swing.JTextField prPasswordTF;
    private javax.swing.JTextField prUserNameTF;
    private javax.swing.JButton updateAdminButton;
    private javax.swing.JLabel updateAdminLabel;
    private javax.swing.JPanel updateAdminPanel;
    private javax.swing.JPanel userOperationsPanel;
    // End of variables declaration//GEN-END:variables
}
