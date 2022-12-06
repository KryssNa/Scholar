/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;
import database.DbConnection;
import net.proteanit.sql.DbUtils;
import java.awt.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class AddStudentInternalFrame extends javax.swing.JInternalFrame {

Connection conn;
DbConnection dbconn;


ResultSet rs=null;
Statement st;
PreparedStatement pst=null;
    /**
     * Creates new form AddStudentInternalFrame
     */
    public AddStudentInternalFrame() {
        initComponents();
        
            Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        currentDate();
        Update_table();
        
//        txt_emp.setText(String.valueOf(Emp.empId).toString());
    }
   
    public void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
//        lbl_date.setText((month+1)+"/"+day+"/"+year);
        
        //Time
      
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        lbl_time.setText(hour+":"+(minute)+":"+second);
        
       
    }
   
 private void Update_table() {
    try{
        
        conn=dbconn.getconnection();

        String sql ="select std_id as ID,CONCAT(firstname ,' ', surname) as Name,contact as Contact,P_address as Address,gender as Gender,Uname as Username,password as Password from AdminDash_AddStudent";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        student_table.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, "Update Table Error:"+e);
    }
    finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
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

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        r_male = new javax.swing.JRadioButton();
        r_female = new javax.swing.JRadioButton();
        txt_dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        tf_TAddress = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        cmd_save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_studentid = new javax.swing.JTextField();
        tf_Cpass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        lbl_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact Number :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(530, 90, 150, 20);
        jPanel3.add(txt_tel);
        txt_tel.setBounds(720, 90, 168, 20);
        jPanel3.add(txt_email);
        txt_email.setBounds(290, 260, 188, 20);

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(110, 260, 130, 20);

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Gender:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(110, 220, 130, 20);

        r_male.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        r_male.setForeground(new java.awt.Color(255, 255, 255));
        r_male.setText("Male");
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });
        jPanel3.add(r_male);
        r_male.setBounds(300, 220, 80, 30);

        r_female.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        r_female.setForeground(new java.awt.Color(255, 255, 255));
        r_female.setText("Female");
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });
        jPanel3.add(r_female);
        r_female.setBounds(380, 220, 100, 30);
        jPanel3.add(txt_dob);
        txt_dob.setBounds(290, 190, 188, 20);

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date of Birth :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(110, 190, 130, 20);

        txt_surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_surnameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_surname);
        txt_surname.setBounds(290, 150, 188, 20);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Surname :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(110, 150, 130, 20);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First name :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(110, 120, 130, 20);

        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_firstname);
        txt_firstname.setBounds(290, 120, 188, 20);

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Permanent Address :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(520, 120, 180, 20);

        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Temporary Address :");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(520, 150, 180, 20);

        jLabel15.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("User Name:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(560, 180, 120, 30);

        jLabel16.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Password:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(560, 220, 110, 30);
        jPanel3.add(tf_pass);
        tf_pass.setBounds(720, 220, 168, 20);

        tf_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_usernameActionPerformed(evt);
            }
        });
        jPanel3.add(tf_username);
        tf_username.setBounds(720, 180, 168, 20);
        jPanel3.add(tf_TAddress);
        tf_TAddress.setBounds(720, 150, 168, 20);
        jPanel3.add(txt_address);
        txt_address.setBounds(720, 120, 168, 20);

        cmd_save.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        cmd_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/Save-icon.png"))); // NOI18N
        cmd_save.setText("Add Record");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });
        jPanel3.add(cmd_save);
        cmd_save.setBounds(150, 310, 147, 50);

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/erase-128.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(520, 310, 147, 50);

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8-available-updates-24.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(330, 310, 147, 50);

        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/delete_16x16.gif"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(710, 310, 177, 50);

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(530, 260, 160, 20);

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student ID :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(110, 90, 130, 20);

        txt_studentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_studentidActionPerformed(evt);
            }
        });
        jPanel3.add(txt_studentid);
        txt_studentid.setBounds(290, 90, 188, 20);
        jPanel3.add(tf_Cpass);
        tf_Cpass.setBounds(720, 260, 168, 20);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        student_table.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        student_table.setColumnSelectionAllowed(true);
        student_table.setGridColor(new java.awt.Color(102, 102, 102));
        student_table.setSelectionBackground(new java.awt.Color(0, 255, 102));
        student_table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(student_table);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(90, 370, 810, 180);

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 35)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Student Information");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(120, 10, 760, 50);

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/FrameBG.png"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 1020, 560);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(6, 6, 1000, 560);
        jPanel3.getAccessibleContext().setAccessibleName("");

        File.setText("File");

        jMenuItem1.setText("Attach Image");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        File.add(jMenuItem1);

        jMenuBar1.add(File);

        lbl_date.setText("Date");
        jMenuBar1.add(lbl_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

//        JFileChooser chooser = new JFileChooser();
//        chooser.showOpenDialog(null);
//        File f = chooser.getSelectedFile();
//
//        filename =f.getAbsolutePath();
//        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
////        lbl_img.setIcon(imageIcon);
//        try {
//
//            File image = new File(filename);
//            FileInputStream fis = new FileInputStream (image);
//            ByteArrayOutputStream bos= new ByteArrayOutputStream();
//            byte[] buf = new byte[1024];
//
//            for(int readNum; (readNum=fis.read(buf))!=-1; ){
//
//                bos.write(buf,0,readNum);
//            }
//            person_image=bos.toByteArray();
//        }
//
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//
//        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed
        // TODO add your handling code here:
        gender ="Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
    }//GEN-LAST:event_r_maleActionPerformed

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed
        // TODO add your handling code here:
        gender ="Female";
        r_female.setSelected(true);
        r_male.setSelected(false);

    }//GEN-LAST:event_r_femaleActionPerformed

    private void txt_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_surnameActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void tf_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_usernameActionPerformed

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        String fname=txt_firstname.getText();
        String sname=txt_surname.getText();
        String dob=txt_dob.getText();
        String email=txt_email.getText();
        String telephon=txt_tel.getText();

        String Paddress=txt_address.getText();
        //        Image personimg=person_image;
        String genderr=gender;
        String Taddress=tf_TAddress.getText();
        String password=tf_pass.getText();
        String Uname=tf_username.getText();
        String ConfirmPass=tf_Cpass.getText();
        //        String stdid=txt_studentid.getText();

        if(p==0){
            //
            if(fname.equals("") ||sname.equals("")||dob.equals("")||email.equals("")||telephon.equals("")
                ||Paddress.equals("")||genderr.equals("")||Taddress.equals("")||password.equals("")||Uname.equals("")||ConfirmPass.equals("")||genderr.isBlank()){
                JOptionPane.showMessageDialog(rootPane, "One or more field is empty!!");

            }else if(telephon.length()!=10){
                JOptionPane.showMessageDialog(rootPane, "Contact Number must be of 10 digits","Number Length Error!!",JOptionPane.ERROR_MESSAGE);
            }else if(!password.equals(ConfirmPass)){
                JOptionPane.showMessageDialog(rootPane, "Password must be same","Password Error",JOptionPane.ERROR_MESSAGE);
            }else if(!email.endsWith("@gmail.com")){
                JOptionPane.showMessageDialog(rootPane, "Invalid E-mail!!");
            }else{

                try {

                    conn=dbconn.getconnection();

                    st=conn.createStatement();
                    Long telephone=Long.parseLong(telephon);

                    int result= st.executeUpdate("insert into AdminDash_AddStudent(firstname,surname,dob,email,contact,P_address,gender,T_address,Uname,password,Confirmpass)"+" values ('"+fname+"','"+sname+"','"+dob+"','"+email+"','"+telephone+"','"+Paddress+"'"
                        + ",'"+genderr+"','"+Taddress+"','"+Uname+"','"+password+"','"+ConfirmPass+"')");

                    if(result>0){

                        JOptionPane.showMessageDialog(rootPane, "Student Added Successfully");
                        Update_table();
                    }

                }
                catch (Exception e)

                {
                    //                JOptionPane.showMessageDialog(rootPane, e);
                    System.out.println("SQL Error "+e);

                }}

                Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String dateString = df.format(currentDate);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String timeString = sdf.format(d);

                String value0 = timeString;
                String value1 = dateString;

                try{

                    String reg= "insert into Admin_Audit ( date, status) values ('"+value0+" / "+value1+"','Added Record')";
                    pst=conn.prepareStatement(reg);
                    pst.execute();

                }
                catch (Exception e)

                {
                    JOptionPane.showMessageDialog(null,e);
                }
                finally {

                    try{
                        rs.close();
                        pst.close();

                    }

                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);

                    }
                }
            }
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        txt_firstname.setText("");
        txt_surname.setText("");
        txt_tel.setText("");
        txt_dob.setText("");
        txt_email.setText("");
        txt_address.setText("");
        tf_Cpass.setText("");
        txt_studentid.setText("");

        tf_TAddress.setText("");
        tf_pass.setText("");
        tf_username.setText("");
