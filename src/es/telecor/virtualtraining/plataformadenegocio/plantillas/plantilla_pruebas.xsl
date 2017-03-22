<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : plantilla_pruebas.xsl
    Created on : 16 de marzo de 2016, 12:00
    Author     : javi
    Description:
        Plantilla para comprobar la estructura del pruebas
-->


<xs:schema attributeFormDefault="unqualified" 
           elementFormDefault="qualified" 
           targetNamespace="http://www.plataformadenegocio.es/Empaquetador" 
           xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="pruebas">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="prueba" minOccurs="1" maxOccurs="unbounded">
          <xs:complexType>
            <xs:sequence>
              <xs:element type="xs:string" name="error"/>
              <xs:element type="xs:string" name="como_probar"/>
            </xs:sequence>
            <xs:attribute type="xs:string" name="autor"/>
          </xs:complexType>
        </xs:element>
      </xs:sequence>
      <xs:attribute type="xs:string" name="version"/>
    </xs:complexType>
  </xs:element>
</xs:schema>