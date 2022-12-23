/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import database.DbConnection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ChangingPassScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChangingPassScreen
     */
    
    public ChangingPassScreen() {
        initComponents();

    }
    
     public boolean testpassword(){
        
        Connection conn=DbConnection.getconnection();
        
        boolean isValid=false;
        
        try{
            String username=lblusername.getText();
            String query1="Select password from Admin where username=?";
            PreparedStatement usernamePST=conn.prepareStatement(query1);
            usernamePST.setString(1, username);
            
            java.sql.ResultSet rs1=usernamePST.executeQuery();
            if (rs1.next()){
            
                isValid=true;
            
            }
            else{
            
            isValid=false;
            }
        
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, e); 
        }
        return isValid;
        }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated b{y the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        btn_change = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        tf_opass = new javax.swing.JPasswordField();
        lbluname = new java.awt.Label();
        label3 = new java.awt.Label();
        tf_npass = new javax.swing.JPasswordField();
        tf_cpass = new javax.swing.JPasswordField();
        lblcnfpass = new java.awt.Label();
        lbloldpass1 = new java.awt.Label();
        lblusername = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/12345.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        label1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Change");

        label2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 36)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Password ");

        btn_change.setBackground(new java.awt.Color(153, 0, 153));
        btn_change.setForeground(new java.awt.Color(255, 255, 255));
        btn_change.setText("Change");
        btn_change.setBorder(null);
        btn_change.setBorderPainted(false);
        btn_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeActionPerformed(evt);
            }
        });

        tf_opass.setBackground(new java.awt.Color(204, 204, 204));
        tf_opass.setText("jPasswordField1");
        tf_opass.setToolTipText("");
        tf_opass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_opass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_opassActionPerformed(evt);
            }
        });

        lbluname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbluname.setForeground(new java.awt.Color(255, 255, 255));
        lbluname.setText("Username :");

        label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Enter New Password :");

        tf_npass.setBackground(new java.awt.Color(204, 204, 204));
        tf_npass.setText("jPasswordField2");
        tf_npass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_cpass.setBackground(new java.awt.Color(204, 204, 204));
        tf_cpass.setText("jPasswordField3");
        tf_cpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblcnfpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblcnfpass.setForeground(new java.awt.Color(255, 255, 255));
        lblcnfpass.setText("Confirm Password :");

        lbloldpass1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbloldpass1.setForeground(new java.awt.Color(255, 255, 255));
        lbloldpass1.setText("Enter Old Password :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblcnfpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_cpass, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_npass, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_change, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbloldpass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_opass, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbluname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27))))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbluname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_opass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbloldpass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_npass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_cpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcnfpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_change, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeActionPerformed

            String username=lblusername.getText();
            String old_pass=tf_opass.getText();
            String new_pass=tf_npass.getText();
            String cnf_pass=tf_cpass.getText(); 
            
            
            if(old_pass.equals("")||new_pass.equals("")||cnf_pass.equals("")){
          JOptionPane.showMessageDialog(null, "Please Fill all the details");
          
        
    }
            else if (testpassword()==false){
            
                JOptionPane.showMessageDialog(null, "Invalid password","Wrong Password",JOptionPane.ERROR_MESSAGE);
            
            }
            else if(!new_pass.trim().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")){
    
           JOptionPane.showMessageDialog(rootPane, "Password must contail Uppercase, lowercase ,Symbol and number","Invalid Password",JOptionPane.ERROR_MESSAGE);
         
    }
        else if(!new_pass.equals(cnf_pass)){
              JOptionPane.showMessageDialog(rootPane, "Password must be same");
          }else{
        
        try{
             String query="update Admin set Password='"+new_pass+"' where username='"+username+"'";
                    Connection conn=DbConnection.getconnection();
                    PreparedStatement pst=conn.prepareStatement(query);
                    int isupdated=pst.executeUpdate();
                    if(isupdated>0){
                    
                        JOptionPane.showMessageDialog(null, "Password Changed Succesfully","Success",JOptionPane.INFORMATION_MESSAGE);
                       
                    
                    }}catch(SQLException e){System.out.println(e);}
        
            
            
        }
                                 

            
            
            
            
            
            
         
        
    }//GEN-LAST:event_btn_changeActionPerformed

    private void tf_opassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_opassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_opassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_change;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label lblcnfpass;
    private java.awt.Label lbloldpass1;
    private java.awt.Label lbluname;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPasswordField tf_cpass;
    private javax.swing.JPasswordField tf_npass;
    private javax.swing.JPasswordField tf_opass;
    // End of variables declaration//GEN-END:variables

    private static class ResultSet {

        public ResultSet() {
        }
    }
}