//        lbl_img.setIcon(null);
//        txt_search1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){

            try{

                String fname = txt_firstname.getText();
                String S_name = txt_surname.getText();
                String dob = txt_dob.getText();
                String std_id = txt_studentid.getText();
                String email = txt_email.getText();
                String telephone = txt_tel.getText();
                Long contact=Long.valueOf(telephone);
                String P_address = txt_address.getText();
                String T_address = tf_TAddress.getText();
                String uname = tf_username.getText();
                String password = tf_pass.getText();

                String sql= "update AdminDash_AddStudent set firstname='"+fname+"', surname='"+S_name+"', "
                + "dob='"+dob+"',Email='"+email+"',contact='"+contact+"',P_address='"+P_address+"',T_address= '"+T_address+"', "
                + "password='"+password+"',Uname='"+uname+"'"
                + "where std_id='"+std_id+"' ";

                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String values = dateString;

            try{
                String reg= "insert into Admin_Audit (emp_id, date, status) values ('','"+value0+" / "+values+"','Updated Record')";
                pst=conn.prepareStatement(reg);
                pst.execute();
            }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
            }
            Update_table();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String value1 = dateString;

            try{
                String reg= "insert into Admin_Audit ( date, status) values ("+value0+" / "+value1+"','Deleted Record')";
                pst=conn.prepareStatement(reg);
                pst.execute();
            }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
            String sql ="delete from AdminDash_AddStudent where std_id=? ";
            try{
                pst=conn.prepareStatement(sql);
                pst.setString(1, txt_studentid.getText());
                pst.execute();

                JOptionPane.showMessageDialog(null,"Record Deleted");

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);
            }finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
            }
            Update_table()

            ;

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_studentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_studentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_studentidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu File;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JTable student_table;
    private javax.swing.JTextField tf_Cpass;
    private javax.swing.JTextField tf_TAddress;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_username;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_studentid;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
private ImageIcon format =null;
    //strin filename
    String filename = null;
    byte[] person_image = null;
    
    private String gender;
    

}
