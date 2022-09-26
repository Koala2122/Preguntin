package Presentacion;

import Dominio.Controladora;
import Dominio.Resultados;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class jfrmResultado extends javax.swing.JFrame {
       
    private DefaultListModel modelo = new DefaultListModel();
    private Controladora controladora;
  
    public jfrmResultado(Controladora cont) {
        initComponents();
        
        
    }
    
        private void CargarLista(){
        DefaultListModel modelo = new DefaultListModel();
        ArrayList colPreguntas = controladora.ListarResultado();
        
        for (int i=0; i < colPreguntas.size(); i++){
            
            modelo.addElement(colPreguntas.get(i));
        }
        lstBoletos.setModel(modelo);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnResult = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBoletos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("Resultados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 47, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 80, 30));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 40, 50));

        btnResult.setText("Cargar Resultados");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        getContentPane().add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        lstBoletos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstBoletos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
       this.CargarLista();
    }//GEN-LAST:event_btnResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstBoletos;
    // End of variables declaration//GEN-END:variables
}
