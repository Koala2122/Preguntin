package Dominio;

import Persistencia.pJugador;
import Persistencia.pPregunta;
import java.util.ArrayList;
import Persistencia.pR_Correcta;
import Persistencia.pR_Incorrecta;
import Persistencia.pResultados;

public class Controladora {
    
    private pJugador perJugador = new pJugador();
    private pPregunta perPregunta = new pPregunta();
    private pR_Correcta perCorrecta = new pR_Correcta();
    private pR_Incorrecta perIncorrecta = new pR_Incorrecta();
    private pResultados perResultado = new pResultados();
    
    ArrayList colPreguntas = new ArrayList();
    ArrayList colCorrectas = new ArrayList();
    ArrayList colIncorrectas = new ArrayList();
    ArrayList colResultados = new ArrayList();
    
    public Controladora(){
       
       perCorrecta.LlammarCorrecta();
       perIncorrecta.LlammarIncorrecta();
       perPregunta.LlammarPregunta();
     
    }
    // Agregar Ganador================================================================
    public void AgregarGanador1(Jugador Jug1, Jugador Jug2){
        perPregunta.AgregarGanador1(Jug1, Jug2);
    }
        public void AgregarGanador2(Jugador Jug1, Jugador Jug2){
        perPregunta.AgregarGanador2(Jug1, Jug2);
    }
    
    // Agrega un Jugador==================================================================================
    public void AgregarJugador(Jugador pJugador) {        
        perJugador.AgregarJugador(pJugador);       
    }
    
    // Metodos de Agregar pregunta ============================================================================
    
   public void AgregarPregunta (Preguntas pPregunta){
        perPregunta.AgregarPregunta(pPregunta);       
    }
   
   
    public void AgregarCorrecta(Correctas correcta){
        perCorrecta.AgregarCorrecta(correcta);
    }
    
    public void AgregarIncorrecta(Incorrectas incorrecta){
        perIncorrecta.AgregarIncorrecta(incorrecta);
    }
   
       
    // Carga la base de datos ==============================================================================
    public void CargarDatos(){
        colPreguntas = perPregunta.CargarPreguntas();
        colCorrectas = perPregunta.CargarCorrecta();
        colIncorrectas = perPregunta.CargarIncorrecta();
        colResultados = perResultado.CargarResultado();
    }
    
    // Metodos de tabla Correcta ===================================================================0    
    public void llamarCorrecta(){
        perPregunta.CargarCorrecta();
    }
    
    public ArrayList MostrarCorrecta(){
        return colCorrectas;
    }
    
    public ArrayList ListarCorrecta(){
        colCorrectas = perPregunta.CargarCorrecta();
        return colCorrectas;
    }
    public void eliminarCorrecta(int index){
        colCorrectas.remove(index);
    }
    public Correctas RespuestaCorrecta(int id){
        Correctas cor = null;
        for (int i = 0; i <colCorrectas.size() ; i++) {
            cor = (Correctas)colCorrectas.get(i);
            if(cor.getId_respuesta()==id){
                return cor;
            } 
        }
        return null;
    }   
    // Fin Correca =========================================================================
    
    // Metodos de tabla Incorrecta =====================================================
    public void llamarIncorrecta(){
        perPregunta.CargarIncorrecta();
    }
    
    public ArrayList MostrarIncorrecta(){
        return colIncorrectas;
    }
    
    public ArrayList ListarIncorrecta(){
        colIncorrectas = perPregunta.CargarIncorrecta();
        return colIncorrectas;
    }
    public void eliminarIncorrecta(int index){
        colIncorrectas.remove(index);
    }
    public Incorrectas RespuestaIncorrecta(int id){
        Incorrectas incor = null;
       
        for (int i = 0; i <colIncorrectas.size() ; i++) {
            incor = (Incorrectas)colIncorrectas.get(i);
            if(incor.getId_respuesta()==id){
                return incor;
            } 
        }
        return null;
    }
    // Fin Incorrecta ==============================================================
    
    // Metodos tabla Pregunta =======================================================
    public void llamarPregunta(){
        perPregunta.CargarPreguntas();         
    }
           
    public ArrayList MostrarPeguntas(){
        return colPreguntas;
    }
    
    public int CantidadPreg(){
      return colPreguntas.size();
    }

    public ArrayList ListarPreguntas(){
        colPreguntas = perPregunta.CargarPreguntas();
        return colPreguntas;
    }
    
    public void eliminarPregunta(int index){
        colPreguntas.remove(index);
    }
    // Fin Preguntas ====================================================================================================


    //Metodos Resultado ================================================================================================ 
    public ArrayList ListarResultado(){
        colResultados = perResultado.CargarResultado();
        return colResultados;
    }

}

    
    
    
    

