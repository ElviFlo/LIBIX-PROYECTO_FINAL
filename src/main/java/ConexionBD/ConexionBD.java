package ConexionBD;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.File;

public class ConexionBD {

    //Variable tipo Connection para que funcione
    Connection Conexion = null;
    //No se pa q sirve, pero ahi esta x si acaso
    Statement st = null;

    public ConexionBD() {
        try {
            //Guarda la ubicacion de la BD 
            String RutaBD = getRutaBD("BD.accdb");
            //Cosas q se tiene q poner xq aja 
            String Url = "jdbc:ucanaccess://" + RutaBD;
            Conexion = DriverManager.getConnection(Url);//Para conectarse
            st = Conexion.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CONEXION ERRONEA " + e);
        }
    }

    //Funcion para obtener la ubicacion de la BD en la propia carpeta del proyecto
    public static String getRutaBD(String fileName) {
        File file = new File( fileName);
        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    public Connection getConexion() {
        return Conexion;
    }

    public void Desconexion() {
        try {
            Conexion.close();
            System.exit(0);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Desconectar() throws SQLException{
        Conexion.close();
    }

}
