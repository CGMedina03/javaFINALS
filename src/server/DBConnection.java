/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SLEAR
 */
public class DBConnection {
    public static Connection Connect(){
       try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection to the MySQL database
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cs1", "root", "");

            // Check if the connection was successful
            if (conn != null) {
                System.out.println("Connected to the database");
            }
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Unable to connect to the database");
            JOptionPane.showMessageDialog(null, "Unable to connect to the database");
            
            e.printStackTrace();
            System.exit(1);
            return null;
        }
   }
    
}
