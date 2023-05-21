/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Junior0709
 */
public class Persona {

    protected String Nombre_Apellido;
    protected String Genero;
    protected String Tipo_Documento;
    //Aunque deberia ser Integer, se pondra como double para evitar problemas con la BD
    protected double No_Documento;
    protected double Edad;
    protected double No_Telefono;

    public Persona() {

    }

    public Persona(String Nombre_Ape, String Genero,
            double No_Documento, double Edad, String Tipo_Documento, double Telefono) {
        this.Nombre_Apellido = Nombre_Ape;
        this.Genero = Genero;
        this.No_Documento = No_Documento;
        this.Edad = Edad;
        this.Tipo_Documento = Tipo_Documento;
        this.No_Telefono = Telefono;

    }
    
    //Constructor para el Jefe
    public Persona(String Nombre_Ape, String Genero,
            double No_Documento, double Edad, double Telefono) {
        this.Nombre_Apellido = Nombre_Ape;
        this.Genero = Genero;
        this.No_Documento = No_Documento;
        this.Edad= Edad;
        this.No_Telefono = Telefono;

    }
    
     
    
// <editor-fold defaultstate="collapsed" desc="Setters y Getters de las variables">

    public void setNombre_Apellido(String nombre_Apellido) {
        this.Nombre_Apellido = nombre_Apellido;
    }

    public String getNombre_Apellido() {
        return this.Nombre_Apellido;
    }

    public void setGenero(String genero) {
        this.Genero = genero;
    }

    public String getGenero() {
        return this.Genero;
    }

    public void setNo_Documento(double no_Documento) {
        this.No_Documento = no_Documento;
    }

    public double getNo_Documento() {
        return this.No_Documento;
    }

    public void setEdad(double edad) {
        this.Edad = edad;
    }

    public double getEdad() {
        return this.Edad;
    }

    public void setNo_Telefono(double no_Telefono) {
        this.No_Telefono = no_Telefono;
    }

    public double getNo_Telefono() {
        return this.No_Telefono;
    }

    public void setTipo_Documento(String tipo_Documento) {
        this.Tipo_Documento = tipo_Documento;
    }

    public String getTipo_Documento() {
        return this.Tipo_Documento;
    }
    
// </editor-fold>
    
}

    

