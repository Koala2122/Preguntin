
package Persistencia;

import Dominio.Preguntas;
import Dominio.Resultados;
import java.sql.ResultSet;
import java.util.ArrayList;


public class pResultados extends Conexion{
    
        public ArrayList CargarResultado(){
        
        ArrayList colResultados = new ArrayList();
        
        ResultSet rs = null;   
        
        try {       
        String strInsertar = "SELECT * FROM resultado;";
        System.out.println(strInsertar);
        this.conectar();
        rs=this.EjecutarConsulta(strInsertar);        
        
        while(rs.next()){
            Resultados result = new Resultados();
            result.setJuego(rs.getInt("Juego"));
            result.setJugador_1(rs.getString("Jugador-1"));
            result.setJugador_2(rs.getString("Jugador-2"));
            result.setGanador(rs.getString("Ganador"));
            result.setFecha(rs.getString("Fecha"));
            
            
            colResultados.add(result);
            
        }
            }
        catch(Exception ex) {
            
        }
    finally {
        this.desconectar();
    }
        
        return colResultados;
    }
    
    
    
    
}
