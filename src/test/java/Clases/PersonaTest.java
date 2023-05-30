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
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    
    @Test
    public void testConstructor() {
        // Arrange
        String nombreApellido = "John Doe";
        String genero = "Masculino";
        double noDocumento = 123456789;
        double edad = 30;
        String tipoDocumento = "DNI";
        double telefono = 987654321;

        // Act
        Persona persona = new Persona(nombreApellido, genero, noDocumento, edad, tipoDocumento, telefono);

        // Assert
        Assert.assertEquals(nombreApellido, persona.getNombre_Apellido());
        Assert.assertEquals(genero, persona.getGenero());
        Assert.assertEquals(noDocumento, persona.getNo_Documento(), 0);
        Assert.assertEquals(edad, persona.getEdad(), 0);
        Assert.assertEquals(tipoDocumento, persona.getTipo_Documento());
        Assert.assertEquals(telefono, persona.getNo_Telefono(), 0);
    }
    
}
