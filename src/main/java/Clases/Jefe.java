/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Junior0709
 */
import java.util.List;
import java.util.ArrayList;

public class Jefe extends Persona  {
    private String Usuario;
    private String Contraseña;
    //Esto no es seguro (???
    private List <Administrador> adminsacargo= new ArrayList<Administrador>();
    
    //Contructor de la clase
    public Jefe(String Nombre_Ape, String Genero,
            double No_Documento, double Edad, double Telefono, String Usuario, String Contraseña, List<Administrador> Adminsacargo){
         super(Nombre_Ape, Genero, No_Documento, Edad, Telefono);
         this.Usuario=Usuario;
         this.Contraseña=Contraseña;
         this.adminsacargo=Adminsacargo;
         
        
    }
    
    //Contructor de la clase para la BD
    public Jefe(String Nombre_Ape, String Genero,
            double No_Documento, double Edad, double Telefono, String Usuario, String Contraseña){
         super(Nombre_Ape, Genero, No_Documento, Edad, Telefono);
         this.Usuario=Usuario;
         this.Contraseña=Contraseña;
    
    }
    //Getters y setter de la clase
    
    // Getter de Usuario
    public String getUsuario() {
        return Usuario;
    }

    // Setter de Usuario
    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    // Getter de Contraseña
    public String getContraseña() {
        return Contraseña;
    }

    // Setter de Contraseña
    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
     
}
