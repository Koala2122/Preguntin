package Persistencia;

import Dominio.Correctas;
import Dominio.Incorrectas;
import Dominio.Jugador;
import Dominio.Preguntas;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class pPregunta extends Conexion{   
    
    public int LlammarPregunta() { 

        int ultima_P = 0;
        ResultSet rs = null;
   try {                             
        String strInsertar = "select max(id_pregunta)as ultima_P from pregunta;";
        System.out.println(strInsertar);
        this.conectar();
        rs = this.EjecutarConsulta(strInsertar);
        
             if(rs.next()){
                 ultima_P = rs.getInt("ultima_P");
             }      
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo traer el ultimo Id");
        }
    finally {
        this.desconectar();
    }    
   
        return ultima_P;
   
}  
       
    public void AgregarPregunta(Preguntas pPregunta) {
        
        pR_Correcta id_C = new pR_Correcta();
        pR_Incorrecta id_I = new pR_Incorrecta();
        int cor = 0, inco1 = 0, inco2 = 0, inco3 = 0;
        
        cor = id_C.LlammarCorrecta()-1;
        inco1 = id_I.LlammarIncorrecta()-3;
        inco2 = id_I.LlammarIncorrecta()-2;
        inco3 = id_I.LlammarIncorrecta()-1;
                
        int id_P = 0;
        
        id_P = this.LlammarPregunta()+1;
   
   try {
               
        String strInsertar = "insert into pregunta values ("+id_P+", '"+pPregunta.getCategoria()+"', '"+pPregunta.getPregunta()+"', "+cor+", "+inco1+", "+inco2+", "+inco3+");";
        System.out.println(strInsertar);
        this.conectar();
        this.EjecutarSentencia(strInsertar);
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo agregar la Pregunta");
        }
    finally {
        this.desconectar();
    }      
}
    
    
    public ArrayList CargarPreguntas(){
        
        ArrayList colPreguntas = new ArrayList();
        
        ResultSet rs = null;   
        
        try {       
        String strInsertar = "SELECT * FROM pregunta;";
        System.out.println(strInsertar);
        this.conectar();
        rs=this.EjecutarConsulta(strInsertar); 
        
        
        while(rs.next()){
            Preguntas preg = new Preguntas();
            preg.setId_pregunta(rs.getInt("id_pregunta"));
            preg.setCategoria(rs.getString("tipo"));
            preg.setPregunta(rs.getString("pregunta"));
            preg.setId_Correcta(rs.getInt("Id_respuestaC"));
            preg.setId_Incorrecta1(rs.getInt("Id_Incorrecta1"));
            preg.setId_Incorrecta2(rs.getInt("Id_Incorrecta2"));
            preg.setId_Incorrecta3(rs.getInt("Id_Incorrecta3"));
            
            
            colPreguntas.add(preg);
            
        }
            }
        catch(Exception ex) {
            
        }
    finally {
        this.desconectar();
    }
        
        return colPreguntas;
    }
    
    
    public ArrayList CargarCorrecta(){
        
        ArrayList colCorrectas = new ArrayList();
        
        ResultSet rs = null;   
        
        try {       
        String strInsertar = "SELECT * FROM correcta;";
        System.out.println(strInsertar);
        this.conectar();
        rs=this.EjecutarConsulta(strInsertar); 
        
        
        while(rs.next()){
            Correctas cor = new Correctas();
            cor.setId_respuesta(rs.getInt("Id_Respuesta"));
            cor.setRespuesta(rs.getString("respuesta"));
        
            colCorrectas.add(cor);
            
        }
            }
        catch(Exception ex) {
            
        }
    finally {
        this.desconectar();
    }
        
        return colCorrectas;
    }
    
    public ArrayList CargarIncorrecta(){
        
        ArrayList colIncorrectas = new ArrayList();
        
        ResultSet rs = null;   
        
        try {       
        String strInsertar = "SELECT * FROM incorrecta;";
        System.out.println(strInsertar);
        this.conectar();
        rs=this.EjecutarConsulta(strInsertar); 
        
        
        while(rs.next()){
            Incorrectas incor = new Incorrectas();
            incor.setId_respuesta(rs.getInt("Id_Respuesta"));
            incor.setRespuesta(rs.getString("respuesta"));
        
            colIncorrectas.add(incor);
            
        }
            }
        catch(Exception ex) {
            
        }
    finally {
        this.desconectar();
    }
        
        return colIncorrectas;
    }
    
    
    public static String fechaActual(){
        
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }
       
    public void AgregarGanador1(Jugador Jug1, Jugador Jug2){
        
        String fecha;
        fecha = fechaActual();
        
        int juego = 0;
        juego = this.LlammarGanador()+1;
        
        try {
               
        String strInsertar = "insert into resultado values ("+juego+", '"+Jug1.getNombre()+"', '"+Jug2.getNombre()+"', '"+Jug1.getNombre()+"', '"+fecha+"');";
        System.out.println(strInsertar);
        this.conectar();
        this.EjecutarSentencia(strInsertar);
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo agregar el ganador");
        }
    finally {
        this.desconectar();
    }
        
    }
    
        public void AgregarGanador2(Jugador Jug1, Jugador Jug2){
        
        String fecha;
        fecha = fechaActual();
            
        int juego = 0;
        juego = this.LlammarGanador()+1;
            
        try {
               
        String strInsertar = "insert into resultado values ("+juego+", '"+Jug1.getNombre()+"', '"+Jug2.getNombre()+"', '"+Jug2.getNombre()+"', '"+fecha+"');";
        System.out.println(strInsertar);
        this.conectar();
        this.EjecutarSentencia(strInsertar);
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo agregar el ganador");
        }
    finally {
        this.desconectar();
    }
        
    }
    
        public int LlammarGanador() { 

        int ultimo_ID = 0;
        ResultSet rs = null;
   try {                             
        String strInsertar = "select max(juego)as ultimo_ID from resultado;";
        System.out.println(strInsertar);
        this.conectar();
        rs = this.EjecutarConsulta(strInsertar);
        
             if(rs.next()){
                 ultimo_ID = rs.getInt("ultimo_ID");
             }      
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo traer el ultimo Id");
        }
    finally {
        this.desconectar();
    }    
   
        return ultimo_ID;
   
}    
}
