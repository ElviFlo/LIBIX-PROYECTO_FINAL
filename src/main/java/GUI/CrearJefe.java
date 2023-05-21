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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Elvira Florez
 */
public class CrearJefe extends javax.swing.JFrame {

    /**
     * Creates new form Login2
     */
    
    String sx;
    int op;
    String TipoDocumento = "";
    
    public CrearJefe() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        bt_minimizar.setColor1Background(new Color(0, 0, 0, 0));
        bt_cerrar.setColor1Background(new Color(0, 0, 0, 0));
        bt_m.setVisible(true);
        bt_f.setVisible(false);
        esconder.setVisible(false);
        esconder1.setVisible(false);
        sx = "M";
        op = 0;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        blurBackground1 = new Componentes.BlurBackground();
        BT_Registrarse = new Componentes.AllButton();
        barra_superior = new javax.swing.JPanel();
        bt_cerrar = new Componentes.AllButton();
        bt_minimizar = new Componentes.AllButton();
        NombreApellido = new org.example.Custom.PanelRound();
        TX_NombreApellido = new org.example.Custom.AnimatedTextField();
        Telefono = new org.example.Custom.PanelRound();
        TX_Telefono = new org.example.Custom.AnimatedTextField();
        Edad = new org.example.Custom.PanelRound();
        TX_Edad = new org.example.Custom.AnimatedTextField();
        Usuario = new org.example.Custom.PanelRound();
        TX_Usuario = new org.example.Custom.AnimatedTextField();
        NoDocumento = new org.example.Custom.PanelRound();
        TX_NoDocumento = new org.example.Custom.AnimatedTextField();
        Contraseña = new org.example.Custom.PanelRound();
        ver = new javax.swing.JLabel();
        esconder = new javax.swing.JLabel();
        TX_Contraseña = new org.example.Custom.AnimatedPasswordField();
        ConfirmarContr = new org.example.Custom.PanelRound();
        ver1 = new javax.swing.JLabel();
        esconder1 = new javax.swing.JLabel();
        TX_ConfirmarContra = new org.example.Custom.AnimatedPasswordField();
        label_f = new javax.swing.JLabel();
        label_m = new javax.swing.JLabel();
        bt_f = new javax.swing.JLabel();
        bt_m = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 548));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blurBackground1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Crear Jefe.png"))); // NOI18N
        blurBackground1.setRadius(40);
        blurBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        blurBackground1.add(BT_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 240, 38));

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

        NombreApellido.setRadius(20);
        NombreApellido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_NombreApellido.setForeground(new java.awt.Color(153, 153, 153));
        TX_NombreApellido.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_NombreApellido.setHint("Ej: Rodolfo Rivera");
        TX_NombreApellido.setHintColor(new java.awt.Color(153, 153, 153));
        TX_NombreApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_NombreApellidoKeyTyped(evt);
            }
        });
        NombreApellido.add(TX_NombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(NombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 370, 40));

        Telefono.setRadius(20);
        Telefono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_Telefono.setForeground(new java.awt.Color(153, 153, 153));
        TX_Telefono.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_Telefono.setHint("Ej: 3166705696");
        TX_Telefono.setHintColor(new java.awt.Color(153, 153, 153));
        TX_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_TelefonoKeyTyped(evt);
            }
        });
        Telefono.add(TX_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 370, 40));

        Edad.setRadius(20);
        Edad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_Edad.setForeground(new java.awt.Color(153, 153, 153));
        TX_Edad.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_Edad.setHint("Ej: 16");
        TX_Edad.setHintColor(new java.awt.Color(153, 153, 153));
        TX_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_EdadKeyTyped(evt);
            }
        });
        Edad.add(TX_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 190, 40));

        blurBackground1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 220, 40));

        Usuario.setRadius(20);
        Usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_Usuario.setForeground(new java.awt.Color(153, 153, 153));
        TX_Usuario.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_Usuario.setHint("Ej: Rodor");
        TX_Usuario.setHintColor(new java.awt.Color(153, 153, 153));
        TX_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_UsuarioKeyTyped(evt);
            }
        });
        Usuario.add(TX_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 370, 40));

        NoDocumento.setRadius(20);
        NoDocumento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_NoDocumento.setForeground(new java.awt.Color(153, 153, 153));
        TX_NoDocumento.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_NoDocumento.setHint("Ej: 32692328");
        TX_NoDocumento.setHintColor(new java.awt.Color(153, 153, 153));
        TX_NoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_NoDocumentoKeyTyped(evt);
            }
        });
        NoDocumento.add(TX_NoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(NoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 370, 40));

        Contraseña.setRadius(20);
        Contraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        Contraseña.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 40, 40));

        esconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/esconder.png"))); // NOI18N
        esconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esconderMouseClicked(evt);
            }
        });
        Contraseña.add(esconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 40, 40));

        TX_Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        TX_Contraseña.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        TX_Contraseña.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_Contraseña.setHint("Escriba una contraseña");
        TX_Contraseña.setHintColor(new java.awt.Color(153, 153, 153));
        TX_Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_ContraseñaKeyTyped(evt);
            }
        });
        Contraseña.add(TX_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 40));

        blurBackground1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 370, 40));

        ConfirmarContr.setRadius(20);
        ConfirmarContr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ver.png"))); // NOI18N
        ver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver1MouseClicked(evt);
            }
        });
        ConfirmarContr.add(ver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 40, 40));

        esconder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/esconder.png"))); // NOI18N
        esconder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esconder1MouseClicked(evt);
            }
        });
        ConfirmarContr.add(esconder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 40, 40));

        TX_ConfirmarContra.setForeground(new java.awt.Color(153, 153, 153));
        TX_ConfirmarContra.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_ConfirmarContra.setHint("Repita la contraseña");
        TX_ConfirmarContra.setHintColor(new java.awt.Color(153, 153, 153));
        TX_ConfirmarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TX_ConfirmarContraActionPerformed(evt);
            }
        });
        TX_ConfirmarContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_ConfirmarContraKeyTyped(evt);
            }
        });
        ConfirmarContr.add(TX_ConfirmarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 40));

        blurBackground1.add(ConfirmarContr, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 370, 40));

        label_f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_fMouseClicked(evt);
            }
        });
        blurBackground1.add(label_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 30, 40));

        label_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_mMouseClicked(evt);
            }
        });
        blurBackground1.add(label_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 40, 40));

        bt_f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/F.png"))); // NOI18N
        blurBackground1.add(bt_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 80, 50));

        bt_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M.png"))); // NOI18N
        blurBackground1.add(bt_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 80, 50));

        getContentPane().add(blurBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_RegistrarseMouseClicked
        
            // <editor-fold defaultstate="collapsed" desc="Valida si faltan campos por llenar">
        if (TX_NombreApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL NOMBRE Y APELLIDO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TX_NombreApellido.requestFocus();
        } else if (!"F".equals(sx) && !"M".equals(sx)) {
            JOptionPane.showMessageDialog(this, "FALTA SELECCIONAR EL GENERO", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (TX_NoDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL NUMERO DE DOCUMENTO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TX_NoDocumento.requestFocus();
        } else if (op != 1 && op != 2 && op != 3 && op != 4) {
            JOptionPane.showMessageDialog(this, "FALTA El tipo de Documento", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TX_NoDocumento.requestFocus();
        } else if (TX_NoDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA EDAD", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TX_NoDocumento.requestFocus();
        } else if (TX_Telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL TELEFONO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TX_Telefono.requestFocus();
        } else if (TX_Usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL USUARIO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TX_Usuario.requestFocus();
        } else if (TX_Contraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA CONTRASEÑA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TX_Contraseña.requestFocus();
        } else if (TX_ConfirmarContra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "FALTA CONFIRMAR LA CONTRASEÑA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TX_ConfirmarContra.requestFocus();
        } else if (!TX_ConfirmarContra.getText().equals(TX_Contraseña.getText())) {
            JOptionPane.showMessageDialog(this, "LAS CONTRASEÑAS NO CONCIDEN", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TX_ConfirmarContra.requestFocus();
        } else {
            // </editor-fold>
            //Valida los tamaños minimo de cada TX
            if (TamañoMinimo(TX_NombreApellido, "Nombre y Apellido", 5)
                    && TamañoTelefono(TX_Telefono) == true
                    && TamañoMinimo(TX_Edad, "Edad", 1)
                    && TamañoMinimo(TX_NoDocumento, "No. Documento", 7)
                    && TamañoMinimo(TX_Usuario, "Usuario", 4)
                    && TamañoMinimo(TX_Contraseña, "Contraseña", 4)) {
                if (UsuarioExiste() == true) {
                    JOptionPane.showMessageDialog(this, "EL USUARIO YA EXISTE", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    TX_Usuario.requestFocus();
                } else if (NoDocumentoExiste() == true) {
                    JOptionPane.showMessageDialog(this, "YA HAY UN USUARIO REGISTRADO CON ESE NUMERO DE DOCUMENTO", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    TX_NoDocumento.requestFocus();
                } else if (TelefonoExiste() == true) {
                    JOptionPane.showMessageDialog(this, "YA HAY UN USUARIO REGISTRADO CON ESE NUMERO DE TELEFONO", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    TX_Telefono.requestFocus();
                } else {
                    GuardarBD();
                    LimpiarCampos();
                }
            }

        }
    }//GEN-LAST:event_BT_RegistrarseMouseClicked

    private void BT_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_RegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_RegistrarseActionPerformed

    int mouseX, mouseY;

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

    private void TX_ConfirmarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TX_ConfirmarContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TX_ConfirmarContraActionPerformed

    private void label_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_mMouseClicked
        bt_m.setVisible(true);
        bt_f.setVisible(false);
        sx = "M";
    }//GEN-LAST:event_label_mMouseClicked

    private void label_fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fMouseClicked
        bt_f.setVisible(true);
        bt_m.setVisible(false);
        sx = "F";
    }//GEN-LAST:event_label_fMouseClicked

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

    private void ver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver1MouseClicked
        esconder1.setVisible(true);
        ver1.setVisible(false);
        TX_ConfirmarContra.setEchoChar((char) 0);
    }//GEN-LAST:event_ver1MouseClicked

    private void esconder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esconder1MouseClicked
        esconder1.setVisible(false);
        ver1.setVisible(true);
        TX_ConfirmarContra.setEchoChar('*');
    }//GEN-LAST:event_esconder1MouseClicked

    // <editor-fold defaultstate="collapsed" desc="Validaciones de los input de los TX">
    
    private void TX_NombreApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TX_NombreApellidoKeyTyped
        //Para que el TX acepte letras y espacios
        int key = evt.getKeyChar();
        boolean Mayusculas = key >= 65 && key <= 90;
        boolean Minusculas = key >= 97 && key <= 122;
        boolean Espacio = key == 32;
        if (!(Minusculas || Mayusculas || Espacio)) {
            evt.consume();
        }

        //Establecer limite de caracteres
        if (TX_NombreApellido.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_TX_NombreApellidoKeyTyped

    private void TX_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TX_TelefonoKeyTyped
        //Para que el TX acepte solo numeros
        int key = evt.getKeyChar();
        boolean Numeros = key >= 48 && key <= 57;
        if (!(Numeros)) {
            evt.consume();
        }
        //Establecer limite de caracteres
        if (TX_Telefono.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TX_TelefonoKeyTyped

    private void TX_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TX_EdadKeyTyped
        //Para que el TX acepte solo numeros
        int key = evt.getKeyChar();
        boolean Numeros = key >= 48 && key <= 57;
        if (!(Numeros)) {
            evt.consume();
        }
        //Establecer limite de caracteres
        if (TX_Edad.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_TX_EdadKeyTyped

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

    private void TX_NoDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TX_NoDocumentoKeyTyped
        //Para que el TX acepte solo numeros 
        int key = evt.getKeyChar();
        boolean Numeros = key >= 48 && key <= 57;
        if (!(Numeros)) {
            evt.consume();
        }
        //Establecer limite de caracteres
        if (TX_NoDocumento.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TX_NoDocumentoKeyTyped

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

    private void TX_ConfirmarContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TX_ConfirmarContraKeyTyped
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
    }//GEN-LAST:event_TX_ConfirmarContraKeyTyped

// </editor-fold>    
    
    public void LimpiarCampos() {

        TX_NombreApellido.setText("");
        TX_NoDocumento.setText("");
        TX_Edad.setText("");
        TX_Telefono.setText("");
        TX_Usuario.setText("");
        TX_Contraseña.setText("");
        TX_ConfirmarContra.setText("");

    }

    //Esta funcion obtiene los datos del objeto anteriormente creado y llenado para ingresarlos a la BD
    public void GuardarBD() {

        try {
            //Variable tipo Connection para que funcione
            Connection Conexion = null;
            //Crear un objeto de la clase Conexion para poder conectar con la BD
            ConexionBD BD = new ConexionBD();
            //Se conceta con la BD
            Conexion = BD.getConexion();
            //No se pa q sirve, pero ahi esta x si acaso
            Statement st = Conexion.createStatement();

            //Variable para almacenar la instruccion SQL
            //Para guardar en la tabla Pacientes
            String SQL = "insert into Pacientes(Nombre_Apellido, Telefono, Genero,"
                    + "Edad, Tipo_Documento, Numero_Documento, Usuario, Contraseña) values (?,?,?,?,?,?,?,?)";

            //Se utiliza para poder ejecutar una instruccion SQL y para ejecutar esta instrucción múltiples veces
            PreparedStatement pst = Conexion.prepareStatement(SQL);

            String Genero = null;
            if ("F".equals(sx)) {
                Genero = "Femenino";
            }
            if ("M".equals(sx)) {
                Genero = "Masculino";
            }
            String TipoDocumento = "";
            switch (op) {
                case (1):
                    TipoDocumento = "Cedula de Ciudadania";
                    break;
                case (2):
                    TipoDocumento = "Cedula de Extranjeria";
                    break;
                case (3):
                    TipoDocumento = "Tarjeta de Identidad";
                    break;
                case (4):
                    TipoDocumento = "Registro Civil";
                    break;
            }

            //Utilizacion de POO
            //Creo un objeto temporal de la clase Paciente "P" para guardar los datos que se ingresan
            //Asigno los valores a los atributos de Paciente
            Clases.Paciente P = new Clases.Paciente(TX_NombreApellido.getText().toUpperCase(), Genero,
                    Double.parseDouble(TX_NoDocumento.getText()), Double.parseDouble(TX_Edad.getText()),
                    TipoDocumento, Double.parseDouble(TX_Telefono.getText()),
                    TX_Usuario.getText().toUpperCase(), TX_Contraseña.getText());

            //Guarda cada valor en su respectiva columna, la columna se define por el primer paramatro
            //Guardo cada atributo del objeto P en su columna correspondiete, con los Getters
            pst.setString(1, P.getNombre_Apellido());
            pst.setDouble(2, P.getNo_Telefono());
            pst.setString(3, P.getGenero());
            pst.setDouble(4, P.getEdad());
            pst.setString(5, P.getTipo_Documento());
            pst.setDouble(6, P.getNo_Documento());
            pst.setString(7, P.getUsuario());
            pst.setString(8, P.getContraseña());

            int n = pst.executeUpdate(); //Para guardar los datos

            SQL = "insert into Usuarios(Usuario, Contraseña, Tipo) values(?,?,?)";

            //Se utiliza para poder ejecutar una instruccion SQL y para ejecutar esta instrucción múltiples veces
            pst = Conexion.prepareStatement(SQL);

            pst.setString(1, P.getUsuario());
            pst.setString(2, P.getContraseña());
            pst.setString(3, "Paciente");
            int n1 = pst.executeUpdate(); //Para guardar los datos

            //Si es mayor que 0 quiere decir que se se inserto bien en la BD
            if (n > 0 && n1 > 0) {
                //Mensaje de confirmacion
                JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");

            }

        } catch (SQLException | HeadlessException ex) {
            //Error x si acaso
            JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

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
            return rs.next();
        } catch (SQLException | HeadlessException ex) {
            return false;
        }

    }

    public Boolean NoDocumentoExiste() {

        try {
            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();

            //Para buscar si el No Documento existe 
            String SQL = "SELECT * FROM Pacientes WHERE Numero_Documento = ?";

            PreparedStatement pst = Conexion.prepareStatement(SQL);

            pst.setString(1, TX_NoDocumento.getText());

            //Extrae el conjunto de resultados 
            ResultSet rs = pst.executeQuery();

            //Si hay mas de un resultado: true
            return rs.next();
        } catch (SQLException | HeadlessException ex) {
            return false;
        }

    }

    public Boolean TelefonoExiste() {

        try {
            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();

            //Para buscar si el No Documento existe 
            String SQL = "SELECT * FROM Pacientes WHERE Telefono = ?";

            PreparedStatement pst = Conexion.prepareStatement(SQL);

            pst.setString(1, TX_Telefono.getText());

            //Extrae el conjunto de resultados 
            ResultSet rs = pst.executeQuery();

            //Si hay mas de un resultado: true
            return rs.next();
        } catch (SQLException | HeadlessException ex) {
            return false;
        }

    }

    public Boolean TamañoMinimo(JTextField JTextField, String Campo, int min) {
        //Si no tiene el tamaño minimo de caracteres, muestra error
        if (JTextField.getText().length() < min) {
            JOptionPane.showMessageDialog(null,
                    "Tamaño no aceptado, minimo " + min + " caracteres en el campo: " + Campo
                    + "\n\t                    Intente de nuevo",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    public Boolean TamañoTelefono(JTextField JTextField) {
        //Si no tiene el tamaño minimo de caracteres, muestra error
        if (JTextField.getText().length() != 7 && JTextField.getText().length() != 10) {
            JOptionPane.showMessageDialog(null,
                    "Numero de Telefono no valido, tiene que ser de 7 o 10 numeros, intente de nuevo",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
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
            java.util.logging.Logger.getLogger(CrearJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearJefe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.AllButton BT_Registrarse;
    private org.example.Custom.PanelRound ConfirmarContr;
    private org.example.Custom.PanelRound Contraseña;
    private org.example.Custom.PanelRound Edad;
    private org.example.Custom.PanelRound NoDocumento;
    private org.example.Custom.PanelRound NombreApellido;
    private org.example.Custom.AnimatedPasswordField TX_ConfirmarContra;
    private org.example.Custom.AnimatedPasswordField TX_Contraseña;
    private org.example.Custom.AnimatedTextField TX_Edad;
    private org.example.Custom.AnimatedTextField TX_NoDocumento;
    private org.example.Custom.AnimatedTextField TX_NombreApellido;
    private org.example.Custom.AnimatedTextField TX_Telefono;
    private org.example.Custom.AnimatedTextField TX_Usuario;
    private org.example.Custom.PanelRound Telefono;
    private org.example.Custom.PanelRound Usuario;
    private javax.swing.JPanel barra_superior;
    private Componentes.BlurBackground blurBackground1;
    private javax.swing.ButtonGroup botones;
    private Componentes.AllButton bt_cerrar;
    private javax.swing.JLabel bt_f;
    private javax.swing.JLabel bt_m;
    private Componentes.AllButton bt_minimizar;
    private javax.swing.JLabel esconder;
    private javax.swing.JLabel esconder1;
    private javax.swing.JLabel label_f;
    private javax.swing.JLabel label_m;
    private javax.swing.JLabel ver;
    private javax.swing.JLabel ver1;
    // End of variables declaration//GEN-END:variables
}
