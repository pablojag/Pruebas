/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class MetodosTest {
    
    public MetodosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of clasificacion method, of class Metodos.
     */
    @Test
    public void testClasificacion() {
        System.out.println("clasificacion");
        String tipo = "jovenes";
        Metodos instance = new Metodos();
        String expResult = "T adolescentes";
        String result = instance.clasificacion(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){
        fail("The test case is a prototype.");}
    }

    /**
     * Test of precioEnvio method, of class Metodos.
     */
    @Test
    public void testPrecioEnvio() {
        System.out.println("precioEnvio");
        double precio = 3000.0;
        Metodos instance = new Metodos();
        double expResult = 399.0;
        double result = instance.precioEnvio(precio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result !=expResult){
        fail("The test case is a prototype.");}
    }
    
}
