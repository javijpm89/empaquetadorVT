<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : plantilla_sqlscripts.xsl
    Created on : 16 de marzo de 2016, 17:17
    Author     : javi
    Description:
        Purpose of transformation follows.
-->

<schema targetNamespace="http://www.plataformadenegocio.es/Empaquetador"
        elementFormDefault="qualified" xmlns="http://www.w3.org/2001/XMLSchema"
        xmlns:tns="http://www.plataformadenegocio.es/Empaquetador">
    <!-- Definicion del elemento raiz -->
    <element name="scripts">
        <complexType>
            <sequence>
                <element name="help" type="string" minOccurs="1" maxOccurs="1"></element>
                <element name="script" type="tns:script" minOccurs="1" maxOccurs="unbounded"></element>
            </sequence>
            <attribute name="version" type="string"></attribute>
        </complexType>        
    </element>
    <!-- Definicion del elemento script -->
    <element name="script">
        <complexType>
            <sequence>
                <element name="descripcion" type="string" minOccurs="1" maxOccurs="1"></element>
                <element name="sql" type="string" minOccurs="1" maxOccurs="1">
                    <attribute name="error" type="string"></attribute>
                </element>
                <element name="afecta" type="string" minOccurs="1" maxOccurs="1"></element>
            </sequence>
            <attribute name="autor" type="string"></attribute>
        </complexType>        
    </element>    
</schema>
