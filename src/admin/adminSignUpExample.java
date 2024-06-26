/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import carOwner.*;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.loginForm;
import login.signupForm;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sheila mae albarando
 */
public class adminSignUpExample extends javax.swing.JFrame {

    /**
     * Creates new form carOwnerRegistrationCar
     */
    public adminSignUpExample() {
        initComponents();
        displayData();
    }
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_user");
            table_car.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
    }
    
    public static String email, usname;
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String sql = "SELECT * FROM tbl_user WHERE u_username = '"+username.getText()+"'OR u_email = '"+em.getText()+"'";
            ResultSet rs = dbc.getData(sql);
            
            if(rs.next()){
                email = rs.getString("u_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used.");
                    em.setText("");
                }
                usname = rs.getString("u_username");
                if(usname.equals(username.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used.");
                    username.setText("");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_car = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        userType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        addData = new javax.swing.JButton();
        editData = new javax.swing.JButton();
        updateData = new javax.swing.JButton();
        deleteData = new javax.swing.JButton();
        refreshData = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        table_car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_carMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_car);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 0, 560, 490);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 60, 570, 490);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        fname.setForeground(new java.awt.Color(0, 0, 204));
        fname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(fname);
        fname.setBounds(10, 10, 250, 40);

        lname.setForeground(new java.awt.Color(0, 0, 204));
        lname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lname);
        lname.setBounds(10, 80, 250, 40);

        em.setForeground(new java.awt.Color(0, 0, 204));
        em.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(em);
        em.setBounds(10, 150, 250, 40);

        username.setForeground(new java.awt.Color(0, 0, 204));
        username.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(username);
        username.setBounds(10, 220, 250, 40);

        password.setForeground(new java.awt.Color(0, 0, 204));
        password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(password);
        password.setBounds(10, 290, 250, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText(" First Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText(" Last Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 120, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText(" Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 190, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 260, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText(" Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 330, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("User Status");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 470, 250, 30);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        status.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(status);
        status.setBounds(10, 430, 250, 40);

        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin", "Car Owner" }));
        userType.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(userType);
        userType.setBounds(10, 360, 250, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("User Type");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 400, 250, 30);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(580, 60, 270, 530);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Admin Sign Up");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(0, 0, 840, 40);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(10, 10, 840, 40);

        addData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addData.setText("Add Data");
        addData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataActionPerformed(evt);
            }
        });
        jPanel2.add(addData);
        addData.setBounds(20, 600, 120, 30);

        editData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editData.setText("Edit Data");
        editData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(editData);
        editData.setBounds(180, 600, 130, 30);

        updateData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateData.setText("Update Data");
        jPanel2.add(updateData);
        updateData.setBounds(350, 600, 140, 30);

        deleteData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteData.setText("Delete Data");
        deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataActionPerformed(evt);
            }
        });
        jPanel2.add(deleteData);
        deleteData.setBounds(540, 600, 140, 30);

        refreshData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshData.setText("Refresh Data");
        jPanel2.add(refreshData);
        refreshData.setBounds(710, 600, 130, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(710, 650, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataActionPerformed
        dbConnector dbc = new dbConnector();
        String userAccountType = userType.getSelectedItem().toString();
    
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || em.getText().isEmpty() || username.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all required Data.");
        }else if(password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all required Data.");
        }else if (password.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters or Above.");
            password.setText("");
        }else if(duplicateCheck()){    
            System.out.println("Duplicated Exist");
        }else if(userAccountType.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select an account type.");
        }else{
            if(dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_username, u_password, u_account, u_status) VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+em.getText()+"', '"+username.getText()+"', '"+password.getText()+"', '"+userType.getSelectedItem()+"','"+status.getSelectedItem()+"')")){                                        
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                adminUsersForm aus = new adminUsersForm();
                aus.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    }//GEN-LAST:event_addDataActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        loginForm log = new loginForm();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table_carMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_carMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_carMouseClicked

    private void deleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteDataActionPerformed

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
            java.util.logging.Logger.getLogger(adminSignUpExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminSignUpExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminSignUpExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminSignUpExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminSignUpExample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addData;
    private javax.swing.JButton deleteData;
    private javax.swing.JButton editData;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField password;
    private javax.swing.JButton refreshData;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable table_car;
    private javax.swing.JButton updateData;
    private javax.swing.JComboBox<String> userType;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
