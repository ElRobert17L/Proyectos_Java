/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rob-c
 */
public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/tienda"+"?useTimezone=true&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    
    public Connection getConexion(){
        Connection con = null;
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    
}
