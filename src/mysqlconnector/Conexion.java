package mysqlconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private final String user = "root";
    private final String pass = "";
    private final String url = "jdbc:mysql://localhost:3306/codoacodo";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getConnection(){
        
        Connection conexion = null;
        
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, pass);
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.toString());    
        }
        return conexion;
    }
}
