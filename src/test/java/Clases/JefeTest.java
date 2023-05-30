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
public class JefeTest {
    
    public JefeTest() {
    }
     @Test
    public void testCrearObjetoOtro() {
        // Arrange (Configuración)
        String nombreApellido = "Juan Perez";
        String genero = "Masculino";
        double edad = 30;
        double noDocumento = 123456789;
        double telefono = 987654321;
        String puesto = "Gerente";
        String usuario = "juanp";
        String contraseña = "secreto";

        // Act (Acción)
        Otro otro = new Otro(nombreApellido, genero, edad, noDocumento, telefono, puesto, usuario, contraseña);

        // Assert (Afirmación)
        Assert.assertNotNull(otro);
        Assert.assertEquals(nombreApellido, otro.getNombre_Apellido());
        Assert.assertEquals(genero, otro.getGenero());
        Assert.assertEquals(edad, otro.getEdad(), 0);
        Assert.assertEquals(noDocumento, otro.getNo_Documento(), 0);
        Assert.assertEquals(telefono, otro.getNo_Telefono(), 0);
        Assert.assertEquals(puesto, otro.getPuesto());
        Assert.assertEquals(usuario, otro.getUsuario());
        Assert.assertEquals(contraseña, otro.getContraseña());
    }
    
}
