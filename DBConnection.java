package BLOODBANK1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    public Connection con;
    String url ="jdbc:mysql://localhost:3306/bloodbank1";
    String db = "bloodbank1";
    String user = "root";
    String pass = "aparna123";
    
    public Connection mkDataBase() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
     
        }
        return con;
    }
 
}
