
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class DatabaseConnection {
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/student_project";
    final static String USER_NAME = "root";
    final static String PASS = "";
    
    public static Connection connection(){
       try{
           
           Class.forName(JDBC_DRIVER);
           Connection conn = (Connection) DriverManager.getConnection(DB_URL, USER_NAME, PASS);
           return conn;
       
       }
       catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }
   }
}
