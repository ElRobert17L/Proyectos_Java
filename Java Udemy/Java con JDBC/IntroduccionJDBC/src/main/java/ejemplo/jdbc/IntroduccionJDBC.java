package ejemplo.jdbc;

import java.sql.*;

public class IntroduccionJDBC {
    
    public static void main(String[] args) {
        
        //Paso 1. Creamos nuestra cadena de conexion a mysql
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        
        try {
            //Paso 2. Creamos el objeto de conexion a la base de datos
            Connection conexion = DriverManager.getConnection(url, "root", "root");
            
            //Paso3. Creamos un objeto Statement
            Statement instruccion = conexion.createStatement();
            
            //Paso 4, Creamos el query
            String sql = "select id_persona, nombre, apellido, email, telefono from persona";
            
            //Paso 5. Ejecucion query
            ResultSet resultado = instruccion.executeQuery(sql);
            
            //Paso 6. Procesamos el resultado
            while(resultado.next()){
                System.out.println("Id Persona: " + resultado.getInt(1));
                System.out.println(" Nombre: " + resultado.getString(2));
                System.out.println(" Apellido: " + resultado.getString(3));
                System.out.println(" Email: " + resultado.getString(4));
                System.out.println(" Telefono: " + resultado.getString(5));
            }
            //Paso 7. Cerramos cada objeto que hemos utilizado
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
