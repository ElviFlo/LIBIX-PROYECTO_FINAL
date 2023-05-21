/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConexionBD.ConexionBD;
import com.raven.datechooser.SelectedDate;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvira Florez
 */
public class Paciente extends javax.swing.JFrame {

    static CardLayout cardLayout;
    String Usuario = "";
    String Fecha;
    String Servicio;
    String Horario;
    String Observaciones;

    //Para hacer el Modelo de la tabla del horario
    DefaultTableModel ModeloTabla = new DefaultTableModel();

    String sx;
    int op;

    public Paciente() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        bt_minimizar.setColor1Background(new Color(0, 0, 0, 0));
        bt_cerrar.setColor1Background(new Color(0, 0, 0, 0));
        cardLayout = (CardLayout) (CardLayout.getLayout());
        cardLayout.show(CardLayout, "Inicio");
        sx = "M";
        op = 0;

        CB_Servicio.addItem("-");
        CB_Doctor.addItem("-");
        CB_Hora.addItem("-");

        MostraServicios();

        CB_Doctor.setEnabled(false);
        Calendario.setEnabled(false);
        CB_Hora.setEnabled(false);
        BT_EnviarSolicitud.setEnabled(false);
        TX_Observaciones.setEnabled(false);
    }

    public void verDatos() {
        try {
            //Variable tipo Connection para que funcione
            Connection Conexion = null;
            //Crear un objeto de la clase Conexion para poder conectar con la BD
            ConexionBD BD = new ConexionBD();
            //Se conceta con la BD
            Conexion = BD.getConexion();
            //No se pa q sirve, pero ahi esta x si acaso
            Statement st = Conexion.createStatement();

            String SQL = "SELECT * FROM Pacientes WHERE Usuario = ?";

            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                TX_NombreApellido.setText(rs.getString("Nombre_Apellido"));

            }
        } catch (SQLException e) {
            new Error("Error al visualizar Datos").setVisible(true);
        }
    }

    public void MostrarDatos() {

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
            String SQL = "SELECT * FROM Pacientes WHERE Usuario = ?";

            PreparedStatement pst = Conexion.prepareStatement(SQL);

            pst.setString(1, Usuario);
            //Extrae el conjunto de resultados 
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                TX_NombreApellido.setText((String) rs.getString("Usuario"));
            }

        } catch (SQLException | HeadlessException ex) {
            //Error x si acaso
            new Error("Error al guardar Datos").setVisible(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        Calendario = new com.raven.datechooser.DateChooser();
        Background = new Componentes.BlurBackground();
        JP_BarraLateral = new org.example.Custom.PanelRound();
        JP_CerraSesionBarraL = new javax.swing.JPanel();
        BT_CerrarSesion = new Componentes.AllButton();
        BT_Menu = new Componentes.AllButton();
        BT_Home = new Componentes.AllButton();
        BT_Solicitud = new Componentes.AllButton();
        BT_Empleado = new Componentes.AllButton();
        CardLayout = new javax.swing.JPanel();
        Datos = new javax.swing.JPanel();
        blurBackground1 = new Componentes.BlurBackground();
        BT_Registrarse = new Componentes.AllButton();
        barra_superior2 = new javax.swing.JPanel();
        bt_cerrar2 = new Componentes.AllButton();
        bt_minimizar2 = new Componentes.AllButton();
        NombreApellido = new org.example.Custom.PanelRound();
        TX_NombreApellido = new org.example.Custom.AnimatedTextField();
        Telefono = new org.example.Custom.PanelRound();
        TX_Telefono = new org.example.Custom.AnimatedTextField();
        Edad = new org.example.Custom.PanelRound();
        TX_Edad = new org.example.Custom.AnimatedTextField();
        TXTUsuario = new org.example.Custom.PanelRound();
        TX_Usuario = new org.example.Custom.AnimatedTextField();
        TDocumento = new org.example.Custom.PanelRound();
        TipoDocumento1 = new org.example.Custom.AnimatedTextField();
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
        bt_f = new javax.swing.JLabel();
        bt_m = new javax.swing.JLabel();
        Solicitud = new javax.swing.JPanel();
        blurBackground2 = new Componentes.BlurBackground();
        barra_superior = new javax.swing.JPanel();
        bt_cerrar = new Componentes.AllButton();
        bt_minimizar = new Componentes.AllButton();
        CB_Doctor = new Componentes.ComboBoxSuggestion();
        lb_doc = new javax.swing.JLabel();
        TXT_Fecha = new org.example.Custom.PanelRound();
        txtDate = new org.example.Custom.AnimatedTextField();
        lb_fecha1 = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        bt_calendario = new Componentes.AllButton();
        lb_fecha2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TX_Observaciones = new javax.swing.JTextPane();
        lb_fecha3 = new javax.swing.JLabel();
        CB_Servicio = new Componentes.ComboBoxSuggestion();
        CB_Hora = new Componentes.ComboBoxSuggestion();
        BT_EnviarSolicitud = new Componentes.AllButton();
        home = new javax.swing.JPanel();
        blurBackground10 = new Componentes.BlurBackground();
        barra_superior8 = new javax.swing.JPanel();
        bt_cerrar8 = new Componentes.AllButton();
        bt_minimizar6 = new Componentes.AllButton();
        panelRound1 = new org.example.Custom.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Componentes.Table();
        jLabel1 = new javax.swing.JLabel();
        bt_eliminar = new Componentes.AllButton();
        lb_eliminar = new javax.swing.JLabel();
        panelRound2 = new org.example.Custom.PanelRound();
        icon_do = new Componentes.BlurBackground();
        lb_doctor = new javax.swing.JLabel();
        nu_do = new javax.swing.JLabel();
        label_doctor = new javax.swing.JLabel();
        panelRound3 = new org.example.Custom.PanelRound();
        blurBackground11 = new Componentes.BlurBackground();
        icon_ad = new javax.swing.JLabel();
        nu_ad = new javax.swing.JLabel();
        label_administrador = new javax.swing.JLabel();
        panelRound4 = new org.example.Custom.PanelRound();
        blurBackground12 = new Componentes.BlurBackground();
        icon_em = new javax.swing.JLabel();
        label_empleado = new javax.swing.JLabel();
        nu_em = new javax.swing.JLabel();

        Calendario.setForeground(new java.awt.Color(160, 197, 234));
        Calendario.setDateFormat("dd-MMMM-yyyy");
        Calendario.setTextRefernce(txtDate);
        Calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CalendarioPropertyChange(evt);
            }
        });

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

        BT_Empleado.setBackground(new java.awt.Color(122, 173, 252));
        BT_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registro.png"))); // NOI18N
        BT_Empleado.setColor1Background(new java.awt.Color(122, 173, 252));
        BT_Empleado.setColor2Over(new java.awt.Color(82, 132, 192));
        BT_Empleado.setColor3Click(new java.awt.Color(74, 93, 242));
        BT_Empleado.setEnableColorGradient(true);
        BT_Empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_EmpleadoMouseClicked(evt);
            }
        });
        JP_BarraLateral.add(BT_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 50, 40));

        Background.add(JP_BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 570));

        CardLayout.setBackground(new java.awt.Color(255, 255, 255));
        CardLayout.setForeground(new java.awt.Color(204, 255, 255));
        CardLayout.setLayout(new java.awt.CardLayout());

        Datos.setBackground(new java.awt.Color(255, 255, 255));

        blurBackground1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Datos Paciente.png"))); // NOI18N
        blurBackground1.setRadius(40);
        blurBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Registrarse.setText("Actualizar Datos");
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
        blurBackground1.add(BT_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 210, 40));

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

        TX_NombreApellido.setForeground(new java.awt.Color(0, 0, 0));
        TX_NombreApellido.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_NombreApellido.setHint("Ej: Rodolfo Rivera");
        TX_NombreApellido.setHintColor(new java.awt.Color(153, 153, 153));
        TX_NombreApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_NombreApellidoKeyTyped(evt);
            }
        });
        NombreApellido.add(TX_NombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(NombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 95, 370, 40));

        Telefono.setRadius(20);
        Telefono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_Telefono.setForeground(new java.awt.Color(0, 0, 0));
        TX_Telefono.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_Telefono.setHint("Ej: 3166705696");
        TX_Telefono.setHintColor(new java.awt.Color(153, 153, 153));
        TX_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_TelefonoKeyTyped(evt);
            }
        });
        Telefono.add(TX_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 205, 370, 40));

        Edad.setRadius(20);
        Edad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_Edad.setForeground(new java.awt.Color(0, 0, 0));
        TX_Edad.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_Edad.setHint("Ej: 16");
        TX_Edad.setHintColor(new java.awt.Color(153, 153, 153));
        TX_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_EdadKeyTyped(evt);
            }
        });
        Edad.add(TX_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 190, 40));

        blurBackground1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 320, 220, 40));

        TXTUsuario.setRadius(20);
        TXTUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        TX_Usuario.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_Usuario.setHint("Ej: Rodor");
        TX_Usuario.setHintColor(new java.awt.Color(153, 153, 153));
        TX_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_UsuarioKeyTyped(evt);
            }
        });
        TXTUsuario.add(TX_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(TXTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 430, 370, 40));

        TDocumento.setRadius(20);
        TDocumento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoDocumento1.setEditable(false);
        TipoDocumento1.setForeground(new java.awt.Color(0, 0, 0));
        TipoDocumento1.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TipoDocumento1.setHint("Seleccione una opción");
        TipoDocumento1.setHintColor(new java.awt.Color(153, 153, 153));
        TDocumento.add(TipoDocumento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 320, 40));

        blurBackground1.add(TDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 95, 370, 40));

        NoDocumento.setRadius(20);
        NoDocumento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TX_NoDocumento.setForeground(new java.awt.Color(0, 0, 0));
        TX_NoDocumento.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        TX_NoDocumento.setHint("Ej: 32692328");
        TX_NoDocumento.setHintColor(new java.awt.Color(153, 153, 153));
        TX_NoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_NoDocumentoKeyTyped(evt);
            }
        });
        NoDocumento.add(TX_NoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 340, 40));

        blurBackground1.add(NoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 205, 370, 40));

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

        blurBackground1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 370, 40));

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

        TX_ConfirmarContra.setForeground(new java.awt.Color(0, 0, 0));
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

        bt_f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/F.png"))); // NOI18N
        blurBackground1.add(bt_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 80, 50));

        bt_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M.png"))); // NOI18N
        blurBackground1.add(bt_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 80, 50));

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
        blurBackground2.add(CB_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 235, 40));

        lb_doc.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_doc.setText("Doctor/a disponible:");
        blurBackground2.add(lb_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        TXT_Fecha.setBackground(new java.awt.Color(227, 226, 226));
        TXT_Fecha.setRadius(20);
        TXT_Fecha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDate.setForeground(new java.awt.Color(0, 0, 0));
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        txtDate.setHintColor(new java.awt.Color(153, 153, 153));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateKeyTyped(evt);
            }
        });
        TXT_Fecha.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 200, 40));

        blurBackground2.add(TXT_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 138, 235, 40));

        lb_fecha1.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_fecha1.setText("Servicio a solicitar:");
        blurBackground2.add(lb_fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        lb_fecha.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_fecha.setText("Fecha de preferencia: ");
        blurBackground2.add(lb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        bt_calendario.setBorder(null);
        bt_calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendario.png"))); // NOI18N
        bt_calendario.setColor1Background(new java.awt.Color(255, 255, 254));
        bt_calendario.setColor2Over(new java.awt.Color(176, 207, 240));
        bt_calendario.setColor3Click(new java.awt.Color(163, 176, 212));
        bt_calendario.setEnableColorGradient(true);
        bt_calendario.setEnableShadow(true);
        bt_calendario.setRadius(20);
        bt_calendario.setRippleColor(new java.awt.Color(255, 255, 255));
        bt_calendario.setRoundBottomLeft(10);
        bt_calendario.setRoundBottomRight(10);
        bt_calendario.setRoundTopLeft(10);
        bt_calendario.setRoundTopRight(10);
        bt_calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_calendarioActionPerformed(evt);
            }
        });
        blurBackground2.add(bt_calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 135, 50, 50));

        lb_fecha2.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_fecha2.setText("Observaciones Adicionales");
        blurBackground2.add(lb_fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        TX_Observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TX_ObservacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(TX_Observaciones);

        blurBackground2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 410, 150));

        lb_fecha3.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        lb_fecha3.setText("Horario de preferencia: ");
        blurBackground2.add(lb_fecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        CB_Servicio.setBackground(new java.awt.Color(227, 226, 226));
        CB_Servicio.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        CB_Servicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_ServicioItemStateChanged(evt);
            }
        });
        blurBackground2.add(CB_Servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 235, 40));

        CB_Hora.setBackground(new java.awt.Color(227, 226, 226));
        CB_Hora.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        CB_Hora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_HoraItemStateChanged(evt);
            }
        });
        blurBackground2.add(CB_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 235, 40));

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
        blurBackground2.add(BT_EnviarSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 210, 40));

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

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Teléfono", "Género", "Edad", "ID", "Ocupación", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(242, 242, 242));
        table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(table);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, 829, 210));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Lista de Citas:");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        bt_eliminar.setBorder(null);
        bt_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basura.png"))); // NOI18N
        bt_eliminar.setColor1Background(new java.awt.Color(255, 255, 254));
        bt_eliminar.setColor2Over(new java.awt.Color(176, 207, 240));
        bt_eliminar.setColor3Click(new java.awt.Color(163, 176, 212));
        bt_eliminar.setEnableColorGradient(true);
        bt_eliminar.setEnableShadow(true);
        bt_eliminar.setRadius(32);
        bt_eliminar.setRippleColor(new java.awt.Color(255, 255, 255));
        bt_eliminar.setRoundBottomLeft(10);
        bt_eliminar.setRoundBottomRight(10);
        bt_eliminar.setRoundTopLeft(10);
        bt_eliminar.setRoundTopRight(10);
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });
        panelRound1.add(bt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 5, 45, 40));

        lb_eliminar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lb_eliminar.setForeground(new java.awt.Color(127, 127, 127));
        lb_eliminar.setText("Eliminar Registro");
        panelRound1.add(lb_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 13, -1, -1));

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

        label_doctor.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label_doctor.setForeground(new java.awt.Color(127, 127, 127));
        panelRound2.add(label_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 20));

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

        label_administrador.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label_administrador.setForeground(new java.awt.Color(127, 127, 127));
        panelRound3.add(label_administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 20));

        blurBackground10.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 270, 130));

        panelRound4.setBackground(new java.awt.Color(163, 193, 225));
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blurBackground12.setImage(new javax.swing.ImageIcon(getClass().getResource("/reloj.png"))); // NOI18N
        panelRound4.add(blurBackground12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 45, 45));

        icon_em.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        icon_em.setText("Citas Pendientes");
        panelRound4.add(icon_em, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        label_empleado.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label_empleado.setForeground(new java.awt.Color(127, 127, 127));
        panelRound4.add(label_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 110, 20));

        nu_em.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        nu_em.setForeground(new java.awt.Color(127, 127, 127));
        nu_em.setText("Número: ");
        panelRound4.add(nu_em, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        blurBackground10.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 270, 130));

        home.add(blurBackground10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 580));

        CardLayout.add(home, "Inicio");

        Background.add(CardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1010, 600));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int mouseX, mouseY;

    private void BT_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_HomeMouseClicked
        cardLayout.show(CardLayout, "Inicio");
    }//GEN-LAST:event_BT_HomeMouseClicked

    private void BT_SolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SolicitudMouseClicked
        cardLayout.show(CardLayout, "Solicitud");
    }//GEN-LAST:event_BT_SolicitudMouseClicked

    private void BT_EmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EmpleadoMouseClicked
        cardLayout.show(CardLayout, "Datos");
        sx = "M";
    }//GEN-LAST:event_BT_EmpleadoMouseClicked

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

    // </editor-fold>

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

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        int filaseleccionada = table.getSelectedRow();
        if (filaseleccionada == -1) {
            new Warming("Debe seleccionar una fila").setVisible(true);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            String tipo = (String) modelo.getValueAt(filaseleccionada, 5);
            String user = (String) modelo.getValueAt(filaseleccionada, 6);
            try {
                //Se establece la conexión con la base de datos
                Connection Conexion = null;
                ConexionBD BD = new ConexionBD();
                Conexion = BD.getConexion();
                Statement st = Conexion.createStatement();
                //Inicialmente se elimina el registro de la tabla de usuarios
                PreparedStatement stmt = Conexion.prepareStatement("DELETE FROM Usuarios WHERE Usuario = ?");
                stmt.setString(1, user);
                stmt.executeUpdate();
                //Ahora se hace la comparación del tipo de empleado que es para eliminarlo de su tabla correspondiente en nuestra base de datos de
                //Microsoft Access
                //Elimación en la tabla de doctores
                if (tipo.equals("Pediatria") || tipo.equals("Ginecología") || tipo.equals("Radiología") || tipo.equals("Oftalmología") || tipo.equals("Optometría")
                        //Cambiar MEDICO GENERAL POR MEDICINA GENERAL CUANDO SE VAYA A PASAAAARR IMPORTAAAANTEEEE
                        || tipo.equals("Odontología general") || tipo.equals("Cardiología") || tipo.equals("Medico General") || tipo.equals("Ecografía") || tipo.equals("Medicina interna")
                        || tipo.equals("Ortopedía") || !tipo.equals("Psiquiatría")) {
                    PreparedStatement stmt2 = Conexion.prepareStatement("DELETE FROM Doctores WHERE Usuario = ?");
                    stmt2.setString(1, user);
                    stmt2.executeUpdate();
                } else {
                    //Eliminación en la tabla de administradores
                    if (tipo.equals("Administrador")) {
                        PreparedStatement stmt3 = Conexion.prepareStatement("DELETE FROM Admin WHERE Usuario = ?");
                        stmt3.setString(1, user);
                        stmt3.executeUpdate();
                    } else {
                        //Eliminación en la tabla de los demás empleados del hospital
                        if (!tipo.equals("Pediatria") && !tipo.equals("Administrador") && !tipo.equals("Ginecología") && !tipo.equals("Radiología") && !tipo.equals("Oftalmología") && !tipo.equals("Optometría")
                                && !tipo.equals("Odontología general") && !tipo.equals("Cardiología") && !tipo.equals("Medico General") && !tipo.equals("Ecografía") && !tipo.equals("Medicina interna")
                                && !tipo.equals("Ortopedía")) {
                            PreparedStatement stmt4 = Conexion.prepareStatement("DELETE FROM OtroEmpleado WHERE Usuario = ?");
                            stmt4.setString(1, user);
                            stmt4.executeUpdate();
                        }
                    }
                }
                modelo.removeRow(filaseleccionada);
                new Success("Empleado eliminado correctamente").setVisible(true);
            } catch (SQLException e) {
                new Error("Error al eliminar el empleado").setVisible(true);
            }
        }
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void BT_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_RegistrarseMouseClicked

        // <editor-fold defaultstate="collapsed" desc="Valida si faltan campos por llenar">
        if (TX_NombreApellido.getText().isEmpty()) {
            new Warming("Falta ingresar el Nombre").setVisible(true);
        } else if (!"F".equals(sx) && !"M".equals(sx)) {
            new Warming("Falta seleccionar el Genero").setVisible(true);
        } else if (TX_NoDocumento.getText().isEmpty()) {
            new Warming("Falta ingresar el Documento").setVisible(true);
        } else if (op != 1 && op != 2 && op != 3 && op != 4) {
            new Warming("Falta el Tipo de Documento").setVisible(true);
        } else if (TX_NoDocumento.getText().isEmpty()) {
            new Warming("Falta ingresar la Edad").setVisible(true);
        } else if (TX_Telefono.getText().isEmpty()) {
            new Warming("Falta ingresar el Telefono").setVisible(true);
        } else if (TX_Usuario.getText().isEmpty()) {
            new Warming("Falta ingresar el Usuario").setVisible(true);
        } else if (TX_Contraseña.getText().isEmpty()) {
            new Warming("Falta ingresar el Contraseña").setVisible(true);
        } else if (TX_ConfirmarContra.getText().isEmpty()) {
            new Warming("Falta confirmar la Contraseña").setVisible(true);
        } else if (!TX_ConfirmarContra.getText().equals(TX_Contraseña.getText())) {
            new Warming("Las contraseñas no coinciden").setVisible(true);
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
                    new Warming("El Usuario ya existe").setVisible(true);
                } else if (NoDocumentoExiste() == true) {
                    new Warming("Cédula ya existente").setVisible(true);
                } else {
                    //GuardarBD();
                    LimpiarCampos();
                }
            }

        }
    }//GEN-LAST:event_BT_RegistrarseMouseClicked

    private void BT_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_RegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_RegistrarseActionPerformed

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

    private void TX_ConfirmarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TX_ConfirmarContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TX_ConfirmarContraActionPerformed

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

    private void txtDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyTyped

    }//GEN-LAST:event_txtDateKeyTyped

    private void bt_calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_calendarioActionPerformed
        Calendario.showPopup();
    }//GEN-LAST:event_bt_calendarioActionPerformed

    private void TX_ObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TX_ObservacionesKeyTyped
        //Establecer limite de caracteres
        if (TX_Observaciones.getText().length() >= 220) {
            evt.consume();
        }
    }//GEN-LAST:event_TX_ObservacionesKeyTyped

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void BT_EnviarSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EnviarSolicitudMouseClicked
        GuardarBD();
        LimpiarCampos_Solicitud();
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

        } else {
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
        SelectedDate FechaSelecionada = Calendario.getSelectedDate();
        //Si la hora es diferente a nada 
        if (FechaSelecionada != null) {
            CB_Hora.setEnabled(true); //ComboBox de Hora lo habilito
            CB_Hora.removeAllItems(); //Borro todos los items
            CB_Hora.addItem("-");
            MostraHoras();
        }
    }//GEN-LAST:event_CalendarioPropertyChange

    public String ObtenerDia() {

        int Dia_Semana = Calendario.getDay();
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
                //new Warming("No hay horarios diponibles").setVisible(true);
                CB_Hora.setEnabled(false); //ComboBox de Hora lo bloqueo
                CB_Hora.removeAllItems(); //Borro todos los items
                CB_Hora.addItem("-");
                System.out.println("ENTRO AQUI");

            } else {
                while (rst.next()) {
                    CB_Hora.addItem(rst.getString("Hora"));
                    System.out.println("ENTRO ACA");
                }

                String fechaSeleccionada = Calendario.getDate();
                //SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                // String fechaComoCadena = formatoFecha.format(fechaSeleccionada);
                Fecha = fechaSeleccionada;

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
                    new Warming("No hay horarios diponibles").setVisible(true);
                    CB_Hora.setEnabled(false); //ComboBox de Hora lo bloqueo
                    CB_Hora.removeAllItems(); //Borro todos los items
                    CB_Hora.addItem("-");
                    Calendario.toDay(); //Reinicio la hora
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

            String fechaSeleccionada = Calendario.getDate();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String fechaComoCadena = formatoFecha.format(fechaSeleccionada);
            Fecha = fechaSeleccionada;

            Servicio = (String) CB_Servicio.getSelectedItem();

            Observaciones = TX_Observaciones.getText();

            Horario = (String) CB_Hora.getSelectedItem();

            Clases.Cita S = new Clases.Cita(Usuario, (String) CB_Servicio.getSelectedItem(), (String) CB_Doctor.getSelectedItem(),
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

    public void LimpiarCampos_Solicitud() {
        TX_Observaciones.setText("");
        Calendario.toDay();
        CB_Hora.setSelectedIndex(0);
        CB_Servicio.setSelectedIndex(0);
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

    public Boolean TamañoMinimo(JTextField JTextField, String Campo, int min) {
        //Si no tiene el tamaño minimo de caracteres, muestra error
        if (JTextField.getText().length() < min) {
            new Warming("Tamaño minimo" + min).setVisible(true);
            return false;
        } else {
            return true;
        }
    }

    public Boolean TamañoTelefono(JTextField JTextField) {
        //Si no tiene el tamaño minimo de caracteres, muestra error
        if (JTextField.getText().length() != 7 && JTextField.getText().length() != 10) {
            new Warming("Tamaño minimo: 7-10 números").setVisible(true);
            return false;
        } else {
            return true;
        }
    }

    public void LimpiarCampos() {
        TipoDocumento1.setText("");
        TX_NombreApellido.setText("");
        TX_NoDocumento.setText("");
        TX_Edad.setText("");
        TX_Telefono.setText("");
        TX_Usuario.setText("");
        TX_Contraseña.setText("");
        TX_ConfirmarContra.setText("");

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
    private Componentes.AllButton BT_CerrarSesion;
    private Componentes.AllButton BT_Empleado;
    private Componentes.AllButton BT_EnviarSolicitud;
    private Componentes.AllButton BT_Home;
    private Componentes.AllButton BT_Menu;
    private Componentes.AllButton BT_Registrarse;
    private Componentes.AllButton BT_Solicitud;
    private Componentes.BlurBackground Background;
    private Componentes.ComboBoxSuggestion CB_Doctor;
    private Componentes.ComboBoxSuggestion CB_Hora;
    private Componentes.ComboBoxSuggestion CB_Servicio;
    private com.raven.datechooser.DateChooser Calendario;
    private javax.swing.JPanel CardLayout;
    private org.example.Custom.PanelRound ConfirmarContr;
    private org.example.Custom.PanelRound Contraseña;
    private javax.swing.JPanel Datos;
    private org.example.Custom.PanelRound Edad;
    private org.example.Custom.PanelRound JP_BarraLateral;
    private javax.swing.JPanel JP_CerraSesionBarraL;
    private org.example.Custom.PanelRound NoDocumento;
    private org.example.Custom.PanelRound NombreApellido;
    private javax.swing.JPanel Solicitud;
    private org.example.Custom.PanelRound TDocumento;
    private org.example.Custom.PanelRound TXTUsuario;
    private org.example.Custom.PanelRound TXT_Fecha;
    private org.example.Custom.AnimatedPasswordField TX_ConfirmarContra;
    private org.example.Custom.AnimatedPasswordField TX_Contraseña;
    private org.example.Custom.AnimatedTextField TX_Edad;
    private org.example.Custom.AnimatedTextField TX_NoDocumento;
    private org.example.Custom.AnimatedTextField TX_NombreApellido;
    private javax.swing.JTextPane TX_Observaciones;
    private org.example.Custom.AnimatedTextField TX_Telefono;
    private org.example.Custom.AnimatedTextField TX_Usuario;
    private org.example.Custom.PanelRound Telefono;
    private org.example.Custom.AnimatedTextField TipoDocumento1;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel barra_superior2;
    private javax.swing.JPanel barra_superior8;
    private Componentes.BlurBackground blurBackground1;
    private Componentes.BlurBackground blurBackground10;
    private Componentes.BlurBackground blurBackground11;
    private Componentes.BlurBackground blurBackground12;
    private Componentes.BlurBackground blurBackground2;
    private javax.swing.ButtonGroup botones;
    private Componentes.AllButton bt_calendario;
    private Componentes.AllButton bt_cerrar;
    private Componentes.AllButton bt_cerrar2;
    private Componentes.AllButton bt_cerrar8;
    private Componentes.AllButton bt_eliminar;
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
    private javax.swing.JLabel label_administrador;
    private javax.swing.JLabel label_doctor;
    private javax.swing.JLabel label_empleado;
    private javax.swing.JLabel lb_doc;
    private javax.swing.JLabel lb_doctor;
    private javax.swing.JLabel lb_eliminar;
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
    private Componentes.Table table;
    private org.example.Custom.AnimatedTextField txtDate;
    private javax.swing.JLabel ver;
    private javax.swing.JLabel ver1;
    // End of variables declaration//GEN-END:variables
}
