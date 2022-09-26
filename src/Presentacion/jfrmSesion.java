package Presentacion;

import Dominio.Controladora;
import Dominio.Jugador;
import javax.swing.JOptionPane;

public class jfrmSesion extends javax.swing.JFrame {

    private Controladora controladora;
    
    public jfrmSesion(Controladora cont) {
        initComponents();
        
        controladora = cont;
        txtJugador1.requestFocus();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JTextField();
        txtJugador2 = new javax.swing.JTextField();
        BtnComenzar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnResultados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("JUGADOR 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("JUGADOR 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 111, 20));
        getContentPane().add(txtJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 100, -1));
        getContentPane().add(txtJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 100, -1));

        BtnComenzar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        BtnComenzar.setText("¡Comenzar!");
        BtnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComenzarActionPerformed(evt);
            }
        });
        BtnComenzar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnComenzarKeyPressed(evt);
            }
        });
        getContentPane().add(BtnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otros/logo grande png.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otros/marcorojo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 144, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otros/marco_azul.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 170, 120));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 180, 20));

        btnResultados.setText("Resultados");
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Este boton incia el Formulario Juego
    private void BtnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComenzarActionPerformed
        
        Jugador Jugador1 = new Jugador();
        Jugador Jugador2 = new Jugador();  
        
        Jugador1.setNombre(txtJugador1.getText());
        Jugador2.setNombre(txtJugador2.getText());
        
        controladora.AgregarJugador(Jugador1);
        controladora.AgregarJugador(Jugador2);
        
        jfrmJuego Juego = new jfrmJuego(controladora, Jugador1, Jugador2);
            Juego.setVisible(true);
        
    }//GEN-LAST:event_BtnComenzarActionPerformed
    
    public String j1(){
        
        String Jugador1 = null;
        
        Jugador1 = txtJugador1.getText();
        
        return Jugador1;
        
}
    
    
    private void BtnComenzarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnComenzarKeyPressed
        
        Jugador Jugador1 = new Jugador();
        Jugador Jugador2 = new Jugador();  
        
        Jugador1.setNombre(txtJugador1.getText());
        Jugador2.setNombre(txtJugador2.getText());
        
        controladora.AgregarJugador(Jugador1);
        controladora.AgregarJugador(Jugador2);
        
        jfrmJuego Juego = new jfrmJuego(controladora,Jugador1, Jugador2);
            Juego.setVisible(true);
    }//GEN-LAST:event_BtnComenzarKeyPressed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        jfrmResultado Resultado = new jfrmResultado(controladora);
        Resultado.setVisible(true);
    }//GEN-LAST:event_btnResultadosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnComenzar;
    private javax.swing.JButton btnResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables


}
