package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    //Paso 1. Creamos nuestra cadena de conexion a mysql
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "root";

    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASS);
        //Definimos el tamaño del POOL de Conexiones
        ds.setInitialSize(5); //Se crean 5 conexiones inicializadas
        return ds;
    }
    
    //Paso 2. Creamos el objeto de conexion a la base de datos
    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    //Paso 7. Cerramos cada objeto que hemos utilizado
    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //Paso 7. Cerramos cada objeto que hemos utilizado
    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //Paso 7. Cerramos cada objeto que hemos utilizado
    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
