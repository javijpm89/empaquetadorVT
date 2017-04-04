/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.utils;

import org.w3c.dom.Document;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


/**
 *
 * @author javi
 */
public class ComprobadorXML {
    
    private String dirBase;
    
    private final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    private final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
    
    public ComprobadorXML(String _dirBase){
        this.dirBase = _dirBase;
        
    }
    
    public Document validateXML(String _tipoXML, String fichero) throws ParserConfigurationException, SAXException, IOException{
        boolean resultado = false;
        String plantilla = null;
        String tipoXML = _tipoXML;
        
        if (tipoXML.equals("pruebas"))
            plantilla = getClass().getResource("/es/telecor/virtualtraining/plataformadenegocio/plantillas/pruebas_schema.xsd").getFile();
        if (tipoXML.equals("sql"))
            plantilla = getClass().getResource("/es/telecor/virtualtraining/plataformadenegocio/plantillas/sqlscripts_schema.xsd").getFile();
            
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        factory.setNamespaceAware(true);
        factory.setAttribute(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
        
        DocumentBuilder builder = null;
        
        builder = factory.newDocumentBuilder();
        
        Document doc = builder.parse(new File(fichero));
        
        return doc;
    }
    
}
