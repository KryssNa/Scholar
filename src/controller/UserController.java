package controller;

import java.sql.*;
import database.DbConnection;
import javax.swing.JOptionPane;
import models.User;


public class UserController {
    Connection conn=DbConnection.getconnection();
    ResultSet rs;
    

    public int testUser(User newuser) {
              
        String username =newuser.getuserUsername();
        String password = newuser.getuserPass();
//        User lv=new User(username,password);
        try {
                
                Connection conn=DbConnection.getconnection();
                String query = "Select * from new_user where user_email='"+username+"' and user_pass='"+password+"' ";
                
                Statement smt = conn.createStatement();
                rs = smt.executeQuery(query);
                
            if(rs.next()){

                JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
                            JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null, "Wrong password. Try again","Failed!!",
                            JOptionPane.ERROR_MESSAGE);
                
            }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println(e);
                
                
            }
        return 0;
        
        
        
    }
    
    

    public int insertuser(User user) {
        String uname = user.getuserUsername();
        String email = user.getuserEmail();
        String pass = user.getuserPass();
        String cpass = user.getuserCpass();
        try{
        String insertQuery ="insert into new_user(user_username,user_email,user_pass,user_cpass)"
                + "values('"+uname+"','"+email+"','"+pass+"','"+cpass+"')";
        conn =  DbConnection.getconnection();
        PreparedStatement pst=conn.prepareStatement(insertQuery);
        int result=pst.executeUpdate();
        
        
        if(result>0){
        
            System.out.println("Inserted successfully");
            return result;
        
        }
        else{
            System.out.println("Some error occured");
        }
//        
        
        }
        catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return 0;
       
    }
    
    public boolean validateduplicatedata(User user){
        String uname = user.getuserUsername();
        String email = user.getuserEmail();
        
        boolean isExist=false;
        
        try{
        
            String query1="Select * from new_user where user_username=?";
            String query2="Select * from new_user where user_email=?";
            PreparedStatement usernamePST=conn.prepareStatement(query1);
            PreparedStatement emailPST=conn.prepareStatement(query1);
            usernamePST.setString(1, uname);
            emailPST.setString(1, email);
            
            ResultSet rs2=emailPST.executeQuery();
            ResultSet rs1=usernamePST.executeQuery();
            if (rs1.next()){
            
                isExist=true;
                JOptionPane.showMessageDialog(null, "Username Already Exist!!","Duplicate Data",JOptionPane.ERROR_MESSAGE);
            
            }else if(rs2.next()){
                 isExist=true;
                JOptionPane.showMessageDialog(null, "Email Already Exist!!","Duplicate Data",JOptionPane.ERROR_MESSAGE);
            
            }
            else{
            
            isExist=false;}
        
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, e); 
        }
        return isExist;
        
        
        
        


}

//    public int testUser(User newuser) {
//              
//        String username =newuser.getuserUsername();
//        String password = newuser.getuserPass();
//        User lv=new User(username,null,password,null);
//        try {
//                
//                String query = "Select * from new_user where user_username='"+username+"' and user_pass='"+password+"' ";
//                
//                Statement smt = conn.createStatement();
//                rs = smt.executeQuery(query);
//                
//            if(rs.next()){
//
//                JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
//                            JOptionPane.INFORMATION_MESSAGE);
//                
//            }else{
//                JOptionPane.showMessageDialog(null, "Wrong password. Try again","Failed!!",
//                            JOptionPane.ERROR_MESSAGE);
//                
//            }
//                
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//                System.out.println(e);
//                
//                
//            }
//        return 0;
//        
//        
//        
//    }
}