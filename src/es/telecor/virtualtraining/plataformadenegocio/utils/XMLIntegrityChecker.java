/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author javi
 */
public class XMLIntegrityChecker {

    private Document document;
    private final String dirOrigen;

    public XMLIntegrityChecker(String _dirOrigen) {
        this.dirOrigen = _dirOrigen;

    }

    public boolean comprobarFicheroXML(String pathToXML, String type) throws IOException, SAXException {

        try {
            String pathToXSD = null;

            if (type.equals("pruebas")) {
                pathToXSD = getClass().getResource("es/telecor/virtualtraining/plataformadenegocio/plantillas/plantilla_pruebas.xsd").getFile();
            }
            if (type.equals("sql")) {
                pathToXSD = getClass().getResource("es/telecor/virtualtraining/plataformadenegocio/plantillas/plantilla_sqlscripts.xsd").getFile();
            }

            FileInputStream xsdInput = new FileInputStream(new File(pathToXML));
            FileInputStream xmlInput = new FileInputStream(new File(pathToXSD));

            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsdInput));

            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xmlInput));

            return true;

        } catch (IOException | SAXException ex) {
            return false;
        }
    }

}
