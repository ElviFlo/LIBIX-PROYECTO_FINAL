/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author COMERCIAL
 */
public class DoctorTest {
    
    public DoctorTest() {
    }

     @Test
    public void testCrearObjetoDoctor() {
        // Arrange (Configuración)
        String nombreApellido = "Dr. John Doe";
        String genero = "Masculino";
        double noDocumento = 1234567890;
        double edad = 35;
        double telefono = 987654310;
        String especialidad = "Cardiología";
        double noConsultorio = 101;
        String usuario = "johndoe";
        String contraseña = "secreto";
        
        // Creamos listas vacías de pacientes
        List<Paciente> pacientesAtendidos = new ArrayList<>();
        List<Paciente> pacientesPendientes = new ArrayList<>();

        // Act (Acción)
        Doctor doctor = new Doctor(nombreApellido, genero, noDocumento, edad, telefono, especialidad, noConsultorio, usuario, contraseña);
        doctor.setPacientesAtendidos(pacientesAtendidos);
        doctor.setPacientesPendientes(pacientesPendientes);

        // Assert (Afirmación)
        Assert.assertNotNull(doctor);
        Assert.assertEquals(nombreApellido, doctor.getNombre_Apellido());
        Assert.assertEquals(genero, doctor.getGenero());
        Assert.assertEquals(noDocumento, doctor.getNo_Documento(), 0);
        Assert.assertEquals(edad, doctor.getEdad(), 0);
        Assert.assertEquals(telefono, doctor.getNo_Telefono(), 0);
        Assert.assertEquals(especialidad, doctor.getEspecialidad());
        Assert.assertEquals(noConsultorio, doctor.getNo_Consultorio(), 0);
        Assert.assertEquals(usuario, doctor.getUsuario());
        Assert.assertEquals(contraseña, doctor.getContraseña());
        Assert.assertEquals(pacientesAtendidos, doctor.getPacientesAtendidos());
        Assert.assertEquals(pacientesPendientes, doctor.getPacientesPendientes());
    }

    
    
}
