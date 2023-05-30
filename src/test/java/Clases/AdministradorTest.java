/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author COMERCIAL
 */
public class AdministradorTest {
    
    public AdministradorTest() {
    }

    @Test
    public void testCrearObjetoAdministrador() {
        // Arrange (Configuración)
        String nombreApellido = "John Doe";
        String genero = "Masculino";
        double noDocumento = 123456789;
        double edad = 30;
        double telefono = 1234567890;
        String fechaRegistro = "2023-01-01";
        String estado = "Activo";
        String usuario = "johndoe";
        String contraseña = "password";

        // Act (Acción)
        Administrador administrador = new Administrador(nombreApellido, genero, noDocumento, edad,
                telefono, fechaRegistro, estado, usuario, contraseña);

        // Assert (Afirmación)
        Assert.assertNotNull(administrador);
        Assert.assertEquals(nombreApellido, administrador.getNombre_Apellido());
        Assert.assertEquals(genero, administrador.getGenero());
        Assert.assertEquals(noDocumento, administrador.getNo_Documento(), 0.0);
        Assert.assertEquals(edad, administrador.getEdad(), 0.0);
        Assert.assertEquals(telefono, administrador.getNo_Telefono(), 0.0);
        Assert.assertEquals(fechaRegistro, administrador.getfecharegistro());
        Assert.assertEquals(estado, administrador.getestado());
        Assert.assertEquals(usuario, administrador.getusuario());
        Assert.assertEquals(contraseña, administrador.getcontraseña());

 
    }

    
}
