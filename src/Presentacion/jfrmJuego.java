package Presentacion;

import Dominio.Controladora;
import Dominio.Correctas;
import Dominio.Incorrectas;
import Dominio.Jugador;
import Dominio.Preguntas;
import Dominio.Respuestas;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class jfrmJuego extends javax.swing.JFrame {
   
    private int opcionCorrecta, JugadorActual = 0, id_Incos; 
    private long puntaje1=0, puntaje2=0;
    private int IDpregunta;
    private Preguntas PreguntaActual; 
    private String ProximaPregunta;
    private Jugador Jug1, Jug2;
    
    private Controladora controladora;
    
    public jfrmJuego(Controladora cont, Jugador j1, Jugador j2) {
        initComponents();   
    
        this.setExtendedState(MAXIMIZED_BOTH);
        txtResponde.requestFocus();
        controladora = cont;    
        
              
        jlbJugador1.setText(j1.getNombre());
        jlbJugador2.setText(j2.getNombre());
        
        Jug1 = j1;
        Jug2 = j2;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtResponde = new javax.swing.JTextField();
        jlbResponde = new javax.swing.JLabel();
        jlbCategoria = new javax.swing.JLabel();
        jlbOpcion1 = new javax.swing.JLabel();
        jlbOpcion3 = new javax.swing.JLabel();
        jlbOpcion2 = new javax.swing.JLabel();
        jlbOpcion4 = new javax.swing.JLabel();
        jlbJugador1 = new javax.swing.JLabel();
        jlbJugador2 = new javax.swing.JLabel();
        jlbAcierto = new javax.swing.JLabel();
        jlbp2 = new javax.swing.JLabel();
        jlbp1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPregunta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("Responde: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 120, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("Categoria: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 130, -1));

        txtResponde.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResponde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRespondeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRespondeKeyTyped(evt);
            }
        });
        getContentPane().add(txtResponde, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 660, 30, 30));

        jlbResponde.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jlbResponde.setForeground(new java.awt.Color(0, 204, 51));
        jlbResponde.setText("                ...");
        getContentPane().add(jlbResponde, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 256, 250, 50));

        jlbCategoria.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlbCategoria.setForeground(new java.awt.Color(0, 204, 0));
        jlbCategoria.setText("          ...");
        getContentPane().add(jlbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 180, -1));

        jlbOpcion1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jlbOpcion1.setForeground(new java.awt.Color(204, 0, 204));
        jlbOpcion1.setText("Opcion 1");
        getContentPane().add(jlbOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 510, -1));

        jlbOpcion3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jlbOpcion3.setForeground(new java.awt.Color(255, 0, 0));
        jlbOpcion3.setText("Opcion 3");
        getContentPane().add(jlbOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 530, -1));

        jlbOpcion2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jlbOpcion2.setForeground(new java.awt.Color(51, 255, 51));
        jlbOpcion2.setText("Opcion 2");
        getContentPane().add(jlbOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, 510, -1));

        jlbOpcion4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jlbOpcion4.setForeground(new java.awt.Color(0, 0, 204));
        jlbOpcion4.setText("Opcion 4");
        getContentPane().add(jlbOpcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, 520, -1));

        jlbJugador1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlbJugador1.setForeground(new java.awt.Color(255, 51, 51));
        jlbJugador1.setText("Jugador 1");
        getContentPane().add(jlbJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 106, -1));

        jlbJugador2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlbJugador2.setForeground(new java.awt.Color(51, 51, 255));
        jlbJugador2.setText("Jugador 2");
        getContentPane().add(jlbJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 180, 160, 20));

        jlbAcierto.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jlbAcierto.setText("             ...");
        getContentPane().add(jlbAcierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 240, -1));

        jlbp2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlbp2.setText("0");
        getContentPane().add(jlbp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 220, 50, -1));

        jlbp1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlbp1.setText("0");
        getContentPane().add(jlbp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 50, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("1-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 40, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("2-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 40, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("3-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("4-");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otros/preguntin_verde.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("Respuesta:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, -1, 70));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 20, 250));

        txtPregunta.setColumns(20);
        txtPregunta.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtPregunta.setRows(5);
        jScrollPane1.setViewportView(txtPregunta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1260, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // EVENTO PARA ELEJIR QUIEN CONTESTA
    private void txtRespondeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespondeKeyTyped
        
        if(Character.isDigit(evt.getKeyChar())){
         
            switch(evt.getKeyChar()){
                case '0':
                    evt.consume();
                    txtResponde.setText("");
                    jlbAcierto.setText("");
                    jlbResponde.setText("");
                                                           
                    PreguntaActual = proximaPregunta();
                    mostrarRespuestas(PreguntaActual);
                    txtPregunta.setText(PreguntaActual.getPregunta());                    
                    jlbCategoria.setText(PreguntaActual.getCategoria());
                    JugadorActual = 0;
                    
                    break;
                
                case '8':
                        evt.consume();
                        if (JugadorActual == 0){
                            
                            jlbResponde.setText(Jug1.getNombre());
                            txtResponde.setText("");
                            JugadorActual = 1;
                        }
                    break;
                    
                case '9':
                    evt.consume();
                    if (JugadorActual == 0){
                    
                        jlbResponde.setText(Jug2.getNombre());
                        txtResponde.setText("");
                        JugadorActual = 2;
                    }
                    break;
                case '5':
                case '6':
                case '7':
                    evt.consume();
                    break;               
            }          
        } 
        else{
            evt.consume();
        }             
    }//GEN-LAST:event_txtRespondeKeyTyped

    // INDICA SI SE A AHCERTADO O NO LA PREGUNTA ======================================================
    private void txtRespondeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespondeKeyReleased
        int o;
     
        if(!txtResponde.getText().equals("")){
            o= parseInt(txtResponde.getText());           
                if(o == opcionCorrecta){
                    
                jlbAcierto.setText("CORRECTO");
                puntajeJugador(true);
                
            }
            else{
                jlbAcierto.setText("INCORRECTO");
                puntajeJugador(false);
                
            }        
        }
    }//GEN-LAST:event_txtRespondeKeyReleased
    


