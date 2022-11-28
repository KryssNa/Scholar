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

            
            final String username = "sql6580066";

            final String password = "FEERC1AdBC";

            Class.forName("com.mysql.cj.jdbc.Driver");

           Connection connection = DriverManager.getConnection(

                    "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6580066", username, password);
           

            if (connection != null) {
                

                System.out.println("Connected to database --> scholar E-Learning System Database");
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

    public ResultSet retrieve(String query) {

        try {

            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return resultSet;

    }

    public static void main(String[] args) {

         DbConnection.getconnection();

    }

   }

