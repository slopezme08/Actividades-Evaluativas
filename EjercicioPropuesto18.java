/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicios_resueltos_actividad3;

/**
 *
 * @author User
 */
public class EjercicioPropuesto18 extends javax.swing.JFrame {

    /**
     * Creates new form EjercicioPropuesto18
     */
    public EjercicioPropuesto18() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigo18 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre18 = new javax.swing.JTextField();
        horas18 = new javax.swing.JTextField();
        valorhora18 = new javax.swing.JTextField();
        retencion18 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCalcular18 = new javax.swing.JButton();
        btnBorrar18 = new javax.swing.JButton();
        btnSalir18 = new javax.swing.JButton();
        Salida18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ejercicio Propuesto 18: Salario Neto");

        codigo18.setText(" ");
        codigo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo18ActionPerformed(evt);
            }
        });

        jLabel2.setText("Código del Empleado");

        jLabel3.setText("Nombre");

        nombre18.setText(" ");

        horas18.setText(" ");

        valorhora18.setText(" ");

        retencion18.setText(" ");

        jLabel4.setText("Horas Trabajadas");

        jLabel5.setText("Valor Hora");

        jLabel6.setText("% Retención");

        btnCalcular18.setText("Calcular");
        btnCalcular18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular18ActionPerformed(evt);
            }
        });

        btnBorrar18.setText("Borrar");
        btnBorrar18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar18ActionPerformed(evt);
            }
        });

        btnSalir18.setText("Salir");
        btnSalir18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salida18)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalcular18)
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnBorrar18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(btnSalir18)
                                .addGap(10, 10, 10))
                            .addComponent(codigo18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horas18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorhora18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retencion18, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codigo18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horas18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(valorhora18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retencion18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar18)
                    .addComponent(btnSalir18)
                    .addComponent(btnCalcular18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Salida18)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcular18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular18ActionPerformed
        double horas, valorhora, retencion, salarioBruto, salarioNeto;
        String nombre = nombre18.getText();
        String codigo = codigo18.getText();
        horas = Double.parseDouble(horas18.getText());
        valorhora = Double.parseDouble(valorhora18.getText());
        retencion = Double.parseDouble(retencion18.getText());
        salarioBruto = Operador.salarioBruto(horas, valorhora);
        salarioNeto = Operador.salarioNeto(salarioBruto, retencion);
        String salida = "El trabajador " + nombre + ", identificado con el codigo: " 
                + codigo  + ". Recibe un salario Bruto de " + salarioBruto + ", y un salario Neto de " + salarioNeto;
        Salida18.setText(String.valueOf(salida));
        
    }//GEN-LAST:event_btnCalcular18ActionPerformed

    private void codigo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo18ActionPerformed

    private void btnSalir18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir18ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir18ActionPerformed

    private void btnBorrar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar18ActionPerformed
        codigo18.setText("");
        nombre18.setText("");
        horas18.setText("");
        valorhora18.setText("");
        retencion18.setText("");
        Salida18.setText("");
    }//GEN-LAST:event_btnBorrar18ActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioPropuesto18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioPropuesto18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioPropuesto18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioPropuesto18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioPropuesto18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Salida18;
    private javax.swing.JButton btnBorrar18;
    private javax.swing.JButton btnCalcular18;
    private javax.swing.JButton btnSalir18;
    private javax.swing.JTextField codigo18;
    private javax.swing.JTextField horas18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombre18;
    private javax.swing.JTextField retencion18;
    private javax.swing.JTextField valorhora18;
    // End of variables declaration//GEN-END:variables
}
