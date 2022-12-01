package database;

import javax.swing.*;

import java.sql.*;

public class DbConnection {

    public Connection connection;

    Statement statement;

    ResultSet resultSet;

    int value;

    public static Connection getconnection() {

        try {

            
            final String username = "scholar";

            final String password = "Scholar@123";

            Class.forName("com.mysql.cj.jdbc.Driver");

           Connection connection = DriverManager.getConnection(

                    "jdbc:mysql://db4free.net :3306/e_scholar", username, password);
           

            if (connection != null) {
                

                System.out.println("Connected to database --> scholar Database");
                return connection;
                
              } else {

                System.out.println("Error connecting to database");

            }
            

            

        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
        

    }

    // Via the use of sql query

    // insert, update and delete

    public int manipulate(String query) {

        try {
            statement = connection.createStatement();

            value = statement.executeUpdate(query);

            connection.close();

        } catch (SQLIntegrityConstraintViolationException ex) {

            JOptionPane.showMessageDialog(null, "These details already exist!");

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return value;

    }

    public ResultSet retrieve(PreparedStatement st){
        try {
            resultSet=st.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }

    public static void main(String[] args) {

         DbConnection.getconnection();

    }

   }

