/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBHelper {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DB = "handphone";
    private static final String MYCONN = "jdbc:mysql://localhost/"+DB;
    
    public static Connection getConnection () throws SQLException{
        
        Connection con = (Connection) DriverManager.getConnection(MYCONN, USERNAME, PASSWORD);
        
        return con;
    }

    public static Connection getConnection(String driver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
