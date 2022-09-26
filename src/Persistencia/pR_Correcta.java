package Persistencia;

import Dominio.Correctas;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class pR_Correcta extends Conexion{

    
    
    public int LlammarCorrecta() { 

        int ultima_C = 0;
        
        ResultSet rs = null;
   try {                             
        String strInsertar = "select max(Id_Respuesta)as ultima_C from correcta;";
        System.out.println(strInsertar);
        this.conectar();
        rs = this.EjecutarConsulta(strInsertar);
        
             if(rs.next()){
                 ultima_C = rs.getInt("ultima_C");
             }
        
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo traer el ultimo Id");
        }
    finally {
        this.desconectar();
    }    
   
        return ultima_C+1;
   
}   
    
    
    
    public void AgregarCorrecta(Correctas correcta) {        
   
        int id_C = 0;
        
        id_C = this.LlammarCorrecta();
        
   try {
               
        String strInsertar = "insert into correcta values ("+id_C+", '"+correcta.getRespuesta()+"');";
        System.out.println(strInsertar);
        this.conectar();
        this.EjecutarSentencia(strInsertar);
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo agregar la respuesta Correcta");
        }
    finally {
        this.desconectar();
    }      
}

    
}


