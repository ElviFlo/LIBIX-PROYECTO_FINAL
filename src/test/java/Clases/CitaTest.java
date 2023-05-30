/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author COMERCIAL
 */
public class CitaTest {

    public CitaTest() {
    }

    @Test
    public void testCrearObjetoCita() {
        // Arrange (Configuración)
        String usuario = "johndoe";
        String fecha = "2023-05-30";
        String hora = "10:00";
        String servicio = "Consulta general";
        String observaciones = "Sin observaciones";
        String doctor = "Dr. Smith";
        String confirmada = "Sí";
        String estadoCita = "Confirmada";
        String motivoCancelacion = "";

        // Act (Acción)
        Cita cita = new Cita(usuario, servicio, doctor, fecha, hora, observaciones,
                confirmada, estadoCita, motivoCancelacion);

        // Assert (Afirmación)
        Assert.assertNotNull(cita);
        Assert.assertEquals(usuario, cita.getUsuario());
        Assert.assertEquals(fecha, cita.getFecha());
        Assert.assertEquals(hora, cita.getHora());
        Assert.assertEquals(servicio, cita.getServicio());
        Assert.assertEquals(observaciones, cita.getObservaciones());
        Assert.assertEquals(doctor, cita.getDoctor());
        Assert.assertEquals(confirmada, cita.getConfirmada());
        Assert.assertEquals(estadoCita, cita.getEstado_Cita());
        Assert.assertEquals(motivoCancelacion, cita.getMotivo_Cancelacion());
    }
}
