package Persistencia;

import Dominio.Jugador;
import javax.swing.JOptionPane;

public class pJugador extends Conexion{
    
    public void AgregarJugador(Jugador pJugador) {    

       
    try {
               
        String strInsertar = "insert into jugador (Nombre) values ('"+ pJugador.getNombre()+"');";
        System.out.println(strInsertar);
        this.conectar();
        this.EjecutarSentencia(strInsertar);
    }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo agregar Jugador");
        }
    finally {
        this.desconectar();
    }
        
}
     
    
}
