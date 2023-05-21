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

public class Doctor extends Persona {

    private String Especialidad;
    private String Usuario;
    private String Contraseña;
    private double No_Consultorio;
    private String HorarioLaboral;
    private List<Paciente> PacientesAtendidos = new ArrayList<Paciente>();
    private List<Paciente> PacientesPendientes = new ArrayList<Paciente>();

    //Constructor de la clase
    public Doctor(String Nombre_Ape, String Genero,
            double No_Documento, double Edad, String Tipo_Documento,
            double Telefono, String Usuario, String Contraseña, String Especialidad, double no_Consultorio, String Horariolaboral, List<Paciente> patendidos, List<Paciente> ppendientes) {
        super(Nombre_Ape, Genero, No_Documento, Edad, Tipo_Documento, Telefono);
        this.Especialidad = Especialidad;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.No_Consultorio = no_Consultorio;
        this.HorarioLaboral = Horariolaboral;
        this.PacientesAtendidos = patendidos;
        this.PacientesPendientes = ppendientes;
        
    }
    
    //Constructor para la BD
    public Doctor(String Nombre_Ape, String Genero,
            double No_Documento, double Edad, double Telefono, String Especialidad, double No_Cosultorio, String Usuario, String Contraseña){
         super(Nombre_Ape, Genero, No_Documento, Edad, Telefono);
         this.Especialidad = Especialidad;
         this.No_Consultorio = No_Consultorio;
         this.Usuario=Usuario;
         this.Contraseña=Contraseña;
    }
    
    //Setter y getters para los atributos
    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public double getNo_Consultorio() {
        return No_Consultorio;
    }

    public void setNo_Consultorio(double no_Consultorio) {
        No_Consultorio = no_Consultorio;
    }

    public String getHorarioLaboral() {
        return HorarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        HorarioLaboral = horarioLaboral;
    }

    public List<Paciente> getPacientesAtendidos() {
        return PacientesAtendidos;
    }

    public void setPacientesAtendidos(List<Paciente> pacientesAtendidos) {
        PacientesAtendidos = pacientesAtendidos;
    }

    public List<Paciente> getPacientesPendientes() {
        return PacientesPendientes;
    }

    public void setPacientesPendientes(List<Paciente> pacientesPendientes) {
        PacientesPendientes = pacientesPendientes;
    }
    
    

}
