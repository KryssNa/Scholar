/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DbConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Teacher;

/**
 *
 * @author Lenovo
 */
public class TeacherController {
    
    Connection conn=DbConnection.getconnection();
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    
     public int inserTeacher(Teacher teacher) {
            
            String fname=teacher.getFname();
            String Sname=teacher.getSname();
            String uname = teacher.getUsername();
            String email = teacher.getEmail();
            String pass = teacher.getPassword();
            String dob= teacher.getDob();
            String gender=teacher.getGender();
            String address=teacher.getAddress();
            String Course=teacher.getCourse_name();
            String contact=teacher.getContact();
            
            int isinserted=0;
            try{
            String insertQuery;
                insertQuery = "insert into AddTeacher(FirstName,SurName,DOB,Email,Contact,Address,Gender,Course_name,Username,Password)"
                        + "value('"+fname+"','"+Sname+"','"+dob+"','"+email+"','"+contact+"','"+address+"','"+gender+"','"+Course+"','"+uname+"','"+pass+"')";
            conn =  DbConnection.getconnection();
            pst=conn.prepareStatement(insertQuery);
            isinserted=pst.executeUpdate();

            }
            catch(SQLException e){

                JOptionPane.showMessageDialog(null, e,"Error",JOptionPane.ERROR_MESSAGE);
            }
            return isinserted;

        }
     public boolean testTeacherLogin(Teacher teacher){
     
         boolean isvalid=false;
         
         String username=teacher.getUsername();
         String password=teacher.getPassword();
         
         try{
         
             String query ="Select * form AddTeacher where Username=? and Password=?";
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
//            String sql ="select Teacher_id as ID,CONCAT(FirstName ,' ', SurName) as Name,Contact,Address,Gender,Username,Password from AddTeacher";
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

    public int updateRecord(Teacher teacher){

                int teacher_id=teacher.getTeacher_id();
                String fname=teacher.getFname();
                String Sname=teacher.getSname();
                String uname = teacher.getUsername();
                String email = teacher.getEmail();
                String pass = teacher.getPassword();
                String dob= teacher.getDob();
                String gender=teacher.getGender();
                String address=teacher.getAddress();
                String Course=teacher.getCourse_name();
                String contact=teacher.getContact();

                int isupdated=0;

                try{String sql= "update AddTeacher set FirstName='"+fname+"', SurName='"+Sname+"', "
                    + "DOB='"+dob+"',Email='"+email+"',Contact='"+contact+"',Address='"+address+"',Gender= '"+gender+"', "
                    + "Course_name='"+Course+"',Username='"+uname+"',Password='"+pass+"'"
                    + "where Teacher_id='"+teacher_id+"' ";

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
