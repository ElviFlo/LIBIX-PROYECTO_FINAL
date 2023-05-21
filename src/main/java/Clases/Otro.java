/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author VALENTINA
 */
public class Otro extends Persona {
    private String puesto;
    private String usuario;
    private String contraseña;

    public Otro(String Nombre_apellido, String Genero, double edad, double No_documento,double Telefono, String puesto, String Usuario, String Contraseña) {
        super(Nombre_apellido, Genero, No_documento, edad, Telefono);
        this.puesto = puesto;
        this.usuario=Usuario;
        this.contraseña=Contraseña;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
