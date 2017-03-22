/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.utils;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author javi
 */
public class XMLIntegrityChecker {
    
    private Document document;
    private final String dirOrigen;
    
    public XMLIntegrityChecker(String _dirOrigen){
        this.dirOrigen = _dirOrigen;
    
    }
    
    public Document comprobarFicheroXML(String file) throws IOException, SAXException {

        boolean resultado = false;

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(true);

        DocumentBuilder builder = null;
        try {
            builder = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
            return null;
        }

        File ficheroXML = new File(this.dirOrigen + file);
        if (ficheroXML.exists()) {
            document = builder.parse(ficheroXML);
        }
        
        return document;

    }

    
}
