package mysqlconnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysqlconnector {

    public static void main(String[] args) throws SQLException {

        Connection connect;
        
        Conexion conexion = new Conexion();
        connect = conexion.getConnection();
        
        PreparedStatement ps;
        ResultSet rs;
        
        ps = connect.prepareStatement("SELECT * FROM productos");
        rs = ps.executeQuery();
        
        while(rs.next()) {
            
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String marca = rs.getString("marca");
            int stock = rs.getInt("stock");
            String categoria = rs.getString("categoria");
            
            System.out.println("Id: " + id + "\nNombre: " + nombre + "\nMarca: " + marca + "\nStock: " + stock + "\nCategoria: " + categoria);
        }
        
        System.out.println("Terminamos de iterar el resultado");
    }

}
