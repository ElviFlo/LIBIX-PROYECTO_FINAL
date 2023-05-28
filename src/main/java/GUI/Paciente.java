/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConexionBD.ConexionBD;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvira Florez
 */
public class Paciente extends javax.swing.JFrame {

    static CardLayout cardLayout;
    String Fecha;
    String Servicio;
    String Horario;
    String Observaciones;
    private String Usuario;
    int total_citas, num_completadas = 0, num_pendientes = 0;

    //Para hacer el Modelo de la tabla del horario
    DefaultTableModel ModeloTabla = new DefaultTableModel();

    String sx;

    public Paciente() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        bt_minimizar.setColor1Background(new Color(0, 0, 0, 0));
        bt_cerrar.setColor1Background(new Color(0, 0, 0, 0));
        cardLayout = (CardLayout) (CardLayout.getLayout());
        cardLayout.show(CardLayout, "Inicio");

        CB_Servicio.addItem("-");
        CB_Doctor.addItem("-");
        CB_Hora.addItem("-");
        JCB_servicio.addItem("-");

        MostraServicios(CB_Servicio);

        CB_Doctor.setEnabled(false);
        Calendario.setEnabled(false);
        CB_Hora.setEnabled(false);
        BT_EnviarSolicitud.setEnabled(false);
        TX_Observaciones.setEnabled(false);

        JCB_confirmacion.addItem("-");
        JCB_confirmacion.addItem("Si");
        JCB_confirmacion.addItem("No");
        JCB_estadocita.addItem("-");
        JCB_estadocita.addItem("En Espera");
        JCB_estadocita.addItem("Por Asistir");
        JCB_estadocita.addItem("Cancelada");
        JCB_estadocita.addItem("Completada");
        JCB_orden.addItem("-");
        JCB_orden.addItem("Ascendente");
        JCB_orden.addItem("Descendente");

        ModeloTabla();
        Llenar("-", "-", "-", "-");

