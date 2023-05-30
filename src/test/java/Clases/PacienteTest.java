/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author COMERCIAL
 */
public class PacienteTest {
    
    public PacienteTest() {
    }
    
    @Test
    public void testCrearObjetoPaciente() {
        // Arrange (Configuración)
        String nombreApellido = "John Doe";
        String genero = "Masculino";
        double noDocumento = 123456789;
        int edad = 30;
        String tipoDocumento = "DNI";
        double telefono = 1234567890;
        String usuario = "johndoe";
        String contraseña = "password";

        // Act (Acción)
        Paciente paciente = new Paciente(nombreApellido, genero, noDocumento, edad,
                tipoDocumento, telefono, usuario, contraseña);

        // Assert (Afirmación)
        Assert.assertNotNull(paciente);
        Assert.assertEquals(nombreApellido, paciente.getNombre_Apellido());
        Assert.assertEquals(genero, paciente.getGenero());
        Assert.assertEquals(tipoDocumento, paciente.getTipo_Documento());
        Assert.assertEquals(usuario, paciente.getUsuario());
        Assert.assertEquals(contraseña, paciente.getContraseña());
    }




    
}