// SUMA O RESTA LOS PUNTAJES ===============================================================
    private void puntajeJugador(boolean esCorrecto){
       if(JugadorActual == 1){
            if(esCorrecto){
                puntaje1 += 5;
            }
            else{
                puntaje1 -= 1;
            }
        }
        else if(JugadorActual == 2){
            if(esCorrecto){
                puntaje2 += 1;
            }
            else{
                puntaje2 -= 1;
            }           
        }               
        if (puntaje1 == 10){
                JOptionPane.showMessageDialog(null,"FELICIDADES "+Jug1.getNombre()+" HAS GANADO");
                controladora.AgregarGanador1(Jug1, Jug2);
            }
        if (puntaje2 == 10){
                JOptionPane.showMessageDialog(null,"FELICIDADES "+Jug2.getNombre()+" HAS GANADO");
                controladora.AgregarGanador2(Jug1, Jug2);
            }
        jlbp1.setText(String.valueOf(puntaje1));
        jlbp2.setText(String.valueOf(puntaje2));
    }
    
    
    
    
    // GENERA UNA RESPUESTA ALEATOREA ==============================================================
    private void mostrarRespuestas(Preguntas p){
        int opcion[] = {1,2,3,4};
        int resp = 0;
        int aux;
        
        Correctas cor = controladora.RespuestaCorrecta(p.getId_Correcta());
        Incorrectas incor1 = controladora.RespuestaIncorrecta(p.getId_Incorrecta1());
        Incorrectas incor2 = controladora.RespuestaIncorrecta(p.getId_Incorrecta2());
        Incorrectas incor3 = controladora.RespuestaIncorrecta(p.getId_Incorrecta3());
        
        for(int i =3; i>0;i--){
            resp = (int)Math.round(i * Math.random());
            aux = opcion[i];
            opcion[i] = opcion[resp];
            opcion[resp] = aux;       
            
        }    
        
        verRespuesta(cor.getRespuesta(), opcion[0],true);
        verRespuesta(incor1.getRespuesta(), opcion[1], false);
        verRespuesta(incor2.getRespuesta(), opcion[2], false);
        verRespuesta(incor3.getRespuesta(), opcion[3], false);
        
    }
   
    private void verRespuesta(String respuesta, int ubi, boolean esCorrecta){
       switch(ubi){
            case 1:
                jlbOpcion1.setText(respuesta);
                break;
            case 2:
                jlbOpcion2.setText(respuesta);
                break;
            case 3:
                jlbOpcion3.setText(respuesta);
                break;
            case 4:
                jlbOpcion4.setText(respuesta);
                break;
        }
        if(esCorrecta){
            opcionCorrecta = ubi;
        }  
    }
    
    
    private int Random(){
        
        int totalPreguntas = controladora.CantidadPreg();
        int index = (int)Math.round(Math.random() * (totalPreguntas-1));   
        
        return index;
    }
    
    
    // SELECCIONA LA PREGUNTA =============================================================
    private Preguntas proximaPregunta(){
        
        Preguntas p = null;      
        
        try {                       
        int index = Random();
        //controladora.ListarPreguntas();  
        ArrayList colPreguntas = controladora.MostrarPeguntas();
        p = (Preguntas)colPreguntas.get(index);
        controladora.eliminarPregunta(index);
        }       
        catch(Exception ex) {
                JOptionPane.showMessageDialog(null,"Error al mostrar pregunta");
                }
        return p;
        
    }
    
    
    // SELECCIONA LA RESPUESTA CORRECTA ==================================================================
    private Preguntas SelecCorrecta(){   
        Preguntas id_Correcta = null;
        try{            
            controladora.ListarCorrecta();
            opcionCorrecta = id_Correcta.getId_Correcta();
            ArrayList colCorrectas = controladora.MostrarCorrecta();
            id_Correcta = (Preguntas)colCorrectas.get(opcionCorrecta);
            
        }       
        catch(Exception ex){            
        }
        return id_Correcta;
    }
    // SELECCIONA LAS RESPUESTAS INCORRECTAS ================================================================
    private Preguntas SelecIncorrecta(){   
        Preguntas id_Incorrectas = null;
        try{
            controladora.ListarIncorrecta();
            ArrayList colIncorrectas = controladora.MostrarIncorrecta();     
            id_Incorrectas = (Preguntas)colIncorrectas.get(id_Incos);

        }        
        catch(Exception ex){           
        }
        
        return id_Incorrectas;
    }
    
     
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbAcierto;
    private javax.swing.JLabel jlbCategoria;
    private javax.swing.JLabel jlbJugador1;
    private javax.swing.JLabel jlbJugador2;
    private javax.swing.JLabel jlbOpcion1;
    private javax.swing.JLabel jlbOpcion2;
    private javax.swing.JLabel jlbOpcion3;
    private javax.swing.JLabel jlbOpcion4;
    private javax.swing.JLabel jlbResponde;
    private javax.swing.JLabel jlbp1;
    private javax.swing.JLabel jlbp2;
    private javax.swing.JTextArea txtPregunta;
    private javax.swing.JTextField txtResponde;
    // End of variables declaration//GEN-END:variables
}
