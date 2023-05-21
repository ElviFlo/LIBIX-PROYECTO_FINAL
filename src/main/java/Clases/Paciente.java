/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Junior0709
 */
public class Paciente extends Persona {
    private String Usuario;
    private String Contraseña;
    
   
    
    public Paciente(String Nombre_Ape, String Genero,
            double No_Documento, double Edad, String Tipo_Documento,
            double Telefono, String Usuario, String Contraseña) {
        super(Nombre_Ape, Genero, No_Documento, Edad, Tipo_Documento, Telefono);
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    
    
    // Setter y Getter para la variable Usuario
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    public String getUsuario() {
        return Usuario;
    }

    // Setter y Getter para la variable Contraseña
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    public String getContraseña() {
        return Contraseña;
    }
    
    //Funcion para reiniciar los atributos
    public void reiniciar() {
        Nombre_Apellido = null;
        Genero = null;
        No_Documento = 0;
        Edad = 0;
        Tipo_Documento = null;
        No_Telefono = 0;
        Usuario = null;
        Contraseña = null;
    }
    
}
