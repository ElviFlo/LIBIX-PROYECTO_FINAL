/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.Timer;

/**
 *
 * @author Elvira Florez
 */
public class Warning extends javax.swing.JFrame {

    String mensaje;

    public Warning(String mensaje) {
        this.mensaje = mensaje;
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        this.setLocation(450, 260);
        warming.setText(mensaje);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blurBackground1 = new Componentes.BlurBackground();
        boton_aceptar = new Componentes.AllButton();
        jPanel1 = new javax.swing.JPanel();
        warming = new org.example.Custom.AnimatedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(995, 548));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blurBackground1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Warning.png"))); // NOI18N
        blurBackground1.setRadius(40);
        blurBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_aceptar.setText("Aceptar");
        boton_aceptar.setBorderLength(1);
        boton_aceptar.setChangeCoefficient(20);
        boton_aceptar.setColor1Foreground(new java.awt.Color(169, 167, 167));
        boton_aceptar.setColor2Over(new java.awt.Color(82, 132, 192));
        boton_aceptar.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        boton_aceptar.setColor3Click(new java.awt.Color(40, 76, 118));
        boton_aceptar.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        boton_aceptar.setColor4Border(new java.awt.Color(153, 153, 153));
        boton_aceptar.setEnableBorder(true);
        boton_aceptar.setEnableColorGradient(true);
        boton_aceptar.setEnableShadow(true);
        boton_aceptar.setFont(new java.awt.Font("Century", 1, 15)); // NOI18N
        boton_aceptar.setRoundBottomLeft(8);
        boton_aceptar.setRoundBottomRight(8);
        boton_aceptar.setRoundTopLeft(8);
        boton_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_aceptarMouseClicked(evt);
            }
        });
        boton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_aceptarActionPerformed(evt);
            }
        });
        blurBackground1.add(boton_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 312, 43));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        blurBackground1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 30, 30));

        warming.setForeground(new java.awt.Color(204, 204, 204));
        warming.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        warming.setEnableUnderline(false);
        warming.setEnabled(false);
        warming.setFont(new java.awt.Font("Century", 0, 20)); // NOI18N
        blurBackground1.add(warming, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 300, 80));

        getContentPane().add(blurBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 452, 205));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_aceptarMouseClicked
        this.dispose();
    }//GEN-LAST:event_boton_aceptarMouseClicked

    private void boton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Warning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Warning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Warning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Warning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Warning("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.BlurBackground blurBackground1;
    private Componentes.AllButton boton_aceptar;
    private javax.swing.JPanel jPanel1;
    private org.example.Custom.AnimatedTextField warming;
    // End of variables declaration//GEN-END:variables
}
