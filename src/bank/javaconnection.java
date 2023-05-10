/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author fortu
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnection {
    Connection conn=null;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
           
           Connection conn= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\fortu\\OneDrive\\Documents\\NetBeansProjects\\bank3\\bank.db");
           return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e );
        }
        return null;
    }
    
}
