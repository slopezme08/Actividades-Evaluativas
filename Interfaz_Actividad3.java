/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicios_resueltos_actividad3;

/**
 *
 * @author User
 */
public class Interfaz_Actividad3 extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz_Actividad3
     */
    public Interfaz_Actividad3() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RadioCirculo = new javax.swing.JTextField();
        BaseRectangulo = new javax.swing.JTextField();
        AlturaRectangulo = new javax.swing.JTextField();
        LadoCuadrado = new javax.swing.JTextField();
        BaseTriangulo = new javax.swing.JTextField();
        AlturaTriangulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Salida2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnParte1 = new javax.swing.JMenu();
        EjercicioP18 = new javax.swing.JMenuItem();
        EjercicioP19 = new javax.swing.JMenuItem();
        EjercicioR7 = new javax.swing.JMenuItem();
        EjercicioR10 = new javax.swing.JMenuItem();
        EjercicioP22 = new javax.swing.JMenuItem();
        EjercicioP23 = new javax.swing.JMenuItem();
        EjercicioP40 = new javax.swing.JMenuItem();
        EjercicioP41 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Parte 2: Ejercicio Figuras Geométricas");

        jLabel2.setText("Cuadrado");

        jLabel3.setText("Circulo");

        jLabel4.setText("Rectángulo");

        jLabel5.setText("Triángulo");

        RadioCirculo.setText(" ");

        BaseRectangulo.setText(" ");

        AlturaRectangulo.setText(" ");

        LadoCuadrado.setText(" ");

        BaseTriangulo.setText(" ");
        BaseTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaseTrianguloActionPerformed(evt);
            }
        });

        AlturaTriangulo.setText(" ");

        jLabel6.setText("Radio");

        jLabel8.setText("Base");

        jLabel9.setText("Altura");

        jLabel11.setText("Lado");

        jLabel13.setText("Base");

        jLabel14.setText("Altura");

        Salida.setText("jLabel15");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        Salida2.setText("jLabel7");

        mnParte1.setText("Parte 1 ");

        EjercicioP18.setText("Ejercicio Propuesto 18");
        EjercicioP18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjercicioP18ActionPerformed(evt);
            }
        });
        mnParte1.add(EjercicioP18);

        EjercicioP19.setText("Ejercicio Propuesto 19 ");
        EjercicioP19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjercicioP19ActionPerformed(evt);
            }
        });
        mnParte1.add(EjercicioP19);

        EjercicioR7.setText("Ejercicio Resuelto 7");
        EjercicioR7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjercicioR7ActionPerformed(evt);
            }
        });
        mnParte1.add(EjercicioR7);

        EjercicioR10.setText("Ejercicio Resuelto 10");
        EjercicioR10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjercicioR10ActionPerformed(evt);
            }
        });
        mnParte1.add(EjercicioR10);

        EjercicioP22.setText("Ejercicio Propuesto 22");
        EjercicioP22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjercicioP22ActionPerformed(evt);
            }
        });
        mnParte1.add(EjercicioP22);

        EjercicioP23.setText("Ejercicio Propuesto 23");
        EjercicioP23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjercicioP23ActionPerformed(evt);
            }
        });
        mnParte1.add(EjercicioP23);

        EjercicioP40.setText("Ejercicio Propuesto 40");
        EjercicioP40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjercicioP40ActionPerformed(evt);
            }
        });
        mnParte1.add(EjercicioP40);

        EjercicioP41.setText("Ejercicio Propuesto 41");
        EjercicioP41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjercicioP41ActionPerformed(evt);
            }
        });
        mnParte1.add(EjercicioP41);

        jMenuBar1.add(mnParte1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BaseRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel13))
                                            .addComponent(BaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AlturaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel14)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnSalir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                                .addContainerGap(52, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(46, 46, 46)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Salida)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCalcular)
                                        .addGap(56, 56, 56)
                                        .addComponent(btnBorrar))
                                    .addComponent(Salida2))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel8)
                .addGap(86, 86, 86)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BaseRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlturaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(AlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnBorrar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(Salida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salida2)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EjercicioR7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjercicioR7ActionPerformed
        EjercicioResuelto7 venER7 = new EjercicioResuelto7();
        venER7.setVisible(true);
    }//GEN-LAST:event_EjercicioR7ActionPerformed

    private void EjercicioP19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjercicioP19ActionPerformed
        EjercicioPropuesto19 venEP19 = new EjercicioPropuesto19();
        venEP19.setVisible(true);
    }//GEN-LAST:event_EjercicioP19ActionPerformed

    private void EjercicioP22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjercicioP22ActionPerformed
    EjercicioPropuesto22 venEP22 = new EjercicioPropuesto22();
        venEP22.setVisible(true);
    }//GEN-LAST:event_EjercicioP22ActionPerformed

    private void EjercicioP23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjercicioP23ActionPerformed
        EjercicioPropuesto23 venEP23 = new EjercicioPropuesto23();
        venEP23.setVisible(true);
    }//GEN-LAST:event_EjercicioP23ActionPerformed

    private void EjercicioP40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjercicioP40ActionPerformed
        EjercicioPropuesto40 venEP40 = new EjercicioPropuesto40();
        venEP40.setVisible(true);
    }//GEN-LAST:event_EjercicioP40ActionPerformed

    private void EjercicioP41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjercicioP41ActionPerformed
        EjercicioPropuesto41 venEP41 = new EjercicioPropuesto41();
        venEP41.setVisible(true);
    }//GEN-LAST:event_EjercicioP41ActionPerformed

    private void EjercicioP18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjercicioP18ActionPerformed
       EjercicioPropuesto18 venEP18 = new EjercicioPropuesto18();
       venEP18.setVisible(true);
    }//GEN-LAST:event_EjercicioP18ActionPerformed

    private void EjercicioR10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjercicioR10ActionPerformed
        EjercicioResuelto10 venER10 = new EjercicioResuelto10();
        venER10.setVisible(true);
    }//GEN-LAST:event_EjercicioR10ActionPerformed

    private void BaseTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaseTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BaseTrianguloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        RadioCirculo.setText("");
        BaseRectangulo.setText("");
        AlturaRectangulo.setText("");
        LadoCuadrado.setText("");
        BaseTriangulo.setText("");
        AlturaTriangulo.setText("");
        Salida.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double radio, baser, alturar, ladoc, baset, alturat;
        double percir, arecir, perre, arre, percua, arecua, pertr, artr;
        String salida, salida2, identificador;
        
        radio = Double.parseDouble(RadioCirculo.getText());
        baser = Double.parseDouble(BaseRectangulo.getText());
        alturar = Double.parseDouble(AlturaRectangulo.getText());
        ladoc = Double.parseDouble(LadoCuadrado.getText());
        baset = Double.parseDouble(BaseTriangulo.getText());
        alturat = Double.parseDouble(AlturaTriangulo.getText());
        
        percir = Math.round(Operador.perimetroCirculo(radio));
        arecir = Math.round(Operador.areaCirculo(radio));
        perre = Math.round(Operador.perimetroRectangulo(baser, alturar));
        arre = Operador.areaRectangulo(baser, alturar);
        percua = Operador.perimetroCuadrado(ladoc);
        arecua = Operador.areaCuadrado(ladoc);
        pertr = Operador.perimetroTriangulix(baset, alturat);
        artr = Operador.areaTriangulix(baset, alturat);
        identificador = Operador.identificadorTriangulix(baset, alturat);
        
        salida = "El perímetro del círculo: " + percir + ", el área del círculo: " + arecir + ", el perímetro del rectángulo: " + perre + 
                ", \n el área del rectángulo: " + arre + ", el perimetro del cuadrado: " + percua + ", el área del cuadrado: " + arecua;
                
        
        salida2 = "El perimetro del triángulo: " + pertr + ", el área del triángulo: " + artr + ", el triángulo es: " + identificador + ".";
        Salida.setText(salida);
        Salida2.setText(salida2);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Actividad3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Actividad3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Actividad3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Actividad3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Actividad3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlturaRectangulo;
    private javax.swing.JTextField AlturaTriangulo;
    private javax.swing.JTextField BaseRectangulo;
    private javax.swing.JTextField BaseTriangulo;
    private javax.swing.JMenuItem EjercicioP18;
    private javax.swing.JMenuItem EjercicioP19;
    private javax.swing.JMenuItem EjercicioP22;
    private javax.swing.JMenuItem EjercicioP23;
    private javax.swing.JMenuItem EjercicioP40;
    private javax.swing.JMenuItem EjercicioP41;
    private javax.swing.JMenuItem EjercicioR10;
    private javax.swing.JMenuItem EjercicioR7;
    private javax.swing.JTextField LadoCuadrado;
    private javax.swing.JTextField RadioCirculo;
    private javax.swing.JLabel Salida;
    private javax.swing.JLabel Salida2;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mnParte1;
    // End of variables declaration//GEN-END:variables
}
