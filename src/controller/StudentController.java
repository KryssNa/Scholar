/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import database.DbConnection;
import models.Student;

/**
 *
 * @author Lenovo
 */
public class StudentController {
 
    
    Connection conn=DbConnection.getconnection();
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    
     public int inserStudent(Student student) {
            
            String fname=student.getFname();
            String Sname=student.getSname();
            String uname = student.getUsername();
            String email = student.getEmail();
            String pass = student.getPassword();
            String dob= student.getDob();
            String gender=student.getGender();
            String address=student.getAddress();
            String std_batch=student.getstd_batch();
            String contact=student.getContact();
            
            int isinserted=0;
            try{
            String insertQuery;
                insertQuery = "insert into AddStudent(FirstName,SurName,DOB,Email,Contact,Address,Gender,std_batch,Username,Password)"
                        + "value('"+fname+"','"+Sname+"','"+dob+"','"+email+"','"+contact+"','"+address+"','"+gender+"','"+std_batch+"','"+uname+"','"+pass+"')";
            conn =  DbConnection.getconnection();
            pst=conn.prepareStatement(insertQuery);
            isinserted=pst.executeUpdate();

            }
            catch(SQLException e){

                JOptionPane.showMessageDialog(null, e,"Error",JOptionPane.ERROR_MESSAGE);
            }
            return isinserted;

        }
     public boolean testStudentLogin(Student student){
     
         boolean isvalid=false;
         
         String username=student.getUsername();
         String password=student.getPassword();
         
         try{
         
             String query ="Select * form AddStudent where Username=? and Password=?";
             pst=conn.prepareStatement(query);
             pst.setString(1, username);
             pst.setString(2,password);
             rs=pst.executeQuery();
             while (rs.next()){
             
                 System.out.println("Welcome to Scholar");
                 return true;
             }
         
         }catch (SQLException e){
         
             System.out.println("SQL Error:"+e);
         
         }        
         return isvalid;     
     }
    public void Updatetable() {
//        try{
//            String sql ="select std_id as ID,CONCAT(FirstName ,' ', SurName) as Name,Contact,Address,Gender,Username,Password from AddStudent";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            AddTeacherScreen st=new AddTeacherScreen();
//            st.student_table.setModel(DbUtils.resultSetToTableModel(rs));
//        }
//        catch(SQLException e){
//        JOptionPane.showMessageDialog(null, "Update Table Error:"+e);
//        }
//        finally {
//
//                try{
//                    rs.close();
//                    pst.close();
//
//                }
//                catch(SQLException e){
//                    System.out.println("SQL Error: "+e);               
//                }
//            }
        } 

    public int updateRecord(Student student){

                int std_id=student.getstd_id();
                String fname=student.getFname();
                String Sname=student.getSname();
                String uname = student.getUsername();
                String email = student.getEmail();
                String pass = student.getPassword();
                String dob= student.getDob();
                String gender=student.getGender();
                String address=student.getAddress();
                String Std_batch=student.getstd_batch();
                String contact=student.getContact();

                int isupdated=0;

                try{String sql= "update AddStudent set FirstName='"+fname+"', SurName='"+Sname+"', "
                    + "DOB='"+dob+"',Email='"+email+"',Contact='"+contact+"',Address='"+address+"',Gender= '"+gender+"', "
                    + "std_batch='"+Std_batch+"',Username='"+uname+"',Password='"+pass+"'"
                    + "where std_id='"+std_id+"' ";

                    pst=conn.prepareStatement(sql);
                    boolean isexecuted = pst.execute();
                    if(isexecuted==true){
//                    JOptionPane.showMessageDialog(null, "Record Updated");
                    return 1;
                    }

                }catch(HeadlessException | SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }
                return isupdated;

    }
}
