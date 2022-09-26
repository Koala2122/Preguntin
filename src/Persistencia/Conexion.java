package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {
    //COMPLICACION CONEXION LOCAL-------
    
    private static Connection conn;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/proyecto2";
    

    
    protected void conectar() {
        conn=null;
        
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
           
        }
        catch (ClassNotFoundException | SQLException ex) {
            System.out.print("ERROR");
        }    
        
    }
    
 
    
    protected void desconectar(){
        try{
            conn.close();
            //conn=null;
        }
        catch (Exception ex) {
            System.out.print("ERROR");
        }
    }
    
    /**
    *Ejecuta una sentencia de modificación de datos en BBDD.
    * @param sql Sentencia a realizar del tipo INSERT, UPDATE o DELETE.
    */
    protected void EjecutarSentencia(String sql){
        try{
            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate(sql);
           
        }
        catch (Exception ex) {
            System.out.print("ERROR \n" + ex.getMessage());
        }
        
    }
    
    
    protected ResultSet EjecutarConsulta(String consulta){
        ResultSet rs = null;
        try{
            PreparedStatement stmt = conn.prepareStatement(consulta);
            
            rs = stmt.executeQuery();
          
            
        }
        catch (Exception ex) {
            System.out.print("ERROR \n" + ex.getMessage());
        }
        return rs;
    }
}
