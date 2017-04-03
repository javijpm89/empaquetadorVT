/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javi
 */
public class ComprobadorEstructuraAxonTest {
    
    public ComprobadorEstructuraAxonTest() {
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
     * Test of compruebaIntegridadHTML method, of class ComprobadorEstructuraAxon.
     */
    @Test
    public void testCompruebaIntegridadHTML() {
        System.out.println("compruebaIntegridadHTML");
        ComprobadorEstructuraAxon instance = null;
        boolean expResult = false;
        boolean result = instance.compruebaIntegridadHTML();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compruebaIntegridadServicios method, of class ComprobadorEstructuraAxon.
     */
    @Test
    public void testCompruebaIntegridadServicios() {
        System.out.println("compruebaIntegridadServicios");
        ComprobadorEstructuraAxon instance = null;
        boolean expResult = false;
        boolean result = instance.compruebaIntegridadServicios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compruebaIntegridadJavauser method, of class ComprobadorEstructuraAxon.
     */
    @Test
    public void testCompruebaIntegridadJavauser() {
        System.out.println("compruebaIntegridadJavauser");
        ComprobadorEstructuraAxon instance = null;
        boolean expResult = false;
        boolean result = instance.compruebaIntegridadJavauser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
