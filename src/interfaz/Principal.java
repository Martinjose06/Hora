/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import clases.*;

/**
 *
 * @author mzuleta4
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Hora h,h2;
    public Principal() {
        initComponents();
        txtHoras.requestFocusInWindow();
        cmdValidar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        txtMinutos = new javax.swing.JTextField();
        txtSegundos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdValidar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdIgual = new javax.swing.JButton();
        cmdMayorMenorQue = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        cmdRestaurar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtHoras1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMinutos1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSegundos1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hour");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Hour");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Hours");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Minutes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Seconds");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));
        jPanel1.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 70, -1));
        jPanel1.add(txtMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 70, -1));
        jPanel1.add(txtSegundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 70, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 13))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdValidar.setText("Validate");
        cmdValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValidarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, -1));

        cmdMostrar.setText("To Show");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, -1));

        cmdIgual.setText("Same");
        cmdIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIgualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));

        cmdMayorMenorQue.setText("Smaller or Greater Than");
        cmdMayorMenorQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMayorMenorQueActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMayorMenorQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, -1));

        cmdCrear.setText("Create");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, -1));

        cmdRestaurar.setText("Restore");
        cmdRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestaurarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 190, 280));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Results", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 13))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 18, 450, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 480, 150));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Hours");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel1.add(txtHoras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 70, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Minutes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));
        jPanel1.add(txtMinutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 70, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Seconds");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        jPanel1.add(txtSegundos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 70, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Hour 2");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Hour 1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

        setSize(new java.awt.Dimension(749, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        int Hora = 0, Hora2 = 0, Min = 0, Min2 = 0, Seg = 0, Seg2 = 0, sw = 1;
        try {
            Hora = Integer.parseInt(txtHoras.getText());
            Hora2 = Integer.parseInt(txtHoras1.getText());
            Min = Integer.parseInt(txtMinutos.getText());
            Min2 = Integer.parseInt(txtMinutos1.getText());
            Seg = Integer.parseInt(txtSegundos.getText());
            Seg2 = Integer.parseInt(txtSegundos1.getText());
        } catch (NumberFormatException | NullPointerException e) {
            Helper.mensaje(this, "Ingrese datos correctamente", "Error", 2);
            sw = 0;
        }
        if (sw == 1) {
            h = new Hora(Hora, Min, Seg);
            h2 = new Hora(Hora2, Min2, Seg2);
            Helper.mensaje(this, "Horas Agregadas", "Horas Agregadas", 1);
            cmdValidar.setEnabled(true);
        }


    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValidarActionPerformed
        try{
        h.validar(h2);
        } catch (Exception e){
        }
        cmdValidar.setEnabled(false);
    }//GEN-LAST:event_cmdValidarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        txtResultado.setText("");
        String aux = null;
        try {
        aux = h.mostrar(h2);
        } catch (Exception e){
        }
        txtResultado.append(aux);
        
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIgualActionPerformed
        try{
        h.igual(h2);
        }catch (Exception e){
        }
    }//GEN-LAST:event_cmdIgualActionPerformed

    private void cmdMayorMenorQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMayorMenorQueActionPerformed
        try {
        h.MayorQue(h2);
        } catch (Exception e){
        }
    }//GEN-LAST:event_cmdMayorMenorQueActionPerformed

    private void cmdRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestaurarActionPerformed

        txtHoras.setText("");
        txtHoras1.setText("");
        txtMinutos.setText("");
        txtMinutos1.setText("");
        txtSegundos.setText("");
        txtSegundos1.setText("");
        txtResultado.setText("");
        txtHoras.requestFocusInWindow();
    }//GEN-LAST:event_cmdRestaurarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdIgual;
    private javax.swing.JButton cmdMayorMenorQue;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdRestaurar;
    private javax.swing.JButton cmdValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtHoras1;
    private javax.swing.JTextField txtMinutos;
    private javax.swing.JTextField txtMinutos1;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtSegundos;
    private javax.swing.JTextField txtSegundos1;
    // End of variables declaration//GEN-END:variables
}
