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

public class Administrador extends Persona {
    private String Usuario;
    private String Contraseña;
    private String fecharegistro;
    private String estado;
    private List<Doctor> Doctoresacargo= new ArrayList<Doctor>();
    private List<Object> citasasignadas=new ArrayList<Object>();
    private List<Object> citaspendientes=new ArrayList<Object>();
    
    
    
    public Administrador(String Nombre_Ape, String Genero,
            double No_Documento, double Edad,
            double Telefono,  String Fecharegistro, String Estado,String Usuario, String Contraseña){
        super(Nombre_Ape, Genero, No_Documento, Edad, Telefono);
        this.Usuario= Usuario;
        this.Contraseña= Contraseña;
        this.fecharegistro=Fecharegistro;
        this.estado=Estado;
       
    }
    
    //Getters y setters de la clase administrador
    public void setusuario(String Usuario){
        this.Usuario=Usuario;
    }
    public String getusuario(){
        return this.Usuario;
    }
    public void setcontraseña(String Usuario){
        this.Usuario=Usuario;
    }
    public String getcontraseña(){
        return this.Contraseña;
    }
    public void setfecharegistro(String Fecharegistro){
        this.fecharegistro=Fecharegistro;
    }
    public String getfecharegistro(){
        return this.fecharegistro;
    }
    public void setestado(String Estado){
        this.estado=Estado;
    }
    public String getestado(){
        return this.estado;
    }
    public void setDoctoresacargo(List<Doctor> doctoresacargo ){
        this.Doctoresacargo= doctoresacargo;
    }
    public List<Doctor> getDoctoresacargo(List<Doctor> doctoresacargo){
        return doctoresacargo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
