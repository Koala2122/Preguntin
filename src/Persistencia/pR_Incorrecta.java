package Persistencia;

import Dominio.Incorrectas;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class pR_Incorrecta extends Conexion{
    
    
    
    public int LlammarIncorrecta() {     
        
        int ultima_I = 0;
        ResultSet rs = null;
   try {                             
        String strInsertar = "select max(Id_Respuesta)as ultima_I from incorrecta;";
        System.out.println(strInsertar);
        this.conectar();
        rs = this.EjecutarConsulta(strInsertar);
        
        if(rs.next()){
                 ultima_I = rs.getInt("ultima_I");
             }
        
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo agregar la respuesta Incorrecta");
        }
    finally {
        this.desconectar();
    }    
   
        return ultima_I+1;
   
}
   
        
public void AgregarIncorrecta(Incorrectas incorrecta) {        
   
        int id_I = 0;
        
        id_I = this.LlammarIncorrecta();
        
   try {
               
        String strInsertar = "insert into incorrecta values ("+id_I+", '"+incorrecta.getRespuesta()+"');";
        System.out.println(strInsertar);
        this.conectar();
        this.EjecutarSentencia(strInsertar);
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo agregar la respuesta Incorrecta");
        }
    finally {
        this.desconectar();
    }      
}
    
    
}
