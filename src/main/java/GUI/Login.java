/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConexionBD.ConexionBD;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Elvira Florez
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login2
     */
    public Login() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        bt_minimizar.setColor1Background(new Color(0, 0, 0, 0));
        bt_cerrar.setColor1Background(new Color(0, 0, 0, 0));
        esconder.setVisible(false);
    }
    
    //Para Aceder a los diferentes JFrame
    public static String Usuario;
    Paciente JF_Paciente = new Paciente();
    CrearPaciente JF_CrearPaciente = new CrearPaciente();
    Jefe JF_Jefe = new Jefe();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        blurBackground1 = new Componentes.BlurBackground();
        RBT_Paciente = new javax.swing.JRadioButton();
        RBT_Empleado = new javax.swing.JRadioButton();
        BT_Registrarse = new Componentes.AllButton();
        BT_Ingresar = new Componentes.AllButton();
        contraseña = new org.example.Custom.PanelRound();
        TX_Contraseña = new org.example.Custom.AnimatedPasswordField();
        ver = new javax.swing.JLabel();
        esconder = new javax.swing.JLabel();
        Panel_Usuario = new org.example.Custom.PanelRound();
        TX_Usuario = new org.example.Custom.AnimatedTextField();
        barra_superior = new javax.swing.JPanel();
        bt_cerrar = new Componentes.AllButton();
        bt_minimizar = new Componentes.AllButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 548));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blurBackground1.setImage(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        blurBackground1.setRadius(40);
        blurBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botones.add(RBT_Paciente);
        blurBackground1.add(RBT_Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 30, 30));

        botones.add(RBT_Empleado);
        blurBackground1.add(RBT_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, 30));

        BT_Registrarse.setText("Registrarse");
        BT_Registrarse.setChangeCoefficient(20);
        BT_Registrarse.setColor1Background(new java.awt.Color(82, 132, 192));
        BT_Registrarse.setColor1Foreground(new java.awt.Color(255, 255, 255));
        BT_Registrarse.setColor2Over(new java.awt.Color(40, 76, 118));
        BT_Registrarse.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        BT_Registrarse.setColor3Click(new java.awt.Color(102, 153, 255));
        BT_Registrarse.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        BT_Registrarse.setEnableColorGradient(true);
        BT_Registrarse.setEnableShadow(true);
        BT_Registrarse.setFont(new java.awt.Font("Century", 1, 15)); // NOI18N
        BT_Registrarse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_RegistrarseMouseClicked(evt);
            }
        });
        BT_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_RegistrarseActionPerformed(evt);
            }
        });
        blurBackground1.add(BT_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 412, 187, 38));

        BT_Ingresar.setText("Ingresar");
        BT_Ingresar.setChangeCoefficient(20);
        BT_Ingresar.setColor1Background(new java.awt.Color(82, 132, 192));
        BT_Ingresar.setColor1Foreground(new java.awt.Color(255, 255, 255));
        BT_Ingresar.setColor2Over(new java.awt.Color(40, 76, 118));
        BT_Ingresar.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        BT_Ingresar.setColor3Click(new java.awt.Color(102, 153, 255));
        BT_Ingresar.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        BT_Ingresar.setEnableColorGradient(true);
        BT_Ingresar.setEnableShadow(true);
        BT_Ingresar.setFont(new java.awt.Font("Century", 1, 15)); // NOI18N
        BT_Ingresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_IngresarMouseClicked(evt);
            }
        });
        BT_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_IngresarActionPerformed(evt);
            }
        });
        blurBackground1.add(BT_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 412, 187, 38));

        contraseña.setRadius(20);
        contraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        TX_Contraseña.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_Contraseña.setHint("Contraseña");
        TX_Contraseña.setHintColor(new java.awt.Color(153, 153, 153));
        TX_Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_ContraseñaKeyTyped(evt);
            }
        });
        contraseña.add(TX_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 50));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        contraseña.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 30));

        esconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/esconder.png"))); // NOI18N
        esconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esconderMouseClicked(evt);
            }
        });
        contraseña.add(esconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 30));

        blurBackground1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 415, 48));

        Panel_Usuario.setRadius(20);
        Panel_Usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        TX_Usuario.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_Usuario.setHint("Ingresar Usuario");
        TX_Usuario.setHintColor(new java.awt.Color(153, 153, 153));
        TX_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_UsuarioKeyTyped(evt);
            }
        });
        Panel_Usuario.add(TX_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 390, 50));

        blurBackground1.add(Panel_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 415, 48));

        barra_superior.setOpaque(false);
        barra_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superiorMouseDragged(evt);
            }
        });
        barra_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superiorMousePressed(evt);
            }
        });
        barra_superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_cerrar.setText("X");
        bt_cerrar.setChangeCoefficient(15);
        bt_cerrar.setColor1Background(new java.awt.Color(172, 206, 252));
        bt_cerrar.setColor2Over(new java.awt.Color(102, 153, 255));
        bt_cerrar.setColor3Click(new java.awt.Color(0, 102, 255));
        bt_cerrar.setEnableColorGradient(true);
        bt_cerrar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        bt_cerrar.setRoundBottomLeft(0);
        bt_cerrar.setRoundBottomRight(0);
        bt_cerrar.setRoundTopLeft(0);
        bt_cerrar.setRoundTopRight(15);
        bt_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrarMouseClicked(evt);
            }
        });
        barra_superior.add(bt_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 0, 50, 22));

        bt_minimizar.setText("-");
        bt_minimizar.setChangeCoefficient(15);
        bt_minimizar.setColor1Background(new java.awt.Color(172, 206, 252));
        bt_minimizar.setColor2Over(new java.awt.Color(102, 153, 255));
        bt_minimizar.setColor3Click(new java.awt.Color(0, 102, 255));
        bt_minimizar.setEnableColorGradient(true);
        bt_minimizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_minimizar.setRoundBottomLeft(15);
        bt_minimizar.setRoundBottomRight(0);
        bt_minimizar.setRoundTopLeft(0);
        bt_minimizar.setRoundTopRight(0);
        bt_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_minimizarMouseClicked(evt);
            }
        });
        barra_superior.add(bt_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 0, 50, 22));

        blurBackground1.add(barra_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        getContentPane().add(blurBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_RegistrarseMouseClicked
        JF_CrearPaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BT_RegistrarseMouseClicked

    private void BT_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_RegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_RegistrarseActionPerformed

    int mouseX, mouseY;

    private void BT_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_IngresarMouseClicked
        if (TX_Usuario.getText().isEmpty()) {
            new Warming("Falta ingresar el Usuario").setVisible(true);
        } else if (TX_Contraseña.getText().isEmpty()) {
            new Warming("Falta ingresar la contraseña").setVisible(true);
            //Si no selecciono el tipo de usuario
        } else if (RBT_Empleado.isSelected() == false && RBT_Paciente.isSelected() == false) {
            new Warming("Falta el tipo de usuario").setVisible(true);
        } else {
            //Si el Usuario Existe
            if (UsuarioExiste() == false) {
                new Warming("El Usuario ingresado no existe").setVisible(true);
                //Si la contra no concide con el usuario
            } else if (ContraConcide() == false) {
                new Warming("Contraseña incorrecta").setVisible(true);

            } else {
                Usuario = TX_Usuario.getText();
                //Si se selecciona Empleado
                if (RBT_Empleado.isSelected()) {
                    //Dependiendo del Tipo en la BD, Mostrar el JFrame correspondiente
                    switch (ObtenerTipo()) {
                        case "Doctor":

                            break;
                        case "Admin":

                            break;
                        case "Jefe":
                            JF_Jefe.setVisible(true);
                            this.setVisible(false);
                            break;
                        //Si no concide con ningun tipo, error
                        default:
                            new Warming("El usuario no es tipo Empleado").setVisible(true);
                            break;
                    }
                    //Si selecciona Paciente
                } else {
                    if ("Paciente".equals(ObtenerTipo())) {
                        JF_Paciente.setVisible(true);
                    } else {
                        new Warming("El usuario no es tipo Pacient").setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_BT_IngresarMouseClicked

    private void BT_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_IngresarActionPerformed

    private void bt_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_cerrarMouseClicked

    private void bt_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_minimizarMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_bt_minimizarMouseClicked

    private void barra_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_barra_superiorMouseDragged

    private void barra_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barra_superiorMousePressed

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        esconder.setVisible(true);
        ver.setVisible(false);
        TX_Contraseña.setEchoChar((char) 0);
    }//GEN-LAST:event_verMouseClicked

    private void esconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esconderMouseClicked
        esconder.setVisible(false);
        ver.setVisible(true);
        TX_Contraseña.setEchoChar('*');
    }//GEN-LAST:event_esconderMouseClicked

    private void TX_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TX_UsuarioKeyTyped
        //Para que el TX acepte solo letras 
        int key = evt.getKeyChar();
        boolean Mayusculas = key >= 65 && key <= 90;
        boolean Minusculas = key >= 97 && key <= 122;
        if (!(Minusculas || Mayusculas)) {
            evt.consume();
        }
        //Establecer limite de caracteres
        if (TX_Usuario.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_TX_UsuarioKeyTyped

    private void TX_ContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TX_ContraseñaKeyTyped
        //Para que el TX acepte solo letras y espacios
        int key = evt.getKeyChar();
        boolean Mayusculas = key >= 65 && key <= 90;
        boolean Minusculas = key >= 97 && key <= 122;
        boolean Numeros = key >= 48 && key <= 57;
        boolean Espacio = key == 32;
        if (!(Minusculas || Mayusculas || Numeros || Espacio)) {
            evt.consume();
        }
        //Establecer limite de caracteres
        if (TX_Contraseña.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_TX_ContraseñaKeyTyped

    public Boolean UsuarioExiste() {

        try {
            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();

            //Para buscar si existe el usuario a crear
            String SQL = "SELECT * FROM Usuarios WHERE Usuario = ?";

            PreparedStatement pst = Conexion.prepareStatement(SQL);

            pst.setString(1, TX_Usuario.getText());
            //Extrae el conjunto de resultados 
            ResultSet rs = pst.executeQuery();

            //Si hay mas de un resultado: true
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException | HeadlessException e) {
            return false;
        }

    }

    public Boolean ContraConcide() {

        try {
            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();

            //La consulta devuelve un resultado que cuenta el número de filas en la tabla "Usuarios" 
            //donde el campo "Usuario" y el campo "Contraseña" coinciden con los valores proporcionados como parámetros.
            //Si la cuenta es 1, significa que se encontró un usuario válido que coincide con los valores proporcionados
            String SQL = "SELECT COUNT(*) As concidecontra FROM Usuarios WHERE Usuario = ? AND Contraseña = ?";

            PreparedStatement pst = Conexion.prepareStatement(SQL);

            pst.setString(1, TX_Usuario.getText());
            pst.setString(2, TX_Contraseña.getText());
            //Extrae el conjunto de resultados 
            ResultSet rs = pst.executeQuery();
            rs.next();
            int existeUsuario = rs.getInt("concidecontra");

            return existeUsuario == 1;

        } catch (SQLException | HeadlessException e) {
            return false;
        }

    }

    public String ObtenerTipo() {

        try {
            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();

            //Para obtener el valor de la casilla Tipo que concida con el usuario ingresado
            String SQL = "SELECT Tipo FROM Usuarios WHERE Usuario = ?";

            PreparedStatement pst = Conexion.prepareStatement(SQL);

            pst.setString(1, TX_Usuario.getText());
            //Extrae el conjunto de resultados 
            ResultSet rs = pst.executeQuery();

            //Si hay mas de un resultado: true
            if (rs.next()) {
                //Retornar el Tipo del usuario
                return rs.getString("Tipo");
            }
        } catch (SQLException | HeadlessException e) {
            return null;
        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.AllButton BT_Ingresar;
    private Componentes.AllButton BT_Registrarse;
    private org.example.Custom.PanelRound Panel_Usuario;
    private javax.swing.JRadioButton RBT_Empleado;
    private javax.swing.JRadioButton RBT_Paciente;
    private org.example.Custom.AnimatedPasswordField TX_Contraseña;
    private org.example.Custom.AnimatedTextField TX_Usuario;
    private javax.swing.JPanel barra_superior;
    private Componentes.BlurBackground blurBackground1;
    private javax.swing.ButtonGroup botones;
    private Componentes.AllButton bt_cerrar;
    private Componentes.AllButton bt_minimizar;
    private org.example.Custom.PanelRound contraseña;
    private javax.swing.JLabel esconder;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
