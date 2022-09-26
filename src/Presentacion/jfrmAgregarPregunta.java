package Presentacion;

import Dominio.Controladora;
import Dominio.Correctas;
import Dominio.Incorrectas;
import javax.swing.JOptionPane;
import Dominio.Preguntas;

public class jfrmAgregarPregunta extends javax.swing.JFrame {

  private Controladora controladora;
    
    public jfrmAgregarPregunta(Controladora cont) {
        initComponents();
        
        controladora = cont;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        txtAgregar = new javax.swing.JButton();
        txtPregunta = new javax.swing.JTextField();
        txtCorrecta = new javax.swing.JTextField();
        txtIncorrecta1 = new javax.swing.JTextField();
        txtIncorrecta2 = new javax.swing.JTextField();
        txtIncorrecta3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boxcategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAgregar.setText("Agregar");
        txtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(txtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 381, -1, -1));

        txtPregunta.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtPregunta.setText("Agregar una pregunta...");
        txtPregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPreguntaMouseClicked(evt);
            }
        });
        getContentPane().add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 174, 484, 58));

        txtCorrecta.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtCorrecta.setText("Correcta...");
        txtCorrecta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorrectaMouseClicked(evt);
            }
        });
        getContentPane().add(txtCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 240, 100, -1));

        txtIncorrecta1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtIncorrecta1.setText("Opcion 1");
        txtIncorrecta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIncorrecta1MouseClicked(evt);
            }
        });
        getContentPane().add(txtIncorrecta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 240, 95, -1));

        txtIncorrecta2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtIncorrecta2.setText("Opcion 2");
        txtIncorrecta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIncorrecta2MouseClicked(evt);
            }
        });
        getContentPane().add(txtIncorrecta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 319, 87, -1));

        txtIncorrecta3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtIncorrecta3.setText("Opcion 3");
        txtIncorrecta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIncorrecta3MouseClicked(evt);
            }
        });
        getContentPane().add(txtIncorrecta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 319, 95, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Categoria: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 63, -1, -1));

        boxcategoria.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        boxcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Historia", "Musica", "Ingles", "Cultura General", "Mat y Geo", "Deporte", "Ciencia" }));
        boxcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxcategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(boxcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 83, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otros/logo3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 181, 152));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Ingrese su pregunta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 140, 286, 23));

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Limpia las cajas de texto
    private void txtPreguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPreguntaMouseClicked
        this.txtPregunta.setText("");
    }//GEN-LAST:event_txtPreguntaMouseClicked

    private void txtCorrectaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorrectaMouseClicked
        this.txtCorrecta.setText("");
    }//GEN-LAST:event_txtCorrectaMouseClicked

    private void txtIncorrecta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIncorrecta1MouseClicked
        this.txtIncorrecta1.setText("");
    }//GEN-LAST:event_txtIncorrecta1MouseClicked

    private void txtIncorrecta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIncorrecta2MouseClicked
        this.txtIncorrecta2.setText("");
    }//GEN-LAST:event_txtIncorrecta2MouseClicked

    private void txtIncorrecta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIncorrecta3MouseClicked
        this.txtIncorrecta3.setText("");
    }//GEN-LAST:event_txtIncorrecta3MouseClicked

    private void txtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarActionPerformed
        
        Preguntas unaPregunta = new Preguntas();
        Correctas unaCorrecta = new Correctas();
        Incorrectas inco1 = new Incorrectas();
        Incorrectas inco2 = new Incorrectas();
        Incorrectas inco3 = new Incorrectas();
               
        String item="";//inicio de la seleccion de item del box
        item=boxcategoria.getSelectedItem().toString();//tomA dato del combo box
           
        unaPregunta.setCategoria(item);//le paso la seleccion del combo box a categoria.
        unaPregunta.setPregunta(txtPregunta.getText());
        unaCorrecta.setRespuesta(txtCorrecta.getText());
        inco1.setRespuesta(txtIncorrecta1.getText());
        inco2.setRespuesta(txtIncorrecta2.getText());
        inco3.setRespuesta(txtIncorrecta3.getText());
        JOptionPane.showMessageDialog(null,"La pregunta fue guardada en la categoria "+item);
        
        
        controladora.AgregarCorrecta(unaCorrecta);
        controladora.AgregarIncorrecta(inco1);
        controladora.AgregarIncorrecta(inco2);
        controladora.AgregarIncorrecta(inco3);
        controladora.AgregarPregunta(unaPregunta);  
        
    }//GEN-LAST:event_txtAgregarActionPerformed

    private void boxcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxcategoriaActionPerformed
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxcategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton txtAgregar;
    private javax.swing.JTextField txtCorrecta;
    private javax.swing.JTextField txtIncorrecta1;
    private javax.swing.JTextField txtIncorrecta2;
    private javax.swing.JTextField txtIncorrecta3;
    private javax.swing.JTextField txtPregunta;
    // End of variables declaration//GEN-END:variables
}