        BT_Home.setColor1Background(new Color(82, 132, 192));
        label_total.setText(String.valueOf(total_citas));
        label_completadas.setText(String.valueOf(num_completadas));
        label_pendientes.setText(String.valueOf(num_pendientes));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        Background = new Componentes.BlurBackground();
        JP_BarraLateral = new org.example.Custom.PanelRound();
        JP_CerraSesionBarraL = new javax.swing.JPanel();
        BT_CerrarSesion = new Componentes.AllButton();
        BT_Menu = new Componentes.AllButton();
        BT_Home = new Componentes.AllButton();
        BT_Solicitud = new Componentes.AllButton();
        BT_Datos = new Componentes.AllButton();
        CardLayout = new javax.swing.JPanel();
        Datos = new javax.swing.JPanel();
        blurBackground1 = new Componentes.BlurBackground();
        BT_Actualizar = new Componentes.AllButton();
        barra_superior2 = new javax.swing.JPanel();
        bt_cerrar2 = new Componentes.AllButton();
        bt_minimizar2 = new Componentes.AllButton();
        NombreApellido = new org.example.Custom.PanelRound();
        Update_name = new org.example.Custom.AnimatedTextField();
        Telefono = new org.example.Custom.PanelRound();
        Update_phone = new org.example.Custom.AnimatedTextField();
        Edad = new org.example.Custom.PanelRound();
        update_age = new org.example.Custom.AnimatedTextField();
        TXTUsuario = new org.example.Custom.PanelRound();
        update_user = new org.example.Custom.AnimatedTextField();
        TDocumento = new org.example.Custom.PanelRound();
        update_tdoc = new org.example.Custom.AnimatedTextField();
        NoDocumento = new org.example.Custom.PanelRound();
        update_id = new org.example.Custom.AnimatedTextField();
        Contraseña = new org.example.Custom.PanelRound();
        ver = new javax.swing.JLabel();
        esconder = new javax.swing.JLabel();
        Update_password = new org.example.Custom.AnimatedPasswordField();
        ConfirmarContr = new org.example.Custom.PanelRound();
        ver1 = new javax.swing.JLabel();
        esconder1 = new javax.swing.JLabel();
        update_confirm = new org.example.Custom.AnimatedPasswordField();
        bt_f = new javax.swing.JLabel();
        bt_m = new javax.swing.JLabel();
        Solicitud = new javax.swing.JPanel();
        blurBackground2 = new Componentes.BlurBackground();
        barra_superior = new javax.swing.JPanel();
        bt_cerrar = new Componentes.AllButton();
        bt_minimizar = new Componentes.AllButton();
        CB_Doctor = new Componentes.ComboBoxSuggestion();
        lb_doc = new javax.swing.JLabel();
        lb_fecha1 = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        lb_fecha2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TX_Observaciones = new javax.swing.JTextPane();
        lb_fecha3 = new javax.swing.JLabel();
        CB_Servicio = new Componentes.ComboBoxSuggestion();
        CB_Hora = new Componentes.ComboBoxSuggestion();
        BT_EnviarSolicitud = new Componentes.AllButton();
        Calendario = new com.toedter.calendar.JDateChooser();
        home = new javax.swing.JPanel();
        blurBackground10 = new Componentes.BlurBackground();
        barra_superior8 = new javax.swing.JPanel();
        bt_cerrar8 = new Componentes.AllButton();
        bt_minimizar6 = new Componentes.AllButton();
        panelRound1 = new org.example.Custom.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        Citas_paciente = new Componentes.Table();
        jLabel1 = new javax.swing.JLabel();
        panelRound2 = new org.example.Custom.PanelRound();
        icon_do = new Componentes.BlurBackground();
        lb_doctor = new javax.swing.JLabel();
        nu_do = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        panelRound3 = new org.example.Custom.PanelRound();
        blurBackground11 = new Componentes.BlurBackground();
        icon_ad = new javax.swing.JLabel();
        nu_ad = new javax.swing.JLabel();
        label_completadas = new javax.swing.JLabel();
        panelRound4 = new org.example.Custom.PanelRound();
        blurBackground12 = new Componentes.BlurBackground();
        icon_em = new javax.swing.JLabel();
        label_pendientes = new javax.swing.JLabel();
        nu_em = new javax.swing.JLabel();
        JCB_confirmacion = new Componentes.ComboBoxSuggestion();
        JCB_estadocita = new Componentes.ComboBoxSuggestion();
        JCB_servicio = new Componentes.ComboBoxSuggestion();
        JCB_orden = new Componentes.ComboBoxSuggestion();
        BT_Filtrar = new Componentes.AllButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1010, 548));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setRadius(40);
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_BarraLateral.setBackground(new java.awt.Color(122, 173, 252));
        JP_BarraLateral.setEnableCustomRectangle(true);
        JP_BarraLateral.setRoundBottomLeft(40);
        JP_BarraLateral.setRoundBottomRight(1);
        JP_BarraLateral.setRoundTopLeft(40);
        JP_BarraLateral.setRoundTopRight(1);
        JP_BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_CerraSesionBarraL.setBackground(new java.awt.Color(122, 173, 252));
        JP_CerraSesionBarraL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_CerrarSesion.setBackground(new java.awt.Color(122, 173, 252));
        BT_CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrar-sesion.png"))); // NOI18N
        BT_CerrarSesion.setColor1Background(new java.awt.Color(122, 173, 252));
        BT_CerrarSesion.setColor2Over(new java.awt.Color(82, 132, 192));
        BT_CerrarSesion.setColor3Click(new java.awt.Color(74, 93, 242));
        BT_CerrarSesion.setEnableColorGradient(true);
        BT_CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_CerrarSesionMouseClicked(evt);
            }
        });
        JP_CerraSesionBarraL.add(BT_CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        JP_BarraLateral.add(JP_CerraSesionBarraL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 70, 60));

        BT_Menu.setBackground(new java.awt.Color(122, 173, 252));
        BT_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        BT_Menu.setColor1Background(new java.awt.Color(122, 173, 252));
        BT_Menu.setColor2Over(new java.awt.Color(82, 132, 192));
        BT_Menu.setColor3Click(new java.awt.Color(74, 93, 242));
        BT_Menu.setEnableColorGradient(true);
        BT_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_MenuMouseClicked(evt);
            }
        });
        JP_BarraLateral.add(BT_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 40));

        BT_Home.setBackground(new java.awt.Color(122, 173, 252));
        BT_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/house.png"))); // NOI18N
        BT_Home.setColor1Background(new java.awt.Color(122, 173, 252));
        BT_Home.setColor2Over(new java.awt.Color(82, 132, 192));
        BT_Home.setColor3Click(new java.awt.Color(74, 93, 242));
        BT_Home.setEnableColorGradient(true);
        BT_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_HomeMouseClicked(evt);
            }
        });
        JP_BarraLateral.add(BT_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 50, 40));

        BT_Solicitud.setBackground(new java.awt.Color(122, 173, 252));
        BT_Solicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solicitud.png"))); // NOI18N
        BT_Solicitud.setColor1Background(new java.awt.Color(122, 173, 252));
        BT_Solicitud.setColor2Over(new java.awt.Color(82, 132, 192));
        BT_Solicitud.setColor3Click(new java.awt.Color(74, 93, 242));
        BT_Solicitud.setEnableColorGradient(true);
        BT_Solicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_SolicitudMouseClicked(evt);
            }
        });
        JP_BarraLateral.add(BT_Solicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 50, 40));

        BT_Datos.setBackground(new java.awt.Color(122, 173, 252));
        BT_Datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registro.png"))); // NOI18N
        BT_Datos.setColor1Background(new java.awt.Color(122, 173, 252));
        BT_Datos.setColor2Over(new java.awt.Color(82, 132, 192));
        BT_Datos.setColor3Click(new java.awt.Color(74, 93, 242));
        BT_Datos.setEnableColorGradient(true);
        BT_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_DatosMouseClicked(evt);
            }
        });
        JP_BarraLateral.add(BT_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 50, 40));

        Background.add(JP_BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 570));

        CardLayout.setBackground(new java.awt.Color(255, 255, 255));
        CardLayout.setForeground(new java.awt.Color(204, 255, 255));
        CardLayout.setLayout(new java.awt.CardLayout());

        Datos.setBackground(new java.awt.Color(255, 255, 255));

        blurBackground1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Datos Paciente.png"))); // NOI18N
        blurBackground1.setRadius(40);
        blurBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Actualizar.setText("Actualizar Datos");
        BT_Actualizar.setChangeCoefficient(20);
        BT_Actualizar.setColor1Background(new java.awt.Color(82, 132, 192));
        BT_Actualizar.setColor1Foreground(new java.awt.Color(255, 255, 255));
        BT_Actualizar.setColor2Over(new java.awt.Color(40, 76, 118));
        BT_Actualizar.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        BT_Actualizar.setColor3Click(new java.awt.Color(102, 153, 255));
        BT_Actualizar.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        BT_Actualizar.setEnableColorGradient(true);
        BT_Actualizar.setEnableShadow(true);
        BT_Actualizar.setFont(new java.awt.Font("Century", 1, 15)); // NOI18N
        BT_Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_ActualizarMouseClicked(evt);
            }
        });
        BT_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ActualizarActionPerformed(evt);
            }
        });
        blurBackground1.add(BT_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 500, 240, 42));

        barra_superior2.setOpaque(false);
        barra_superior2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superior2MouseDragged(evt);
            }
        });
        barra_superior2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superior2MousePressed(evt);
            }
        });
        barra_superior2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_cerrar2.setText("X");
        bt_cerrar2.setChangeCoefficient(15);
        bt_cerrar2.setColor1Background(new java.awt.Color(172, 206, 252));
        bt_cerrar2.setColor2Over(new java.awt.Color(102, 153, 255));
        bt_cerrar2.setColor3Click(new java.awt.Color(0, 102, 255));
        bt_cerrar2.setEnableColorGradient(true);
        bt_cerrar2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        bt_cerrar2.setRoundBottomLeft(0);
        bt_cerrar2.setRoundBottomRight(0);
        bt_cerrar2.setRoundTopLeft(0);
        bt_cerrar2.setRoundTopRight(15);
        bt_cerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrar2MouseClicked(evt);
            }
        });
        barra_superior2.add(bt_cerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 0, 50, 22));

        bt_minimizar2.setText("-");
        bt_minimizar2.setChangeCoefficient(15);
        bt_minimizar2.setColor1Background(new java.awt.Color(172, 206, 252));
        bt_minimizar2.setColor2Over(new java.awt.Color(102, 153, 255));
        bt_minimizar2.setColor3Click(new java.awt.Color(0, 102, 255));
        bt_minimizar2.setEnableColorGradient(true);
        bt_minimizar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_minimizar2.setRoundBottomLeft(15);
        bt_minimizar2.setRoundBottomRight(0);
        bt_minimizar2.setRoundTopLeft(0);
        bt_minimizar2.setRoundTopRight(0);
        bt_minimizar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_minimizar2MouseClicked(evt);
            }
        });
        barra_superior2.add(bt_minimizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 0, 50, 22));

        blurBackground1.add(barra_superior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        NombreApellido.setRadius(20);
        NombreApellido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Update_name.setForeground(new java.awt.Color(0, 0, 0));
        Update_name.setEnabled(false);
        Update_name.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        Update_name.setHint("Ej: Rodolfo Rivera");
        Update_name.setHintColor(new java.awt.Color(153, 153, 153));
        Update_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Update_nameKeyTyped(evt);
            }
        });
        NombreApellido.add(Update_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(NombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 90, 370, 40));

        Telefono.setRadius(20);
        Telefono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Update_phone.setForeground(new java.awt.Color(0, 0, 0));
        Update_phone.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        Update_phone.setHint("Ej: 3166705696");
        Update_phone.setHintColor(new java.awt.Color(153, 153, 153));
        Update_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Update_phoneKeyTyped(evt);
            }
        });
        Telefono.add(Update_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 195, 370, 40));

        Edad.setRadius(20);
        Edad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_age.setForeground(new java.awt.Color(0, 0, 0));
        update_age.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        update_age.setHint("Ej: 16");
        update_age.setHintColor(new java.awt.Color(153, 153, 153));
        update_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                update_ageKeyTyped(evt);
            }
        });
        Edad.add(update_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 190, 40));

        blurBackground1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 305, 220, 40));

        TXTUsuario.setRadius(20);
        TXTUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_user.setForeground(new java.awt.Color(0, 0, 0));
        update_user.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        update_user.setHint("Ej: Rodor");
        update_user.setHintColor(new java.awt.Color(153, 153, 153));
        update_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                update_userKeyTyped(evt);
            }
        });
        TXTUsuario.add(update_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(TXTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 410, 370, 40));

        TDocumento.setRadius(20);
        TDocumento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_tdoc.setEditable(false);
        update_tdoc.setForeground(new java.awt.Color(0, 0, 0));
        update_tdoc.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        update_tdoc.setHint("Seleccione una opción");
        update_tdoc.setHintColor(new java.awt.Color(153, 153, 153));
        TDocumento.add(update_tdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 320, 40));

        blurBackground1.add(TDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 370, 40));

        NoDocumento.setRadius(20);
        NoDocumento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_id.setForeground(new java.awt.Color(0, 0, 0));
        update_id.setEnabled(false);
        update_id.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        update_id.setHint("Ej: 32692328");
        update_id.setHintColor(new java.awt.Color(153, 153, 153));
        update_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                update_idKeyTyped(evt);
            }
        });
        NoDocumento.add(update_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(NoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 195, 370, 40));

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

        Update_password.setForeground(new java.awt.Color(0, 0, 0));
        Update_password.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Update_password.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        Update_password.setHint("Escriba una contraseña");
        Update_password.setHintColor(new java.awt.Color(153, 153, 153));
        Update_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Update_passwordKeyTyped(evt);
            }
        });
        Contraseña.add(Update_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 40));

        blurBackground1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 305, 370, 40));

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

        update_confirm.setForeground(new java.awt.Color(0, 0, 0));
        update_confirm.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        update_confirm.setHint("Repita la contraseña");
        update_confirm.setHintColor(new java.awt.Color(153, 153, 153));
        update_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_confirmActionPerformed(evt);
            }
        });
        update_confirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                update_confirmKeyTyped(evt);
            }
        });
        ConfirmarContr.add(update_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 40));

        blurBackground1.add(ConfirmarContr, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 370, 40));

        bt_f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/F.png"))); // NOI18N
        blurBackground1.add(bt_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 80, 50));

        bt_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M.png"))); // NOI18N
        blurBackground1.add(bt_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 80, 50));

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blurBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blurBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        CardLayout.add(Datos, "Datos");

        Solicitud.setBackground(new java.awt.Color(255, 255, 255));

        blurBackground2.setEnableCustomRectangle(true);
        blurBackground2.setImage(new javax.swing.ImageIcon(getClass().getResource("/Crear Doctor Horario.png"))); // NOI18N
        blurBackground2.setRadius(1);
        blurBackground2.setRoundBottomLeft(1);
        blurBackground2.setRoundBottomRight(40);
        blurBackground2.setRoundTopLeft(1);
        blurBackground2.setRoundTopRight(40);
        blurBackground2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        blurBackground2.add(barra_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        CB_Doctor.setBackground(new java.awt.Color(227, 226, 226));
        CB_Doctor.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        CB_Doctor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_DoctorItemStateChanged(evt);
            }
        });
        blurBackground2.add(CB_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 235, 40));

        lb_doc.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_doc.setText("Doctor/a disponible:");
        blurBackground2.add(lb_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        lb_fecha1.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_fecha1.setText("Servicio a solicitar:");
        blurBackground2.add(lb_fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        lb_fecha.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_fecha.setText("Fecha de preferencia: ");
        blurBackground2.add(lb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        lb_fecha2.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_fecha2.setText("Observaciones Adicionales");
        blurBackground2.add(lb_fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        TX_Observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_ObservacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(TX_Observaciones);

        blurBackground2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 410, 150));

        lb_fecha3.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_fecha3.setText("Horario de preferencia: ");
        blurBackground2.add(lb_fecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        CB_Servicio.setBackground(new java.awt.Color(227, 226, 226));
        CB_Servicio.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        CB_Servicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_ServicioItemStateChanged(evt);
            }
        });
        blurBackground2.add(CB_Servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 235, 40));

        CB_Hora.setBackground(new java.awt.Color(227, 226, 226));
        CB_Hora.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        CB_Hora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_HoraItemStateChanged(evt);
            }
        });
        blurBackground2.add(CB_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 235, 40));

        BT_EnviarSolicitud.setText("Enviar Solicitud");
        BT_EnviarSolicitud.setChangeCoefficient(20);
        BT_EnviarSolicitud.setColor1Background(new java.awt.Color(82, 132, 192));
        BT_EnviarSolicitud.setColor1Foreground(new java.awt.Color(255, 255, 255));
        BT_EnviarSolicitud.setColor2Over(new java.awt.Color(40, 76, 118));
        BT_EnviarSolicitud.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        BT_EnviarSolicitud.setColor3Click(new java.awt.Color(102, 153, 255));
        BT_EnviarSolicitud.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        BT_EnviarSolicitud.setEnableColorGradient(true);
        BT_EnviarSolicitud.setEnableShadow(true);
        BT_EnviarSolicitud.setFont(new java.awt.Font("Century", 1, 15)); // NOI18N
        BT_EnviarSolicitud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BT_EnviarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_EnviarSolicitudMouseClicked(evt);
            }
        });
        BT_EnviarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EnviarSolicitudActionPerformed(evt);
            }
        });
        blurBackground2.add(BT_EnviarSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 210, 40));

        Calendario.setBackground(new java.awt.Color(227, 226, 226));
        Calendario.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        Calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CalendarioPropertyChange(evt);
            }
        });
        blurBackground2.add(Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 235, 40));

        javax.swing.GroupLayout SolicitudLayout = new javax.swing.GroupLayout(Solicitud);
        Solicitud.setLayout(SolicitudLayout);
        SolicitudLayout.setHorizontalGroup(
            SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolicitudLayout.createSequentialGroup()
                .addComponent(blurBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SolicitudLayout.setVerticalGroup(
            SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blurBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        CardLayout.add(Solicitud, "Solicitud");
        Solicitud.getAccessibleContext().setAccessibleName("");

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blurBackground10.setEnableCustomRectangle(true);
        blurBackground10.setImage(new javax.swing.ImageIcon(getClass().getResource("/Todos empleados.png"))); // NOI18N
        blurBackground10.setRadius(1);
        blurBackground10.setRoundBottomLeft(1);
        blurBackground10.setRoundBottomRight(40);
        blurBackground10.setRoundTopLeft(1);
        blurBackground10.setRoundTopRight(40);
        blurBackground10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra_superior8.setOpaque(false);
        barra_superior8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superior8MouseDragged(evt);
            }
        });
        barra_superior8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superior8MousePressed(evt);
            }
        });
        barra_superior8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_cerrar8.setText("X");
        bt_cerrar8.setChangeCoefficient(15);
        bt_cerrar8.setColor1Background(new java.awt.Color(172, 206, 252));
        bt_cerrar8.setColor2Over(new java.awt.Color(102, 153, 255));
        bt_cerrar8.setColor3Click(new java.awt.Color(0, 102, 255));
        bt_cerrar8.setEnableColorGradient(true);
        bt_cerrar8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        bt_cerrar8.setRoundBottomLeft(0);
        bt_cerrar8.setRoundBottomRight(0);
        bt_cerrar8.setRoundTopLeft(0);
        bt_cerrar8.setRoundTopRight(15);
        bt_cerrar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrar8MouseClicked(evt);
            }
        });
        bt_cerrar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrar8ActionPerformed(evt);
            }
        });
        barra_superior8.add(bt_cerrar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 50, 22));

        bt_minimizar6.setText("-");
        bt_minimizar6.setChangeCoefficient(15);
        bt_minimizar6.setColor1Background(new java.awt.Color(172, 206, 252));
        bt_minimizar6.setColor2Over(new java.awt.Color(102, 153, 255));
        bt_minimizar6.setColor3Click(new java.awt.Color(0, 102, 255));
        bt_minimizar6.setEnableColorGradient(true);
        bt_minimizar6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_minimizar6.setRoundBottomLeft(15);
        bt_minimizar6.setRoundBottomRight(0);
        bt_minimizar6.setRoundTopLeft(0);
        bt_minimizar6.setRoundTopRight(0);
        bt_minimizar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_minimizar6MouseClicked(evt);
            }
        });
        barra_superior8.add(bt_minimizar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 50, 22));

        blurBackground10.add(barra_superior8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 30));

        panelRound1.setBackground(new java.awt.Color(248, 247, 247));
        panelRound1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panelRound1.setRadius(10);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Citas_paciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Servicio", "Doctor", "Fecha", "Hora", "Confirmación", "Estado de la Cita", "Consultorio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Citas_paciente.setGridColor(new java.awt.Color(242, 242, 242));
        Citas_paciente.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(Citas_paciente);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, 829, 210));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Lista de Citas:");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        blurBackground10.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 870, 275));

        panelRound2.setBackground(new java.awt.Color(163, 193, 225));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_do.setImage(new javax.swing.ImageIcon(getClass().getResource("/todos.png"))); // NOI18N
        panelRound2.add(icon_do, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 45, 45));

        lb_doctor.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lb_doctor.setText("Total de Citas");
        panelRound2.add(lb_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        nu_do.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        nu_do.setForeground(new java.awt.Color(127, 127, 127));
        nu_do.setText("Número: ");
        panelRound2.add(nu_do, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        label_total.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label_total.setForeground(new java.awt.Color(127, 127, 127));
        panelRound2.add(label_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 20));

        blurBackground10.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 290, 130));

        panelRound3.setBackground(new java.awt.Color(176, 207, 240));
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blurBackground11.setImage(new javax.swing.ImageIcon(getClass().getResource("/cargando.png"))); // NOI18N
        panelRound3.add(blurBackground11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 42, 42));

        icon_ad.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        icon_ad.setText("Citas Completadas");
        panelRound3.add(icon_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 30, -1, -1));

        nu_ad.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        nu_ad.setForeground(new java.awt.Color(127, 127, 127));
        nu_ad.setText("Número: ");
        panelRound3.add(nu_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        label_completadas.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label_completadas.setForeground(new java.awt.Color(127, 127, 127));
        panelRound3.add(label_completadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 20));

        blurBackground10.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 270, 130));

        panelRound4.setBackground(new java.awt.Color(163, 193, 225));
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blurBackground12.setImage(new javax.swing.ImageIcon(getClass().getResource("/reloj.png"))); // NOI18N
        panelRound4.add(blurBackground12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 45, 45));

        icon_em.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        icon_em.setText("Citas Pendientes");
        panelRound4.add(icon_em, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        label_pendientes.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label_pendientes.setForeground(new java.awt.Color(127, 127, 127));
        panelRound4.add(label_pendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 110, 20));

        nu_em.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        nu_em.setForeground(new java.awt.Color(127, 127, 127));
        nu_em.setText("Número: ");
        panelRound4.add(nu_em, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        blurBackground10.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 270, 130));

        JCB_confirmacion.setBackground(new java.awt.Color(248, 247, 247));
        JCB_confirmacion.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        blurBackground10.add(JCB_confirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        JCB_estadocita.setBackground(new java.awt.Color(248, 247, 247));
        JCB_estadocita.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        blurBackground10.add(JCB_estadocita, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        JCB_servicio.setBackground(new java.awt.Color(248, 247, 247));
        JCB_servicio.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        JCB_servicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCB_servicioItemStateChanged(evt);
            }
        });
        blurBackground10.add(JCB_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        JCB_orden.setBackground(new java.awt.Color(248, 247, 247));
        JCB_orden.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        JCB_orden.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCB_ordenItemStateChanged(evt);
            }
        });
        blurBackground10.add(JCB_orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        BT_Filtrar.setBorder(null);
        BT_Filtrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filtrar.png"))); // NOI18N
        BT_Filtrar.setColor1Background(new java.awt.Color(255, 255, 254));
        BT_Filtrar.setColor2Over(new java.awt.Color(176, 207, 240));
        BT_Filtrar.setColor3Click(new java.awt.Color(163, 176, 212));
        BT_Filtrar.setEnableColorGradient(true);
        BT_Filtrar.setEnableShadow(true);
        BT_Filtrar.setRadius(32);
        BT_Filtrar.setRippleColor(new java.awt.Color(255, 255, 255));
        BT_Filtrar.setRoundBottomLeft(10);
        BT_Filtrar.setRoundBottomRight(10);
        BT_Filtrar.setRoundTopLeft(10);
        BT_Filtrar.setRoundTopRight(10);
        BT_Filtrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_FiltrarMouseClicked(evt);
            }
        });
        BT_Filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_FiltrarActionPerformed(evt);
            }
        });
        blurBackground10.add(BT_Filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 198, 48, 46));

        home.add(blurBackground10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 580));

        CardLayout.add(home, "Inicio");

        Background.add(CardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1010, 600));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Frame de Paciente">
    int mouseX, mouseY;

    private void BT_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_HomeMouseClicked
        cardLayout.show(CardLayout, "Inicio");
        BT_Home.setColor1Background(new Color(82, 132, 192));
        BT_Solicitud.setColor1Background(new Color(122, 173, 252));
        BT_Datos.setColor1Background(new Color(122, 173, 252));
        num_completadas = 0;
        num_pendientes = 0;
        Llenar("-", "-", "-", "-");
        label_total.setText(String.valueOf(total_citas));
        label_completadas.setText(String.valueOf(num_completadas));
        label_pendientes.setText(String.valueOf(num_pendientes));
    }//GEN-LAST:event_BT_HomeMouseClicked

    private void BT_SolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SolicitudMouseClicked
        cardLayout.show(CardLayout, "Solicitud");
        MostraServicios();
        BT_Home.setColor1Background(new Color(122, 173, 252));
        BT_Solicitud.setColor1Background(new Color(82, 132, 192));
        BT_Datos.setColor1Background(new Color(122, 173, 252));
    }//GEN-LAST:event_BT_SolicitudMouseClicked

    private void BT_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_DatosMouseClicked
        cardLayout.show(CardLayout, "Datos");
        BT_Home.setColor1Background(new Color(122, 173, 252));
        BT_Solicitud.setColor1Background(new Color(122, 173, 252));
        BT_Datos.setColor1Background(new Color(82, 132, 192));
        update_user.setText(extraer()[4]);
        update_tdoc.setText(extraer()[7]);
        Update_name.setText(extraer()[0]);
        Update_phone.setText(extraer()[1]);
        update_age.setText(extraer()[2]);
        Update_password.setText(extraer()[5]);
        update_confirm.setText(extraer()[5]);
        update_id.setText(extraer()[3]);
        String generoact = extraer()[6];
        if (generoact.equals("Masculino")) {
            bt_m.setVisible(true);
            bt_f.setVisible(false);
            sx = "M";
        } else {
            if (generoact.equals("Femenino")) {
                bt_m.setVisible(false);
                bt_f.setVisible(true);
                sx = "F";
            }
        }
    }//GEN-LAST:event_BT_DatosMouseClicked

    private void BT_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_MenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_MenuMouseClicked


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


    private void BT_CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CerrarSesionMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BT_CerrarSesionMouseClicked

    private void bt_cerrar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrar8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_cerrar8MouseClicked

    private void bt_cerrar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_cerrar8ActionPerformed

    private void bt_minimizar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_minimizar6MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_bt_minimizar6MouseClicked

    private void barra_superior8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior8MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_barra_superior8MouseDragged

    private void barra_superior8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior8MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barra_superior8MousePressed

    private void BT_ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ActualizarMouseClicked
        // <editor-fold defaultstate="collapsed" desc="Validaciones de datos">
        if (Update_name.getText().isEmpty()) {
            new Warning("Falta ingresar el Nombre").setVisible(true);
        } else if (!"F".equals(sx) && !"M".equals(sx)) {
            new Warning("Falta seleccionar el Genero").setVisible(true);
        } else if (update_id.getText().isEmpty()) {
            new Warning("Falta ingresar el Documento").setVisible(true);
        } else if (update_age.getText().isEmpty()) {
            new Warning("Falta ingresar la Edad").setVisible(true);
        } else if (Update_phone.getText().isEmpty()) {
            new Warning("Falta ingresar el Telefono").setVisible(true);
        } else if (update_user.getText().isEmpty()) {
            new Warning("Falta ingresar el Usuario").setVisible(true);
        } else if (Update_password.getText().isEmpty()) {
            new Warning("Falta ingresar el Contraseña").setVisible(true);
        } else if (update_confirm.getText().isEmpty()) {
            new Warning("Falta confirmar la Contraseña").setVisible(true);
        } else if (!update_confirm.getText().equals(Update_password.getText())) {
            new Warning("Las contraseñas no coinciden").setVisible(true);
        } else {
            // </editor-fold>
            //Valida los tamaños minimo de cada TX
            if (TamañoMinimo(Update_name, "Nombre y Apellido", 5)
                    && TamañoTelefono(Update_phone) == true
                    && TamañoMinimo(update_age, "Edad", 1)
                    && TamañoMinimo(update_id, "No. Documento", 7)
                    && TamañoMinimo(update_user, "Usuario", 4)
                    && TamañoMinimo(Update_password, "Contraseña", 4)) {
                if (Existencia() == true) {
                    new Warning("Las datos igresados ya existen").setVisible(true);
                } else {
                    eliminar_act();
                    ActualizarBD();
                    Login JF_Login = new Login();
                    this.setVisible(false);
                    JF_Login.setVisible(true);

                }
            }

        }
    }//GEN-LAST:event_BT_ActualizarMouseClicked

    private void BT_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_ActualizarActionPerformed

    private void bt_cerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrar2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_cerrar2MouseClicked

    private void bt_minimizar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_minimizar2MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_bt_minimizar2MouseClicked

    private void barra_superior2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_barra_superior2MouseDragged

    private void barra_superior2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barra_superior2MousePressed

    private void TX_ObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TX_ObservacionesKeyTyped
        //Establecer limite de caracteres
        if (TX_Observaciones.getText().length() >= 220) {
            evt.consume();
        }
    }//GEN-LAST:event_TX_ObservacionesKeyTyped

    private void BT_EnviarSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EnviarSolicitudMouseClicked
        GuardarBD();
        LimpiarCampos_Solicitud();
        cardLayout.show(CardLayout, "Inicio");
        BT_Home.setColor1Background(new Color(82, 132, 192));
        BT_Solicitud.setColor1Background(new Color(122, 173, 252));
        BT_Datos.setColor1Background(new Color(122, 173, 252));
    }//GEN-LAST:event_BT_EnviarSolicitudMouseClicked

    private void BT_EnviarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EnviarSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_EnviarSolicitudActionPerformed

    private void CB_ServicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_ServicioItemStateChanged
        if (CB_Servicio.getSelectedItem() != "-") { //Si ya seleciono algun servicio
            CB_Doctor.setEnabled(true); //ComboBox de doctores lo habilito
            CB_Doctor.removeAllItems(); //Borro todos los items
            CB_Doctor.addItem("-");
            MostraDoctores(); //Le agrego los items de los nombres segun el servicio

        } else {
            CB_Doctor.removeAllItems(); //Borro todos los items
            CB_Doctor.addItem("-");
            CB_Doctor.setEnabled(false);

        }
    }//GEN-LAST:event_CB_ServicioItemStateChanged

    private void CB_DoctorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_DoctorItemStateChanged
        if (CB_Doctor.getSelectedItem() != "-") { //Si ya seleciono algun Doctor
            Calendario.setEnabled(true); //El calendario lo habilito
            Calendario.setDate(null); //Reinicio la hora

        } else {

            Calendario.setDate(null); //Reinicio la hora
            Calendario.setEnabled(false);

        }
    }//GEN-LAST:event_CB_DoctorItemStateChanged

    private void CB_HoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_HoraItemStateChanged
        if (CB_Hora.getSelectedItem() != "-") {
            BT_EnviarSolicitud.setEnabled(true);
            TX_Observaciones.setEnabled(true);
        } else {
            BT_EnviarSolicitud.setEnabled(false);
            TX_Observaciones.setEnabled(false);
        }
    }//GEN-LAST:event_CB_HoraItemStateChanged

    private void CalendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CalendarioPropertyChange

        Date FechaSelecionada = Calendario.getDate();
        //Si la hora es diferente a nada 
        if (FechaSelecionada != null) {
            CB_Hora.setEnabled(true); //ComboBox de Hora lo habilito
            CB_Hora.removeAllItems(); //Borro todos los items
            CB_Hora.addItem("-");
            MostraHoras();

        } else {
            CB_Hora.setEnabled(false); //ComboBox de Hora lo bloqueo
            CB_Hora.removeAllItems(); //Borro todos los items
            CB_Hora.addItem("-");
        }

    }//GEN-LAST:event_CalendarioPropertyChange

    private void update_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_userKeyTyped
        //Para que el TX acepte solo letras
        int key = evt.getKeyChar();
        boolean Mayusculas = key >= 65 && key <= 90;
        boolean Minusculas = key >= 97 && key <= 122;
        if (!(Minusculas || Mayusculas)) {
            evt.consume();
        }
        //Establecer limite de caracteres
        if (update_user.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_update_userKeyTyped

    private void update_confirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_confirmKeyTyped
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
        if (Update_password.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_update_confirmKeyTyped

    private void update_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_confirmActionPerformed

    private void esconder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esconder1MouseClicked
        esconder1.setVisible(false);
        ver1.setVisible(true);
        update_confirm.setEchoChar('*');
    }//GEN-LAST:event_esconder1MouseClicked

    private void ver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver1MouseClicked
        esconder1.setVisible(true);
        ver1.setVisible(false);
        update_confirm.setEchoChar((char) 0);
    }//GEN-LAST:event_ver1MouseClicked

    private void Update_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Update_passwordKeyTyped
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
        if (Update_password.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_Update_passwordKeyTyped

    private void esconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esconderMouseClicked
        esconder.setVisible(false);
        ver.setVisible(true);
        Update_password.setEchoChar('*');
    }//GEN-LAST:event_esconderMouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        esconder.setVisible(true);
        ver.setVisible(false);
        Update_password.setEchoChar((char) 0);
    }//GEN-LAST:event_verMouseClicked

    private void update_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_idKeyTyped
        //Para que el TX acepte solo numeros
        int key = evt.getKeyChar();
        boolean Numeros = key >= 48 && key <= 57;
        if (!(Numeros)) {
            evt.consume();
        }
        //Establecer limite de caracteres
        if (update_id.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_update_idKeyTyped

    private void update_ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_ageKeyTyped
        //Para que el TX acepte solo numeros
        int key = evt.getKeyChar();
        boolean Numeros = key >= 48 && key <= 57;
        if (!(Numeros)) {
            evt.consume();
        }
        //Establecer limite de caracteres
        if (update_age.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_update_ageKeyTyped

    private void Update_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Update_phoneKeyTyped
        //Para que el TX acepte solo numeros
        int key = evt.getKeyChar();
        boolean Numeros = key >= 48 && key <= 57;
        if (!(Numeros)) {
            evt.consume();
        }
        //Establecer limite de caracteres
        if (Update_phone.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_Update_phoneKeyTyped

    private void Update_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Update_nameKeyTyped
        //Para que el TX acepte letras y espacios
        int key = evt.getKeyChar();
        boolean Mayusculas = key >= 65 && key <= 90;
        boolean Minusculas = key >= 97 && key <= 122;
        boolean Espacio = key == 32;
        if (!(Minusculas || Mayusculas || Espacio)) {
            evt.consume();
        }

        //Establecer limite de caracteres
        if (Update_name.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_Update_nameKeyTyped

    private void JCB_servicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCB_servicioItemStateChanged

    }//GEN-LAST:event_JCB_servicioItemStateChanged

    private void JCB_ordenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCB_ordenItemStateChanged

    }//GEN-LAST:event_JCB_ordenItemStateChanged

    private void BT_FiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_FiltrarMouseClicked
    }//GEN-LAST:event_BT_FiltrarMouseClicked

    private void BT_FiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_FiltrarActionPerformed
        aplicarfiltro();
    }//GEN-LAST:event_BT_FiltrarActionPerformed

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Funciones Panel solicitud">
    public String ObtenerDia() {

        int Dia_Semana = Calendario.getCalendar().get(java.util.Calendar.DAY_OF_WEEK);
        // DAY_OF_WEEK devuelve un número entero que representa el día de la semana,
        // donde 1 es domingo, 2 es lunes, 3 es martes, etc.

        switch (Dia_Semana) {
            case 1:
                return "Domingo";
            case 2:
                return "Lunes";
            case 3:
                return "Martes";
            case 4:
                return "Miercoles";
            case 5:
                return "Jueves";
            case 6:
                return "Viernes";
            case 7:
                return "Sabados";
            default:
                return "Desconocido";
        }

    }

    //Funcion que lee en la BD todas las diferentes Horas segun el doctor selecionado
    public void MostraHoras() {
        try {

            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();

            //Seleciona los nombre de los doctores segun la especialidad selecionada
            String SQL = "SELECT Hora FROM Horario_Doctores WHERE Nombre_Doctor = ? AND Dia = ? AND Estado = 'Disponible'";

            PreparedStatement pst = Conexion.prepareStatement(SQL);

            pst.setString(1, (String) CB_Doctor.getSelectedItem());
            pst.setString(2, ObtenerDia());

            ResultSet rs = pst.executeQuery();
            ResultSet rst = pst.executeQuery();
            if (!rs.next()) {
                new Warning("No hay horarios diponibles").setVisible(true);
                CB_Hora.setEnabled(false); //ComboBox de Hora lo bloqueo
                CB_Hora.removeAllItems(); //Borro todos los items
                CB_Hora.addItem("-");
                Calendario.setDate(null); //Reinicio la hora

            } else {
                while (rst.next()) {
                    CB_Hora.addItem(rst.getString("Hora"));
                }

                Date fechaSeleccionada = Calendario.getDate();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                String fechaComoCadena = formatoFecha.format(fechaSeleccionada);
                Fecha = fechaComoCadena;

                //Seleciona los nombre de los doctores segun la especialidad selecionada
                String SQL1 = "SELECT Hora FROM Solicitudes WHERE Servicio = ? AND Doctor = ? AND Fecha = ?";

                PreparedStatement pst1 = Conexion.prepareStatement(SQL1);

                pst1.setString(1, (String) CB_Servicio.getSelectedItem());
                pst1.setString(2, (String) CB_Doctor.getSelectedItem());
                pst1.setString(3, Fecha);

                ResultSet rs1 = pst1.executeQuery();

                while (rs1.next()) {

                    String Hora_Eliminar = rs1.getString("Hora");
                    System.out.println(Hora_Eliminar);
                    for (int i = 0; i < CB_Hora.getItemCount(); i++) {
                        String item = (String) CB_Hora.getItemAt(i);
                        if (item.equals(Hora_Eliminar)) {
                            CB_Hora.removeItem(item);
                            break;
                        }
                    }
                }

                if (CB_Hora.getItemCount() > 1) {
                    // El JComboBox tiene más de un elemento
                } else {
                    new Warning("No hay horarios diponibles").setVisible(true);
                    CB_Hora.setEnabled(false); //ComboBox de Hora lo bloqueo
                    CB_Hora.removeAllItems(); //Borro todos los items
                    CB_Hora.addItem("-");
                    Calendario.setDate(null); //Reinicio la hora
                }

            }

        } catch (SQLException ex) {

        }
    }

    //Funcion que lee en la BD todas los diferentes doctores segun la especialidad selecionada
    public void MostraDoctores() {
        try {

            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();

            //Seleciona los nombre de los doctores segun la especialidad selecionada
            String SQL = "SELECT Nombre_Apellido FROM Doctores WHERE Especialidad = '" + (String) CB_Servicio.getSelectedItem() + "'";

            //Guarda en rs los resultados de la busqueda SQL, osea las diferentes especialidades
            ResultSet rs = st.executeQuery(SQL);

            //Mientras que en los resultados de rs exista mas resultados
            while (rs.next()) {
                //Obtengo el valor de la columna Nombre_Apellido y La agrego en el ComboBox de Doctores
                CB_Doctor.addItem(rs.getString("Nombre_Apellido"));

            }

        } catch (SQLException ex) {

        }
    }

    //Funcion que lee en la BD todas los diferentes servicios (especialidad) de cada doctor
    public void MostraServicios() {
        try {

            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();

            //Seleciona las diferentes especialidades de la tabla doctores
            String SQL = "SELECT DISTINCT Especialidad FROM Doctores";
            Statement stmt = Conexion.createStatement();

            //Guarda en rs los resultados de la busqueda SQL, osea las diferentes especialidades
            ResultSet rs = stmt.executeQuery(SQL);

            //Mientras que en los resultados de rs exista mas resultados
            while (rs.next()) {
                //Obtengo el valor de la columna Especialidad y La agrego en el ComboBox de Servicios
                CB_Servicio.addItem(rs.getString("Especialidad"));
            }

        } catch (SQLException ex) {

        }
    }

    public void LimpiarCampos_Solicitud() {
        TX_Observaciones.setText("");
        Calendario.setDate(null);
        CB_Hora.setSelectedIndex(0);
        CB_Servicio.setSelectedIndex(0);
    }

    public void GuardarBD() {
        try {
            //Función que guarda un objeto de tipo solicitud en la tabla Solicitudes de la base de datos
            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            //Creación del SQL

            String SQL = "INSERT INTO Solicitudes(Usuario,"
                    + " Servicio, Doctor, Fecha, Hora, Observaciones, Confirmada, Estado_Cita, Motivo_Cancelacion) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = Conexion.prepareStatement(SQL);
            //Objeto de tipo Solicitud

            Date fechaSeleccionada = Calendario.getDate();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String fechaComoCadena = formatoFecha.format(fechaSeleccionada);
            Fecha = fechaComoCadena;

            Servicio = (String) CB_Servicio.getSelectedItem();

            Observaciones = TX_Observaciones.getText();

            Horario = (String) CB_Hora.getSelectedItem();

            Clases.Cita S = new Clases.Cita(Login.Usuario, (String) CB_Servicio.getSelectedItem(), (String) CB_Doctor.getSelectedItem(),
                    Fecha, Horario, Observaciones, "No", "En Espera", "");
            pst.setString(1, S.getUsuario());
            pst.setString(2, S.getServicio());
            pst.setString(3, S.getDoctor());
            pst.setString(4, S.getFecha());
            pst.setString(5, S.getHora());
            pst.setString(6, S.getObservaciones());
            pst.setString(7, S.getConfirmada());
            pst.setString(8, S.getEstado_Cita());
            pst.setString(9, S.getMotivo_Cancelacion());

            int n = pst.executeUpdate();

            if (n > 0) {
                //Mensaje de confirmacion
                new Success("Solicitud enviada correctamente").setVisible(true);
            }

        } catch (SQLException ex) {

        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Funciones para Panel Actualizar Datos">
    //Función que extrae los datos de la base de datos de pacientey los almacena en un vector para mostrarlo en la ventana de actualiación
    String user[] = new String[8];

    public String[] extraer() {
        try {

            String user_;

            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();

            String SQL = "Select * from Pacientes";

            Statement sentence = Conexion.createStatement();
            ResultSet rst = sentence.executeQuery(SQL);
            while (rst.next()) {

                user_ = rst.getString("Usuario");

                if (user_.equals((Login.Usuario).toUpperCase())) {
                    user[0] = FormatoNombre(rst.getString("Nombre_Apellido"));
                    user[1] = String.valueOf((long) rst.getDouble("Telefono"));
                    user[2] = String.valueOf((int) rst.getDouble("Edad"));
                    user[3] = String.valueOf((long) rst.getDouble("Numero_Documento"));
                    user[4] = rst.getString("Usuario");
                    user[5] = rst.getString("Contraseña");
                    user[6] = rst.getString("Genero");
                    user[7] = rst.getString("Tipo_Documento");
                }

            }
        } catch (SQLException | HeadlessException e) {
            new Error("Error al buscar Datos").setVisible(true);

        }
        return user;
    }

    //Función para eliminar al paciente actual del hospital y cambiar sus datos
    public void eliminar_act() {
        try {
            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();
            //Eliminación de la tabla de Pacientes
            String sql = "DELETE FROM Pacientes";
            PreparedStatement stmt = Conexion.prepareStatement("DELETE FROM Pacientes WHERE Usuario = ?");
            stmt.setString(1, user[4]);
            stmt.executeUpdate();
            //Eliminación de la tabla de usuario
            //Inicialmente se elimina el registro de la tabla de usuarios
            String sq2 = "DELETE FROM Usuarios";
            PreparedStatement stmt2 = Conexion.prepareStatement("DELETE FROM Usuarios WHERE Usuario = ?");
            stmt2.setString(1, user[4]);
            stmt2.executeUpdate();

        } catch (SQLException e) {
            new Error("Error al actualizar Datos").setVisible(true);
        }
    }

    //Para poner una cadena en formato de un nombre 
    public static String FormatoNombre(String Cadena) {
        if (Cadena == null || Cadena.isEmpty()) {
            return Cadena;
        }

        StringBuilder sb = new StringBuilder(Cadena.length());
        boolean capitalizeNext = true;
        for (char c : Cadena.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }

    //Función para validar que ninguno de los datos a actualizar le pertenexcan a otro usuario en el hospital  
    public Boolean Existencia() {

        try {
            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            Statement st = Conexion.createStatement();

            //Para buscar si existe el usuario a crear
            String SQL1 = "SELECT * FROM Admin WHERE Usuario = ?";
            String SQL2 = "SELECT * FROM Doctores WHERE Usuario = ?";
            String SQL3 = "SELECT * FROM OtroEmpleado WHERE Usuario = ?";
            String SQL4 = "SELECT * FROM Admin WHERE Numero_Documento = ?";
            String SQL5 = "SELECT * FROM Doctores WHERE Numero_Documento = ?";
            String SQL6 = "SELECT * FROM OtroEmpleado WHERE Numero_Documento = ?";
            String SQL7 = "SELECT * FROM Admin WHERE Telefono = ?";
            String SQL8 = "SELECT * FROM Doctores WHERE Telefono = ?";
            String SQL9 = "SELECT * FROM OtroEmpleado WHERE Telefono = ?";

            PreparedStatement pst1 = Conexion.prepareStatement(SQL1);
            PreparedStatement pst2 = Conexion.prepareStatement(SQL2);
            PreparedStatement pst3 = Conexion.prepareStatement(SQL3);
            PreparedStatement pst4 = Conexion.prepareStatement(SQL4);
            PreparedStatement pst5 = Conexion.prepareStatement(SQL5);
            PreparedStatement pst6 = Conexion.prepareStatement(SQL6);
            PreparedStatement pst7 = Conexion.prepareStatement(SQL7);
            PreparedStatement pst8 = Conexion.prepareStatement(SQL8);
            PreparedStatement pst9 = Conexion.prepareStatement(SQL9);

            pst1.setString(1, update_user.getText());
            pst2.setString(1, update_user.getText());
            pst3.setString(1, update_user.getText());
            pst4.setString(1, update_id.getText());
            pst5.setString(1, update_id.getText());
            pst6.setString(1, update_id.getText());
            pst7.setString(1, Update_phone.getText());
            pst8.setString(1, Update_phone.getText());
            pst9.setString(1, Update_phone.getText());
            //Extrae el conjunto de resultados 
            ResultSet rs1 = pst1.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            ResultSet rs4 = pst4.executeQuery();
            ResultSet rs5 = pst5.executeQuery();
            ResultSet rs6 = pst6.executeQuery();
            ResultSet rs7 = pst7.executeQuery();
            ResultSet rs8 = pst8.executeQuery();
            ResultSet rs9 = pst9.executeQuery();

            //Si hay mas de un resultado: true
            if (rs1.next() || rs2.next() || rs3.next() || rs4.next() || rs5.next() || rs6.next() || rs7.next() || rs8.next() || rs9.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException | HeadlessException e) {
            return false;
        }

    }

    public void ActualizarBD() {

        try {
            //Variable tipo Connection para que funcione
            Connection Conexion = null;
            //Crear un objeto de la clase Conexion para poder conectar con la BD
            ConexionBD BD = new ConexionBD();
            //Se conceta con la BD
            Conexion = BD.getConexion();
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

            //Utilizacion de POO
            Clases.Paciente P = new Clases.Paciente(Update_name.getText().toUpperCase(), Genero,
                    Double.parseDouble(update_id.getText()), Double.parseDouble(update_age.getText()),
                    update_tdoc.getText(), Double.parseDouble(Update_phone.getText()),
                    update_user.getText().toUpperCase(), Update_password.getText());

            //Guarda cada valor en su respectiva columna, la columna se define por el primer paramatro
            //Guardo cada atributo del objeto J en su columna correspondiete, con los Getters
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
                new Success("Datos actualizados").setVisible(true);

            }

        } catch (SQLException | HeadlessException e) {
            //Error x si acaso
            new Error("Error al actualizar datos").setVisible(true);

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

            pst.setString(1, update_user.getText());
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

            pst.setString(1, update_id.getText());

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
            new Warning("Tamaño minimo" + min).setVisible(true);
            return false;
        } else {
            return true;
        }
    }

    public Boolean TamañoTelefono(JTextField JTextField) {
        //Si no tiene el tamaño minimo de caracteres, muestra error
        if (JTextField.getText().length() != 7 && JTextField.getText().length() != 10) {
            new Warning("Tamaño minimo: 7-10 números").setVisible(true);
            return false;
        } else {
            return true;
        }
    }

    public void LimpiarCampos() {
        update_tdoc.setText("");
        Update_name.setText("");
        update_id.setText("");
        update_age.setText("");
        Update_phone.setText("");
        update_user.setText("");
        Update_password.setText("");
        update_confirm.setText("");
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Funciones Panel Inicio">
    //Funcion que lee en la BD todas los diferentes servicios (especialidad) de cada doctor
    public void MostraServicios(JComboBox<String> combobox) {
        try {

            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();

            //Seleciona las diferentes especialidades de la tabla doctores
            String SQL = "SELECT DISTINCT Especialidad FROM Doctores";
            Statement stmt = Conexion.createStatement();

            //Guarda en rs los resultados de la busqueda SQL, osea las diferentes especialidades
            ResultSet rs = stmt.executeQuery(SQL);

            //Mientras que en los resultados de rs exista mas resultados
            while (rs.next()) {
                //Obtengo el valor de la columna Especialidad y La agrego en el ComboBox de Servicios
                combobox.addItem(rs.getString("Especialidad"));
            }

        } catch (SQLException ex) {
            new Error("Error al seleccionar datos").setVisible(true);
        }
    }

    public void Serviciospaciente(String Usuario) {
        try {
            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            String SQL = "SELECT DISTINCT Servicio FROM Solicitudes WHERE Usuario = ?";
            Statement stmt = Conexion.createStatement();
            PreparedStatement st = Conexion.prepareStatement(SQL);
            st.setString(1, Usuario);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                JCB_servicio.addItem(rs.getString("Servicio"));
            }

        } catch (Exception ex) {
            new Error("Error al seleccionar datos").setVisible(true);
        }
    }

    public double ObtenerTelefono() {
        try {

            Connection Conexion = null;
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();

            //Seleciona las diferentes especialidades de la tabla doctores
            String SQL = "SELECT Telefono FROM Pacientes WHERE Usuario = '" + Login.Usuario + "'";
            Statement stmt = Conexion.createStatement();

            //Guarda en rs los resultados de la busqueda SQL, osea las diferentes especialidades
            ResultSet rs = stmt.executeQuery(SQL);

            //Mientras que en los resultados de rs exista mas resultados
            while (rs.next()) {
                return rs.getDouble("Telefono");
            }

        } catch (SQLException ex) {

        }
        return 0;

    }

    public void ModeloTabla() {
        DefaultTableModel tablapaciente = (DefaultTableModel) Citas_paciente.getModel();
        String encabezados[] = {"Servicio", "Doctor", "Fecha", "Hora", "Confirmación", "Estado de la cita", "Consultorio"};
        tablapaciente = new DefaultTableModel(null, encabezados);
        Citas_paciente.setModel(tablapaciente);

    }

    public void aplicarfiltro() {
        switch ((String) JCB_estadocita.getSelectedItem()) {
            case "-":
                switch ((String) JCB_orden.getSelectedItem()) {
                    case "-":
                        if ("-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {
                            Llenar("-", "-", "-", "-");
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("-", "-", (String) JCB_servicio.getSelectedItem(), "-");

                        } else if ("-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("-", "-", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("-", "-", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                    case "Ascendente":

                        if ("-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {
                            Llenar("-", "ASC", "-", "-");
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("-", "ASC", (String) JCB_servicio.getSelectedItem(), "-");

                        } else if ("-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("-", "ASC", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("-", "ASC", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                    case "Descendente":

                        if ("-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {
                            Llenar("-", "DESC", "-", "-");
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("-", "DESC", (String) JCB_servicio.getSelectedItem(), "-");

                        } else if ("-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("-", "DESC", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("-", "DESC", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                }
                break;
            case "En Espera":
                switch ((String) JCB_orden.getSelectedItem()) {
                    case "-":
                        if ("-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {
                            Llenar("En Espera", "-", "-", "-");
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("En Espera", "-", (String) JCB_servicio.getSelectedItem(), "-");

                        } else if ("-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("En Espera", "-", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("En Espera", "-", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                    case "Ascendente":

                        if ("-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {
                            Llenar("En Espera", "ASC", "-", "-");
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("En Espera", "ASC", (String) JCB_servicio.getSelectedItem(), "-");

                        } else if ("-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("En Espera", "ASC", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("En Espera", "ASC", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                    case "Descendente":

                        if ("-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {
                            Llenar("En Espera", "DESC", "-", "-");
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("En Espera", "DESC", (String) JCB_servicio.getSelectedItem(), "-");

                        } else if ("-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("En Espera", "DESC", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("En Espera", "DESC", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                }
                break;
            case "Por Asistir":
                switch ((String) JCB_orden.getSelectedItem()) {
                    case "-":
                        if ("-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {
                            Llenar("Valida", "-", "-", "-");
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("Valida", "-", (String) JCB_servicio.getSelectedItem(), "-");

                        } else if ("-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("Valida", "-", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("Valida", "-", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                    case "Ascendente":

                        if ("-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {
                            Llenar("Valida", "ASC", "-", "-");
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("Valida", "ASC", (String) JCB_servicio.getSelectedItem(), "-");

                        } else if ("-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("Valida", "ASC", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("Valida", "ASC", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                    case "Descendente":

                        if ("-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {
                            Llenar("Valida", "DESC", "-", "-");
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && "-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("Valida", "DESC", (String) JCB_servicio.getSelectedItem(), "-");

                        } else if ("-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("Valida", "DESC", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!"-".equals((String) JCB_servicio.getSelectedItem()) && !"-".equals((String) JCB_confirmacion.getSelectedItem())) {

                            Llenar("Valida", "DESC", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                }
                break;
            case "Cancelada":
                switch ((String) JCB_orden.getSelectedItem()) {
                    case "-":
                        if (JCB_servicio.getSelectedItem().equals("-") && JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "-", "-", "-");
                        } else if (!JCB_servicio.getSelectedItem().equals("-") && JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "-", (String) JCB_servicio.getSelectedItem(), "-");
                        } else if (JCB_servicio.getSelectedItem().equals("-") && !JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "-", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!JCB_servicio.getSelectedItem().equals("-") && !JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "-", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                    case "Ascendente":
                        if (JCB_servicio.getSelectedItem().equals("-") && JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "ASC", "-", "-");
                        } else if (!JCB_servicio.getSelectedItem().equals("-") && JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "ASC", (String) JCB_servicio.getSelectedItem(), "-");
                        } else if (JCB_servicio.getSelectedItem().equals("-") && !JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "ASC", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!JCB_servicio.getSelectedItem().equals("-") && !JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "ASC", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                    case "Descendente":
                        if (JCB_servicio.getSelectedItem().equals("-") && JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "DESC", "-", "-");
                        } else if (!JCB_servicio.getSelectedItem().equals("-") && JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "DESC", (String) JCB_servicio.getSelectedItem(), "-");
                        } else if (JCB_servicio.getSelectedItem().equals("-") && !JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "DESC", "-", (String) JCB_confirmacion.getSelectedItem());
                        } else if (!JCB_servicio.getSelectedItem().equals("-") && !JCB_confirmacion.getSelectedItem().equals("-")) {
                            Llenar("Cancelada", "DESC", (String) JCB_servicio.getSelectedItem(), (String) JCB_confirmacion.getSelectedItem());
                        }
                        break;
                }
        }

    }

    public void Llenar(String estado, String orden, String servicio, String confirmacion) {
        try {
            Connection conexion = null;
            ConexionBD bd = new ConexionBD();
            conexion = bd.getConexion();
            String sql = "SELECT Servicio, Doctor, Fecha, Hora, Confirmada, Estado_Cita FROM Solicitudes WHERE Usuario = ?";
            int parametro = 2; // Índice del primer parámetro

            if (!servicio.equals("-")) {
                sql += " AND Servicio = ?";

            }
            if (!confirmacion.equals("-")) {
                sql += " AND Confirmada = ?";

            }
            if (!estado.equals("-")) {
                sql += " AND Estado_Cita = ?";

            }

            if (!orden.equals("-")) {
                if (orden.equals("ASC")) {
                    sql += " ORDER BY Fecha " + orden + ", Hora " + orden;
                }
                if (orden.equals("DESC")) {
                    sql += " ORDER BY Fecha " + orden + ", Hora " + orden;

                }
            }

            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt.setString(1, getUsuario());

            if (!servicio.equals("-")) {
                pstmt.setString(parametro, servicio);
                parametro++;

            }
            if (!confirmacion.equals("-")) {
                pstmt.setString(parametro, confirmacion);
                parametro++;

            }
            if (!estado.equals("-")) {
                pstmt.setString(parametro, estado);
                parametro++;

            }

            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) Citas_paciente.getModel();
            modelo.setRowCount(0);

            while (rs.next()) {
                Object[] fila = new Object[7];
                fila[0] = "  " + rs.getString("Servicio");
                fila[1] = FormatoNombre(rs.getString("Doctor"));
                fila[2] = rs.getString("Fecha");
                fila[3] = rs.getString("Hora");
                fila[4] = rs.getString("Confirmada");
                fila[5] = rs.getString("Estado_Cita");
                if (fila[5].equals("Valida")) {
                    fila[5] = "Por Asistir";
                    num_pendientes = num_pendientes + 1;
                }
                if (fila[5].equals("Completada")) {
                    num_completadas = num_completadas + 1;
                }
                total_citas = num_pendientes + num_completadas;
                fila[6] = getConsultorio((String) fila[1]);
                modelo.addRow(fila);
            }

            Citas_paciente.setModel(modelo);

        } catch (Exception e) {
            new Error("Error al seleccionar datos").setVisible(true);
        }
    }

    public String getConsultorio(String Doctor) {
        String consultorio = null;
        try {
            Connection conexion = null;
            ConexionBD bd = new ConexionBD();
            conexion = bd.getConexion();
            String sql = "SELECT No_Consultorio FROM Doctores WHERE Nombre_Apellido = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, Doctor.toUpperCase());
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                consultorio = Integer.toString(rs.getInt("No_Consultorio"));

            }
            rs.close();
            statement.close();
            conexion.close();

        } catch (Exception ex) {
            new Error("Error al conectar con BD").setVisible(true);
        }
        return consultorio;

    }

    public void settUsuario(String user) {
        this.Usuario = user;
    }

    public String getUsuario() {
        return this.Usuario;
    }

    public void Datostabla(String Usuario) {
        try {
            Connection Conexion = null;
            DefaultTableModel ModeloTabla = (DefaultTableModel) Citas_paciente.getModel();
            ConexionBD BD = new ConexionBD();
            Conexion = BD.getConexion();
            String registros[] = new String[7];
            ModeloTabla.setRowCount(0);
            String SQL = "SELECT * FROM Solicitudes WHERE Usuario = ?";
            PreparedStatement st = Conexion.prepareStatement(SQL);
            st.setString(1, Usuario);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                registros[0] = "  " + rs.getString("Servicio");
                registros[1] = FormatoNombre(rs.getString("Doctor"));
                registros[2] = rs.getString("Fecha");
                registros[3] = rs.getString("Hora");
                registros[4] = rs.getString("Confirmada");
                registros[5] = rs.getString("Estado_Cita");
                registros[6] = getConsultorio(registros[1]);
                if (registros[5].equals("Valida")) {
                    registros[5] = "Por Asistir";
                    num_pendientes = num_pendientes + 1;
                }
                if (registros[5].equals("Completada")) {
                    num_completadas = num_completadas + 1;
                }
                total_citas = num_pendientes + num_completadas;
                label_total.setText(String.valueOf(total_citas));
                label_completadas.setText(String.valueOf(num_completadas));
                label_pendientes.setText(String.valueOf(num_pendientes));
                ModeloTabla.addRow(registros);
            }
            Citas_paciente.setModel(ModeloTabla);
        } catch (Exception ex) {
            new Error("Error al cargar datos").setVisible(true);
        }
    }

    // </editor-fold>
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
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.AllButton BT_Actualizar;
    private Componentes.AllButton BT_CerrarSesion;
    private Componentes.AllButton BT_Datos;
    private Componentes.AllButton BT_EnviarSolicitud;
    private Componentes.AllButton BT_Filtrar;
    private Componentes.AllButton BT_Home;
    private Componentes.AllButton BT_Menu;
    private Componentes.AllButton BT_Solicitud;
    private Componentes.BlurBackground Background;
    private Componentes.ComboBoxSuggestion CB_Doctor;
    private Componentes.ComboBoxSuggestion CB_Hora;
    private Componentes.ComboBoxSuggestion CB_Servicio;
    private com.toedter.calendar.JDateChooser Calendario;
    private javax.swing.JPanel CardLayout;
    private Componentes.Table Citas_paciente;
    private org.example.Custom.PanelRound ConfirmarContr;
    private org.example.Custom.PanelRound Contraseña;
    private javax.swing.JPanel Datos;
    private org.example.Custom.PanelRound Edad;
    private Componentes.ComboBoxSuggestion JCB_confirmacion;
    private Componentes.ComboBoxSuggestion JCB_estadocita;
    private Componentes.ComboBoxSuggestion JCB_orden;
    private Componentes.ComboBoxSuggestion JCB_servicio;
    private org.example.Custom.PanelRound JP_BarraLateral;
    private javax.swing.JPanel JP_CerraSesionBarraL;
    private org.example.Custom.PanelRound NoDocumento;
    private org.example.Custom.PanelRound NombreApellido;
    private javax.swing.JPanel Solicitud;
    private org.example.Custom.PanelRound TDocumento;
    private org.example.Custom.PanelRound TXTUsuario;
    private javax.swing.JTextPane TX_Observaciones;
    private org.example.Custom.PanelRound Telefono;
    private org.example.Custom.AnimatedTextField Update_name;
    private org.example.Custom.AnimatedPasswordField Update_password;
    private org.example.Custom.AnimatedTextField Update_phone;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel barra_superior2;
    private javax.swing.JPanel barra_superior8;
    private Componentes.BlurBackground blurBackground1;
    private Componentes.BlurBackground blurBackground10;
    private Componentes.BlurBackground blurBackground11;
    private Componentes.BlurBackground blurBackground12;
    private Componentes.BlurBackground blurBackground2;
    private javax.swing.ButtonGroup botones;
    private Componentes.AllButton bt_cerrar;
    private Componentes.AllButton bt_cerrar2;
    private Componentes.AllButton bt_cerrar8;
    private javax.swing.JLabel bt_f;
    private javax.swing.JLabel bt_m;
    private Componentes.AllButton bt_minimizar;
    private Componentes.AllButton bt_minimizar2;
    private Componentes.AllButton bt_minimizar6;
    private javax.swing.JLabel esconder;
    private javax.swing.JLabel esconder1;
    private javax.swing.JPanel home;
    private javax.swing.JLabel icon_ad;
    private Componentes.BlurBackground icon_do;
    private javax.swing.JLabel icon_em;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_completadas;
    private javax.swing.JLabel label_pendientes;
    private javax.swing.JLabel label_total;
    private javax.swing.JLabel lb_doc;
    private javax.swing.JLabel lb_doctor;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_fecha1;
    private javax.swing.JLabel lb_fecha2;
    private javax.swing.JLabel lb_fecha3;
    private javax.swing.JLabel nu_ad;
    private javax.swing.JLabel nu_do;
    private javax.swing.JLabel nu_em;
    private org.example.Custom.PanelRound panelRound1;
    private org.example.Custom.PanelRound panelRound2;
    private org.example.Custom.PanelRound panelRound3;
    private org.example.Custom.PanelRound panelRound4;
    private org.example.Custom.AnimatedTextField update_age;
    private org.example.Custom.AnimatedPasswordField update_confirm;
    private org.example.Custom.AnimatedTextField update_id;
    private org.example.Custom.AnimatedTextField update_tdoc;
    private org.example.Custom.AnimatedTextField update_user;
    private javax.swing.JLabel ver;
    private javax.swing.JLabel ver1;
    // End of variables declaration//GEN-END:variables
}
