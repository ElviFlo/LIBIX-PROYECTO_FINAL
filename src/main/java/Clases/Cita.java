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
public class Cita {

    private String Usuario;
    private String Fecha;
    private String Hora;
    private String Servicio;
    private String Observaciones;
    private String Doctor;
    private String Confirmada;
    private String Estado_Cita;
    private String Motivo_Cancelacion;
    

    public Cita(String Usuario, String Servicio, String Doctor, String Fecha, String Hora, String Observaciones,
            String Confirmada, String Estado_Cita, String Motivo_Cancelacion) {
        this.Usuario = Usuario;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Servicio = Servicio;
        this.Observaciones = Observaciones;
        this.Doctor = Doctor;
        this.Confirmada = Confirmada;
        this.Estado_Cita = Estado_Cita;
        this.Motivo_Cancelacion = Motivo_Cancelacion;
             
    }
    
    

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public String getConfirmada() {
        return Confirmada;
    }

    public void setConfirmada(String Confirmada) {
        this.Confirmada = Confirmada;
    }

    public String getEstado_Cita() {
        return Estado_Cita;
    }

    public void setEstado_Cita(String Estado_Cita) {
        this.Estado_Cita = Estado_Cita;
    }

    public String getMotivo_Cancelacion() {
        return Motivo_Cancelacion;
    }

    public void setMotivo_Cancelacion(String Motivo_Cancelacion) {
        this.Motivo_Cancelacion = Motivo_Cancelacion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String servicio) {
        this.Servicio = servicio;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.Observaciones = observaciones;
    }

}
