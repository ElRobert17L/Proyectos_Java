package datos;

import domain.*;
import java.sql.*;
import java.util.*;

public class UsuarioJDBC {
    
    //Paso 4. Creamos los query's
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    public List<Usuario> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario_ = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            //Paso 2. Creamos el objeto de conexion a la base de datos
            conn = Conexion.getConnection();
            //Paso3. Creamos un objeto Statement
            stmt = conn.prepareStatement(SQL_SELECT);
            //Paso 5. Ejecucion query
            rs= stmt.executeQuery();
            
            while(rs.next()){
                int id_usuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                
                usuario_ = new Usuario();
                usuario_.setId_usuario(id_usuario);
                usuario_.setUsuario(usuario);
                usuario_.setPassword(password);
                
                usuarios.add(usuario_);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return usuarios;
    }
    
    public int insert(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;
        
        try {
            //Paso 2. Creamos el objeto de conexion a la base de datos
            conn = Conexion.getConnection();
            //Paso3. Creamos un objeto Statement
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            
            //Paso 5. Ejecucion query
            System.out.println("ejecutando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int update(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            //Paso 2. Creamos el objeto de conexion a la base de datos
            conn = Conexion.getConnection();
            //Paso3. Creamos un objeto Statement
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            //Paso 5. Ejecucion query
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
        
    }
    
    public int delete(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            //Paso 2. Creamos el objeto de conexion a la base de datos
            conn = Conexion.getConnection();
            //Paso3. Creamos un objeto Statement
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            //Paso 5. Ejecucion query
            stmt.setInt(1, usuario.getId_usuario());
            stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
