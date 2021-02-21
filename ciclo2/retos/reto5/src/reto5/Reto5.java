/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jose Manuel
 */
public class Reto5 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/reto4";
        String username = "root";
        String password = "Rascacielos";
        Connection conn = DriverManager.getConnection(dbURL,username, password);
        if (conn != null) {
            System.out.println("Conectado");
        }
        int insertados = 0;
        String insertDirector = "insert into director (dir_nombre, dir_apellido, dir_nacionalidad) values (?, ?, ?)";
        PreparedStatement query = conn.prepareStatement(insertDirector);
        query.setString(1, "Wes");
        query.setString(2, "Anderson");
        query.setString(3, "Estados Unidos");
        //int insertados = query.executeUpdate();
        if (insertados > 0) {
            System.out.print("Se insertaron");
        }
        String leerDirector = "select * from director";
        Statement query2 = conn.createStatement();
        ResultSet rs = query2.executeQuery(leerDirector);
        while (rs.next()) {
            int dir_id = rs.getInt("dir_id");
            String dir_nombre = rs.getString("dir_nombre");
            System.out.println(dir_id + dir_nombre);
            
        }
        

    }
    
}
