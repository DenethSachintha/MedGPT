package connector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
private static Connection con;
private static String url = "jdbc:mysql://localhost:3306/time_table_management_system (8)";
private static String userName = "root";
private static String password = "";
public static Connection getCon(){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

}
catch (ClassNotFoundException ex) {
Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
}
try{
    con = DriverManager.getConnection(url, userName, password);
}
 catch (SQLException ex) {
System.out.println("Database Connection Error");
}
return con;
}
public static void closeCon(){
if (con !=null){
try {
con.close();
} catch (SQLException ex) {
Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);

}
}
}
    public static void main(String[] args) {
        getCon();
        closeCon();
    }
}