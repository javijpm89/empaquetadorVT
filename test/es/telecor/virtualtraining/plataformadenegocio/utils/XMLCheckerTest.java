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
public class XMLCheckerTest {
    
    public XMLCheckerTest() {
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
     * Test of comprobarFicheroXML method, of class XMLChecker.
     */
    @Test
    public void testComprobarFicheroXMLPruebasKO() throws Exception {
        System.out.println("Entrando a comprobar fichero XML Pruebas KO");
        String XMLtoCheck = "pruebas.xml";
        String type = "pruebas";
        XMLChecker instance = new XMLChecker("/home/javi/tmp/simuladorProduccionFails/General/dweb/");
        boolean expResult = false;
        boolean result = instance.comprobarFicheroXML(XMLtoCheck, type);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of comprobarFicheroXML method, of class XMLChecker.
     */
    @Test
    public void testComprobarFicheroXMLPruebasOK() throws Exception {
        System.out.println("Entrando a comprobar fichero XML Pruebas OK");
        String XMLtoCheck = "pruebas.xml";
        String type = "pruebas";
        XMLChecker instance = new XMLChecker("/home/javi/tmp/simuladorProduccion/General/dweb/");
        boolean expResult = true;
        boolean result = instance.comprobarFicheroXML(XMLtoCheck, type);
        assertEquals(expResult, result);
    }
    
}
